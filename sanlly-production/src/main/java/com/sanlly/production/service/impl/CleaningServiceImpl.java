package com.sanlly.production.service.impl;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.enums.CommonEnum;
import com.sanlly.common.models.exception.InvalidException;
import com.sanlly.common.models.input.finance.PoolOutSourceRepairInput;
import com.sanlly.common.models.output.SelectOutput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.dao.CleaningNodeMapper;
import com.sanlly.production.dao.CleaningPatternMapper;
import com.sanlly.production.dao.ContainerCleaningMapper;
import com.sanlly.production.dao.ContainerUserMapper;
import com.sanlly.production.dao.CourseMapper;
import com.sanlly.production.dao.OdorSpeciesMapper;
import com.sanlly.production.dao.TeamEntryMapper;
import com.sanlly.production.dao.UnitCourseMapper;
import com.sanlly.production.dao.YardMapper;
import com.sanlly.production.dao.YardZoneMapper;
import com.sanlly.production.entity.CleaningNode;
import com.sanlly.production.entity.CleaningNodeExample;
import com.sanlly.production.entity.CleaningPattern;
import com.sanlly.production.entity.CleaningPatternExample;
import com.sanlly.production.entity.ContainerCleaning;
import com.sanlly.production.entity.ContainerCleaningExample;
import com.sanlly.production.entity.ContainerCleaningWithBLOBs;
import com.sanlly.production.entity.ContainerUser;
import com.sanlly.production.entity.ContainerUserExample;
import com.sanlly.production.entity.Course;
import com.sanlly.production.entity.CourseExample;
import com.sanlly.production.entity.OdorSpeciesExample;
import com.sanlly.production.entity.TeamEntry;
import com.sanlly.production.entity.UnitCourse;
import com.sanlly.production.entity.UnitCourseExample;
import com.sanlly.production.entity.YardExample;
import com.sanlly.production.entity.YardZone;
import com.sanlly.production.entity.YardZoneExample;
import com.sanlly.production.enums.CleaningPatternEnum;
import com.sanlly.production.enums.CleaningSourceEnum;
import com.sanlly.production.enums.CleaningStateEnum;
import com.sanlly.production.enums.ContainerCategoryEnum;
import com.sanlly.production.models.input.cleaning.CleaningAddInput;
import com.sanlly.production.models.input.cleaning.CleaningSearchInput;
import com.sanlly.production.models.output.cleaning.CleaningListOutput;
import com.sanlly.production.service.CleaningService;
import com.sanlly.production.service.FinanceService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 洗箱接口实现类
 * @author RexSheng
 * 2019年8月21日 下午4:57:45
 */
@Service
public class CleaningServiceImpl extends BaseServiceImpl implements CleaningService{

	@Autowired
	private CourseMapper courseDao;
	
	@Autowired
	private YardZoneMapper zoneDao;
	
	@Autowired
	private UnitCourseMapper unitCourseDao;
	
	@Autowired
	private ContainerCleaningMapper cleaningDao;
	
	@Autowired
	private TeamEntryMapper teamEntryDao;
	
	@Autowired
	private CleaningNodeMapper cleaningNodeDao;
	
	@Autowired
	private CleaningPatternMapper cleaningPatternDao;
	
	@Autowired
	private OdorSpeciesMapper flavorDao;
	
	@Autowired
	private YardMapper yardDao;
	
	//财务接口
	@Autowired
	private FinanceService financeClient;
	
	@Autowired
	private ContainerUserMapper containerUserDao;
	
	/**
	 * 获取异味种类列表
	 * @return
	 */
	@Override
	public List<SelectOutput> getFlavorList(){
		OdorSpeciesExample example=new OdorSpeciesExample();
		example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		Boolean isChinseRequest=isChineseRequest();
		return flavorDao.selectByExample(example).stream().map(a->{
			SelectOutput item=new SelectOutput();
			item.setValue(a.getKey());
			if(isChinseRequest) {
				item.setLabel(a.getOdorSpeciesName());
			}
			else {
				item.setLabel(a.getOdorSpeciesNameEn());
			}
			return item;
		}).collect(Collectors.toList());
		
	}
	
