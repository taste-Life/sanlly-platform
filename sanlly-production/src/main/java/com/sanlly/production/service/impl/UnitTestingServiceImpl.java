package com.sanlly.production.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.enums.CommonEnum;
import com.sanlly.common.enums.ResultCodeEnum;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.SelectOutput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.models.output.user.UserInfoOutput;
import com.sanlly.production.dao.CourseEntryMapper;
import com.sanlly.production.dao.CourseMapper;
import com.sanlly.production.dao.FieldRequiredMapper;
import com.sanlly.production.dao.UnitCourseMapper;
import com.sanlly.production.dao.UnitMapper;
import com.sanlly.production.dao.UnitTypeMapper;
import com.sanlly.production.dao.YardMapper;
import com.sanlly.production.dao.YardZoneMapper;
import com.sanlly.production.entity.Course;
import com.sanlly.production.entity.CourseEntry;
import com.sanlly.production.entity.CourseEntryExample;
import com.sanlly.production.entity.CourseExample;
import com.sanlly.production.entity.CourseWithBLOBs;
import com.sanlly.production.entity.FieldRequired;
import com.sanlly.production.entity.FieldRequiredExample;
import com.sanlly.production.entity.Unit;
import com.sanlly.production.entity.UnitCourse;
import com.sanlly.production.entity.UnitCourseExample;
import com.sanlly.production.entity.UnitCourseWithBLOBs;
import com.sanlly.production.entity.UnitExample;
import com.sanlly.production.entity.UnitType;
import com.sanlly.production.entity.UnitTypeExample;
import com.sanlly.production.entity.Yard;
import com.sanlly.production.entity.YardExample;
import com.sanlly.production.entity.YardZone;
import com.sanlly.production.entity.YardZoneExample;
import com.sanlly.production.enums.AuditTypeEnum;
import com.sanlly.production.enums.ContainerCategoryEnum;
import com.sanlly.production.enums.PtiTypeEnum;
import com.sanlly.production.enums.ReferralStateEnum;
import com.sanlly.production.enums.ReferralTypeEnum;
import com.sanlly.production.enums.ReplyStateEnum;
import com.sanlly.production.enums.TestingStateEnum;
import com.sanlly.production.enums.UnitStateEnum;
import com.sanlly.production.enums.ZoneTypeEnum;
import com.sanlly.production.models.input.containerTesting.SetContainerStateInput;
import com.sanlly.production.models.input.unitTesting.AuditUnitInput;
import com.sanlly.production.models.input.unitTesting.PreFixSearchInput;
import com.sanlly.production.models.input.unitTesting.SetUnitStateInput;
import com.sanlly.production.models.input.unitTesting.UnitBasicAddInput;
import com.sanlly.production.models.input.unitTesting.UnitTestingSearchInput;
import com.sanlly.production.models.input.unitTesting.UpdateUnitZoneInput;
import com.sanlly.production.models.output.unitTesting.PreFixOutput;
import com.sanlly.production.models.output.unitTesting.SetUnitStateOutput;
import com.sanlly.production.models.output.unitTesting.UnitBasicDetailOutput;
import com.sanlly.production.models.output.unitTesting.UnitTestingListOutput;
import com.sanlly.production.service.AuthService;
import com.sanlly.production.service.CourseKeyRuleService;
import com.sanlly.production.service.UnitTestingService;
import com.sanlly.production.service.XxService;

/**
 * 机组检验接口实现类
 * 
 * @author RexSheng 2019年8月12日 下午4:56:39
 */
@Service
public class UnitTestingServiceImpl extends BaseServiceImpl implements UnitTestingService {

	/**
	 * 进场key规则
	 */
	@Autowired
	private CourseKeyRuleService ruleService;

	/**
	 * 箱子进场表
	 */
	@Autowired
	private CourseMapper courseDao;

	/**
	 * 机组进场表
	 */
	@Autowired
	private UnitCourseMapper unitCourseDao;

	/**
	 * 进场检验条目表
	 */
	@Autowired
	private CourseEntryMapper courseEntryDao;

	/**
	 * 用户查询
	 */
	@Autowired
	private AuthService authClient;

	/**
	 * 机组基础信息
	 */
	@Autowired
	private UnitMapper unitDao;

	/**
	 * 选填字段表
	 */
	@Autowired
	private FieldRequiredMapper fieldDao;

	/**
	 * 场站区位表
	 */
	@Autowired
	private YardZoneMapper zoneDao;

	@Autowired
	private YardMapper yardDao;

	@Autowired
	private XxService ptiService;

	@Autowired
	private UnitTypeMapper unitTypeMapper;

