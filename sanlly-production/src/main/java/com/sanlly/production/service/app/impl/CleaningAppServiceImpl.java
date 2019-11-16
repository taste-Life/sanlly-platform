package com.sanlly.production.service.app.impl;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.enums.CommonEnum;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.dao.ContainerCleaningMapper;
import com.sanlly.production.dao.CourseMapper;
import com.sanlly.production.dao.OdorSpeciesMapper;
import com.sanlly.production.dao.UnitCourseMapper;
import com.sanlly.production.dao.YardZoneMapper;
import com.sanlly.production.entity.ContainerCleaningExample;
import com.sanlly.production.entity.ContainerCleaningWithBLOBs;
import com.sanlly.production.entity.Course;
import com.sanlly.production.entity.CourseExample;
import com.sanlly.production.entity.OdorSpeciesExample;
import com.sanlly.production.entity.UnitCourse;
import com.sanlly.production.entity.UnitCourseExample;
import com.sanlly.production.entity.YardZone;
import com.sanlly.production.entity.YardZoneExample;
import com.sanlly.production.enums.CleaningStateEnum;
import com.sanlly.production.models.input.app.cleaning.CleaningAuditInput;
import com.sanlly.production.models.input.app.cleaning.CleaningPhotoInput;
import com.sanlly.production.models.input.app.cleaning.CleaningSearchInput;
import com.sanlly.production.models.input.app.cleaning.CleaningUploaderInput;
import com.sanlly.production.models.output.app.cleaning.CleaningListOutput;
import com.sanlly.production.models.output.app.cleaning.OdorSpeciesOutput;
import com.sanlly.production.service.app.CleaningAppService;

/**
 * 洗箱app接口实现类
 * @author RexSheng
 * 2019年8月24日 下午4:08:49
 */
@Service
public class CleaningAppServiceImpl extends BaseAppServiceImpl implements CleaningAppService{

	@Autowired
	private CourseMapper courseDao;
	
	@Autowired
	private YardZoneMapper zoneDao;
	
	@Autowired
	private UnitCourseMapper unitCourseDao;
	
	@Autowired
	private ContainerCleaningMapper cleaningDao;
	
	@Autowired
	private OdorSpeciesMapper flavorDao;
	
	/**
	 * 获取洗箱列表
	 */
	@Override
	public PagedList<CleaningListOutput> getCleanPagedList(CleaningSearchInput input) {
		PagedList<CleaningListOutput> pagedList=new PagedList<CleaningListOutput>(input.getIndex(),input.getSize());
		CourseExample courseExample=new CourseExample();
		CourseExample.Criteria criteria=courseExample.createCriteria();
		//场站搜索
		String yardKey=getCurrentYardKey();
		if(StringUtils.isNotEmpty(yardKey)) {
			criteria.andYardEqualTo(yardKey);
		}
		if(StringUtils.isNotEmpty(input.getContainerNo())) {
			criteria.andContainerNoLike("%"+input.getContainerNo()+"%");
		}
		if(StringUtils.isNotEmpty(input.getContainerCategory())) {
			criteria.andContainerCategoryEqualTo(input.getContainerCategory());
		}
		List<Course> courseList=courseDao.selectByExample(courseExample);
		if(courseList.size()==0) {
			return pagedList;
		}
		List<String> courseIdList=courseList.stream().map(a->a.getProdCourseId()).collect(Collectors.toList());
		//区位搜索
		if(StringUtils.isNotEmpty(input.getZone())) {
			YardZoneExample yzExample=new YardZoneExample();
			yzExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
				.andZoneCodeLike("%"+input.getZone()+"%");
			List<YardZone> zoneList=zoneDao.selectByExample(yzExample);
			if(zoneList.size()==0) {
				return pagedList;
			}
			UnitCourseExample ucExample=new UnitCourseExample();
			UnitCourseExample.Criteria ucCriteria=ucExample.createCriteria();
			ucCriteria.andZoneIn(zoneList.stream().map(a->a.getKey()).collect(Collectors.toList()));
			List<UnitCourse> ucList=unitCourseDao.selectByExample(ucExample);
			if(ucList.size()==0) {
				return pagedList;
			}
			List<String> unitCourseIdList=ucList.stream().map(a->a.getProdCourseId()).collect(Collectors.toList());
			courseIdList=courseIdList.stream().filter(a->unitCourseIdList.contains(a)).collect(Collectors.toList());
			if(courseIdList.size()==0) {
				return pagedList;
			}
		}
		//洗箱表
		ContainerCleaningExample cleaningExample=new ContainerCleaningExample();
		ContainerCleaningExample.Criteria cleaningCriteria=cleaningExample.createCriteria();
		cleaningCriteria.andCourseIdIn(courseIdList);
		if(input.getType()!=null) {
			if(input.getType().equals(1)) {
				//洗箱员
				if(StringUtils.isNotEmpty(input.getCleaningState())) {
					cleaningCriteria.andCleaningStateEqualTo(input.getCleaningState());
				}
				else {
					cleaningCriteria.andCleaningStateIn(Arrays.asList(CleaningStateEnum.UNCLEANING.getCode(),CleaningStateEnum.UNAUDIT.getCode(),CleaningStateEnum.AUDITED.getCode()));
				}
			}
			else {
				//预检员
				if(StringUtils.isNotEmpty(input.getCleaningState())) {
					cleaningCriteria.andCleaningStateEqualTo(input.getCleaningState());
				}
				else {
					cleaningCriteria.andCleaningStateIn(Arrays.asList(CleaningStateEnum.UNAUDIT.getCode(),CleaningStateEnum.AUDITED.getCode()));
				}
				
			}
		}
		int totalItemCount=(int)cleaningDao.countByExample(cleaningExample);
		pagedList.setTotalItemCount(totalItemCount);
		//洗箱分页
		cleaningExample.setLimitStart(pagedList.getLimitStart());
		cleaningExample.setLimitEnd(pagedList.getLimitEnd());
		cleaningExample.setOrderByClause("create_time desc");
		List<ContainerCleaningWithBLOBs> cleaningList=cleaningDao.selectByExampleWithBLOBs(cleaningExample);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm");
		List<CleaningListOutput> outList=cleaningList.stream().map(a->{
			CleaningListOutput item=new CleaningListOutput();
			Course course=courseDao.selectByPrimaryKey(a.getCourseId());
			UnitCourse unitCourse=unitCourseDao.selectByPrimaryKey(a.getCourseId());
			if(course!=null) {
				item.setProdCourseId(course.getProdCourseId());
				item.setContainerNo(course.getContainerNo());
				if(course.getCourseTime()!=null) {
					item.setEntryDate(sdf.format(course.getCourseTime()));
				}
				item.setContainerTypeNameLang(course.getContainerType());
			}
			if(unitCourse!=null) {
				item.setZoneLang(unitCourse.getZone());
			}
			
			item.setIsSpecialLang(a.getIsSpecial());
			item.setCleaningStateLang(a.getCleaningState());
			item.setOffFlavorTypeLang(a.getOffFlavorType());
			item.setOffFlavorTypeKey(a.getOffFlavorType());
			item.setCleanPhoto(a.getCleaningPhoto());
			item.setCleanCheckPhoto(a.getAuditPhoto());
			item.setRemark(a.getRemarks());
			
			item.setSign(a.getTestingRemarks());
			if(a.getCleaningTime()!=null) {
				item.setCleanDate(sdf.format(a.getCleaningTime()));
			}
			
			return item;
		}).collect(Collectors.toList());
		pagedList.setDataList(outList);
		return pagedList;
	}

