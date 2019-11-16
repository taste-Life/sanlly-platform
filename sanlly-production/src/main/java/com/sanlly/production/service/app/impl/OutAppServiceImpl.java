package com.sanlly.production.service.app.impl;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.enums.CommonEnum;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.dao.ContainerCleaningMapper;
import com.sanlly.production.dao.ContainerMapper;
import com.sanlly.production.dao.CourseMapper;
import com.sanlly.production.dao.OutContainerMapper;
import com.sanlly.production.dao.UnitCourseMapper;
import com.sanlly.production.dao.XxContainerMapper;
import com.sanlly.production.dao.YardZoneMapper;
import com.sanlly.production.entity.ContainerCleaning;
import com.sanlly.production.entity.ContainerCleaningExample;
import com.sanlly.production.entity.ContainerExample;
import com.sanlly.production.entity.Course;
import com.sanlly.production.entity.CourseExample;
import com.sanlly.production.entity.OutContainer;
import com.sanlly.production.entity.UnitCourse;
import com.sanlly.production.entity.UnitCourseExample;
import com.sanlly.production.entity.UnitCourseWithBLOBs;
import com.sanlly.production.entity.XxContainer;
import com.sanlly.production.entity.XxContainerExample;
import com.sanlly.production.entity.YardZone;
import com.sanlly.production.entity.YardZoneExample;
import com.sanlly.production.enums.CleaningSourceEnum;
import com.sanlly.production.enums.OkNotOkEnum;
import com.sanlly.production.enums.PreviewStateEnum;
import com.sanlly.production.enums.ZoneTypeEnum;
import com.sanlly.production.models.input.app.out.MoveSearchInput;
import com.sanlly.production.models.input.app.out.OutSearchInput;
import com.sanlly.production.models.input.app.out.PtiOkSearchInput;
import com.sanlly.production.models.input.cleaning.CleaningAddInput;
import com.sanlly.production.models.output.app.out.MoveListOutput;
import com.sanlly.production.models.output.app.out.OutListOutput;
import com.sanlly.production.models.output.app.out.PtiOkListOutput;
import com.sanlly.production.service.CleaningService;
import com.sanlly.production.service.app.OutAppService;

/**
 * 出箱列表
 * @author RexSheng
 * 2019年8月26日 下午4:44:29
 * 
 */
@Service
public class OutAppServiceImpl extends BaseAppServiceImpl implements OutAppService{

	/**
	 * 箱子进场表
	 */
	@Autowired
	private CourseMapper courseDao;
	
	@Autowired
	private UnitCourseMapper unitCourseDao;
	
	@Autowired
	private YardZoneMapper zoneDao;
	
	@Autowired
	private ContainerCleaningMapper cleaningDao;
		
	@Autowired
	private XxContainerMapper xxDao;
	
	@Autowired
	private OutContainerMapper outContainerDao;
	
	@Autowired
	private ContainerMapper containerDao;
	
	@Autowired
	private CleaningService cleaningService;
	