	/**
	 * 机组检验列表
	 */
	@Override
	public PagedList<UnitTestingListOutput> getPageList(UnitTestingSearchInput input) throws ParseException {
		CourseExample courseExample = new CourseExample();
		CourseExample.Criteria criteria = courseExample.createCriteria();

		UnitCourseExample unitCourseExample = new UnitCourseExample();
		UnitCourseExample.Criteria unitCriteria = unitCourseExample.createCriteria();
		SimpleDateFormat dateSdf = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		SimpleDateFormat minuteSdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		if (StringUtils.isNotEmpty(input.getStartDate())) {
			Date startDate = dateSdf.parse(input.getStartDate());
			unitCriteria.andTestingTimeGreaterThanOrEqualTo(startDate);
		}
		if (StringUtils.isNotEmpty(input.getEndDate())) {
			Date endDate = minuteSdf.parse(input.getEndDate() +" 23:59:59");
			unitCriteria.andTestingTimeLessThanOrEqualTo(endDate);
		}

		// 场站搜索
		String yardKey = getCurrentYardKey();
		if (StringUtils.isNotEmpty(yardKey)) {
			criteria.andYardEqualTo(yardKey);
		}
		if (StringUtils.isNotEmpty(input.getContainerNo())) {
			criteria.andContainerNoLike("%" + input.getContainerNo() + "%");
		}
		// 用箱人
		if (StringUtils.isNotEmpty(input.getContainerUser())) {
			criteria.andContainerUserEqualTo(input.getContainerUser());
		}
		// 用箱人
		if (StringUtils.isNotEmpty(input.getContainerOwner())) {
			criteria.andContainerOwnerEqualTo(input.getContainerOwner());
		}
		// 退租箱
		if (StringUtils.isNotEmpty(input.getIsSurrender()) && input.getIsSurrender().equals(CommonEnum.YES.getCode())) {
			criteria.andIsSurrenderEqualTo(input.getIsSurrender());
		}
		else {
			criteria.andIsSurrenderIfNullNotEqualTo(CommonEnum.YES.getCode(), "");
		}
		// 是否预检区
		if (input.getPreZone() != null && input.getPreZone().equals(true)) {
			// 预检区内
			unitCriteria.andIsPreviewIsNotNull().andIsPreviewEqualTo(CommonEnum.YES.getCode());

			// 区位搜索
			if (StringUtils.isNotEmpty(input.getZone())) {
				YardZoneExample zoneExample = new YardZoneExample();
				YardZoneExample.Criteria zoneCriteria = zoneExample.createCriteria();
				zoneCriteria.andZoneTypeEqualTo(ZoneTypeEnum.PRE_ZONE.getCode())
						.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
				if (StringUtils.isNotEmpty(yardKey)) {
					// zoneCriteria.andYardEqualTo(yardKey);
				}
				zoneCriteria.andZoneCodeLike("%" + input.getZone() + "%");
				List<YardZone> zoneList = zoneDao.selectByExample(zoneExample);
				if (zoneList.size() == 0) {
					return new PagedList<>(input.getPageIndex(), input.getPageSize());
				}
				unitCriteria.andZoneIn(zoneList.stream().map(a -> a.getKey()).collect(Collectors.toList()));
			}

		}
		else if (input.getPreZone() != null && input.getPreZone().equals(false)) {
			// 预检区内
			unitCriteria.andIsPreviewIfNullNotEqualTo(CommonEnum.YES.getCode(), "");
			
			// 区位搜索
			if (StringUtils.isNotEmpty(input.getZone())) {
				YardZoneExample zoneExample = new YardZoneExample();
				YardZoneExample.Criteria zoneCriteria = zoneExample.createCriteria();
				zoneCriteria.andZoneTypeEqualTo(ZoneTypeEnum.PRE_ZONE.getCode())
						.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
				if (StringUtils.isNotEmpty(yardKey)) {
					// zoneCriteria.andYardEqualTo(yardKey);
				}
				zoneCriteria.andZoneCodeLike("%" + input.getZone() + "%");
				List<YardZone> zoneList = zoneDao.selectByExample(zoneExample);
				if (zoneList.size() == 0) {
					return new PagedList<>(input.getPageIndex(), input.getPageSize());
				}
				unitCriteria.andZoneIn(zoneList.stream().map(a -> a.getKey()).collect(Collectors.toList()));
			}

		} else {
			if (StringUtils.isNotEmpty(input.getZone())) {
				YardZoneExample zoneExample = new YardZoneExample();
				YardZoneExample.Criteria zoneCriteria = zoneExample.createCriteria();
				zoneCriteria.andZoneTypeEqualTo(ZoneTypeEnum.PRE_ZONE.getCode())
				.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
				zoneCriteria.andZoneCodeLike("%" + input.getZone() + "%");
				if (StringUtils.isNotEmpty(yardKey)) {
					// zoneCriteria.andYardEqualTo(yardKey);
				}
				List<YardZone> zoneList = zoneDao.selectByExample(zoneExample);
				if (zoneList.size() == 0) {
					return new PagedList<>(input.getPageIndex(), input.getPageSize());
				}
				unitCriteria.andZoneIn(zoneList.stream().map(a -> a.getKey()).collect(Collectors.toList()));
			}
		}
		// 进场类别
		if (StringUtils.isNotEmpty(input.getCourseType())) {
			criteria.andCourseTypeEqualTo(input.getCourseType());
		}
		// 机组状态
		if (input.getUnitState() == null || input.getUnitState().length == 0) {

		} else {
			unitCriteria.andUnitStateIn(Arrays.asList(input.getUnitState()));
		}
		// 检验状态
		if (input.getTestingState() != null && input.getTestingState().length > 0) {
			unitCriteria.andTestingStateIn(Arrays.asList(input.getTestingState()));
		}
		// 关联箱体进场
		List<Course> courseList = courseDao.selectByExample(courseExample);
		if (courseList.size() == 0) {
			return new PagedList<>(input.getPageIndex(), input.getPageSize());
		}
		unitCriteria.andProdCourseIdIn(courseList.stream().map(a -> a.getProdCourseId()).collect(Collectors.toList()));
		// 执行分页查询
		int totalItemCount = (int) unitCourseDao.countByExample(unitCourseExample);
		PagedList<UnitTestingListOutput> pagedList = new PagedList<UnitTestingListOutput>(input.getPageIndex(),
				input.getPageSize(), totalItemCount);
		unitCourseExample.setLimitStart(pagedList.getLimitStart());
		unitCourseExample.setLimitEnd(pagedList.getLimitEnd());
		unitCourseExample.setOrderByClause("create_time desc");
		List<UnitCourse> unitCourseList = unitCourseDao.selectByExample(unitCourseExample);
		List<UnitTestingListOutput> outputList = unitCourseList.stream().map(a -> {
			UnitTestingListOutput item = new UnitTestingListOutput();
			// 进场id
			item.setProdCourseId(a.getProdCourseId());
			// 箱号
			item.setContainerNo(a.getContainerNo());
			// 区位
			item.setZoneLang(a.getZone());
			Course course = courseDao.selectByPrimaryKey(a.getProdCourseId());
			if (course != null) {
				// 尺寸
				item.setSizeLang(course.getSize());
				// 箱型
				item.setContainerTypeLang(course.getContainerType());
				// 用箱人
				item.setContainerUserLang(course.getContainerUser());
				// 箱东
				item.setContainerOwnerLang(course.getContainerOwner());
				// 进场场站
				item.setYardLang(course.getYard());
				// 进场类别
				item.setCourseTypeLang(course.getCourseType());
				// 进场时间
				if (course.getCourseTime() != null) {
					item.setCourseTime(minuteSdf.format(course.getCourseTime()));
				}
				// 箱况
				item.setContainerConditionLang(course.getContainerCondition());
				// 箱体检验状态
				item.setTestingStateLang(course.getTestingState());

			}
			// 机组状态
			item.setUnitStateLang(a.getUnitState());
			item.setUnitStateKey(a.getUnitState());
			// 机组检验状态
			item.setUnitTestingStateLang(a.getTestingState());
			item.setUnitTestingStateKey(a.getTestingState());
			if (StringUtils.isNotEmpty(a.getTestingState())) {
				TestingStateEnum enums = TestingStateEnum.convertToEnum(a.getTestingState());
				item.setStatus(enums.toString());
			}
			// 机组检验人
			if (a.getTestingUser() != null) {
				Result<UserInfoOutput> rlt = authClient.getUserDetail(a.getTestingUser());
				if (rlt != null && rlt.getCode().equals(ResultCodeEnum.SUCCESS.getCode())) {
					UserInfoOutput user = rlt.getData();
					if (user != null) {
						item.setTestingUser(user.getUserName());
					}
				}
			}
			if (a.getTestingTime() != null) {
				// 机组检验时间
				item.setTestingTime(sdf.format(a.getTestingTime()));
			}
			// 是否预检区修理
			item.setIsPreviewLang(a.getIsPreview());
			// 检验备注
			item.setTestingRemarks(a.getTestingRemarks());

			return item;
		}).collect(Collectors.toList());
		pagedList.setDataList(outputList);
		return pagedList;
	}

