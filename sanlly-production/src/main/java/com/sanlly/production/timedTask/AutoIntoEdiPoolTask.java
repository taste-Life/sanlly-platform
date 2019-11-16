package com.sanlly.production.timedTask;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.production.dao.AutomaticEdiPoolMapper;
import com.sanlly.production.dao.CompanyEdiTypeMapper;
import com.sanlly.production.dao.CourseMapper;
import com.sanlly.production.dao.UnitCourseMapper;
import com.sanlly.production.dao.YardMapper;
import com.sanlly.production.entity.AutomaticEdiPool;
import com.sanlly.production.entity.AutomaticEdiPoolExample;
import com.sanlly.production.entity.CompanyEdiType;
import com.sanlly.production.entity.CompanyEdiTypeExample;
import com.sanlly.production.entity.Course;
import com.sanlly.production.entity.CourseExample;
import com.sanlly.production.entity.UnitCourse;
import com.sanlly.production.entity.UnitCourseExample;
import com.sanlly.production.entity.Yard;
import com.sanlly.production.entity.YardExample;
import com.sanlly.production.enums.ContainerCategoryEnum;
import com.sanlly.production.enums.EdiAutoPoolTimeEnum;
import com.sanlly.production.enums.EdiImportTypeEnum;
import com.sanlly.production.models.input.edi.AddEdiPoolInput;
import com.sanlly.production.service.EdiService;

/**
 * 自动进入EDI池定时任务
 * @author RexSheng
 * 2019年10月23日 上午10:05:51
 */
@Component
public class AutoIntoEdiPoolTask {
	
	private Logger logger=LoggerFactory.getLogger(this.getClass());
	
	
	@Autowired
	private AutomaticEdiPoolMapper autoPoolDao;
	
	@Autowired
	private EdiService ediService;
	
	@Autowired
	private YardMapper yardDao;
	
	@Autowired
	private CourseMapper courseDao;
	
	@Autowired
	private UnitCourseMapper unitCourseDao;
	
	@Autowired
	private CompanyEdiTypeMapper ediConfigDao;
	