	/**
	 * 获取出箱列表
	 * @param input
	 * @return
	 */
	@Override
	public PagedList<OutListOutput> getOutPagedList(OutSearchInput input) {
		PagedList<OutListOutput> pagedList=new PagedList<OutListOutput>(input.getPageIndex(),input.getPageSize());
		CourseExample courseExample=new CourseExample();
		CourseExample.Criteria criteria=courseExample.createCriteria();
		UnitCourseExample unitCourseExample=new UnitCourseExample();
		UnitCourseExample.Criteria unitCriteria=unitCourseExample.createCriteria();
		//预检区内
//		unitCriteria.andIsPreviewIsNotNull().andIsPreviewEqualTo(CommonEnum.YES.getCode());
		//区位判断
		if(StringUtils.isNotEmpty(input.getZone())) {
			//区位搜索
			YardZoneExample zoneExample=new YardZoneExample();
			YardZoneExample.Criteria zoneCriteria=zoneExample.createCriteria();
			zoneCriteria.andZoneTypeEqualTo(ZoneTypeEnum.PRE_ZONE.getCode())
			.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
			zoneCriteria.andZoneCodeLike("%"+input.getZone()+"%");
			List<YardZone> zoneList=zoneDao.selectByExample(zoneExample);
			if(zoneList.size()==0) {
				return pagedList;
			}
			unitCriteria.andZoneIn(zoneList.stream().map(a->a.getKey()).collect(Collectors.toList()));
		}
		else {
			//区位搜索
			YardZoneExample zoneExample=new YardZoneExample();
			YardZoneExample.Criteria zoneCriteria=zoneExample.createCriteria();
			zoneCriteria.andZoneTypeEqualTo(ZoneTypeEnum.PRE_ZONE.getCode())
			.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
			
			List<YardZone> zoneList=zoneDao.selectByExample(zoneExample);
			if(zoneList.size()==0) {
				return pagedList;
			}
			unitCriteria.andZoneIn(zoneList.stream().map(a->a.getKey()).collect(Collectors.toList()));
		}
		
		
		//箱号搜索
		if(StringUtils.isNotEmpty(input.getContainerNo())) {
			unitCriteria.andContainerNoLike("%"+input.getContainerNo()+"%");
		}
		//场站搜索
		String yardKey=getCurrentYardKey();
		if(StringUtils.isNotEmpty(yardKey)) {
			criteria.andYardEqualTo(yardKey);
			//关联箱体进场
			List<Course> courseList=courseDao.selectByExample(courseExample);
			if(courseList.size()==0) {
				return pagedList;
			}
			unitCriteria.andProdCourseIdIn(courseList.stream().map(a->a.getProdCourseId()).collect(Collectors.toList()));
		}
		//执行分页查询
		int totalItemCount=(int)unitCourseDao.countByExample(unitCourseExample);
		pagedList.setTotalItemCount(totalItemCount);
		unitCourseExample.setLimitStart(pagedList.getLimitStart());
		unitCourseExample.setLimitEnd(pagedList.getLimitEnd());
		List<UnitCourse> unitCourseList=unitCourseDao.selectByExample(unitCourseExample);
		List<OutListOutput> dataList=unitCourseList.stream().map(a->{
			OutListOutput item=new OutListOutput();
			Course course=courseDao.selectByPrimaryKey(a.getProdCourseId());
			
			item.setProdCourseId(a.getProdCourseId());
			item.setContainerNo(a.getContainerNo());
			item.setZoneLang(a.getZone());
			//pti状态
//			MaintenanceExample mainExample=new MaintenanceExample();
//			mainExample.createCriteria().andCourseEqualTo(a.getProdCourseId());
//			List<Maintenance> maintenanceList=maintenanceDao.selectByExample(mainExample);
//			if(maintenanceList.size()>0) {
//				item.setPtiLang(super.getPtiState(course, a, maintenanceList.get(0)).getCode());
//			}
//			else {
//				item.setPtiLang(OkNotOkEnum.NOTOK.getCode());
//			}
			XxContainerExample xxExample=new XxContainerExample();
			xxExample.createCriteria().andCourseEqualTo(a.getProdCourseId());
			List<XxContainer> xxList=xxDao.selectByExample(xxExample);
			if(xxList.size()>0) {
				XxContainer xxRecord=xxList.get(0);
				//pti状态
				item.setPtiLang(xxRecord.getPtiResult());
				//是否xx箱
				item.setIsXXLang(xxRecord.getIsXx());
			}
			else {
				//pti状态
				item.setPtiLang(OkNotOkEnum.NOTOK.getCode());
				//是否xx箱
				item.setIsXXLang(CommonEnum.NO.getCode());
			}
			
			//是否原移箱
			item.setIsMoveLang((a.getPreviewState()!=null && a.getPreviewState().equals(PreviewStateEnum.MOVE.getCode()))?
					CommonEnum.YES.getCode():CommonEnum.NO.getCode());
			item.setUnitStateLang(a.getUnitState());
			if(course!=null) {
				item.setContainerStateLang(course.getContainerCondition());
				//出箱备注
				item.setRemark(a.getOutRemarks());
				item.setVolume(String.valueOf(course.getContainerVolume()));
			}
			
			//洗箱状态
			ContainerCleaningExample cleaningExample=new ContainerCleaningExample();
			cleaningExample.createCriteria().andCourseIdEqualTo(a.getProdCourseId());
			List<ContainerCleaning> cleaningList=cleaningDao.selectByExample(cleaningExample);
			if(cleaningList.size()>0) {
				item.setCleanStateLang(cleaningList.get(0).getCleaningState());
			}
			
			//生产日期
			if(StringUtils.isNotEmpty(a.getStartDate())) {
				item.setDate(a.getStartDate());
			}
			
			item.setHumidityLang(a.getIsHumidity());
			item.setUnitTypeLang(a.getUnitType());
			
			item.setFireTestLang(a.getIsFireTest());
			item.setVentilationLang(a.getIsVentilation());
			item.setContainerUserLang(a.getContainerUser());
			return item;
		}).collect(Collectors.toList());
		//设置数据
		pagedList.setDataList(dataList);
		//返回分页结果
		return pagedList;
	}