	/**
	 * 批量设置好机组
	 */
	@Override
	@Transactional
	public SetUnitStateOutput setUnitStateGood(SetUnitStateInput input) {
		SetUnitStateOutput output = new SetUnitStateOutput();

		List<String> containerNoList = new ArrayList<>();
		List<String> successCourseIdList = new ArrayList<>();
		if (input.getProdCourseIdList() != null && input.getProdCourseIdList().length > 0) {
			for (String courseId : input.getProdCourseIdList()) {
				UnitCourseWithBLOBs record = unitCourseDao.selectByPrimaryKey(courseId);
				// 设置好机组
				// 待检验、检验中、待审核、已驳回的进场可设置为好机组，已审核的不能设置为好机组
				// 设置为好机组时，如果有检验条目，需提示客户端：删除条目
				// 设置为好机组后，检验状态都变为已审核。
				// 已审核，不能设置为好机组
				if (StringUtils.isNotEmpty(record.getTestingState())) {
					if (record.getTestingState().equals(TestingStateEnum.AUDITED.getCode())) {
						continue;
					}
				}
				if (StringUtils.isNotEmpty(record.getUnitState())) {
					if (record.getUnitState().equals(UnitStateEnum.GOOD.getCode())) {
						// 已经是好机组，无需再次设置
						continue;
					}
				}

				// 检查条目数量
				CourseEntryExample eExample = new CourseEntryExample();
				eExample.createCriteria().andContainerCategoryEqualTo(ContainerCategoryEnum.CONTAINER_03.getCode())
						.andCourseEqualTo(courseId).andIsDelEqualTo(PlatformConstants.ISDEL_NO);
				long entryCount = courseEntryDao.countByExample(eExample);
				if (entryCount > 0) {
					// 坏机组转为好机组需要提醒删除条目
					containerNoList.add(record.getContainerNo());
					continue;
				}
				// 设置为好机组
				record.setUnitState(UnitStateEnum.GOOD.getCode());
				// 设置为已审核
				record.setTestingState(TestingStateEnum.AUDITED.getCode());
				record.setUpdateTime(new Date());
				record.setUpdateUser(getCurrentUserId());
				unitCourseDao.updateByPrimaryKey(record);
				successCourseIdList.add(courseId);
				ptiService.createPtiInfo(null, record);
			}
		}
		output.setDelContainerNo(containerNoList.toArray(new String[containerNoList.size()]));
		output.setCourseId(successCourseIdList.toArray(new String[successCourseIdList.size()]));
		return output;
	}

