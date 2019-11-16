package com.sanlly.production.service.impl;

import java.math.BigDecimal;
import java.net.URLEncoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.enums.CommonEnum;
import com.sanlly.common.enums.ResultCodeEnum;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.models.output.user.UserInfoOutput;
import com.sanlly.common.utils.StringUtil;
import com.sanlly.production.dao.ChargeMapper;
import com.sanlly.production.dao.CodeCorrespondingMapper;
import com.sanlly.production.dao.ComRepairEntryMapper;
import com.sanlly.production.dao.CommonRepairMapper;
import com.sanlly.production.dao.ContainerMapper;
import com.sanlly.production.dao.ContainerTypeMapper;
import com.sanlly.production.dao.CourseEntryMapper;
import com.sanlly.production.dao.CourseMapper;
import com.sanlly.production.dao.DamageMapper;
import com.sanlly.production.dao.EvaluationEntryMapper;
import com.sanlly.production.dao.GohContainerMapper;
import com.sanlly.production.dao.MaintenanceMapper;
import com.sanlly.production.dao.PartsTypeMapper;
import com.sanlly.production.dao.ReferralEntryMapper;
import com.sanlly.production.dao.RepairMapper;
import com.sanlly.production.dao.SpareChangeRecordMapper;
import com.sanlly.production.dao.SpecialWashingRateMapper;
import com.sanlly.production.dao.SurrenderPlanDetailMapper;
import com.sanlly.production.dao.SurrenderPlanMapper;
import com.sanlly.production.dao.UnitCourseMapper;
import com.sanlly.production.dao.WorkGroupMapper;
import com.sanlly.production.dao.YardContainerTypeMapper;
import com.sanlly.production.dao.YardMapper;
import com.sanlly.production.entity.Charge;
import com.sanlly.production.entity.ChargeExample;
import com.sanlly.production.entity.CodeCorresponding;
import com.sanlly.production.entity.CodeCorrespondingExample;
import com.sanlly.production.entity.ComRepairEntry;
import com.sanlly.production.entity.ComRepairEntryExample;
import com.sanlly.production.entity.CommonRepair;
import com.sanlly.production.entity.CommonRepairExample;
import com.sanlly.production.entity.CommonRepairExample.Criteria;
import com.sanlly.production.entity.Container;
import com.sanlly.production.entity.ContainerExample;
import com.sanlly.production.entity.ContainerTypeExample;
import com.sanlly.production.entity.Course;
import com.sanlly.production.entity.CourseEntry;
import com.sanlly.production.entity.CourseEntryExample;
import com.sanlly.production.entity.CourseExample;
import com.sanlly.production.entity.CourseWithBLOBs;
import com.sanlly.production.entity.Damage;
import com.sanlly.production.entity.DamageExample;
import com.sanlly.production.entity.EvaluationEntry;
import com.sanlly.production.entity.EvaluationEntryExample;
import com.sanlly.production.entity.GohContainer;
import com.sanlly.production.entity.GohContainerExample;
import com.sanlly.production.entity.Maintenance;
import com.sanlly.production.entity.MaintenanceWithBLOBs;
import com.sanlly.production.entity.PartsType;
import com.sanlly.production.entity.PartsTypeExample;
import com.sanlly.production.entity.ReferralEntry;
import com.sanlly.production.entity.ReferralEntryExample;
import com.sanlly.production.entity.Repair;
import com.sanlly.production.entity.RepairExample;
import com.sanlly.production.entity.SpareChangeRecord;
import com.sanlly.production.entity.SpecialWashingRate;
import com.sanlly.production.entity.SpecialWashingRateExample;
import com.sanlly.production.entity.SurrenderPlan;
import com.sanlly.production.entity.SurrenderPlanDetail;
import com.sanlly.production.entity.SurrenderPlanDetailExample;
import com.sanlly.production.entity.SurrenderPlanExample;
import com.sanlly.production.entity.UnitCourse;
import com.sanlly.production.entity.UnitCourseExample;
import com.sanlly.production.entity.UnitCourseWithBLOBs;
import com.sanlly.production.entity.WorkGroup;
import com.sanlly.production.entity.Yard;
import com.sanlly.production.entity.YardContainerType;
import com.sanlly.production.entity.YardContainerTypeExample;
import com.sanlly.production.entity.YardExample;
import com.sanlly.production.enums.AuditTypeEnum;
import com.sanlly.production.enums.ChargeTypeEnum;
import com.sanlly.production.enums.CleaningEntryEnum;
import com.sanlly.production.enums.CleaningMethodsEnum;
import com.sanlly.production.enums.CleaningPatternEnum;
import com.sanlly.production.enums.CleaningSourceEnum;
import com.sanlly.production.enums.ContainerCategoryEnum;
import com.sanlly.production.enums.ContainerStateEnum;
import com.sanlly.production.enums.PaymentTypeEnum;
import com.sanlly.production.enums.PickingStateEnum;
import com.sanlly.production.enums.ReplyStateEnum;
import com.sanlly.production.enums.SpareStockModuleEnum;
import com.sanlly.production.enums.SurrenderPlanStateEnum;
import com.sanlly.production.enums.SurrenderTypeEnum;
import com.sanlly.production.enums.TestingStateEnum;
import com.sanlly.production.enums.UnitStateEnum;
import com.sanlly.production.models.input.app.containerTesting.ContainerCourseEntryInfoInput;
import com.sanlly.production.models.input.app.containerTesting.ContainerCourseEntryInput;
import com.sanlly.production.models.input.cleaning.CleaningAddInput;
import com.sanlly.production.models.input.containerTesting.AuditContainerInput;
import com.sanlly.production.models.input.containerTesting.CommonRepairInput;
import com.sanlly.production.models.input.containerTesting.ContainerCourseInput;
import com.sanlly.production.models.input.containerTesting.ContainerEntryListInput;
import com.sanlly.production.models.input.containerTesting.ContainerTestingSearchInput;
import com.sanlly.production.models.input.containerTesting.CourseCopyInput;
import com.sanlly.production.models.input.containerTesting.CourseEntryRelationInput;
import com.sanlly.production.models.input.containerTesting.SetContainerStateInput;
import com.sanlly.production.models.input.containerTesting.ThirdPartyChargeInput;
import com.sanlly.production.models.input.surrender.SurrenderCourseSearchInput;
import com.sanlly.production.models.output.app.containerTesting.ContainerCourseEntryInfoOutput;
import com.sanlly.production.models.output.app.containerTesting.ContainerCourseEntryOutput;
import com.sanlly.production.models.output.app.partsRepair.PartsRepairTypeOutput;
import com.sanlly.production.models.output.containerTesting.CommonRepairEntryOutput;
import com.sanlly.production.models.output.containerTesting.CommonRepairOutput;
import com.sanlly.production.models.output.containerTesting.ContainerCourseOutput;
import com.sanlly.production.models.output.containerTesting.ContainerStateTypeOutput;
import com.sanlly.production.models.output.containerTesting.ContainerTestingListOutput;
import com.sanlly.production.models.output.containerTesting.CourseEntryRelationOutput;
import com.sanlly.production.models.output.containerTesting.SpecialWashingRateOutput;
import com.sanlly.production.models.output.surrender.SurrenderCourseListOutput;
import com.sanlly.production.service.AuthService;
import com.sanlly.production.service.CleaningService;
import com.sanlly.production.service.ContainerTestingService;
import com.sanlly.production.service.CourseKeyRuleService;
import com.sanlly.production.service.WarehouseClient;
import com.sanlly.production.utils.PayUtil;

/**
 *    
 * 
 * @Package com.sanlly.production.service 
 * @Description: TODO 箱体进场检验
 * @author tianzhl   
 * @date 2019年8月14日 上午11:16:56 
 * @version V1.0   
 */
@Service
public class ContainerTestingServiceImpl extends BaseServiceImpl implements ContainerTestingService {

	@Autowired
	private CourseMapper courseDao;

	@Autowired
	private CourseEntryMapper courseEntryDao;

	@Autowired
	private ContainerMapper containerDao;

	@Autowired
	private ContainerTypeMapper containerTypeDao;

	@Autowired
	private AuthService authClient;

	@Autowired
	private CourseKeyRuleService ruleService;

	@Autowired
	private UnitCourseMapper unitCourseDao;

	@Autowired
	private MaintenanceMapper maintenanceDao;

	@Autowired
	private CommonRepairMapper commonRepairDao;

	@Autowired
	private ComRepairEntryMapper comRepairEntryDao;

	@Autowired
	private YardContainerTypeMapper yardContainerTypeDao;

	@Autowired
	private CodeCorrespondingMapper codeCorrespondingDao;

	@Autowired
	private PartsTypeMapper partsTypeDao;

	@Autowired
	private RepairMapper repairDao;

	@Autowired
	private DamageMapper damageDao;

	@Autowired
	private SpecialWashingRateMapper specialWashingRateDao;

	@Autowired
	private ChargeMapper chargeDao;

	@Autowired
	private WorkGroupMapper workGroupDao;

	@Autowired
	private CleaningService cleaningService;

	@Autowired
	private WarehouseClient warehouseClient;

	// zhangkai修改
	@Autowired
	private YardMapper yardDao;

	@Autowired
	private SurrenderPlanMapper surrenderPlanDao;

	@Autowired
	private SurrenderPlanDetailMapper surrenderPlanDetailDao;

	@Autowired
	private GohContainerMapper gohContainerMapper;

	@Autowired
	private SpareChangeRecordMapper spareChangeRecordDao;

	@Autowired
	private EvaluationEntryMapper evaluationEntryDao;

	@Autowired
	private ReferralEntryMapper referralEntryDao;

	/**
	 * 箱体检验列表
	 * 
	 * @param input
	 * @return
	 * @throws ParseException
	 */
	@Override
	public PagedList<ContainerTestingListOutput> getPageList(ContainerTestingSearchInput input) throws ParseException {
		PagedList<ContainerTestingListOutput> pagedList = new PagedList<ContainerTestingListOutput>(
				input.getPageIndex(), input.getPageSize());
		// TODO Auto-generated method stub
		CourseExample courseExample = new CourseExample();
		CourseExample.Criteria criteria = courseExample.createCriteria();

		// 箱号
		if (StringUtils.isNotBlank(input.getContainerNo())) {
			criteria.andContainerNoLike("%" + StringUtils.trim(input.getContainerNo()) + "%");
		}
		// 用箱人
		if (StringUtils.isNotBlank(input.getContainerUser())) {
			criteria.andContainerUserEqualTo(StringUtils.trim(input.getContainerUser()));
		}
		// 箱东
		if (StringUtils.isNotBlank(input.getContainerOwner())) {
			criteria.andContainerOwnerEqualTo(StringUtils.trim(input.getContainerOwner()));
		}
		// 退租箱
		if (StringUtils.isNotBlank(input.getIsSurrender())) {
			criteria.andIsSurrenderEqualTo(StringUtils.trim(input.getIsSurrender()));
		}
		// 进场类型
		if (StringUtils.isNotBlank(input.getCourseType())) {
			criteria.andCourseTypeEqualTo(StringUtils.trim(input.getCourseType()));
		}
		// 箱型
		if (StringUtils.isNotBlank(input.getContainerType())) {
			criteria.andContainerTypeEqualTo(StringUtils.trim(input.getContainerType()));
		}
		// 箱况
		if (StringUtils.isNotBlank(input.getContainerCondition())) {
			criteria.andContainerConditionEqualTo(StringUtils.trim(input.getContainerCondition()));
		}
		// 场站
		if (StringUtils.isNotBlank(input.getYard())) {
			criteria.andYardEqualTo(StringUtils.trim(input.getYard()));
		}
		// 检验状态
		if (input.getTestingState() != null && input.getTestingState().length > 0) {
			criteria.andTestingStateIn(new ArrayList<>(Arrays.asList(input.getTestingState())));
		}
		// 箱类别
		if (StringUtils.isNotBlank(input.getContainerCategory())) {
			criteria.andContainerCategoryEqualTo(StringUtils.trim(input.getContainerCategory()));
		}

		SimpleDateFormat sdfs = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// 进场开始时间
		if (StringUtils.isNotBlank(input.getStartDate())) {
			criteria.andCourseTimeGreaterThanOrEqualTo(sdfs.parse(StringUtils.trim(input.getStartDate())));
		}

		// 进场结束时间
		if (StringUtils.isNotBlank(input.getEndDate())) {
			criteria.andCourseTimeLessThanOrEqualTo(sdfs.parse(StringUtils.trim(input.getEndDate())));
		}

		// 检验人
		if (StringUtils.isNotBlank(input.getTestingUser())) {
			criteria.andTestingUserEqualTo(Integer.valueOf(input.getTestingUser()));
		}

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		// 分页查询
		int total = (int) courseDao.countByExample(courseExample);
		courseExample.setLimitStart(pagedList.getLimitStart());
		courseExample.setLimitEnd(pagedList.getLimitEnd());
		pagedList.setTotalItemCount(total);
		// 按照进场倒序
		courseExample.setOrderByClause(" course_time desc");
		List<Course> courses = courseDao.selectByExample(courseExample);
		// 转换输出实体
		List<ContainerTestingListOutput> outputList = courses.stream().map(course -> {
			ContainerTestingListOutput output = new ContainerTestingListOutput();
			output.setProdCourseId(course.getProdCourseId());
			output.setContainerNo(course.getContainerNo());
			output.setSizeLang(course.getSize());
			output.setContainerCategoryLang(course.getContainerCategory());
			output.setContainerTypeLang(course.getContainerType());
			output.setYardLang(course.getYard());
			output.setContainerUserLang(course.getContainerUser());
			output.setCourseTypeLang(course.getCourseType());
			output.setContainerOwnerLang(course.getContainerOwner());
			// 格式化日期
			if (course.getCourseTime() != null) {
				output.setCourseTime(sdf.format(course.getCourseTime()));
			}
			// 机组检验人
			if (course.getTestingUser() != null) {
				Result<UserInfoOutput> rlt = authClient.getUserDetail(course.getTestingUser());
				if (rlt != null && rlt.getCode().equals(ResultCodeEnum.SUCCESS.getCode())) {
					UserInfoOutput user = rlt.getData();
					if (user != null) {
						output.setTestingUser(user.getUserName());
					}
				}
			}
			output.setTestingStateNameLang(course.getTestingState());
			output.setTestingState(course.getTestingState());
			if (course.getCourseTime() != null) {
				output.setTestingTime(sdf.format(course.getCourseTime()));
			}
			output.setTestingRemarks(course.getTestingRemarks());
			output.setContainerCondition(course.getContainerCondition());
			output.setContainerConditionNameLang(course.getContainerCondition());
			CourseEntryExample courseEntryExample = new CourseEntryExample();

			courseEntryExample.createCriteria().andCourseEqualTo(output.getProdCourseId())
					.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
			List<CourseEntry> courseEntries = courseEntryDao.selectByExampleWithBLOBs(courseEntryExample);
			if (courseEntries != null && courseEntries.size() > 0) {
				output.setHasEntry(true);
				List<CourseEntry> list = courseEntries.stream()
						.filter(entry -> StringUtils.isBlank(entry.getPhoto())
								&& CommonEnum.YES.getCode().equals(entry.getIsMustPhoto()))
						.collect(Collectors.toList());
				output.setNoPhoto(list != null && list.size() > 0);
			} else {
				output.setHasEntry(false);
				output.setNoPhoto(false);
			}

			return output;
		}).collect(Collectors.toList());
		pagedList.setDataList(outputList);
		return pagedList;
	}