	/**
	 * pti Ok确认
	 * @param prodCourseIds
	 */
	@Override
	@Transactional
	public void ptiOkConfirm(String[] prodCourseIds) {
		for(String courseId:prodCourseIds) {
			XxContainerExample xxExample=new XxContainerExample();
			xxExample.createCriteria().andCourseEqualTo(courseId);
			List<XxContainer> xxList=xxDao.selectByExample(xxExample);
			if(xxList.size()>0) {
				XxContainer xxRecord=xxList.get(0);
				//pti状态
				xxRecord.setPtiResult(OkNotOkEnum.OK.getCode());
				xxRecord.setPtiLastResult(OkNotOkEnum.OK.getCode());
				xxRecord.setUpdateTime(new Date());
				xxRecord.setUpdateUser(getCurrentUserId());
				xxDao.updateByPrimaryKey(xxRecord);
				//自动取消原移箱标记
				UnitCourseWithBLOBs unitCourse=unitCourseDao.selectByPrimaryKey(courseId);
				unitCourse.setPreviewState(PreviewStateEnum.DEFAULT.getCode());
				unitCourseDao.updateByPrimaryKey(unitCourse);
			}
			else {
				XxContainer xxRecord=new XxContainer();
				//箱号
				UnitCourseExample exp=new UnitCourseExample();
				exp.createCriteria().andProdCourseIdEqualTo(courseId);
				List<UnitCourse> unitCourseList=unitCourseDao.selectByExample(exp);
				xxRecord.setContainerNo(unitCourseList.get(0).getContainerNo());
				//箱id
				ContainerExample cExp=new ContainerExample();
				cExp.createCriteria().andContainerNoEqualTo(unitCourseList.get(0).getContainerNo());
				xxRecord.setContainer(containerDao.selectByExample(cExp).get(0).getProdContainerId());
				
				xxRecord.setCourse(courseId);
				xxRecord.setIsXx(CommonEnum.NO.getCode());
				xxRecord.setPtiResult(OkNotOkEnum.OK.getCode());
				xxRecord.setPtiLastResult(OkNotOkEnum.OK.getCode());
				xxRecord.setCreateTime(new Date());
				xxRecord.setCreateUser(getCurrentUserId());
				xxDao.insert(xxRecord);
			}
			
		}
	}
	