	/**
	 * 批量设置坏机组
	 */
	@Override
	public SetUnitStateOutput setUnitStateBad(SetUnitStateInput input) {
		SetUnitStateOutput output = new SetUnitStateOutput();

		List<String> containerNoList = new ArrayList<>();
		if (input.getProdCourseIdList() != null && input.getProdCourseIdList().length > 0) {
			for (String courseId : input.getProdCourseIdList()) {
				UnitCourseWithBLOBs record = unitCourseDao.selectByPrimaryKey(courseId);
				// 待检验、检验中、待审核、已审核、已驳回的进场可设置为坏机组，检验状态变为检验中
				if (StringUtils.isNotEmpty(record.getUnitState())) {
					if (record.getUnitState().equals(UnitStateEnum.BAD.getCode())) {
						// 已经是坏机组，无需再次设置
						continue;
					}
				}
				record.setUnitState(UnitStateEnum.BAD.getCode());
				record.setTestingState(TestingStateEnum.TESTING.getCode());
				record.setUpdateTime(new Date());
				record.setUpdateUser(getCurrentUserId());
				unitCourseDao.updateByPrimaryKey(record);
				ptiService.createPtiInfo(null, record);
			}
		}
		output.setDelContainerNo(containerNoList.toArray(new String[containerNoList.size()]));
		return output;
	}

	/**
	 * 提交检验
	 */
	@Override
	public SetUnitStateOutput submitUnitTesting(SetUnitStateInput input) {
		SetUnitStateOutput output = new SetUnitStateOutput();
		List<String> containerNoList = new ArrayList<>();
		List<String> successCourseIdList = new ArrayList<>();
		List<String> needPhotoContainerNoList = new ArrayList<>();
		if (input.getProdCourseIdList() != null && input.getProdCourseIdList().length > 0) {
			for(String courseId:input.getProdCourseIdList()) {
				UnitCourseWithBLOBs record =unitCourseDao.selectByPrimaryKey(courseId);
				if(StringUtils.isEmpty(record.getUnitState())) {
					continue;
				}
				//坏机组必须有条目
				if(StringUtils.isNotEmpty(record.getUnitState()) && record.getUnitState().equals(UnitStateEnum.BAD.getCode())) {
					CourseEntryExample entryExample=new CourseEntryExample();
					entryExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andCourseEqualTo(courseId)
					.andContainerCategoryEqualTo(ContainerCategoryEnum.CONTAINER_03.getCode());
					
					if(courseEntryDao.countByExample(entryExample)==0) {
						containerNoList.add(record.getContainerNo());
						continue;
					}
					else {
						Boolean ok=true;
						for(CourseEntry entry:courseEntryDao.selectByExampleWithBLOBs(entryExample)) {
							if(entry.getIsMustPhoto()!=null && entry.getIsMustPhoto().equals(CommonEnum.YES.getCode())) {
								if(StringUtils.isEmpty(entry.getPhoto())){
									needPhotoContainerNoList.add(record.getContainerNo());
									ok=false;
									break;
								}
								if(entry.getPhoto().equals("[]")){
									needPhotoContainerNoList.add(record.getContainerNo());
									ok=false;
									break;
								}
							}
						};
						if(!ok) {
							continue;
						}
					}
				}
				
				
				record.setTestingState(TestingStateEnum.UNAUDIT.getCode());
				record.setUpdateTime(new Date());
				record.setUpdateUser(getCurrentUserId());
				unitCourseDao.updateByPrimaryKey(record);
				successCourseIdList.add(courseId);
			}
		}
		output.setDelContainerNo(containerNoList.toArray(new String[containerNoList.size()]));
		output.setCourseId(successCourseIdList.toArray(new String[successCourseIdList.size()]));
		output.setNeedPhotoContainerNo(needPhotoContainerNoList.toArray(new String[needPhotoContainerNoList.size()]));
		return output;
	}

	/**
	 *  
	 * 
	 * @Description: TODO Container检验标为待审核
	 * @param input void @throws 
	 */
	@Override
	public void remarkAsUnAudit(SetContainerStateInput input) {
		if (input != null && input.getProdCourseIdList().length > 0) {
			// 批量更新内容
			UnitCourseWithBLOBs record = new UnitCourseWithBLOBs();
			record.setTestingState(TestingStateEnum.UNAUDIT.getCode());
			record.setUpdateTime(new Date());
			record.setUpdateUser(getCurrentUserId());
			// 批量更新条件
			UnitCourseExample example = new UnitCourseExample();
			example.createCriteria().andProdCourseIdIn(Arrays.asList(input.getProdCourseIdList()));
			unitCourseDao.updateByExampleSelective(record, example);
		}
	}
	