	/**
	 * 获取洗箱列表
	 */
	@Override
	public PagedList<CleaningListOutput> getPagedList(CleaningSearchInput input) {
		PagedList<CleaningListOutput> pagedList=new PagedList<CleaningListOutput>(input.getPageIndex(),input.getPageSize());
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
		int totalItemCount=(int)cleaningDao.countByExample(cleaningExample);
		pagedList.setTotalItemCount(totalItemCount);
		//洗箱分页
		cleaningExample.setLimitStart(pagedList.getLimitStart());
		cleaningExample.setLimitEnd(pagedList.getLimitEnd());
		cleaningExample.setOrderByClause("create_time desc");
		List<ContainerCleaningWithBLOBs> cleaningList=cleaningDao.selectByExampleWithBLOBs(cleaningExample);
		List<CleaningListOutput> outList=cleaningList.stream().map(a->{
			CleaningListOutput item=new CleaningListOutput();
			Course course=courseDao.selectByPrimaryKey(a.getCourseId());
			item.setCleaningId(a.getProdContainerCleaningId());
			item.setContainerNo(course.getContainerNo());
			item.setContainerTypeLang(course.getContainerType());
			item.setCourseTypeLang(course.getCourseType());
			item.setSizeLang(course.getSize());
			item.setYardLang(course.getYard());
			item.setCleaningPatternLang(a.getCleaningPattern());
			item.setCleaningStateLang(a.getCleaningState());
			item.setCleaningStateKey(a.getCleaningState());
			item.setFlavorKey(a.getOffFlavorType());
			//班组
			if(a.getTeamId()!=null) {
				TeamEntry team=teamEntryDao.selectByPrimaryKey(a.getTeamId());
				if(team!=null) {
					item.setTeam(team.getTeamName());
				}
			}
			item.setCleaningPhoto(a.getCleaningPhoto());
			item.setAuditPhoto(a.getAuditPhoto());
			item.setIsSpecial(a.getIsSpecial());
			//检验备注
			item.setRemarks(a.getTestingRemarks());
			//洗箱备注
			item.setCleaningRemarks(a.getRemarks());
			return item;
		}).collect(Collectors.toList());
		pagedList.setDataList(outList);
		return pagedList;
	}

	/**
	 * 设置为洗箱完工
	 */
	@Override
	public void setComplete(Integer[] cleaningIds) {

		if(cleaningIds!=null) {
			for(Integer cleaningId:cleaningIds) {
				ContainerCleaningWithBLOBs record= cleaningDao.selectByPrimaryKey(cleaningId);
				if(StringUtils.isNotEmpty(record.getCleaningState())) {
					if(!record.getCleaningState().equals(CleaningStateEnum.UNCLEANING.getCode())) {
						continue;
					}
				}
				if(StringUtils.isEmpty(record.getCleaningPhoto())) {
					throw new InvalidException("请先上传洗箱照片");
				}
				record.setCleaningState(CleaningStateEnum.UNAUDIT.getCode());
				//正常箱直接标记为已完工
				if(StringUtils.isNotEmpty(record.getIsSpecial())) {
					if(record.getIsSpecial().equals(CommonEnum.NO.getCode())) {
						record.setCleaningState(CleaningStateEnum.AUDITED.getCode());
					}
				}
				
				record.setUpdateTime(new Date());
				record.setUpdateUser(getCurrentUserId());
				cleaningDao.updateByPrimaryKeyWithBLOBs(record);
			}
		}
	}

	/**
	 * 洗箱审核
	 */
	@Override
	public void setAudited(Integer cleaningId,String photo) {
		if(cleaningId!=null) {
			ContainerCleaningWithBLOBs record= cleaningDao.selectByPrimaryKey(cleaningId);
			if(StringUtils.isNotEmpty(record.getCleaningState())) {
				if(record.getCleaningState().equals(CleaningStateEnum.UNAUDIT.getCode())) {
					record.setCleaningState(CleaningStateEnum.AUDITED.getCode());
				}
				else {
					return;
				}
				record.setAuditPhoto(photo);
				record.setAuditTime(new Date());
				record.setAuditUser(getCurrentUserId());
				
				record.setUpdateTime(new Date());
				record.setUpdateUser(getCurrentUserId());
				cleaningDao.updateByPrimaryKeyWithBLOBs(record);
			}
		}
	}

