package com.sanlly.production.service.impl;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.enums.CommonEnum;
import com.sanlly.common.models.exception.InvalidException;
import com.sanlly.common.models.input.referral.WorkGroupOutput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.dao.AutomationPriorityMapper;
import com.sanlly.production.dao.ContainerUserMapper;
import com.sanlly.production.dao.CourseMapper;
import com.sanlly.production.dao.EvaluationEntryMapper;
import com.sanlly.production.dao.PickingListMapper;
import com.sanlly.production.dao.PlanStockMapper;
import com.sanlly.production.dao.ProdDeptMapper;
import com.sanlly.production.dao.QualityControlTimeMapper;
import com.sanlly.production.dao.RateMapper;
import com.sanlly.production.dao.ReferralEntryMapper;
import com.sanlly.production.dao.ReferralExtMapper;
import com.sanlly.production.dao.UnitCourseMapper;
import com.sanlly.production.dao.UserMapper;
import com.sanlly.production.dao.WorkGroupMapper;
import com.sanlly.production.dao.YardMapper;
import com.sanlly.production.entity.AutomationPriority;
import com.sanlly.production.entity.AutomationPriorityExample;
import com.sanlly.production.entity.ContainerUser;
import com.sanlly.production.entity.ContainerUserExample;
import com.sanlly.production.entity.Course;
import com.sanlly.production.entity.EvaluationEntry;
import com.sanlly.production.entity.EvaluationEntryExample;
import com.sanlly.production.entity.Maintenance;
import com.sanlly.production.entity.PickingList;
import com.sanlly.production.entity.PickingListExample;
import com.sanlly.production.entity.PlanStock;
import com.sanlly.production.entity.PlanStockExample;
import com.sanlly.production.entity.ProdDept;
import com.sanlly.production.entity.ProdDeptExample;
import com.sanlly.production.entity.QualityControlTime;
import com.sanlly.production.entity.QualityControlTimeExample;
import com.sanlly.production.entity.Rate;
import com.sanlly.production.entity.ReferralEntry;
import com.sanlly.production.entity.ReferralEntryExample;
import com.sanlly.production.entity.UnitCourse;
import com.sanlly.production.entity.User;
import com.sanlly.production.entity.WorkGroup;
import com.sanlly.production.entity.WorkGroupExample;
import com.sanlly.production.entity.Yard;
import com.sanlly.production.entity.YardExample;
import com.sanlly.production.enums.AuditUrgencyEnum;
import com.sanlly.production.enums.AutomationPriorityEnum;
import com.sanlly.production.enums.ContainerCategoryEnum;
import com.sanlly.production.enums.PickingStateEnum;
import com.sanlly.production.enums.QualityStateEnum;
import com.sanlly.production.enums.QualityTypeEnum;
import com.sanlly.production.enums.RateCommonEnum;
import com.sanlly.production.enums.RateFromTypeEnum;
import com.sanlly.production.enums.ReferralStateEnum;
import com.sanlly.production.enums.WorkGroupTypeEnum;
import com.sanlly.production.models.input.rate.GetRateMessageInput;
import com.sanlly.production.models.input.referral.AddReferralEntryInput;
import com.sanlly.production.models.input.referral.AddReferralInput;
import com.sanlly.production.models.input.referral.AnewReferraInput;
import com.sanlly.production.models.input.referral.ReferralOperateInput;
import com.sanlly.production.models.input.referral.SearchAutomationInput;
import com.sanlly.production.models.output.rate.GetRateMessageOutput;
import com.sanlly.production.models.output.rate.SelectItemOutput;
import com.sanlly.production.models.output.referral.SearchAutomationOutput;
import com.sanlly.production.service.FoamingService;
import com.sanlly.production.service.RateService;
import com.sanlly.production.service.ReferralService;
import com.sanlly.production.service.WarehouseClient;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 派工实现类
 *
 * @author wangxzh   
 * @version V1.0   
 * @Package com.sanlly.production.service.impl 
 * @Description: TODO
 * @date 2019年9月5日 下午4:11:42 
 */
@Service
public class ReferralServiceImpl extends BaseServiceImpl implements ReferralService {

	@Autowired
	private ReferralEntryMapper referralEntryMapper;

	@Autowired
	private PlanStockMapper planStockMapper;

	@Autowired
	private ReferralExtMapper referralExtMapper;

	@Autowired
	private AutomationPriorityMapper automationPriorityMapper;

	@Autowired
	private FoamingService foamingService;

	@Autowired
	private CourseMapper courseMapper;

	@Autowired
	private UnitCourseMapper unitCourseMapper;

	@Autowired
	private YardMapper yardMapper;

	@Autowired
	private RateService rateService;

	@Autowired
	private PickingListMapper pickingListMapper;

	@Autowired
	private EvaluationEntryMapper evaluationEntryMapper;

	@Autowired
	private RateMapper rateMapper;

	@Autowired
	private ProdDeptMapper prodDeptMapper;

	@Autowired
	private WorkGroupMapper workGroupMapper;

	@Autowired
	private UserMapper userMapper;

	@Autowired
	private ContainerUserMapper containerUserMapper;

	@Autowired
	private WarehouseClient warehouseClient;

	@Autowired
	private QualityControlTimeMapper qualityControlTimeMapper;

	/**
	 * 派工条目新增
	 */
	@Override
	public void AddReferralEntry(AddReferralInput input) {
		// 条目添加
		for (AddReferralEntryInput item : input.getEntryList()) {
			ReferralEntry model = new ReferralEntry();
			model.setProdReferralEntryId(item.getProdReferralEntryId());
			model.setSerialNumber(item.getSerialNumber()); // 序号
			model.setCourse(item.getCourse()); // 进场id
			model.setContainerCategory(item.getContainerCategory()); // 箱类别
			model.setPositionCode(item.getPositionCode()); // 位置代码
			model.setPartsTypeCode(item.getPartsTypeCode()); // 部件大类
			model.setPartsDetailsCode(item.getPartsDetailsCode()); // 部件明细
			model.setPartsRepairCode(item.getPartsRepairCode()); // 部件修理代码
			model.setDamageCode(item.getDamageCode()); // 损坏代码
			model.setRepairCode(item.getRepairCode()); // 修理代码
			model.setMaterialCode(item.getMaterialCode()); // 材质代码
			model.setLength(item.getLength()); // 长
			model.setWidth(item.getWidth()); // 宽
			model.setQuantity(item.getQuantity()); // 数量
			model.setPickingQuantity(0.d); // 已领数量
			model.setBorrowQuantity(0.d); // 借件数量
			model.setPickingState(PickingStateEnum.NOPICKING.getCode()); // 出库状态
			model.setIsRepair(CommonEnum.YES.getCode()); // 是否修理
			model.setRemarks(item.getRemarks()); // 备注
			model.setDevice(item.getDevice()); // 主件
			model.setSparesNumber(item.getSparesNumber()); // 备件号
			model.setWarehouseType(item.getWarehouseType()); // 仓库类型
			model.setRateId(item.getRateId()); // 费率id
			model.setFiveCode(item.getFiveCode()); // 五位代码
			model.setManHour(item.getManHour()); // 工时数
			model.setPhoto(item.getPhoto()); // 修前图片
			model.setWarehouse(item.getWarehouse()); // 仓库
			model.setCompany(item.getCompany()); // 公司
			model.setPrice(item.getPrice()); // 备件价格
			model.setIsOriginal(item.getIsOriginal()); // 是否原件维修
			model.setIsMustPhoto(item.getIsMustPhoto());
			model.setIsDel(PlatformConstants.ISDEL_NO);
			model.setCreateTime(new Date());
			model.setCreateUser(getCurrentUserId());

			referralEntryMapper.insert(model);
		}
	}