	/**
	 * 检验通过
	 */
	@Override
	public void approveUnitTesting(AuditUnitInput input) {
		if (input != null && input.getProdCourseIdList().length > 0
				&& (!TestingStateEnum.AUDITED.getCode().equals(input.getAuditType())
						|| TestingStateEnum.REJECTED.getCode().equals(input.getAuditType()))) {
			// 批量更新内容
			UnitCourseWithBLOBs record = new UnitCourseWithBLOBs();
			record.setTestingState(input.getAuditType());
			record.setTestingEndTime(new Date());
			record.setTestingReject(input.getReason());
			record.setAuditTime(new Date());
			record.setAuditUser(getCurrentUserId());
			record.setAuditType(AuditTypeEnum.AuditTypeEnum_01.getCode());
			record.setUpdateTime(new Date());
			record.setUpdateUser(getCurrentUserId());
			// 批量更新条件
			UnitCourseExample example = new UnitCourseExample();
			example.createCriteria().andProdCourseIdIn(Arrays.asList(input.getProdCourseIdList()));
			unitCourseDao.updateByExampleSelective(record, example);
		}
	}

	/**
	 * 根据进场id获取机组基础信息
	 */
	@Override
	public UnitBasicDetailOutput getUnitBasicInfo(String courseId) {
		UnitBasicDetailOutput output = new UnitBasicDetailOutput();
		if (StringUtils.isNotEmpty(courseId)) {
			UnitCourseWithBLOBs unitCourse = unitCourseDao.selectByPrimaryKey(courseId);
			// 如果有进场信息
			if (unitCourse != null) {
				// 进场id
				output.setProdCourseId(courseId);
				// 机型
				output.setUnitType(unitCourse.getUnitType());
				// 冷机公司
				output.setUnitCompany(unitCourse.getUnitCompany());
				// 序列号
				output.setUnitCode(unitCourse.getUnitCode());
				// 启用日期yyyyMM
				output.setStartDate(unitCourse.getStartDate());
				// 湿度是否可调
				output.setIsHumidity(unitCourse.getIsHumidity());
				// 通风是否可调
				output.setIsVentilation(unitCourse.getIsVentilation());
				// 火焰测试
				output.setIsFireTest(unitCourse.getIsFireTest());
				// pti类型
				output.setPtiType(unitCourse.getPtiType());
				// 机组状态
				output.setUnitState(unitCourse.getUnitState());
				output.setUnitStateNameLang(unitCourse.getUnitState());
				// 预检区修理
				output.setIsPreview(unitCourse.getIsPreview());
				// 检验人
				output.setTestingUser(unitCourse.getTestingUser());
				// 检验时间
				if (unitCourse.getTestingTime() != null) {
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
					output.setTestingTime(sdf.format(unitCourse.getTestingTime()));
				}
				// 检验状态
				output.setTestingState(unitCourse.getTestingState());
				output.setTestingStateNameLang(unitCourse.getTestingState());
				// 机组照片
				if (StringUtils.isNotEmpty(unitCourse.getUnitPhoto())) {
					output.setUnitPhoto(unitCourse.getUnitPhoto());
				}
				// 检验备注
				output.setTestingRemarks(unitCourse.getTestingRemarks());
				// 报价币种
				output.setValuationCurrency(unitCourse.getValuationCurrency());
				//
				output.setUseReplyState(unitCourse.getUseReplyState());
				output.setMasterReplyState(unitCourse.getMasterReplyState());
				// 自定义信息：
				output.setCompressor(unitCourse.getCompressor());
				output.setControl(unitCourse.getControl());
				output.setSoftwareVersion(unitCourse.getSoftwareVersion());
				output.setIsCa(unitCourse.getIsCa());
				output.setSubstrateCode(unitCourse.getSubstrateCode());
				output.setReferralState(unitCourse.getReferralState());
				output.setReferralStateNameLang(unitCourse.getReferralState());
				

				Course course = courseDao.selectByPrimaryKey(courseId);
				FieldRequiredExample frExample = new FieldRequiredExample();
				frExample.createCriteria().andYardEqualTo(course.getYard());
				List<FieldRequired> fieldList = fieldDao.selectByExample(frExample);
				// 可显示的字段名称
				output.setAllowedFields(fieldList.stream().map(a -> a.getField()).toArray(String[]::new));
			}
		} else {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
			output.setTestingTime(sdf.format(new Date()));
			output.setTestingUser(getCurrentUserId());
			FieldRequiredExample frExample = new FieldRequiredExample();
			frExample.createCriteria().andYardEqualTo(getCurrentYardKey());
			List<FieldRequired> fieldList = fieldDao.selectByExample(frExample);
			// 可显示的字段名称
			output.setAllowedFields(fieldList.stream().map(a -> a.getField()).toArray(String[]::new));
		}
		return output;
	}

