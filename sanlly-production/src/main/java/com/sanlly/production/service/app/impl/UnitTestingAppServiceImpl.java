package com.sanlly.production.service.app.impl;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.enums.CommonEnum;
import com.sanlly.common.enums.OriginalRepairEnum;
import com.sanlly.common.enums.ResultCodeEnum;
import com.sanlly.common.enums.SystemTypeEnum;
import com.sanlly.common.models.exception.AuthorizationException;
import com.sanlly.common.models.exception.InvalidException;
import com.sanlly.common.models.input.spare.SearchTestingSpareInput;
import com.sanlly.common.models.input.user.LoginInput;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.base.ContainerUserOutput;
import com.sanlly.common.models.output.company.CompanyDetailOutput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.models.output.spare.SpareTestingOutput;
import com.sanlly.common.models.output.stock.StockOutput;
import com.sanlly.common.models.output.stock.WareOutput;
import com.sanlly.common.models.output.user.LoginOutput;
import com.sanlly.common.models.output.user.UserInfoOutput;
import com.sanlly.common.utils.StringUtil;
import com.sanlly.production.dao.CompanyMapper;
import com.sanlly.production.dao.ContainerMapper;
import com.sanlly.production.dao.CourseEntryMapper;
import com.sanlly.production.dao.CourseMapper;
import com.sanlly.production.dao.EvaluationEntryMapper;
import com.sanlly.production.dao.FieldRequiredMapper;
import com.sanlly.production.dao.PartsTypeMapper;
import com.sanlly.production.dao.PtiTypeMapper;
import com.sanlly.production.dao.QualityReworkMapper;
import com.sanlly.production.dao.ReferralEntryMapper;
import com.sanlly.production.dao.UnitAddSparesMapper;
import com.sanlly.production.dao.UnitCompanyMapper;
import com.sanlly.production.dao.UnitCourseMapper;
import com.sanlly.production.dao.UnitRepairEntryMapper;
import com.sanlly.production.dao.UnitRepairMapper;
import com.sanlly.production.dao.UnitTypeMapper;
import com.sanlly.production.dao.YardMapper;
import com.sanlly.production.dao.YardZoneMapper;
import com.sanlly.production.entity.Company;
import com.sanlly.production.entity.CompanyExample;
import com.sanlly.production.entity.Container;
import com.sanlly.production.entity.ContainerExample;
import com.sanlly.production.entity.Course;
import com.sanlly.production.entity.CourseEntry;
import com.sanlly.production.entity.CourseEntryExample;
import com.sanlly.production.entity.CourseExample;
import com.sanlly.production.entity.CourseWithBLOBs;
import com.sanlly.production.entity.EvaluationEntry;
import com.sanlly.production.entity.EvaluationEntryExample;
import com.sanlly.production.entity.FieldRequired;
import com.sanlly.production.entity.FieldRequiredExample;
import com.sanlly.production.entity.PartsType;
import com.sanlly.production.entity.PartsTypeExample;
import com.sanlly.production.entity.PtiType;
import com.sanlly.production.entity.PtiTypeExample;
import com.sanlly.production.entity.QualityRework;
import com.sanlly.production.entity.QualityReworkExample;
import com.sanlly.production.entity.ReferralEntry;
import com.sanlly.production.entity.ReferralEntryExample;
import com.sanlly.production.entity.UnitAddSpares;
import com.sanlly.production.entity.UnitCompany;
import com.sanlly.production.entity.UnitCompanyExample;
import com.sanlly.production.entity.UnitCourse;
import com.sanlly.production.entity.UnitCourseExample;
import com.sanlly.production.entity.UnitCourseWithBLOBs;
import com.sanlly.production.entity.UnitRepair;
import com.sanlly.production.entity.UnitRepairEntry;
import com.sanlly.production.entity.UnitRepairEntryExample;
import com.sanlly.production.entity.UnitRepairExample;
import com.sanlly.production.entity.UnitType;
import com.sanlly.production.entity.UnitTypeExample;
import com.sanlly.production.entity.Yard;
import com.sanlly.production.entity.YardExample;
import com.sanlly.production.entity.YardZone;
import com.sanlly.production.entity.YardZoneExample;
import com.sanlly.production.enums.ContainerCategoryEnum;
import com.sanlly.production.enums.ContainerStateEnum;
import com.sanlly.production.enums.ReferralStateEnum;
import com.sanlly.production.enums.ReferralTypeEnum;
import com.sanlly.production.enums.SpareStockModuleEnum;
import com.sanlly.production.enums.TestingStateEnum;
import com.sanlly.production.enums.UnitStateEnum;
import com.sanlly.production.enums.ZoneTypeEnum;
import com.sanlly.production.models.input.app.login.AppLoginInput;
import com.sanlly.production.models.input.app.partsType.PartsTypeSearchInput;
import com.sanlly.production.models.input.app.spare.AddSpareInput;
import com.sanlly.production.models.input.app.spare.SearchSpareInput;
import com.sanlly.production.models.input.app.spare.SpareStockInput;
import com.sanlly.production.models.input.app.unitTesting.AddUnitInfoInput;
import com.sanlly.production.models.input.app.unitTesting.PreReferralSearchInput;
import com.sanlly.production.models.input.app.unitTesting.SetContainerInfoInput;
import com.sanlly.production.models.input.app.unitTesting.SetUnitStateInput;
import com.sanlly.production.models.input.app.unitTesting.SetUnitZoneInput;
import com.sanlly.production.models.input.app.unitTesting.SubmitTestingEntryInput;
import com.sanlly.production.models.input.app.unitTesting.SubmitTestingInput;
import com.sanlly.production.models.input.app.unitTesting.UnitTestingHistoryInput;
import com.sanlly.production.models.input.app.unitTesting.UnitTestingSearchInput;
import com.sanlly.production.models.output.app.company.CompanyLoginOutput;
import com.sanlly.production.models.output.app.login.AppLoginOutput;
import com.sanlly.production.models.output.app.login.ContainerAuth;
import com.sanlly.production.models.output.app.login.ContainerBasic;
import com.sanlly.production.models.output.app.login.OtherAuth;
import com.sanlly.production.models.output.app.login.QualityAuth;
import com.sanlly.production.models.output.app.partsType.PartsTypeOutput;
import com.sanlly.production.models.output.app.pti.PtiTypeDetailOutpput;
import com.sanlly.production.models.output.app.repair.RelationRepairEntryOutput;
import com.sanlly.production.models.output.app.repair.RelationRepairOutput;
import com.sanlly.production.models.output.app.spare.SparePartDetailOutput;
import com.sanlly.production.models.output.app.spare.SpareStockListOutput;
import com.sanlly.production.models.output.app.spare.SpareStockOutput;
import com.sanlly.production.models.output.app.unitCompany.UnitCompanyOutput;
import com.sanlly.production.models.output.app.unitCompany.UnitTypeOutput;
import com.sanlly.production.models.output.app.unitTesting.CourseEntryOutput;
import com.sanlly.production.models.output.app.unitTesting.CourseOutput;
import com.sanlly.production.models.output.app.unitTesting.PreReferralListOutput;
import com.sanlly.production.models.output.app.unitTesting.UnitTestingDetailOutput;
import com.sanlly.production.models.output.app.unitTesting.UnitTestingHistoryEntryOutput;
import com.sanlly.production.models.output.app.unitTesting.UnitTestingHistoryOutput;
import com.sanlly.production.models.output.app.yard.YardLoginOutput;
import com.sanlly.production.models.output.app.zone.ZoneDetailOutput;
import com.sanlly.production.models.output.guarantee.MaintenanceBatchOutput;
import com.sanlly.production.service.AuthService;
import com.sanlly.production.service.ContainerTestingService;
import com.sanlly.production.service.ContainerUserService;
import com.sanlly.production.service.CourseKeyRuleService;
import com.sanlly.production.service.MaintenanceService;
import com.sanlly.production.service.WarehouseClient;
import com.sanlly.production.service.XxService;
import com.sanlly.production.service.app.UnitTestingAppService;

/**
 * 机组检验-app接口实现
 * 
 * @author RexSheng 2019年8月12日 上午10:24:46
 */
@Service
public class UnitTestingAppServiceImpl extends BaseAppServiceImpl implements UnitTestingAppService {

	/**
	 * 进场key规则
	 */
	@Autowired
	private CourseKeyRuleService ruleService;

	/**
	 * 仓储调用客户端
	 */
	@Autowired
	private WarehouseClient wareClient;

	/**
	 * 用户调用客户端
	 */
	@Autowired
	private AuthService authClient;

	/**
	 * 机组进场表
	 */
	@Autowired
	private UnitCourseMapper unitCourseDao;

	/**
	 * 箱体进场表
	 */
	@Autowired
	private CourseMapper courseDao;

	/**
	 * 场站区位表
	 */
	@Autowired
	private YardZoneMapper zoneDao;

	/**
	 * 箱子基础表
	 */
	@Autowired
	private ContainerMapper containerDao;