	/**
	 *  
	 * 
	 * @Description: TODO 保存箱体进场检验明细信息
	 * @param input 箱体进场检验明细信息 @throws 
	 */
	@Override
	@Transactional
	public void saveContainerCourserEntryInfo(ContainerCourseEntryInfoInput input) throws Exception {
		// TODO Auto-generated method stub
		if (StringUtils.isBlank(input.getContainerCategory())) {
			throw new Exception();
		}
		String containerNo = "";
		if (ContainerCategoryEnum.CONTAINER_04.getCode().equals(input.getContainerCategory())) {
			Maintenance course = maintenanceDao.selectByPrimaryKey(input.getProdCourseId());
			containerNo = course.getContainerNo();
		} else {
			CourseWithBLOBs course = courseDao.selectByPrimaryKey(input.getProdCourseId());
			containerNo = course.getContainerNo();
		}
		Double manHour = new Double(0);
		BigDecimal testingManHourCost = new BigDecimal(0);
		BigDecimal testingMaterialCost = new BigDecimal(0);
		BigDecimal testingThirdpartyMoney = new BigDecimal(0);
		BigDecimal testingMoney = new BigDecimal(0);
		List<CourseEntry> entryList = new ArrayList<>();
		if (input.getPartList() != null && input.getPartList().size() > 0) {
			int sort = 1;
			for (ContainerCourseEntryInput cceInput : input.getPartList()) {
				CourseEntry courseEntry = new CourseEntry();
				courseEntry.setPositionCode(cceInput.getPositionCode());
				if (StringUtils.isNotBlank(input.getContainerCategory())) {
					courseEntry.setContainerCategory(input.getContainerCategory());
				} else {
					courseEntry.setContainerCategory(ContainerCategoryEnum.CONTAINER_01.getCode());
				}
				courseEntry.setSerialNumber(sort++);
				courseEntry.setCourse(input.getProdCourseId());
				courseEntry.setPartsDetailsCode(cceInput.getPartsDetailsCode());
				courseEntry.setPartsRepairCode(cceInput.getPartsRepairCode());
				courseEntry.setPartsTypeCode(cceInput.getPartTypeCode());
				courseEntry.setSparesNumber(cceInput.getSparesNum());
				courseEntry.setWarehouseType(cceInput.getWarehouseType());
				courseEntry.setWarehouse(cceInput.getWarehouse());
				courseEntry.setCompany(cceInput.getCompany());
				courseEntry.setIsOriginal(cceInput.getIsOriginal());
				if (StringUtils.isNotBlank(cceInput.getPrice())) {
					courseEntry.setPrice(new BigDecimal(cceInput.getPrice()));
				} else {
					courseEntry.setPrice(new BigDecimal(0));
				}
				courseEntry.setRepairCode(cceInput.getRepairCode());
				courseEntry.setDamageCode(cceInput.getDamageCode());
				courseEntry.setMaterialCode(cceInput.getMaterialCode());
				if (StringUtils.isNotBlank(cceInput.getLength())) {
					courseEntry.setLength(Double.valueOf(cceInput.getLength()));
				} else {
					courseEntry.setLength(0d);
				}
				if (StringUtils.isNotBlank(cceInput.getWidth())) {
					courseEntry.setWidth(Double.valueOf(cceInput.getWidth()));
				} else {
					courseEntry.setWidth(0d);
				}
				if (StringUtils.isNotBlank(cceInput.getQuantity())) {
					courseEntry.setQuantity(Double.valueOf(cceInput.getQuantity()));
				} else {
					courseEntry.setQuantity(0d);
				}
				if (StringUtils.isNotBlank(cceInput.getThirdpartyMoney())) {
					courseEntry.setThirdpartyMoney(new BigDecimal(cceInput.getThirdpartyMoney()));
				}
				courseEntry.setPayingParty(cceInput.getPayingParty());
				courseEntry.setRemarks(cceInput.getRemarks());
				courseEntry.setPhoto(cceInput.getPhoto());
				courseEntry.setDevice(cceInput.getDevice());
				courseEntry.setWarehouseType(cceInput.getWarehouseType());
				courseEntry.setManHour(new Double(cceInput.getManHour()));
				courseEntry.setManHourCost(new BigDecimal(cceInput.getManHourCost()));
				courseEntry.setMaterialCost(new BigDecimal(cceInput.getMaterialCost()));
				courseEntry.setSumMoney(new BigDecimal(cceInput.getSumMoney()));
				courseEntry.setRateId(cceInput.getRateId());
				courseEntry.setFiveCode(cceInput.getFiveCode());
				courseEntry.setIsMustPhoto(cceInput.getIsMustPhoto());

				courseEntry.setIsDel(PlatformConstants.ISDEL_NO);
				if (StringUtils.isBlank(cceInput.getCourseEntryId())) {
					courseEntry.setProdCourseEntryId(ruleService.generateCourseEntryKey(containerNo));
					courseEntry.setCreateTime(new Date());
					courseEntry.setCreateUser(getCurrentUserId());
					courseEntry.setIsCharge(CommonEnum.NO.getCode());
					courseEntryDao.insert(courseEntry);
				} else {
					if (cceInput.getIsChargeKey() != null) {
						courseEntry.setIsCharge(cceInput.getIsChargeKey());
					}
					courseEntry.setProdCourseEntryId(cceInput.getCourseEntryId());
					courseEntry.setUpdateTime(new Date());
					courseEntry.setUpdateUser(getCurrentUserId());
					courseEntryDao.updateByPrimaryKeyWithBLOBs(courseEntry);
				}
				entryList.add(courseEntry);
				manHour += courseEntry.getManHour();
				if (courseEntry.getManHourCost() != null) {
					testingManHourCost = testingManHourCost.add(courseEntry.getManHourCost());
				}
				if (courseEntry.getMaterialCost() != null) {
					testingMaterialCost = testingMaterialCost.add(courseEntry.getMaterialCost());
				}
				if (courseEntry.getThirdpartyMoney() != null) {
					testingThirdpartyMoney = testingThirdpartyMoney.add(courseEntry.getThirdpartyMoney());
				}
				testingMoney = testingMoney.add(courseEntry.getSumMoney());

			}
		}

		if (ContainerCategoryEnum.CONTAINER_03.getCode().equals(input.getContainerCategory())) {
			UnitCourseWithBLOBs unitCourse = unitCourseDao.selectByPrimaryKey(input.getProdCourseId());
			unitCourse.setAfterPhoto(input.getAfterPhoto());
			if (StringUtils.isNotBlank(input.getIsPreview())) {
				unitCourse.setIsPreview(input.getIsPreview());
			}
			unitCourse.setTestingEndTime(new Date());
			if (StringUtils.isNotBlank(input.getTestingUser())) {
				unitCourse.setTestingUser(Integer.valueOf(input.getTestingUser()));
			}

			unitCourse.setUpdateTime(new Date());
			unitCourse.setUpdateUser(getCurrentUserId());
			unitCourse.setManHour(manHour);
			unitCourse.setTestingManHourCost(testingManHourCost);
			unitCourse.setTestingMaterialCost(testingMaterialCost);
			unitCourse.setTestingThirdpartyMoney(testingThirdpartyMoney);
			unitCourse.setTestingMoney(testingMoney);
			unitCourseDao.updateByPrimaryKeyWithBLOBs(unitCourse);
		} else if (ContainerCategoryEnum.CONTAINER_04.getCode().equals(input.getContainerCategory())) {
			MaintenanceWithBLOBs maintenance = maintenanceDao.selectByPrimaryKey(input.getProdCourseId());
			maintenance.setAfterPhoto(input.getAfterPhoto());
			maintenance.setTestingEndTime(new Date());
			if (StringUtils.isNotBlank(input.getTestingUser())) {
				maintenance.setTestingUser(Integer.valueOf(input.getTestingUser()));
			}

			maintenance.setUpdateTime(new Date());
			maintenance.setUpdateUser(getCurrentUserId());
			maintenance.setManHour(manHour);
			maintenance.setTestingManHourCost(testingManHourCost);
			maintenance.setTestingMaterialCost(testingMaterialCost);
			maintenance.setTestingThirdpartyMoney(testingThirdpartyMoney);
			maintenance.setTestingMoney(testingMoney);
			maintenanceDao.updateByPrimaryKeyWithBLOBs(maintenance);
		} else {
			CourseWithBLOBs course = courseDao.selectByPrimaryKey(input.getProdCourseId());
			course.setAfterPhoto(input.getAfterPhoto());
			course.setIsPreview(input.getIsPreview());
			course.setTestingEndTime(new Date());
			if (StringUtils.isNotBlank(input.getTestingUser())) {
				course.setTestingUser(Integer.valueOf(input.getTestingUser()));
			}
			course.setUpdateTime(new Date());
			course.setUpdateUser(getCurrentUserId());
			course.setManHour(manHour);
			course.setTestingManHourCost(testingManHourCost);
			course.setTestingMaterialCost(testingMaterialCost);
			course.setTestingThirdpartyMoney(testingThirdpartyMoney);
			course.setTestingMoney(testingMoney);
			courseDao.updateByPrimaryKeyWithBLOBs(course);
		}
		if (!ContainerCategoryEnum.CONTAINER_04.getCode().equals(input.getContainerCategory())) {
			CleaningAddInput cInput = new CleaningAddInput();
			cInput.setCourseId(input.getProdCourseId());
			cInput.setSource(CleaningSourceEnum.PTI);
			cInput.setContainerCategory(input.getContainerCategory());
			cInput.setIsSpecial(getIsSpecial(entryList, input.getContainerCategory()) ? CommonEnum.YES : CommonEnum.NO);
			cleaningService.addCleaning(cInput);
		}
	}