	/**
	 * 根据箱号获取机组基础信息
	 */
	@Override
	public UnitBasicDetailOutput getUnitBasicInfoByContainerNo(String containerNo) {
		UnitBasicDetailOutput output = new UnitBasicDetailOutput();
		// 机组状态
		output.setUnitState(UnitStateEnum.UNKNOWN.getCode());

		// 基础信息：
		UnitExample uExample = new UnitExample();
		uExample.createCriteria().andContainerNoEqualTo(containerNo);
		List<Unit> unitList = unitDao.selectByExample(uExample);
		if (unitList.size() > 0) {
			Unit unit = unitList.get(0);
			// 进场id
			output.setProdCourseId(null);
			// 机型
			output.setUnitType(unit.getUnitType());
			// 冷机公司
			output.setUnitCompany(unit.getUnitCompany());
			// 序列号
			output.setUnitCode(unit.getUnitCode());
			// 启用日期yyyyMM
			output.setStartDate(unit.getStartDate());
			// 湿度是否可调
			output.setIsHumidity(null);
			// 通风是否可调
			output.setIsVentilation(null);
			// 火焰测试
			output.setIsFireTest(null);
			// pti类型
			output.setPtiType(null);

			// 预检区修理
			output.setIsPreview(null);
			// 检验人
			output.setTestingUser(null);
			// 检验时间
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
			output.setTestingTime(sdf.format(new Date()));
			// 检验状态
			output.setTestingState(TestingStateEnum.UNAUDIT.getCode());
			// 自定义信息：
			output.setCompressor(unit.getCompressor());
			output.setControl(unit.getControl());
			output.setSoftwareVersion(unit.getSoftwareVersion());
			output.setIsCa(unit.getIsCa());
			output.setSubstrateCode(unit.getSubstrateCode());
			String yardKey = getCurrentYardKey();
			if (StringUtils.isNotEmpty(yardKey)) {
				FieldRequiredExample frExample = new FieldRequiredExample();
				frExample.createCriteria().andYardEqualTo(yardKey);
				List<FieldRequired> fieldList = fieldDao.selectByExample(frExample);
				// 可显示的字段名称
				output.setAllowedFields(fieldList.stream().map(a -> a.getField()).toArray(String[]::new));
			} else {
				output.setAllowedFields(new String[0]);
			}
		}
		return output;
	}

	/**
	 * 录入机组基础信息
	 */
	@Override
	@Transactional
	public void updateUnitBasicInfo(UnitBasicAddInput input) throws ParseException {
		// 有进场记录，更新进场记录表
		UnitCourseWithBLOBs unitCourse = null;
		boolean isExist = false;
		if (StringUtils.isNotEmpty(input.getProdCourseId())) {
			unitCourse = unitCourseDao.selectByPrimaryKey(input.getProdCourseId());
		}
		if (unitCourse == null) {
			isExist = false;
			unitCourse = new UnitCourseWithBLOBs();
		} else {
			isExist = true;
		}
		// 机型
		unitCourse.setUnitType(input.getUnitType());
		// 冷机公司
		unitCourse.setUnitCompany(input.getUnitCompany());
		// 序列号
		unitCourse.setUnitCode(input.getUnitCode());
		// 启用日期yyyyMM
		unitCourse.setStartDate(input.getStartDate());
		// 湿度是否可调
		unitCourse.setIsHumidity(input.getIsHumidity());
		// 通风是否可调
		unitCourse.setIsVentilation(input.getIsVentilation());
		// 火焰测试
		unitCourse.setIsFireTest(input.getIsFireTest());
		// pti类型
		unitCourse.setPtiType(input.getPtiType());
		// 机组状态
		unitCourse.setUnitState(input.getUnitState());
		if (StringUtils.isEmpty(unitCourse.getUnitState())) {
			unitCourse.setUnitState(UnitStateEnum.UNKNOWN.getCode());
		}
		// 预检区修理
//		unitCourse.setPreviewState(input.getPreviewState());
		unitCourse.setIsPreview(input.getIsPreview());
		// 检验人
		unitCourse.setTestingUser(input.getTestingUser());
		// 检验时间
		if (input.getTestingTime() != null) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
			unitCourse.setTestingTime(sdf.parse(input.getTestingTime()));
		}
		// 检验备注
		unitCourse.setTestingRemarks(input.getTestingRemarks());
		// 机组照片
		unitCourse.setUnitPhoto(input.getUnitPhoto());
		// 自定义信息：
		unitCourse.setCompressor(input.getCompressor());
		unitCourse.setControl(input.getControl());
		unitCourse.setSoftwareVersion(input.getSoftwareVersion());
		unitCourse.setIsCa(input.getIsCa());
		unitCourse.setSubstrateCode(input.getSubstrateCode());
		if (unitCourse.getCreateTime() == null) {
			unitCourse.setCreateTime(new Date());
		}
		if (unitCourse.getCreateUser() == null) {
			unitCourse.setCreateUser(getCurrentUserId());
		}
		if (UnitStateEnum.UNKNOWN.getCode().equals(input.getUnitState())) {
			unitCourse.setTestingState(TestingStateEnum.UNTEST.getCode());
		} else if (UnitStateEnum.GOOD.getCode().equals(input.getUnitState())) {
			unitCourse.setTestingState(TestingStateEnum.AUDITED.getCode());
		} else {
			if (StringUtils.isBlank(unitCourse.getTestingState())
					|| TestingStateEnum.REJECTED.getCode().equals(unitCourse.getTestingState())
					|| TestingStateEnum.UNTEST.getCode().equals(unitCourse.getTestingState())) {
				unitCourse.setTestingState(TestingStateEnum.TESTING.getCode());
			}
		}
		if (StringUtils.isEmpty(unitCourse.getTestingState())) {
			unitCourse.setTestingState(TestingStateEnum.UNTEST.getCode());
		}
		if (StringUtils.isEmpty(unitCourse.getIsVentilation())) {
			unitCourse.setIsVentilation(CommonEnum.YES.getCode());
		}
		if (StringUtils.isNotEmpty(input.getAfterPhoto())) {
			unitCourse.setAfterPhoto(input.getAfterPhoto());
		}
		if (isExist) {
			unitCourseDao.updateByPrimaryKeyWithBLOBs(unitCourse);
		} else {
			if (unitCourse.getTestingTime() == null) {
				unitCourse.setTestingTime(new Date());
			}
			if (StringUtils.isNotEmpty(input.getProdCourseId())) {
				unitCourse.setProdCourseId(input.getProdCourseId());
			} else {
				String courseId = ruleService.generateCourseKey(input.getContainerNo());
				unitCourse.setProdCourseId(courseId);
			}

			unitCourse.setContainerNo(input.getContainerNo());
			unitCourseDao.insert(unitCourse);
		}

