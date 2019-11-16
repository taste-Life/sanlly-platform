package com.sanlly.production.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.enums.CommonEnum;
import com.sanlly.common.models.exception.InvalidException;
import com.sanlly.common.models.output.SelectOutput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.dao.AuditAutomaticMapper;
import com.sanlly.production.dao.AuditInspectorMapper;
import com.sanlly.production.dao.AuditPayingChangeMapper;
import com.sanlly.production.dao.AuditQuotedPriceMapper;
import com.sanlly.production.dao.AuditRestrictMapper;
import com.sanlly.production.dao.ContainerUserMapper;
import com.sanlly.production.dao.CourseEntryMapper;
import com.sanlly.production.dao.CourseMapper;
import com.sanlly.production.dao.EvaluationEntryMapper;
import com.sanlly.production.dao.MaintenanceMapper;
import com.sanlly.production.dao.PayingPartyChangeMapper;
import com.sanlly.production.dao.PickingListMapper;
import com.sanlly.production.dao.PlanStockMapper;
import com.sanlly.production.dao.QualityControlTimeMapper;
import com.sanlly.production.dao.QualityProportionMapper;
import com.sanlly.production.dao.RateExtMapper;
import com.sanlly.production.dao.ReferralEntryMapper;
import com.sanlly.production.dao.UnitCourseMapper;
import com.sanlly.production.dao.UserMapper;
import com.sanlly.production.dao.YardMapper;
import com.sanlly.production.entity.AuditAutomatic;
import com.sanlly.production.entity.AuditAutomaticExample;
import com.sanlly.production.entity.AuditInspector;
import com.sanlly.production.entity.AuditInspectorExample;
import com.sanlly.production.entity.AuditPayingChange;
import com.sanlly.production.entity.AuditPayingChangeExample;
import com.sanlly.production.entity.AuditQuotedPrice;
import com.sanlly.production.entity.AuditQuotedPriceExample;
import com.sanlly.production.entity.AuditRestrict;
import com.sanlly.production.entity.AuditRestrictExample;
import com.sanlly.production.entity.ContainerUser;
import com.sanlly.production.entity.ContainerUserExample;
import com.sanlly.production.entity.Course;
import com.sanlly.production.entity.CourseEntry;
import com.sanlly.production.entity.CourseEntryExample;
import com.sanlly.production.entity.CourseExample;
import com.sanlly.production.entity.CourseWithBLOBs;
import com.sanlly.production.entity.EvaluationEntryExample;
import com.sanlly.production.entity.Maintenance;
import com.sanlly.production.entity.MaintenanceExample;
import com.sanlly.production.entity.PayingPartyChange;
import com.sanlly.production.entity.PayingPartyChangeExample;
import com.sanlly.production.entity.PickingList;
import com.sanlly.production.entity.PickingListExample;
import com.sanlly.production.entity.PlanStock;
import com.sanlly.production.entity.PlanStockExample;
import com.sanlly.production.entity.QualityControlTime;
import com.sanlly.production.entity.QualityControlTimeExample;
import com.sanlly.production.entity.QualityProportion;
import com.sanlly.production.entity.QualityProportionExample;
import com.sanlly.production.entity.ReferralEntry;
import com.sanlly.production.entity.ReferralEntryExample;
import com.sanlly.production.entity.UnitCourse;
import com.sanlly.production.entity.UnitCourseExample;
import com.sanlly.production.entity.UnitCourseWithBLOBs;
import com.sanlly.production.entity.User;
import com.sanlly.production.entity.Yard;
import com.sanlly.production.entity.YardExample;
import com.sanlly.production.enums.AuditAutomaticEnum;
import com.sanlly.production.enums.AuditTypeEnum;
import com.sanlly.production.enums.AuditUrgencyEnum;
import com.sanlly.production.enums.AuditUserGradeEnum;
import com.sanlly.production.enums.CleaningSourceEnum;
import com.sanlly.production.enums.ContainerCategoryEnum;
import com.sanlly.production.enums.ContainerStateEnum;
import com.sanlly.production.enums.CourseTypeEnum;
import com.sanlly.production.enums.PayingCalculationTypeEnum;
import com.sanlly.production.enums.PayingConditionEnum;
import com.sanlly.production.enums.PayingDisposeTypeEnum;
import com.sanlly.production.enums.PickingStateEnum;
import com.sanlly.production.enums.PkQualityStateEnum;
import com.sanlly.production.enums.QualityStateEnum;
import com.sanlly.production.enums.QualityTypeEnum;
import com.sanlly.production.enums.RateCommonEnum;
import com.sanlly.production.enums.RateFromTypeEnum;
import com.sanlly.production.enums.RateStageEnum;
import com.sanlly.production.enums.ReferralStateEnum;
import com.sanlly.production.enums.ReferralTypeEnum;
import com.sanlly.production.enums.ReplyStateEnum;
import com.sanlly.production.enums.TestingStateEnum;
import com.sanlly.production.enums.UnitStateEnum;
import com.sanlly.production.enums.CleaningEntryEnum;
import com.sanlly.production.models.input.cleaning.CleaningAddInput;
import com.sanlly.production.models.input.containerTesting.AddMasterAuditInput;
import com.sanlly.production.models.input.containerTesting.AddSonAuditInput;
import com.sanlly.production.models.input.containerTesting.ReferraMoneyInput;
import com.sanlly.production.models.input.containerTesting.SearchAuditInput;
import com.sanlly.production.models.input.containerTesting.SearchAuditRateInput;
import com.sanlly.production.models.input.containerTesting.UpdateMasterAuditInput;
import com.sanlly.production.models.input.evaluation.AddEvaluationEntryInput;
import com.sanlly.production.models.input.evaluation.AddEvaluationInput;
import com.sanlly.production.models.input.rate.GetRateMessageInput;
import com.sanlly.production.models.input.referral.AddReferralEntryInput;
import com.sanlly.production.models.input.referral.AddReferralInput;
import com.sanlly.production.models.output.containerTesting.AuditAutomaticOutput;
import com.sanlly.production.models.output.containerTesting.SearchAuditOutput;
import com.sanlly.production.models.output.containerTesting.SearchAuditRateOutput;
import com.sanlly.production.models.output.containerTesting.SonAuditOutput;
import com.sanlly.production.models.output.rate.GetRateMessageOutput;
import com.sanlly.production.models.output.rate.SelectItemOutput;
import com.sanlly.production.service.AuditService;
import com.sanlly.production.service.CleaningService;
import com.sanlly.production.service.EstimateDetailService;
import com.sanlly.production.service.FoamingService;
import com.sanlly.production.service.RateMHService;
import com.sanlly.production.service.RateService;
import com.sanlly.production.service.ReferralService;
import com.sanlly.production.service.XxService;

/**
 * 自动审核实现类
 * 
 * @Package com.sanlly.production.service.impl 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年8月29日 下午8:03:10 
 * @version V1.0   
 */
@Service
public class AuditServiceImpl extends BaseServiceImpl implements AuditService {

	@Autowired
	private AuditAutomaticMapper auditAutomaticMapper;

	@Autowired
	private AuditRestrictMapper auditRestrictMapper;

	@Autowired
	private AuditInspectorMapper auditInspectorMapper;

	@Autowired
	private AuditQuotedPriceMapper auditQuotedPriceMapper;

	@Autowired
	private CourseMapper courseMapper;

	@Autowired
	private UnitCourseMapper unitCourseMapper;

	@Autowired
	private YardMapper yardMapper;

	@Autowired
	private CourseEntryMapper courseEntryMapper;

	@Autowired
	private RateExtMapper rateExtMapper;

	@Autowired
	private UserMapper userMapper;

	@Autowired
	private CleaningService cleaningService;

	@Autowired
	private FoamingService foamingService;

	@Autowired
	private RateService rateService;

	@Autowired
	private ReferralService referralService;

	@Autowired
	private PayingPartyChangeMapper payingPartyChangeMapper;

	@Autowired
	private AuditPayingChangeMapper auditPayingChangeMapper;

	@Autowired
	private EstimateDetailService estimateDetailService;

	@Autowired
	private ContainerUserMapper containerUserMapper;

	@Autowired
	private RateMHService rateMHService;

	@Autowired
	private XxService xxService;

	@Autowired
	private MaintenanceMapper maintenanceMapper;

	@Autowired
	private QualityControlTimeMapper qualityControlTimeMapper;

	@Autowired
	private QualityProportionMapper qualityProportionMapper;

	@Autowired
	private EvaluationEntryMapper evaluationEntryMapper;

	@Autowired
	private ReferralEntryMapper referralEntryMapper;

	@Autowired
	private PlanStockMapper planStockMapper;

	@Autowired
	private PickingListMapper pickingListMapper;