	@Value("${spring.edi.timer:false}")
	private Boolean isOpen;
 
	
	@Scheduled(fixedDelay = 60*1000)
	public void run() {
		if(!isOpen) {
			return;
		}
		logger.info("自动进入EDI池");
		//查询所有配置
		AutomaticEdiPoolExample example=new AutomaticEdiPoolExample();
		example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<AutomaticEdiPool> configList=autoPoolDao.selectByExample(example);
		//查询所有场站
		YardExample yardExample=new YardExample();
		yardExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<Yard> allYardList=yardDao.selectByExample(yardExample);
		
		for(AutomaticEdiPool config:configList) {
			List<String> yardKeyList=allYardList.stream()
					.filter(a->a.getCompany().equals(config.getCompany()))
					.map(a->a.getKey())
					.collect(Collectors.toList());
			if(yardKeyList.isEmpty()) {
				continue;
			}
			//获取所有配置的EDI类型
			CompanyEdiTypeExample ediConfigExample=new CompanyEdiTypeExample();
			ediConfigExample.createCriteria().andCompanyEqualTo(config.getCompany())
			.andContainerUserEqualTo(config.getContainerUser())
			.andContainerCategoryEqualTo(config.getContainerCategory())
			.andIsDelEqualTo(PlatformConstants.ISDEL_NO)
			.andIsEnabledEqualTo(PlatformConstants.ISENABLED_YES);
			List<CompanyEdiType> ediConfigList=ediConfigDao.selectByExample(ediConfigExample);
			if(ediConfigList.isEmpty()) {
				continue;
			}
			String[] ediTypeStringList=ediConfigList.stream().map(a->a.getEdiType()).toArray(String[]::new);
			
			Calendar calendar=Calendar.getInstance();
			calendar.add(Calendar.MINUTE, -1*config.getWaitMiniute().intValue());
			//干箱
			if(StringUtils.isNotEmpty(config.getContainerCategory()) && config.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_01.getCode())) {
				CourseExample courseExample=new CourseExample();
				CourseExample.Criteria courseCriteria=courseExample.createCriteria();
				courseCriteria.andContainerCategoryEqualTo(config.getContainerCategory());
				courseCriteria.andYardIn(yardKeyList);
				courseCriteria.andContainerUserEqualTo(config.getContainerUser());
				if(StringUtils.isNotEmpty(config.getReplyState())) {
					courseCriteria.andUseReplyStateEqualTo(config.getReplyState());
				}
				//估价时间
				if(config.getTimeField().equals(EdiAutoPoolTimeEnum.ValuationTime.getCode())) {
					courseCriteria.andValuationTimeLessThanOrEqualTo(calendar.getTime());
				}
				//批复时间
				else if(config.getTimeField().equals(EdiAutoPoolTimeEnum.ReplyTime.getCode())) {
					courseCriteria.andUseReplyTimeLessThanOrEqualTo(calendar.getTime());
				}
				//完工时间
				else if(config.getTimeField().equals(EdiAutoPoolTimeEnum.FinishTime.getCode())) {
					courseCriteria.andFinishTimeLessThanOrEqualTo(calendar.getTime());
				}
				List<Course> courseList=courseDao.selectByExample(courseExample);
				if(courseList.size()>0) {
					AddEdiPoolInput input=new AddEdiPoolInput();
					input.setImportType(EdiImportTypeEnum.Dry.getCode());
					input.setEdiType(ediTypeStringList);
					
					List<AddEdiPoolInput.AddEditPoolDetail> detailList=new ArrayList<>();
					for(Course course:courseList) {
						AddEdiPoolInput.AddEditPoolDetail detail=new AddEdiPoolInput.AddEditPoolDetail();
						detail.setCourseId(course.getProdCourseId());
						detail.setContainerNo(course.getContainerNo());
						detail.setContainerCategory(course.getContainerCategory());
						detail.setEvaluationNo(course.getValuationNo());
						detailList.add(detail);
					}
					input.setDetails(detailList.toArray(new AddEdiPoolInput.AddEditPoolDetail[detailList.size()]));
					
					ediService.addPool(input);
				}
			}
			//冷箱
			else if(StringUtils.isNotEmpty(config.getContainerCategory()) && config.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_05.getCode())) {
				if(true) {
					//箱体+机组 分开导一次
					
					CourseExample courseExample=new CourseExample();
					CourseExample.Criteria courseCriteria=courseExample.createCriteria();
					courseCriteria.andContainerCategoryEqualTo(ContainerCategoryEnum.CONTAINER_02.getCode());
					courseCriteria.andYardIn(yardKeyList);
					courseCriteria.andContainerUserEqualTo(config.getContainerUser());
					if(StringUtils.isNotEmpty(config.getReplyState())) {
						courseCriteria.andUseReplyStateEqualTo(config.getReplyState());
					}
					//估价时间
					if(config.getTimeField().equals(EdiAutoPoolTimeEnum.ValuationTime.getCode())) {
						courseCriteria.andValuationTimeLessThanOrEqualTo(calendar.getTime());
					}
					//批复时间
					else if(config.getTimeField().equals(EdiAutoPoolTimeEnum.ReplyTime.getCode())) {
						courseCriteria.andUseReplyTimeLessThanOrEqualTo(calendar.getTime());
					}
					//完工时间
					else if(config.getTimeField().equals(EdiAutoPoolTimeEnum.FinishTime.getCode())) {
						courseCriteria.andFinishTimeLessThanOrEqualTo(calendar.getTime());
					}
					List<Course> courseList=courseDao.selectByExample(courseExample);
					if(courseList.size()>0) {
						AddEdiPoolInput input=new AddEdiPoolInput();
						input.setImportType(EdiImportTypeEnum.ContainerUnit.getCode());
						input.setEdiType(ediTypeStringList);
						
						List<AddEdiPoolInput.AddEditPoolDetail> detailList=new ArrayList<>();
						for(Course course:courseList) {
							AddEdiPoolInput.AddEditPoolDetail detail=new AddEdiPoolInput.AddEditPoolDetail();
							detail.setCourseId(course.getProdCourseId());
							detail.setContainerNo(course.getContainerNo());
							detail.setContainerCategory(ContainerCategoryEnum.CONTAINER_05.getCode());
							detail.setEvaluationNo(course.getValuationNo());
							UnitCourse unitCourse=unitCourseDao.selectByPrimaryKey(course.getProdCourseId());
							if(unitCourse!=null) {
								detail.setUnitEvaluationNo(unitCourse.getValuationNo());
							}
							detailList.add(detail);
						}
						input.setDetails(detailList.toArray(new AddEdiPoolInput.AddEditPoolDetail[detailList.size()]));
						
						ediService.addPool(input);
					}
					
					
					//机组

					UnitCourseExample unitCourseExample=new UnitCourseExample();
					UnitCourseExample.Criteria unitCourseCriteria=unitCourseExample.createCriteria();
					unitCourseCriteria.andYardIn(yardKeyList);
					unitCourseCriteria.andContainerUserEqualTo(config.getContainerUser());
					if(StringUtils.isNotEmpty(config.getReplyState())) {
						unitCourseCriteria.andUseReplyStateEqualTo(config.getReplyState());
					}
					//估价时间
					if(config.getTimeField().equals(EdiAutoPoolTimeEnum.ValuationTime.getCode())) {
						unitCourseCriteria.andValuationTimeLessThanOrEqualTo(calendar.getTime());
					}
					//批复时间
					else if(config.getTimeField().equals(EdiAutoPoolTimeEnum.ReplyTime.getCode())) {
						unitCourseCriteria.andUseReplyTimeLessThanOrEqualTo(calendar.getTime());
					}
					//完工时间
					else if(config.getTimeField().equals(EdiAutoPoolTimeEnum.FinishTime.getCode())) {
						unitCourseCriteria.andFinishTimeLessThanOrEqualTo(calendar.getTime());
					}
					if(courseList.size()>0) {
						unitCourseCriteria.andProdCourseIdNotIn(courseList.stream().map(a->a.getProdCourseId()).collect(Collectors.toList()));
					}
					List<UnitCourse> unitCourseList=unitCourseDao.selectByExample(unitCourseExample);
					if(unitCourseList.size()>0) {
						AddEdiPoolInput input=new AddEdiPoolInput();
						input.setImportType(EdiImportTypeEnum.ContainerUnit.getCode());
						input.setEdiType(ediTypeStringList);
						
						List<AddEdiPoolInput.AddEditPoolDetail> detailList=new ArrayList<>();
						for(UnitCourse unitCourse:unitCourseList) {
							AddEdiPoolInput.AddEditPoolDetail detail=new AddEdiPoolInput.AddEditPoolDetail();
							detail.setCourseId(unitCourse.getProdCourseId());
							detail.setContainerNo(unitCourse.getContainerNo());
							detail.setContainerCategory(ContainerCategoryEnum.CONTAINER_05.getCode());
							Course course=courseDao.selectByPrimaryKey(unitCourse.getProdCourseId());
							if(course!=null) {
								detail.setEvaluationNo(course.getValuationNo());
							}
							detail.setUnitEvaluationNo(unitCourse.getValuationNo());
							detailList.add(detail);
						}
						input.setDetails(detailList.toArray(new AddEdiPoolInput.AddEditPoolDetail[detailList.size()]));
						
						ediService.addPool(input);
					}
				}
				if(true) {
					//箱体+机组 整体导一次
					
					CourseExample courseExample=new CourseExample();
					CourseExample.Criteria courseCriteria=courseExample.createCriteria();
					courseCriteria.andContainerCategoryEqualTo(ContainerCategoryEnum.CONTAINER_02.getCode());
					courseCriteria.andYardIn(yardKeyList);
					courseCriteria.andContainerUserEqualTo(config.getContainerUser());
					if(StringUtils.isNotEmpty(config.getReplyState())) {
						courseCriteria.andUseReplyStateEqualTo(config.getReplyState());
					}
					//估价时间
					if(config.getTimeField().equals(EdiAutoPoolTimeEnum.ValuationTime.getCode())) {
						courseCriteria.andValuationTimeLessThanOrEqualTo(calendar.getTime());
					}
					//批复时间
					else if(config.getTimeField().equals(EdiAutoPoolTimeEnum.ReplyTime.getCode())) {
						courseCriteria.andUseReplyTimeLessThanOrEqualTo(calendar.getTime());
					}
					//完工时间
					else if(config.getTimeField().equals(EdiAutoPoolTimeEnum.FinishTime.getCode())) {
						courseCriteria.andFinishTimeLessThanOrEqualTo(calendar.getTime());
					}
					List<Course> courseList=courseDao.selectByExample(courseExample);
					if(courseList.size()>0) {
						AddEdiPoolInput input=new AddEdiPoolInput();
						input.setImportType(EdiImportTypeEnum.Cold.getCode());
						input.setEdiType(ediTypeStringList);
						
						List<AddEdiPoolInput.AddEditPoolDetail> detailList=new ArrayList<>();
						for(Course course:courseList) {
							AddEdiPoolInput.AddEditPoolDetail detail=new AddEdiPoolInput.AddEditPoolDetail();
							detail.setCourseId(course.getProdCourseId());
							detail.setContainerNo(course.getContainerNo());
							detail.setContainerCategory(ContainerCategoryEnum.CONTAINER_05.getCode());
							detail.setEvaluationNo(course.getValuationNo());
							UnitCourse unitCourse=unitCourseDao.selectByPrimaryKey(course.getProdCourseId());
							if(unitCourse!=null) {
								detail.setUnitEvaluationNo(unitCourse.getValuationNo());
							}
							detailList.add(detail);
						}
						input.setDetails(detailList.toArray(new AddEdiPoolInput.AddEditPoolDetail[detailList.size()]));
						
						ediService.addPool(input);
					}
					
					
					//机组

					UnitCourseExample unitCourseExample=new UnitCourseExample();
					UnitCourseExample.Criteria unitCourseCriteria=unitCourseExample.createCriteria();
					unitCourseCriteria.andYardIn(yardKeyList);
					unitCourseCriteria.andContainerUserEqualTo(config.getContainerUser());
					if(StringUtils.isNotEmpty(config.getReplyState())) {
						unitCourseCriteria.andUseReplyStateEqualTo(config.getReplyState());
					}
					//估价时间
					if(config.getTimeField().equals(EdiAutoPoolTimeEnum.ValuationTime.getCode())) {
						unitCourseCriteria.andValuationTimeLessThanOrEqualTo(calendar.getTime());
					}
					//批复时间
					else if(config.getTimeField().equals(EdiAutoPoolTimeEnum.ReplyTime.getCode())) {
						unitCourseCriteria.andUseReplyTimeLessThanOrEqualTo(calendar.getTime());
					}
					//完工时间
					else if(config.getTimeField().equals(EdiAutoPoolTimeEnum.FinishTime.getCode())) {
						unitCourseCriteria.andFinishTimeLessThanOrEqualTo(calendar.getTime());
					}
					if(courseList.size()>0) {
						unitCourseCriteria.andProdCourseIdNotIn(courseList.stream().map(a->a.getProdCourseId()).collect(Collectors.toList()));
					}
					List<UnitCourse> unitCourseList=unitCourseDao.selectByExample(unitCourseExample);
					if(unitCourseList.size()>0) {
						AddEdiPoolInput input=new AddEdiPoolInput();
						input.setImportType(EdiImportTypeEnum.Cold.getCode());
						input.setEdiType(ediTypeStringList);
						
						List<AddEdiPoolInput.AddEditPoolDetail> detailList=new ArrayList<>();
						for(UnitCourse unitCourse:unitCourseList) {
							AddEdiPoolInput.AddEditPoolDetail detail=new AddEdiPoolInput.AddEditPoolDetail();
							detail.setCourseId(unitCourse.getProdCourseId());
							detail.setContainerNo(unitCourse.getContainerNo());
							detail.setContainerCategory(ContainerCategoryEnum.CONTAINER_05.getCode());
							Course course=courseDao.selectByPrimaryKey(unitCourse.getProdCourseId());
							if(course!=null) {
								detail.setEvaluationNo(course.getValuationNo());
							}
							detail.setUnitEvaluationNo(unitCourse.getValuationNo());
							detailList.add(detail);
						}
						input.setDetails(detailList.toArray(new AddEdiPoolInput.AddEditPoolDetail[detailList.size()]));
						
						ediService.addPool(input);
						
						
					}
				}
			}
		}
		
	}
	
	
}