	/**
	 * 洗箱驳回
	 */
//	@Override
//	public void setRejected(Integer[] cleaningIds) {
//		if(cleaningIds!=null) {
//			for(Integer cleaningId:cleaningIds) {
//				ContainerCleaningWithBLOBs record= cleaningDao.selectByPrimaryKey(cleaningId);
//				if(StringUtils.isNotEmpty(record.getCleaningState())) {
//					if(record.getCleaningState().equals(CleaningStateEnum.UNAUDIT.getCode())) {
//						record.setCleaningState(CleaningStateEnum.REJECTED.getCode());
//					}
//					else if(record.getCleaningState().equals(CleaningStateEnum.AUDITED.getCode())) {
//						record.setCleaningState(CleaningStateEnum.REJECTED.getCode());
//					}
//					else {
//						continue;
//					}
//					record.setUpdateTime(new Date());
//					record.setUpdateUser(getCurrentUserId());
//					cleaningDao.updateByPrimaryKeyWithBLOBs(record);
//				}
//				
//			}
//		}
//	}
	
	/**
	 * 上传洗箱图片及异味种类，正常箱直接标记为完工已审核。特殊箱需要审核
	 * @param photo
	 * @param flavor
	 */
	@Override
	public void setPhotoAndFlavor(Integer cleaningId,String photo, String flavor,String isSepcial,String remark) {
		ContainerCleaningWithBLOBs record= cleaningDao.selectByPrimaryKey(cleaningId);
		if(!record.getCleaningState().equals(CleaningStateEnum.UNCLEANING.getCode())) {
			throw new InvalidException();
		}
		record.setCleaningPhoto(photo);
		record.setOffFlavorType(flavor);
		//特殊箱需要审核
		if(StringUtils.isNotEmpty(isSepcial) && isSepcial.equals(CommonEnum.YES.getCode())) {
			record.setIsSpecial(CommonEnum.YES.getCode());
			record.setCleaningState(CleaningStateEnum.UNAUDIT.getCode());
		}
		else {
			record.setIsSpecial(CommonEnum.NO.getCode());
			record.setCleaningState(CleaningStateEnum.AUDITED.getCode());
		}
		
		//洗箱时间
		record.setCleaningTime(new Date());
		//洗箱备注
		record.setRemarks(remark);
		record.setUpdateTime(new Date());
		record.setUpdateUser(getCurrentUserId());
		cleaningDao.updateByPrimaryKeyWithBLOBs(record);
	}
	
	/**
	 * 新增洗箱
	 * @param input
	 */
	@Override
	public void addCleaning(CleaningAddInput input) {
		//干箱，包含洗箱条目，检验审核时生成洗箱
		ContainerCleaningExample cleaningExample=new ContainerCleaningExample();
		cleaningExample.createCriteria().andCourseIdEqualTo(input.getCourseId());
		List<ContainerCleaning> cleaningList=cleaningDao.selectByExample(cleaningExample);
		if(cleaningList.size()>0) {
			return;
		}
		ContainerCleaningWithBLOBs record=new ContainerCleaningWithBLOBs();
		//进场
		Course course=courseDao.selectByPrimaryKey(input.getCourseId());
		//箱类别
		String containerCategory=input.getContainerCategory();
		//场站
		String yardKey=course.getYard();
		//公司
		YardExample yardExample=new YardExample();
		yardExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andKeyEqualTo(yardKey);
		String companyKey=yardDao.selectByExample(yardExample).get(0).getCompany();
		//用箱人
		String containerUserKey=course.getContainerUser();
		
		//洗箱来源依据
		String cleaningSourceKey=CleaningSourceEnum.ENTRY.getCode();
		if(input.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_01.getCode())) {
			
		}
		//冷箱，根据配置生成洗箱：1.包含洗箱条目，2暂存时
		else {
			//冷箱，判断洗箱模式是条目录入还是pti确认
			//根据公司和用箱人获取洗箱依据
			CleaningNodeExample cnExample=new CleaningNodeExample();
			cnExample.createCriteria()
			.andCompanyEqualTo(companyKey)
			.andContainerUserEqualTo(containerUserKey)
                    .andCleaningTypeEqualTo(input.getSource().getCode())
			.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
			List<CleaningNode> cnList=cleaningNodeDao.selectByExample(cnExample);
			if(cnList.size()==0) {
				return;
			}
            cleaningSourceKey = cnList.get(0).getCleaningType();
		}
		