	/**
	 * 自动审核列表
	 */
	@Override
	public PagedList<SearchAuditOutput> getAuditPagedList(SearchAuditInput input) {
		AuditAutomaticExample example = new AuditAutomaticExample();
		// 排序
		example.setOrderByClause("create_time desc");
		AuditAutomaticExample.Criteria criteria = example.createCriteria();
		// 未删、当前公司
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO).andCompanyEqualTo(getCurrentCompanyKey());
		// 检索条件
		if (StringUtils.isNotEmpty(input.getContainerCategory())) {
			criteria.andContainerCategoryEqualTo(input.getContainerCategory());
		}
		if (StringUtils.isNotEmpty(input.getContainerUser())) {
			criteria.andContainerUserEqualTo(input.getContainerUser());
		}
		// 总条数
		Integer totalItemCount = (int) auditAutomaticMapper.countByExample(example);
		PagedList<SearchAuditOutput> pagedList = new PagedList<SearchAuditOutput>(input.getPageIndex(),
				input.getPageSize(), totalItemCount);
		// 分页查询
		example.setLimitStart(pagedList.getLimitStart());
		example.setLimitEnd(pagedList.getLimitEnd());
		List<AuditAutomatic> auditList = auditAutomaticMapper.selectByExample(example);
		// 构造返回数据
		List<SearchAuditOutput> list = new ArrayList<SearchAuditOutput>();
		for (AuditAutomatic item : auditList) {
			SearchAuditOutput model = new SearchAuditOutput();
			model.setAuditId(item.getProdAuditAutomaticId());
			model.setCompanyLang(item.getCompany()); // 公司
			model.setContainerUserLang(item.getContainerUser()); // 用箱人
			model.setContainerCategoryLang(item.getContainerCategory()); // 箱类别
			model.setIsAuditEnableLang(item.getIsAuditEnable()); // 自动审核是否启动
			model.setIsReferraEnableLang(item.getIsReferraEnable()); // 自动派工是否启动
			model.setReferraMoney(item.getReferraMoney()); // 自动派工金额
			list.add(model);
		}
		// 将分页数据放入结果中
		pagedList.getDataList().addAll(list);
		return pagedList;
	}

	/**
	 * 自动审核主表新增
	 */
	@Override
	public void addMasterAudit(AddMasterAuditInput input) {
		AuditAutomatic model = new AuditAutomatic();
		model.setCompany(input.getCompany()); // 公司
		model.setContainerCategory(input.getContainerCategory()); // 箱类别
		model.setContainerUser(input.getContainerUser()); // 用箱人
		model.setIsAuditEnable(input.getIsAuditEnable()); // 自动审核是否启用
		model.setIsReferraEnable(input.getIsReferraEnable()); // 自动派工是否启用
		model.setReferraMoney(input.getReferraMoney()); // 自动派工金额
		model.setIsDel(PlatformConstants.ISDEL_NO);
		model.setCreateTime(new Date());
		model.setCreateUser(getCurrentUserId());
		auditAutomaticMapper.insert(model);
	}

	/**
	 * 获取单条自动审核主表信息
	 */
	@Override
	public AuditAutomaticOutput getMasterAudit(Integer auditId) {
		AuditAutomatic audit = auditAutomaticMapper.selectByPrimaryKey(auditId);
		if (audit.getIsDel().equals(PlatformConstants.ISDEL_NO)) {
			AuditAutomaticOutput model = new AuditAutomaticOutput();
			model.setAuditId(audit.getProdAuditAutomaticId());
			model.setCompany(audit.getCompany()); // 公司
			model.setContainerCategory(audit.getContainerCategory()); // 箱类别
			model.setContainerUser(audit.getContainerUser()); // 用箱人
			model.setIsAuditEnable(audit.getIsAuditEnable()); // 自动审核是否启用
			model.setIsReferraEnable(audit.getIsReferraEnable()); // 自动派工是否启用
			model.setReferraMoney(audit.getReferraMoney()); // 自动派工金额
			return model;
		}
		return null;
	}

	/**
	 * 编辑自动审核主表信息
	 */
	@Override
	public void updateMasterAudit(UpdateMasterAuditInput input) {
		AuditAutomatic model = auditAutomaticMapper.selectByPrimaryKey(input.getAuditId());
		if (model.getIsDel().equals(PlatformConstants.ISDEL_NO)) {
			model.setContainerCategory(input.getContainerCategory()); // 箱类别
			model.setContainerUser(input.getContainerUser()); // 用箱人
			model.setIsAuditEnable(input.getIsAuditEnable()); // 自动审核是否启用
			model.setIsReferraEnable(input.getIsReferraEnable()); // 自动派工是否启用
			model.setReferraMoney(input.getReferraMoney()); // 自动派工金额
			model.setUpdateTime(new Date());
			model.setUpdateUser(getCurrentUserId());
			auditAutomaticMapper.updateByPrimaryKey(model);
			return;
		}
		throw new InvalidException("编辑失败");
	}

	/**
	 * 删除自动审核主表信息
	 */
	@Override
	public void delMasterAudit(Integer[] listIds) {
		AuditAutomaticExample example = new AuditAutomaticExample();
		example.createCriteria().andProdAuditAutomaticIdIn(Arrays.asList(listIds));
		AuditAutomatic model = new AuditAutomatic();
		model.setIsDel(PlatformConstants.ISDEL_YES);
		model.setUpdateTime(new Date());
		model.setUpdateUser(getCurrentUserId());
		// 批量删除
		auditAutomaticMapper.updateByExampleSelective(model, example);
	}

	/**
	 * 编辑自动审核条件
	 */
	@Override
	public void updateSonAudit(AddSonAuditInput input) {
		// 修改主表数据
		AuditAutomatic auditAutomatic = auditAutomaticMapper.selectByPrimaryKey(input.getAuditId());
		auditAutomatic.setIsRestrict(input.getIsRestrict()); // 限制条件是否启用
		auditAutomatic.setIsInspector(input.getIsInspector()); // 检验员等级是否启用
		auditAutomatic.setIsQuoted(input.getIsQuoted()); // 报价金额是否启用
		auditAutomatic.setUpdateTime(new Date());
		auditAutomatic.setUpdateUser(getCurrentUserId());
		auditAutomaticMapper.updateByPrimaryKey(auditAutomatic);
		// 判断限制条件是否已存在,存在修改，不存在新增
		AuditRestrictExample restrictExample = new AuditRestrictExample();
		restrictExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
				.andAuditIdEqualTo(input.getAuditId());
		List<AuditRestrict> restrictList = auditRestrictMapper.selectByExample(restrictExample);
		if (restrictList.size() > 0) {
			AuditRestrict model = restrictList.get(0);
			model.setRateCode(StringUtils.join(input.getRateCode(), ",")); // 限制条目
			model.setUpdateTime(new Date());
			model.setUpdateUser(getCurrentUserId());
			auditRestrictMapper.updateByPrimaryKey(model);
		} else {
			AuditRestrict model = new AuditRestrict();
			model.setAuditId(input.getAuditId());
			model.setRateCode(StringUtils.join(input.getRateCode(), ",")); // 限制条目
			model.setIsDel(PlatformConstants.ISDEL_NO);
			model.setCreateTime(new Date());
			model.setCreateUser(getCurrentUserId());
			auditRestrictMapper.insert(model);
		}
		// 判断检验员等级是否已存在，存在修改，不存在新增
		AuditInspectorExample inspectorExample = new AuditInspectorExample();
		inspectorExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
				.andAuditIdEqualTo(input.getAuditId());
		List<AuditInspector> inspectorList = auditInspectorMapper.selectByExample(inspectorExample);
		// 等于三条时修改，不等于三条时，删除原来的在新增
		if (inspectorList.size() == 3) {
			for (AuditInspector item : inspectorList) {
				if (item.getTestingUserGrade().equals(AuditUserGradeEnum.GRADE_A.getCode())) {
					if (input.getAgradeList() != null) {
						item.setTestingUser(getGradeList(input.getAgradeList()));
						auditInspectorMapper.updateByPrimaryKey(item);
					}
				} else if (item.getTestingUserGrade().equals(AuditUserGradeEnum.GRADE_B.getCode())) {
					if (input.getBgradeList() != null) {
						item.setTestingUser(getGradeList(input.getBgradeList()));
						auditInspectorMapper.updateByPrimaryKey(item);
					}
				} else if (item.getTestingUserGrade().equals(AuditUserGradeEnum.GRADE_C.getCode())) {
					if (input.getCgradeList() != null) {
						item.setTestingUser(getGradeList(input.getCgradeList()));
						auditInspectorMapper.updateByPrimaryKey(item);
					}
				}
			}
		} else {
			// 删除检验员等级信息
			AuditInspectorExample inExample = new AuditInspectorExample();
			inExample.createCriteria().andAuditIdEqualTo(input.getAuditId());
			auditInspectorMapper.deleteByExample(inExample);
			// 新增检验员等级
			for (int i = 1; i <= 3; i++) {
				AuditInspector model = new AuditInspector();
				model.setAuditId(input.getAuditId());
				model.setIsDel(PlatformConstants.ISDEL_NO);
				model.setCreateTime(new Date());
				model.setCreateUser(getCurrentUserId());
				if (i == 1) {
					model.setTestingUserGrade(AuditUserGradeEnum.GRADE_A.getCode());
					if (input.getAgradeList() != null)
						model.setTestingUser(getGradeList(input.getAgradeList()));
				} else if (i == 2) {
					model.setTestingUserGrade(AuditUserGradeEnum.GRADE_B.getCode());
					if (input.getBgradeList() != null)
						model.setTestingUser(getGradeList(input.getBgradeList()));
				} else {
					model.setTestingUserGrade(AuditUserGradeEnum.GRADE_C.getCode());
					if (input.getCgradeList() != null)
						model.setTestingUser(getGradeList(input.getCgradeList()));
				}
				auditInspectorMapper.insert(model);
			}
		}
		// 判断报价金额删除，重新添加
		AuditQuotedPriceExample quotedExample = new AuditQuotedPriceExample();
		quotedExample.createCriteria().andAuditIdEqualTo(input.getAuditId());
		auditQuotedPriceMapper.deleteByExample(quotedExample);
		// 新增
		for (ReferraMoneyInput item : input.getMoneyList()) {
			AuditQuotedPrice model = new AuditQuotedPrice();
			model.setAuditId(input.getAuditId());
			model.setTestingUserGrade(item.getGrade()); // 检验员等级
			model.setBeginMoney(item.getBeginMoney()); // 金额范围
			model.setEndMoney(item.getEndMoney()); // 金额范围
			model.setValuationState(item.getValuationState()); // 报价状态
			model.setIsDel(PlatformConstants.ISDEL_NO);
			model.setCreateTime(new Date());
			model.setCreateUser(getCurrentUserId());
			auditQuotedPriceMapper.insert(model);
		}

	}

	/**
	 * 获取检验员字符串
	 * 
	 * @Description: TODO
	 * @param list
	 * @return String @throws 
	 */
	private String getGradeList(List<SelectItemOutput> list) {
		String userList = "";
		for (SelectItemOutput item : list) {
			userList += item.getValue() + ",";
		}
		return userList.substring(0, userList.length() - 1);
	}

	/**
	 * 获取自动审核条件信息
	 */
	@Override
	public SonAuditOutput getSonAudit(Integer auditId) {
		SonAuditOutput model = new SonAuditOutput();
		// 获取条件启用状态
		AuditAutomatic auditAutomatic = auditAutomaticMapper.selectByPrimaryKey(auditId);
		model.setIsRestrict(auditAutomatic.getIsRestrict()); // 限制条目是否启用
		model.setIsInspector(auditAutomatic.getIsInspector()); // 检验员等级是否启用
		model.setIsQuoted(auditAutomatic.getIsQuoted()); // 报价金额是否启用
		model.setCompany(auditAutomatic.getCompany()); // 公司
		model.setContainerCategory(auditAutomatic.getContainerCategory()); // 箱类别
		model.setContainerUser(auditAutomatic.getContainerUser()); // 用箱人

		// 获取限制条件信息
		AuditRestrictExample restrictExample = new AuditRestrictExample();
		restrictExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andAuditIdEqualTo(auditId);
		List<AuditRestrict> restrictList = auditRestrictMapper.selectByExample(restrictExample);
		if (restrictList.size() > 0) {
			model.setRateCode(getRateCode(restrictList.get(0).getRateCode()));
		}
		// 获取检验员等级
		AuditInspectorExample inspectorExample = new AuditInspectorExample();
		inspectorExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andAuditIdEqualTo(auditId);
		List<AuditInspector> inspectorList = auditInspectorMapper.selectByExample(inspectorExample);
		// A级检验员
		List<AuditInspector> listA = inspectorList.stream()
				.filter(a -> AuditUserGradeEnum.GRADE_A.getCode().equals(a.getTestingUserGrade()))
				.collect(Collectors.toList());
		model.setAgradeList(getSelectItem(listA));
		// B级检验员
		List<AuditInspector> listB = inspectorList.stream()
				.filter(a -> AuditUserGradeEnum.GRADE_B.getCode().equals(a.getTestingUserGrade()))
				.collect(Collectors.toList());
		model.setBgradeList(getSelectItem(listB));
		// C级检验员
		List<AuditInspector> listC = inspectorList.stream()
				.filter(a -> AuditUserGradeEnum.GRADE_C.getCode().equals(a.getTestingUserGrade()))
				.collect(Collectors.toList());
		model.setCgradeList(getSelectItem(listC));
		// 报价金额
		AuditQuotedPriceExample quotedExample = new AuditQuotedPriceExample();
		quotedExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andAuditIdEqualTo(auditId);
		List<AuditQuotedPrice> quotedList = auditQuotedPriceMapper.selectByExample(quotedExample);
		List<ReferraMoneyInput> moneyList = new ArrayList<ReferraMoneyInput>();
		for (AuditQuotedPrice item : quotedList) {
			ReferraMoneyInput money = new ReferraMoneyInput();
			money.setGrade(item.getTestingUserGrade());
			money.setBeginMoney(item.getBeginMoney());
			money.setEndMoney(item.getEndMoney());
			money.setValuationState(item.getValuationState());
			moneyList.add(money);
		}
		model.setMoneyList(moneyList);
		return model;
	}

	/**
	 * 获取限制条件数组
	 * 
	 * @Description: TODO
	 * @param rateCode
	 * @return String[] @throws 
	 */
	private String[] getRateCode(String rateCode) {
		if (StringUtils.isNotEmpty(rateCode)) {
			return rateCode.split(",");
		}
		return null;
	}

	/**
	 * 获取选中的检验员
	 * 
	 * @Description: TODO
	 * @param list
	 * @return List<SelectItemOutput> @throws 
	 */
	private List<SelectOutput> getSelectItem(List<AuditInspector> list) {
		if (list.size() > 0 && StringUtils.isNotEmpty(list.get(0).getTestingUser())) {
			List<SelectOutput> selectList = new ArrayList<SelectOutput>();
			for (String item : list.get(0).getTestingUser().split(",")) {
				SelectOutput model = new SelectOutput();
				model.setValue(item);
				User user = userMapper.selectByPrimaryKey(Integer.valueOf(item));
				if (user != null)
					model.setLabel(user.getUserName());
				selectList.add(model);
			}
			return selectList;
		}
		return null;
	}

	/**
	 * 限制条目列表查询
	 */
	@Override
	public PagedList<SearchAuditRateOutput> getAuditRatePagedList(SearchAuditRateInput input) {
		Integer pageIndex = input.getPageIndex();
		Integer beginIndex = (input.getPageIndex() - 1) * input.getPageSize();
		input.setPageIndex(beginIndex);
		// 列表
		List<SearchAuditRateOutput> list = rateExtMapper.getAuditRateList(input);
		// 总条数
		Integer totalItemCount = rateExtMapper.getAuditRateCount(input);
		PagedList<SearchAuditRateOutput> pagedList = new PagedList<>(pageIndex, input.getPageSize(), totalItemCount,
				list);
		return pagedList;
	}

	/**
	 * 自动审核
	 */
	@Override
	public void auditAutomatic(String courseId, Boolean isUnit) {
		// 查询箱体进场表进场数据
		Course course = courseMapper.selectByPrimaryKey(courseId);
		UnitCourse unit = unitCourseMapper.selectByPrimaryKey(courseId);

		// 获取进场的公司名
		YardExample yardExample = new YardExample();
		yardExample.createCriteria().andKeyEqualTo(course.getYard()).andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<Yard> yardList = yardMapper.selectByExample(yardExample);

		// 判断是否需要品控部质检
		isPkQuality(course, unit, isUnit, yardList.get(0).getCompany());
		xxService.createPtiInfo(course, unit);

		// 判断检验结果，好箱体好机组只修改审核状态
		if (!isUnit) {
			// 退租箱不走自动审核
			if (CommonEnum.YES.getCode().equals(course.getIsSurrender()))
				return;
			if (ContainerStateEnum.GOOD.getCode().equals(course.getContainerCondition())) {
				course.setTestingState(TestingStateEnum.AUDITED.getCode());
				course.setAuditTime(new Date());
				courseMapper.updateByPrimaryKey(course);
				return;
			}
		} else {
			// 退租箱不走自动审核
			if (CommonEnum.YES.getCode().equals(course.getIsSurrender()))
				return;
			if (UnitStateEnum.GOOD.getCode().equals(unit.getUnitState())) {
				unit.setTestingState(TestingStateEnum.AUDITED.getCode());
				unit.setAuditTime(new Date());
				unitCourseMapper.updateByPrimaryKey(unit);
				return;
			}
		}

		if (!isUnit) {
			if (TestingStateEnum.UNAUDIT.getCode().equals(course.getTestingState()))
				// 箱体自动审核
				dryAuditAutomatic(course, yardList.get(0).getCompany());
		} else {
			// 查询机组进场表进场数据
			if (unit != null && TestingStateEnum.UNAUDIT.getCode().equals(unit.getTestingState())) {
				unitAuditAutomatic(unit, yardList.get(0).getCompany(), course.getContainerUser());
			}
		}

	}

	/**
	 * 判断是否需要品控部质检
	 * 
	 * @param unit
	 * 
	 * @Description: TODO
	 * @param courseId
	 * @param isUnit
	 *            void @throws 
	 * @param company
	 */
	private void isPkQuality(Course course, UnitCourse unit, Boolean isUnit, String company) {
		// 获取抽检比例
		QualityProportionExample example = new QualityProportionExample();
		example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
				.andIsValidEqualTo(PlatformConstants.ISVALID_YES).andCompanyEqualTo(company)
				.andYardEqualTo(course.getYard());
		List<QualityProportion> list = qualityProportionMapper.selectByExample(example);
		if (list.size() > 0) {
			Integer proportion = list.get(0).getProportion();
			Integer num = new Random().nextInt(proportion) + 1;
			if (proportion >= num) {
				// 修改品控质检状态
				if (isUnit) {
					unit.setPkQualityState(PkQualityStateEnum.PKQUALITY_DEFAULT.getCode());
					unit.setQualityResult(QualityStateEnum.QUALITY_DEFAULT.getCode());
					unitCourseMapper.updateByPrimaryKey(unit);
				} else {
					course.setPkQualityState(PkQualityStateEnum.PKQUALITY_DEFAULT.getCode());
					course.setQualityResult(QualityStateEnum.QUALITY_DEFAULT.getCode());
					courseMapper.updateByPrimaryKey(course);
				}
			}
		}
	}

	/**
	 * 箱体自动审核
	 * 
	 * @Description: TODO
	 * @param course
	 *            void @throws 
	 */
	private void dryAuditAutomatic(Course course, String company) {
		// 判断公司、用箱人、箱类别下有没有自动审核条件,并且自动审核状态为启用
		AuditAutomaticExample automaticExample = new AuditAutomaticExample();
		automaticExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
				.andIsAuditEnableEqualTo(AuditAutomaticEnum.AUTOMATIC_YES.getCode())
				.andContainerCategoryEqualTo(course.getContainerCategory())
				.andContainerUserEqualTo(course.getContainerUser()).andCompanyEqualTo(company);
		List<AuditAutomatic> automaticList = auditAutomaticMapper.selectByExample(automaticExample);
		out: if (automaticList.size() > 0) {
			// 判断限制条件是否满足自动审核
			if (!judgeRestrict(automaticList.get(0), course.getProdCourseId()))
				break out;
			// 判断检验员等级是否满足自动审核
			if (!judgeInspector(automaticList.get(0), course.getTestingUser()))
				break out;
			// 判断报价金额是否满足自动审核,vState:自动审核报价状态
			String vState = judgeQuoted(automaticList.get(0), course.getTestingUser(), course.getTestingMoney());
			if (!StringUtils.isNotEmpty(vState))
				break out;

			// 根据用箱人获取报价币种
			String currency = rateMHService.getUserCurrency(company, course.getContainerUser(),
					course.getContainerCategory());

			// 满足自动审核，首先添加估价单明细
			AddEvaluationEntry(course.getProdCourseId(), false, true);

			// 判断是否自动派工
			Boolean isReferral = getIsReferral(automaticList.get(0), course.getProdCourseId(),
					course.getContainerCategory(), course.getTestingMoney());
			// 判断派工条件，确定是否添加派工单和物料需求单
			if (isReferral) {
				// 添加派工单,预出库单
				AddReferralEntry(course.getProdCourseId(), false);
				// 调用发泡添加接口
				foamingService.addFoaming(course.getProdCourseId());
			}
			// 自动审核，修改主表估价信息
			auditOperation(course.getProdCourseId(), vState, false, currency, AuditTypeEnum.AuditTypeEnum_02.getCode());
		}
		// if (automaticList.size() > 0) {
		// // 判断是否自动派工
		// Boolean isReferral = getIsReferral(automaticList.get(0),
		// course.getProdCourseId(),
		// course.getContainerCategory(), course.getTestingMoney());
		// // 判断派工条件，确定是否添加派工单和物料需求单
		// if (isReferral) {
		// // 添加派工单,预出库单
		// AddReferralEntry(course.getProdCourseId(), false);
		// // 调用发泡添加接口
		// foamingService.addFoaming(course.getProdCourseId());
		// }
		// }
	}

	/**
	 * 机组自动审核
	 * 
	 * @Description: TODO
	 * @param unitCourse
	 *            void @throws 
	 */
	private void unitAuditAutomatic(UnitCourse unitCourse, String company, String containerUser) {
		// 判断公司、用箱人、箱类别下有没有自动审核条件,并且自动审核状态为启用
		AuditAutomaticExample automaticExample = new AuditAutomaticExample();
		automaticExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
				.andIsAuditEnableEqualTo(AuditAutomaticEnum.AUTOMATIC_YES.getCode())
				.andContainerCategoryEqualTo(ContainerCategoryEnum.CONTAINER_03.getCode())
				.andContainerUserEqualTo(containerUser).andCompanyEqualTo(company);
		List<AuditAutomatic> automaticList = auditAutomaticMapper.selectByExample(automaticExample);
		out: if (automaticList.size() > 0) {
			// 判断限制条件是否满足自动审核
			if (!judgeRestrict(automaticList.get(0), unitCourse.getProdCourseId()))
				break out;
			// 判断检验员等级是否满足自动审核
			if (!judgeInspector(automaticList.get(0), unitCourse.getTestingUser()))
				break out;
			// 判断报价金额是否满足自动审核,vState:自动审核报价状态
			String vState = judgeQuoted(automaticList.get(0), unitCourse.getTestingUser(),
					unitCourse.getTestingMoney());
			if (!StringUtils.isNotEmpty(vState))
				break out;
			// 根据用箱人获取报价币种
			String currency = rateMHService.getUserCurrency(company, containerUser,
					ContainerCategoryEnum.CONTAINER_03.getCode());

			// 满足自动审核，首先添加估价单明细
			AddEvaluationEntry(unitCourse.getProdCourseId(), true, true);

			if (isEntryReferral(unitCourse.getProdCourseId(), ContainerCategoryEnum.CONTAINER_03.getCode())) {
				// 预检区修理直接派工
				if (!getOriginal(unitCourse) && CommonEnum.YES.getCode().equals(unitCourse.getIsPreview())) {
					// 添加派工单,预出库单
					AddReferralEntry(unitCourse.getProdCourseId(), true);
					// 调用发泡添加接口
					foamingService.addFoaming(unitCourse.getProdCourseId());
				} else {
					// 判断是否自动派工
					Boolean isReferral = getIsReferral(automaticList.get(0), unitCourse.getProdCourseId(),
							ContainerCategoryEnum.CONTAINER_03.getCode(), unitCourse.getTestingMoney());
					// 判断派工条件，确定是否添加派工单和物料需求单
					if (isReferral) {
						// 添加派工单,预出库单
						AddReferralEntry(unitCourse.getProdCourseId(), true);
						// 调用发泡添加接口
						foamingService.addFoaming(unitCourse.getProdCourseId());
					}
				}
			}
			// 自动审核
			auditOperation(unitCourse.getProdCourseId(), vState, true, currency,
					AuditTypeEnum.AuditTypeEnum_02.getCode());

		}
	}

	/**
	 * 判断是否满足派工条件，备件号不为空，仓库类型为空,返回false不能派工
	 * 
	 * @Description: TODO
	 * @param prodCourseId
	 * @param code
	 * @return boolean @throws 
	 */
	private boolean isEntryReferral(String courseId, String code) {
		CourseEntryExample example = new CourseEntryExample();
		example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andCourseEqualTo(courseId)
				.andContainerCategoryEqualTo(code);
		List<CourseEntry> list = courseEntryMapper.selectByExample(example);
		for (CourseEntry item : list) {
			if (StringUtils.isNotEmpty(item.getSparesNumber()) && !StringUtils.isNotEmpty(item.getWarehouseType()))
				return false;
		}
		return true;
	}

	/**
	 * 判断限制条件是否满足
	 * 
	 * @Description: TODO
	 * @param audit
	 * @param courseId
	 * @return Boolean @throws 
	 */
	private Boolean judgeRestrict(AuditAutomatic audit, String courseId) {
		// 判断限制条件启用状态，没启用则直接通过判断
		if (AuditAutomaticEnum.AUTOMATIC_NO.getCode().equals(audit.getIsRestrict()))
			return true;
		// 获取限制条目内容
		AuditRestrictExample example = new AuditRestrictExample();
		example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
				.andAuditIdEqualTo(audit.getProdAuditAutomaticId());
		List<AuditRestrict> auditList = auditRestrictMapper.selectByExample(example);
		if (auditList.size() < 1)
			return false;
		// 如果限制条目为空，则返回通过
		if (!StringUtils.isNotEmpty(auditList.get(0).getRateCode()))
			return true;
		// 限制内容
		List<String> rateCodeList = Arrays.asList(auditList.get(0).getRateCode().split(","));
		// 获取检验条目信息
		CourseEntryExample courseExample = new CourseEntryExample();
		courseExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andCourseEqualTo(courseId);
		List<CourseEntry> entryList = courseEntryMapper.selectByExample(courseExample);
		// 部件明细和维修代码的组合码集合
		List<String> partsList = entryList.stream().map(a -> {
			if (StringUtils.isNotEmpty(a.getPartsRepairCode()))
				return a.getPartsRepairCode();
			else
				return a.getPartsDetailsCode() + a.getRepairCode();
		}).distinct().collect(Collectors.toList());
		// 没有条目，不自动审核
		if (partsList.size() == 0)
			return false;
		// 取交集
		partsList.retainAll(rateCodeList);
		if (partsList.size() < 1)
			return true;
		return false;
	}

	/**
	 * 判断检验员等级是否满足
	 * 
	 * @Description: TODO
	 * @param audit
	 * @param testingUser
	 * @return Boolean @throws 
	 */
	private Boolean judgeInspector(AuditAutomatic audit, Integer testingUser) {
		// 判断检验员等级是否启用，没启用则直接通过判断
		if (AuditAutomaticEnum.AUTOMATIC_NO.getCode().equals(audit.getIsInspector()))
			return true;
		// 判断检验是否包含在自动审核检验员范围内
		AuditInspectorExample example = new AuditInspectorExample();
		example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
				.andAuditIdEqualTo(audit.getProdAuditAutomaticId());
		List<AuditInspector> inspectorList = auditInspectorMapper.selectByExample(example);
		// 自动审核检验员
		List<String> userList = new ArrayList<String>();
		for (AuditInspector item : inspectorList) {
			if (StringUtils.isNotEmpty(item.getTestingUser())) {
				String[] list = item.getTestingUser().split(",");
				userList.addAll(Arrays.asList(list));
			}
		}
		// 是否包含检验员testingUser
		List<String> isUser = userList.stream().filter(a -> a.equals(String.valueOf(testingUser)))
				.collect(Collectors.toList());
		if (isUser.size() > 0)
			return true;
		return false;
	}

	/**
	 * 判断报价金额是否满足
	 * 
	 * @Description: TODO
	 * @param audit
	 * @param testingMoney
	 * @return Boolean @throws 
	 */
	private String judgeQuoted(AuditAutomatic audit, Integer testingUser, BigDecimal testingMoney) {
		// 判断检验员等级是否启用，没启用则直接通过判断,并返回审批状态为待估价
		if (AuditAutomaticEnum.AUTOMATIC_NO.getCode().equals(audit.getIsQuoted()))
			return ReplyStateEnum.UNDO.getCode();
		// 获取检验员等级
		AuditInspectorExample example = new AuditInspectorExample();
		example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
				.andAuditIdEqualTo(audit.getProdAuditAutomaticId());
		List<AuditInspector> inspectorList = auditInspectorMapper.selectByExample(example);
		// 根据报价金额中的检验员获取检验等级
		List<AuditInspector> userGradeList = inspectorList.stream().filter(a -> {
			if (StringUtils.isNotEmpty(a.getTestingUser())) {
				List<String> userGrade = Arrays.asList(a.getTestingUser().split(","));
				List<String> isUser = userGrade.stream().filter(u -> u.equals(String.valueOf(testingUser)))
						.collect(Collectors.toList());
				if (isUser.size() > 0)
					return true;
			}
			return false;
		}).collect(Collectors.toList());
		// 如果查询不出相应的检验登记，则自动审批不通过
		if (userGradeList.size() > 0) {
			// 检验等级
			String garde = userGradeList.get(0).getTestingUserGrade();
			// 获取该等级下的自动审核报价条件
			AuditQuotedPriceExample priceExample = new AuditQuotedPriceExample();
			priceExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
					.andAuditIdEqualTo(audit.getProdAuditAutomaticId()).andTestingUserGradeEqualTo(garde);
			List<AuditQuotedPrice> priceList = auditQuotedPriceMapper.selectByExample(priceExample);
			// 如果查询不到相应的审批条件，则自动审核不通过
			if (priceList.size() > 0) {
				for (AuditQuotedPrice item : priceList) {
					// 判断报价金额和自动审核条件的金额区间,没有匹配到则自动审核不通过
					if (testingMoney.compareTo(item.getBeginMoney()) > -1
							&& testingMoney.compareTo(item.getEndMoney()) < 1) {
						return item.getValuationState();
					}
				}
			}
		}
		return null;
	}

	/**
	 * 判断是否自动派工
	 * 
	 * @Description: TODO
	 * @param audit
	 * @param courseId
	 * @param containerCategory
	 * @param money
	 * @return Boolean @throws 
	 */
	private Boolean getIsReferral(AuditAutomatic audit, String courseId, String containerCategory, BigDecimal money) {
		// 自动派工未启用，返回false
		if (AuditAutomaticEnum.AUTOMATIC_NO.getCode().equals(audit.getIsReferraEnable()))
			return false;
		// 判断自动派工金额
		if (audit.getReferraMoney() != null) {
			if (money != null && money.compareTo(audit.getReferraMoney()) < 1) {
				// 当满足自动派工条件时，判断条目中是否只有洗箱条目，只有洗箱条目不派工
				// 判断进场条目是否只包含洗箱条目
				CourseEntryExample example = new CourseEntryExample();
				example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andCourseEqualTo(courseId);
				List<CourseEntry> entryList = courseEntryMapper.selectByExample(example);
				// 干箱
				if (ContainerCategoryEnum.CONTAINER_01.getCode().equals(containerCategory)) {
					for (CourseEntry item : entryList) {
						// 只包含洗箱条目时，不生成派工单
						if (!CleaningEntryEnum.MCOWW.getCode().equals(item.getPartsRepairCode())
								&& !CleaningEntryEnum.MCOCC.getCode().equals(item.getPartsRepairCode())) {
							return true;
						}
					}
				} else {
					// 冷箱
					for (CourseEntry item : entryList) {
						// 只包含洗箱条目时，不生成派工单
						if (!CleaningEntryEnum.WW.getCode().equals(item.getRepairCode())
								&& !CleaningEntryEnum.CC.getCode().equals(item.getRepairCode())) {
							return true;
						}
					}
				}
			}
		}

		return false;
	}

	/**
	 * 审核操作
	 * 
	 * @Description: TODO
	 * @param courseId
	 *            void @throws 
	 * @param isReferral
	 */
	private void auditOperation(String courseId, String state, Boolean isUnit, String currency, String auditType) {
		// 质检类型，默认抽检箱
		String qualityType = QualityTypeEnum.QUALITYTYPE_CHOOSE.getCode();
		// 查询进场信息
		CourseWithBLOBs course = courseMapper.selectByPrimaryKey(courseId);
		// 判断进场的是否是机组
		if (!isUnit) {
			// 修改报价状态
			course.setTestingState(TestingStateEnum.AUDITED.getCode()); // 检验审核状态
			course.setAuditType(auditType);// 审核类型
			course.setAuditTime(new Date()); // 审核时间
			course.setAuditUser(getCurrentUserId()); // 审核人
			course.setUseReplyState(state); // 用箱人批复状态
			if (CommonEnum.YES.getCode().equals(course.getIsSurrender())
					&& AuditTypeEnum.AuditTypeEnum_01.getCode().equals(auditType)) {
				course.setMasterReplyState(ReplyStateEnum.UNDO.getCode()); // 箱东批复状态
			}
			course.setUrgency(AuditUrgencyEnum.DEFAULT.getCode()); // 紧急程度
			course.setValuationCurrency(currency); // 报价币种
			// 状态为待批复时，添加估价时间
			if (ReplyStateEnum.UNREPLY.getCode().equals(state))
				course.setValuationTime(new Date());
			if (!StringUtils.isNotEmpty(course.getReferralState()))
				course.setReferralState(ReferralStateEnum.UNREFERRAL.getCode()); // 派工状态
			// 判断质检类型
			if (CommonEnum.YES.getCode().equals(course.getIsSurrender()))
				qualityType = QualityTypeEnum.QUALITYTYPE_MUST.getCode();
			course.setQualityType(qualityType); // 质检状态
			course.setQualityResult(QualityStateEnum.QUALITY_DEFAULT.getCode()); // 质检结果
			course.setQualityState(QualityStateEnum.QUALITY_DEFAULT.getCode()); // 质检结果
			CourseExample example = new CourseExample();
			example.createCriteria().andProdCourseIdEqualTo(courseId);
			courseMapper.updateByExampleSelective(course, example);
		} else {
			// 查询进场信息
			UnitCourseWithBLOBs unit = unitCourseMapper.selectByPrimaryKey(courseId);
			// 修改报价状态
			unit.setTestingState(TestingStateEnum.AUDITED.getCode()); // 检验审核状态
			unit.setAuditType(auditType);// 审核类型
			unit.setAuditTime(new Date()); // 审核时间
			unit.setAuditUser(getCurrentUserId()); // 审核人
			unit.setUseReplyState(state); // 用箱人批复状态
			if (CommonEnum.YES.getCode().equals(course.getIsSurrender())
					&& AuditTypeEnum.AuditTypeEnum_01.getCode().equals(auditType)) {
				unit.setMasterReplyState(ReplyStateEnum.UNDO.getCode()); // 箱东批复状态
			}
			unit.setValuationCurrency(currency); // 报价币种
			// 状态为待批复时，添加估价时间
			if (ReplyStateEnum.UNREPLY.getCode().equals(state))
				unit.setValuationTime(new Date());
			if (!StringUtils.isNotEmpty(unit.getReferralState()))
				unit.setReferralState(ReferralStateEnum.UNREFERRAL.getCode()); // 派工状态
			// 判断质检类型
			if (CommonEnum.YES.getCode().equals(course.getIsSurrender()))
				qualityType = QualityTypeEnum.QUALITYTYPE_MUST.getCode();
			unit.setQualityType(qualityType); // 质检状态
			unit.setQualityResult(QualityStateEnum.QUALITY_DEFAULT.getCode()); // 质检结果
			unit.setQualityState(QualityStateEnum.QUALITY_DEFAULT.getCode()); // 质检结果
			UnitCourseExample example = new UnitCourseExample();
			example.createCriteria().andProdCourseIdEqualTo(courseId);
			unitCourseMapper.updateByExampleSelective(unit, example);
		}

	}

	/**
	 * 组装估价单明细，并调用估价单明细添加接口
	 */
	@Override
	public void AddEvaluationEntry(String courseId, Boolean isUnit, Boolean isAuto) {
		// 估价单
		AddEvaluationInput addInput = new AddEvaluationInput();
		List<AddEvaluationEntryInput> addList = new ArrayList<AddEvaluationEntryInput>();
		// 进场信息
		CourseWithBLOBs course = courseMapper.selectByPrimaryKey(courseId);
		// 获取公司
		YardExample yardExample = new YardExample();
		yardExample.createCriteria().andKeyEqualTo(course.getYard()).andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<Yard> yardList = yardMapper.selectByExample(yardExample);
		if (yardList.size() < 1)
			return;
		// 查询检验单明细信息
		CourseEntryExample example = new CourseEntryExample();
		CourseEntryExample.Criteria criteria = example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO).andCourseEqualTo(courseId);
		if (!isUnit) {
			String[] type = { ContainerCategoryEnum.CONTAINER_01.getCode(),
					ContainerCategoryEnum.CONTAINER_02.getCode() };
			criteria.andContainerCategoryIn(Arrays.asList(type));
		} else {
			String[] type = { ContainerCategoryEnum.CONTAINER_03.getCode() };
			criteria.andContainerCategoryIn(Arrays.asList(type));
		}

		List<CourseEntry> entryList = courseEntryMapper.selectByExampleWithBLOBs(example);
		String containerCategory = course.getContainerCategory();
		if (isUnit)
			containerCategory = ContainerCategoryEnum.CONTAINER_03.getCode();
		// 判断是都需要添加洗箱数据
		Boolean isXX = getIsXX(entryList, containerCategory);
		Boolean isSpecial = getIsSpecial(entryList, containerCategory);
		// 重新计算费用和付费方
		for (CourseEntry item : entryList) {
			AddEvaluationEntryInput model = new AddEvaluationEntryInput();
			// 基础数据（不变数据）
			model.setProdEvaluationEntryId(item.getProdCourseEntryId());
			model.setSerialNumber(item.getSerialNumber()); // 序号
			model.setCourse(item.getCourse()); // 进场id
			model.setContainerCategory(item.getContainerCategory()); // 箱类别
			model.setPositionCode(item.getPositionCode()); // 位置代码
			model.setPartsTypeCode(item.getPartsTypeCode()); // 部件大类
			// model.setPartsDetailsCode(item.getPartsDetailsCode()); // 部件明细
			// model.setPartsRepairCode(item.getPartsRepairCode()); // 部件修理代码
			model.setDamageCode(item.getDamageCode()); // 损坏代码
			// model.setRepairCode(item.getRepairCode()); // 修理代码
			model.setMaterialCode(item.getMaterialCode()); // 材质代码
			model.setLength(item.getLength()); // 长
			model.setWidth(item.getWidth()); // 宽
			model.setQuantity(item.getQuantity()); // 数量
			model.setThirdpartyMoney(item.getThirdpartyMoney()); // 第三方费用
			model.setIsCharge(item.getIsCharge()); // 是否已收费
			model.setIsRepair(CommonEnum.YES.getCode()); // 是否修理
			model.setRemarks(item.getRemarks()); // 备注
			model.setDevice(item.getDevice()); // 主件
			model.setSparesNumber(item.getSparesNumber()); // 备件号
			model.setPhoto(item.getPhoto()); // 修前图片
			model.setWarehouseType(item.getWarehouseType()); // 仓库类型
			model.setIsMustPhoto(item.getIsMustPhoto()); // 是否必填图片
			model.setWarehouse(item.getWarehouse()); // 仓库
			model.setCompany(item.getCompany()); // 公司
			model.setPrice(item.getPrice()); // 备件价格
			model.setIsOriginal(item.getIsOriginal()); // 是否原件维修
			// 获取费率信息
			GetRateMessageOutput rate = new GetRateMessageOutput();
			try {
				rate = getRateMessage(item, course, yardList.get(0).getCompany(), false, containerCategory);
			} catch (Exception e) {
				// 抛出新的异常
				throw new InvalidException("估价" + e.getMessage());
			}
			model.setRateId(rate.getRateId()); // 费率id
			model.setFiveCode(rate.getFiveCode()); // 五位代码
			model.setManHour(rate.getManHour()); // 工时数
			model.setManHourCost(rate.getManHourCost()); // 工时费
			model.setMaterialCost(rate.getMaterialCost()); // 材料费
			BigDecimal sumMoney = rate.getManHourCost().add(rate.getMaterialCost());
			model.setSumMoney(sumMoney); // 总费用
			model.setOriginalManHourCost(rate.getManHourCost()); // 原工时费
			model.setOriginalMaterialCost(rate.getMaterialCost()); // 原材料费
			model.setOriginalSumMoney(sumMoney); // 原总费用
			model.setPartsDetailsCode(rate.getUserPartsDetails()); // 用箱人部件明细
			model.setRepairCode(rate.getUserRepair()); // 用箱人维修代码
			model.setPartsRepairCode(rate.getUserPartsDetails() + rate.getUserRepair()); // 用箱人部件修理代码
			// 付费方相关字段
			model.setPayingParty(item.getPayingParty()); // 付费方
			// model.setPayingParty(getPaying(item, course, yardList.get(0).getCompany()));
			addList.add(model);
		}
		addInput.setCourse(courseId);
		// 修改条目中的付费方
		addList = updateEntryPaying(addList, course, yardList.get(0).getCompany());
		addInput.setEntryList(addList);
		// 调用估价单明细添加接口
		estimateDetailService.addEstimateEntry(addInput);
		// 更新进场主表字段
		estimateDetailService.updateEstimateCourse(entryList.get(0).getCourse(),
				entryList.get(0).getContainerCategory());

		// 自动审核，修改主表估价信息
		if (!isAuto) {
			auditOperation(course.getProdCourseId(), ReplyStateEnum.UNDO.getCode(), isUnit, null,
					AuditTypeEnum.AuditTypeEnum_01.getCode());
		}

		// // 修改主表数据
		// if (!isAuto) {
		// if (!isUnit) {
		// CourseExample cExample = new CourseExample();
		// cExample.createCriteria().andProdCourseIdEqualTo(courseId);
		// course.setTestingState(TestingStateEnum.AUDITED.getCode()); // 检验审核状态
		// if (CommonEnum.YES.getCode().equals(course.getIsSurrender())) {
		// course.setMasterReplyState(ReplyStateEnum.UNDO.getCode()); // 箱东批复状态
		// course.setUseReplyState(ReplyStateEnum.UNDO.getCode()); // 用箱人批复状态
		// } else
		// course.setUseReplyState(ReplyStateEnum.UNDO.getCode()); // 用箱人批复状态
		// course.setUrgency(AuditUrgencyEnum.DEFAULT.getCode()); // 紧急程度
		// course.setAuditTime(new Date());
		// course.setAuditType(AuditTypeEnum.AuditTypeEnum_01.getCode());
		// course.setAuditUser(getCurrentUserId());
		// if (!StringUtils.isNotEmpty(course.getReferralState()))
		// course.setReferralState(ReferralStateEnum.UNREFERRAL.getCode()); // 派工状态
		// // 判断质检类型
		// if (CommonEnum.YES.getCode().equals(course.getIsSurrender()))
		// course.setQualityType(QualityTypeEnum.QUALITYTYPE_MUST.getCode());
		// else
		// course.setQualityType(QualityTypeEnum.QUALITYTYPE_CHOOSE.getCode());
		// course.setQualityResult(QualityStateEnum.QUALITY_DEFAULT.getCode()); // 质检结果
		// course.setQualityState(QualityStateEnum.QUALITY_DEFAULT.getCode()); // 质检结果
		// courseMapper.updateByExampleSelective(course, cExample);
		// } else {
		// UnitCourseExample cExample = new UnitCourseExample();
		// cExample.createCriteria().andProdCourseIdEqualTo(courseId);
		// UnitCourseWithBLOBs unit = unitCourseMapper.selectByPrimaryKey(courseId);
		// unit.setTestingState(TestingStateEnum.AUDITED.getCode()); // 检验审核状态
		// unit.setAuditTime(new Date());
		// unit.setAuditType(AuditTypeEnum.AuditTypeEnum_01.getCode());
		// unit.setAuditUser(getCurrentUserId());
		// // unit.setUseReplyState(ReplyStateEnum.UNDO.getCode()); // 用箱人批复状态
		// if (CommonEnum.YES.getCode().equals(course.getIsSurrender())) {
		// unit.setMasterReplyState(ReplyStateEnum.UNDO.getCode()); // 箱东批复状态
		// unit.setUseReplyState(ReplyStateEnum.UNDO.getCode()); // 用箱人批复状态
		// } else
		// unit.setUseReplyState(ReplyStateEnum.UNDO.getCode()); // 用箱人批复状态
		// if (!StringUtils.isNotEmpty(unit.getReferralState()))
		// unit.setReferralState(ReferralStateEnum.UNREFERRAL.getCode()); // 派工状态
		// // unit.setUseReplyTime(new Date()); // 用箱人批复时间
		// // 判断质检类型
		// if (CommonEnum.YES.getCode().equals(course.getIsSurrender()))
		// unit.setQualityType(QualityTypeEnum.QUALITYTYPE_MUST.getCode());
		// else
		// unit.setQualityType(QualityTypeEnum.QUALITYTYPE_CHOOSE.getCode());
		// unit.setQualityResult(QualityStateEnum.QUALITY_DEFAULT.getCode()); // 质检结果
		// unit.setQualityState(QualityStateEnum.QUALITY_DEFAULT.getCode()); // 质检结果
		// unitCourseMapper.updateByExampleSelective(unit, cExample);
		// }
		// }

		// 添加洗箱信息
		if (isXX) {
			CleaningAddInput cInput = new CleaningAddInput();
			cInput.setCourseId(course.getProdCourseId());
			cInput.setSource(CleaningSourceEnum.ENTRY);
			cInput.setContainerCategory(containerCategory);
			cInput.setIsSpecial(isSpecial ? CommonEnum.YES : CommonEnum.NO);
			cleaningService.addCleaning(cInput);
		}

	}

	/**
	 * 弄断是否需要添加洗箱数据
	 * 
	 * @Description: TODO
	 * @param entryList
	 * @param containerCategory
	 * @return Boolean @throws 
	 */
	private Boolean getIsXX(List<CourseEntry> entryList, String containerCategory) {
		// 干箱
		if (ContainerCategoryEnum.CONTAINER_01.getCode().equals(containerCategory)) {
			for (CourseEntry item : entryList) {
				// 如果包含洗箱条目
				if (CleaningEntryEnum.MCOWW.getCode().equals(item.getPartsRepairCode())
						|| CleaningEntryEnum.MCOCC.getCode().equals(item.getPartsRepairCode())) {
					return true;
				}
			}
		} else {
			// 冷箱
			for (CourseEntry item : entryList) {
				// 如果包含洗箱条目
				if (CleaningEntryEnum.WW.getCode().equals(item.getRepairCode())
						|| CleaningEntryEnum.CC.getCode().equals(item.getRepairCode())) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * 弄断是否特殊箱
	 * 
	 * @Description: TODO
	 * @param entryList
	 * @param containerCategory
	 * @return Boolean @throws 
	 */
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
	 * 获取费率相关信息
	 * 
	 * @Description: TODO
	 * @param input
	 * @return GetRateMessageOutput @throws 
	 */
	private GetRateMessageOutput getRateMessage(CourseEntry input, Course course, String company, Boolean isRepair,
			String containerCategory) {
		// 返回
		GetRateMessageOutput output = new GetRateMessageOutput();
		// 组装参数
		GetRateMessageInput rateInput = new GetRateMessageInput();
		rateInput.setRateId(input.getRateId()); // SAN费率id
		rateInput.setCompany(company); // 公司
		rateInput.setContainerUser(course.getContainerUser()); // 用箱人
		rateInput.setContainerCategory(containerCategory); // 箱类别
		rateInput.setPartsType(input.getPartsTypeCode()); // 部件大类
		if (ContainerCategoryEnum.CONTAINER_01.getCode().equals(input.getContainerCategory())) {
			Integer count = input.getPartsRepairCode().length();
			rateInput.setPartsDetails(input.getPartsRepairCode().substring(0, count - 2)); // 部件明细
			rateInput.setRepair(input.getPartsRepairCode().substring(count - 2, count)); // 维修代码
		} else {
			rateInput.setPartsDetails(input.getPartsDetailsCode()); // 部件明细
			rateInput.setRepair(input.getRepairCode()); // 维修代码
		}
		rateInput.setMaterial(input.getMaterialCode()); // 材质代码
		rateInput.setPositionCode(input.getPositionCode()); // 位置代码
		rateInput.setContainerType(course.getContainerType()); // 箱型
		rateInput.setSize(course.getSize()); // 尺寸
		rateInput.setLength(input.getLength()); // 长
		rateInput.setWidth(input.getWidth()); // 宽
		rateInput.setQuantity(input.getQuantity()); // 数量
		rateInput.setSparesNumber(input.getSparesNumber()); // 备件号
		rateInput.setStage(RateStageEnum.TYPE02.getCode()); // 报价环节使用费率
		if (isRepair) {
			rateInput.setFromType(RateFromTypeEnum.TYPE03.getCode()); // 费率类型：派工工时
			rateInput.setContainerUser(getSanKey()); // 用箱人
		} else
			rateInput.setFromType(RateFromTypeEnum.TYPE01.getCode()); // 费率类型：标准费率
		// 调用费率
		output = rateService.getRateMessage(rateInput);
		return output;
	}

	/**
	 * 付费方转换
	 * 
	 * @Description: TODO
	 * @param item
	 * @param course
	 * @param company
	 * @return String @throws 
	 */
	private List<AddEvaluationEntryInput> updateEntryPaying(List<AddEvaluationEntryInput> list, Course course,
			String company) {
		// 根据进场类型、用箱人、箱类别、内外贸筛选出付费方转换条件
		PayingPartyChangeExample changeExample = new PayingPartyChangeExample();
		PayingPartyChangeExample.Criteria criteria = changeExample.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO).andIsValidEqualTo(PlatformConstants.ISVALID_YES)
				.andCompanyEqualTo(company).andCourseTypeEqualTo(course.getCourseType())
				.andContainerUserLike("%" + course.getContainerUser() + "%")
				.andContainerCategoryLike("%" + course.getContainerCategory() + "%");
		if (StringUtils.isNotEmpty(course.getDomesticForeignTrade()))
			criteria.andDomesticForeignTradeEqualTo(course.getDomesticForeignTrade());
		else
			criteria.andDomesticForeignTradeIsNull();
		List<PayingPartyChange> changeList = payingPartyChangeMapper.selectByExample(changeExample);
		// 如果查询结果集小于1，则将原list返回，不做付费方转换
		if (changeList.size() < 1)
			return list;
		// 将箱体进场类型和付费方转换关系的进场类型比较,进场类型为退租箱时使用是否退租箱字段判断
		changeList = changeList.stream().filter(a -> {
			if (a.getCourseType().equals(course.getCourseType())
					|| (CourseTypeEnum.LKCOURSETYPE000005.getCode().equals(a.getCourseType())
							&& course.getDomesticForeignTrade().equals(CommonEnum.YES.getCode())))
				return true;
			return false;
		}).collect(Collectors.toList());
		// 如果查询结果集小于1，则将原list返回，不做付费方转换
		if (changeList.size() < 1)
			return list;
		// 查询审核付费方转换条件表，判断付费方转换
		AuditPayingChangeExample auditExample = new AuditPayingChangeExample();
		auditExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
				.andIsValidEqualTo(PlatformConstants.ISVALID_YES)
				.andPayingPartyChangeEqualTo(changeList.get(0).getProdPayingPartyChangeId());
		// 付费方转换算法
		List<AuditPayingChange> auditList = auditPayingChangeMapper.selectByExample(auditExample);
		// 如果查询结果集小于1，则将原list返回，不做付费方转换
		if (auditList.size() < 1)
			return list;
		// 根据条目进行再一次筛选
		// 获取条目中的付费方数组
		List<String> payingList = list.stream().map(a -> a.getPayingParty()).distinct().collect(Collectors.toList());
		for (String item : payingList) {
			// 判断算法集合中是否有起始付费方是item的算法
			List<AuditPayingChange> auditItemList = auditList.stream().filter(a -> {
				if (item.equals(a.getInitialPaying()))
					return true;
				return false;
			}).collect(Collectors.toList());
			if (auditItemList.size() < 1)
				continue;
			// 获取付费方是item的条目
			List<AddEvaluationEntryInput> courseList = list.stream().filter(a -> {
				if (item.equals(a.getPayingParty()))
					return true;
				return false;
			}).collect(Collectors.toList());
			// 获取最终付费方
			String paying = getEndPaying(auditItemList, courseList);
			// 如果返回的最终付费方不为空，则使用返回的付费方，否则使用原来的付费方
			if (StringUtils.isNotEmpty(paying)) {
				list = list.stream().map(a -> {
					if (item.equals(a.getPayingParty())) {
						a.setTempPayingParty(paying);// 将最终付费方暂存
					}
					return a;
				}).collect(Collectors.toList());
			}
		}
		// 将暂存的最终付费方存入正式付费方字段中
		list = list.stream().map(a -> {
			if (StringUtils.isNotEmpty(a.getTempPayingParty())) {
				a.setPayingParty(a.getTempPayingParty());
			}
			return a;
		}).collect(Collectors.toList());
		return list;
	}

	/**
	 * 获取最终付费方
	 * 
	 * @Description: TODO
	 * @param auditItemList
	 *            算法集合
	 * @param courseList
	 *            进场检验条目
	 * @return String @throws 
	 */
	private String getEndPaying(List<AuditPayingChange> auditItemList, List<AddEvaluationEntryInput> courseList) {
		// 获取条目工时费、材料费
		BigDecimal manHourCost = courseList.stream().map(AddEvaluationEntryInput::getManHourCost)
				.reduce(BigDecimal.ZERO, BigDecimal::add);
		BigDecimal materialCost = courseList.stream().map(AddEvaluationEntryInput::getMaterialCost)
				.reduce(BigDecimal.ZERO, BigDecimal::add);
		// 遍历算法结合
		for (AuditPayingChange item : auditItemList) {
			// 获取付费方
			String paying = getItemPaying(item, manHourCost, materialCost);
			if (StringUtils.isNotEmpty(paying))
				return paying;
		}
		return null;
	}

	/**
	 * 判断付费方
	 * 
	 * @Description: TODO
	 * @param item
	 * @param manHourCost
	 * @param materialCost
	 * @return String @throws 
	 */
	private String getItemPaying(AuditPayingChange item, BigDecimal manHourCost, BigDecimal materialCost) {
		// 判断金额计算方式
		if (PayingCalculationTypeEnum.CALCULATION01.getCode().equals(item.getCalculationType())) {
			// 先计算，后处理
			// 工时费*工时费系数
			BigDecimal manHour = manHourCost.multiply(BigDecimal.valueOf(item.getManHourCoefficient()));
			// 材料费*材料费系数
			BigDecimal material = materialCost.multiply(BigDecimal.valueOf(item.getMaterialCoefficient()));
			// 根据金额处理类别分别处理工时费、材料费
			BigDecimal endManHour = getEndCost(manHour, item.getDisposeType());
			BigDecimal endMaterial = getEndCost(material, item.getDisposeType());
			// 判断总金额
			return judgeCost(endManHour, endMaterial, item);
		} else if (PayingCalculationTypeEnum.CALCULATION02.getCode().equals(item.getCalculationType())) {
			// 先处理，后计算
			// 根据金额处理类别分别处理工时费、材料费
			BigDecimal manHour = getEndCost(manHourCost, item.getDisposeType());
			BigDecimal material = getEndCost(materialCost, item.getDisposeType());
			// 工时费*工时费系数
			BigDecimal endManHour = manHour.multiply(BigDecimal.valueOf(item.getManHourCoefficient()));
			// 材料费*材料费系数
			BigDecimal endMaterial = material.multiply(BigDecimal.valueOf(item.getMaterialCoefficient()));
			// 判断总金额
			return judgeCost(endManHour, endMaterial, item);
		}
		return null;
	}

	/**
	 * 判断总金额，并返回匹配到的最终付费方
	 * 
	 * @Description: TODO
	 * @param endManHour
	 * @param endMaterial
	 * @param item
	 * @return String @throws 
	 */
	private String judgeCost(BigDecimal endManHour, BigDecimal endMaterial, AuditPayingChange item) {
		// 总费用
		BigDecimal sumCost = endManHour.add(endMaterial);
		// 判断比较方式
		if (PayingConditionEnum.CONDITION01.getCode().equals(item.getSumCostCondition())) {
			// 大于
			if (sumCost.compareTo(item.getSumCostBase()) > 0)
				return item.getFinalPaying();
		} else if (PayingConditionEnum.CONDITION02.getCode().equals(item.getSumCostCondition())) {
			// 小于
			if (sumCost.compareTo(item.getSumCostBase()) < 0)
				return item.getFinalPaying();
		}
		return null;
	}

	/**
	 * 根据金额处理类别处理金额
	 * 
	 * @Description: TODO
	 * @param manHour
	 * @param disposeType
	 * @return BigDecimal @throws 
	 */
	private BigDecimal getEndCost(BigDecimal cost, String disposeType) {
		if (PayingDisposeTypeEnum.DISPOSE01.getCode().equals(disposeType))
			// 不做处理
			return cost;
		else if (PayingDisposeTypeEnum.DISPOSE02.getCode().equals(disposeType))
			// 取整
			return cost.setScale(0, BigDecimal.ROUND_DOWN);
		else if (PayingDisposeTypeEnum.DISPOSE03.getCode().equals(disposeType))
			// 四舍五入
			return cost.setScale(0, BigDecimal.ROUND_HALF_UP);
		else if (PayingDisposeTypeEnum.DISPOSE04.getCode().equals(disposeType))
			// 取整进一
			return cost.setScale(0, BigDecimal.ROUND_UP);
		return cost;
	}

	/**
	 * 添加派工单
	 * 
	 * @Description: TODO
	 * @param courseId
	 *            void @throws 
	 */
	private void AddReferralEntry(String courseId, Boolean isUnit) {
		// 箱体进场信息
		Course course = courseMapper.selectByPrimaryKey(courseId);
		// 机组进场信息
		UnitCourse unitCourse = unitCourseMapper.selectByPrimaryKey(courseId);
		// 判断派工状态
		if (isUnit && ReferralStateEnum.REFERRALED.getCode().equals(unitCourse.getReferralState()))
			return;
		else if (!isUnit && ReferralStateEnum.REFERRALED.getCode().equals(course.getReferralState()))
			return;

		// 派工单
		AddReferralInput addInput = new AddReferralInput();
		List<AddReferralEntryInput> addList = new ArrayList<AddReferralEntryInput>();

		// 获取公司
		YardExample yardExample = new YardExample();
		yardExample.createCriteria().andKeyEqualTo(course.getYard()).andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<Yard> yardList = yardMapper.selectByExample(yardExample);
		if (yardList.size() < 1)
			return;
		// 查询检验单明细信息
		CourseEntryExample example = new CourseEntryExample();
		CourseEntryExample.Criteria criteria = example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO).andCourseEqualTo(courseId);
		if (!isUnit) {
			String[] type = { ContainerCategoryEnum.CONTAINER_01.getCode(),
					ContainerCategoryEnum.CONTAINER_02.getCode() };
			criteria.andContainerCategoryIn(Arrays.asList(type));
		} else {
			String[] type = { ContainerCategoryEnum.CONTAINER_03.getCode() };
			criteria.andContainerCategoryIn(Arrays.asList(type));
		}
		String containerCategory = course.getContainerCategory();
		if (isUnit)
			containerCategory = ContainerCategoryEnum.CONTAINER_03.getCode();
		List<CourseEntry> entryList = courseEntryMapper.selectByExampleWithBLOBs(example);
		// 重新计算费用和付费方
		for (CourseEntry item : entryList) {
			AddReferralEntryInput model = new AddReferralEntryInput();
			// 基础数据（不变数据）
			model.setProdReferralEntryId(item.getProdCourseEntryId());
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
			model.setAlreadyQuantity(0.d); // 已领数量
			model.setBorrowQuantity(0.d); // 借件数量
			model.setIsRepair(CommonEnum.YES.getCode()); // 是否修理
			model.setRemarks(item.getRemarks()); // 备注
			model.setDevice(item.getDevice()); // 主件
			model.setSparesNumber(item.getSparesNumber()); // 备件号
			model.setWarehouseType(item.getWarehouseType()); // 仓库类型
			model.setPhoto(item.getPhoto()); // 修前图片
			model.setIsMustPhoto(item.getIsMustPhoto());// 是否必传图片
			model.setWarehouse(item.getWarehouse()); // 仓库
			model.setCompany(item.getCompany()); // 公司
			model.setPrice(item.getPrice()); // 备件价格
			model.setIsOriginal(item.getIsOriginal()); // 是否原件维修
			if (StringUtils.isNotEmpty(item.getSparesNumber()))
				model.setAlreadyState(PickingStateEnum.NOPICKING.getCode()); // 出库状态
			else
				model.setAlreadyState(PickingStateEnum.NOTSTOCKOUT.getCode());
			// 费率相关字段
			GetRateMessageOutput rate = new GetRateMessageOutput();
			try {
				rate = getRateMessage(item, course, yardList.get(0).getCompany(), true, containerCategory);
			} catch (Exception e) {
				throw new InvalidException("派工" + e.getMessage());
			}
			model.setRateId(rate.getRateId()); // 费率id
			model.setFiveCode(rate.getFiveCode()); // 五位代码
			model.setManHour(rate.getManHour()); // 工时数
			addList.add(model);

			// // 调用预出库单新增
			// addPlanStock(course, model, containerCategory);
		}
		addInput.setCourse(courseId);
		addInput.setEntryList(addList);
		// 调用派工单明细添加接口
		referralService.AddReferralEntry(addInput);
		// 预出库单添加
		for (AddReferralEntryInput item : addList) {
			// 调用预出库单新增
			addPlanStock(course, item, containerCategory);
		}
		// 修改派工状态
		if (!isUnit) {
			course.setReferralState(ReferralStateEnum.REFERRALED.getCode()); // 派工状态
			course.setReferralType(ReferralTypeEnum.AUTOMATIC.getCode()); // 派工类型
			course.setQualityResult(QualityStateEnum.QUALITY_DEFAULT.getCode()); // 质检状态
			course.setQualityState(QualityStateEnum.QUALITY_DEFAULT.getCode()); // 质检结果
			Double manHour = new BigDecimal(
					addList.stream().map(AddReferralEntryInput::getManHour).reduce(Double::sum).get())
							.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
			course.setManHour(manHour);
			course.setReferralTime(new Date()); // 派工时间
			// 判断是否必检箱
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

			if (!StringUtils.isNotEmpty(course.getUrgency()))
				course.setUrgency(AuditUrgencyEnum.DEFAULT.getCode());
			courseMapper.updateByPrimaryKey(course);
		} else {
			unitCourse.setReferralState(ReferralStateEnum.REFERRALED.getCode()); // 派工状态
			unitCourse.setReferralType(ReferralTypeEnum.AUTOMATIC.getCode()); // 派工类型
			unitCourse.setQualityResult(QualityStateEnum.QUALITY_DEFAULT.getCode()); // 质检状态
			unitCourse.setQualityState(QualityStateEnum.QUALITY_DEFAULT.getCode()); // 质检结果
			Double manHour = new BigDecimal(
					addList.stream().map(AddReferralEntryInput::getManHour).reduce(Double::sum).get())
							.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
			unitCourse.setManHour(manHour);
			unitCourse.setReferralTime(new Date()); // 派工时间
			// 判断是否必检箱
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
				course.setUrgency(AuditUrgencyEnum.DEFAULT.getCode());
			courseMapper.updateByPrimaryKey(course);
		}
	}

	/**
	 * 自动派工
	 */
	@Override
	public void referralAutomatic(String courseId, Boolean isUnit) {
		Boolean isReferral = false;
		// 箱体进场信息
		Course course = courseMapper.selectByPrimaryKey(courseId);
		if (ReferralStateEnum.REFERRALED.getCode().equals(course.getReferralState())
				|| ReferralStateEnum.COMPLETED.getCode().equals(course.getReferralState()))
			return;

		// 获取公司
		YardExample yardExample = new YardExample();
		yardExample.createCriteria().andKeyEqualTo(course.getYard()).andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<Yard> yardList = yardMapper.selectByExample(yardExample);
		if (yardList.size() < 1)
			return;
		// 判断是否是机组，机组和箱体干箱的自动派工分开
		if (!isUnit) {
			// 判断公司、用箱人、箱类别下有没有自动审核条件,并且自动审核状态为启用
			AuditAutomaticExample automaticExample = new AuditAutomaticExample();
			automaticExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
					.andIsReferraEnableEqualTo(AuditAutomaticEnum.AUTOMATIC_YES.getCode())
					.andContainerCategoryEqualTo(course.getContainerCategory())
					.andContainerUserEqualTo(course.getContainerUser()).andCompanyEqualTo(yardList.get(0).getCompany());
			List<AuditAutomatic> automaticList = auditAutomaticMapper.selectByExample(automaticExample);
			if (automaticList.size() < 1)
				return;
			isReferral = getIsReferral(automaticList.get(0), course.getProdCourseId(), course.getContainerCategory(),
					course.getTestingMoney());
		} else {
			// 判断是否可以派工
			if (isUnit && !isEntryReferral(courseId, ContainerCategoryEnum.CONTAINER_03.getCode()))
				return;

			// 获取机组的检验金额
			UnitCourse unitCourse = unitCourseMapper.selectByPrimaryKey(courseId);
			if (getOriginal(unitCourse) || ReferralStateEnum.REFERRALED.getCode().equals(unitCourse.getReferralState())
					|| ReferralStateEnum.COMPLETED.getCode().equals(unitCourse.getReferralState()))
				return;
			// 预检区修理直接派工
			if (!getOriginal(unitCourse) && CommonEnum.YES.getCode().equals(unitCourse.getIsPreview())) {
				// 添加派工单,预出库单
				AddReferralEntry(unitCourse.getProdCourseId(), true);
				// 调用发泡添加接口
				foamingService.addFoaming(unitCourse.getProdCourseId());
				return;
			}
			// 判断公司、用箱人、箱类别下有没有自动审核条件,并且自动审核状态为启用
			AuditAutomaticExample automaticExample = new AuditAutomaticExample();
			automaticExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
					.andIsAuditEnableEqualTo(AuditAutomaticEnum.AUTOMATIC_YES.getCode())
					.andContainerCategoryEqualTo(ContainerCategoryEnum.CONTAINER_03.getCode())
					.andContainerUserEqualTo(course.getContainerUser()).andCompanyEqualTo(yardList.get(0).getCompany());
			List<AuditAutomatic> automaticList = auditAutomaticMapper.selectByExample(automaticExample);
			if (automaticList.size() < 1)
				return;
			isReferral = getIsReferral(automaticList.get(0), course.getProdCourseId(),
					ContainerCategoryEnum.CONTAINER_03.getCode(), unitCourse.getTestingMoney());
		}
		// 判断派工条件，确定是否添加派工单和物料需求单
		if (isReferral) {
			// 添加派工单
			AddReferralEntry(courseId, isUnit);
			// 调用发泡添加接口
			foamingService.addFoaming(courseId);

		}
	}

	/**
	 * 判断是否包含原件修理条目
	 * 
	 * @Description: TODO
	 * @param unitCourse
	 * @return boolean @throws 
	 */
	private boolean getOriginal(UnitCourse unitCourse) {
		CourseEntryExample example = new CourseEntryExample();
		example.createCriteria().andCourseEqualTo(unitCourse.getProdCourseId())
				.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<CourseEntry> list = courseEntryMapper.selectByExample(example);
		for (CourseEntry item : list) {
			if (CommonEnum.YES.getCode().equals(item.getIsOriginal()))
				return true;
		}
		return false;
	}

	/**
	 * 预出库单添加
	 * 
	 * @Description: TODO void @throws 
	 */
	private void addPlanStock(Course course, AddReferralEntryInput entry, String containerCategory) {
		// 判断备件号是否为空
		if (StringUtils.isNotEmpty(entry.getSparesNumber())) {
			referralService.addPlanStock(course, entry, containerCategory);
		}
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
	 * 保修派工接口
	 */
	@Override
	public void mainReferral(String courseId) {
		// 保修进场表
		MaintenanceExample maintenanceExample = new MaintenanceExample();
		maintenanceExample.createCriteria().andProdMaintenanceIdEqualTo(courseId);
		List<Maintenance> mainList = maintenanceMapper.selectByExample(maintenanceExample);
		if (mainList.size() < 1)
			return;
		Maintenance maintenance = mainList.get(0);
		// 判断是否可以派工
		if (!isEntryReferral(courseId, ContainerCategoryEnum.CONTAINER_04.getCode()))
			throw new InvalidException("派工失败，备件号不为空，仓库类型为空");

		// 获取公司
		String company = getCompany(maintenance.getYard());
		if (!StringUtils.isNotEmpty(company))
			return;
		// 查询派工条目
		ReferralEntryExample referralEntryExample = new ReferralEntryExample();
		referralEntryExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andCourseEqualTo(courseId)
				.andContainerCategoryEqualTo(ContainerCategoryEnum.CONTAINER_04.getCode());
		List<ReferralEntry> referralEntryList = referralEntryMapper.selectByExampleWithBLOBs(referralEntryExample);
		// 派工条目id,已存在出库的
		List<String> referralEntryTempOutIds = referralEntryList.stream()
				.filter(a -> (!PickingStateEnum.NOPICKING.getCode().equals(a.getPickingState())
						&& !PickingStateEnum.PICKINGED.getCode().equals(a.getPickingState())))
				.map(a -> a.getProdReferralEntryId()).collect(Collectors.toList());
		// 派工条目id,未出库的
		List<String> referralEntryTempIds = referralEntryList.stream()
				.filter(a -> (PickingStateEnum.NOPICKING.getCode().equals(a.getPickingState())
						|| PickingStateEnum.PICKINGED.getCode().equals(a.getPickingState())))
				.map(a -> a.getProdReferralEntryId()).collect(Collectors.toList());
		// 查询进场条目
		CourseEntryExample courseEntryExample = new CourseEntryExample();
		courseEntryExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andCourseEqualTo(courseId)
				.andContainerCategoryEqualTo(ContainerCategoryEnum.CONTAINER_04.getCode());
		List<CourseEntry> courseEntryList = courseEntryMapper.selectByExampleWithBLOBs(courseEntryExample);
		// 进场条目id
		List<String> courseEntryTempIds = courseEntryList.stream()
				.filter(a -> !referralEntryTempOutIds.contains(a.getProdCourseEntryId()))
				.map(a -> a.getProdCourseEntryId()).collect(Collectors.toList());
		// 获取新增的进场条目
		List<String> courseEntryAddIds = new ArrayList<>();
		for (String item : courseEntryTempIds) {
			if (!referralEntryTempIds.contains(item))
				courseEntryAddIds.add(item);
		}
		// 获取修改的进场条目
		Collection<String> c1 = new ArrayList<String>(courseEntryTempIds);
		Collection<String> c2 = new ArrayList<String>(referralEntryTempIds);
		c1.retainAll(c2);
		List<String> courseEntryUpdateIds = new ArrayList<>(c1);
		// 获取删除的进场条目
		List<String> referralEntryIds = new ArrayList<>();
		for (String item : referralEntryTempIds) {
			if (!courseEntryTempIds.contains(item))
				referralEntryIds.add(item);
		}

		// 工时
		BigDecimal manHour = new BigDecimal(0);
		// 获取新增的进场条目数据
		List<CourseEntry> addCourseEntryList = courseEntryList.stream().filter(a -> {
			if (courseEntryAddIds.contains(a.getProdCourseEntryId()))
				return true;
			return false;
		}).collect(Collectors.toList());
		// 派工单新增
		AddReferralInput addInput = new AddReferralInput();
		List<AddReferralEntryInput> addList = new ArrayList<AddReferralEntryInput>();
		// 重新计算费用和付费方
		for (CourseEntry item : addCourseEntryList) {
			AddReferralEntryInput model = new AddReferralEntryInput();
			// 基础数据（不变数据）
			model.setProdReferralEntryId(item.getProdCourseEntryId());
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
			model.setAlreadyQuantity(0.d); // 已领数量
			model.setBorrowQuantity(0.d); // 借件数量
			model.setIsRepair(CommonEnum.YES.getCode()); // 是否修理
			model.setRemarks(item.getRemarks()); // 备注
			model.setDevice(item.getDevice()); // 主件
			model.setSparesNumber(item.getSparesNumber()); // 备件号
			model.setWarehouseType(item.getWarehouseType()); // 仓库类型
			model.setPhoto(item.getPhoto()); // 修前图片
			model.setIsMustPhoto(item.getIsMustPhoto());// 是否必传图片
			model.setWarehouse(item.getWarehouse()); // 仓库
			model.setCompany(item.getCompany()); // 公司
			model.setPrice(item.getPrice()); // 备件价格
			model.setIsOriginal(item.getIsOriginal()); // 是否原件维修
			if (StringUtils.isNotEmpty(item.getSparesNumber()))
				model.setAlreadyState(PickingStateEnum.NOPICKING.getCode()); // 出库状态
			else
				model.setAlreadyState(PickingStateEnum.NOTSTOCKOUT.getCode());
			// 费率相关字段
			GetRateMessageOutput rate = new GetRateMessageOutput();
			try {
				rate = getMainRateMessage(item, maintenance, company, getSanKey(), true);
			} catch (Exception e) {
				// TODO: handle exception
				throw new InvalidException("派工:" + e.getMessage());
			}
			model.setRateId(rate.getRateId()); // 费率id
			model.setFiveCode(rate.getFiveCode()); // 五位代码
			model.setManHour(rate.getManHour()); // 工时数
			addList.add(model);
			manHour = manHour.add(new BigDecimal(rate.getManHour()));
		}
		addInput.setCourse(courseId);
		addInput.setEntryList(addList);

		// 获取编辑的进场条目数据
		List<CourseEntry> updateCourseEntryList = courseEntryList.stream().filter(a -> {
			if (courseEntryUpdateIds.contains(a.getProdCourseEntryId()))
				return true;
			return false;
		}).collect(Collectors.toList());
		List<ReferralEntry> updateReferralList = new ArrayList<>();
		// 派工单编辑
		for (CourseEntry item : updateCourseEntryList) {
			ReferralEntry model = referralEntryMapper.selectByPrimaryKey(item.getProdCourseEntryId());
			model.setSerialNumber(item.getSerialNumber()); // 序号
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
			model.setIsRepair(CommonEnum.YES.getCode()); // 是否修理
			model.setRemarks(item.getRemarks()); // 备注
			model.setDevice(item.getDevice()); // 主件
			model.setSparesNumber(item.getSparesNumber()); // 备件号
			model.setWarehouseType(item.getWarehouseType()); // 仓库类型
			model.setPhoto(item.getPhoto()); // 修前图片
			model.setIsMustPhoto(item.getIsMustPhoto());// 是否必传图片
			model.setWarehouse(item.getWarehouse()); // 仓库
			model.setCompany(item.getCompany()); // 公司
			model.setPrice(item.getPrice()); // 备件价格
			model.setIsOriginal(item.getIsOriginal()); // 是否原件维修
			model.setUpdateTime(new Date());
			model.setUpdateUser(getCurrentUserId());
			if (StringUtils.isNotEmpty(item.getSparesNumber()))
				model.setPickingState(PickingStateEnum.NOPICKING.getCode()); // 出库状态
			else
				model.setPickingState(PickingStateEnum.NOTSTOCKOUT.getCode());
			// 费率相关字段
			GetRateMessageOutput rate = new GetRateMessageOutput();
			try {
				rate = getMainRateMessage(item, maintenance, company, getSanKey(), true);
			} catch (Exception e) {
				// TODO: handle exception
				throw new InvalidException("派工:" + e.getMessage());
			}
			model.setRateId(rate.getRateId()); // 费率id
			model.setFiveCode(rate.getFiveCode()); // 五位代码
			model.setManHour(rate.getManHour()); // 工时数
			updateReferralList.add(model);
			manHour = manHour.add(new BigDecimal(rate.getManHour()));
		}

		// 执行派工单新增
		// 调用派工单明细添加接口
		referralService.AddReferralEntry(addInput);
		// 调用预出库单新增
		for (AddReferralEntryInput item : addList) {
			referralService.addMainPlanStock(maintenance, item, item.getContainerCategory());
		}
		// 执行派工单修改
		for (ReferralEntry item : updateReferralList) {
			ReferralEntryExample refUpdateExample = new ReferralEntryExample();
			refUpdateExample.createCriteria().andProdReferralEntryIdEqualTo(item.getProdReferralEntryId());
			referralEntryMapper.updateByExampleWithBLOBs(item, refUpdateExample);
		}
		if (referralEntryIds.size() > 0) {
			// 执行派工单删除
			ReferralEntryExample refDelExample = new ReferralEntryExample();
			refDelExample.createCriteria().andProdReferralEntryIdIn(referralEntryIds);
			referralEntryMapper.deleteByExample(refDelExample);
		}

		// 执行预出库单及领料单修改
		// 删除预出库单
		referralEntryIds.addAll(courseEntryUpdateIds);
		if (referralEntryIds.size() > 0) {
			PlanStockExample delPlanExample = new PlanStockExample();
			delPlanExample.createCriteria().andReferralEntryIdIn(referralEntryIds);
			// 待删的预出库单list
			List<PlanStock> delPlanList = planStockMapper.selectByExample(delPlanExample);
			// 删除预出库单
			planStockMapper.deleteByExample(delPlanExample);
			if (delPlanList.size() > 0) {
				List<String> referralNoList = delPlanList.stream().map(a -> a.getReferralNo())
						.collect(Collectors.toList());
				// 获取所有相关的领料单
				PickingListExample pickExample = new PickingListExample();
				pickExample.createCriteria().andReferralNoIn(referralNoList);
				List<PickingList> pickList = pickingListMapper.selectByExample(pickExample);
				// 删除领料单或修改领料单状态
				for (PickingList item : pickList) {
					PlanStockExample planExample = new PlanStockExample();
					planExample.createCriteria().andReferralNoEqualTo(item.getReferralNo());
					List<PlanStock> planList = planStockMapper.selectByExample(planExample);
					if (planList.size() > 0) {
						if (planList.size() == planList.stream()
								.filter(a -> PickingStateEnum.STOCKOUTALL.getCode().equals(a.getPickingState()))
								.collect(Collectors.toList()).size()) {
							item.setPickingState(PickingStateEnum.STOCKOUTALL.getCode()); // 出库状态
						} else {
							if (planList.size() == planList.stream()
									.filter(a -> PickingStateEnum.PICKINGED.getCode().equals(a.getPickingState()))
									.collect(Collectors.toList()).size()) {
								item.setPickingState(PickingStateEnum.PICKINGED.getCode()); // 出库状态
							} else {
								item.setPickingState(PickingStateEnum.STOCKOUT.getCode()); // 出库状态
							}
						}
						item.setUpdateTime(new Date());
						item.setUpdateUser(getCurrentUserId());
						pickingListMapper.updateByPrimaryKey(item);
					} else {
						pickingListMapper.deleteByPrimaryKey(item.getProdPickingListId());
					}
				}
			}
		}
		// 添加预出库单
		for (CourseEntry item : updateCourseEntryList) {
			AddReferralEntryInput model = new AddReferralEntryInput();
			model.setProdReferralEntryId(item.getProdCourseEntryId()); // 派工单明细id
			model.setSparesNumber(item.getSparesNumber()); // 备件号
			model.setWarehouseType(item.getWarehouseType()); // 仓库类型
			model.setLength(item.getLength()); // 长度
			model.setWidth(item.getWidth()); // 宽度
			model.setQuantity(item.getQuantity()); // 数量
			referralService.addMainPlanStock(maintenance, model, item.getContainerCategory());
		}
		// 主表信息修改
		if (!StringUtils.isNotEmpty(maintenance.getReferralState()))
			maintenance.setReferralState(ReferralStateEnum.REFERRALED.getCode()); // 派工状态
		maintenance.setManHour(manHour.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
		if (maintenance.getReferralTime() == null)
			maintenance.setReferralTime(new Date()); // 派工时间
		maintenanceMapper.updateByPrimaryKey(maintenance);
	}

	/**
	 * 保修估价接口
	 */
	@Override
	public void mainEvaluation(String courseId) {
		// 估价单
		AddEvaluationInput addInput = new AddEvaluationInput();
		List<AddEvaluationEntryInput> addList = new ArrayList<AddEvaluationEntryInput>();
		// 保修进场表
		MaintenanceExample maintenanceExample = new MaintenanceExample();
		maintenanceExample.createCriteria().andProdMaintenanceIdEqualTo(courseId);
		List<Maintenance> mainList = maintenanceMapper.selectByExample(maintenanceExample);
		if (mainList.size() < 1)
			return;
		Maintenance maintenance = mainList.get(0);
		// 获取公司
		String company = getCompany(maintenance.getYard());
		if (!StringUtils.isNotEmpty(company))
			return;
		// 查询进场条目
		CourseEntryExample courseEntryExample = new CourseEntryExample();
		courseEntryExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO).andCourseEqualTo(courseId)
				.andContainerCategoryEqualTo(ContainerCategoryEnum.CONTAINER_04.getCode());
		List<CourseEntry> courseEntryList = courseEntryMapper.selectByExample(courseEntryExample);

		// 重新计算费用和付费方
		for (CourseEntry item : courseEntryList) {
			AddEvaluationEntryInput model = new AddEvaluationEntryInput();
			// 基础数据（不变数据）
			model.setProdEvaluationEntryId(item.getProdCourseEntryId());
			model.setSerialNumber(item.getSerialNumber()); // 序号
			model.setCourse(item.getCourse()); // 进场id
			model.setContainerCategory(item.getContainerCategory()); // 箱类别
			model.setPositionCode(item.getPositionCode()); // 位置代码
			model.setPartsTypeCode(item.getPartsTypeCode()); // 部件大类
			model.setDamageCode(item.getDamageCode()); // 损坏代码
			model.setMaterialCode(item.getMaterialCode()); // 材质代码
			model.setLength(item.getLength()); // 长
			model.setWidth(item.getWidth()); // 宽
			model.setQuantity(item.getQuantity()); // 数量
			model.setThirdpartyMoney(item.getThirdpartyMoney()); // 第三方费用
			model.setIsCharge(item.getIsCharge()); // 是否已收费
			model.setIsRepair(CommonEnum.YES.getCode()); // 是否修理
			model.setRemarks(item.getRemarks()); // 备注
			model.setDevice(item.getDevice()); // 主件
			model.setSparesNumber(item.getSparesNumber()); // 备件号
			model.setPhoto(item.getPhoto()); // 修前图片
			model.setWarehouseType(item.getWarehouseType()); // 仓库类型
			model.setIsMustPhoto(item.getIsMustPhoto()); // 是否必填图片
			model.setWarehouse(item.getWarehouse()); // 仓库
			model.setCompany(item.getCompany()); // 公司
			model.setPrice(item.getPrice()); // 备件价格
			model.setIsOriginal(item.getIsOriginal()); // 是否原件维修
			// 获取费率信息
			GetRateMessageOutput rate = new GetRateMessageOutput();
			try {
				rate = getMainRateMessage(item, maintenance, company, maintenance.getContainerUser(), false);
			} catch (Exception e) {
				// TODO: handle exception
				throw new InvalidException("估价" + e.getMessage());
			}
			model.setRateId(rate.getRateId()); // 费率id
			model.setFiveCode(rate.getFiveCode()); // 五位代码
			model.setManHour(rate.getManHour()); // 工时数
			model.setManHourCost(rate.getManHourCost()); // 工时费
			model.setMaterialCost(rate.getMaterialCost()); // 材料费
			BigDecimal sumMoney = rate.getManHourCost().add(rate.getMaterialCost());
			model.setSumMoney(sumMoney); // 总费用
			model.setPartsDetailsCode(rate.getUserPartsDetails()); // 用箱人部件明细
			model.setRepairCode(rate.getUserRepair()); // 用箱人维修代码
			model.setPartsRepairCode(rate.getUserPartsDetails() + rate.getUserRepair()); // 用箱人部件修理代码
			// 付费方相关字段
			model.setPayingParty(item.getPayingParty()); // 付费方
			// model.setPayingParty(getPaying(item, course, yardList.get(0).getCompany()));
			addList.add(model);
		}
		addInput.setCourse(courseId);
		// 修改条目中的付费方
		// addList = updateEntryPaying(addList, course, yardList.get(0).getCompany());
		addInput.setEntryList(addList);

		// 添加新条目时，先删除原始估价条目
		EvaluationEntryExample evExample = new EvaluationEntryExample();
		evExample.createCriteria().andCourseEqualTo(courseId)
				.andContainerCategoryEqualTo(ContainerCategoryEnum.CONTAINER_04.getCode());
		evaluationEntryMapper.deleteByExample(evExample);

		// 调用估价单明细添加接口
		estimateDetailService.addEstimateEntry(addInput);
		// 更新进场主表字段
		estimateDetailService.updateEstimateCourse(courseId, ContainerCategoryEnum.CONTAINER_04.getCode());

	}

	/**
	 * 获取费率信息，保修
	 * 
	 * @Description: TODO
	 * @param item
	 * @param maintenance
	 * @param company
	 * @param containerUser
	 * @param isRepair
	 * @return GetRateMessageOutput @throws 
	 */
	private GetRateMessageOutput getMainRateMessage(CourseEntry item, Maintenance maintenance, String company,
			String containerUser, boolean isRepair) {
		// 返回
		GetRateMessageOutput output = new GetRateMessageOutput();
		// 组装参数
		GetRateMessageInput rateInput = new GetRateMessageInput();
		rateInput.setRateId(item.getRateId()); // SAN费率id
		rateInput.setCompany(company); // 公司
		rateInput.setContainerUser(containerUser); // 用箱人
		rateInput.setContainerCategory(ContainerCategoryEnum.CONTAINER_03.getCode()); // 箱类别
		rateInput.setPartsType(item.getPartsTypeCode()); // 部件大类
		if (ContainerCategoryEnum.CONTAINER_01.getCode().equals(item.getContainerCategory())) {
			Integer count = item.getPartsRepairCode().length();
			rateInput.setPartsDetails(item.getPartsRepairCode().substring(0, count - 2)); // 部件明细
			rateInput.setRepair(item.getPartsRepairCode().substring(count - 2, count)); // 维修代码
		} else {
			rateInput.setPartsDetails(item.getPartsDetailsCode()); // 部件明细
			rateInput.setRepair(item.getRepairCode()); // 维修代码
		}
		rateInput.setMaterial(item.getMaterialCode()); // 材质代码
		rateInput.setPositionCode(item.getPositionCode()); // 位置代码
		rateInput.setContainerType(maintenance.getContainerType()); // 箱型
		rateInput.setSize(maintenance.getSize()); // 尺寸
		rateInput.setLength(item.getLength()); // 长
		rateInput.setWidth(item.getWidth()); // 宽
		rateInput.setQuantity(item.getQuantity()); // 数量
		rateInput.setSparesNumber(item.getSparesNumber()); // 备件号
		rateInput.setStage(RateStageEnum.TYPE02.getCode()); // 报价环节使用费率
		if (isRepair) {
			rateInput.setFromType(RateFromTypeEnum.TYPE03.getCode()); // 费率类型：派工工时
			rateInput.setContainerUser(getSanKey()); // 用箱人
		} else
			rateInput.setFromType(RateFromTypeEnum.TYPE01.getCode()); // 费率类型：标准费率
		// 调用费率
		output = rateService.getRateMessage(rateInput);
		return output;
	}

	/**
	 * 获取公司key
	 * 
	 * @Description: TODO
	 * @param yrad
	 * @return String @throws 
	 */
	private String getCompany(String yrad) {
		YardExample yardExample = new YardExample();
		yardExample.createCriteria().andKeyEqualTo(yrad).andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		List<Yard> yardList = yardMapper.selectByExample(yardExample);
		if (yardList.size() < 1)
			return null;
		return yardList.get(0).getCompany();
	}

}