	/**
	 * pti 取消确认
	 * @param prodCourseIds
	 */
	@Override
	@Transactional
	public void ptiNotOkConfirm(String[] prodCourseIds) {
		for(String courseId:prodCourseIds) {
			XxContainerExample xxExample=new XxContainerExample();
			xxExample.createCriteria().andCourseEqualTo(courseId);
			List<XxContainer> xxList=xxDao.selectByExample(xxExample);
			if(xxList.size()>0) {
				XxContainer xxRecord=xxList.get(0);
				//pti状态
				xxRecord.setPtiResult(OkNotOkEnum.NOTOK.getCode());
				xxRecord.setPtiLastResult(null);
				xxRecord.setUpdateTime(new Date());
				xxRecord.setUpdateUser(getCurrentUserId());
				xxDao.updateByPrimaryKey(xxRecord);
			}
			else {
				XxContainer xxRecord=new XxContainer();
				//箱号
				UnitCourseExample exp=new UnitCourseExample();
				exp.createCriteria().andProdCourseIdEqualTo(courseId);
				List<UnitCourse> unitCourseList=unitCourseDao.selectByExample(exp);
				xxRecord.setContainerNo(unitCourseList.get(0).getContainerNo());
				//箱id
				ContainerExample cExp=new ContainerExample();
				cExp.createCriteria().andContainerNoEqualTo(unitCourseList.get(0).getContainerNo());
				xxRecord.setContainer(containerDao.selectByExample(cExp).get(0).getProdContainerId());
				
				xxRecord.setCourse(courseId);
				xxRecord.setIsXx(CommonEnum.NO.getCode());
				xxRecord.setPtiResult(OkNotOkEnum.NOTOK.getCode());
				xxRecord.setPtiLastResult(null);
				xxRecord.setCreateTime(new Date());
				xxRecord.setCreateUser(getCurrentUserId());
				xxDao.insert(xxRecord);
			}
		}
	}
	
	
	/**
	 * 出箱操作
	 * @param prodCourseIds
	 */
	@Override
	@Transactional
	public void outLeave(String[] prodCourseIds) {
		String batchNumber = String.valueOf(Calendar.getInstance().getTimeInMillis());
		for(String courseId:prodCourseIds) {
			UnitCourse unitCourse=unitCourseDao.selectByPrimaryKey(courseId);
			//清空区位
			unitCourse.setZone(null);
			unitCourse.setUpdateTime(new Date());
			unitCourse.setUpdateUser(getCurrentUserId());
			unitCourseDao.updateByPrimaryKey(unitCourse);
			
			//生成出箱操作记录
			OutContainer outRecord=new OutContainer();
			outRecord.setContainerNo(unitCourse.getContainerNo());
			//箱id
			ContainerExample cExp=new ContainerExample();
			cExp.createCriteria().andContainerNoEqualTo(outRecord.getContainerNo());
			outRecord.setContainer(containerDao.selectByExample(cExp).get(0).getProdContainerId());
			//批次号
			outRecord.setBatchNumber(batchNumber);
			outContainerDao.insert(outRecord);
		}
		
	}

	/**
	 * 原移
	 * @param prodCourseIds
	 */
	@Override
	@Transactional
	public void move(String[] prodCourseIds) {
		for(String courseId:prodCourseIds) {
			UnitCourse unitCourse=unitCourseDao.selectByPrimaryKey(courseId);
			//
			unitCourse.setPreviewState(PreviewStateEnum.MOVE.getCode());
			unitCourse.setUpdateTime(new Date());
			unitCourse.setUpdateUser(getCurrentUserId());
			unitCourseDao.updateByPrimaryKey(unitCourse);
		}
	}

	/**
	 * 取消原移
	 * @param prodCourseIds
	 */
	@Override
	@Transactional
	public void cancelMove(String[] prodCourseIds) {
		for(String courseId:prodCourseIds) {
			UnitCourse unitCourse=unitCourseDao.selectByPrimaryKey(courseId);
			//
			unitCourse.setPreviewState(PreviewStateEnum.DEFAULT.getCode());
			unitCourse.setUpdateTime(new Date());
			unitCourse.setUpdateUser(getCurrentUserId());
			unitCourseDao.updateByPrimaryKey(unitCourse);
		}
	}
	
	/**
	 * 出箱列表添加备注
	 * @param prodCourseIds
	 * @param remarks
	 */
	@Override
	@Transactional
	public void outRemarks(String[] prodCourseIds, String remarks) {
		for(String courseId:prodCourseIds) {
			UnitCourse unitCourse = unitCourseDao.selectByPrimaryKey(courseId);
			unitCourse.setOutRemarks(remarks);
			unitCourse.setUpdateTime(new Date());
			unitCourse.setUpdateUser(getCurrentUserId());
			unitCourseDao.updateByPrimaryKey(unitCourse);
		}
	}
	