	/**
	 * 保修基础表
	 */
	@Autowired
	private MaintenanceService maintenanceService;

	/**
	 * 部件大类表
	 */
	@Autowired
	private PartsTypeMapper partsTypeDao;

	/**
	 * 部件明细
	 */
//	@Autowired
//	private PartsDetailsMapper partsDetailDao;

	/**
	 * 相关修理表
	 */
	@Autowired
	private UnitRepairMapper relationRepairDao;

	/**
	 * 相关修理明细表
	 */
	@Autowired
	private UnitRepairEntryMapper repairEntryDao;

	/**
	 * 新增备件表
	 */
	@Autowired
	private UnitAddSparesMapper addSpareDao;

	/**
	 * 进场检验条目表
	 */
	@Autowired
	private CourseEntryMapper courseEntryDao;

	/**
	 * 冷机公司表
	 */
	@Autowired
	private UnitCompanyMapper unitCompanyDao;

	/**
	 * 机组类型表
	 */
	@Autowired
	private UnitTypeMapper unitTypeDao;

	/**
	 * 公司表
	 */
	@Autowired
	private CompanyMapper companyDao;

	/**
	 * 场站表
	 */
	@Autowired
	private YardMapper yardDao;

	/**
	 * 可选基础信息字段表
	 */
	@Autowired
	private FieldRequiredMapper fieldRequiredDao;

	/**
	 * 估价条目表
	 */
	@Autowired
	private EvaluationEntryMapper evaluationEntryDao;

	/**
	 * 派工条目表
	 */
	@Autowired
	private ReferralEntryMapper referralEntryDao;

	/**
	 * 质检返工记录表
	 */
	@Autowired
	private QualityReworkMapper qualityReworkDao;

	@Autowired
	private PtiTypeMapper ptiTypeDao;

	@Autowired
	private XxService ptiService;

	@Autowired
	private ContainerTestingService containerTestingService;

	@Autowired
	private ContainerUserService containerUserService;

	/**
	 * 机组检验分页列表
	 */
	@Override
	public PagedList<UnitTestingDetailOutput> unitTestingList(UnitTestingSearchInput input) {
		PagedList<UnitTestingDetailOutput> pagedList = new PagedList<UnitTestingDetailOutput>(input.getIndex(),
				input.getSize());
		UnitCourseExample example = new UnitCourseExample();
		UnitCourseExample.Criteria criteria = example.createCriteria();
		if (StringUtils.isNotEmpty(input.getTestingState())) {
			if (input.getTestingState().equals("OVER")) {
				criteria.andTestingStateIn(Arrays.asList(TestingStateEnum.UNAUDIT.getCode(),
						TestingStateEnum.AUDITED.getCode(), TestingStateEnum.REJECTED.getCode()));
			} else {
				criteria.andTestingStateEqualTo(input.getTestingState());
			}
		}
		if (StringUtils.isNotEmpty(input.getAuditType())) {
			criteria.andTestingStateEqualTo(input.getAuditType());
		}
		// 区位
		if (StringUtils.isNotEmpty(input.getZone())) {
			YardZoneExample zoneExample = new YardZoneExample();
			zoneExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
					.andZoneCodeLike("%" + input.getZone() + "%");
			List<YardZone> zoneList = zoneDao.selectByExample(zoneExample);
			if (zoneList.size() == 0) {
				return pagedList;
			}
			criteria.andZoneIn(zoneList.stream().map(a -> a.getKey()).collect(Collectors.toList()));
		}
		// 箱号
		if (StringUtils.isNotEmpty(input.getContainerNo())) {
			CourseExample courseExample = new CourseExample();
			courseExample.createCriteria().andContainerNoLike("%" + input.getContainerNo() + "%");
			courseExample.setOrderByClause("course_time desc");
			List<Course> courseList = courseDao.selectByExample(courseExample);
			if (courseList.size() == 0) {
				return pagedList;
			}
			criteria.andProdCourseIdIn(courseList.stream().map(a -> a.getProdCourseId()).collect(Collectors.toList()));
		}
		// 机组状态
		if (StringUtils.isNotEmpty(input.getUnitState())) {
			criteria.andUnitStateEqualTo(input.getUnitState());
		}
		// 场站
		criteria.andYardEqualTo(getCurrentYardKey());
		int totalItemCount = (int) unitCourseDao.countByExample(example);
		pagedList.setTotalItemCount(totalItemCount);
		example.setLimitStart(pagedList.getLimitStart());
		example.setLimitEnd(pagedList.getLimitEnd());
		example.setOrderByClause("create_time desc");
		List<UnitCourseWithBLOBs> dataList = unitCourseDao.selectByExampleWithBLOBs(example);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat timeSdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		List<UnitTestingDetailOutput> list = dataList.stream().map(record -> {
			UnitTestingDetailOutput item = new UnitTestingDetailOutput();
			// 进场id
			item.setProdCourseId(record.getProdCourseId());
			Course course = courseDao.selectByPrimaryKey(record.getProdCourseId());
			if (course != null) {
				// 箱号
				item.setContainerNo(course.getContainerNo());
				// 用箱人
				item.setContainerUserLang(course.getContainerUser());
				item.setContainerUserKey(course.getContainerUser());
				// 保修提醒
				List<String> maintenanceList = null;
				try {
					List<MaintenanceBatchOutput> mbCodeList = maintenanceService
							.matchBatchMaintenance(item.getContainerNo(), record.getUnitCode());
					maintenanceList = mbCodeList.stream().map(MaintenanceBatchOutput::getCode)
							.collect(Collectors.toList());
				} catch (Exception e) {
					// TODO: handle exception
				}
				if (maintenanceList != null) {
					item.setMaintenanceNum(String.join("&", maintenanceList));
				}
				// 箱子备注
				item.setRemark(course.getTestingRemarks());
				// 箱况
				item.setContainerConditionLang(course.getContainerCondition());
				// 进场时间，暂用箱子进场时间
				if (course.getCourseTime() != null) {

					item.setEntryDate(timeSdf.format(course.getCourseTime()));
				}
				// 箱体估价金额
				if (course.getValuationMoney() != null) {
					item.setContainerValuation(String.valueOf(course.getValuationMoney()));
				}
				if(StringUtils.isNotEmpty(course.getIsSurrender())) {
					item.setIsSurrender(course.getIsSurrender());
				}
				else {
					item.setIsSurrender(CommonEnum.NO.getCode());
				}
				
			}

			if (StringUtils.isNotEmpty(record.getZone())) {
				YardZoneExample zoneExample = new YardZoneExample();
				zoneExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
						.andKeyEqualTo(record.getZone());
				List<YardZone> zoneList = zoneDao.selectByExample(zoneExample);
				if (zoneList.size() > 0) {
					// 区位
					item.setZone(zoneList.get(0).getZoneCode());
				}
			}
			if (record.getTestingTime() != null) {
				item.setTestDate(sdf.format(record.getTestingTime()));
			}
			// 检验状态
			item.setAuditTypeLang(record.getTestingState());
			// 审核状态
			item.setUnitStateLang(record.getUnitState());
			// 冷机公司
			item.setUnitCompanyLang(record.getUnitCompany());
			item.setUnitCompanyKey(record.getUnitCompany());
			// 机型
			item.setUnitTypeLang(record.getUnitType());
			item.setUnitTypeKey(record.getUnitType());
			// 序列号
			item.setUnitCode(record.getUnitCode());
			// 启用日期
			item.setStartDate(record.getStartDate());
			// 可调湿度
			item.setIsHumidityLang(record.getIsHumidity());
			// 可调通风
			item.setIsVentilationLang(record.getIsVentilation());
			// 火焰测试通过
			item.setIsFireTestLang(record.getIsFireTest());
			// 是否ca箱
			item.setIsCALang(record.getIsCa());
			// PTI类型
			item.setPtiTypeLang(record.getPtiType());
			item.setPtiTypeKey(record.getPtiType());
			// 机组照片
			item.setUnitPhoto(record.getUnitPhoto());
			// 压缩机
			item.setCompressor(record.getCompressor());
			// 控制器
			item.setControl(record.getControl());
			// 软件版本
			item.setSoftwareVersion(record.getSoftwareVersion());
			// 基板序列号
			item.setSubstrateCode(record.getSubstrateCode());
			// 是否预检区修理
			if (StringUtils.isNotEmpty(record.getIsPreview())) {
				item.setIsPreview(record.getIsPreview());
			} else {
				item.setIsPreview(CommonEnum.NO.getCode());
			}
			if (record.getTestingUser() != null) {
				Result<UserInfoOutput> rlt = authClient.getUserDetail(record.getTestingUser());
				if (rlt != null && rlt.getCode().equals(ResultCodeEnum.SUCCESS.getCode())) {
					UserInfoOutput user = rlt.getData();
					if (user != null) {
						item.setCheckUser(user.getUserName());
					}
				}
			}
			CourseEntryExample entryExample = new CourseEntryExample();
			entryExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
					.andCourseEqualTo(record.getProdCourseId())
					.andContainerCategoryEqualTo(ContainerCategoryEnum.CONTAINER_03.getCode());
			item.setEntryCount((int) courseEntryDao.countByExample(entryExample));
			// 机组检验备注
			item.setUnitRemark(record.getTestingRemarks());
			return item;
		}).collect(Collectors.toList());
		pagedList.setDataList(list);
		return pagedList;
	}