	/**
	 * 预出库单添加
	 */
	@Override
	public void addPlanStock(Course course, AddReferralEntryInput entry, String containerCategory) {
		// 判断备件号是否为空
		if (!StringUtils.isNotEmpty(entry.getSparesNumber()))
			return;
		PlanStock model = new PlanStock();
		model.setCourse(course.getProdCourseId()); // 进场id
		model.setContainerNo(course.getContainerNo()); // 箱号
		model.setContainerCategory(containerCategory); // 箱类别
		model.setReferralEntryId(entry.getProdReferralEntryId()); // 派工单明细id
		model.setSparesNumber(entry.getSparesNumber()); // 备件号
		model.setWarehouseType(entry.getWarehouseType()); // 仓库类型
		model.setLength(entry.getLength()); // 长度
		model.setWidth(entry.getWidth()); // 宽度
		model.setWarehouse(entry.getWarehouse()); // 仓库
		model.setCompany(entry.getCompany()); // 公司
		model.setIsOriginal(entry.getIsOriginal()); // 是否原件修理
		model.setPrice(entry.getPrice()); // 备件价格
		model.setQuantity(entry.getQuantity()); // 数量
		model.setPickingQuantity(0.d); // 已领数量
		model.setBorrowQuantity(0.d); // 借件数量
		model.setPickingState(PickingStateEnum.NOPICKING.getCode()); // 状态
		model.setIsDel(PlatformConstants.ISDEL_NO);
		model.setCreateTime(new Date());
		model.setCreateUser(getCurrentUserId());
		planStockMapper.insert(model);
	}

	/**
	 * 添加预出库单
	 */
	public void addPlanStock(Course course, ReferralEntry entry) {
		// 判断备件号是否为空
		if (!StringUtils.isNotEmpty(entry.getSparesNumber()))
			return;
		PlanStock model = new PlanStock();
		model.setCourse(course.getProdCourseId()); // 进场id
		model.setContainerNo(course.getContainerNo()); // 箱号
		model.setContainerCategory(entry.getContainerCategory()); // 箱类别
		model.setReferralEntryId(entry.getProdReferralEntryId()); // 派工单明细id
		model.setSparesNumber(entry.getSparesNumber()); // 备件号
		model.setWarehouseType(entry.getWarehouseType()); // 仓库类型
		model.setLength(entry.getLength()); // 长度
		model.setWidth(entry.getWidth()); // 宽度
		model.setWarehouse(entry.getWarehouse()); // 仓库
		model.setCompany(entry.getCompany()); // 公司
		model.setIsOriginal(entry.getIsOriginal()); // 是否原件修理
		model.setPrice(entry.getPrice()); // 备件价格
		model.setQuantity(entry.getQuantity()); // 数量
		model.setPickingQuantity(0.d); // 已领数量
		model.setBorrowQuantity(0.d); // 借件数量
		model.setPickingState(PickingStateEnum.NOPICKING.getCode()); // 状态
		model.setIsDel(PlatformConstants.ISDEL_NO);
		model.setCreateTime(new Date());
		model.setCreateUser(getCurrentUserId());
		planStockMapper.insert(model);
	}

	/**
	 * 自动排程列表
	 */
	@Override
	public PagedList<SearchAutomationOutput> getAutomationList(SearchAutomationInput input) {
		List<SearchAutomationOutput> outputList = new ArrayList<SearchAutomationOutput>();
		input.setReferralState(ReferralStateEnum.REFERRALED.getCode());
		input.setYard(getCurrentYardKey());
		// 判断是箱类别是否为机组
		if (ContainerCategoryEnum.CONTAINER_01.getCode().equals(input.getContainerCategory())
				|| ContainerCategoryEnum.CONTAINER_02.getCode().equals(input.getContainerCategory())) {
			outputList = referralExtMapper.getCourseList(input);
		} else {
			outputList = referralExtMapper.getUnitCourseList(input);
		}
		if (outputList.size() < 1)
			return new PagedList<>(input.getPageIndex(), input.getPageSize(), 0, outputList);
		// 根据优先级条件排序进场信息表
		outputList = orderCourseList(outputList);
		// 总数
		Integer totalItemCount = outputList.size();
		// 分页
		Integer begin = (input.getPageIndex() - 1) * input.getPageSize();
		Integer end = input.getPageIndex() * input.getPageSize();
		if (outputList.size() >= end)
			outputList = outputList.subList(begin, end);
		else
			outputList = outputList.subList(begin, outputList.size());
		// 数据处理
		// SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// outputList = outputList.stream().map(a -> {
		// // 将分钟转换为小时
		// a.setReferralHours(new BigDecimal(a.getReferralHours())
		// .divide(new BigDecimal(60), 2, BigDecimal.ROUND_HALF_UP).doubleValue());
		// // a.setReferralTime(referralTime);
		// return a;
		// }).collect(Collectors.toList());
		PagedList<SearchAutomationOutput> pagedList = new PagedList<>(input.getPageIndex(), input.getPageSize(),
				totalItemCount, outputList);
		return pagedList;
	}