	/**
	 * 获取原移箱列表
	 * @param input
	 * @return
	 */
	@Override
	public PagedList<MoveListOutput> getMoveOutPagedList(MoveSearchInput input) {
		PagedList<MoveListOutput> pagedList=new PagedList<MoveListOutput>(input.getPageIndex(),input.getPageSize());
		CourseExample courseExample=new CourseExample();
		CourseExample.Criteria criteria=courseExample.createCriteria();
		UnitCourseExample unitCourseExample=new UnitCourseExample();
		UnitCourseExample.Criteria unitCriteria=unitCourseExample.createCriteria();

		//箱号搜索
		if(StringUtils.isNotEmpty(input.getContainerNo())) {
			unitCriteria.andContainerNoLike("%"+input.getContainerNo()+"%");
		}
		//场站搜索
		String yardKey=getCurrentYardKey();
		if(StringUtils.isNotEmpty(yardKey)) {
			criteria.andYardEqualTo(yardKey);
			//关联箱体进场
			List<Course> courseList=courseDao.selectByExample(courseExample);
			if(courseList.size()==0) {
				return pagedList;
			}
			unitCriteria.andProdCourseIdIn(courseList.stream().map(a->a.getProdCourseId()).collect(Collectors.toList()));
		}
		//原移箱
		unitCriteria.andPreviewStateEqualTo(PreviewStateEnum.MOVE.getCode());
		//执行分页查询
		int totalItemCount=(int)unitCourseDao.countByExample(unitCourseExample);
		pagedList.setTotalItemCount(totalItemCount);
		unitCourseExample.setLimitStart(pagedList.getLimitStart());
		unitCourseExample.setLimitEnd(pagedList.getLimitEnd());
		List<UnitCourse> unitCourseList=unitCourseDao.selectByExample(unitCourseExample);
		List<MoveListOutput> dataList=unitCourseList.stream().map(a->{
			MoveListOutput item=new MoveListOutput();
			Course course=courseDao.selectByPrimaryKey(a.getProdCourseId());
			item.setProdCourseId(a.getProdCourseId());
			item.setContainerNo(a.getContainerNo());
			item.setZoneLang(a.getZone());
			//pti状态
//			MaintenanceExample mainExample=new MaintenanceExample();
//			mainExample.createCriteria().andCourseEqualTo(a.getProdCourseId());
//			List<Maintenance> maintenanceList=maintenanceDao.selectByExample(mainExample);
//			if(maintenanceList.size()>0) {
//				item.setPtiLang(super.getPtiState(course, a, maintenanceList.get(0)).getCode());
//			}
//			else {
//				item.setPtiLang(OkNotOkEnum.NOTOK.getCode());
//			}
			XxContainerExample xxExample=new XxContainerExample();
			xxExample.createCriteria().andCourseEqualTo(a.getProdCourseId());
			List<XxContainer> xxList=xxDao.selectByExample(xxExample);
			if(xxList.size()>0) {
				XxContainer xxRecord=xxList.get(0);
				//pti状态
				item.setPtiLang(xxRecord.getPtiResult());
				//是否xx箱
				item.setIsXXLang(xxRecord.getIsXx());
			}
			else {
				//pti状态
				item.setPtiLang(OkNotOkEnum.NOTOK.getCode());
				//是否xx箱
				item.setIsXXLang(CommonEnum.NO.getCode());
			}
			//
			item.setUnitStateLang(a.getUnitState());
			//
			if(course!=null)
			item.setContainerStateLang(course.getContainerCondition());
			//洗箱状态
			ContainerCleaningExample cleaningExample=new ContainerCleaningExample();
			cleaningExample.createCriteria().andCourseIdEqualTo(a.getProdCourseId());
			List<ContainerCleaning> cleaningList=cleaningDao.selectByExample(cleaningExample);
			if(cleaningList.size()>0) {
				item.setCleanStateLang(cleaningList.get(0).getCleaningState());
			}
			//出箱备注
			if(course!=null)
			item.setRemark(a.getOutRemarks());
			//生产日期
			if(StringUtils.isNotEmpty(a.getStartDate())) {
				item.setDate(a.getStartDate());
			}
			//
			item.setHumidityLang(a.getIsHumidity());
			item.setUnitTypeLang(a.getUnitType());
			if(course!=null) {
				item.setVolume(String.valueOf(course.getContainerVolume()));
			}
			item.setFireTestLang(a.getIsFireTest());
			item.setVentilationLang(a.getIsVentilation());
			item.setContainerUserLang(a.getContainerUser());
			return item;
		}).collect(Collectors.toList());
		//设置数据
		pagedList.setDataList(dataList);
		//返回分页结果
		return pagedList;
	}