	/**
	 * 获取区位列表
	 */
	@Override
	public List<ZoneDetailOutput> getZoneList(String yardKey) {
		YardZoneExample example = new YardZoneExample();
		YardZoneExample.Criteria criteria = example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO).andIsValidEqualTo(PlatformConstants.ISVALID_YES)
				.andZoneTypeEqualTo(ZoneTypeEnum.PRE_ZONE.getCode());
		if (StringUtils.isNotEmpty(yardKey)) {
			criteria.andYardEqualTo(yardKey);
		}
		List<YardZone> zoneList = zoneDao.selectByExample(example);
		List<ZoneDetailOutput> dataList = zoneList.stream().map(record -> {
			ZoneDetailOutput item = new ZoneDetailOutput();
			item.setZoneId(record.getKey());
			item.setZoneCode(record.getZoneCode());
			return item;
		}).collect(Collectors.toList());
		return dataList;
	}

	/**
	 * 设置机组状态-好机组，坏机组
	 */
	@Override
	@Transactional
	public String setUnitState(SetUnitStateInput input) {
		String message = "";
		if (StringUtils.isNotEmpty(input.getUnitState()) && input.getProdCourseIdList() != null
				&& input.getProdCourseIdList().length > 0) {
			for (String courseId : input.getProdCourseIdList()) {
				UnitCourseWithBLOBs record = unitCourseDao.selectByPrimaryKey(courseId);
				// 设置好机组
				// 待检验、检验中、待审核、已驳回的进场可设置为好机组，已审核的不能设置为好机组
				// 设置为好机组时，如果有检验条目，需提示客户端：删除条目
				// 设置为好机组后，检验状态都变为已审核。
				if (input.getUnitState().equals(UnitStateEnum.GOOD.getCode())) {
					// 已审核，不能设置为好机组
					if (StringUtils.isNotEmpty(record.getTestingState())) {
						if (record.getTestingState().equals(TestingStateEnum.AUDITED.getCode())) {
							continue;
						}
					}
//					if (StringUtils.isNotEmpty(record.getUnitState())) {
//						if (record.getUnitState().equals(UnitStateEnum.GOOD.getCode())) {
//							// 已经是好机组，无需再次设置
//							continue;
//						}
//					}

					// 检查条目数量
					CourseEntryExample eExample = new CourseEntryExample();
					eExample.createCriteria().andCourseEqualTo(courseId)
					.andContainerCategoryEqualTo(ContainerCategoryEnum.CONTAINER_03.getCode()).andIsDelEqualTo(PlatformConstants.ISDEL_NO);
					long entryCount = courseEntryDao.countByExample(eExample);
					if (entryCount > 0) {
						// 坏机组转为好机组需要提醒删除条目
						message = PlatformConstants.MESSAGE_DEL_ENTRY;
						continue;
					}
					// 设置为好机组
					record.setUnitState(UnitStateEnum.GOOD.getCode());
					// 设置为已审核
					record.setTestingState(TestingStateEnum.AUDITED.getCode());
					record.setUpdateTime(new Date());
					record.setUpdateUser(getCurrentUserId());
					unitCourseDao.updateByPrimaryKey(record);

					ptiService.createPtiInfo(null, record);
				}
				// 设置坏机组
				else if (input.getUnitState().equals(UnitStateEnum.BAD.getCode())) {
					// 待检验、检验中、待审核、已审核、已驳回的进场可设置为坏机组，检验状态变为检验中
//					if (StringUtils.isNotEmpty(record.getUnitState())) {
//						if (record.getUnitState().equals(UnitStateEnum.BAD.getCode())) {
//							// 已经是坏机组，无需再次设置
//							continue;
//						}
//					}
					record.setUnitState(UnitStateEnum.BAD.getCode());
					if (StringUtils.isBlank(record.getTestingState())
							|| TestingStateEnum.REJECTED.getCode().equals(record.getTestingState())
							|| TestingStateEnum.UNTEST.getCode().equals(record.getTestingState())
							|| TestingStateEnum.AUDITED.getCode().equals(record.getTestingState())) {
						record.setTestingState(TestingStateEnum.TESTING.getCode());
					}
					record.setUpdateTime(new Date());
					record.setUpdateUser(getCurrentUserId());
					unitCourseDao.updateByPrimaryKey(record);
					ptiService.createPtiInfo(null, record);
				}
			}
		}
		return message;
	}

	@Override
	public void setUnitZone(SetUnitZoneInput input) {
		if (StringUtils.isNotEmpty(input.getZone()) && input.getProdCourseIdList() != null
				&& input.getProdCourseIdList().length > 0) {
			UnitCourseWithBLOBs record = new UnitCourseWithBLOBs();
			record.setZone(input.getZone());
			record.setUpdateTime(new Date());
			record.setUpdateUser(getCurrentUserId());
			// 设置条件
			UnitCourseExample example = new UnitCourseExample();
			example.createCriteria().andProdCourseIdIn(Arrays.asList(input.getProdCourseIdList()));

			unitCourseDao.updateByExampleSelective(record, example);
		}
	}

	/**
	 * 补录箱子信息
	 * 
	 * @param input
	 * @throws Exception
	 */
	@Override
	@Transactional
	public String setContainerInfo(SetContainerInfoInput input) throws Exception {
		// 箱子进场信息
		CourseWithBLOBs course = new CourseWithBLOBs();
		String courseId = ruleService.generateCourseKey(input.getContainerNo());
		course.setProdCourseId(courseId);
		course.setContainerNo(input.getContainerNo());
		// 箱型
		course.setContainerType(input.getContainerType());
		course.setContainerCategory(ContainerCategoryEnum.CONTAINER_02.getCode());
		course.setSize(input.getSize());
		course.setContainerUser(input.getContainerUser());
		// 进场类别
		course.setCourseType(input.getEntryType());
		// 进场场站
		course.setYard(input.getYardId());
		// 箱况,默认未知
		course.setContainerCondition(ContainerStateEnum.UNKNOWN.getCode());
		// 进场时间
		course.setCourseTime(new Date());
		// 检验状态
		course.setTestingState(TestingStateEnum.UNTEST.getCode());
		// 创建人
		course.setCreateTime(new Date());
		// 创建时间
		course.setCreateUser(getCurrentUserId());
		// 保存
		courseDao.insert(course);
		if (CommonEnum.YES.getCode().equals(course.getIsSurrender())) {
			containerTestingService.containerSurrender(course.getProdCourseId());
		}

		// 机组进场
		UnitCourseWithBLOBs unitCourse = new UnitCourseWithBLOBs();
		unitCourse.setProdCourseId(courseId);
		unitCourse.setContainerNo(input.getContainerNo());
		unitCourse.setContainerType(course.getContainerType());
		unitCourse.setContainerUser(course.getContainerUser());
		unitCourse.setSize(course.getSize());
		unitCourse.setCourseType(course.getCourseType());
		unitCourse.setYard(course.getYard());
		unitCourse.setZone(input.getZone());
		unitCourse.setTestingState(TestingStateEnum.UNTEST.getCode());
		// 机组状态
		unitCourse.setUnitState(UnitStateEnum.UNKNOWN.getCode());
		// 派工状态
		unitCourse.setReferralState(ReferralStateEnum.UNREFERRAL.getCode());
		// 默认可调通风// hanli
		unitCourse.setIsVentilation(CommonEnum.YES.getCode());
		// 创建人
		unitCourse.setCreateTime(new Date());
		// 创建时间
		unitCourse.setCreateUser(getCurrentUserId());
		// 保存
		unitCourseDao.insert(unitCourse);

		// 箱子基础信息表
		ContainerExample containerExample = new ContainerExample();
		containerExample.createCriteria().andContainerNoEqualTo(input.getContainerNo());
		List<Container> containerList = containerDao.selectByExample(containerExample);
		if (containerList.size() > 0) {
			Container container = containerList.get(0);
			container.setContainerNo(input.getContainerNo());
			container.setContainerType(input.getContainerType());
			container.setSize(input.getSize());
			containerDao.updateByExample(container, containerExample);
		} else {
			Container container = new Container();
			// 设置箱号id
			container.setProdContainerId(ruleService.generateContainerId(input.getContainerNo()));
			container.setContainerNo(input.getContainerNo());
			container.setContainerType(input.getContainerType());
			container.setSize(input.getSize());
			containerDao.insert(container);
		}
		return courseId;
	}

	/**
	 * 机组初录
	 * 
	 * @param input
	 */
	@Override
	public void addUnitInfo(AddUnitInfoInput input) {

		UnitCourseWithBLOBs unitCourse = unitCourseDao.selectByPrimaryKey(input.getProdCourseId());
		// 机型
		unitCourse.setUnitType(input.getUnitType());
		// 冷机公司
		unitCourse.setUnitCompany(input.getUnitCompany());
		// 序列号
		unitCourse.setUnitCode(input.getUnitCode());
		// 启用日期
		unitCourse.setStartDate(input.getStartDate());
		// 是否可调湿度
		unitCourse.setIsHumidity(input.getIsHumidity());
		// 通风
		unitCourse.setIsVentilation(input.getIsVentilation());
		// 火焰测试
		unitCourse.setIsFireTest(input.getIsFireTest());
		// 是否ca
		unitCourse.setIsCa(input.getIsCA());
		// pti类型
		unitCourse.setPtiType(input.getPtiType());
		// 照片
		unitCourse.setUnitPhoto(input.getUnitPhoto());
		// 机组状态
		unitCourse.setUnitState(input.getUnitState());
		// 压缩机
		unitCourse.setCompressor(input.getCompressor());
		// 控制器
		unitCourse.setControl(input.getControl());
		// 软件版本
		unitCourse.setSoftwareVersion(input.getSoftwareVersion());
		// 基板序列号
		unitCourse.setSubstrateCode(input.getSubstrateCode());
		// 检验时间
		unitCourse.setTestingTime(new Date());
		// 机组检验备注
		unitCourse.setTestingRemarks(input.getUnitRemark());

		// 检验状态
		if (StringUtils.isEmpty(unitCourse.getTestingState())) {
			unitCourse.setTestingState(TestingStateEnum.UNTEST.getCode());
		}
		unitCourse.setUpdateTime(new Date());
		unitCourse.setUpdateUser(getCurrentUserId());
		// 保存
		unitCourseDao.updateByPrimaryKeyWithBLOBs(unitCourse);

	}

	@Override
	public List<PartsTypeOutput> getPartsTypeList(PartsTypeSearchInput input) {
		PartsTypeExample example = new PartsTypeExample();
		PartsTypeExample.Criteria criteria = example.createCriteria();
		PartsTypeExample.Criteria criteria2 = example.createCriteria();
		if (StringUtils.isNotEmpty(input.getPartsTypeSearch())) {
			criteria.andPartsTypeCodeLike("%" + input.getPartsTypeSearch() + "%");
			if (isChineseRequest()) {
				criteria2.andPartsTypeNameLike("%" + input.getPartsTypeSearch() + "%");
			} else {
				criteria2.andPartsTypeNameEnLike("%" + input.getPartsTypeSearch() + "%");
			}
		}
		example.or(criteria2);
		List<PartsType> partsTypeList = partsTypeDao.selectByExample(example);
		List<PartsTypeOutput> output = partsTypeList.stream().map(a -> {
			PartsTypeOutput item = new PartsTypeOutput();
			item.setPartsTypeCode(a.getPartsTypeCode());
			item.setPartsTypeNameLang(a.getKey());
			item.setPartsTypeKey(a.getKey());
			return item;
		}).collect(Collectors.toList());
		return output;
	}

	/**
	 *
	 */
	@Override
	public List<RelationRepairOutput> getRelationRepairList() {
		UnitRepairExample example = new UnitRepairExample();
		example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<UnitRepair> relationRepairList = relationRepairDao.selectByExample(example);

		UnitRepairEntryExample entryExample = new UnitRepairEntryExample();
		entryExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<UnitRepairEntry> repairEntryList = repairEntryDao.selectByExample(entryExample);
		return relationRepairList.stream().map(a -> {
			RelationRepairOutput item = new RelationRepairOutput();
			item.setRepaireCode(a.getRepairCode());
			item.setRepaireName(a.getRepairName());

			RelationRepairEntryOutput[] entryList = repairEntryList.stream()
					.filter(e -> e.getUnitRepair().equals(a.getProdUnitRepairId())).map(e -> {
						RelationRepairEntryOutput entry = new RelationRepairEntryOutput();
						// 部件大类
						entry.setPartsTypeCode(e.getPartsTypeCode());
						entry.setPartsTypeNameLang(e.getPartsTypeCode());
						// 部件明细
						entry.setPartsDetailCode(e.getPartsDetailsCode());
						entry.setPartsDetailNameLang(e.getPartsDetailsCode());

						// 损坏代码
						entry.setDamageCode(e.getDamageCode());
						entry.setDamageNameLang(e.getDamageCode());
						// 修理代码
						entry.setPartsRepairCode(e.getRepairCode());
						entry.setPartsRepairNameLang(e.getRepairCode());
						// 备件号
						entry.setSparesNumber(e.getSparesNumber());
						entry.setSparesNumberNameLang(e.getSparesNumber());
						// 数量
						entry.setQuanity(e.getQuantity() == null ? "" : e.getQuantity().toString());
						return entry;
					}).toArray(RelationRepairEntryOutput[]::new);

			item.setPartsList(entryList);
			return item;
		}).collect(Collectors.toList());
	}

	@Override
	public void addSpare(AddSpareInput input) {
		UnitAddSpares record = new UnitAddSpares();
		record.setSparesNumber(input.getSparesNum());
		record.setUnitCompany(input.getCompanyKey());
		record.setUnitType(input.getUnitTypeKey());
		record.setPartsDetails(input.getPartsDetailKey());
		record.setIsDel(PlatformConstants.ISDEL_NO);
		record.setCreateTime(new Date());
		record.setCreateUser(getCurrentUserId());
		addSpareDao.insert(record);
	}

	/**
	 * 提交检验明细
	 */
	@Override
	@Transactional
	public void submitTesting(SubmitTestingInput input) {
		UnitCourseWithBLOBs unitCourse = unitCourseDao.selectByPrimaryKey(input.getProdCourseId());
		if (unitCourse != null) {
			// 修后照片
			unitCourse.setAfterPhoto(input.getAfterPhoto());
			// 是否预检区修理
			unitCourse.setIsPreview(input.getIsPreview());
			// 备注
			unitCourse.setTestingRemarks(input.getRemarks());
			// ****************************比暂存功能多了下面****************************
			// 检验状态为待审核
			unitCourse.setTestingState(TestingStateEnum.UNAUDIT.getCode());
			// 检验完成时间
			unitCourse.setTestingEndTime(new Date());
			if (unitCourse.getTestingTime() == null) {
				unitCourse.setTestingTime(new Date());
			}
			// ****************************over****************************
			// 条目
			if (input.getPartList() != null) {
				// 此处肯定有箱子进场信息,hanli say
				Course course = courseDao.selectByPrimaryKey(input.getProdCourseId());
				int i = 1;
				for (SubmitTestingEntryInput entry : input.getPartList()) {
					CourseEntry entryEntity = null;
					if (StringUtils.isEmpty(entry.getCourseEntryId())) {
						entryEntity = new CourseEntry();
						entryEntity.setProdCourseEntryId(ruleService.generateCourseEntryKey(course.getContainerNo()));
						// 主表进场id
						entryEntity.setCourse(input.getProdCourseId());
						// 箱类别-机组
						entryEntity.setContainerCategory(ContainerCategoryEnum.CONTAINER_03.getCode());
						// 创建时间
						entryEntity.setCreateTime(new Date());
						entryEntity.setCreateUser(getCurrentUserId());

					} else {
						entryEntity = courseEntryDao.selectByPrimaryKey(entry.getCourseEntryId());
					}
					// 序号
					entryEntity.setSerialNumber(i);//
					i++;

					// 部件大类
					entryEntity.setPartsTypeCode(entry.getPartTypeCode());
					// 部件明细
					entryEntity.setPartsDetailsCode(entry.getPartDetailCode());
					// 损坏代码
					entryEntity.setDamageCode(entry.getDamageCode());
					// 修理代码
					entryEntity.setRepairCode(entry.getRepairCode());
					// 备件号
					entryEntity.setSparesNumber(entry.getSparesNum());
					// 数量
					if (StringUtils.isNotEmpty(entry.getQuantity()) && StringUtils.isNumeric(entry.getQuantity())) {
						entryEntity.setQuantity(Double.valueOf(entry.getQuantity()));
					}
					// 备注
					entryEntity.setRemarks(entry.getRemarks());
					// 照片
					entryEntity.setPhoto(entry.getPhoto());
					// 费率id
					entryEntity.setRateId(entry.getRateId());
					// 是否拍修前照片
					entryEntity.setIsMustPhoto(entry.getIsMustPhoto());
					// 材料费
					entryEntity.setMaterialCost(StringUtils.isEmpty(entry.getMaterialCost()) ? null
							: new BigDecimal(entry.getMaterialCost()));
					// 工时费
					entryEntity.setManHourCost(StringUtils.isEmpty(entry.getManHourCost()) ? null
							: new BigDecimal(entry.getManHourCost()));
					// 工时
					entryEntity.setManHour(
							StringUtils.isEmpty(entry.getManHour()) ? null : new Double(entry.getManHour()));

					// 保存
					if (StringUtils.isEmpty(entry.getCourseEntryId())) {
						courseEntryDao.insert(entryEntity);
					} else {
						courseEntryDao.updateByPrimaryKeyWithBLOBs(entryEntity);
					}
				}
			}
			unitCourse.setUpdateTime(new Date());
			unitCourse.setUpdateUser(getCurrentUserId());
			unitCourseDao.updateByPrimaryKeyWithBLOBs(unitCourse);
		} else {
			throw new InvalidException("prodCourseId");
		}
	}

	/**
	 * 暂存检验明细
	 */
	@Override
	@Transactional
	public void saveTesting(SubmitTestingInput input) {
		UnitCourseWithBLOBs unitCourse = unitCourseDao.selectByPrimaryKey(input.getProdCourseId());
		if (unitCourse != null) {
			// 修后照片
			unitCourse.setAfterPhoto(input.getAfterPhoto());
			// 是否预检区修理
			unitCourse.setIsPreview(input.getIsPreview());
			// 备注
			unitCourse.setTestingRemarks(input.getRemarks());
			if (unitCourse.getTestingTime() == null) {
				unitCourse.setTestingTime(new Date());
			}
			// 条目
			if (input.getPartList() != null) {
				// 此处肯定有箱子进场信息,hanli say
				Course course = courseDao.selectByPrimaryKey(input.getProdCourseId());
				int i = 1;
				for (SubmitTestingEntryInput entry : input.getPartList()) {
					CourseEntry entryEntity = null;
					if (StringUtils.isEmpty(entry.getCourseEntryId())) {
						entryEntity = new CourseEntry();
						entryEntity.setProdCourseEntryId(ruleService.generateCourseEntryKey(course.getContainerNo()));
						// 主表进场id
						entryEntity.setCourse(input.getProdCourseId());
						// 箱类别-机组
						entryEntity.setContainerCategory(ContainerCategoryEnum.CONTAINER_03.getCode());
						// 创建时间
						entryEntity.setCreateTime(new Date());
						entryEntity.setCreateUser(getCurrentUserId());
					} else {
						entryEntity = courseEntryDao.selectByPrimaryKey(entry.getCourseEntryId());
					}
					// 序号
					entryEntity.setSerialNumber(i);//
					i++;

					// 部件大类
					entryEntity.setPartsTypeCode(entry.getPartTypeCode());
					// 部件明细
					entryEntity.setPartsDetailsCode(entry.getPartDetailCode());
					// 损坏代码
					entryEntity.setDamageCode(entry.getDamageCode());
					// 修理代码
					entryEntity.setRepairCode(entry.getRepairCode());
					// 备件号
					entryEntity.setSparesNumber(entry.getSparesNum());
					// 数量
					if (StringUtils.isNotEmpty(entry.getQuantity()) && StringUtils.isNumeric(entry.getQuantity())) {
						entryEntity.setQuantity(Double.valueOf(entry.getQuantity()));
					}
					// 备注
					entryEntity.setRemarks(entry.getRemarks());
					// 照片
					entryEntity.setPhoto(entry.getPhoto());
					// 费率id
					entryEntity.setRateId(entry.getRateId());
					// 是否拍修前照片
					entryEntity.setIsMustPhoto(entry.getIsMustPhoto());
					// 材料费
					entryEntity.setMaterialCost(StringUtils.isEmpty(entry.getMaterialCost()) ? null
							: new BigDecimal(entry.getMaterialCost()));
					// 工时费
					entryEntity.setManHourCost(StringUtils.isEmpty(entry.getManHourCost()) ? null
							: new BigDecimal(entry.getManHourCost()));
					// 工时
					entryEntity.setManHour(
							StringUtils.isEmpty(entry.getManHour()) ? null : new Double(entry.getManHour()));
					// 保存
					if (StringUtils.isEmpty(entry.getCourseEntryId())) {
						courseEntryDao.insert(entryEntity);
					} else {
						courseEntryDao.updateByPrimaryKeyWithBLOBs(entryEntity);
					}
				}
			}
			unitCourse.setUpdateTime(new Date());
			unitCourse.setUpdateUser(getCurrentUserId());
			unitCourseDao.updateByPrimaryKeyWithBLOBs(unitCourse);
		} else {
			throw new InvalidException("prodCourseId");
		}
	}

	/**
	 * 冷机公司列表
	 */
	@Override
	public List<UnitCompanyOutput> getCompanyList() {
		UnitCompanyExample example = new UnitCompanyExample();
		example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<UnitCompany> list = unitCompanyDao.selectByExample(example);
		// 查询出机型列表
		UnitTypeExample typeExample = new UnitTypeExample();
		typeExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<UnitType> typeList = unitTypeDao.selectByExample(typeExample);

		return list.stream().map(a -> {
			UnitCompanyOutput item = new UnitCompanyOutput();
			item.setUnitCompanyKey(a.getKey());
			item.setUnitCompanyCode(a.getUnitCompanyCode());
			item.setUnitCompanyNameLang(a.getKey());
			item.setTypeList(typeList.stream().filter(e -> e.getUnitCompany().equals(a.getKey())).map(e -> {
				UnitTypeOutput entry = new UnitTypeOutput();
				entry.setUnitTypeCode(e.getUnitTypeCode());
				entry.setUnitTypeKey(e.getKey());
				return entry;
			}).toArray(UnitTypeOutput[]::new));
			return item;
		}).collect(Collectors.toList());
	}

	/**
	 * 获取备件
	 */
	@Override
	public List<SparePartDetailOutput> getSpares(SearchSpareInput input) {
		List<SparePartDetailOutput> result = new ArrayList<>();
		SearchTestingSpareInput clientInput = new SearchTestingSpareInput();
		clientInput.setCompanyKey(input.getCompanyKey());
		clientInput.setUnitTypeKey(input.getUnitTypeKey());
		clientInput.setRepairCode(input.getRepairCode().toUpperCase());
		if (StringUtils.isNotEmpty(input.getPartsDetailsCode())) {
			clientInput.setPartsDetailCode(new String[] { input.getPartsDetailsCode() });
		}
		if (clientInput.getPartsDetailCode() != null && clientInput.getPartsDetailCode().length > 0) {
			// 调用仓储接口
			UnitTypeExample example = new UnitTypeExample();
			example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andIsValidEqualTo(1)
					.andKeyEqualTo(clientInput.getUnitTypeKey());
			List<UnitType> unitTypes = unitTypeDao.selectByExample(example);
			String unit = "";
			if (unitTypes != null && unitTypes.size() > 0) {
				unit = unitTypes.get(0).getUnitTypeScope();
			}
			Result<List<SpareTestingOutput>> spares = wareClient.getTestingSpareList(clientInput.getCompanyKey(), unit,
					clientInput.getPartsDetailCode(), clientInput.getRepairCode());
			if (spares != null && spares.getCode().equals(ResultCodeEnum.SUCCESS.getCode())) {
				List<SpareTestingOutput> spareList = spares.getData();
				if (spareList != null && spareList.size() > 0) {
					result = spareList.stream().map(a -> {
						SparePartDetailOutput item = new SparePartDetailOutput();
						item.setSparesNum(a.getSparesNum());
						item.setSparesNameLang(a.getSparesNum());
						item.setDefaultWarehouseType(a.getDefaultWarehouseType());
						item.setDefaultWarehouseTypeNameLang(a.getDefaultWarehouseType());
						return item;
					}).collect(Collectors.toList());
				}
			}
		}
		return result;
	}

	/**
	 * 备件库存列表
	 * 
	 * @param input
	 * @return
	 * @throws Exception
	 */
	@Override
	public SpareStockOutput getSparesStock(SpareStockInput input) {
		SpareStockOutput spareStockOutput = new SpareStockOutput();
		String billType = SpareStockModuleEnum.EVALUATE.getCode().contentEquals(input.getSpareStockModule())
				? "LKBILLTYPE000087"
				: "LKBILLTYPE000086";
		ContainerUserOutput containerUserOutput = containerUserService.getContainerUserByKey(input.getContainerUser());
		String containerUser = "";
		if (containerUserOutput != null && containerUserOutput.getContainerUserCode() != null) {
			containerUser = containerUserOutput.getContainerUserCode();
		}
		Result<WareOutput> result = wareClient.getStockJZJCJY(input.getSparesNum(), billType, getCurrentYardKey(),
				containerUser);
		if (ResultCodeEnum.SUCCESS.getCode().equals(result.getCode()) && result.getData() != null) {
			List<SpareStockListOutput> outputs = new ArrayList<SpareStockListOutput>();
			for (StockOutput a : result.getData().getDataList()) {
				SpareStockListOutput item = new SpareStockListOutput();
				item.setSparesNum(a.getSparesNum());
				item.setSparesNameLang(a.getSparesNum());
				item.setWarehouse(a.getWarehouse());
				item.setWarehouseNameLang(a.getWarehouse());
				item.setCompany(a.getCompany());
				item.setCompanyNameLang(a.getCompany());
				item.setWarehouseType(a.getWarehouseType());
				item.setWarehouseTypeNameLang(a.getWarehouseType());
				item.setPrice(StringUtil.bigDecimalToEffectString(result.getData().getQuotePrice()));
				item.setSurplusQuantity(StringUtil.doubleToEffectString(a.getSurplusQuantity()));
				if (SpareStockModuleEnum.SURRENDER.getCode().contentEquals(input.getSpareStockModule())) {
					if ("LKWARETYPE000005".equals(item.getWarehouseType())) {
						outputs.add(item);
					}
				} else if (SpareStockModuleEnum.SURRENDER.getCode().contentEquals(input.getSpareStockModule())
						&& "RB".equals(input.getRepairCode())) {
					if ("LKWARETYPE000005".equals(item.getWarehouseType())
							|| "LKWARETYPE000006".equals(item.getWarehouseType())) {
						outputs.add(item);
					}
				} else {
					outputs.add(item);
				}
			}

			SpareStockListOutput defaultStock = new SpareStockListOutput();
			defaultStock.setSparesNum(input.getSparesNum());
			defaultStock.setSparesNameLang(input.getSparesNum());
			defaultStock.setWarehouse(result.getData().getDefaultWarehouse());
			defaultStock.setWarehouseNameLang(result.getData().getDefaultWarehouse());
			defaultStock.setCompany(getCurrentCompanyKey());
			defaultStock.setCompanyNameLang(getCurrentCompanyKey());
			defaultStock.setWarehouseType(result.getData().getDefaultWarehouseType());
			defaultStock.setWarehouseTypeNameLang(result.getData().getDefaultWarehouseType());
			defaultStock.setPrice(StringUtil.bigDecimalToEffectString(result.getData().getQuotePrice()));
			defaultStock.setSurplusQuantity("0");
			spareStockOutput.setStockList(outputs);
			spareStockOutput.setDefaultStock(defaultStock);
			SpareStockListOutput originalStock = new SpareStockListOutput();
			BeanUtils.copyProperties(defaultStock, originalStock);
			originalStock.setWarehouseType(OriginalRepairEnum.ORIGINAL.getCode());
			originalStock.setWarehouseTypeNameLang(OriginalRepairEnum.ORIGINAL.getCode());
			spareStockOutput.setOriginalStock(originalStock);
		}
		return spareStockOutput;
	}

	/**
	 * 根据登录名获取公司列表
	 */
	@Override
	public List<CompanyLoginOutput> getCompanys(String userName) {
		Result<List<CompanyDetailOutput>> companys = authClient.getCompanyList(userName);
		if (companys != null && companys.getCode().equals(ResultCodeEnum.SUCCESS.getCode())) {
			List<CompanyDetailOutput> companyList = companys.getData();
			return companyList.stream().map(a -> {
				CompanyLoginOutput item = new CompanyLoginOutput();
				item.setCompanyKey(a.getCompanyKey());
				item.setCompanyName(a.getCompanyName());
				item.setCompanyNameEn(a.getCompanyNameEn());
				if (a.getYardList() != null)
					item.setYardList(Arrays.asList(a.getYardList()).stream().map(b -> {
						YardLoginOutput y = new YardLoginOutput();
						y.setYardKey(b.getYardKey());
						y.setYardName(b.getYardName());
						y.setYardNameEn(b.getYardNameEn());
						return y;
					}).toArray(YardLoginOutput[]::new));
				return item;
			}).collect(Collectors.toList());
		}
		return new ArrayList<>();
	}

	/**
	 * app登陆
	 */
	@Override
	public AppLoginOutput login(AppLoginInput input) {
		CompanyExample companyExample = new CompanyExample();
		companyExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
				.andKeyEqualTo(input.getCompanyKey());
		List<Company> companys = companyDao.selectByExample(companyExample);
		if (companys.size() > 0) {
			Company company = companys.get(0);
			Yard yard = null;
			if (StringUtils.isNotEmpty(input.getYardKey())) {
				YardExample yardExample = new YardExample();
				yardExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
						.andKeyEqualTo(input.getYardKey());
				List<Yard> yards = yardDao.selectByExample(yardExample);
				if (yards.size() > 0) {
					yard = yards.get(0);
				}
			}
			LoginInput loginInput = new LoginInput();
			loginInput.setCompanyId(company.getProdCompanyId());
			loginInput.setYardId(yard == null ? null : yard.getProdYardId());
			loginInput.setLoginName(input.getUserName());
			loginInput.setLoginPassword(input.getPassword());
			loginInput.setSystemType(SystemTypeEnum.APP.getCode());
			Result<LoginOutput> loginOutput = authClient.login(loginInput);
			if (loginOutput != null && loginOutput.getCode().equals(ResultCodeEnum.SUCCESS.getCode())) {
				LoginOutput loginResult = loginOutput.getData();

				AppLoginOutput output = new AppLoginOutput();
				output.setToken(loginResult.getToken());
				output.setUserId(loginResult.getUser().getUserId().toString());
				output.setUserName(loginResult.getUser().getUserName());
				output.setCompanyNameLang(company.getKey());
				output.setCompanyKey(company.getKey());
				output.setCompanyCode(company.getCompanyCode());
				output.setYardNameLang(yard.getKey());
				output.setYardKey(yard.getKey());
				// 箱子权限
				ContainerAuth containerAuth = new ContainerAuth();
				// 箱子权限-检验
				containerAuth.setCheck(loginResult.getUser().getAllMenuList() != null && loginResult.getUser()
						.getAllMenuList().stream().anyMatch(a -> a.getMenuCode().equals("ProdContainersList")) ? 1 : 0);
				// 箱子权限-修理
				containerAuth.setRepair(loginResult.getUser().getAllMenuList() != null
						&& loginResult.getUser().getAllMenuList().stream().anyMatch(a -> a.getMenuCode().equals("Prod"))
								? 1
								: 0);
				output.setContainerAuth(containerAuth);
				// 箱子基础数据是否显示
				ContainerBasic containerBasic = new ContainerBasic();

				FieldRequiredExample fieldRequiredExample = new FieldRequiredExample();
				FieldRequiredExample.Criteria criteria = fieldRequiredExample.createCriteria();
				criteria.andCompanyEqualTo(input.getCompanyKey()).andYardEqualTo(input.getYardKey());
				List<FieldRequired> fieldRequiredList = fieldRequiredDao.selectByExample(fieldRequiredExample);
				// 箱况类别
				containerBasic.setCategory(
						fieldRequiredList.stream().anyMatch(a -> a.getField().equals("container_category")) ? 1 : 0);
				// 箱属
				containerBasic.setContainerBelong(
						fieldRequiredList.stream().anyMatch(a -> a.getField().equals("container_belong")) ? 1 : 0);
				// 机组类型
				containerBasic.setUnitType(
						fieldRequiredList.stream().anyMatch(a -> a.getField().equals("unit_type")) ? 1 : 0);
				// 内外贸
				containerBasic.setDomesticForeignTrade(
						fieldRequiredList.stream().anyMatch(a -> a.getField().equals("domestic_foreign_trade")) ? 1
								: 0);
				// 冷代干
				containerBasic.setIsFreezeDry(
						fieldRequiredList.stream().anyMatch(a -> a.getField().equals("is_freeze_dry")) ? 1 : 0);
				// 退租箱
				containerBasic.setIsSurrender(
						fieldRequiredList.stream().anyMatch(a -> a.getField().equals("is_surrender")) ? 1 : 0);
				// 挂衣箱
				containerBasic.setIsGonContainer(
						fieldRequiredList.stream().anyMatch(a -> a.getField().equals("is_gon_container")) ? 1 : 0);
				// 贴标
				containerBasic.setLabelling(
						fieldRequiredList.stream().anyMatch(a -> a.getField().equals("labelling")) ? 1 : 0);
				// 直角
				containerBasic.setRightAngle(
						fieldRequiredList.stream().anyMatch(a -> a.getField().equals("right_angle")) ? 1 : 0);
				// 是否清洗
				containerBasic.setIsCleanout(
						fieldRequiredList.stream().anyMatch(a -> a.getField().equals("is_cleanout")) ? 1 : 0);
				// 定位器
				containerBasic.setIsLocator(
						fieldRequiredList.stream().anyMatch(a -> a.getField().equals("is_locator")) ? 1 : 0);
				// 提单号
				containerBasic.setBillOfLadingNo(
						fieldRequiredList.stream().anyMatch(a -> a.getField().equals("bill_of_lading_no")) ? 1 : 0);
				// 船名航次
				containerBasic.setVesselVoyage(
						fieldRequiredList.stream().anyMatch(a -> a.getField().equals("vessel_voyage")) ? 1 : 0);
				// 箱龄
				containerBasic.setContainerAge(
						fieldRequiredList.stream().anyMatch(a -> a.getField().equals("container_age")) ? 1 : 0);
				// 箱等级
				containerBasic.setContainerLevel(
						fieldRequiredList.stream().anyMatch(a -> a.getField().equals("container_grade")) ? 1 : 0);
				// 皮重
				containerBasic.setContainerTare(
						fieldRequiredList.stream().anyMatch(a -> a.getField().equals("container_tare")) ? 1 : 0);
				// 载重
				containerBasic.setContainerLoad(
						fieldRequiredList.stream().anyMatch(a -> a.getField().equals("container_load")) ? 1 : 0);
				// 铅封
				containerBasic.setLeadSealing(
						fieldRequiredList.stream().anyMatch(a -> a.getField().equals("lead_sealing")) ? 1 : 0);
				// 空重
				containerBasic.setIsBareWeight(
						fieldRequiredList.stream().anyMatch(a -> a.getField().equals("is_bare_weight")) ? 1 : 0);
				// 容积
				containerBasic.setContainerVolume(
						fieldRequiredList.stream().anyMatch(a -> a.getField().equals("container_volume")) ? 1 : 0);
				// 总重
				containerBasic.setGrossWeight(
						fieldRequiredList.stream().anyMatch(a -> a.getField().equals("gross_weight")) ? 1 : 0);
				// 无箱标
				containerBasic
						.setIsLabel(fieldRequiredList.stream().anyMatch(a -> a.getField().equals("is_label")) ? 1 : 0);
				output.setContainerBasic(containerBasic);

				// 质检权限
				QualityAuth qualityAuth = new QualityAuth();
				// 干箱
				qualityAuth.setDryContainer(loginResult.getUser().getAllMenuList() != null && loginResult.getUser()
						.getAllMenuList().stream().anyMatch(a -> a.getMenuCode().equals("quality.dry")) ? 1 : 0);
				// 冷箱
				qualityAuth.setIceContainer(loginResult.getUser().getAllMenuList() != null && loginResult.getUser()
						.getAllMenuList().stream().anyMatch(a -> a.getMenuCode().equals("quality.cold")) ? 1 : 0);
				// 机组
				qualityAuth.setUnit(loginResult.getUser().getAllMenuList() != null && loginResult.getUser()
						.getAllMenuList().stream().anyMatch(a -> a.getMenuCode().equals("quality.unit")) ? 1 : 0);
				output.setQualityAuth(qualityAuth);

				// 主页剩余权限
				OtherAuth otherAuth = new OtherAuth();
				// 机组
				otherAuth.setUnitAuth(loginResult.getUser().getAllMenuList() != null && loginResult.getUser()
						.getAllMenuList().stream().anyMatch(a -> a.getMenuCode().equals("ProdUnitList")) ? 1 : 0);
				// 洗箱
				otherAuth.setWash(0);
				if (loginResult.getUser().getAuthList() != null && loginResult.getUser().getAuthList().stream()
						.anyMatch(a -> a.getAuthCode().equals("ProdUnitWash.uploadPhoto"))) {
					// 洗箱员权限
					otherAuth.setWash(1);
				} else if (loginResult.getUser().getAuthList() != null && loginResult.getUser().getAuthList().stream()
						.anyMatch(a -> a.getAuthCode().equals("ProdUnitWash.audit"))) {
					// 预检员权限
					otherAuth.setWash(2);
				}
				// 重箱监管
				otherAuth.setSupervise(loginResult.getUser().getAllMenuList() != null && loginResult.getUser()
						.getAllMenuList().stream().anyMatch(a -> a.getMenuCode().equals("ProdSupervise")) ? 1 : 0);
				// 出箱
				otherAuth.setOut(loginResult.getUser().getAllMenuList() != null && loginResult.getUser()
						.getAllMenuList().stream().anyMatch(a -> a.getMenuCode().equals("ProdUnitOut")) ? 1 : 0);
				// 发泡
				otherAuth.setBubble(loginResult.getUser().getAllMenuList() != null && loginResult.getUser()
						.getAllMenuList().stream().anyMatch(a -> a.getMenuCode().equals("ProdBubble")) ? 1 : 0);
				// 仓库出库
				otherAuth.setWarehouse(loginResult.getUser().getAllMenuList() != null && loginResult.getUser()
						.getAllMenuList().stream().anyMatch(a -> a.getMenuCode().equals("wareStockout")) ? 1 : 0);
				// 先修
				otherAuth.setXx(loginResult.getUser().getAllMenuList() != null && loginResult.getUser().getAllMenuList()
						.stream().anyMatch(a -> a.getMenuCode().equals("ProdUnitXXAndPtiOk")) ? 1 : 0);
				// 新箱
				otherAuth.setNewContainer(loginResult.getUser().getAllMenuList() != null && loginResult.getUser().getAllMenuList()
						.stream().anyMatch(a -> a.getMenuCode().equals("ProdNewContainers")) ? 1 : 0);
				output.setOtherAuth(otherAuth);
				return output;
			}
		}
		throw new AuthorizationException();
	}

	/**
	 * 根据进场id获取机组检验明细
	 */
	@Override
	public CourseOutput getCourseDetail(String courseId) {
		UnitCourseWithBLOBs unitCourse = unitCourseDao.selectByPrimaryKey(courseId);
		CourseOutput output = new CourseOutput();
		// 修后照片
		output.setAfterPhoto(unitCourse.getAfterPhoto());
		// 是否预检区修理
		output.setIsPreviewLang(unitCourse.getIsPreview());
		// 备注
		output.setRemarks(unitCourse.getTestingRemarks());
		// 明细列表
		CourseEntryExample example = new CourseEntryExample();
		example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andCourseEqualTo(courseId)
				.andContainerCategoryEqualTo(ContainerCategoryEnum.CONTAINER_03.getCode());
		List<CourseEntry> entryList = courseEntryDao.selectByExample(example);
		output.setDataList(entryList.stream().map(a -> {
			CourseEntryOutput item = new CourseEntryOutput();
			item.setCourseEntryId(a.getProdCourseEntryId());
			item.setPartTypeCode(a.getPartsTypeCode());
			item.setPartDetailCode(a.getPartsDetailsCode());
			item.setDamageCode(a.getDamageCode());
			item.setRepairCode(a.getRepairCode());
			item.setSparesNum(a.getSparesNumber());
			item.setQuantity(a.getQuantity() != null ? a.getQuantity().toString() : null);
			item.setRemarks(a.getRemarks());
			item.setManHour(String.valueOf(a.getManHour()));
			item.setPhoto(a.getPhoto());
			item.setRateId(a.getRateId());
			item.setIsMustPhoto(a.getIsMustPhoto());
			item.setMaterialCost(a.getMaterialCode());
			item.setManHourCost(String.valueOf(a.getManHourCost()));
			return item;
		}).toArray(CourseEntryOutput[]::new));

		return output;
	}

	/**
	 * 维修历史记录-进场列表
	 */
	@Override
	public PagedList<UnitTestingHistoryOutput> getHistoryPagedList(UnitTestingHistoryInput input) {
		if (StringUtils.isEmpty(input.getType())) {
			return new PagedList<UnitTestingHistoryOutput>(input.getIndex(), input.getSize());
		}

		if (input.getType().equals(ContainerCategoryEnum.CONTAINER_03.getCode())) {
			// 坏机组维修历史
			UnitCourseExample example = new UnitCourseExample();
			UnitCourseExample.Criteria criteria = example.createCriteria();
			if (StringUtils.isNotEmpty(input.getContainerNo())) {
				criteria.andContainerNoLike("%" + input.getContainerNo() + "%");
			}
			criteria.andUnitStateEqualTo(UnitStateEnum.BAD.getCode());
			// 机组进场记录
			int totalItemCount = (int) unitCourseDao.countByExample(example);
			PagedList<UnitTestingHistoryOutput> pagedList = new PagedList<UnitTestingHistoryOutput>(input.getIndex(),
					input.getSize(), totalItemCount);
			example.setLimitStart(pagedList.getLimitStart());
			example.setLimitEnd(pagedList.getLimitEnd());
			List<UnitCourse> courseList = unitCourseDao.selectByExample(example);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			pagedList.setDataList(courseList.stream().map(a -> {
				Course course = courseDao.selectByPrimaryKey(a.getProdCourseId());
				UnitTestingHistoryOutput item = new UnitTestingHistoryOutput();
				item.setProdCourseId(a.getProdCourseId());
				item.setContainerNo(a.getContainerNo());
				item.setSizeLang(course.getSize());
				item.setContainerTypeLang(course.getContainerType());
				item.setEntryTypeLang(course.getCourseType());
				item.setContainerUserLang(course.getContainerUser());
				item.setEntryDate(course.getCourseTime() != null ? sdf.format(course.getCourseTime()) : null);
				item.setContainerConditionLang(course.getContainerCondition());
				item.setYardLang(course.getYard());
				return item;
			}).collect(Collectors.toList()));
			return pagedList;
		} else {
			// 坏箱维修历史
			CourseExample courseExample = new CourseExample();
			CourseExample.Criteria criteria = courseExample.createCriteria();
			if (StringUtils.isNotEmpty(input.getContainerNo())) {
				criteria.andContainerNoLike("%" + input.getContainerNo() + "%");
			}
			criteria.andContainerCategoryEqualTo(input.getType());
			criteria.andContainerConditionEqualTo(ContainerStateEnum.BAD.getCode());
			// 箱子进场记录
			int totalItemCount = (int) courseDao.countByExample(courseExample);
			PagedList<UnitTestingHistoryOutput> pagedList = new PagedList<UnitTestingHistoryOutput>(input.getIndex(),
					input.getSize(), totalItemCount);
			courseExample.setLimitStart(pagedList.getLimitStart());
			courseExample.setLimitEnd(pagedList.getLimitEnd());
			List<Course> courseList = courseDao.selectByExample(courseExample);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			pagedList.setDataList(courseList.stream().map(a -> {
				UnitTestingHistoryOutput item = new UnitTestingHistoryOutput();
				item.setProdCourseId(a.getProdCourseId());
				item.setContainerNo(a.getContainerNo());
				item.setSizeLang(a.getSize());
				item.setContainerTypeLang(a.getContainerType());
				item.setEntryTypeLang(a.getCourseType());
				item.setContainerUserLang(a.getContainerUser());
				item.setEntryDate(a.getCourseTime() != null ? sdf.format(a.getCourseTime()) : null);
				item.setContainerConditionLang(a.getContainerCondition());
				item.setYardLang(a.getYard());
				return item;
			}).collect(Collectors.toList()));
			return pagedList;
		}

	}

	/**
	 * 维修历史记录-进场明细--通用
	 */
	@Override
	public Map<String, Object> getHistoryDetail(String prodCourseId, String containerCategory, Integer detailType) {
		Map<String, Object> map = new HashMap<>();
		// 修后照片
		CourseWithBLOBs course = courseDao.selectByPrimaryKey(prodCourseId);
		map.put("afterPhoto", course.getAfterPhoto());
		List<UnitTestingHistoryEntryOutput> outputList = null;
		// 0检验明细
		if (detailType.equals(0)) {
			CourseEntryExample entryExample = new CourseEntryExample();
			entryExample.createCriteria().andCourseEqualTo(prodCourseId).andContainerCategoryEqualTo(containerCategory);
			entryExample.setOrderByClause("serial_number");
			List<CourseEntry> entryList = courseEntryDao.selectByExampleWithBLOBs(entryExample);
			outputList = entryList.stream().map(a -> {
				UnitTestingHistoryEntryOutput item = new UnitTestingHistoryEntryOutput();
				item.setPositionCode(a.getPositionCode());
				item.setPartRepairCode(a.getPartsRepairCode());
				item.setMaterialCode(a.getMaterialCode());
				item.setPartTypeCode(a.getPartsTypeCode());
				item.setPartTypeNameLang(a.getPartsTypeCode());
				item.setPartDetailCode(a.getPartsDetailsCode());
				item.setDamageCode(a.getDamageCode());
				item.setRepairCode(a.getRepairCode());
				item.setSparesNum(a.getSparesNumber());
				// 数量
				item.setQuantity(a.getQuantity() != null ? a.getQuantity().toString() : null);
				// 长度
				item.setLength(StringUtil.doubleToIntString(a.getLength()));
				// 宽度
				item.setWidth(StringUtil.doubleToIntString(a.getWidth()));
				// 修前照片
				item.setPhoto(a.getPhoto());
				return item;
			}).collect(Collectors.toList());
		}
		// 1估价明细
		else if (detailType.equals(1)) {
			EvaluationEntryExample entryExample = new EvaluationEntryExample();
			entryExample.createCriteria().andCourseEqualTo(prodCourseId).andContainerCategoryEqualTo(containerCategory);
			entryExample.setOrderByClause("serial_number");
			List<EvaluationEntry> entryList = evaluationEntryDao.selectByExample(entryExample);
			outputList = entryList.stream().map(a -> {
				UnitTestingHistoryEntryOutput item = new UnitTestingHistoryEntryOutput();
				item.setPositionCode(a.getPositionCode());
				item.setPartRepairCode(a.getPartsRepairCode());
				item.setMaterialCode(a.getMaterialCode());
				item.setPartTypeCode(a.getPartsTypeCode());
				item.setPartTypeNameLang(a.getPartsTypeCode());
				item.setPartDetailCode(a.getPartsDetailsCode());
				item.setDamageCode(a.getDamageCode());
				item.setRepairCode(a.getRepairCode());
				item.setSparesNum(a.getSparesNumber());
				// 数量
				item.setQuantity(a.getQuantity() != null ? a.getQuantity().toString() : null);
				// 长度
				item.setLength(StringUtil.doubleToIntString(a.getLength()));
				// 宽度
				item.setWidth(StringUtil.doubleToIntString(a.getWidth()));
				// 修前照片
				CourseEntry courseEntry = courseEntryDao.selectByPrimaryKey(a.getProdEvaluationEntryId());
				if (courseEntry != null) {
					item.setPhoto(courseEntry.getPhoto());
				}
				return item;
			}).collect(Collectors.toList());
		}
		// 2派工明细
		else if (detailType.equals(2)) {
			ReferralEntryExample entryExample = new ReferralEntryExample();
			entryExample.createCriteria().andCourseEqualTo(prodCourseId).andContainerCategoryEqualTo(containerCategory);
			entryExample.setOrderByClause("serial_number");
			List<ReferralEntry> entryList = referralEntryDao.selectByExample(entryExample);
			outputList = entryList.stream().map(a -> {
				UnitTestingHistoryEntryOutput item = new UnitTestingHistoryEntryOutput();
				item.setPositionCode(a.getPositionCode());
				item.setPartRepairCode(a.getPartsRepairCode());
				item.setMaterialCode(a.getMaterialCode());
				item.setPartTypeCode(a.getPartsTypeCode());
				item.setPartTypeNameLang(a.getPartsTypeCode());
				item.setPartDetailCode(a.getPartsDetailsCode());
				item.setDamageCode(a.getDamageCode());
				item.setRepairCode(a.getRepairCode());
				item.setSparesNum(a.getSparesNumber());
				// 数量
				item.setQuantity(a.getQuantity() != null ? a.getQuantity().toString() : null);
				// 长度
				item.setLength(StringUtil.doubleToIntString(a.getLength()));
				// 宽度
				item.setWidth(StringUtil.doubleToIntString(a.getWidth()));
				// 修前照片
				CourseEntry courseEntry = courseEntryDao.selectByPrimaryKey(a.getProdReferralEntryId());
				if (courseEntry != null) {
					item.setPhoto(courseEntry.getPhoto());
				}
				// 条目类型 0 派工 1 错项 2 漏项 3 返工
				item.setQualityStateLang(a.getQualityState());
				// 是否工艺标准
				QualityReworkExample reworkExample = new QualityReworkExample();
				reworkExample.createCriteria().andCourseEqualTo(prodCourseId)
						.andReferralEntryIdEqualTo(a.getProdReferralEntryId());
				List<QualityRework> reworkList = qualityReworkDao.selectByExample(reworkExample);
				if (reworkList.size() > 0) {
					item.setIsTechnologyLang(reworkList.get(0).getIsTechnology());
					// 质检问题类别
					item.setReworkQuestionLang(reworkList.get(0).getReworkQuestion());
					// 整改标准
					item.setRectificationStandardLang(reworkList.get(0).getRectificationStandard());
				}
				return item;
			}).collect(Collectors.toList());
		}
		map.put("dataList", outputList);
		return map;
	}

	/**
	 * pti类型列表
	 */
	@Override
	public List<PtiTypeDetailOutpput> getPtiList() {
		PtiTypeExample example = new PtiTypeExample();
		PtiTypeExample.Criteria criteria = example.createCriteria();
		if (StringUtils.isNotEmpty(getCurrentYardKey())) {
			// 所属公司
			criteria.andCompanyEqualTo(getCurrentCompanyKey());
		}
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<PtiType> list = ptiTypeDao.selectByExample(example);
		return list.stream().map(a -> {
			PtiTypeDetailOutpput item = new PtiTypeDetailOutpput();
			item.setPtiTypeKey(a.getKey());
			item.setPtiTypeNameLang(a.getKey());
			return item;
		}).collect(Collectors.toList());
	}

	/**
	 * 先修列表
	 */
	@Override
	public PagedList<PreReferralListOutput> getPreReferralPagedList(PreReferralSearchInput input) {
		PagedList<PreReferralListOutput> pagedList = new PagedList<PreReferralListOutput>(input.getPageIndex(),
				input.getPageSize());
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
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		List<PreReferralListOutput> dataList = courseList.stream().map(a -> {
			PreReferralListOutput item = new PreReferralListOutput();
			item.setProdCourseId(a.getProdCourseId());
			item.setContainerNo(a.getContainerNo());
			UnitCourse unitCourse = unitCourseDao.selectByPrimaryKey(a.getProdCourseId());
			if (unitCourse != null) {
				item.setZoneLang(unitCourse.getZone());
				item.setUnitStateLang(unitCourse.getUnitState());
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

}