	/**
	 * 自动排程
	 *
	 * @param outputList
	 * @return List<SearchAutomationOutput> @throws 
	 * @throws SecurityException
	 * @throws NoSuchMethodException
	 * @Description: TODO
	 */
	private List<SearchAutomationOutput> orderCourseList(List<SearchAutomationOutput> outputList) {
		// 根据公司获取自动排程有限价
		AutomationPriorityExample example = new AutomationPriorityExample();
		example.createCriteria().andCompanyEqualTo(getCurrentCompanyKey())
				.andIsValidEqualTo(PlatformConstants.ISVALID_YES).andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<AutomationPriority> list = automationPriorityMapper.selectByExample(example);
		if (list.size() < 1) {
			// 如果找不到则使用青岛公司的优先级设置
			AutomationPriorityExample tempExample = new AutomationPriorityExample();
			tempExample.createCriteria().andCompanyEqualTo(RateCommonEnum.QINGDAOCOMPANYKEY.getCode())
					.andIsValidEqualTo(PlatformConstants.ISVALID_YES).andIsDelEqualTo(PlatformConstants.ISDEL_NO);
			list = automationPriorityMapper.selectByExample(tempExample);
			if (list.size() < 1)
				return outputList;
		}
		// 获取第一条优先级规则
		AutomationPriority automation = list.get(0);
		// 根据优先级规则获取优先级排序字段和基数
		// 第一优先级字段和基数
		AutomationPriorityEnum first = AutomationPriorityEnum.getMessageByCode(automation.getFirstPriority());
		String firstFiled = first.getMessage();
		Integer firstBase = first.getBase();
		// 第二优先级字段和基数
		AutomationPriorityEnum second = AutomationPriorityEnum.getMessageByCode(automation.getSecondPriority());
		String secondFiled = second.getMessage();
		Integer secondBase = second.getBase();
		// 第三优先级字段和基数
		AutomationPriorityEnum third = AutomationPriorityEnum.getMessageByCode(automation.getThirdPriority());
		String thirdFiled = third.getMessage();
		Integer thirdBase = third.getBase();
		// 第四优先级字段和基数
		AutomationPriorityEnum fourth = AutomationPriorityEnum.getMessageByCode(automation.getFourthPriority());
		String fourthFiled = fourth.getMessage();
		Integer fourthBase = fourth.getBase();
		// 第五优先级字段和基数
		AutomationPriorityEnum fifth = AutomationPriorityEnum.getMessageByCode(automation.getFifthPriority());
		String fifthFiled = fifth.getMessage();
		Integer fifthBase = fifth.getBase();

		Class<?> cl = outputList.get(0).getClass();

		Collections.sort(outputList, new Comparator<SearchAutomationOutput>() {

			@Override
			public int compare(SearchAutomationOutput s1, SearchAutomationOutput s2) {
				// 多字段比较
				String a1 = "", a2 = "", b1 = "", b2 = "", c1 = "", c2 = "", d1 = "", d2 = "", e1 = "", e2 = "";
				// String u1 = "", u2 = "";
				try {
					// 用箱人周期，用箱人周期-派工时长
					// 用箱人周期
					String z1 = cl.getDeclaredMethod("get" + AutomationPriorityEnum.REPAIRPERIOD.getMessage())
							.invoke(s1) + "";
					String z2 = cl.getDeclaredMethod("get" + AutomationPriorityEnum.REPAIRPERIOD.getMessage())
							.invoke(s2) + "";
					// 派工时长
					String m1 = cl.getDeclaredMethod("get" + AutomationPriorityEnum.REFERRALTIME.getMessage())
							.invoke(s1) + "";
					// BigDecimal mm1 = new BigDecimal(m1).divide(new BigDecimal(60), 2,
					// BigDecimal.ROUND_HALF_UP);
					String m2 = cl.getDeclaredMethod("get" + AutomationPriorityEnum.REFERRALTIME.getMessage())
							.invoke(s2) + "";
					// BigDecimal mm2 = new BigDecimal(m2).divide(new BigDecimal(60), 2,
					// BigDecimal.ROUND_HALF_UP);

					// 第一优先级
					if (AutomationPriorityEnum.REPAIRPERIOD.getMessage().equals(firstFiled)) {
						a1 = new BigDecimal(z1).subtract(new BigDecimal(m1)) + "";
						a2 = new BigDecimal(z2).subtract(new BigDecimal(m2)) + "";
					} else {
						a1 = String.valueOf(cl.getDeclaredMethod("get" + firstFiled).invoke(s1));
						a2 = String.valueOf(cl.getDeclaredMethod("get" + firstFiled).invoke(s2));
					}
					// 第二优先级
					if (AutomationPriorityEnum.REPAIRPERIOD.getMessage().equals(secondFiled)) {
						b1 = new BigDecimal(z1).subtract(new BigDecimal(m1)) + "";
						b2 = new BigDecimal(z2).subtract(new BigDecimal(m2)) + "";
					} else {
						b1 = cl.getDeclaredMethod("get" + secondFiled).invoke(s1) + "";
						b2 = cl.getDeclaredMethod("get" + secondFiled).invoke(s2) + "";
					}
					// 第三优先级
					if (AutomationPriorityEnum.REPAIRPERIOD.getMessage().equals(thirdFiled)) {
						c1 = new BigDecimal(z1).subtract(new BigDecimal(m1)) + "";
						c2 = new BigDecimal(z2).subtract(new BigDecimal(m2)) + "";
					} else {
						c1 = cl.getDeclaredMethod("get" + thirdFiled).invoke(s1) + "";
						c2 = cl.getDeclaredMethod("get" + thirdFiled).invoke(s2) + "";
					}
					// 第四优先级
					if (AutomationPriorityEnum.REPAIRPERIOD.getMessage().equals(fourthFiled)) {
						d1 = new BigDecimal(z1).subtract(new BigDecimal(m1)) + "";
						d2 = new BigDecimal(z2).subtract(new BigDecimal(m2)) + "";
					} else {
						d1 = cl.getDeclaredMethod("get" + fourthFiled).invoke(s1) + "";
						d2 = cl.getDeclaredMethod("get" + fourthFiled).invoke(s2) + "";
					}
					// 第五优先级
					if (AutomationPriorityEnum.REPAIRPERIOD.getMessage().equals(fifthFiled)) {
						e1 = new BigDecimal(z1).subtract(new BigDecimal(m1)) + "";
						e2 = new BigDecimal(z2).subtract(new BigDecimal(m2)) + "";
					} else {
						e1 = cl.getDeclaredMethod("get" + fifthFiled).invoke(s1) + "";
						e2 = cl.getDeclaredMethod("get" + fifthFiled).invoke(s2) + "";
					}
					//
					//
					//
					// u1 = cl.getDeclaredMethod("get" + secondFiled).invoke(s1) + "";
					// u2 = cl.getDeclaredMethod("get" + secondFiled).invoke(s2) + "";
					// b1 = new BigDecimal(u1).subtract(new BigDecimal(m1));
					// b2 = new BigDecimal(u2).subtract(new BigDecimal(m2));
					// c1 = String.valueOf(cl.getDeclaredMethod("get" + thirdFiled).invoke(s1));
					// c2 = String.valueOf(cl.getDeclaredMethod("get" + thirdFiled).invoke(s2));
					// d1 = String.valueOf(cl.getDeclaredMethod("get" + fourthFiled).invoke(s1));
					// d2 = String.valueOf(cl.getDeclaredMethod("get" + fourthFiled).invoke(s2));
					// e1 = cl.getDeclaredMethod("get" + fifthFiled).invoke(s1) + "";
					// e2 = m2 = cl.getDeclaredMethod("get" + fifthFiled).invoke(s2) + "";
				} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException
						| NoSuchMethodException | SecurityException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				// 判断大小，并乘以基数用于升序或降序操作
				Double a = (Double.valueOf(a1) - Double.valueOf(a2)) * firstBase;
				Double b = (Double.valueOf(b1) - Double.valueOf(b2)) * secondBase;
				Double c = (Double.valueOf(c1) - Double.valueOf(c2)) * thirdBase;
				Double d = (Double.valueOf(d1) - Double.valueOf(d2)) * fourthBase;
				Double e = (Double.valueOf(e1) - Double.valueOf(e2)) * fifthBase;

				// Double b = (b1.subtract(b2)).multiply(new
				// BigDecimal(secondBase)).doubleValue();
				// // Double b = (Double.valueOf(u1) - Double.valueOf(u2)) * secondBase;
				// Integer c = c1.compareTo(c2) * thirdBase;
				// Double d = (Double.valueOf(d1) - Double.valueOf(d2)) * fourthBase;
				// Double e = (Double.valueOf(e1) - Double.valueOf(e2)) * fifthBase;

				// 判断比较结果
				if (a == 0) {
					if (b == 0) {
						if (c == 0) {
							if (d == 0) {
								return e > 0 ? (int) Math.ceil(e) : (int) Math.floor(e);
							}
							return d > 0 ? (int) Math.ceil(d) : (int) Math.floor(d);
						}
						return c > 0 ? (int) Math.ceil(c) : (int) Math.floor(c);
					}
					return b > 0 ? (int) Math.ceil(b) : (int) Math.floor(b);
				}
				return a > 0 ? (int) Math.ceil(a) : (int) Math.floor(a);
			}

		});

		return outputList;
	}

	/**
	 * 派工接口
	 */
	@Override
	public void referralOperate(ReferralOperateInput input) {
		// 是否是机组
		Boolean isUnit = ContainerCategoryEnum.isUnit(input.getContainerCategory());
		// 判断是否派工
		if (!isUnit) {
			Course course = courseMapper.selectByPrimaryKey(input.getCourseId());
			if (ReferralStateEnum.REFERRALED.getCode().equals(course.getReferralState())
					|| ReferralStateEnum.COMPLETED.getCode().equals(course.getReferralState()))
				return;
		} else {
			// 进场信息
			UnitCourse unitCourse = unitCourseMapper.selectByPrimaryKey(input.getCourseId());
			if (ReferralStateEnum.REFERRALED.getCode().equals(unitCourse.getReferralState())
					|| ReferralStateEnum.COMPLETED.getCode().equals(unitCourse.getReferralState()))
				return;

			// 查询估价单明细信息
			EvaluationEntryExample example = new EvaluationEntryExample();
			EvaluationEntryExample.Criteria criteria = example.createCriteria();
			criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO).andCourseEqualTo(input.getCourseId());
			String[] type = { ContainerCategoryEnum.CONTAINER_03.getCode(),
					ContainerCategoryEnum.CONTAINER_04.getCode() };
			criteria.andContainerCategoryIn(Arrays.asList(type));
			List<EvaluationEntry> entryList = evaluationEntryMapper.selectByExampleWithBLOBs(example);
			for (EvaluationEntry item : entryList) {
				if (StringUtils.isNotEmpty(item.getSparesNumber()) && !StringUtils.isNotEmpty(item.getWarehouseType()))
					throw new InvalidException("派工失败，备件号不为空，仓库类型为空");
			}

		}
		// 估价单
		AddReferralInput addInput = new AddReferralInput();
		List<AddReferralEntryInput> addList = new ArrayList<AddReferralEntryInput>();
		// 进场信息
		Course course = courseMapper.selectByPrimaryKey(input.getCourseId());