		//洗箱模式key
		String cleaningPatternKey=null;
		//洗箱班组
		Integer teamId=null;
		//判断洗箱模式
		CleaningPatternExample cpExmaple=new CleaningPatternExample();
		cpExmaple.createCriteria()
		.andYardEqualTo(yardKey)
		.andContainerCategoryEqualTo(containerCategory)
		.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<CleaningPattern> cpList=cleaningPatternDao.selectByExample(cpExmaple);
		if(cpList.size()==0) {
			cpExmaple.createCriteria()
			.andCompanyEqualTo(companyKey)
			.andContainerCategoryEqualTo(containerCategory)
			.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
			cpList=cleaningPatternDao.selectByExample(cpExmaple);
			if(cpList.size()==0) {
				
			}
			else {
				cleaningPatternKey=cpList.get(0).getCleaningPattern();
				teamId=cpList.get(0).getTeam();
			}
		}
		else {
			cleaningPatternKey=cpList.get(0).getCleaningPattern();
			teamId=cpList.get(0).getTeam();
		}
		record.setCourseId(input.getCourseId());
		record.setSourceType(cleaningSourceKey);
		record.setCleaningPattern(cleaningPatternKey);
		record.setTeamId(teamId);
		record.setCleaningState(CleaningStateEnum.UNCLEANING.getCode());
		if(input.getIsSpecial()!=null) {
			record.setIsSpecial(input.getIsSpecial().getCode());
		}
		
		record.setTestingRemarks(course.getTestingRemarks());
		record.setCreateTime(new Date());
		record.setCreateUser(getCurrentUserId());
		cleaningDao.insert(record);
		//财务相关
		//只有外包才调用
		if(StringUtils.isNotEmpty(cleaningPatternKey) && 
				(cleaningPatternKey.equals(CleaningPatternEnum.OUT.getCode()) || cleaningPatternKey.equals(CleaningPatternEnum.SELF_OUT.getCode()))) {
			PoolOutSourceRepairInput financeInput=new PoolOutSourceRepairInput();
			financeInput.setCompanyKey(companyKey);
			ContainerUserExample cUserExample=new ContainerUserExample();
			cUserExample.createCriteria().andKeyEqualTo(course.getContainerUser());
			List<ContainerUser> userList=containerUserDao.selectByExample(cUserExample);
			if(!userList.isEmpty()) {
				financeInput.setContainerUserCode(userList.get(0).getContainerUserCode());
				financeInput.setProdCourseId(input.getCourseId());
				financeInput.setYard(course.getYard());
				financeInput.setContainerUser(course.getContainerUser());
				financeClient.wbFinishedRepair(financeInput);
			}
		}
		
		
	}
	
	/**
	 * 完工补充照片
	 */
	@Override
	public void setCompletePhoto(Integer cleaningId, String photo) {
		if(cleaningId!=null) {
			ContainerCleaningWithBLOBs record= cleaningDao.selectByPrimaryKey(cleaningId);
			
			record.setCleaningPhoto(photo);
			record.setUpdateTime(new Date());
			record.setUpdateUser(getCurrentUserId());
			cleaningDao.updateByPrimaryKeyWithBLOBs(record);
		}
	}
}