	private Boolean getIsSpecial(List<CourseEntry> entryList, String containerCategory) {
		// 干箱
		if (ContainerCategoryEnum.CONTAINER_01.getCode().equals(containerCategory)) {
			for (CourseEntry item : entryList) {
				// 如果包含洗箱条目
				if (CleaningEntryEnum.MCOCC.getCode().equals(item.getPartsRepairCode())) {
					return true;
				}
			}
		} else {
			// 冷箱
			for (CourseEntry item : entryList) {
				// 如果包含洗箱条目
				if (CleaningEntryEnum.CC.getCode().equals(item.getRepairCode())) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 *  
	 * 
	 * @Description: TODO 查看箱体进场检验明细信息列表
	 * @param prodCourseId 进场id
	 * @return ContainerCourseEntryInfoOutput 箱体进场检验明细信息列表 @throws 
	 */
	@Override
	public ContainerCourseEntryInfoOutput containerCourseEntryList(String prodCourseId, String containerCategory) {
		// TODO Auto-generated method stub
		if (StringUtils.isBlank(containerCategory)) {
			containerCategory = ContainerCategoryEnum.CONTAINER_01.getCode();
		}
		Map<String, String> pickingMap = new HashMap<String, String>();
		ContainerCourseEntryInfoOutput output = new ContainerCourseEntryInfoOutput();
		if (ContainerCategoryEnum.CONTAINER_03.getCode().equals(containerCategory)) {
			UnitCourseWithBLOBs unitCourseWithBLOBs = unitCourseDao.selectByPrimaryKey(prodCourseId);
			if (unitCourseWithBLOBs != null) {
				output.setAfterPhoto(unitCourseWithBLOBs.getAfterPhoto());
				output.setTestingPhoto(unitCourseWithBLOBs.getUnitPhoto());
				output.setIsPreview(unitCourseWithBLOBs.getIsPreview());
			}
		} else if (ContainerCategoryEnum.CONTAINER_04.getCode().equals(containerCategory)) {
			MaintenanceWithBLOBs unitCourseWithBLOBs = maintenanceDao.selectByPrimaryKey(prodCourseId);
			if (unitCourseWithBLOBs != null) {
				output.setAfterPhoto(unitCourseWithBLOBs.getAfterPhoto());
			}
			if (StringUtils.isNotBlank(unitCourseWithBLOBs.getReferralState())) {
				ReferralEntryExample example = new ReferralEntryExample();
				example.createCriteria().andCourseEqualTo(prodCourseId).andContainerCategoryEqualTo(containerCategory)
						.andPickingStateIn(Arrays.asList(PickingStateEnum.STOCKOUT.getCode(),
								PickingStateEnum.STOCKOUTALL.getCode()));
				List<ReferralEntry> referralEntries = referralEntryDao.selectByExample(example);
				if (referralEntries != null && referralEntries.size() > 0) {
					pickingMap = referralEntries.stream().collect(
							Collectors.toMap(ReferralEntry::getProdReferralEntryId, ReferralEntry::getPickingState));
				}
			}

		} else {
			CourseWithBLOBs courseWithBLOBs = courseDao.selectByPrimaryKey(prodCourseId);
			if (courseWithBLOBs != null) {
				output.setAfterPhoto(courseWithBLOBs.getAfterPhoto());
				output.setTestingPhoto(courseWithBLOBs.getTestingPhoto());
				output.setSpeedPhoto(courseWithBLOBs.getSpeedPhoto());
				output.setIsPreview(courseWithBLOBs.getIsPreview());
			}
		}
		CourseEntryExample example = new CourseEntryExample();
		example.createCriteria().andCourseEqualTo(prodCourseId).andContainerCategoryEqualTo(containerCategory)
				.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		example.setOrderByClause("serial_number asc");
		List<CourseEntry> courseEntries = courseEntryDao.selectByExampleWithBLOBs(example);
		if (courseEntries != null && courseEntries.size() > 0) {
			List<ContainerCourseEntryOutput> dataList = new ArrayList<ContainerCourseEntryOutput>();
			for (CourseEntry courseEntrie : courseEntries) {
				ContainerCourseEntryOutput cceOutput = new ContainerCourseEntryOutput();
				cceOutput.setCourseEntryId(courseEntrie.getProdCourseEntryId());
				cceOutput.setPositionCode(courseEntrie.getPositionCode());
				cceOutput.setPartTypeCode(courseEntrie.getPartsTypeCode());
				cceOutput.setRepairCode(courseEntrie.getRepairCode());
				cceOutput.setDamageCode(courseEntrie.getDamageCode());
				cceOutput.setMaterialCode(courseEntrie.getMaterialCode());
				cceOutput.setPartsDetailsCode(courseEntrie.getPartsDetailsCode());
				cceOutput.setPartsRepairCode(courseEntrie.getPartsRepairCode());
				cceOutput.setPartTypeNameLang(courseEntrie.getPartsTypeCode());
				cceOutput.setRepairNameLang(courseEntrie.getRepairCode());
				cceOutput.setDamageNameLang(courseEntrie.getDamageCode());
				cceOutput.setMaterialNameLang(courseEntrie.getMaterialCode());
				cceOutput.setPartsDetailsNameLang(courseEntrie.getPartsDetailsCode());
				cceOutput.setPartsRepairNameLang(courseEntrie.getPartsRepairCode());
				cceOutput.setSparesNum(courseEntrie.getSparesNumber());
				cceOutput.setPrice(StringUtil.bigDecimalToEffectString(courseEntrie.getPrice()));
				cceOutput.setIsOriginal(courseEntrie.getIsOriginal());
				cceOutput.setWarehouseType(courseEntrie.getWarehouseType());
				cceOutput.setWarehouseTypeNameLang(courseEntrie.getWarehouseType());
				cceOutput.setCompany(courseEntrie.getCompany());
				cceOutput.setCompanyNameLang(courseEntrie.getCompany());
				cceOutput.setWarehouse(courseEntrie.getWarehouse());
				cceOutput.setWarehouseNameLang(courseEntrie.getWarehouse());
				cceOutput.setLength(StringUtil.doubleToIntString(courseEntrie.getLength()));
				cceOutput.setWidth(StringUtil.doubleToIntString(courseEntrie.getWidth()));
				cceOutput.setQuantity(StringUtil.doubleToEffectString(courseEntrie.getQuantity()));
				cceOutput.setSumMoney(StringUtil.bigDecimalToEffectString(courseEntrie.getSumMoney()));
				cceOutput.setThirdpartyMoney(StringUtil.bigDecimalToEffectString(courseEntrie.getThirdpartyMoney()));
				cceOutput.setPayingParty(courseEntrie.getPayingParty());
				cceOutput.setRemarks(courseEntrie.getRemarks());
				cceOutput.setPhoto(courseEntrie.getPhoto());
				cceOutput.setManHour(StringUtil.doubleToEffectString(courseEntrie.getManHour()));
				cceOutput.setRateId(courseEntrie.getRateId());
				cceOutput.setFiveCode(courseEntrie.getFiveCode());
				cceOutput.setDevice(courseEntrie.getDevice());
				cceOutput.setManHourCost(StringUtil.bigDecimalToEffectString(courseEntrie.getManHourCost()));
				cceOutput.setMaterialCost(StringUtil.bigDecimalToEffectString(courseEntrie.getMaterialCost()));
				cceOutput.setIsMustPhoto(courseEntrie.getIsMustPhoto());
				cceOutput.setIsChargeKey(courseEntrie.getIsCharge());
				cceOutput.setIsChargeLang(courseEntrie.getIsCharge());
				if (courseEntrie.getPhoto() != null && !"[]".equals(courseEntrie.getPhoto())) {
					cceOutput.setPhotoNum(StringUtil.valueOf(courseEntrie.getPhoto().split("\\},\\{").length));
				} else {
					cceOutput.setPhotoNum("0");
				}
				cceOutput.setCanEdit(!pickingMap.containsKey(courseEntrie.getProdCourseEntryId()));
				dataList.add(cceOutput);
			}
			output.setDataList(dataList);
		}

		// 签字照片
		ChargeExample chargeExample = new ChargeExample();
		chargeExample.createCriteria().andCourseEqualTo(prodCourseId).andContainerCategoryEqualTo(containerCategory);
		List<Charge> charges = chargeDao.selectByExample(chargeExample);
		if (charges != null && charges.size() > 0) {
			output.setSignaturePic(charges.get(0).getSignaturePic());
		} else {
			output.setSignaturePic(null);
		}
		return output;
	}

	/**
	 *  
	 * 
	 * @Description: TODO 批量设置好Container
	 * @param input void @throws 
	 */
	@Override
	public void setContainerState(SetContainerStateInput input) {
		if (input != null && input.getProdCourseIdList().length > 0
				&& (input.getContainerState() != ContainerStateEnum.GOOD.getCode()
						|| input.getContainerState() != ContainerStateEnum.BAD.getCode())) {
			// 批量更新内容
			CourseWithBLOBs record = new CourseWithBLOBs();
			record.setContainerCondition(input.getContainerState());
			if (ContainerStateEnum.GOOD.getCode().equals(input.getContainerState())) {
				record.setTestingState(TestingStateEnum.AUDITED.getCode());
			} else if (ContainerStateEnum.BAD.getCode().equals(input.getContainerState())) {
				record.setTestingState(TestingStateEnum.TESTING.getCode());
			}
			record.setUpdateTime(new Date());
			record.setUpdateUser(getCurrentUserId());
			// 批量更新条目
			CourseExample example = new CourseExample();
			example.createCriteria().andProdCourseIdIn(Arrays.asList(input.getProdCourseIdList()));
			courseDao.updateByExampleSelective(record, example);
		}
	}

	/**
	 *  
	 * 
	 * @Description: TODO 批量提交Container检验
	 * @param input void @throws 
	 */
	@Override
	public void submitContainerTesting(SetContainerStateInput input) {
		if (input != null && input.getProdCourseIdList().length > 0) {
			// 批量更新内容
			CourseWithBLOBs record = new CourseWithBLOBs();
			record.setTestingState(TestingStateEnum.UNAUDIT.getCode());
			record.setUpdateTime(new Date());
			record.setUpdateUser(getCurrentUserId());
			// 批量更新条件
			CourseExample example = new CourseExample();
			example.createCriteria().andProdCourseIdIn(Arrays.asList(input.getProdCourseIdList()));
			courseDao.updateByExampleSelective(record, example);
		}
	}

	/**
	 *  
	 * 
	 * @Description: TODO Container检验审核驳回
	 * @param input void @throws 
	 */
	@Override
	public void auditContainerTesting(AuditContainerInput input) {
		if (input != null && input.getProdCourseIdList().length > 0
				&& (TestingStateEnum.AUDITED.getCode().equals(input.getAuditType())
						|| TestingStateEnum.REJECTED.getCode().equals(input.getAuditType()))) {
			// 批量更新内容
			CourseWithBLOBs record = new CourseWithBLOBs();
			record.setTestingState(input.getAuditType());
			record.setTestingEndTime(new Date());
			record.setTestingReject(input.getReason());
			record.setAuditTime(new Date());
			record.setAuditUser(getCurrentUserId());
			record.setAuditType(AuditTypeEnum.AuditTypeEnum_01.getCode());
			record.setUpdateTime(new Date());
			record.setUpdateUser(getCurrentUserId());
			// 批量更新条件
			CourseExample example = new CourseExample();
			example.createCriteria().andProdCourseIdIn(Arrays.asList(input.getProdCourseIdList()));
			courseDao.updateByExampleSelective(record, example);
		}
	}

	/**
	 *  
	 * 
	 * @Description: TODO 根据箱号获取箱体基本信息
	 * @param containerNo 箱号
	 * @return ContainerInfoOutput 箱体信息 @throws 
	 */
	@Override
	public ContainerCourseOutput containerCourseByContainerNo(String containerNo) {
		// TODO Auto-generated method stub
		if (StringUtils.isNotBlank(containerNo)) {
			ContainerCourseOutput containerCourseOutput = new ContainerCourseOutput();
			CourseExample example = new CourseExample();
			example.createCriteria().andContainerNoEqualTo(containerNo);
			example.setOrderByClause("course_time desc");
			List<CourseWithBLOBs> courses = courseDao.selectByExampleWithBLOBs(example);
			if (courses != null && courses.size() > 0) {
				// 获取最新一次进场信息
				CourseWithBLOBs record = courses.get(0);
				containerCourseOutput.setProdCourseId(record.getProdCourseId());
				containerCourseOutput.setContainerNo(record.getContainerNo());
				containerCourseOutput.setSize(record.getSize());
				containerCourseOutput.setContainerCategory(record.getContainerCategory());
				containerCourseOutput.setContainerType(record.getContainerType());
				containerCourseOutput.setEntryType(record.getCourseType());
				containerCourseOutput.setContainerUser(record.getContainerUser());
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
				if (record.getCourseTime() != null) {
					containerCourseOutput.setEntryDate(sdf.format(record.getCourseTime()));
				}
				containerCourseOutput.setAuditType(record.getTestingState());
				containerCourseOutput.setContainerCondition(record.getContainerCondition());
				containerCourseOutput.setAuditTypeNameLang(record.getTestingState());
				containerCourseOutput.setContainerConditionNameLang(record.getContainerCondition());
				containerCourseOutput.setBillOfLadingNo(record.getBillOfLadingNo());
				containerCourseOutput.setVesselVoyage(record.getVesselVoyage());
				containerCourseOutput.setContainerAge(record.getContainerAge());
				containerCourseOutput.setDomesticForeignTrade(record.getDomesticForeignTrade());
				containerCourseOutput.setContainerLevel(record.getContainerGrade());
				containerCourseOutput.setIsFreezeDry(record.getIsFreezeDry());
				containerCourseOutput.setIsGonContainer(record.getIsGonContainer());
				containerCourseOutput.setLabelling(record.getLabelling());
				containerCourseOutput.setRemark(record.getTestingRemarks());
				containerCourseOutput.setContainerTare(StringUtil.valueOf(record.getContainerTare()));
				containerCourseOutput.setContainerLoad(StringUtil.valueOf(record.getContainerLoad()));
				containerCourseOutput.setLeadSealing(record.getLeadSealing());
				containerCourseOutput.setBareWeight(record.getBareWeight());
				containerCourseOutput.setContainerVolume(StringUtil.valueOf(record.getContainerVolume()));
				containerCourseOutput.setGrossWeight(StringUtil.valueOf(record.getGrossWeight()));
				containerCourseOutput.setContainerConditionCategory(record.getYardContainerType());
				containerCourseOutput.setTestingPhoto(record.getTestingPhoto());
				containerCourseOutput.setContainerBelong(record.getContainerBelong());
				containerCourseOutput.setUnitType(record.getUnitType());
				containerCourseOutput.setIsSurrender(record.getIsSurrender());
				containerCourseOutput.setRightAngle(record.getRightAngle());
				containerCourseOutput.setIsCleanout(record.getIsCleanout());
				containerCourseOutput.setIsLocator(record.getIsLocator());
				containerCourseOutput.setIsLabel(record.getIsLabel());
			} else {
				// 没有进场信息 通过箱基本信息获取
				ContainerExample containerExample = new ContainerExample();
				containerExample.createCriteria().andContainerNoEqualTo(containerNo);
				List<Container> containers = containerDao.selectByExample(containerExample);
				if (containers != null && containers.size() > 0) {
					Container record = containers.get(0);
					containerCourseOutput.setContainerNo(record.getContainerNo());
					containerCourseOutput.setSize(record.getSize());
					containerCourseOutput.setContainerCategory(record.getContainerCategory());
					containerCourseOutput.setContainerType(record.getContainerType());
					containerCourseOutput.setContainerAge(record.getContainerAge());
					containerCourseOutput.setContainerTare(StringUtil.valueOf(record.getContainerTare()));
					containerCourseOutput.setContainerLoad(StringUtil.valueOf(record.getContainerLoad()));
					containerCourseOutput.setContainerVolume(StringUtil.valueOf(record.getContainerVolume()));
					containerCourseOutput.setUnitType(record.getUnitType());
					containerCourseOutput.setRightAngle(record.getRightAngle());
					containerCourseOutput.setIsLabel(record.getIsLabel());
				}
			}
			containerCourseOutput.setIsSurrender(isSurrender(containerNo));
			return containerCourseOutput;
		}
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 *  
	 * 
	 * @Description: TODO 根据进场获取箱体基本信息
	 * @param prodCourseId 进场信息
	 * @return ContainerInfoOutput 箱体信息 @throws 
	 */
	@Override
	public ContainerCourseOutput containerCourse(String prodCourseId, String containerCategory) {
		// TODO Auto-generated method stub
		if (StringUtils.isNotBlank(prodCourseId)) {
			ContainerCourseOutput containerCourseOutput = new ContainerCourseOutput();
			CourseWithBLOBs record = courseDao.selectByPrimaryKey(prodCourseId);
			if (record != null) {
				containerCourseOutput.setProdCourseId(record.getProdCourseId());
				containerCourseOutput.setContainerNo(record.getContainerNo());
				containerCourseOutput.setSize(record.getSize());
				containerCourseOutput.setContainerCategory(record.getContainerCategory());
				containerCourseOutput.setContainerType(record.getContainerType());
				containerCourseOutput.setEntryType(record.getCourseType());
				containerCourseOutput.setContainerUser(record.getContainerUser());
				containerCourseOutput.setContainerOwner(record.getContainerOwner());
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
				if (record.getCourseTime() != null) {
					containerCourseOutput.setEntryDate(sdf.format(record.getCourseTime()));
				}
				if (record.getTestingTime() != null) {
					containerCourseOutput.setTestingTime(sdf.format(record.getTestingTime()));
				}
				containerCourseOutput.setTestingUser(StringUtil.valueOf(record.getTestingUser()));
				containerCourseOutput.setAuditType(record.getTestingState());
				containerCourseOutput.setContainerCondition(record.getContainerCondition());
				containerCourseOutput.setAuditTypeNameLang(record.getTestingState());
				containerCourseOutput.setContainerConditionNameLang(record.getContainerCondition());
				containerCourseOutput.setBillOfLadingNo(record.getBillOfLadingNo());
				containerCourseOutput.setVesselVoyage(record.getVesselVoyage());
				containerCourseOutput.setContainerAge(record.getContainerAge());
				containerCourseOutput.setDomesticForeignTrade(record.getDomesticForeignTrade());
				containerCourseOutput.setContainerLevel(record.getContainerGrade());
				containerCourseOutput.setIsFreezeDry(record.getIsFreezeDry());
				containerCourseOutput.setIsGonContainer(record.getIsGonContainer());
				containerCourseOutput.setLabelling(record.getLabelling());
				containerCourseOutput.setRemark(record.getTestingRemarks());
				containerCourseOutput.setContainerTare(record.getContainerTare());
				containerCourseOutput.setContainerLoad(record.getContainerLoad());
				containerCourseOutput.setLeadSealing(record.getLeadSealing());
				containerCourseOutput.setBareWeight(record.getBareWeight());
				containerCourseOutput.setContainerVolume(record.getContainerVolume());
				containerCourseOutput.setGrossWeight(record.getGrossWeight());
				containerCourseOutput.setContainerConditionCategory(record.getYardContainerType());
				containerCourseOutput.setTestingPhoto(record.getTestingPhoto());
				containerCourseOutput.setContainerBelong(record.getContainerBelong());
				containerCourseOutput.setUnitType(record.getUnitType());
				containerCourseOutput.setIsSurrender(record.getIsSurrender());
				containerCourseOutput.setRightAngle(record.getRightAngle());
				containerCourseOutput.setIsCleanout(record.getIsCleanout());
				containerCourseOutput.setIsLocator(record.getIsLocator());
				containerCourseOutput.setIsLabel(record.getIsLabel());
				containerCourseOutput.setValuationCurrency(record.getValuationCurrency());
				containerCourseOutput.setYardKey(record.getYard());
				containerCourseOutput.setQualityResultLang(record.getQualityResult());
				// 箱东扣款
				if (StringUtils.isNotEmpty(record.getUseReplyState())
						&& record.getUseReplyState().equals(ReplyStateEnum.APPLYED.getCode())) {
					if (StringUtils.isNotEmpty(record.getIsOwnerCharge())
							&& record.getIsOwnerCharge().equals(CommonEnum.YES.getCode())) {
						containerCourseOutput.setIsMasterCharge(CommonEnum.YES.getCode());
					} else {
						// 只有这种情况才显示按钮
						containerCourseOutput.setIsMasterCharge(CommonEnum.NO.getCode());
					}
				} else {
					containerCourseOutput.setIsMasterCharge(CommonEnum.YES.getCode());
				}

				if (StringUtils.isNotEmpty(containerCategory)
						&& containerCategory.equals(ContainerCategoryEnum.CONTAINER_03.getCode())) {
					UnitCourse unitCourse = unitCourseDao.selectByPrimaryKey(prodCourseId);
					if (unitCourse != null) {
						containerCourseOutput.setUseReplyState(unitCourse.getUseReplyState());
						containerCourseOutput.setUseReplyStateNameLang(unitCourse.getUseReplyState());
						containerCourseOutput.setReferralStateKey(unitCourse.getReferralState());
						containerCourseOutput.setReferralStateLang(unitCourse.getReferralState());
						containerCourseOutput.setQualityResultLang(unitCourse.getQualityResult());
						containerCourseOutput.setMasterReplyState(unitCourse.getMasterReplyState());
						containerCourseOutput.setMasterReplyStateNameLang(unitCourse.getMasterReplyState());
					}

				} else {
					containerCourseOutput.setUseReplyState(record.getUseReplyState());
					containerCourseOutput.setUseReplyStateNameLang(record.getUseReplyState());
					containerCourseOutput.setReferralStateKey(record.getReferralState());
					containerCourseOutput.setReferralStateLang(record.getReferralState());
					containerCourseOutput.setMasterReplyState(record.getMasterReplyState());
					containerCourseOutput.setMasterReplyStateNameLang(record.getMasterReplyState());
				}

				if (CommonEnum.YES.getCode().equals(record.getIsGonContainer())) {
					// 挂衣箱信息
					GohContainerExample gohExample = new GohContainerExample();
					gohExample.createCriteria().andCourseEqualTo(record.getProdCourseId());
					List<GohContainer> gohList = gohContainerMapper.selectByExample(gohExample);
					if (gohList.size() > 0) {
						GohContainer goh = gohList.get(0);
						containerCourseOutput.setStructure(goh.getStructure());
						containerCourseOutput.setSumBeamNumber(goh.getSumBeamNumber());
						containerCourseOutput.setLoseBeamNumber(goh.getLoseBeamNumber());
						containerCourseOutput.setHorizontalDistance(goh.getHorizontalDistance());
						containerCourseOutput.setUpdownDistance(goh.getUpdownDistance());
						containerCourseOutput.setIsGoh(goh.getIsGoh());
						containerCourseOutput.setGohRemark(goh.getRemarks());
					}
				}
			}
			return containerCourseOutput;
		}
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 *  
	 * 
	 * @Description: TODO 保存箱体进场信息
	 * @param input 箱体进场信息 @throws 
	 * @return String 进场id @throws 
	 */
	@Override
	public String saveContainerCourse(ContainerCourseInput input) {
		// TODO Auto-generated method stub
		CourseWithBLOBs record = null;
		if (input != null && input.getProdCourseId() != null) {
			record = courseDao.selectByPrimaryKey(input.getProdCourseId());
		}
		if (record == null) {
			record = new CourseWithBLOBs();
		}
		record.setProdCourseId(input.getProdCourseId());
		record.setContainerNo(input.getContainerNo());
		record.setSize(input.getSize());
		record.setContainerType(input.getContainerType());
		ContainerTypeExample example = new ContainerTypeExample();
		example.createCriteria().andKeyEqualTo(input.getContainerType().trim());
		List<com.sanlly.production.entity.ContainerType> containerTypes = containerTypeDao.selectByExample(example);
		if (containerTypes != null && containerTypes.size() > 0) {
			record.setContainerCategory(containerTypes.get(0).getContainerCategory());
		}
		record.setCourseType(input.getEntryType());
		record.setContainerUser(input.getContainerUser());
		if (StringUtils.isNotBlank(input.getTestingUser())) {
			record.setTestingUser(Integer.valueOf(input.getTestingUser()));
		} else {
			record.setTestingUser(getCurrentUserId());
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		try {
			if (StringUtils.isNotBlank(input.getEntryDate())) {
				record.setCourseTime(sdf.parse(input.getEntryDate()));
			} else {
				record.setCourseTime(new Date());
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			record.setCourseTime(new Date());
		}
		try {
			if (StringUtils.isNotBlank(input.getTestingTime())) {
				record.setTestingTime(sdf.parse(input.getTestingTime()));
			} else {
				record.setTestingTime(new Date());
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			record.setTestingTime(new Date());
		}
		record.setContainerCondition(input.getContainerCondition());
		if (ContainerStateEnum.UNKNOWN.getCode().equals(input.getContainerCondition())) {
			record.setTestingState(TestingStateEnum.UNTEST.getCode());
		} else if (ContainerStateEnum.GOOD.getCode().equals(input.getContainerCondition())) {
			record.setTestingState(TestingStateEnum.AUDITED.getCode());
		} else {
			if (StringUtils.isBlank(record.getTestingState())
					|| TestingStateEnum.REJECTED.getCode().equals(record.getTestingState())
					|| TestingStateEnum.UNTEST.getCode().equals(record.getTestingState())) {
				record.setTestingState(TestingStateEnum.TESTING.getCode());
			}
		}
		record.setBillOfLadingNo(input.getBillOfLadingNo());
		record.setVesselVoyage(input.getVesselVoyage());
		record.setContainerAge(input.getContainerAge());
		record.setDomesticForeignTrade(input.getDomesticForeignTrade());
		record.setContainerGrade(input.getContainerLevel());
		record.setIsFreezeDry(input.getIsFreezeDry());
		record.setIsGonContainer(input.getIsGonContainer());
		record.setLabelling(input.getLabelling());
		record.setTestingRemarks(input.getRemark());
		record.setLeadSealing(input.getLeadSealing());
		record.setContainerTare(input.getContainerTare());
		record.setContainerLoad(input.getContainerLoad());
		record.setBareWeight(input.getBareWeight());
		record.setContainerVolume(input.getContainerVolume());
		record.setGrossWeight(input.getGrossWeight());
		record.setYardContainerType(input.getContainerConditionCategory());
		record.setTestingPhoto(input.getTestingPhoto());
		record.setContainerBelong(input.getContainerBelong());
		record.setContainerOwner(input.getContainerOwner());
		record.setUnitType(input.getUnitType());
		record.setCourseType(input.getEntryType());
		if (StringUtils.isNotBlank(input.getIsSurrender())) {
			record.setIsSurrender(input.getIsSurrender());
		} else {
			record.setIsSurrender(CommonEnum.NO.getCode());
		}
		record.setRightAngle(input.getRightAngle());
		record.setIsCleanout(input.getIsCleanout());
		record.setIsLocator(input.getIsLocator());
		record.setIsLabel(input.getIsLabel());
		if (StringUtils.isNotBlank(input.getYardKey())) {
			record.setYard(input.getYardKey());
		} else {
			if (StringUtils.isBlank(record.getYard())) {
				record.setYard(getCurrentYardKey());
			}
		}
		if (StringUtils.isNotEmpty(input.getAfterPhoto())) {
			record.setAfterPhoto(input.getAfterPhoto());
		}
		// TODO Auto-generated method stub
		if (StringUtils.isNotBlank(input.getProdCourseId())) {
			// 修改时间
			record.setUpdateTime(new Date());
			// 修改人
			record.setUpdateUser(getCurrentUserId());
			courseDao.updateByPrimaryKeyWithBLOBs(record);
		} else {
			record.setProdCourseId(ruleService.generateCourseKey(input.getContainerNo()));
			// 创建时间
			record.setCreateTime(new Date());
			// 创建人
			record.setCreateUser(getCurrentUserId());
			courseDao.insert(record);
			if (CommonEnum.YES.getCode().equals(record.getIsSurrender())) {
				containerSurrender(record.getProdCourseId());
			}
		}
		// 机组没有进场信息添加紧张进场
		if (ContainerCategoryEnum.CONTAINER_02.getCode().equals(record.getContainerCategory())) {
			UnitCourseWithBLOBs unit = unitCourseDao.selectByPrimaryKey(record.getProdCourseId());
			if (unit == null) {
				unit = new UnitCourseWithBLOBs();
				unit.setProdCourseId(record.getProdCourseId());
				unit.setContainerNo(record.getContainerNo());
				unit.setContainerType(record.getContainerType());
				unit.setContainerUser(record.getContainerUser());
				unit.setSize(record.getSize());
				unit.setCourseType(record.getCourseType());
				unit.setUnitCompany(input.getUnitType());
				unit.setYard(record.getYard());
				unit.setUnitState(UnitStateEnum.UNKNOWN.getCode());
				unit.setTestingState(TestingStateEnum.UNTEST.getCode());
				unit.setCreateTime(new Date());
				unit.setCreateUser(getCurrentUserId());
				unitCourseDao.insert(unit);
			} else {
				unit.setContainerNo(record.getContainerNo());
				unit.setContainerType(record.getContainerType());
				unit.setContainerUser(record.getContainerUser());
				unit.setSize(record.getSize());
				unit.setCourseType(record.getCourseType());
				unit.setYard(record.getYard());
				unitCourseDao.updateByPrimaryKey(unit);
			}
		}
		// 箱基本型信息没有 添加箱基本信息
		ContainerExample containerExample = new ContainerExample();
		containerExample.createCriteria().andContainerNoEqualTo(record.getContainerNo());
		List<Container> containers = containerDao.selectByExample(containerExample);
		if (containers == null || containers.size() == 0) {
			Container container = new Container();
			container.setProdContainerId(ruleService.generateContainerId(input.getContainerNo()));
			container.setContainerNo(record.getContainerNo());
			container.setSize(record.getSize());
			container.setContainerCategory(record.getContainerCategory());
			container.setContainerType(record.getContainerType());
			container.setContainerAge(record.getContainerAge());
			container.setContainerTare(record.getContainerTare());
			container.setContainerLoad(record.getContainerLoad());
			container.setContainerVolume(record.getContainerVolume());
			container.setUnitType(record.getUnitType());
			container.setRightAngle(record.getRightAngle());
			container.setIsLabel(record.getIsLabel());
			containerDao.insert(container);
		}

		// 洗箱接口
		// CleaningAddInput cleaningAddInput = new CleaningAddInput();
		// cleaningAddInput.setContainerCategory(record.getContainerCategory());
		// cleaningAddInput.setCourseId(record.getProdCourseId());
		// cleaningAddInput.setSource(CleaningSourceEnum.PTI);
		// cleaningService.addCleaning(cleaningAddInput);

		// 返回进场id
		return record.getProdCourseId();
	}

	/**
	 *  
	 * 
	 * @Description: TODO 常用修理方案
	 * @param input 筛选条件
	 * @return CommonRepairOutput 常用修理方案 @throws 
	 */
	@Override
	public CommonRepairOutput commonRepair(CommonRepairInput input) {
		CommonRepairOutput output = new CommonRepairOutput();
		if (StringUtils.isBlank(input.getPositionCode())
				|| (StringUtils.isBlank(input.getPartsDetailsCode()) || StringUtils.isBlank(input.getRepairCode()))
						&& StringUtils.isBlank(input.getPartsRepairCode())) {
			return output;
		}

		CommonRepairExample example = new CommonRepairExample();
		Criteria criteria = example.createCriteria();
		if (StringUtils.isNotBlank(input.getPartsDetailsCode())) {
			criteria.andPartsDetailsCodeEqualTo(input.getPartsDetailsCode().trim().toUpperCase());
		}
		if (StringUtils.isNotBlank(input.getPartsRepairCode())) {
			criteria.andPartsRepairCodeEqualTo(input.getPartsRepairCode().trim().toUpperCase());
		}
		if (StringUtils.isNotBlank(input.getRepairCode())) {
			criteria.andRepairCodeEqualTo(input.getRepairCode().trim().toUpperCase());
		}
		if (StringUtils.isNotBlank(input.getPositionCode()) && input.getPositionCode().trim().length() >= 2) {
			criteria.andPositionCodeEqualTo(input.getPositionCode().substring(0, 2).trim().toUpperCase());
		}
		List<CommonRepair> commonRepairs = commonRepairDao.selectByExample(example);
		if (commonRepairs != null && commonRepairs.size() > 0) {
			CommonRepair CommonRepair = commonRepairs.get(0);
			output.setCommonRepairCode(CommonRepair.getCommonRepairCode());
			output.setCommonRepairName(CommonRepair.getCommonRepairName());
			ComRepairEntryExample cExample = new ComRepairEntryExample();
			cExample.createCriteria().andCommonRepairEqualTo(CommonRepair.getProdCommonRepairId())
					.andIsRequiredEqualTo(CommonEnum.YES.getCode());
			List<ComRepairEntry> requires = comRepairEntryDao.selectByExample(cExample);
			if (requires != null && requires.size() > 0) {
				List<CommonRepairEntryOutput> requireList = requires.stream().map(require -> {
					CommonRepairEntryOutput creOutput = new CommonRepairEntryOutput();
					creOutput.setDamageCode(require.getDamageCode());
					creOutput.setPartsDetailsCode(require.getPartsDetailsCode());
					creOutput.setPartsRepairCode(require.getPartsRepairCode());
					creOutput.setPositionCode(require.getPositionCode());
					creOutput.setQuantity(StringUtil.valueOf(require.getQuantity()));
					creOutput.setRepairCode(require.getRepairCode());
					return creOutput;
				}).collect(Collectors.toList());
				output.setRequiredList(requireList);
			}
			ComRepairEntryExample noExample = new ComRepairEntryExample();
			noExample.createCriteria().andCommonRepairEqualTo(CommonRepair.getProdCommonRepairId())
					.andIsRequiredEqualTo(CommonEnum.NO.getCode());
			List<ComRepairEntry> optionals = comRepairEntryDao.selectByExample(noExample);
			if (optionals != null && optionals.size() > 0) {
				List<CommonRepairEntryOutput> optionalList = optionals.stream().map(optional -> {
					CommonRepairEntryOutput creOutput = new CommonRepairEntryOutput();
					creOutput.setDamageCode(optional.getDamageCode());
					creOutput.setPartsDetailsCode(optional.getPartsDetailsCode());
					creOutput.setPartsRepairCode(optional.getPartsRepairCode());
					creOutput.setPositionCode(optional.getPositionCode());
					creOutput.setQuantity(StringUtil.valueOf(optional.getQuantity()));
					creOutput.setRepairCode(optional.getRepairCode());
					return creOutput;
				}).collect(Collectors.toList());
				output.setOptionalList(optionalList);
			}

		}
		return output;
	}

	/**
	 *  
	 * 
	 * @Description: TODO 获取好坏箱类型
	 * @return List<ContainerStateTypeOutput> 好坏箱类型 @throws 
	 */
	@Override
	public List<ContainerStateTypeOutput> containerStateType() {
		List<ContainerStateTypeOutput> outputs = new ArrayList<ContainerStateTypeOutput>();
		YardContainerTypeExample example = new YardContainerTypeExample();
		// TODO Auto-generated method stub
		example.createCriteria().andYardEqualTo(getCurrentYardKey()).andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<YardContainerType> yardContainerTypes = yardContainerTypeDao.selectByExample(example);
		if (yardContainerTypes != null && yardContainerTypes.size() > 0) {
			outputs = yardContainerTypes.stream().map(item -> {
				ContainerStateTypeOutput output = new ContainerStateTypeOutput();
				output.setContainerCondition(item.getContainerCondition());
				output.setLabel(item.getCourseTypeName());
				output.setLabelEn(item.getCourseTypeNameEn());
				output.setValue(item.getKey());
				return output;
			}).collect(Collectors.toList());
		}
		return outputs;
	}

	/**
	 *  
	 * 
	 * @Description: TODO 根据位置获取部件明细修理--干箱
	 * @param positionCode 位置代码
	 * @return List<CourseEntryRelationOutput> @throws 
	 */
	@Override
	public List<PartsRepairTypeOutput> entryRelationPartsRepair(String positionCode) {
		// TODO Auto-generated method stub
		List<PartsRepairTypeOutput> outputs = new ArrayList<PartsRepairTypeOutput>();
		if (positionCode != null && positionCode.trim().length() == 4) {
			List<CodeCorresponding> codeCorrespondings = entryRelationList(
					new CourseEntryRelationInput(null, positionCode, null, null, null, null));
			if (codeCorrespondings == null || codeCorrespondings.size() <= 0) {
				codeCorrespondings = entryRelationList(
						new CourseEntryRelationInput(null, positionCode.substring(0, 2), null, null, null, null));
				if (codeCorrespondings == null || codeCorrespondings.size() <= 0) {
					codeCorrespondings = entryRelationList(
							new CourseEntryRelationInput(null, positionCode.substring(0, 1), null, null, null, null));
					if (codeCorrespondings == null || codeCorrespondings.size() <= 0) {
						return outputs;
					}
				}
			}
			codeCorrespondings = codeCorrespondings.stream()
					.filter(ccs -> StringUtils.isNotBlank(ccs.getPartsRepairType())).collect(Collectors.toList());
			Map<String, List<CodeCorresponding>> groupByMap = codeCorrespondings.stream()
					.collect(Collectors.groupingBy(CodeCorresponding::getPartsRepairType));
			for (String type : groupByMap.keySet()) {
				PartsRepairTypeOutput output = new PartsRepairTypeOutput();
				List<CodeCorresponding> pRepairs = groupByMap.get(type);
				List<CourseEntryRelationOutput> dataList = pRepairs.stream().map(codeCorresponding -> {
					CourseEntryRelationOutput cerOutput = new CourseEntryRelationOutput();
					cerOutput.setCode(codeCorresponding.getPartsRepairCode());
					cerOutput.setNameLang(codeCorresponding.getPartsRepairCode());
					return cerOutput;
				}).collect(Collectors.toList());
				output.setTypeLang(type);
				output.setDataList(entryRelationListUnique(dataList));
				outputs.add(output);
			}
		}
		return outputs;
	}

	/**
	 *  
	 * 
	 * @Description: TODO 根据位置获取部件明细修理--干箱
	 * @param positionCode 位置代码
	 * @return List<CourseEntryRelationOutput> @throws 
	 */
	@Override
	public List<CourseEntryRelationOutput> entryRelationPartsRepairNoType(String positionCode) {
		// TODO Auto-generated method stub
		List<CourseEntryRelationOutput> outputs = new ArrayList<CourseEntryRelationOutput>();
		if (positionCode != null && positionCode.trim().length() == 4) {
			List<CodeCorresponding> codeCorrespondings = entryRelationList(
					new CourseEntryRelationInput(null, positionCode, null, null, null, null));
			if (codeCorrespondings == null || codeCorrespondings.size() <= 0) {
				codeCorrespondings = entryRelationList(
						new CourseEntryRelationInput(null, positionCode.substring(0, 2), null, null, null, null));
				if (codeCorrespondings == null || codeCorrespondings.size() <= 0) {
					codeCorrespondings = entryRelationList(
							new CourseEntryRelationInput(null, positionCode.substring(0, 1), null, null, null, null));
					if (codeCorrespondings == null || codeCorrespondings.size() <= 0) {
						return outputs;
					}
				}
			}
			codeCorrespondings = codeCorrespondings.stream()
					.filter(ccs -> StringUtils.isBlank(ccs.getPartsRepairType())).collect(Collectors.toList());
			outputs = codeCorrespondings.stream().map(codeCorresponding -> {
				CourseEntryRelationOutput cerOutput = new CourseEntryRelationOutput();
				cerOutput.setCode(codeCorresponding.getPartsRepairCode());
				cerOutput.setNameLang(codeCorresponding.getPartsRepairCode());
				return cerOutput;
			}).collect(Collectors.toList());
		}
		return outputs;
	}

	/**
	 *  
	 * 
	 * @Description: TODO 根据部件大类获取部件明细--箱体、机组
	 * @param containerCategory 箱类别
	 * @param partsTypeCode     部件大类代码
	 * @return List<CourseEntryRelationOutput> @throws 
	 */
	@Override
	public List<CourseEntryRelationOutput> entryRelationPartsDetails(String containerCategory, String partsTypeCode) {
		List<CourseEntryRelationOutput> outputs = new ArrayList<CourseEntryRelationOutput>();
		List<CodeCorresponding> codeCorrespondings = new ArrayList<CodeCorresponding>();
		if (ContainerCategoryEnum.CONTAINER_02.getCode().equals(containerCategory)) {
			codeCorrespondings = entryRelationList(
					new CourseEntryRelationInput(containerCategory, null, null, null, null, null));
		} else if (ContainerCategoryEnum.CONTAINER_03.getCode().equals(containerCategory)) {
			codeCorrespondings = entryRelationList(
					new CourseEntryRelationInput(containerCategory, null, partsTypeCode, null, null, null));
		}
		outputs = codeCorrespondings.stream().map(codeCorresponding -> {
			CourseEntryRelationOutput output = new CourseEntryRelationOutput();
			if (StringUtils.isNotBlank(codeCorresponding.getPartsDetailsCode())) {
				output.setCode(codeCorresponding.getPartsDetailsCode());
				output.setNameLang(codeCorresponding.getPartsDetailsCode());
			}
			return output;
		}).collect(Collectors.toList());
		return entryRelationListUnique(outputs);
	}

	/**
	 *  
	 * 
	 * @Description: TODO 根据部件明细获取修理--箱体、机组
	 * @param containerCategory      箱类别
	 * @param partsDetailsCode部件明细代码
	 * @return List<CourseEntryRelationOutput> @throws 
	 */
	@Override
	public List<CourseEntryRelationOutput> entryRelationRepair(String containerCategory, String partsDetailsCode,
			String searchName) {
		List<CourseEntryRelationOutput> outputs = new ArrayList<CourseEntryRelationOutput>();

		if (ContainerCategoryEnum.CONTAINER_02.getCode().contentEquals(containerCategory)
				|| ContainerCategoryEnum.CONTAINER_03.getCode().contentEquals(containerCategory)) {

			CourseEntryRelationInput input = new CourseEntryRelationInput(containerCategory, null, null, null,
					partsDetailsCode, null);
			input.setRepaireName(searchName);
			List<CodeCorresponding> codeCorrespondings = entryRelationList(input);
			outputs = codeCorrespondings.stream().map(codeCorresponding -> {
				CourseEntryRelationOutput output = new CourseEntryRelationOutput();
				if (StringUtils.isNotBlank(codeCorresponding.getRepairCode())) {
					output.setCode(codeCorresponding.getRepairCode());
					output.setNameLang(codeCorresponding.getRepairCode());
				}
				return output;
			}).collect(Collectors.toList());
		}

		return entryRelationListUnique(outputs);
	}

	/**
	 *  
	 * 
	 * @Description: TODO 根据部件修理、部件明细、修理获取损坏--干箱、箱体、机组
	 * @param containerCategory 箱类别
	 * @param partsRepairCode   部件修理代码
	 * @param partsDetailsCode  部件明细代码
	 * @param repairCode        修理代码
	 * @return List<CourseEntryRelationOutput> @throws 
	 */
	@Override
	public List<CourseEntryRelationOutput> entryRelationDamage(String containerCategory, String partsRepairCode,
			String partsDetailsCode, String repairCode, String searchName) {
		List<CourseEntryRelationOutput> outputs = new ArrayList<CourseEntryRelationOutput>();
		List<CodeCorresponding> codeCorrespondings = new ArrayList<CodeCorresponding>();
		if (ContainerCategoryEnum.CONTAINER_01.getCode().equals(containerCategory)) {
			CourseEntryRelationInput input = new CourseEntryRelationInput(containerCategory, null, null,
					partsRepairCode, null, null);
			codeCorrespondings = entryRelationList(input);
		} else {
			CourseEntryRelationInput input = new CourseEntryRelationInput(containerCategory, null, null, null,
					partsDetailsCode, null);
			codeCorrespondings = entryRelationList(input);
		}
		for (CodeCorresponding codeCorresponding : codeCorrespondings) {
			String codes = codeCorresponding.getDamageCode();
			if (StringUtils.isNotBlank(codes) && codes.startsWith("[") && codes.endsWith("]")) {
				if (codes.indexOf("[ALL]") > -1) {
					DamageExample example = new DamageExample();
					example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO);
					List<Damage> damages = damageDao.selectByExample(example);
					if (damages != null && damages.size() > 0) {
						outputs = damages.stream().map(damage -> {
							CourseEntryRelationOutput output = new CourseEntryRelationOutput();
							if (StringUtils.isNotBlank(damage.getDamageCode())) {
								output.setCode(damage.getDamageCode());
								output.setNameLang(damage.getDamageCode());
							}
							return output;
						}).collect(Collectors.toList());
					}
					break;
				} else {
					List<Damage> damageList = new ArrayList<>();
					if (StringUtils.isNotBlank(searchName)) {
						DamageExample damageExample = new DamageExample();
						DamageExample.Criteria damageCriteria = damageExample.createCriteria();
						DamageExample.Criteria damageCriteria2 = damageExample.createCriteria();
						damageCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO)
								.andDamageCodeLike("%" + searchName.trim() + "%");
						damageCriteria2.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
						if (isChineseRequest()) {
							damageCriteria2.andDamageNameLike("%" + searchName.trim() + "%");
						} else {
							damageCriteria2.andDamageNameEnLike("%" + searchName.trim() + "%");
						}
						damageExample.or(damageCriteria2);
						damageList = damageDao.selectByExample(damageExample);
					}

					codes = codes.substring(1, codes.length() - 1);
					String[] codeArr = codes.split("\\]\\[");
					for (String code : codeArr) {
						CourseEntryRelationOutput output = new CourseEntryRelationOutput();
						output.setCode(code);
						output.setNameLang(code);
						if (StringUtils.isNotBlank(searchName)) {
							if (damageList != null && damageList.size() > 0) {
								if (damageList.stream().anyMatch(a -> a.getDamageCode().equals(code))) {
									outputs.add(output);
								}
							}
						} else {
							outputs.add(output);
						}

					}
				}

			}
		}
		return entryRelationListUnique(outputs);
	}

	/**
	 *  
	 * 
	 * @Description: TODO 根据部件明细、修理获取材质--箱体
	 * @param partsDetailsCode 部件明细代码
	 * @param repairCode       修理代码
	 * @return List<CourseEntryRelationOutput> @throws 
	 */
	@Override
	public List<CourseEntryRelationOutput> entryRelationMaterial(String partsDetailsCode, String repairCode) {
		List<CodeCorresponding> codeCorrespondings = entryRelationList(new CourseEntryRelationInput(
				ContainerCategoryEnum.CONTAINER_02.getCode(), null, null, null, partsDetailsCode, repairCode));
		List<CourseEntryRelationOutput> outputs = codeCorrespondings.stream().map(codeCorresponding -> {
			CourseEntryRelationOutput output = new CourseEntryRelationOutput();
			if (StringUtils.isNotBlank(codeCorresponding.getMaterialCode())) {
				output.setCode(codeCorresponding.getMaterialCode());
				output.setNameLang(codeCorresponding.getMaterialCode());
			} else {
				output.setCode(codeCorresponding.getSelectMaterialCode());
				output.setNameLang(codeCorresponding.getSelectMaterialCode());
			}
			return output;
		}).collect(Collectors.toList());

		return outputs;
	}

	/**
	 *  
	 * 
	 * @Description: TODO 获取部件大类--机组
	 * @return List<CourseEntryRelationOutput> @throws 
	 */
	@Override
	public List<CourseEntryRelationOutput> entryRelationPartsType() {
		PartsTypeExample example = new PartsTypeExample();
		example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
				.andContainerCategoryEqualTo(ContainerCategoryEnum.CONTAINER_03.getCode());
		// example.setOrderByClause("");
		List<PartsType> partsTypes = partsTypeDao.selectByExample(example);
		return partsTypes.stream().map(partsType -> {
			CourseEntryRelationOutput output = new CourseEntryRelationOutput();
			if (StringUtils.isNotBlank(partsType.getPartsTypeCode())) {
				output.setCode(partsType.getPartsTypeCode());
				output.setNameLang(partsType.getPartsTypeCode());
			}
			return output;
		}).collect(Collectors.toList());
	}

	/**
	 * @Description: TODO list 去重
	 * @param outputs
	 * @return List<CourseEntryRelationOutput> @throws 
	 */
	private List<CourseEntryRelationOutput> entryRelationListUnique(List<CourseEntryRelationOutput> outputs) {
		if (outputs == null) {
			return new ArrayList<CourseEntryRelationOutput>();
		}
		return outputs.stream()
				.collect(Collectors.collectingAndThen(
						Collectors.toCollection(
								() -> new TreeSet<>(Comparator.comparing(CourseEntryRelationOutput::getCode))),
						ArrayList::new));
	}

	/**
	 *  
	 * 
	 * @Description: TODO 根据查询调价获取费率关系
	 * @param input 参数
	 * @return List<CodeCorresponding> @throws 
	 */
	private List<CodeCorresponding> entryRelationList(CourseEntryRelationInput input) {
		CodeCorrespondingExample example = new CodeCorrespondingExample();
		com.sanlly.production.entity.CodeCorrespondingExample.Criteria criteria = example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		if (StringUtils.isNotBlank(input.getContainerCategory())) {
			criteria.andContainerCategoryEqualTo(input.getContainerCategory());
		}
		if (StringUtils.isNotBlank(input.getPositionCode())) {
			criteria.andPositionCodeLike("%[" + input.getPositionCode().trim().toUpperCase() + "]%");
		}
		if (StringUtils.isNotBlank(input.getPartsTypeCode())) {
			criteria.andPartsTypeCodeEqualTo(input.getPartsTypeCode().trim().toUpperCase());
		}
		if (StringUtils.isNotBlank(input.getPartsDetailsCode())) {
			criteria.andPartsDetailsCodeEqualTo(input.getPartsDetailsCode().trim().toUpperCase());
		}
		if (StringUtils.isNotBlank(input.getPartsRepairCode())) {
			criteria.andPartsRepairCodeEqualTo(input.getPartsRepairCode().trim().toUpperCase());
		}
		if (StringUtils.isNotBlank(input.getRepairCode())) {
			criteria.andRepairCodeEqualTo(input.getRepairCode().trim().toUpperCase());
		}
		if (StringUtils.isNotBlank(input.getRepaireName())) {
			RepairExample repairExample = new RepairExample();
			RepairExample.Criteria repairCriteria = repairExample.createCriteria();
			RepairExample.Criteria repairCriteria2 = repairExample.createCriteria();
			repairCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO)
					.andRepairCodeLike("%" + input.getRepaireName().trim() + "%");
			repairCriteria2.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
			if (isChineseRequest()) {
				repairCriteria2.andRepairNameLike("%" + input.getRepaireName().trim() + "%");
			} else {
				repairCriteria2.andRepairNameEnLike("%" + input.getRepaireName().trim() + "%");
			}
			repairExample.or(repairCriteria2);
			List<Repair> repairList = repairDao.selectByExample(repairExample);
			if (repairList.size() == 0) {
				return new ArrayList<CodeCorresponding>();
			}
			criteria.andRepairCodeIn(repairList.stream().map(a -> a.getRepairCode()).collect(Collectors.toList()));
		}
		List<CodeCorresponding> codeCorrespondings = codeCorrespondingDao.selectByExample(example);
		return codeCorrespondings == null ? new ArrayList<CodeCorresponding>() : codeCorrespondings;
	}

	/**
	 *  
	 * 
	 * @Description: TODO 特殊货物洗箱费率
	 * @return List<SpecialGoodSelectOutput> @throws 
	 */
	@Override
	public List<SpecialWashingRateOutput> specialWashingRate(String company) {
		// 特殊货物洗箱费率
		SpecialWashingRateExample specialWashingRateExample = new SpecialWashingRateExample();
		com.sanlly.production.entity.SpecialWashingRateExample.Criteria specialWashingRateCriteria = specialWashingRateExample
				.createCriteria();
		specialWashingRateCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO).andCompanyEqualTo(company);
		List<SpecialWashingRate> specialWashingRates = specialWashingRateDao.selectByExample(specialWashingRateExample);
		List<SpecialWashingRateOutput> specialGoodSelectOutputs = new ArrayList<SpecialWashingRateOutput>();
		if (specialWashingRates != null && specialWashingRates.size() > 0) {
			for (SpecialWashingRate item : specialWashingRates) {
				SpecialWashingRateOutput output = new SpecialWashingRateOutput();
				output.setCompany(item.getCompany());
				output.setKey(item.getKey());
				output.setWashingTypeLang(item.getWashingType());
				output.setGoodsNameLang(item.getKey());
				output.setFortyMoney(StringUtil.valueOf(item.getFortyRate()));
				output.setTwentyMoney(StringUtil.valueOf(item.getTwentyRate()));
				specialGoodSelectOutputs.add(output);
			}
		}
		return specialGoodSelectOutputs;
	}

	/**
	 *  
	 * 
	 * @Description: TODO 重复条目提醒
	 * @param containerNo      箱号
	 * @param partsRepairCode  部件修理代码
	 * @param partsDetailsCode 部件明细代码
	 * @param repairCode       修理代码
	 * @return Result @throws 
	 */
	@Override
	public ContainerTestingListOutput repeatPromptsEntry(String containerNo, String containerCategory,
			String partsRepairCode, String partsDetailsCode, String repairCode) {
		// TODO Auto-generated method stub
		Calendar c = Calendar.getInstance();
		c.setTime(new Date());
		if (ContainerCategoryEnum.CONTAINER_03.getCode().equals(containerCategory)) {
			c.add(Calendar.YEAR, -1);
		} else {
			c.add(Calendar.YEAR, -2);
		}
		Date y = c.getTime();
		CourseExample example = new CourseExample();
		example.createCriteria().andContainerNoEqualTo(containerNo).andTestingTimeGreaterThanOrEqualTo(y);
		List<Course> courses = courseDao.selectByExample(example);
		if (courses != null && courses.size() > 0) {
			CourseEntryExample entryExample = new CourseEntryExample();
			com.sanlly.production.entity.CourseEntryExample.Criteria criteria = entryExample.createCriteria();
			List<String> courseIds = courses.stream().map(Course::getProdCourseId).collect(Collectors.toList());
			;
			criteria.andCourseIn(courseIds);
			criteria.andContainerCategoryEqualTo(containerCategory);
			if (ContainerCategoryEnum.CONTAINER_03.getCode().equals(containerCategory)) {
				criteria.andPartsDetailsCodeEqualTo(partsDetailsCode).andRepairCodeEqualTo(repairCode);
			} else {
				criteria.andPartsRepairCodeEqualTo(partsRepairCode);
			}
			List<CourseEntry> courseEntries = courseEntryDao.selectByExample(entryExample);
			if (courseEntries != null && courseEntries.size() > 0) {
				Course course = courseDao.selectByPrimaryKey(courseEntries.get(0).getCourse());
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
				ContainerTestingListOutput output = new ContainerTestingListOutput();
				output.setProdCourseId(course.getProdCourseId());
				output.setContainerNo(course.getContainerNo());
				output.setSizeLang(course.getSize());
				output.setContainerCategoryLang(course.getContainerCategory());
				output.setContainerTypeLang(course.getContainerType());
				output.setYardLang(course.getYard());
				output.setContainerUserLang(course.getContainerUser());
				output.setCourseTypeLang(course.getCourseType());
				// 格式化日期
				if (course.getCourseTime() != null) {
					output.setCourseTime(sdf.format(course.getCourseTime()));
				}
				// 机组检验人
				if (course.getTestingUser() != null) {
					Result<UserInfoOutput> rlt = authClient.getUserDetail(course.getTestingUser());
					if (rlt != null && rlt.getCode().equals(ResultCodeEnum.SUCCESS.getCode())) {
						UserInfoOutput user = rlt.getData();
						if (user != null) {
							output.setTestingUser(user.getUserName());
						}
					}
				}
				output.setTestingStateNameLang(course.getTestingState());
				output.setTestingState(course.getTestingState());
				if (course.getCourseTime() != null) {
					output.setTestingTime(sdf.format(course.getCourseTime()));
				}
				output.setTestingRemarks(course.getTestingRemarks());
				return output;
			}
		}

		return null;
	}

	/**
	 * 冷代干
	 */
	@Override
	public PagedList<ContainerTestingListOutput> getUnitPageList(ContainerTestingSearchInput input)
			throws ParseException {
		PagedList<ContainerTestingListOutput> pagedList = new PagedList<ContainerTestingListOutput>(
				input.getPageIndex(), input.getPageSize());
		// TODO Auto-generated method stub
		CourseExample courseExample = new CourseExample();
		CourseExample.Criteria criteria = courseExample.createCriteria()
				.andIsFreezeDryEqualTo(CommonEnum.YES.getCode());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		// 箱号
		if (StringUtils.isNotBlank(input.getContainerNo())) {
			criteria.andContainerNoLike("%" + StringUtils.trim(input.getContainerNo()) + "%");
		}
		// 用箱人
		if (StringUtils.isNotBlank(input.getContainerUser())) {
			criteria.andContainerUserEqualTo(StringUtils.trim(input.getContainerUser()));
		}
		// 进场类型
		if (StringUtils.isNotBlank(input.getCourseType())) {
			criteria.andCourseTypeEqualTo(StringUtils.trim(input.getCourseType()));
		}
		// 箱况
		if (StringUtils.isNotBlank(input.getContainerCondition())) {
			criteria.andContainerConditionEqualTo(StringUtils.trim(input.getContainerCondition()));
		}
		// 场站
		if (StringUtils.isNotBlank(input.getYard())) {
			criteria.andYardEqualTo(StringUtils.trim(input.getYard()));
		}
		// 检验状态
		if (input.getTestingState() != null && input.getTestingState().length > 0) {
			criteria.andTestingStateIn(new ArrayList<>(Arrays.asList(input.getTestingState())));
		}

		// 进场开始时间
		if (StringUtils.isNotBlank(input.getStartDate())) {
			criteria.andCourseTimeGreaterThanOrEqualTo(sdf.parse(StringUtils.trim(input.getStartDate())));
		}

		// 进场结束时间
		if (StringUtils.isNotBlank(input.getEndDate())) {
			criteria.andCourseTimeLessThanOrEqualTo(sdf.parse(StringUtils.trim(input.getEndDate())));
		}

		// 分页查询
		int total = (int) courseDao.countByExample(courseExample);
		courseExample.setLimitStart(pagedList.getLimitStart());
		courseExample.setLimitEnd(pagedList.getLimitEnd());
		pagedList.setTotalItemCount(total);
		// 按照进场倒序
		courseExample.setOrderByClause(" course_time desc");
		List<Course> courses = courseDao.selectByExample(courseExample);
		// 转换输出实体
		List<ContainerTestingListOutput> outputList = courses.stream().map(course -> {
			ContainerTestingListOutput output = new ContainerTestingListOutput();
			output.setProdCourseId(course.getProdCourseId());
			output.setContainerNo(course.getContainerNo());
			output.setSizeLang(course.getSize());
			output.setContainerCategoryLang(course.getContainerCategory());
			output.setContainerTypeLang(course.getContainerType());
			output.setYardLang(course.getYard());
			output.setContainerUserLang(course.getContainerUser());
			output.setCourseTypeLang(course.getCourseType());
			output.setContainerConditionNameLang(course.getContainerCondition());
			// 格式化日期
			if (course.getCourseTime() != null) {
				output.setCourseTime(sdf.format(course.getCourseTime()));
			}
			// 机组检验人
			if (course.getTestingUser() != null) {
				Result<UserInfoOutput> rlt = authClient.getUserDetail(course.getTestingUser());
				if (rlt != null && rlt.getCode().equals(ResultCodeEnum.SUCCESS.getCode())) {
					UserInfoOutput user = rlt.getData();
					if (user != null) {
						output.setTestingUser(user.getUserName());
					}
				}
			}
			output.setTestingStateNameLang(course.getTestingState());
			output.setTestingState(course.getTestingState());
			if (course.getCourseTime() != null) {
				output.setTestingTime(sdf.format(course.getCourseTime()));
			}
			output.setTestingRemarks(course.getTestingRemarks());
			return output;
		}).collect(Collectors.toList());
		pagedList.setDataList(outputList);
		return pagedList;
	}

	/**
	 * 取消冷代干
	 */
	@Override
	public void cancelDry(String[] listIds) {
		CourseExample example = new CourseExample();
		example.createCriteria().andProdCourseIdIn(Arrays.asList(listIds));
		CourseWithBLOBs model = new CourseWithBLOBs();
		model.setIsFreezeDry(CommonEnum.NO.getCode());
		model.setUpdateTime(new Date());
		model.setUpdateUser(getCurrentUserId());
		courseDao.updateByExampleSelective(model, example);
	}

	/**
	 * 批量设置冷代干
	 */
	@Override
	public void settingDry(String[] listIds) {
		CourseExample example = new CourseExample();
		example.createCriteria().andProdCourseIdIn(Arrays.asList(listIds));
		CourseWithBLOBs model = new CourseWithBLOBs();
		model.setIsFreezeDry(CommonEnum.YES.getCode());
		model.setUpdateTime(new Date());
		model.setUpdateUser(getCurrentUserId());
		courseDao.updateByExampleSelective(model, example);
	}

	/**
	 *  
	 * 
	 * @Description: TODO 删除进场条目
	 * @param input 条目id @throws 
	 */
	@Override
	public void containerCourseEntryDelete(ContainerEntryListInput input) {
		// TODO Auto-generated method stub
		if (input != null && input.getCourseEntryIdList() != null && input.getCourseEntryIdList().length > 0) {
			// 批量删除
			CourseEntry record = new CourseEntry();
			record.setIsDel(PlatformConstants.ISDEL_YES);
			record.setUpdateTime(new Date());
			record.setUpdateUser(getCurrentUserId());
			// 批量删除条件
			CourseEntryExample example = new CourseEntryExample();
			example.createCriteria().andProdCourseEntryIdIn(Arrays.asList(input.getCourseEntryIdList()));
			courseEntryDao.updateByExampleSelective(record, example);
		}
	}

	/**
	 * 判断是否为外包 根据指派的班组或者供应商判断
	 */
	@Override
	public Boolean isWb(String prodCourseId, String containerCategory) {
		// TODO Auto-generated method stub
		Integer workdGroupId = -1;
		if (ContainerCategoryEnum.CONTAINER_01.getCode().equals(containerCategory)
				|| ContainerCategoryEnum.CONTAINER_02.getCode().equals(containerCategory)) {
			CourseWithBLOBs course = courseDao.selectByPrimaryKey(prodCourseId);
			workdGroupId = course.getFinishUser();
		} else if (ContainerCategoryEnum.CONTAINER_04.getCode().equals(containerCategory)) {
			MaintenanceWithBLOBs course = maintenanceDao.selectByPrimaryKey(prodCourseId);
			workdGroupId = course.getFinishUser();
		} else {
			UnitCourseWithBLOBs course = unitCourseDao.selectByPrimaryKey(prodCourseId);
			workdGroupId = course.getFinishUser();
		}
		WorkGroup workGroup = workGroupDao.selectByPrimaryKey(workdGroupId);
		return workGroup != null && CleaningPatternEnum.OUT.getCode().equals(workGroup.getType());
	}

	/**
	 *  
	 * 
	 * @Description: TODO 导入进场数据
	 * @param inputs 进场数据
	 * @throws Exception @throws 
	 */
	@Override
	@Transactional
	public void exportContainerCourse(List<ContainerCourseInput> inputs) throws Exception {
		if (inputs != null && inputs.size() > 0) {
			for (ContainerCourseInput containerCourseInput : inputs) {
				String prodCourseId = saveContainerCourse(containerCourseInput);
				CourseWithBLOBs course = courseDao.selectByPrimaryKey(prodCourseId);
				if (course != null) {
					if (CleaningMethodsEnum.MCOWW.getMethodsName().equals(containerCourseInput.getCleanMethods())) {
						ContainerCourseEntryInfoInput cceiInput = new ContainerCourseEntryInfoInput();
						ContainerCourseEntryInput ccInput = new ContainerCourseEntryInput();
						ccInput.setPositionCode(CleaningMethodsEnum.MCOWW.getPositionCode());
						ccInput.setPartsDetailsCode(CleaningMethodsEnum.MCOWW.getPartsDetailsCode());
						ccInput.setPartsRepairCode(CleaningMethodsEnum.MCOWW.getPartsRepairCode());
						ccInput.setRepairCode(CleaningMethodsEnum.MCOWW.getRepairCode());
						ccInput.setDamageCode(CleaningMethodsEnum.MCOWW.getDamageCode());
						ccInput.setQuantity("0");
						ccInput.setWidth("0");
						ccInput.setLength("0");
						ccInput.setManHour("0");
						ccInput.setManHourCost("0");
						ccInput.setMaterialCost("0");
						ccInput.setSumMoney("0");
						cceiInput.setPartList(Arrays.asList(ccInput));
						cceiInput.setProdCourseId(prodCourseId);
						cceiInput.setContainerCategory(course.getContainerCategory());
						saveContainerCourserEntryInfo(cceiInput);
					} else if (CleaningMethodsEnum.MCOCC.getMethodsName()
							.equals(containerCourseInput.getCleanMethods())) {
						ContainerCourseEntryInfoInput cceiInput = new ContainerCourseEntryInfoInput();
						ContainerCourseEntryInput ccInput = new ContainerCourseEntryInput();
						ccInput.setPositionCode(CleaningMethodsEnum.MCOCC.getPositionCode());
						ccInput.setPartsDetailsCode(CleaningMethodsEnum.MCOCC.getPartsDetailsCode());
						ccInput.setPartsRepairCode(CleaningMethodsEnum.MCOCC.getPartsRepairCode());
						ccInput.setRepairCode(CleaningMethodsEnum.MCOCC.getRepairCode());
						ccInput.setDamageCode(CleaningMethodsEnum.MCOCC.getDamageCode());
						ccInput.setQuantity("0");
						ccInput.setWidth("0");
						ccInput.setLength("0");
						ccInput.setManHour("0");
						ccInput.setManHourCost("0");
						ccInput.setMaterialCost("0");
						ccInput.setSumMoney("0");
						cceiInput.setPartList(Arrays.asList(ccInput));
						cceiInput.setProdCourseId(prodCourseId);
						cceiInput.setContainerCategory(course.getContainerCategory());
						saveContainerCourserEntryInfo(cceiInput);
					}
				}
			}
		}
	}

	/**
	 *  
	 * 
	 * @Description: TODO
	 * @param inputs 获取某种状态的进场数据 @throws 
	 */
	@Override
	public List<String> selectCourseByTestingState(String[] prodCourseIdList, String[] testingStateList)
			throws Exception {
		if (testingStateList == null || prodCourseIdList == null) {
			return new ArrayList<String>();
		}
		CourseExample example = new CourseExample();
		example.createCriteria().andProdCourseIdIn(Arrays.asList(prodCourseIdList))
				.andTestingStateIn(Arrays.asList(testingStateList));
		List<Course> courses = courseDao.selectByExample(example);
		return courses.stream().map(a -> a.getProdCourseId()).collect(Collectors.toList());
	}

	/**
	 *  
	 * 
	 * @Description: TODO 第三方现场收费
	 * @param input @throws 
	 */
	@Transactional
	@Override
	public Map<String, String> thirdPartyCharge(ThirdPartyChargeInput input) throws Exception {
		Charge record = new Charge();
		Map<String, String> map = new HashMap<String, String>();
		if (input.getProdCourseId() != null) {
			Course course = courseDao.selectByPrimaryKey(input.getProdCourseId());
			if (course != null) {

				Result<String> result = warehouseClient.getBillNumberBykey("LKBILLTYPE000081", getCurrentCompanyKey());
				record.setProdChargeCode(result.getData());
				record.setContainerType(course.getContainerType());
				record.setCourse(course.getProdCourseId());
				record.setContainerNo(course.getContainerNo());
				record.setContainerCategory(input.getContainerCategory());
				record.setSize(course.getSize());
				record.setContainerUser(course.getContainerUser());
				record.setYard(course.getYard());
				record.setCourseTime(course.getCourseTime());
				record.setCourseType(course.getCourseType());
				record.setPaymentType(input.getPaymentType());
				record.setChargeType(input.getChargeType());
				if (StringUtils.isNotBlank(input.getReceivedMoney())) {
					record.setReceivedMoney(new BigDecimal(input.getReceivedMoney()));
				} else {
					record.setReceivedMoney(new BigDecimal(0));
				}
				if (StringUtils.isNotBlank(input.getDepositMoney())) {
					record.setDepositMoney(new BigDecimal(input.getDepositMoney()));
				} else {
					record.setDepositMoney(new BigDecimal(0));
				}
				record.setShouldBackMoney(new BigDecimal(0));
				record.setActualBackMoney(new BigDecimal(0));
				record.setChargeTime(new Date());
				if (StringUtils.isNotBlank(input.getPayInvoice())) {
					record.setPayInvoice(input.getPayInvoice());
				}
				if (StringUtils.isNotBlank(input.getSignaturePic())) {
					record.setSignaturePic(input.getSignaturePic());
				}
				// 标记已收费
				CourseEntry courseEntry = new CourseEntry();
				courseEntry.setIsCharge(CommonEnum.YES.getCode());
				courseEntry.setUpdateTime(new Date());
				courseEntry.setUpdateUser(getCurrentUserId());
				// 批量标记已收费条件
				CourseEntryExample example = new CourseEntryExample();
				example.createCriteria().andPayingPartyEqualTo("T");
				courseEntryDao.updateByExampleSelective(courseEntry, example);
				chargeDao.insert(record);

				map.put("chargeCode", record.getProdChargeCode());
				if (PaymentTypeEnum.QRCODE.getCode().equals(record.getPaymentType())) {
					String charge = input.getReceivedMoney();
					if (ChargeTypeEnum.DEPOSIT.getCode().equals(record.getProdChargeCode())) {
						charge = input.getDepositMoney();
					}
					// zhangkai修改
					// 根据当前场站获取场站通联二维码编码
					YardExample yardExample = new YardExample();
					YardExample.Criteria yardCriteria = yardExample.createCriteria();
					yardCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
					yardCriteria.andKeyEqualTo(getCurrentYardKey());
					List<Yard> yards = yardDao.selectByExample(yardExample);
					// 由业务逻辑可知此处必有场站信息，无需做非空判断
					Yard yard = yards.get(0);
					// 调用二维码链接生成工具类
					String url = PayUtil.getQrCodeStr(yard.getQrcodeNo(), record.getProdChargeCode(), charge);
					map.put("qrCodeUrl", "/qrcode?content=" + URLEncoder.encode(url, "UTF-8"));
				}
			}
		}
		return map;
	}

	/**
	 *  
	 * 
	 * @Description: TODO 退租箱拷贝进场
	 * @param input @throws 
	 */
	@Override
	public String surrenderCopyCourse(CourseCopyInput input) throws Exception {
		if (StringUtils.isNotBlank(input.getProdCourseId()) && StringUtils.isNotBlank(input.getContainerCategory())) {
			CourseWithBLOBs courseCopy = new CourseWithBLOBs();
			CourseExample example = new CourseExample();
			example.createCriteria().andSurrenderCourseEqualTo(input.getProdCourseId())
					.andSurrenderTypeEqualTo(input.getSurrenderType());
			List<CourseWithBLOBs> courses = courseDao.selectByExampleWithBLOBs(example);
			if (courses != null && courses.size() > 0) {
				courseCopy = courses.get(0);
			} else {
				CourseWithBLOBs course = courseDao.selectByPrimaryKey(input.getProdCourseId());
				if (course != null) {
					// 拷贝进场
					BeanUtils.copyProperties(course, courseCopy);
					// CW拷贝 还是 退前修理
					String prodCourseId = ruleService.generateCourseKey(course.getContainerNo());
					if (StringUtils.isNotBlank(input.getSurrenderType())
							&& SurrenderTypeEnum.CW.getCode().equals(input.getSurrenderType())) {
						courseCopy.setIsSurrender(CommonEnum.YES.getCode());
					} else {
						courseCopy.setIsSurrender(CommonEnum.NO.getCode());
					}
					courseCopy.setSurrenderCourse(input.getSurrenderType());
					courseCopy.setSurrenderCourse(course.getProdCourseId());
					courseCopy.setProdCourseId(prodCourseId);
					courseCopy.setTestingState(TestingStateEnum.TESTING.getCode());
					courseDao.insert(courseCopy);
				} else {
					throw new Exception("[" + input.getProdCourseId() + "] 进场不存在");
				}
			}

			if (ContainerCategoryEnum.CONTAINER_02.getCode().equals(input.getContainerCategory())
					|| ContainerCategoryEnum.CONTAINER_03.getCode().equals(input.getContainerCategory())) {
				UnitCourseWithBLOBs unitCourseCopy = unitCourseDao.selectByPrimaryKey(courseCopy.getProdCourseId());
				if (unitCourseCopy == null) {
					// 拷贝机组进场
					UnitCourseWithBLOBs unitCourse = unitCourseDao.selectByPrimaryKey(input.getProdCourseId());
					unitCourseCopy = new UnitCourseWithBLOBs();
					BeanUtils.copyProperties(unitCourse, unitCourseCopy);
					unitCourseCopy.setProdCourseId(courseCopy.getProdCourseId());
					unitCourseCopy.setTestingState(TestingStateEnum.TESTING.getCode());
					unitCourseDao.insert(unitCourseCopy);
				}
			}

			// 拷贝箱体估价明细到进场
			if (input.getEvalEntryIdList() != null && input.getEvalEntryIdList().length > 0) {
				EvaluationEntryExample evaluationEntryExample = new EvaluationEntryExample();
				evaluationEntryExample.createCriteria()
						.andProdEvaluationEntryIdIn(Arrays.asList(input.getEvalEntryIdList()));
				List<EvaluationEntry> entries = evaluationEntryDao.selectByExampleWithBLOBs(evaluationEntryExample);
				if (entries != null && entries.size() > 0) {
					for (EvaluationEntry entry : entries) {
						CourseEntry entryCopy = new CourseEntry();
						BeanUtils.copyProperties(entry, entryCopy);
						entryCopy.setProdCourseEntryId(ruleService.generateCourseEntryKey(courseCopy.getContainerNo()));
						entryCopy.setIsCharge(CommonEnum.NO.getCode());
						entryCopy.setCreateTime(new Date());
						entryCopy.setCreateUser(getCurrentUserId());
						entryCopy.setUpdateTime(null);
						entryCopy.setUpdateUser(null);
						entryCopy.setCourse(courseCopy.getProdCourseId());
						courseEntryDao.insert(entryCopy);
					}
				}
			}

			// 拷贝机组估价明细到进场
			if (input.getEvalUnitEntryIdList() != null && input.getEvalUnitEntryIdList().length > 0) {
				EvaluationEntryExample evaluationEntryExample = new EvaluationEntryExample();
				evaluationEntryExample.createCriteria()
						.andProdEvaluationEntryIdIn(Arrays.asList(input.getEvalUnitEntryIdList()));
				List<EvaluationEntry> entries = evaluationEntryDao.selectByExampleWithBLOBs(evaluationEntryExample);
				if (entries != null && entries.size() > 0) {
					for (EvaluationEntry entry : entries) {
						CourseEntry entryCopy = new CourseEntry();
						BeanUtils.copyProperties(entry, entryCopy);
						entryCopy.setProdCourseEntryId(ruleService.generateCourseEntryKey(courseCopy.getContainerNo()));
						entryCopy.setIsCharge(CommonEnum.NO.getCode());
						entryCopy.setCreateTime(new Date());
						entryCopy.setCreateUser(getCurrentUserId());
						entryCopy.setUpdateTime(null);
						entryCopy.setUpdateUser(null);
						entryCopy.setCourse(courseCopy.getProdCourseId());
						courseEntryDao.insert(entryCopy);
					}
				}
			}
			return courseCopy.getProdCourseId();
		}
		{
			throw new Exception("[" + input.getProdCourseId() + "][" + input.getContainerCategory() + "] 参数为空");
		}
	}

	@Override
	public PagedList<SurrenderCourseListOutput> surrenderCourse(SurrenderCourseSearchInput input) throws Exception {
		PagedList<SurrenderCourseListOutput> pagedList = new PagedList<SurrenderCourseListOutput>(input.getPageIndex(),
				input.getPageSize());
		// TODO Auto-generated method stub
		CourseExample courseExample = new CourseExample();
		CourseExample.Criteria criteria = courseExample.createCriteria();
		criteria.andIsSurrenderEqualTo(CommonEnum.YES.getCode());
		// 箱号
		if (StringUtils.isNotBlank(input.getContainerNo())) {
			criteria.andContainerNoLike("%" + StringUtils.trim(input.getContainerNo()) + "%");
		}
		// 用箱人
		if (StringUtils.isNotBlank(input.getContainerUser())) {
			criteria.andContainerUserEqualTo(StringUtils.trim(input.getContainerUser()));
		}
		// 箱东
		if (StringUtils.isNotBlank(input.getContainerOwner())) {
			criteria.andContainerOwnerEqualTo(StringUtils.trim(input.getContainerOwner()));
		}
		// 进场类型
		if (StringUtils.isNotBlank(input.getCourseType())) {
			criteria.andCourseTypeEqualTo(StringUtils.trim(input.getCourseType()));
		}
		// 箱类别
		if (StringUtils.isNotBlank(input.getContainerCategory())) {
			criteria.andContainerCategoryEqualTo(StringUtils.trim(input.getContainerCategory()));
		}

		SimpleDateFormat sdfs = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// 进场开始时间
		if (StringUtils.isNotBlank(input.getStartDate())) {
			criteria.andCourseTimeGreaterThanOrEqualTo(sdfs.parse(StringUtils.trim(input.getStartDate())));
		}

		// 进场结束时间
		if (StringUtils.isNotBlank(input.getEndDate())) {
			criteria.andCourseTimeLessThanOrEqualTo(sdfs.parse(StringUtils.trim(input.getEndDate())));
		}

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		// 分页查询
		int total = (int) courseDao.countByExample(courseExample);
		courseExample.setLimitStart(pagedList.getLimitStart());
		courseExample.setLimitEnd(pagedList.getLimitEnd());
		pagedList.setTotalItemCount(total);
		// 按照进场倒序
		courseExample.setOrderByClause(" course_time desc");
		List<Course> courses = courseDao.selectByExample(courseExample);
		List<UnitCourse> unitCourses = new ArrayList<UnitCourse>();
		if (courses != null && courses.size() > 0) {
			UnitCourseExample unitCourseExample = new UnitCourseExample();
			unitCourseExample.createCriteria()
					.andProdCourseIdIn(courses.stream().map(Course::getProdCourseId).collect(Collectors.toList()));
			unitCourses = unitCourseDao.selectByExample(unitCourseExample);
		}
		Map<String, UnitCourse> map = unitCourses.stream()
				.collect(Collectors.toMap(UnitCourse::getProdCourseId, unitCourse -> unitCourse));
		// 转换输出实体
		List<SurrenderCourseListOutput> outputList = courses.stream().map(course -> {
			SurrenderCourseListOutput output = new SurrenderCourseListOutput();
			output.setProdCourseId(course.getProdCourseId());
			output.setContainerNo(course.getContainerNo());
			output.setSizeLang(course.getSize());
			output.setContainerCategoryLang(course.getContainerCategory());
			output.setContainerTypeLang(course.getContainerType());
			output.setYardLang(course.getYard());
			output.setContainerOwnerLang(course.getContainerOwner());
			output.setContainerUserLang(course.getContainerUser());
			output.setCourseTypeLang(course.getCourseType());
			// 格式化日期
			if (course.getCourseTime() != null) {
				output.setCourseTime(sdf.format(course.getCourseTime()));
				int days = (int) ((new Date().getTime() - course.getCourseTime().getTime()) / (1000 * 3600 * 24));
				output.setCourseDay(days);
			}
			// 检验人
			if (course.getTestingUser() != null) {
				Result<UserInfoOutput> rlt = authClient.getUserDetail(course.getTestingUser());
				if (rlt != null && rlt.getCode().equals(ResultCodeEnum.SUCCESS.getCode())) {
					UserInfoOutput user = rlt.getData();
					if (user != null) {
						output.setTestingUser(user.getUserName());
					}
				}
			}
			output.setTestingStateNameLang(course.getTestingState());
			output.setTestingRemarks(course.getTestingRemarks());
			output.setContainerCondition(course.getContainerCondition());
			output.setContainerConditionNameLang(course.getContainerCondition());
			UnitCourse unitCourse = map.get(course.getProdCourseId());
			if (unitCourse != null) {
				output.setUnitState(unitCourse.getUnitState());
				output.setUnitStateNameLang(unitCourse.getUnitState());
				output.setUnitTestingRemarks(unitCourse.getTestingRemarks());
				if (unitCourse.getTestingUser() != null) {
					Result<UserInfoOutput> rlt = authClient.getUserDetail(unitCourse.getTestingUser());
					if (rlt != null && rlt.getCode().equals(ResultCodeEnum.SUCCESS.getCode())) {
						UserInfoOutput user = rlt.getData();
						if (user != null) {
							output.setUnitTestingUser(user.getUserName());
						}
					}
				}
			}

			return output;
		}).collect(Collectors.toList());
		pagedList.setDataList(outputList);
		return pagedList;
	}

	/**
	 *  
	 * 
	 * @Description: TODO 判断退租计划中是否包含当前箱号
	 * @param ContainerNo
	 * @return boolean @throws 
	 */
	private String isSurrender(String ContainerNo) {
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
		Date dt = new Date();
		try {
			dt = sdf.parse(sdf.format(new Date()));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SurrenderPlanExample spexample = new SurrenderPlanExample();
		spexample.createCriteria().andStartTimeGreaterThanOrEqualTo(dt).andEndTimeLessThanOrEqualTo(dt)
				.andCompanyEqualTo(getCurrentCompanyKey()).andPlanStateIn(new ArrayList<>(
						Arrays.asList(SurrenderPlanStateEnum.NOT.getCode(), SurrenderPlanStateEnum.PART.getCode())));
		List<SurrenderPlan> surrenderPlans = surrenderPlanDao.selectByExample(spexample);
		if (surrenderPlans != null && surrenderPlans.size() > 0) {
			SurrenderPlanDetailExample example = new SurrenderPlanDetailExample();
			example.createCriteria().andContainerNoEqualTo(ContainerNo).andIsCourseEqualTo(CommonEnum.NO.getCode())
					.andIsDelEqualTo(PlatformConstants.ISDEL_NO).andProdSurrenderPlanIdIn(
							surrenderPlans.stream().map(a -> a.getProdSurrenderPlanId()).collect(Collectors.toList()));
			example.setOrderByClause(" input_time desc");
			long count = surrenderPlanDetailDao.countByExample(example);
			if (count > 0) {
				return CommonEnum.YES.getCode();
			}
		}

		return CommonEnum.NO.getCode();
	}

	/**
	 *  
	 * 
	 * @Description: TODO 根据进场箱号更新退租计划
	 * @param ContainerNo
	 * @param courseTime
	 * @param yard        void @throws 
	 */
	@Override
	public void containerSurrender(String prodCourseId) {
		CourseWithBLOBs course = courseDao.selectByPrimaryKey(prodCourseId);
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
		Date dt = new Date();
		try {
			dt = sdf.parse(sdf.format(new Date()));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SurrenderPlanExample spexample = new SurrenderPlanExample();
		spexample.createCriteria().andStartTimeGreaterThanOrEqualTo(dt).andEndTimeLessThanOrEqualTo(dt)
				.andCompanyEqualTo(getCurrentCompanyKey()).andPlanStateIn(new ArrayList<>(
						Arrays.asList(SurrenderPlanStateEnum.NOT.getCode(), SurrenderPlanStateEnum.PART.getCode())));
		List<SurrenderPlan> surrenderPlans = surrenderPlanDao.selectByExample(spexample);
		if (surrenderPlans != null && surrenderPlans.size() > 0) {
			SurrenderPlanDetailExample example = new SurrenderPlanDetailExample();
			example.createCriteria().andContainerNoEqualTo(course.getContainerNo())
					.andIsCourseEqualTo(CommonEnum.NO.getCode()).andIsDelEqualTo(PlatformConstants.ISDEL_NO)
					.andProdSurrenderPlanIdIn(
							surrenderPlans.stream().map(a -> a.getProdSurrenderPlanId()).collect(Collectors.toList()));
			example.setOrderByClause(" input_time desc");
			List<SurrenderPlanDetail> surrenderPlanDetails = surrenderPlanDetailDao.selectByExample(example);
			if (surrenderPlanDetails != null && surrenderPlanDetails.size() > 0) {
				for (SurrenderPlanDetail surrenderPlanDetail : surrenderPlanDetails) {
					SurrenderPlan surrenderPlan = surrenderPlanDao
							.selectByPrimaryKey(surrenderPlanDetail.getProdSurrenderPlanId());
					if (surrenderPlan != null
							&& (SurrenderPlanStateEnum.NOT.getCode().equals(surrenderPlan.getPlanState()))
							|| SurrenderPlanStateEnum.NOT.getCode().equals(surrenderPlan.getPlanState())) {
						surrenderPlanDetail.setIsCourse(CommonEnum.YES.getCode());
						surrenderPlanDetail.setCourseTime(course.getCourseTime());
						surrenderPlanDetail.setYard(course.getYard());
						surrenderPlanDetailDao.updateByPrimaryKey(surrenderPlanDetail);
						SurrenderPlanDetailExample spdExample = new SurrenderPlanDetailExample();
						spdExample.createCriteria().andIsCourseEqualTo(CommonEnum.NO.getCode())
								.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
						long count = surrenderPlanDetailDao.countByExample(spdExample);
						if (count <= 0) {
							surrenderPlan.setPlanState(SurrenderPlanStateEnum.ALL.getCode());
						} else {
							surrenderPlan.setPlanState(SurrenderPlanStateEnum.PART.getCode());
						}
						surrenderPlanDao.updateByPrimaryKey(surrenderPlan);
						course.setSurrenderType(SurrenderTypeEnum.IICL.getCode());
						course.setSurrenderBillType(surrenderPlanDetail.getBillType());
						course.setIsOwnerCharge(CommonEnum.NO.getCode());
						courseDao.updateByPrimaryKey(course);
						return;
					}
				}
			}
		}
	}

	/**
	 *  
	 * 
	 * @Description: TODO 根据检验条目id更新备件修改记录
	 * @param prodCourseEntryId
	 * @param productNode @throws 
	 */
	@Override
	public void updateSpareChangeRecode(String prodCourseEntryId, String productNode) {
		if (SpareStockModuleEnum.EVALUATE.getCode().equals(productNode)) {
			EvaluationEntry entry = evaluationEntryDao.selectByPrimaryKey(prodCourseEntryId);
			if (entry != null
					&& (ContainerCategoryEnum.CONTAINER_03.getCode().equals(entry.getContainerCategory())
							|| ContainerCategoryEnum.CONTAINER_04.getCode().equals(entry.getContainerCategory()))
					&& StringUtils.isNotBlank(entry.getSparesNumber())) {
				SpareChangeRecord record = spareChangeRecordDao.selectByPrimaryKey(prodCourseEntryId);
				if (record == null) {
					record = new SpareChangeRecord();
				}
				record.setEvalCompany(entry.getCompany());
				record.setEvalWarehouse(entry.getWarehouse());
				record.setEvalWarehouseType(entry.getWarehouseType());
				record.setEvalSparesNumber(entry.getSparesNumber());
				record.setEvalPrice(entry.getPrice());
				record.setEvalChangeUser(getCurrentUserId());
				record.setEvalChangeTime(new Date());
				record.setEvalChangeDiff(BigDecimal.ZERO);
				record.setEvalChangePercent(0d);
				record.setWareCompany(entry.getCompany());
				record.setWareWarehouse(entry.getWarehouse());
				record.setWareWarehouseType(entry.getWarehouseType());
				record.setWareSparesNumber(entry.getSparesNumber());
				record.setWarePrice(entry.getPrice());
				record.setWareChangeUser(getCurrentUserId());
				record.setWareChangeTime(new Date());
				record.setWareChangeDiff(BigDecimal.ZERO);
				record.setWareChangePercent(0d);
				if (StringUtils.isNotBlank(record.getProdCourseEntryId())) {
					record.setEvalChangeDiff(record.getEvalPrice().subtract(record.getTestPrice()));
					if (!BigDecimal.ZERO.equals(record.getTestPrice())) {
						record.setEvalChangePercent(
								record.getEvalChangeDiff().divide(record.getTestPrice()).doubleValue());
					}
					record.setWareChangeDiff(record.getEvalPrice().subtract(record.getTestPrice()));
					if (!BigDecimal.ZERO.equals(record.getTestPrice())) {
						record.setWareChangePercent(
								record.getEvalChangeDiff().divide(record.getTestPrice()).doubleValue());
					}
					spareChangeRecordDao.updateByPrimaryKey(record);
				} else {
					record.setTestCompany(entry.getCompany());
					record.setTestWarehouse(entry.getWarehouse());
					record.setTestWarehouseType(entry.getWarehouseType());
					record.setTestSparesNumber(entry.getSparesNumber());
					record.setTestPrice(entry.getPrice());
					record.setTestChangeUser(getCurrentUserId());
					record.setTestChangeTime(new Date());
					record.setProdCourseId(entry.getCourse());
					record.setProductNode(productNode);
					record.setPartsDetailsCode(entry.getPartsDetailsCode());
					record.setDamageCode(entry.getDamageCode());
					record.setRepairCode(entry.getRepairCode());
					record.setProdCourseEntryId(entry.getProdEvaluationEntryId());
					CourseWithBLOBs course = courseDao.selectByPrimaryKey(entry.getCourse());
					if (course != null) {
						record.setContainerNo(course.getContainerNo());
						record.setYard(course.getYard());
						record.setCourseTime(course.getCourseTime());
					}
					spareChangeRecordDao.insert(record);
				}

			}
		} else if (SpareStockModuleEnum.STOCKOUT.getCode().equals(productNode)) {
			ReferralEntry entry = referralEntryDao.selectByPrimaryKey(prodCourseEntryId);
			if (entry != null
					&& (ContainerCategoryEnum.CONTAINER_03.getCode().equals(entry.getContainerCategory())
							|| ContainerCategoryEnum.CONTAINER_04.getCode().equals(entry.getContainerCategory()))
					&& StringUtils.isNotBlank(entry.getSparesNumber())) {
				SpareChangeRecord record = spareChangeRecordDao.selectByPrimaryKey(prodCourseEntryId);
				if (record == null) {
					record = new SpareChangeRecord();
				}
				record.setWareCompany(entry.getCompany());
				record.setWareWarehouse(entry.getWarehouse());
				record.setWareWarehouseType(entry.getWarehouseType());
				record.setWareSparesNumber(entry.getSparesNumber());
				record.setWarePrice(entry.getPrice());
				record.setWareChangeUser(getCurrentUserId());
				record.setWareChangeTime(new Date());
				if (StringUtils.isNotBlank(record.getProdCourseEntryId())) {
					record.setWareChangeDiff(record.getEvalPrice().subtract(record.getEvalPrice()));
					if (!BigDecimal.ZERO.equals(record.getTestPrice())) {
						record.setWareChangePercent(
								record.getEvalChangeDiff().divide(record.getEvalPrice()).doubleValue());
					}
					spareChangeRecordDao.updateByPrimaryKey(record);
				} else {
					record.setTestCompany(entry.getCompany());
					record.setTestWarehouse(entry.getWarehouse());
					record.setTestWarehouseType(entry.getWarehouseType());
					record.setTestSparesNumber(entry.getSparesNumber());
					record.setTestPrice(entry.getPrice());
					record.setTestChangeUser(getCurrentUserId());
					record.setTestChangeTime(new Date());
					record.setEvalCompany(entry.getCompany());
					record.setEvalWarehouse(entry.getWarehouse());
					record.setEvalWarehouseType(entry.getWarehouseType());
					record.setEvalSparesNumber(entry.getSparesNumber());
					record.setEvalPrice(entry.getPrice());
					record.setEvalChangeUser(getCurrentUserId());
					record.setEvalChangeTime(new Date());
					record.setEvalChangeDiff(BigDecimal.ZERO);
					record.setEvalChangePercent(0d);
					record.setProdCourseId(entry.getCourse());
					record.setProductNode(productNode);
					record.setPartsDetailsCode(entry.getPartsDetailsCode());
					record.setDamageCode(entry.getDamageCode());
					record.setRepairCode(entry.getRepairCode());
					record.setProdCourseEntryId(entry.getProdReferralEntryId());
					CourseWithBLOBs course = courseDao.selectByPrimaryKey(entry.getCourse());
					if (course != null) {
						record.setContainerNo(course.getContainerNo());
						record.setYard(course.getYard());
						record.setCourseTime(course.getCourseTime());
					}
					spareChangeRecordDao.insert(record);
				}

			}
		} else {
			CourseEntry entry = courseEntryDao.selectByPrimaryKey(prodCourseEntryId);
			if (entry != null
					&& (ContainerCategoryEnum.CONTAINER_03.getCode().equals(entry.getContainerCategory())
							|| ContainerCategoryEnum.CONTAINER_04.getCode().equals(entry.getContainerCategory()))
					&& StringUtils.isNotBlank(entry.getSparesNumber())) {
				SpareChangeRecord record = spareChangeRecordDao.selectByPrimaryKey(prodCourseEntryId);
				if (record == null) {
					record = new SpareChangeRecord();
				}
				record.setTestCompany(entry.getCompany());
				record.setTestWarehouse(entry.getWarehouse());
				record.setTestWarehouseType(entry.getWarehouseType());
				record.setTestSparesNumber(entry.getSparesNumber());
				record.setTestPrice(entry.getPrice());
				record.setTestChangeUser(getCurrentUserId());
				record.setTestChangeTime(new Date());
				record.setEvalCompany(entry.getCompany());
				record.setEvalWarehouse(entry.getWarehouse());
				record.setEvalWarehouseType(entry.getWarehouseType());
				record.setEvalSparesNumber(entry.getSparesNumber());
				record.setEvalPrice(entry.getPrice());
				record.setEvalChangeUser(getCurrentUserId());
				record.setEvalChangeTime(new Date());
				record.setEvalChangeDiff(BigDecimal.ZERO);
				record.setEvalChangePercent(0d);
				record.setWareCompany(entry.getCompany());
				record.setWareWarehouse(entry.getWarehouse());
				record.setWareWarehouseType(entry.getWarehouseType());
				record.setWareSparesNumber(entry.getSparesNumber());
				record.setWarePrice(entry.getPrice());
				record.setWareChangeUser(getCurrentUserId());
				record.setWareChangeTime(new Date());
				record.setWareChangeDiff(BigDecimal.ZERO);
				record.setWareChangePercent(0d);
				if (StringUtils.isNotBlank(record.getProdCourseEntryId())) {
					spareChangeRecordDao.updateByPrimaryKey(record);
				} else {
					record.setProdCourseId(entry.getCourse());
					record.setProductNode(productNode);
					record.setPartsDetailsCode(entry.getPartsDetailsCode());
					record.setDamageCode(entry.getDamageCode());
					record.setRepairCode(entry.getRepairCode());
					record.setProdCourseEntryId(entry.getProdCourseEntryId());
					CourseWithBLOBs course = courseDao.selectByPrimaryKey(entry.getCourse());
					if (course != null) {
						record.setContainerNo(course.getContainerNo());
						record.setYard(course.getYard());
						record.setCourseTime(course.getCourseTime());
					}
					spareChangeRecordDao.insert(record);
				}

			}
		}

	}

}