		// 获取公司
		YardExample yardExample = new YardExample();
		yardExample.createCriteria().andKeyEqualTo(course.getYard()).andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<Yard> yardList = yardMapper.selectByExample(yardExample);
		if (yardList.size() < 1)
			return;
		// 查询估价单明细信息
		EvaluationEntryExample example = new EvaluationEntryExample();
		EvaluationEntryExample.Criteria criteria = example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO).andCourseEqualTo(input.getCourseId());
		if (!isUnit) {
			String[] type = { ContainerCategoryEnum.CONTAINER_01.getCode(),
					ContainerCategoryEnum.CONTAINER_02.getCode() };
			criteria.andContainerCategoryIn(Arrays.asList(type));
		} else {
			String[] type = { ContainerCategoryEnum.CONTAINER_03.getCode(),
					ContainerCategoryEnum.CONTAINER_04.getCode() };
			criteria.andContainerCategoryIn(Arrays.asList(type));
		}
		String containerCategory = course.getContainerCategory();
		if (isUnit)
			containerCategory = ContainerCategoryEnum.CONTAINER_03.getCode();
		List<EvaluationEntry> entryList = evaluationEntryMapper.selectByExampleWithBLOBs(example);
		// 重新计算费用和付费方
		for (EvaluationEntry item : entryList) {
			AddReferralEntryInput model = new AddReferralEntryInput();
			// 获取SAN标准部件明细和维修代码
			Rate sRate = rateMapper.selectByPrimaryKey(item.getRateId());
			// 基础数据（不变数据）
			model.setProdReferralEntryId(item.getProdEvaluationEntryId());
			model.setSerialNumber(item.getSerialNumber()); // 序号
			model.setCourse(item.getCourse()); // 进场id
			model.setContainerCategory(item.getContainerCategory()); // 箱类别
			model.setPositionCode(item.getPositionCode()); // 位置代码
			model.setPartsTypeCode(item.getPartsTypeCode()); // 部件大类
			model.setPartsDetailsCode(sRate.getPartsDetails()); // 部件明细
			model.setPartsRepairCode(sRate.getPartsDetails() + sRate.getRepair()); // 部件修理代码
			model.setRepairCode(sRate.getRepair()); // 修理代码
			model.setDamageCode(item.getDamageCode()); // 损坏代码
			model.setMaterialCode(item.getMaterialCode()); // 材质代码
			model.setLength(item.getLength()); // 长
			model.setWidth(item.getWidth()); // 宽
			model.setQuantity(item.getQuantity()); // 数量
			model.setAlreadyQuantity(0.d); // 已领数量
			model.setBorrowQuantity(0.d); // 借件数量
			model.setIsRepair(CommonEnum.YES.getCode()); // 是否修理
			model.setRemarks(item.getRemarks()); // 备注
			model.setDevice(item.getDevice()); // 主件
			model.setSparesNumber(item.getSparesNumber()); // 备件号
			model.setWarehouseType(item.getWarehouseType()); // 仓库类型
			model.setPhoto(item.getPhoto()); // 修前图片
			model.setIsMustPhoto(item.getIsMustPhoto()); // 是否必传图片
			if (StringUtils.isNotEmpty(item.getSparesNumber()))
				model.setAlreadyState(PickingStateEnum.NOPICKING.getCode()); // 出库状态
			else
				model.setAlreadyState(PickingStateEnum.NOTSTOCKOUT.getCode());
			// 费率相关字段
			GetRateMessageOutput rate = new GetRateMessageOutput();
			model.setRateId(item.getRateId());
			try {
				rate = getRateMessage(model, course, yardList.get(0).getCompany(), containerCategory);
			} catch (Exception e) {
				// TODO: handle exception
				throw new InvalidException("派工" + e.getMessage());
			}
			model.setRateId(rate.getRateId()); // 费率id
			model.setFiveCode(rate.getFiveCode()); // 五位代码
			model.setManHour(rate.getManHour()); // 工时数
			addList.add(model);
			//
			// // 调用预出库单新增
			// addPlanStock(course, model, containerCategory);
		}
		addInput.setCourse(input.getCourseId());
		addInput.setEntryList(addList);
		// 调用派工单明细添加接口
		AddReferralEntry(addInput);
		// 调用预出库单新增
		for (AddReferralEntryInput item : addList) {
			addPlanStock(course, item, containerCategory);
		}
		// 修改派工状态
		if (!isUnit) {
			course.setReferralState(ReferralStateEnum.REFERRALED.getCode()); // 派工状态
			course.setReferralType(input.getReferralType()); // 派工类型
			if (StringUtils.isNotEmpty(course.getQualityResult())) {
				course.setQualityResult(QualityStateEnum.QUALITY_DEFAULT.getCode());
				course.setQualityState(QualityStateEnum.QUALITY_DEFAULT.getCode()); // 质检结果
			}
			Double manHour = new BigDecimal(
					addList.stream().map(AddReferralEntryInput::getManHour).reduce(Double::sum).get())
							.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
			course.setManHour(manHour);
			course.setReferralTime(new Date()); // 派工时间
			if (!StringUtils.isNotEmpty(course.getUrgency()))
				course.setUrgency(AuditUrgencyEnum.DEFAULT.getCode());// 紧急程度
			// 质检类型
			QualityControlTimeExample qualityExample = new QualityControlTimeExample();
			qualityExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
					.andIsValidEqualTo(PlatformConstants.ISVALID_YES)
					.andContainerCategoryEqualTo(course.getContainerCategory())
					.andQualityControlTypeEqualTo(QualityTypeEnum.QUALITYTYPE_MUST.getCode());
			List<QualityControlTime> qualityList = qualityControlTimeMapper.selectByExample(qualityExample);
			if (qualityList.size() > 0) {
				if (manHour > qualityList.get(0).getQualityControlTime())
					course.setQualityType(QualityTypeEnum.QUALITYTYPE_MUST.getCode());
			}
			courseMapper.updateByPrimaryKey(course);
		} else {
			// 进场信息
			UnitCourse unitCourse = unitCourseMapper.selectByPrimaryKey(input.getCourseId());
			unitCourse.setReferralState(ReferralStateEnum.REFERRALED.getCode()); // 派工状态
			unitCourse.setReferralType(input.getReferralType()); // 派工类型
			if (StringUtils.isNotEmpty(unitCourse.getQualityResult())) {
				unitCourse.setQualityResult(QualityStateEnum.QUALITY_DEFAULT.getCode());
				unitCourse.setQualityState(QualityStateEnum.QUALITY_DEFAULT.getCode()); // 质检结果
			}
			Double manHour = new BigDecimal(
					addList.stream().map(AddReferralEntryInput::getManHour).reduce(Double::sum).get())
							.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
			unitCourse.setManHour(manHour);
			unitCourse.setReferralTime(new Date()); // 派工时间
			// 质检类型
			QualityControlTimeExample qualityExample = new QualityControlTimeExample();
			qualityExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
					.andIsValidEqualTo(PlatformConstants.ISVALID_YES)
					.andContainerCategoryEqualTo(ContainerCategoryEnum.CONTAINER_03.getCode())
					.andQualityControlTypeEqualTo(QualityTypeEnum.QUALITYTYPE_MUST.getCode());
			List<QualityControlTime> qualityList = qualityControlTimeMapper.selectByExample(qualityExample);
			if (qualityList.size() > 0) {
				if (manHour > qualityList.get(0).getQualityControlTime())
					unitCourse.setQualityType(QualityTypeEnum.QUALITYTYPE_MUST.getCode());
			}
			unitCourseMapper.updateByPrimaryKey(unitCourse);
			if (!StringUtils.isNotEmpty(course.getUrgency()))
				course.setUrgency(AuditUrgencyEnum.DEFAULT.getCode());// 紧急程度
			courseMapper.updateByPrimaryKey(course);
		}
		// 调用发泡添加接口
		foamingService.addFoaming(input.getCourseId());
	}

	/**
	 * 获取费率相关信息
	 *
	 * @param input
	 * @return GetRateMessageOutput @throws 
	 * @Description: TODO
	 */
	private GetRateMessageOutput getRateMessage(AddReferralEntryInput input, Course course, String company,
			String containerCategory) {
		// 返回
		GetRateMessageOutput output = new GetRateMessageOutput();
		// 组装参数
		GetRateMessageInput rateInput = new GetRateMessageInput();
		rateInput.setRateId(input.getRateId()); // SAN标准费率
		rateInput.setCompany(company); // 公司
		rateInput.setContainerUser(getSanKey()); // 用箱人
		rateInput.setContainerCategory(containerCategory); // 箱类别
		rateInput.setPartsType(input.getPartsTypeCode()); // 部件大类
		rateInput.setPartsDetails(input.getPartsDetailsCode()); // 部件明细
		rateInput.setRepair(input.getRepairCode()); // 维修代码
		// if
		// (ContainerCategoryEnum.CONTAINER_01.getCode().equals(input.getContainerCategory()))
		// {
		// Integer count = input.getPartsRepairCode().length();
		// rateInput.setPartsDetails(input.getPartsRepairCode().substring(0, count -
		// 2)); // 部件明细
		// rateInput.setRepair(input.getPartsRepairCode().substring(count - 2, count));
		// // 维修代码
		// } else {
		// rateInput.setPartsDetails(input.getPartsDetailsCode()); // 部件明细
		// rateInput.setRepair(input.getRepairCode()); // 维修代码
		// }
		rateInput.setMaterial(input.getMaterialCode()); // 材质代码
		rateInput.setPositionCode(input.getPositionCode()); // 位置代码
		rateInput.setContainerType(course.getContainerType()); // 箱型
		rateInput.setSize(course.getSize()); // 尺寸
		rateInput.setLength(input.getLength()); // 长
		rateInput.setWidth(input.getWidth()); // 宽
		rateInput.setQuantity(input.getQuantity()); // 数量
		rateInput.setSparesNumber(input.getSparesNumber()); // 备件号
		rateInput.setFromType(RateFromTypeEnum.TYPE03.getCode()); // 费率类型：报价工时
		// 调用费率
		output = rateService.getRateMessage(rateInput);
		return output;
	}

	/**
	 * 修改派工单是否修理字段
	 */
	@Override
	public void updateIsRepair(String[] entryIds) {
		// 将是否修理字段改为不修理
		ReferralEntryExample example = new ReferralEntryExample();
		example.createCriteria().andParentReferralEntryIn(Arrays.asList(entryIds));
		ReferralEntry model = new ReferralEntry();
		model.setIsRepair(CommonEnum.NO.getCode());
		model.setUpdateTime(new Date());
		model.setUpdateUser(getCurrentUserId());
		referralEntryMapper.updateByExampleSelective(model, example);
	}

	/**
	 * 取消派工
	 */
	@Override
	public String cancelReferra(String courseId, String containerCategory) {
		// 进场信息
		Course course = courseMapper.selectByPrimaryKey(courseId);
		UnitCourse unitCourse = unitCourseMapper.selectByPrimaryKey(courseId);
		// 是否是机组
		Boolean isUnit = ContainerCategoryEnum.isUnit(containerCategory);
		// 如果进场信息的派工状态不为派工中，直接返回
		if (!isUnit) {
			if (!ReferralStateEnum.REFERRALED.getCode().equals(course.getReferralState()))
				return null;
		} else {
			if (!ReferralStateEnum.REFERRALED.getCode().equals(unitCourse.getReferralState()))
				return null;
		}
		// 判断是否已存在出库条目
		// 查询派工条目信息
		ReferralEntryExample referralExample = new ReferralEntryExample();
		referralExample.createCriteria().andCourseEqualTo(courseId).andContainerCategoryEqualTo(containerCategory);
		List<ReferralEntry> referralLits = referralEntryMapper.selectByExample(referralExample);
		// 筛选出领料状态为：部分出库、全部出库的派工条目
		referralLits = referralLits.stream().filter(a -> {
			if (PickingStateEnum.STOCKOUT.getCode().equals(a.getPickingState())
					|| PickingStateEnum.STOCKOUTALL.getCode().equals(a.getPickingState()))
				return true;
			return false;
		}).collect(Collectors.toList());
		if (referralLits.size() > 0)
			return "已存在出库派工条目";
		// 重置进场表派工信息
		if (!isUnit) {
			course.setDesignateUser(null); // 指派班组
			course.setDesignateTime(null); // 指派时间
			course.setReferralState(ReferralStateEnum.UNREFERRAL.getCode()); // 派工状态
			course.setReferralType(null); // 派工类型
			course.setReferralTime(null); // 派工时间
			course.setPredictTime(null); // 预计完成时间
			course.setManHour(null); // 工时
			course.setReferralRemarks(null); // 派工备注
			course.setQualityType(null); // 质检类型
			course.setQualityResult(null); // 质检结果
			course.setUpdateTime(new Date());
			course.setUpdateUser(getCurrentUserId());
			courseMapper.updateByPrimaryKey(course);
		} else {
			unitCourse.setDesignateUser(null); // 指派班组
			unitCourse.setDesignateTime(null); // 指派时间
			unitCourse.setReferralState(ReferralStateEnum.UNREFERRAL.getCode()); // 派工状态
			unitCourse.setReferralType(null); // 派工类型
			unitCourse.setReferralTime(null); // 派工时间
			unitCourse.setPredictTime(null); // 预计完成时间
			unitCourse.setManHour(null); // 工时
			unitCourse.setReferralRemarks(null); // 派工备注
			unitCourse.setQualityType(null); // 质检类型
			unitCourse.setQualityResult(null); // 质检结果
			unitCourse.setUpdateTime(new Date());
			unitCourse.setUpdateUser(getCurrentUserId());
			unitCourseMapper.updateByPrimaryKey(unitCourse);
		}
		// 删除派工明细
		ReferralEntryExample delReferralExample = new ReferralEntryExample();
		delReferralExample.createCriteria().andCourseEqualTo(courseId).andContainerCategoryEqualTo(containerCategory);
		referralEntryMapper.deleteByExample(delReferralExample);
		// 根据预出库单获取所有的领料单
		PlanStockExample planExample = new PlanStockExample();
		planExample.createCriteria().andCourseEqualTo(courseId).andContainerCategoryEqualTo(containerCategory);
		List<PlanStock> planList = planStockMapper.selectByExample(planExample);
		List<String> pickingNoList = planList.stream().map(a -> {
			return a.getReferralNo();
		}).distinct().collect(Collectors.toList());
		// 删除预出库单
		PlanStockExample delPlanExample = new PlanStockExample();
		delPlanExample.createCriteria().andCourseEqualTo(courseId).andContainerCategoryEqualTo(containerCategory);
		planStockMapper.deleteByExample(delPlanExample);
		// 领料单修改或删除
		// 根据领料单查询全部预出库信息
		if (pickingNoList.size() > 0) {
			PlanStockExample planListExample = new PlanStockExample();
			planListExample.createCriteria().andReferralNoIn(pickingNoList);
			List<PlanStock> endPlanList = planStockMapper.selectByExample(planListExample);
			// 如果查询出的预出库单结果集为空，则将全部的领料单删除
			if (endPlanList.size() < 1) {
				PickingListExample pickingExample = new PickingListExample();
				pickingExample.createCriteria().andReferralNoIn(pickingNoList);
				pickingListMapper.deleteByExample(pickingExample);
			} else {
				// 获取结果集中不包含的领料单号pickingNoList
				List<String> endPickingNoList = endPlanList.stream().filter(a -> {
					if (pickingNoList.contains(a.getReferralNo()))
						return false;
					return true;
				}).map(a -> a.getReferralNo()).collect(Collectors.toList());
				// 将筛选后的领料单删除
				if (endPickingNoList.size() > 0) {
					PickingListExample pickingExample = new PickingListExample();
					pickingExample.createCriteria().andReferralNoIn(endPickingNoList);
					pickingListMapper.deleteByExample(pickingExample);
				}
				// 对剩余的领料单进场操作,判断剩余领料单的领料状态是否为部分出库，如果是部分出库，则判断是否可修改为全部出库
				List<String> pNoList = endPlanList.stream().filter(a -> {
					if (pickingNoList.contains(a.getReferralNo()))
						return true;
					return false;
				}).map(a -> a.getReferralNo()).distinct().collect(Collectors.toList());
				for (String item : pNoList) {
					// 查询领料单
					PickingListExample pExample = new PickingListExample();
					pExample.createCriteria().andReferralNoEqualTo(item);
					List<PickingList> pList = pickingListMapper.selectByExample(pExample);
					PickingList pModel = pList.get(0);
					if (PickingStateEnum.STOCKOUT.getCode().equals(pModel.getPickingState())) {
						// 判断当前领料号下，预出库数量是否等于已领数量+借件数量
						List<PlanStock> sList = endPlanList.stream().filter(a -> {
							if (item.equals(a.getReferralNo())
									&& a.getQuantity() == (new BigDecimal(a.getPickingQuantity())
											.add(new BigDecimal(a.getBorrowQuantity())).doubleValue()))
								return false;
							return true;
						}).collect(Collectors.toList());
						if (sList.size() == 0)
							pModel.setPickingState(PickingStateEnum.STOCKOUTALL.getCode());
					}
					pModel.setUpdateUser(getCurrentUserId());
					pModel.setUpdateTime(new Date());
					pickingListMapper.updateByPrimaryKey(pModel);
				}
			}
		}
		// 删除发泡数据
		foamingService.delFoaming(courseId);

		return null;
	}

	/**
	 * 重新派工
	 */
	@Override
	public String anewReferra(AnewReferraInput input) {
		// 判断进场表表派工状态，如果派工状态不为已派工，则直接结束方法
		// 进场信息
		Course course = courseMapper.selectByPrimaryKey(input.getCourseId());
		UnitCourse unitCourse = unitCourseMapper.selectByPrimaryKey(input.getCourseId());
		// 是否是机组
		Boolean isUnit = ContainerCategoryEnum.isUnit(input.getContainerCategory());
		// 如果进场信息的派工状态不为派工中，直接返回
		if (!isUnit) {
			if (!ReferralStateEnum.REFERRALED.getCode().equals(course.getReferralState()))
				return null;
		} else {
			if (!ReferralStateEnum.REFERRALED.getCode().equals(unitCourse.getReferralState()))
				return null;
		}

		// 查询估价单明细信息
		EvaluationEntryExample example = new EvaluationEntryExample();
		EvaluationEntryExample.Criteria criteria = example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO).andCourseEqualTo(input.getCourseId());
		String[] type = { ContainerCategoryEnum.CONTAINER_03.getCode(), ContainerCategoryEnum.CONTAINER_04.getCode() };
		criteria.andContainerCategoryIn(Arrays.asList(type));
		List<EvaluationEntry> entryList = evaluationEntryMapper.selectByExampleWithBLOBs(example);
		for (EvaluationEntry item : entryList) {
			if (StringUtils.isNotEmpty(item.getSparesNumber()) && !StringUtils.isNotEmpty(item.getWarehouseType()))
				throw new InvalidException("派工失败，备件号不为空，仓库类型为空");
		}

		// 判断预出库单的出库状态，存在部分出库或者全部出库的提示
		// 查询派工条目信息
		ReferralEntryExample referralExample = new ReferralEntryExample();
		referralExample.createCriteria().andCourseEqualTo(input.getCourseId())
				.andContainerCategoryEqualTo(input.getContainerCategory());
		List<ReferralEntry> referralLits = referralEntryMapper.selectByExample(referralExample);
		// 筛选出领料状态为：部分出库、全部出库的派工条目
		referralLits = referralLits.stream().filter(a -> {
			if (PickingStateEnum.STOCKOUT.getCode().equals(a.getPickingState())
					|| PickingStateEnum.STOCKOUTALL.getCode().equals(a.getPickingState()))
				return true;
			return false;
		}).collect(Collectors.toList());
		if (referralLits.size() > 0)
			return "已存在出库派工条目";

		// 更新派工条目，重新计算费率相关字段，派工条目中的部件明细和维修代码要转换成SAN标准代码
		// 获取估价单条目
		EvaluationEntryExample evaluationExample = new EvaluationEntryExample();
		evaluationExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
				.andCourseEqualTo(input.getCourseId()).andContainerCategoryEqualTo(input.getContainerCategory());
		List<EvaluationEntry> evaluationList = evaluationEntryMapper.selectByExampleWithBLOBs(evaluationExample);
		// 获取公司
		String company = "";
		YardExample yardExample = new YardExample();
		yardExample.createCriteria().andKeyEqualTo(course.getYard());
		List<Yard> yardList = yardMapper.selectByExample(yardExample);
		if (yardList.size() > 0) {
			company = yardList.get(0).getCompany();
		}
		// // 派工单添加
		// for (EvaluationEntry item : evaluationList) {
		// // 派工单条目添加
		// addReferral(item, course, company);
		// }
		// 派工单添加
		addReferral(evaluationList, course, company);
		// 删除派工单中与估价单不对应的派工条目
		// 获取更新之后的派工条目
		referralLits = referralEntryMapper.selectByExample(referralExample);
		List<String> evaluationIds = evaluationList.stream().map(a -> a.getProdEvaluationEntryId())
				.collect(Collectors.toList());
		// 获取派工单中存在估价单中不存在的条目id
		List<String> referralIds = referralLits.stream()
				.filter(a -> !evaluationIds.contains(a.getProdReferralEntryId())).map(a -> a.getProdReferralEntryId())
				.collect(Collectors.toList());
		if (referralIds.size() > 0) {
			ReferralEntryExample delReferralExample = new ReferralEntryExample();
			delReferralExample.createCriteria().andProdReferralEntryIdIn(referralIds);
			referralEntryMapper.deleteByExample(delReferralExample);
		}

		// 删除原始预出库单，重新添加预出库单
		// 获取预出库信息
		PlanStockExample planStockExample = new PlanStockExample();
		planStockExample.createCriteria().andCourseEqualTo(input.getCourseId())
				.andContainerCategoryEqualTo(input.getContainerCategory());
		List<PlanStock> planStockList = planStockMapper.selectByExample(planStockExample);
		// 删除预出库单
		planStockMapper.deleteByExample(planStockExample);
		// 重新添加预出库单
		for (ReferralEntry item : referralLits) {
			if (StringUtils.isNotEmpty(item.getSparesNumber())) {
				PlanStock model = new PlanStock();
				model.setCourse(item.getCourse()); // 进场id
				model.setContainerCategory(item.getContainerCategory()); // 箱类别
				model.setContainerNo(course.getContainerNo()); // 箱号
				model.setReferralEntryId(item.getProdReferralEntryId()); // 派工单条目id
				model.setSparesNumber(item.getSparesNumber()); // 备件号
				model.setWarehouseType(item.getWarehouseType()); // 仓库类型
				model.setLength(item.getLength()); // 长
				model.setWidth(item.getWidth()); // 宽
				model.setWarehouse(item.getWarehouse()); // 仓库
				model.setCompany(item.getCompany()); // 公司
				model.setIsOriginal(item.getIsOriginal()); // 是否原件修理
				model.setPrice(item.getPrice()); // 备件价格
				model.setQuantity(item.getQuantity()); // 领件数量
				model.setPickingQuantity(0.d); // 已领数量
				model.setBorrowQuantity(0.d); // 借件数量
				model.setPickingState(PickingStateEnum.NOPICKING.getCode()); // 领料状态
				model.setRemarks(item.getRemarks()); // 备注
				model.setIsDel(PlatformConstants.ISDEL_NO);
				model.setCreateTime(new Date());
				model.setCreateUser(getCurrentUserId());
				planStockMapper.insert(model);
			}
		}
		// 修改或删除领料单
		if (planStockList.size() > 0) {
			// 获取所有相关领料单
			PickingListExample pickingExample = new PickingListExample();
			// 领料单号
			List<String> referralNos = planStockList.stream().map(a -> a.getReferralNo()).collect(Collectors.toList());
			pickingExample.createCriteria().andReferralNoIn(referralNos);
			List<PickingList> pickingList = pickingListMapper.selectByExample(pickingExample);
			for (PickingList item : pickingList) {
				// 查询预出库单
				PlanStockExample planExample = new PlanStockExample();
				planExample.createCriteria().andReferralNoEqualTo(item.getReferralNo());
				List<PlanStock> planList = planStockMapper.selectByExample(planExample);
				// 如果预出库单条数为0
				if (planList.size() < 1) {
					pickingListMapper.deleteByPrimaryKey(item.getProdPickingListId());
				} else {
					// 判断领料单的领料状态，为全部出库时不做处理，部分出库时要重新判断领料状态
					if (PickingStateEnum.STOCKOUT.getCode().equals(item.getPickingState())) {
						// 获取预出库单领料状态为全部出库的条数
						long count = planList.stream().filter(a -> {
							if (PickingStateEnum.STOCKOUTALL.getCode().equals(a.getPickingState()))
								return true;
							return false;
						}).count();
						if (count == planList.size()) {
							item.setPickingState(PickingStateEnum.STOCKOUTALL.getCode());
							pickingListMapper.updateByPrimaryKey(item);
						}
					}
				}
			}
		}

		// 修改进场表派工类型字段，并重新计算工时
		if (!isUnit) {
			// course.setReferralState(ReferralStateEnum.REFERRALED.getCode());
			course.setReferralType(input.getReferralType());
			course.setUpdateTime(new Date());
			course.setUpdateUser(getCurrentUserId());
			if (StringUtils.isNotEmpty(course.getQualityResult())) {
				course.setQualityResult(QualityStateEnum.QUALITY_DEFAULT.getCode());
				course.setQualityState(QualityStateEnum.QUALITY_DEFAULT.getCode()); // 质检结果
			}
			// 获取更新之后的派工条目
			referralLits = referralEntryMapper.selectByExample(referralExample);
			// 更新进场表工时数
			course.setManHour(new BigDecimal(referralLits.stream().mapToDouble(ReferralEntry::getManHour).sum())
					.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
			if (!StringUtils.isNotEmpty(course.getUrgency()))
				course.setUrgency(AuditUrgencyEnum.DEFAULT.getCode());
			// 质检类型
			QualityControlTimeExample qualityExample = new QualityControlTimeExample();
			qualityExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
					.andIsValidEqualTo(PlatformConstants.ISVALID_YES)
					.andContainerCategoryEqualTo(course.getContainerCategory())
					.andQualityControlTypeEqualTo(QualityTypeEnum.QUALITYTYPE_MUST.getCode());
			List<QualityControlTime> qualityList = qualityControlTimeMapper.selectByExample(qualityExample);
			if (qualityList.size() > 0) {
				if (course.getManHour() > qualityList.get(0).getQualityControlTime())
					course.setQualityType(QualityTypeEnum.QUALITYTYPE_MUST.getCode());
			}
			courseMapper.updateByPrimaryKey(course);
		} else {
			// unitCourse.setReferralState(ReferralStateEnum.REFERRALED.getCode());
			unitCourse.setReferralType(input.getReferralType());
			unitCourse.setUpdateTime(new Date());
			unitCourse.setUpdateUser(getCurrentUserId());
			if (StringUtils.isNotEmpty(unitCourse.getQualityResult())) {
				unitCourse.setQualityResult(QualityStateEnum.QUALITY_DEFAULT.getCode());
				unitCourse.setQualityState(QualityStateEnum.QUALITY_DEFAULT.getCode()); // 质检结果
			}
			// 获取更新之后的派工条目
			referralLits = referralEntryMapper.selectByExample(referralExample);
			// 更新进场表工时数
			unitCourse.setManHour(new BigDecimal(referralLits.stream().mapToDouble(ReferralEntry::getManHour).sum())
					.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
			unitCourseMapper.updateByPrimaryKey(unitCourse);
			if (!StringUtils.isNotEmpty(course.getUrgency()))
				course.setUrgency(AuditUrgencyEnum.DEFAULT.getCode());
			// 质检类型
			QualityControlTimeExample qualityExample = new QualityControlTimeExample();
			qualityExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
					.andIsValidEqualTo(PlatformConstants.ISVALID_YES)
					.andContainerCategoryEqualTo(ContainerCategoryEnum.CONTAINER_03.getCode())
					.andQualityControlTypeEqualTo(QualityTypeEnum.QUALITYTYPE_MUST.getCode());
			List<QualityControlTime> qualityList = qualityControlTimeMapper.selectByExample(qualityExample);
			if (qualityList.size() > 0) {
				if (unitCourse.getManHour() > qualityList.get(0).getQualityControlTime())
					course.setQualityType(QualityTypeEnum.QUALITYTYPE_MUST.getCode());
			}
			courseMapper.updateByPrimaryKey(course);
		}

		return null;
	}

	/**
	 * 派工单条目添加
	 *
	 * @param item
	 *            void @throws 
	 * @throws RateException
	 * @Description: TODO
	 */
	// private void addReferral(EvaluationEntry item, Course course, String company)
	// {
	private void addReferral(List<EvaluationEntry> list, Course course, String company) {
		List<ReferralEntry> refList = new ArrayList<ReferralEntry>();
		for (EvaluationEntry item : list) {
			// 修改估价单部件明细、维修代码和费率相关字段
			// 将用箱人部件明细、维修代码转为SAN标准部件明细、维修代码
			Rate rate = rateMapper.selectByPrimaryKey(item.getRateId());
			// 如果查询出的费率标准费率id不为空，则根据标准费率id获取SAN标准费率
			if (StringUtils.isNotEmpty(rate.getStandardRate())) {
				rate = rateMapper.selectByPrimaryKey(rate.getStandardRate());
			}
			item.setPartsDetailsCode(rate.getPartsDetails()); // 部件明细
			item.setRepairCode(rate.getRepair()); // 维修代码
			item.setPartsRepairCode(rate.getPartsDetails() + rate.getRepair()); // 部件修理代码
			// 获取费率，计算派工工时
			GetRateMessageOutput referralRate = new GetRateMessageOutput();
			try {
				referralRate = getReferralRate(item, course, company);
			} catch (Exception e) {
				// TODO: handle exception
				throw new InvalidException("派工" + e.getMessage());
			}

			// 判断派工单条目是否存在，存在修改不存在新增
			ReferralEntry model = referralEntryMapper.selectByPrimaryKey(item.getProdEvaluationEntryId());
			if (model != null) {
				model.setSerialNumber(item.getSerialNumber()); // 序号
				model.setRateId(referralRate.getRateId()); // 费率id
				model.setFiveCode(referralRate.getFiveCode()); // 五位代码
				model.setCourse(item.getCourse()); // 进场id
				model.setContainerCategory(item.getContainerCategory()); // 箱类别
				model.setIsRepair(item.getIsRepair()); // 是否允许修理
				model.setPositionCode(item.getPositionCode()); // 位置代码
				model.setPartsTypeCode(item.getPartsTypeCode()); // 部件大类
				model.setPartsDetailsCode(item.getPartsDetailsCode()); // 部件明细
				model.setPartsRepairCode(item.getPartsRepairCode()); // 部件修理代码
				model.setRepairCode(item.getRepairCode()); // 维修代码
				model.setDamageCode(item.getDamageCode()); // 损坏代码
				model.setMaterialCode(item.getMaterialCode()); // 材质代码
				model.setDevice(item.getDevice()); // 主件
				model.setSparesNumber(item.getSparesNumber()); // 备件号
				model.setWarehouseType(item.getWarehouseType()); // 仓库类型
				model.setLength(item.getLength()); // 长
				model.setWidth(item.getWidth()); // 宽
				model.setQuantity(item.getQuantity()); // 数量
				model.setPickingQuantity(0.d); // 已领数量
				model.setBorrowQuantity(0.d); // 借件数量
				model.setPickingState(PickingStateEnum.NOPICKING.getCode()); // 领料状态
				model.setManHour(referralRate.getManHour()); // 工时
				model.setPhoto(item.getPhoto()); // 修前图片
				model.setIsMustPhoto(item.getIsMustPhoto());
				model.setPayingParty(item.getPayingParty()); // 付费方
				model.setRemarks(item.getRemarks()); // 备注
				model.setWarehouse(item.getWarehouse()); // 仓库
				model.setCompany(item.getCompany()); // 公司
				model.setPrice(item.getPrice()); // 备件价格
				model.setIsOriginal(item.getIsOriginal()); // 是否原件维修
				model.setUpdateTime(new Date());
				model.setUpdateUser(getCurrentUserId());
				// referralEntryMapper.updateByPrimaryKey(model);
				refList.add(model);
			} else {
				ReferralEntry referral = new ReferralEntry();
				referral.setProdReferralEntryId(item.getProdEvaluationEntryId());
				referral.setSerialNumber(item.getSerialNumber()); // 序号
				referral.setRateId(referralRate.getRateId()); // 费率id
				referral.setFiveCode(referralRate.getFiveCode()); // 五位代码
				referral.setCourse(item.getCourse()); // 进场id
				referral.setContainerCategory(item.getContainerCategory()); // 箱类别
				referral.setIsRepair(item.getIsRepair()); // 是否允许修理
				referral.setPositionCode(item.getPositionCode()); // 位置代码
				referral.setPartsTypeCode(item.getPartsTypeCode()); // 部件大类
				referral.setPartsDetailsCode(item.getPartsDetailsCode()); // 部件明细
				referral.setPartsRepairCode(item.getPartsRepairCode()); // 部件修理代码
				referral.setRepairCode(item.getRepairCode()); // 维修代码
				referral.setDamageCode(item.getDamageCode()); // 损坏代码
				referral.setMaterialCode(item.getMaterialCode()); // 材质代码
				referral.setDevice(item.getDevice()); // 主件
				referral.setSparesNumber(item.getSparesNumber()); // 备件号
				referral.setWarehouseType(item.getWarehouseType()); // 仓库类型
				referral.setLength(item.getLength()); // 长
				referral.setWidth(item.getWidth()); // 宽
				referral.setQuantity(item.getQuantity()); // 数量
				referral.setPickingQuantity(0.d); // 已领数量
				referral.setBorrowQuantity(0.d); // 借件数量
				referral.setPickingState(PickingStateEnum.NOPICKING.getCode()); // 领料状态
				referral.setManHour(referralRate.getManHour()); // 工时
				referral.setPhoto(item.getPhoto()); // 修前图片
				referral.setIsMustPhoto(item.getIsMustPhoto());
				referral.setPayingParty(item.getPayingParty()); // 付费方
				referral.setRemarks(item.getRemarks()); // 备注
				referral.setWarehouse(item.getWarehouse()); // 仓库
				referral.setCompany(item.getCompany()); // 公司
				referral.setPrice(item.getPrice()); // 备件价格
				referral.setIsOriginal(item.getIsOriginal()); // 是否原件维修
				referral.setIsDel(PlatformConstants.ISDEL_NO);
				referral.setCreateTime(new Date());
				referral.setCreateUser(getCurrentUserId());
				// referralEntryMapper.insert(referral);
				refList.add(referral);
			}
		}
		// 变更派工明细
		for (ReferralEntry item : refList) {
			if (item.getUpdateTime() != null) {
				referralEntryMapper.updateByPrimaryKey(item);
			} else {
				referralEntryMapper.insert(item);
			}
		}
	}

	/**
	 * 获取派工工时
	 *
	 * @param item
	 * @return Double @throws 
	 * @throws RateException
	 * @Description: TODO
	 */
	private GetRateMessageOutput getReferralRate(EvaluationEntry input, Course course, String company) {
		// 组装参数
		GetRateMessageInput rateInput = new GetRateMessageInput();
		rateInput.setRateId(input.getRateId()); // SAN费率id
		rateInput.setCompany(company); // 公司
		rateInput.setContainerUser(getSanKey()); // 用箱人
		rateInput.setContainerCategory(input.getContainerCategory()); // 箱类别
		rateInput.setPartsType(input.getPartsTypeCode()); // 部件大类
		rateInput.setPartsDetails(input.getPartsDetailsCode()); // 部件明细
		rateInput.setRepair(input.getRepairCode()); // 维修代码
		rateInput.setMaterial(input.getMaterialCode()); // 材质代码
		rateInput.setPositionCode(input.getPositionCode()); // 位置代码
		rateInput.setContainerType(course.getContainerType()); // 箱型
		rateInput.setSize(course.getSize()); // 尺寸
		rateInput.setLength(input.getLength()); // 长
		rateInput.setWidth(input.getWidth()); // 宽
		rateInput.setQuantity(input.getQuantity()); // 数量
		rateInput.setFromType(RateFromTypeEnum.TYPE03.getCode()); // 费率类型：报价工时
		// 调用费率
		return rateService.getRateMessage(rateInput);
	}

	/**
	 * 获取维修班组
	 */
	@Override
	public List<SelectItemOutput> getDesignateUser(String yard, String containerCategory) {
		// 查询
		WorkGroupExample example = new WorkGroupExample();
		WorkGroupExample.Criteria criteria = example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO).andIsValidEqualTo(PlatformConstants.ISVALID_YES)
				.andYardEqualTo(yard).andWorkGroupTypeEqualTo(WorkGroupTypeEnum.REFERRAL.getCode());
		if (StringUtils.isNotEmpty(containerCategory)) {
			// 获取当前场站的生产部门
			ProdDeptExample deptExample = new ProdDeptExample();
			deptExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andYardEqualTo(yard)
					.andProdDeptNameLike("%" + ContainerCategoryEnum.getMessagebyCode(containerCategory) + "%");
			List<ProdDept> deptList = prodDeptMapper.selectByExample(deptExample);
			List<String> deptKeys = deptList.stream().map(a -> a.getKey()).collect(Collectors.toList());
			if (deptKeys.size() < 1)
				return new ArrayList<SelectItemOutput>();
			criteria.andProdDeptIn(deptKeys);
		}
		List<WorkGroup> workList = workGroupMapper.selectByExample(example);
		return workList.stream().map(a -> {
			SelectItemOutput output = new SelectItemOutput();
			output.setValue(String.valueOf(a.getUser()));
			User user = userMapper.selectByPrimaryKey(a.getUser());
			if (user != null)
				output.setCode(user.getUserName());
			return output;
		}).collect(Collectors.toList());
	}

	/**
	 * 获取SANkey
	 *
	 * @return String @throws 
	 */
	private String getSanKey() {
		ContainerUserExample userExample = new ContainerUserExample();
		userExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
				.andContainerUserCodeEqualTo(RateCommonEnum.CONTAINERUSERKEY2.getCode());
		List<ContainerUser> userList = containerUserMapper.selectByExample(userExample);
		if (userList.size() > 0)
			return userList.get(0).getKey();
		return null;
	}

	/**
	 * 获取已出库成本
	 */
	@Override
	public BigDecimal getStockMoney(String courseId, String containerCategory) {
		// 获取领料单号和箱号
		PlanStockExample example = new PlanStockExample();
		example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andCourseEqualTo(courseId)
				.andContainerCategoryEqualTo(containerCategory);
		List<PlanStock> list = planStockMapper.selectByExample(example);
		if (list.size() > 0) {
			BigDecimal money = new BigDecimal(0);
			for (PlanStock item : list) {
				BigDecimal cost = warehouseClient.getTotalAmount(item.getReferralNo(), item.getContainerNo()).getData();
				// 调用仓储接口获取出口总成本
				if (cost != null)
					money = money.add(cost);
			}
			return money;
		}
		return new BigDecimal(0);
	}

	/**
	 * 根据用户获取工作组
	 */
	@Override
	public WorkGroupOutput getWorkGroupByUser(String yard, Integer user) {
		WorkGroupOutput model = new WorkGroupOutput();
		// 查询工作组表
		WorkGroupExample example = new WorkGroupExample();
		example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
				.andIsValidEqualTo(PlatformConstants.ISVALID_YES).andYardEqualTo(yard).andUserEqualTo(user);
		List<WorkGroup> list = workGroupMapper.selectByExample(example);
		if (list.size() > 0) {
			WorkGroup item = list.get(0);
			model.setCode(item.getCode());
			model.setCompany(item.getCompany());
			model.setYard(item.getYard());
			model.setProdDept(item.getProdDept());
			model.setWorkGroupType(item.getWorkGroupType());
			model.setUser(item.getUser());
			model.setType(item.getType());
			model.setLocation(item.getZone());
			model.setWorkHourTop(item.getWorkHourTop());
			model.setWorkHourBottom(item.getWorkHourBottom());
		}
		return model;
	}

	/**
	 * 预出库单添加，保修
	 */
	@Override
	public void addMainPlanStock(Maintenance course, AddReferralEntryInput entry, String containerCategory) {
		// 判断备件号是否为空
		if (!StringUtils.isNotEmpty(entry.getSparesNumber()))
			return;
		PlanStock model = new PlanStock();
		model.setCourse(course.getProdMaintenanceId()); // 进场id
		model.setContainerNo(course.getContainerNo()); // 箱号
		model.setContainerCategory(containerCategory); // 箱类别
		model.setReferralEntryId(entry.getProdReferralEntryId()); // 派工单明细id
		model.setSparesNumber(entry.getSparesNumber()); // 备件号
		model.setWarehouseType(entry.getWarehouseType()); // 仓库类型
		model.setLength(entry.getLength()); // 长度
		model.setWidth(entry.getWidth()); // 宽度
		model.setWarehouse(entry.getWarehouse()); // 仓库
		model.setCompany(entry.getCompany()); // 公司
		model.setIsOriginal(entry.getIsOriginal()); // 是否原件修理
		model.setPrice(entry.getPrice()); // 备件价格
		model.setQuantity(entry.getQuantity()); // 数量
		model.setPickingQuantity(0.d); // 已领数量
		model.setBorrowQuantity(0.d); // 借件数量
		model.setPickingState(PickingStateEnum.NOPICKING.getCode()); // 状态
		model.setIsDel(PlatformConstants.ISDEL_NO);
		model.setCreateTime(new Date());
		model.setCreateUser(getCurrentUserId());
		planStockMapper.insert(model);
	}

}