	/**
	 * 已确认PTIok列表
	 * @param input
	 * @return
	 */
	@Override
	public PagedList<PtiOkListOutput> getPtiOks(PtiOkSearchInput input) {
		PagedList<PtiOkListOutput> pagedList=new PagedList<PtiOkListOutput>(input.getPageIndex(),input.getPageSize());
		
		XxContainerExample xxExample=new XxContainerExample();
		XxContainerExample.Criteria xxCriteria=xxExample.createCriteria();
		
		CourseExample courseExample=new CourseExample();
		CourseExample.Criteria criteria=courseExample.createCriteria();
		
		//箱号搜索
		if(StringUtils.isNotEmpty(input.getContainerNo())) {
			criteria.andContainerNoLike("%"+input.getContainerNo()+"%");
		}
		//场站搜索
		String yardKey=getCurrentYardKey();
		if(StringUtils.isNotEmpty(yardKey)) {
			criteria.andYardEqualTo(yardKey);
			//关联箱体进场
			List<Course> courseList=courseDao.selectByExample(courseExample);
			if(courseList.size()==0) {
				return pagedList;
			}
			xxCriteria.andCourseIn(courseList.stream().map(a->a.getProdCourseId()).collect(Collectors.toList()));
		}
		xxCriteria.andPtiLastResultIsNotNull().andPtiLastResultEqualTo(OkNotOkEnum.OK.getCode());
		//执行分页查询
		int totalItemCount=(int)xxDao.countByExample(xxExample);
		pagedList.setTotalItemCount(totalItemCount);
		xxExample.setLimitStart(pagedList.getLimitStart());
		xxExample.setLimitEnd(pagedList.getLimitEnd());
		List<XxContainer> unitCourseList=xxDao.selectByExample(xxExample);
		List<PtiOkListOutput> dataList=unitCourseList.stream().map(a->{
			PtiOkListOutput item=new PtiOkListOutput();
			Course course=courseDao.selectByPrimaryKey(a.getCourse());
			UnitCourse unitCourse=unitCourseDao.selectByPrimaryKey(a.getCourse());
			item.setProdCourseId(a.getCourse());
			if(course!=null) {

				item.setContainerNo(course.getContainerNo());
				item.setContainerStateLang(course.getContainerCondition());
				//出箱备注
				item.setRemark(unitCourse.getOutRemarks());
				item.setVolume(String.valueOf(course.getContainerVolume()));
			}
			if(unitCourse!=null) {

				item.setZoneLang(unitCourse.getZone());
				//是否原移箱
				item.setIsMoveLang(unitCourse.getPreviewState());
				item.setUnitStateLang(unitCourse.getUnitState());
				//生产日期
				if(StringUtils.isNotEmpty(unitCourse.getStartDate())) {
					item.setDate(unitCourse.getStartDate());
				}
				item.setHumidityLang(unitCourse.getIsHumidity());
				item.setUnitTypeLang(unitCourse.getUnitType());
				item.setFireTestLang(unitCourse.getIsFireTest());
				item.setVentilationLang(unitCourse.getIsVentilation());
			}
			//pti状态
			//是否xx箱
			item.setIsXXLang(a.getIsXx());
			//洗箱状态
			ContainerCleaningExample cleaningExample=new ContainerCleaningExample();
			cleaningExample.createCriteria().andCourseIdEqualTo(a.getCourse());
			List<ContainerCleaning> cleaningList=cleaningDao.selectByExample(cleaningExample);
			if(cleaningList.size()>0) {
				item.setCleanStateLang(cleaningList.get(0).getCleaningState());
			}
			return item;
		}).collect(Collectors.toList());
		//设置数据
		pagedList.setDataList(dataList);
		//返回分页结果
		return pagedList;
	
	}

}