		// 更新基础信息表
		UnitExample uExample = new UnitExample();
		uExample.createCriteria().andContainerNoEqualTo(input.getContainerNo());
		List<Unit> unitList = unitDao.selectByExample(uExample);
		Unit unit = null;
		if (unitList.size() > 0) {
			unit = unitList.get(0);
			unit.setContainerNo(input.getContainerNo());
			unit.setUnitType(input.getUnitType());
			unit.setUnitCompany(input.getUnitCompany());
			unit.setUnitCode(input.getUnitCode());
			unit.setStartDate(input.getStartDate());
			unit.setCompressor(input.getCompressor());
			unit.setControl(input.getControl());
			unit.setSoftwareVersion(input.getSoftwareVersion());
			unit.setIsCa(input.getIsCa());
			unit.setSubstrateCode(input.getSubstrateCode());
			unit.setUpdateTime(new Date());
			unit.setUpdateUser(input.getTestingUser());
			unitDao.updateByPrimaryKey(unit);
		} else {
			unit = new Unit();
			unit.setProdUnitId(ruleService.generateContainerId(input.getContainerNo()));
			unit.setContainerNo(input.getContainerNo());
			unit.setUnitType(input.getUnitType());
			unit.setUnitCompany(input.getUnitCompany());
			unit.setUnitCode(input.getUnitCode());
			unit.setStartDate(input.getStartDate());
			unit.setCompressor(input.getCompressor());
			unit.setControl(input.getControl());
			unit.setSoftwareVersion(input.getSoftwareVersion());
			unit.setIsCa(input.getIsCa());
			unit.setSubstrateCode(input.getSubstrateCode());
			unit.setCreateTime(new Date());
			unit.setCreateUser(input.getTestingUser());
			unitDao.insert(unit);
		}
	}

	/**
	 * 修改机组预检区区位
	 */
	@Override
	public void updateZone(UpdateUnitZoneInput input) {
		if (input.getCourseIds() != null && input.getCourseIds().length > 0) {
			UnitCourseExample example = new UnitCourseExample();
			example.createCriteria().andProdCourseIdIn(Arrays.asList(input.getCourseIds()));
			UnitCourseWithBLOBs record = new UnitCourseWithBLOBs();
			record.setZone(input.getCodeKey());
			unitCourseDao.updateByExampleSelective(record, example);
		}
	}

	/**
	 * 根据进场id获取同一公司下的场站列表
	 * 
	 * @param courseId
	 * @return
	 */
	@Override
	public List<SelectOutput> getCompanyYardsByCourse(String courseId) {
		Course course = courseDao.selectByPrimaryKey(courseId);
		YardExample yardExample = new YardExample();
		yardExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andKeyEqualTo(course.getYard());
		Yard yard = yardDao.selectByExample(yardExample).get(0);
		// 获取公司的key
		String companyKey = yard.getCompany();
		yardExample = new YardExample();
		yardExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andCompanyEqualTo(companyKey);
		List<Yard> yardList = yardDao.selectByExample(yardExample);
		Boolean isChineseReq = isChineseRequest();
		return yardList.stream().filter(a -> Arrays.asList(getPermittedYardKeys()).contains(a.getKey())).map(a -> {
			SelectOutput item = new SelectOutput();
			if (isChineseReq) {
				item.setLabel(a.getYardName());
			} else {
				item.setLabel(a.getYardNameEn());
			}
			item.setValue(a.getKey());
			return item;
		}).collect(Collectors.toList());
	}

	/**
	 * 根据场站key获取对应的必填字段
	 */
	@Override
	public List<String> getFieldListByYard(String yardKey) {
		FieldRequiredExample frExample = new FieldRequiredExample();
		frExample.createCriteria().andYardEqualTo(yardKey);
		List<FieldRequired> fieldList = fieldDao.selectByExample(frExample);
		// 可显示的字段名称
		return fieldList.stream().map(a -> a.getField()).collect(Collectors.toList());
	}

	/**
	 * 先修列表
	 * 
	 * @param input
	 * @return
	 */
	@Override
	public PagedList<PreFixOutput> getPreFixPagedList(PreFixSearchInput input) {
		PagedList<PreFixOutput> pagedList = new PagedList<PreFixOutput>(input.getPageIndex(), input.getPageSize());
		CourseExample courseExample = new CourseExample();
		CourseExample.Criteria courseCriteria = courseExample.createCriteria();
		// 箱体
		courseCriteria.andContainerCategoryEqualTo(ContainerCategoryEnum.CONTAINER_02.getCode());
		// 已派工
		courseCriteria.andReferralStateEqualTo(ReferralStateEnum.REFERRALED.getCode());
		// 不包含自动派工
		courseCriteria.andReferralTypeNotEqualTo(ReferralTypeEnum.AUTOMATIC.getCode());
		// 箱号
		if (StringUtils.isNotEmpty(input.getContainerNo())) {
			courseCriteria.andContainerNoLike("%" + input.getContainerNo() + "%");
		}
		// 区位
		if (StringUtils.isNotEmpty(input.getZone())) {
			YardZoneExample zoneExample = new YardZoneExample();
			zoneExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
					.andZoneCodeLike("%" + input.getZone() + "%");
			List<YardZone> zoneList = zoneDao.selectByExample(zoneExample);
			if (zoneList.isEmpty()) {
				return pagedList;
			}
			UnitCourseExample unitCourseExample = new UnitCourseExample();
			unitCourseExample.createCriteria()
					.andZoneIn(zoneList.stream().map(a -> a.getKey()).collect(Collectors.toList()));
			List<UnitCourse> unitCourseList = unitCourseDao.selectByExample(unitCourseExample);
			if (unitCourseList.isEmpty()) {
				return pagedList;
			}
			courseCriteria.andProdCourseIdIn(
					unitCourseList.stream().map(a -> a.getProdCourseId()).collect(Collectors.toList()));
		}
		int totalItemCount = (int) courseDao.countByExample(courseExample);
		pagedList.setTotalItemCount(totalItemCount);
		courseExample.setLimitStart(pagedList.getLimitStart());
		courseExample.setLimitEnd(pagedList.getLimitEnd());
		List<Course> courseList = courseDao.selectByExample(courseExample);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		List<PreFixOutput> dataList = courseList.stream().map(a -> {
			PreFixOutput item = new PreFixOutput();
			item.setProdCourseId(a.getProdCourseId());
			item.setContainerNo(a.getContainerNo());
			UnitCourse unitCourse = unitCourseDao.selectByPrimaryKey(a.getProdCourseId());
			if (unitCourse != null) {
				item.setZoneLang(unitCourse.getZone());
				item.setUnitStateLang(unitCourse.getUnitState());
				item.setUnitStateKey(unitCourse.getUnitState());
			}
			item.setContainerUserLang(a.getContainerUser());
			item.setSizeLang(a.getSize());
			item.setContainerTypeLang(a.getContainerType());
			if (a.getCourseTime() != null) {
				item.setEntryDate(sdf.format(a.getCourseTime()));
			}
			// 进场类别
			item.setEntryStateLang(a.getCourseType());
			return item;
		}).collect(Collectors.toList());
		pagedList.setDataList(dataList);
		return pagedList;
	}

	/**
	 * 删除没有条目的机组进场
	 * 
	 * @param courseId
	 * @throws Exception
	 */
	@Override
	public void unitDeLete(String courseId) throws Exception {
		if (StringUtils.isNotBlank(courseId)) {
			CourseEntryExample example = new CourseEntryExample();
			example.createCriteria().andCourseEqualTo(courseId)
					.andContainerCategoryEqualTo(ContainerCategoryEnum.CONTAINER_03.getCode())
					.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
			long count = courseEntryDao.countByExample(example);
			if (count > 0) {
				throw new Exception();
			} else {
				unitCourseDao.deleteByPrimaryKey(courseId);
			}
		}

	}

	/**
	 * 仓储适用机型获取
	 * 
	 * @param code
	 * @return
	 */
	@Override
	public List<String> getUnitToWare(String code) {
		UnitTypeExample example = new UnitTypeExample();
		UnitTypeExample.Criteria criteria = example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		criteria.andIsValidEqualTo(1);
		criteria.andUnitTypeCodeEqualTo(code);
		List<UnitType> unitTypes = unitTypeMapper.selectByExample(example);
		List<String> output = new ArrayList<>();
		for (UnitType unitType : unitTypes) {
			output.add(unitType.getUnitTypeScope());
		}
		return output;
	}

	/**
	 *  
	 * 
	 * @Description: TODO
	 * @param inputs 获取某种状态的进场数据 @throws 
	 */
	@Override
	public List<String> selectCourseByTestingState(String[] prodCourseIdList, String[] testingStateList) throws Exception {
		if (testingStateList == null || prodCourseIdList == null
				|| prodCourseIdList.length <= 0) {
			return new ArrayList<String>();
		}
		UnitCourseExample example = new UnitCourseExample();
		example.createCriteria().andProdCourseIdIn(Arrays.asList(prodCourseIdList))
				.andTestingStateIn(Arrays.asList(testingStateList));
		List<UnitCourse> courses = unitCourseDao.selectByExample(example);
		return courses.stream().map(a -> a.getProdCourseId()).collect(Collectors.toList());
	}

	/**
	 * 标记不做PTI
	 */
	@Override
	public void remarkNotPti(String[] courseIds) {
		UnitCourseWithBLOBs record=new UnitCourseWithBLOBs();
		record.setPtiType(PtiTypeEnum.NOTDO.getCode());
		
		UnitCourseExample example=new UnitCourseExample();
		example.createCriteria().andProdCourseIdIn(Arrays.asList(courseIds));
		
		unitCourseDao.updateByExampleSelective(record, example);
	}
}