	/**
	 * 洗箱员洗箱
	 * @param input
	 */
	@Override
	public void subCleanDetail(CleaningUploaderInput input) {
		ContainerCleaningExample cleaningExample=new ContainerCleaningExample();
		cleaningExample.createCriteria().andCourseIdEqualTo(input.getProdCourseId());
		ContainerCleaningWithBLOBs record=cleaningDao.selectByExampleWithBLOBs(cleaningExample).get(0);
		
		record.setIsSpecial(input.getIsSpecial());
		record.setOffFlavorType(input.getOffFlavorTypeKey());
		record.setCleaningPhoto(input.getCleanPhoto());
		record.setRemarks(input.getRemarks());
		record.setCleaningTime(new Date());
		//特殊箱需要审核
		if(StringUtils.isNotEmpty(record.getIsSpecial()) && record.getIsSpecial().equals(CommonEnum.YES.getCode())) {
			record.setCleaningState(CleaningStateEnum.UNAUDIT.getCode());
		}
		else {
			record.setAuditTime(new Date());
			record.setAuditUser(getCurrentUserId());
			record.setCleaningState(CleaningStateEnum.AUDITED.getCode());
		}
		record.setUpdateTime(new Date());
		record.setUpdateUser(getCurrentUserId());
		cleaningDao.updateByPrimaryKeyWithBLOBs(record);
	}

	/**
	 * 预检员洗箱
	 * @param input
	 */
	@Override
	public void subCheckCleanDetail(CleaningAuditInput input) {
		ContainerCleaningExample cleaningExample=new ContainerCleaningExample();
		cleaningExample.createCriteria().andCourseIdEqualTo(input.getProdCourseId());
		ContainerCleaningWithBLOBs record=cleaningDao.selectByExampleWithBLOBs(cleaningExample).get(0);
		
		record.setAuditPhoto(input.getAuditPhoto());
		record.setAuditTime(new Date());
		record.setAuditUser(getCurrentUserId());
		record.setCleaningState(CleaningStateEnum.AUDITED.getCode());
		
		record.setUpdateTime(new Date());
		record.setUpdateUser(getCurrentUserId());
		cleaningDao.updateByPrimaryKeyWithBLOBs(record);
	}

	/**
	 * 洗箱完工补充照片
	 * @param input
	 */
	@Override
	public void subCompletePhoto(CleaningPhotoInput input) {
		ContainerCleaningExample cleaningExample=new ContainerCleaningExample();
		cleaningExample.createCriteria().andCourseIdEqualTo(input.getProdCourseId());
		ContainerCleaningWithBLOBs record=cleaningDao.selectByExampleWithBLOBs(cleaningExample).get(0);
		record.setCleaningPhoto(input.getCompletePhoto());

		record.setUpdateTime(new Date());
		record.setUpdateUser(getCurrentUserId());
		cleaningDao.updateByPrimaryKeyWithBLOBs(record);
	}

	/**
	 * 异味种类列表
	 * @return
	 */
	@Override
	public OdorSpeciesOutput[] odorSpeciesList() {
		OdorSpeciesExample example=new OdorSpeciesExample();
		example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		return flavorDao.selectByExample(example).stream().map(a->{
			OdorSpeciesOutput item=new OdorSpeciesOutput();
			item.setOdorSpeciesKey(a.getKey());
			item.setOdorSpeciesCode(a.getOdorSpeciesCode());
			item.setOdorSpeciesNameLang(a.getKey());
			return item;
		}).toArray(OdorSpeciesOutput[]::new);
	}
}
