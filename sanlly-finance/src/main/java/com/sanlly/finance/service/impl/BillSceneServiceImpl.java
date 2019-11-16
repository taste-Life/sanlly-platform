package com.sanlly.finance.service.impl;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.enums.FinanceBillStatusEnum;
import com.sanlly.common.enums.FinanceBillTypeEnum;
import com.sanlly.common.enums.FinanceBudgetTypeEnum;
import com.sanlly.common.enums.FinanceCostStatusEnum;
import com.sanlly.common.enums.FinanceCurrencyType;
import com.sanlly.common.enums.FinanceInBillStateEnum;
import com.sanlly.common.enums.FinanceInterfaceTypeEnum;
import com.sanlly.common.enums.FinanceInvoiceTypeEnum;
import com.sanlly.common.enums.FinanceIsEnabledEnum;
import com.sanlly.common.enums.FinanceLegacyTypeEnum;
import com.sanlly.common.enums.FinanceModifyBillEnum;
import com.sanlly.common.enums.FinanceModifyBillTypeEnum;
import com.sanlly.common.enums.FinanceRejectEnum;
import com.sanlly.common.models.input.base.BaseSearchInput;
import com.sanlly.common.models.input.finance.BillSceneMDInput;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.company.CompanyOutput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.models.output.user.UserInfoOutput;
import com.sanlly.common.utils.ComputeUtil;
import com.sanlly.finance.constants.FinanceConstants;
import com.sanlly.finance.dao.BaseChargeRateMapper;
import com.sanlly.finance.dao.BaseChargeTypeMapper;
import com.sanlly.finance.dao.BaseExchangeRateMapper;
import com.sanlly.finance.dao.BaseMerchantsMapper;
import com.sanlly.finance.dao.BaseTaxRateMapper;
import com.sanlly.finance.dao.BillSceneDetailMapper;
import com.sanlly.finance.dao.BillSceneMapper;
import com.sanlly.finance.dao.BusinessDetailMapper;
import com.sanlly.finance.dao.BusinessMapper;
import com.sanlly.finance.entity.BaseAuditDept;
import com.sanlly.finance.entity.BaseChargeRate;
import com.sanlly.finance.entity.BaseChargeRateExample;
import com.sanlly.finance.entity.BaseChargeType;
import com.sanlly.finance.entity.BaseChargeTypeExample;
import com.sanlly.finance.entity.BaseExchangeRate;
import com.sanlly.finance.entity.BaseExchangeRateExample;
import com.sanlly.finance.entity.BaseMerchants;
import com.sanlly.finance.entity.BaseMerchantsExample;
import com.sanlly.finance.entity.BaseTaxRate;
import com.sanlly.finance.entity.BillRepair;
import com.sanlly.finance.entity.BillScene;
import com.sanlly.finance.entity.BillSceneDetail;
import com.sanlly.finance.entity.BillSceneDetailExample;
import com.sanlly.finance.entity.BillSceneExample;
import com.sanlly.finance.entity.Business;
import com.sanlly.finance.entity.BusinessDetail;
import com.sanlly.finance.entity.BusinessDetailExample;
import com.sanlly.finance.entity.BusinessExample;
import com.sanlly.finance.enums.ContainerCategoryEnum;
import com.sanlly.finance.models.input.BaseAuditDeptInput;
import com.sanlly.finance.models.input.BillInfoInput;
import com.sanlly.finance.models.input.BillSceneInput;
import com.sanlly.finance.models.input.RejectInput;
import com.sanlly.finance.models.input.SearchBaseInput;
import com.sanlly.finance.models.output.BillSceneOutput;
import com.sanlly.finance.service.BaseAuditDeptService;
import com.sanlly.finance.service.BillSceneService;
import com.sanlly.finance.service.feign.AuthFeignClient;
import com.sanlly.finance.service.feign.ProductionFeignClient;
import com.sanlly.finance.utils.CodeUtil;
import com.sanlly.finance.utils.DateUtils;

/**
 * 现场收费账单服务实现类
 * 
 * @Package com.sanlly.finance.service.impl 
 * @Description: TODO
 * @author fjy   
 * @date 2019年9月3日 下午2:56:58 
 * @version V1.0   
 */
@Service
public class BillSceneServiceImpl extends BaseServiceImpl implements BillSceneService {

	@Autowired
	private BillSceneMapper dao;

	@Autowired
	private BillSceneDetailMapper daoDetail;

	@Autowired
	private BusinessMapper businessDao;

	@Autowired
	private BusinessDetailMapper businessDetailDao;

	@Autowired
	private BaseExchangeRateMapper exchangeRateDao;

	@Autowired
	private BaseChargeTypeMapper chargeTypeDao;

	@Autowired
	private BaseChargeRateMapper chargeRateDao;

	@Autowired
	private BaseTaxRateMapper taxRateDao;

	@Autowired
	private AuthFeignClient authFeignClient;

	@Autowired
	private BaseAuditDeptService baseAuditDeptService;

	@Autowired
	private ProductionFeignClient productionFeignClient;

	@Autowired
	private BaseMerchantsMapper merchantsDao;

	/**
	 * 查询分页
	 */
	@Override
	public PagedList<BillSceneOutput> getPage(SearchBaseInput input) {
		// TODO Auto-generated method stub
		BillSceneExample example = new BillSceneExample();
		BillSceneExample.Criteria criteria = example.createCriteria();

		// 过滤掉删除的记录
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO)
				.andIsEnabledEqualTo(FinanceIsEnabledEnum.Enabled.getCode());
		;
		// 账单编号
		if (input.getCode() != null && !StringUtils.isEmpty(input.getCode().trim())) {
			criteria.andBillCodeLike("%" + input.getCode().trim() + "%");
		}
		// 账单月份
		if (input.getBillMonth() != null && !StringUtils.isEmpty(input.getBillMonth().trim())) {
			criteria.andBillMonthLike("%" + input.getBillMonth().trim() + "%");
		}
		// 箱号
		if (input.getContainerNo() != null && !StringUtils.isEmpty(input.getContainerNo().trim())) {
			criteria.andContainerNoLike("%" + input.getContainerNo().trim() + "%");
		}
		// 账单状态
		if (input.getBillStatus() != null && !StringUtils.isEmpty(input.getBillStatus().trim())) {
			criteria.andBillStatusEqualTo(input.getBillStatus().trim());
		}
		int totalCount = (int) dao.countByExample(example);
		PagedList<BillSceneOutput> pagedList = new PagedList<BillSceneOutput>(input.getPageIndex(), input.getPageSize(),
				totalCount);
		// 设置开始行数
		example.setLimitStart(pagedList.getLimitStart());
		// 设置结束行数
		example.setLimitEnd(pagedList.getLimitEnd());
		example.setOrderByClause(" `create_time` DESC");
		List<BillScene> list = dao.selectByExample(example);
		List<BillSceneOutput> outputList = list.stream().map(a -> {// 创建日期倒序排列
			BillSceneOutput output = new BillSceneOutput();
			// 复制属性值到新对象
			BeanUtils.copyProperties(a, output);
			output.setContainerCategoryNameLang(a.getContainerCategory());// 箱类型
			output.setContainerUserNameLang(a.getContainerUser());// 用箱人
			output.setYardNameLang(a.getYard());// 场站
			output.setModifyBillStatusNameLang(a.getModifyBillStatus());// 调账状态
			output.setModifyBillTypeNameLang(a.getModifyBillType());// 调账方式
			output.setIsEnabledNameLang(a.getIsEnabled());// 是否有效
			output.setBillStatusNameLang(a.getBillStatus());// 账单状态
			output.setCourseTypeNameLang(a.getCourseType());// 进场类型

			// 查看是否有明细
			BillSceneDetailExample detailEx = new BillSceneDetailExample();
			detailEx.createCriteria().andBillIdEqualTo(a.getBillId());
			if (daoDetail.countByExample(detailEx) > 0) {
				output.setIsDetail(true);
			} else {
				output.setIsDetail(false);
			}
			// 查看商务结算是否已入账
			BusinessExample be = new BusinessExample();
			be.createCriteria().andSourceBillIdEqualTo(a.getBillId());
			List<Business> bes = businessDao.selectByExample(be);
			if (bes != null && bes.size() > 0) {
				List<Integer> besIds = bes.stream().map(x -> {
					return x.getId();
				}).collect(Collectors.toList());
				BusinessDetailExample bdExample = new BusinessDetailExample();
				bdExample.createCriteria().andBusinessIdIn(besIds);
				List<BusinessDetail> detailList = businessDetailDao.selectByExample(bdExample);
				Long count = detailList.stream()
						.filter(x -> x.getFreeStatus().equals(FinanceInBillStateEnum.INBILL.getCode())).count();
				if (count != null && count > 0) {
					output.setIsInBill(true);
				} else {
					output.setIsInBill(false);
				}
			} else {
				output.setIsInBill(false);
			}

			// 查询用户
			// 账单审核人
			if (!StringUtils.isEmpty(a.getBillAuditor())) {
				Result<UserInfoOutput> user = authFeignClient.getUserDetail(a.getBillAuditor());
				output.setBillAuditorName(user.getData().getUserName());
			}
			// 账单驳回人
			if (!StringUtils.isEmpty(a.getBillReturn())) {
				Result<UserInfoOutput> user = authFeignClient.getUserDetail(a.getBillReturn());
				output.setBillReturnName(user.getData().getUserName());
			}
			// 财务驳回人
			if (!StringUtils.isEmpty(a.getFinanceReturn())) {
				Result<UserInfoOutput> user = authFeignClient.getUserDetail(a.getFinanceReturn());
				output.setFinanceReturnName(user.getData().getUserName());
			}
			// 创建人
			if (!StringUtils.isEmpty(a.getCreateUser())) {
				Result<UserInfoOutput> user = authFeignClient.getUserDetail(a.getCreateUser());
				output.setCreateUserName(user.getData().getUserName());
			}
			// 修改人创建人
			if (!StringUtils.isEmpty(a.getUpdateUser())) {
				Result<UserInfoOutput> user = authFeignClient.getUserDetail(a.getUpdateUser());
				output.setUpdateUserName(user.getData().getUserName());
			}

			return output;
		}).collect(Collectors.toList());
		pagedList.setDataList(outputList);
		return pagedList;
	}

	/**
	 * 创建账单和明细
	 * 
	 * @Description: TODO
	 * @return Boolean @throws 
	 */
	@Override
	public Boolean createBill(List<BillSceneMDInput> list) {
		// TODO Auto-generated method stub
//		FinanceBillTypeEnum billTypeEnum,FinanceBudgetTypeEnum inoutEnum,String companyCode

		// 判断进场id是否是同一个，不同的进场id分不同的账单
		if (list != null && list.size() > 0) {
			BigDecimal realRate = new BigDecimal(1);
			String yearMonth = "";
			try {
				yearMonth = DateUtils.dateFormat(new Date(), "YYYY-MM");
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} // 账单月份
				// 汇率
			BaseExchangeRateExample ere = new BaseExchangeRateExample();
			ere.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
					.andIsEnabledEqualTo(FinanceIsEnabledEnum.Enabled.getCode()).andRateYearMonthEqualTo(yearMonth);// 查询当月汇率
			List<BaseExchangeRate> exchangeRateList = exchangeRateDao.selectByExample(ere);
			if (exchangeRateList != null && exchangeRateList.size() > 0) {
				realRate = exchangeRateList.get(0).getExchangeRate();// 汇率 根据月份取汇率表
			} else {// 如果月份没有查询到数据，开始向前找
				ere = new BaseExchangeRateExample();
				ere.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
						.andIsEnabledEqualTo(FinanceIsEnabledEnum.Enabled.getCode());// 人民币
				ere.setOrderByClause(" `create_time` DESC");
				exchangeRateList = exchangeRateDao.selectByExample(ere);
				// 获取最近一条的汇率
				if (exchangeRateList != null && exchangeRateList.size() > 0) {
					realRate = exchangeRateList.get(0).getExchangeRate();
				}
			}

			// 根据进场id分组
			Map<String, List<BillSceneMDInput>> sceneGroupMap = list.stream()
					.collect(Collectors.groupingBy(d -> d.getProdCourseId()));

			for (String key : sceneGroupMap.keySet()) {
				List<BillSceneMDInput> item = sceneGroupMap.get(key);
				// 根据进场ID查询账单表，存在就更新，不存才就新增
				BillSceneDetailExample detailExample = new BillSceneDetailExample();
				detailExample.createCriteria().andProdCourseIdEqualTo(key);// 根据进场ID查询是否已有账单

				List<BillSceneDetail> detailList = daoDetail.selectByExample(detailExample);
				if (detailList != null && detailList.size() > 0) {// 修改
					BillScene bsMain = dao.selectByPrimaryKey(detailList.get(0).getBillId());

					// 求和 总金额
					Double sum = item.stream().map(a -> a.getAmount().doubleValue()).reduce((a, b) -> a + b).get();
					if (StringUtils.isEmpty(bsMain.getTotalCostRmb())) {
						bsMain.setTotalCostRmb(new BigDecimal(0.00));
					}
					// 累加和
					bsMain.setTotalCostRmb(ComputeUtil.add(bsMain.getTotalCostRmb(), new BigDecimal(sum)));
					// 汇率更新
					bsMain.setRealRate(realRate);
					// 根据汇率计算美金总金额
					bsMain.setTotalCostUsd(ComputeUtil.div(bsMain.getTotalCostRmb(), bsMain.getRealRate(), 2));
					bsMain.setUpdateTime(new Date());
					bsMain.setUpdateUser(getCurrentUserId());
//					
//					bsMain.setTaxRate(FinanceConstants.taxRate);
//					bsMain.setTaxAmountRmb(ComputeUtil.mul(bsMain.getTotalCostRmb(), bsMain.getTaxRate()));
//					bsMain.setTaxAmountUsd(ComputeUtil.mul(bsMain.getTotalCostUsd(), bsMain.getTaxRate()));
					// 保存主账单
					dao.updateByPrimaryKey(bsMain);
					// 构造明细
					for (BillSceneMDInput input : item) {
						BillSceneDetail detail = new BillSceneDetail();
						BeanUtils.copyProperties(input, detail);
						detail.setBillId(bsMain.getBillId());
						detail.setFreeStatus(FinanceCostStatusEnum.COSTOK.getCode());
						detail.setVersionNo("0");
						detail.setIsDel(PlatformConstants.ISDEL_NO);
						detail.setIsEnabled(FinanceIsEnabledEnum.Enabled.getCode());
						detail.setCreateTime(new Date());
						detail.setCreateUser(getCurrentUserId());
						detail.setProdCourseId(input.getProdCourseId());
						// 计算费用类型 生产直接给出费用类型编码
						// RepCode ='PTI' '第三方收费-PTI检测费'
						// RepCode IN ('CC','WW') '第三方收费-洗箱费'
						// 除了以上两种其他都是'第三方收费-冷箱箱体修理费'、'第三方收费-冷箱机组修理费'
						// RepCode ='PTI' '第三方收费-PTI检测费'
						// RepCode IN ('CC','WW') '第三方收费-洗箱费'
						// 除了以上两种其他都是'第三方收费-冷箱箱体修理费'、'第三方收费-冷箱机组修理费'
						if (input.getRepairCode().equals("PTI")) {
							detail.setChargeTypeKey("LKFICHARGT000036");// 第三方收费-PTI检测费
						} else if (input.getRepairCode().equals("CC") || input.getRepairCode().equals("WW")) {
							detail.setChargeTypeKey("LKFICHARGT000019");// 第三方收费-洗箱费
						} else if (input.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_01.getCode())
								|| input.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_02.getCode())) {
							detail.setChargeTypeKey("LKFICHARGT000006");// 第三方收费-冷箱箱体修理费
						} else {
							detail.setChargeTypeKey("LKFICHARGT000002");// 第三方收费-冷箱机组修理费
						}
						// 查询核算部门
						BaseAuditDeptInput badi = new BaseAuditDeptInput();
						badi.setCompanyKey(input.getCompanyKey());
						// 场站
						badi.setYard(input.getYard());
						// 箱类别
						badi.setContainerCategory(input.getContainerCategory());
						
						

						// 费用类型 根据费用类型查询费用key
						BaseChargeTypeExample bctExample = new BaseChargeTypeExample();
						bctExample.createCriteria().andLangKeyEqualTo(detail.getChargeTypeKey());
						List<BaseChargeType> bctList = chargeTypeDao.selectByExample(bctExample);
						// 得到费用key
						String chargeKey = "";
						if (bctList != null && bctList.size() > 0) {
							badi.setChargeKey(bctList.get(0).getChargeKey());
							chargeKey = bctList.get(0).getChargeKey();
							bsMain.setChargeTypeKey(chargeKey);
							bsMain.setChargecode(bctList.get(0).getChargeCode());
						}
						if (!StringUtils.isEmpty(chargeKey)) {
							// 根据费用key得到税率
							BaseChargeRateExample bcrExample = new BaseChargeRateExample();
							bcrExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
									.andIsEnabledEqualTo(FinanceIsEnabledEnum.Enabled.getCode())
									.andChargeKeyEqualTo(chargeKey);

							// 根据费用key 获取税率ID
							List<BaseChargeRate> bcrList = chargeRateDao.selectByExample(bcrExample);
							if (bcrList != null && bcrList.size() > 0) {
								// 根据税率ID 查询税率
								BaseTaxRate bcr = taxRateDao.selectByPrimaryKey(bcrList.get(0).getTaxRateId());
								// 税率 tax_rate
								bsMain.setTaxRate(bcr.getTaxRate());// 税率 通过费用类型得到
								bsMain.setTaxAmountRmb(ComputeUtil.mul(bsMain.getTotalCostRmb(), bsMain.getTaxRate()));
								bsMain.setTaxAmountUsd(ComputeUtil.mul(bsMain.getTotalCostUsd(), bsMain.getTaxRate()));
							}
						}

						BaseAuditDept baDept = baseAuditDeptService.getInfo(badi);
						if (baDept != null) {
							detail.setDeptKey(baDept.getProfitDept());// 通过场站查询得到 成本中心
							detail.setDeptCode(baDept.getCostCenterCode());
						}

						// 插入明细
						daoDetail.insert(detail);
					}
					// 更新一次税率
					dao.updateByPrimaryKey(bsMain);

				} else {// 新增
					BillSceneInput main = new BillSceneInput();
					// 1、获取账单类型 现场收费账单
					// 2、收支类型 收入
					// 3、公司代码 根据公司Key 或者场站查询公司代码
					// 得到公司代码
					String companyCode = "";
					if (list != null && list.size() > 0) {
						BeanUtils.copyProperties(list.get(0), main);

						if (list.get(0).getCompanyKey() != null
								&& !StringUtils.isEmpty(list.get(0).getCompanyKey().trim())) {
							main.setCompanyKey(list.get(0).getCompanyKey());
							BaseSearchInput bsinput = new BaseSearchInput();
							bsinput.setCompanyKey(list.get(0).getCompanyKey().trim());
							List<CompanyOutput> companyList = productionFeignClient.companyList(bsinput).getData();
							if (companyList != null && companyList.size() > 0) {
								companyCode = companyList.get(0).getCompanyCode();
							}
						}
					}
					// 求和 总金额
					Double sum = list.stream().map(a -> a.getAmount().doubleValue()).reduce((a, b) -> a + b).get();
					main.setTotalCostRmb(new BigDecimal(sum));

					// 生成账单号
					main.setBillCode(
							getBillCode(FinanceBillTypeEnum.XCSFZD, FinanceBudgetTypeEnum.INCOME, companyCode));
					// 账单月份
					main.setBillMonth(yearMonth);
					main.setRealCurrencyType(FinanceCurrencyType.CNY.getCode());// 实收币种
					// 汇率
					main.setRealRate(realRate);
					// 根据汇率计算美金总金额
					main.setTotalCostUsd(ComputeUtil.div(main.getTotalCostRmb(), main.getRealRate(), 2));
					main.setCreateNode("现场收费产生");
					main.setVersionNo("0");
					main.setBillStatus(FinanceBillStatusEnum.NOAUDITOR.getCode());
					main.setIsDel(PlatformConstants.ISDEL_NO);
					main.setIsEnabled(FinanceIsEnabledEnum.Enabled.getCode());
					main.setCreateTime(new Date());
					main.setCreateUser(getCurrentUserId());
					main.setTaxRate(FinanceConstants.taxRate);
					main.setTaxAmountRmb(ComputeUtil.mul(main.getTotalCostRmb(), main.getTaxRate()));
					main.setTaxAmountUsd(ComputeUtil.mul(main.getTotalCostUsd(), main.getTaxRate()));

					BillScene record = new BillScene();
					BeanUtils.copyProperties(main, record);

					// 保存账单
					dao.insert(record);
					// 构造明细
					for (BillSceneMDInput input : item) {
						BillSceneDetail detail = new BillSceneDetail();
						BeanUtils.copyProperties(input, detail);
						detail.setBillId(record.getBillId());
						detail.setFreeStatus(FinanceCostStatusEnum.COSTOK.getCode());
						detail.setVersionNo("0");
						detail.setIsDel(PlatformConstants.ISDEL_NO);
						detail.setIsEnabled(FinanceIsEnabledEnum.Enabled.getCode());
						detail.setCreateTime(new Date());
						detail.setCreateUser(getCurrentUserId());
						detail.setProdCourseId(input.getProdCourseId());
						// 计算费用类型 生产直接给出费用类型编码
						// RepCode ='PTI' '第三方收费-PTI检测费'
						// RepCode IN ('CC','WW') '第三方收费-洗箱费'
						// 除了以上两种其他都是'第三方收费-冷箱箱体修理费'、'第三方收费-冷箱机组修理费'
						// RepCode ='PTI' '第三方收费-PTI检测费'
						// RepCode IN ('CC','WW') '第三方收费-洗箱费'
						// 除了以上两种其他都是'第三方收费-冷箱箱体修理费'、'第三方收费-冷箱机组修理费'
						if (input.getRepairCode().equals("PTI")) {
							detail.setChargeTypeKey("LKFICHARGT000036");// 第三方收费-PTI检测费
						} else if (input.getRepairCode().equals("CC") || input.getRepairCode().equals("WW")) {
							detail.setChargeTypeKey("LKFICHARGT000019");// 第三方收费-洗箱费
						} else if (input.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_01.getCode())
								|| input.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_02.getCode())) {
							detail.setChargeTypeKey("LKFICHARGT000006");// 第三方收费-冷箱箱体修理费
						} else {
							detail.setChargeTypeKey("LKFICHARGT000002");// 第三方收费-冷箱机组修理费
						}
						// 查询核算部门
						BaseAuditDeptInput badi = new BaseAuditDeptInput();
						badi.setCompanyKey(input.getCompanyKey());
						// 场站
						badi.setYard(input.getYard());
						// 箱类别
						badi.setContainerCategory(input.getContainerCategory());
						record.setContainerUser(input.getContainerUser());

						// 青岛公司默认回空箱
						if (record.getCompanyKey().equals("LKCOMPANY000001")) {// 青岛公司
							// 查询回空箱
							record.setMerchantsKey(FinanceConstants.merchantsHKX);
							BaseMerchantsExample BMexample = new BaseMerchantsExample();
							BMexample.createCriteria().andMerchantsKeyEqualTo(FinanceConstants.merchantsHKX);
							List<BaseMerchants> bmList = merchantsDao.selectByExample(BMexample);
							// 根据key 查询sapid
							String sapid = "";
							if (bmList != null && bmList.size() > 0) {
								sapid = bmList.get(0).getSapid();
							}
							record.setSapid(sapid);

						}

						// 费用类型 根据费用类型查询费用key
						BaseChargeTypeExample bctExample = new BaseChargeTypeExample();
						bctExample.createCriteria().andLangKeyEqualTo(detail.getChargeTypeKey());
						List<BaseChargeType> bctList = chargeTypeDao.selectByExample(bctExample);

						// 得到费用key
						String chargeKey = "";
						if (bctList != null && bctList.size() > 0) {
							badi.setChargeKey(bctList.get(0).getChargeKey());
							chargeKey = bctList.get(0).getChargeKey();
							record.setChargeTypeKey(chargeKey);
							record.setChargecode(bctList.get(0).getChargeCode());
						}
						if (!StringUtils.isEmpty(chargeKey)) {
							// 根据费用key得到税率
							BaseChargeRateExample bcrExample = new BaseChargeRateExample();
							bcrExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
									.andIsEnabledEqualTo(FinanceIsEnabledEnum.Enabled.getCode())
									.andChargeKeyEqualTo(chargeKey);

							// 根据费用key 获取税率ID
							List<BaseChargeRate> bcrList = chargeRateDao.selectByExample(bcrExample);
							if (bcrList != null && bcrList.size() > 0) {
								// 根据税率ID 查询税率
								BaseTaxRate bcr = taxRateDao.selectByPrimaryKey(bcrList.get(0).getTaxRateId());
								// 税率 tax_rate
								record.setTaxRate(bcr.getTaxRate());// 税率 通过费用类型得到
								record.setTaxAmountRmb(ComputeUtil.mul(record.getTotalCostRmb(), record.getTaxRate()));
								record.setTaxAmountUsd(ComputeUtil.mul(record.getTotalCostUsd(), record.getTaxRate()));
							}
						}
						BaseAuditDept baDept = baseAuditDeptService.getInfo(badi);
						if (baDept != null) {
							detail.setDeptKey(baDept.getCostDept());// 通过场站查询得到 成本中心
							detail.setDeptCode(baDept.getCostCenterCode());
						}
						// 插入明细
						daoDetail.insert(detail);
					}
					// 更新一次税率
					dao.updateByPrimaryKey(record);
				}
			}
		}

		return true;
	}

	/**
	 * 添加
	 */
	@Override
	public Boolean add(BillSceneInput input) {
		// TODO Auto-generated method stub
		BillScene record = new BillScene();
		BeanUtils.copyProperties(input, record);
		if (StringUtils.isEmpty(input.getBillId())) {

			record.setIsDel(PlatformConstants.ISDEL_NO);
			record.setCreateTime(new Date());
			record.setCreateUser(getCurrentUserId());
			if (dao.insert(record) > 0) {
				return true;
			}
		} else {
			// 查询一下信息
			BillScene info = dao.selectByPrimaryKey(input.getBillId());
			BeanUtils.copyProperties(info, record);
			BeanUtils.copyProperties(input, record);
			record.setUpdateTime(new Date());
			record.setUpdateUser(getCurrentUserId());
			if (dao.updateByPrimaryKey(record) > 0) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 账单驳回
	 */
	@Override
	public Boolean billReturn(RejectInput input) {
		// TODO Auto-generated method stub

		if (!StringUtils.isEmpty(input.getId())) {
			BillScene record = dao.selectByPrimaryKey(Integer.parseInt(input.getId()));
			record.setBillStatus(FinanceBillStatusEnum.BILLRETURN.getCode());// 已驳回
			record.setBillReturnReason(input.getRejectCode());
			// 如果是其它，将其它原因保存到账单备注字段中
			if (input.getRejectCode().equals(FinanceRejectEnum.OTHER.getCode())) {
				record.setBillRemark(input.getRemark());
			}
			record.setCreateTime(new Date());
			record.setCreateUser(getCurrentUserId());
			if (dao.updateByPrimaryKey(record) > 0) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 批量删除
	 */
	@Override
	public Boolean deletes(String[] ids) {
		// TODO Auto-generated method stub
		for (int i = 0; i < ids.length; i++) {
			BillScene record = dao.selectByPrimaryKey(Integer.parseInt(ids[i]));
			record.setIsDel(PlatformConstants.ISDEL_YES);
			record.setUpdateTime(new Date());
			record.setUpdateUser(getCurrentUserId());
			dao.updateByPrimaryKey(record);
		}
		return true;
	}

	/**
	 * 批量修改
	 */
	@Override
	public Boolean Upadtes(List<BillSceneInput> input) {
		// TODO Auto-generated method stub
		BillScene record = new BillScene();
		BeanUtils.copyProperties(input, record);
		if (input != null) {
			for (BillSceneInput item : input) {
				if (item.getBillId() != null) {
					// 查询一下信息
					BillScene info = dao.selectByPrimaryKey(item.getBillId());
					// 已审核不能修改
					if (info.getBillStatus() != null
							&& !info.getBillStatus().equals(FinanceBillStatusEnum.AUDITOR.getCode())) {
						BeanUtils.copyProperties(info, record);
						BeanUtils.copyProperties(item, record);
						record.setUpdateTime(new Date());
						record.setUpdateUser(getCurrentUserId());
						dao.updateByPrimaryKey(record);
					}

				}
			}
			return true;
		}
		return false;
	}

	/**
	 * 账单提交
	 */
	@Override
	public Boolean billSubmit(String[] ids) {
		for (int i = 0; i < ids.length; i++) {
			BillScene record = dao.selectByPrimaryKey(Integer.parseInt(ids[i]));
			// 账单提交状态改为待审核
			record.setBillStatus(FinanceBillStatusEnum.NOAUDITOR.getCode());
			record.setUpdateTime(new Date());
			record.setUpdateUser(getCurrentUserId());
			dao.updateByPrimaryKey(record);
		}
		return true;
	}

	/**
	 * 账单审核 同时传账单主信息及明细汇总信息（根据成本利润中心分类汇总）到应收账款模块。
	 */
	@Override
	public Boolean billAudit(String[] ids) {
		// TODO Auto-generated method stub
		for (int i = 0; i < ids.length; i++) {
			BillScene record = dao.selectByPrimaryKey(Integer.parseInt(ids[i]));
			// 构造主明细到商务结算
			Business bi = new Business();
			bi.setBillCode(record.getBillCode());// 账单号
			bi.setBillMonth(record.getBillMonth());// 月份
			bi.setBillType(FinanceBillTypeEnum.XCSFZD.getCode());// 现场收费
			bi.setContainerUser(record.getContainerUser());
			bi.setMerchantsKey(record.getMerchantsKey());
			bi.setSapid(record.getSapid());

//			BaseExchangeRateExample ere = new BaseExchangeRateExample();
//			ere.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
//					.andIsEnabledEqualTo(FinanceIsEnabledEnum.Enabled.getCode())
//					.andRateYearMonthEqualTo(record.getBillMonth());// 人民币
//			List<BaseExchangeRate> exchangeRateList = exchangeRateDao.selectByExample(ere);
//			if (exchangeRateList != null && exchangeRateList.size() > 0) {
//				bi.setExchangeRate(exchangeRateList.get(0).getExchangeRate());// 汇率 根据月份取汇率表
//			} else {// 如果月份没有查询到数据，开始向前找
//				ere = new BaseExchangeRateExample();
//				ere.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
//						.andIsEnabledEqualTo(FinanceIsEnabledEnum.Enabled.getCode());// 人民币
//				ere.setOrderByClause(" `create_time` DESC");
//				exchangeRateList = exchangeRateDao.selectByExample(ere);
//				// 获取最近一条的汇率
//				if (exchangeRateList != null && exchangeRateList.size() > 0) {
//					bi.setExchangeRate(exchangeRateList.get(0).getExchangeRate());// 汇率 根据月份取汇率表
//				} else {
//					bi.setExchangeRate(new BigDecimal("0.00"));// 汇率 根据月份取汇率表
//				}
//			}
			bi.setExchangeRate(record.getRealRate());
			bi.setCurrencyType(FinanceCurrencyType.CNY.getCode());// 币种人民币

			bi.setTaxTotalCostRmb(record.getTotalCostRmb());
			bi.setTaxTotalCostUsd(record.getTotalCostUsd());
			// bi.setNotaxTotalCostRmb();
			// bi.setNotaxTotalCostUsd();
			bi.setTaxRate(record.getTaxRate());
			// 税金
			bi.setTaxAmountRmb(ComputeUtil.mul(record.getTotalCostRmb(), bi.getTaxRate()));
			bi.setTaxAmountUsd(ComputeUtil.mul(record.getTotalCostUsd(), bi.getTaxRate()));

			bi.setSourceBillId(record.getBillId());// 原账单id
			bi.setSourceBillCode(record.getBillCode());// 原账单编号
			bi.setSourceTable("finance_bill_scene");// 原账单表
			bi.setCurrencyType(FinanceCurrencyType.CNY.getCode());// 币种人民币

//			bi.setNotaxTotalCostUsd(record.getTotalCostUsd());// 金额美金不含税
//			bi.setNotaxTotalCostRmb(record.getTotalCostUsd());// 金额人民币不含税
			bi.setVersionNo(record.getVersionNo());
			bi.setChargeInoutType(FinanceBudgetTypeEnum.INCOME.getCode());
			bi.setCreateTime(new Date());
			bi.setCreateUser(getCurrentUserId());
			bi.setIsDel(PlatformConstants.ISDEL_NO);
			bi.setIsEnabled(FinanceIsEnabledEnum.Enabled.getCode());
			bi.setCreateBillUser(bi.getCreateUser());
			// 保存主表信息
			businessDao.insert(bi);
			// 构造明细
			BillSceneDetailExample detailBS = new BillSceneDetailExample();
			detailBS.createCriteria().andBillIdEqualTo(record.getBillId());
			List<BillSceneDetail> detailBsList = daoDetail.selectByExample(detailBS);

			// 按维修代码汇总
			Map<String, List<BillSceneDetail>> menuGroupMap = detailBsList.stream()
					.collect(Collectors.groupingBy(d -> d.getRepairCode()));
			BigDecimal tmptaxRate = new BigDecimal(0.00);
			BigDecimal tmptaxAmountUsd = new BigDecimal(0.00);
			BigDecimal tmptaxAmountRmb = new BigDecimal(0.00);
			String tmpChargeKey = "";

			// 开始分类汇总
			for (String key : menuGroupMap.keySet()) {
				List<BillSceneDetail> item = menuGroupMap.get(key);
				// 求和
				Double sum = item.stream().map(b -> b.getAmount().doubleValue()).reduce(0.00, Double::sum);
				BillSceneDetail bsd = item.get(0);
				BusinessDetail bd = new BusinessDetail();
				bd.setBusinessId(bi.getId());
				bd.setProdCourseId(bsd.getProdCourseId());
				bd.setBillCode(record.getBillCode());

				bd.setChargeTypeKey(bsd.getChargeTypeKey());// 费用类型
				bd.setMerchantsKey(bi.getMerchantsKey());// 客户名称
				bd.setSapid(bi.getSapid());// sapid
				bd.setContainerUser(bsd.getContainerUser());
				bd.setCurrencyType(bi.getCurrencyType());// 币种
				bd.setExchangeRate(bi.getExchangeRate());// 汇率

				bd.setTaxRate(record.getTaxRate());

				bd.setTaxAmount(ComputeUtil.mul(bd.getTaxRate(), new BigDecimal(sum)));// 税额
				bd.setAmountRmb(new BigDecimal(sum));// 人民币
				bd.setAmountUsd(ComputeUtil.div(new BigDecimal(sum), bd.getExchangeRate(), 2));// 美金
				// 求和汇总 用于更新到主表
				tmptaxAmountRmb = ComputeUtil.add(tmptaxAmountRmb, ComputeUtil.mul(bd.getTaxRate(), bd.getAmountRmb()));
				tmptaxAmountUsd = ComputeUtil.add(tmptaxAmountUsd, ComputeUtil.mul(bd.getTaxRate(), bd.getAmountUsd()));

				bd.setRemarks(bsd.getRemarks());
				// 核算部门查询
				BaseAuditDeptInput badInput = new BaseAuditDeptInput();
				// 场站
				badInput.setYard(record.getYard());
				// 箱类别
				badInput.setContainerCategory(bsd.getContainerCategory());
				// 费用类型
				badInput.setChargeKey(tmpChargeKey);

				BaseAuditDept baDept = baseAuditDeptService.getInfo(badInput);
				if (baDept != null) {
					bd.setDeptKey(baDept.getCostDept());// 通过场站查询得到 成本中心
					bd.setDeptCode(baDept.getCostCenterCode());
				}
				bd.setVersionNo(bsd.getVersionNo());
				// 根据场站获取公司
				String companyKey = productionFeignClient.queryByKey(record.getYard()).getData().getCompany();
				bd.setCompanyKey(companyKey);
				bd.setYard(record.getYard());
				bd.setChargeInoutType(bi.getChargeInoutType());
				bd.setInterfaceType(FinanceInterfaceTypeEnum.InterfaceType01.getCode());
				bd.setLegacyDocType(FinanceLegacyTypeEnum.LegacyType01.getMessage());// 中文
				bd.setBillMonth(record.getBillMonth());
				bd.setContainerUser(record.getContainerUser());
				bd.setSourceTable("finance_bill_scene");
				bd.setSourceBillCode(record.getBillCode());
				bd.setSourceBillId(record.getBillId());
				// 净额 全部金额减去 税收

				bd.setNetAmount(ComputeUtil.sub(bd.getAmountRmb(),
						bd.getTaxAmount() == null ? new BigDecimal(0) : bd.getTaxAmount()));
				bd.setBillAuditor(getCurrentUserId());
				bd.setBillAuditorTime(new Date());
				bd.setNumber(new BigDecimal(item.size()));
				bd.setCreateBillUser(getCurrentUserId());

				bd.setCreateTime(new Date());
				bd.setCreateUser(getCurrentUserId());

				bd.setIsDel(PlatformConstants.ISDEL_NO);
				bd.setIsEnabled(FinanceIsEnabledEnum.Enabled.getCode());
				bd.setFreeStatus(FinanceInBillStateEnum.UNINBILL.getCode());// 明细状态 暂时存费用确认状态
				bd.setVersionNo(record.getVersionNo());
				bd.setBillCode(record.getBillCode());
				// 插入明细
				businessDetailDao.insert(bd);

				// RepCode ='PTI' '第三方收费-PTI检测费'
//				RepCode IN ('CC','WW')  '第三方收费-洗箱费'
//				除了以上两种其他都是'第三方收费-冷箱箱体修理费'、'第三方收费-冷箱机组修理费'
//				bd.setChargeTypeKey(chargeTypeKey);
			}
			// 账单待审核改为已审核
			record.setBillStatus(FinanceBillStatusEnum.AUDITOR.getCode());
			record.setBillAuditor(getCurrentUserId());
			record.setBillAuditorTime(new Date());
			record.setUpdateTime(new Date());
			record.setUpdateUser(getCurrentUserId());
			dao.updateByPrimaryKey(record);
			// 保存主表信息
//			Business updateentity = businessDao.selectByPrimaryKey(bi.getId());
//			updateentity.setChargeTypeKey(tmpChargeTypeKey);// 费用类型
//			updateentity.setTaxRate(tmptaxRate);// 税率
//			updateentity.setTaxAmountRmb(tmptaxAmountRmb);// 税金人民币
//			updateentity.setTaxAmountUsd(tmptaxAmountUsd);// 税金美金
//			updateentity.setTaxTotalCostUsd(ComputeUtil.add(record.getTotalCostUsd(), updateentity.getTaxAmountUsd()));// 金额美金含税
//			updateentity.setTaxTotalCostRmb(ComputeUtil.add(record.getTotalCostRmb(), updateentity.getTaxAmountRmb()));// 金额人民币含税

//			businessDao.updateByPrimaryKey(updateentity);// 更新主表
		}
		return true;
	}

	/**
	 * 取消账单审核 已审核修改为待审核，同时删除商务结算模块未入账记录和明细
	 */
	@Override
	public Boolean billCancleAudit(String[] ids) {
		// TODO Auto-generated method stub
		for (int i = 0; i < ids.length; i++) {
			BillScene record = dao.selectByPrimaryKey(Integer.parseInt(ids[i]));
			// 已审核修改为待审核，同时删除商务结算模块未入账记录和明细
			record.setBillStatus(FinanceBillStatusEnum.NOAUDITOR.getCode());
			record.setUpdateTime(new Date());
			record.setUpdateUser(getCurrentUserId());
			dao.updateByPrimaryKey(record);
			// 删除商务结算相关信息
			// 根据原账单ID找到相关商务结算信息
			BusinessDetailExample bexample = new BusinessDetailExample();
			// 查看是否有已入账，有已入账的无法删除
			bexample.createCriteria().andSourceBillIdEqualTo(Integer.parseInt(ids[i]))
					.andFreeStatusEqualTo(FinanceInBillStateEnum.INBILL.getCode());
			List<BusinessDetail> bdlist = businessDetailDao.selectByExample(bexample);
			// 跳过删除
			if (bdlist != null && bdlist.size() > 0) {
				continue;
			}
			BusinessExample bex = new BusinessExample();
			// 查看是否有已入账，有已入账的无法删除
			bex.createCriteria().andSourceBillIdEqualTo(Integer.parseInt(ids[i]));
			List<Business> blist = businessDao.selectByExample(bex);
			List<Integer> bids = blist.stream().map(b -> b.getId()).collect(Collectors.toList());
			// 根据商务结算主表，删除明细
			// 删除商务结算明细
			BusinessDetailExample detailEx = new BusinessDetailExample();
			detailEx.createCriteria().andBusinessIdIn(bids);
			businessDetailDao.deleteByExample(detailEx);
			// 删除商务结算主表记录
			BusinessExample delEx = new BusinessExample();
			delEx.createCriteria().andIdIn(bids);
			businessDao.deleteByExample(delEx);

		}
		return true;
	}

	/**
	 * 全额冲回 传负账单到应收账款模块，调账状态改为已冲回。商务结算明细表中追加相应的负费用明细， 商务结算主表数据入账状态改为待入账其它不变。 上传SBS。
	 */
	@Override
	public Boolean billFullReturn(String[] ids) {
		// TODO Auto-generated method stub
		if (ids != null && ids.length > 0) {
			List<Integer> idList = Arrays.asList(ids).stream().map(a -> Integer.parseInt(a))
					.collect(Collectors.toList());

			BusinessExample bexample = new BusinessExample();
			bexample.createCriteria().andSourceBillIdIn(idList);
			List<Business> bList = businessDao.selectByExample(bexample);
			// 得到商务结算主表id集合
			List<Integer> businessIds = bList.stream().map(a -> a.getId()).collect(Collectors.toList());
			for (Business item : bList) {
				// 根据主表id集合查询明细集合
				BusinessDetailExample bdetailexample = new BusinessDetailExample();
				bdetailexample.createCriteria().andBusinessIdIn(businessIds).andVersionNoEqualTo(item.getVersionNo());
				List<BusinessDetail> detailList = businessDetailDao.selectByExample(bdetailexample);
				detailList = detailList.stream().map(d -> {
					// 版本号+1
					d.setVersionNo((Integer.parseInt(d.getVersionNo()) + 1) + "");
					d.setBillCode(d.getSourceBillCode() + "T" + d.getVersionNo());
					d.setAmountRmb(d.getAmountRmb().negate());// 取相反数 得到负数值 人民币
					d.setAmountUsd(d.getAmountUsd().negate()); // 取相反数 得到负数值 美金
					d.setNumber(d.getNumber().negate());
					d.setFreeStatus(FinanceInBillStateEnum.UNINBILL.getCode());//未入账
					d.setInBillUser(null);
					d.setInBillTime(null);
					d.setCreateTime(new Date());
					d.setCreateUser(getCurrentUserId());
					return d;
				}).collect(Collectors.toList());
				// 开始插入负费用
				for (BusinessDetail businessDetail : detailList) {
					businessDetailDao.insert(businessDetail);
				}
				// 主表版本号+1
				item.setVersionNo((Integer.parseInt(item.getVersionNo()) + 1) + "");
				// 更新主表费用为0
				item.setTaxAmountRmb(new BigDecimal(0.00));
				item.setTaxAmountUsd(new BigDecimal(0.00));
				item.setNotaxTotalCostRmb(new BigDecimal(0.00));
				item.setNotaxTotalCostUsd(new BigDecimal(0.00));
				businessDao.updateByPrimaryKey(item);
			}

			// 更新原账单调账状态为已冲回
			BillSceneExample bsexample = new BillSceneExample();
			bsexample.createCriteria().andBillIdIn(idList);
			List<BillScene> bsList = dao.selectByExample(bsexample);
			for (BillScene billScene : bsList) {
				billScene.setModifyBillStatus(FinanceModifyBillEnum.FullReturn.getCode());// 已重回
				billScene.setModifyBillType(FinanceModifyBillTypeEnum.FullReturn.getCode());// 全额冲回
				billScene.setUpdateTime(new Date());
				billScene.setUpdateUser(getCurrentUserId());
				billScene.setVersionNo((Integer.parseInt(billScene.getVersionNo()) + 1) + "");
				dao.updateByPrimaryKey(billScene);
			}
			// 全部更新成功，上传SBS 手动点？ 后期自动上传sbs？加 ？？？
		}

		return true;
	}

	/**
	 * 全额调账 账单全额冲回后，才可全额调账。商务结算明细表中追加相应的费用明细，主表数据入账状态改为待入账其它不变。上传SBS。 商务结算明细版本号+1
	 * 账单号改为 账单号 + T01
	 */
	@Override
	public Boolean billFullAdjustment(String[] ids) {
		// TODO Auto-generated method stub
		// 重新构造明细数据到商务结算明细表中
		// 修改原账单版本号
		for (int i = 0; i < ids.length; i++) {
			BillScene record = dao.selectByPrimaryKey(Integer.parseInt(ids[i]));
			// 账单待审核改为已审核

			// 版本号+1
			if (record.getVersionNo() != null && !StringUtils.isEmpty(record.getVersionNo())) {
				record.setVersionNo((Integer.parseInt(record.getVersionNo()) + 1) + "");
			} else {
				record.setVersionNo("1");
			}

			// 账单待审核改为已审核
			record.setBillStatus(FinanceBillStatusEnum.AUDITOR.getCode());
			record.setBillAuditor(getCurrentUserId());
			record.setBillAuditorTime(new Date());
			record.setModifyBillType(FinanceModifyBillTypeEnum.FullAdjustment.getCode());
			record.setModifyBillStatus(FinanceModifyBillEnum.FullAdjustment.getCode());
			record.setUpdateTime(new Date());
			record.setUpdateUser(getCurrentUserId());

			dao.updateByPrimaryKey(record);
			// 根据账单查询商务结算主表信息
			BusinessExample bexample = new BusinessExample();
			bexample.createCriteria().andSourceBillIdEqualTo(record.getBillId());
			// 构造主明细到商务结算
			Business bi = businessDao.selectByExample(bexample).get(0);

			BeanUtils.copyProperties(record, bi);

//			BaseExchangeRateExample ere = new BaseExchangeRateExample();
//			ere.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
//					.andIsEnabledEqualTo(FinanceIsEnabledEnum.Enabled.getCode())
//					.andRateYearMonthEqualTo(record.getBillMonth());// 人民币
//			List<BaseExchangeRate> exchangeRateList = exchangeRateDao.selectByExample(ere);
//			if (exchangeRateList != null && exchangeRateList.size() > 0) {
//				bi.setExchangeRate(exchangeRateList.get(0).getExchangeRate());// 汇率 根据月份取汇率表
//			} else {// 如果月份没有查询到数据，开始向前找
//				ere = new BaseExchangeRateExample();
//				ere.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
//						.andIsEnabledEqualTo(FinanceIsEnabledEnum.Enabled.getCode());// 人民币
//				ere.setOrderByClause(" `create_time` DESC");
//				exchangeRateList = exchangeRateDao.selectByExample(ere);
//				// 获取最近一条的汇率
//				if (exchangeRateList != null && exchangeRateList.size() > 0) {
//					bi.setExchangeRate(exchangeRateList.get(0).getExchangeRate());// 汇率 根据月份取汇率表
//				} else {
//					bi.setExchangeRate(new BigDecimal("0.00"));// 汇率 根据月份取汇率表
//				}
//			}
			bi.setExchangeRate(record.getRealRate());

			bi.setTaxTotalCostRmb(record.getTotalCostRmb());
			bi.setTaxTotalCostUsd(record.getTotalCostUsd());
			// bi.setNotaxTotalCostRmb();
			// bi.setNotaxTotalCostUsd();
			bi.setTaxRate(record.getTaxRate());
			// 税金
			bi.setTaxAmountRmb(ComputeUtil.mul(record.getTotalCostRmb(), bi.getTaxRate()));
			bi.setTaxAmountUsd(ComputeUtil.mul(record.getTotalCostUsd(), bi.getTaxRate()));
//			bi.setTaxRate();
//			bi.setTaxAmountRmb(record.getTotalCostRmb());
//			bi.setTaxAmountUsd(record.getTotalCostUsd());

			bi.setSourceBillId(record.getBillId());// 原账单id
			bi.setSourceBillCode(record.getBillCode());// 原账单编号
			bi.setSourceTable("finance_bill_scene");// 原账单表
			bi.setCurrencyType(FinanceCurrencyType.CNY.getCode());// 币种人民币

//			bi.setNotaxTotalCostUsd(record.getTotalCostUsd());// 金额美金不含税
//			bi.setNotaxTotalCostRmb(record.getTotalCostUsd());// 金额人民币不含税
			// 版本号+1
			bi.setVersionNo(record.getVersionNo());
			bi.setChargeInoutType(FinanceBudgetTypeEnum.INCOME.getCode());
//			bi.setCreateTime(new Date());
//			bi.setCreateUser(getCurrentUserId());
//			bi.setIsDel(PlatformConstants.ISDEL_NO);
//			bi.setIsEnabled(FinanceIsEnabledEnum.Enabled.getCode());
//			bi.setCreateBillUser(bi.getCreateUser());
			bi.setUpdateTime(new Date());
			bi.setUpdateUser(getCurrentUserId());

//
//			// 税率的数据在下面通过明细计算得出 然后更新到这个数据中
//			bi.setTaxTotalCostUsd(ComputeUtil.add(record.getTotalCostUsd(), bi.getTaxAmountUsd()));// 金额美金含税
//			bi.setTaxTotalCostRmb(ComputeUtil.add(record.getTotalCostRmb(), bi.getTaxAmountRmb()));// 金额人民币含税
//			bi.setNotaxTotalCostUsd(record.getTotalCostUsd());// 金额美金不含税
//			bi.setNotaxTotalCostRmb(record.getTotalCostUsd());// 金额人民币不含税

//			bi.setCreateTime(new Date());
//			bi.setCreateUser(getCurrentUserId());
			bi.setIsDel(PlatformConstants.ISDEL_NO);
			bi.setIsEnabled(FinanceIsEnabledEnum.Enabled.getCode());

			// 保存主表信息
			businessDao.updateByPrimaryKey(bi);

			// 构造明细
			BillSceneDetailExample detailBS = new BillSceneDetailExample();
			detailBS.createCriteria().andBillIdEqualTo(record.getBillId());
			List<BillSceneDetail> detailBsList = daoDetail.selectByExample(detailBS);

			// 按维修代码汇总
			Map<String, List<BillSceneDetail>> menuGroupMap = detailBsList.stream()
					.collect(Collectors.groupingBy(d -> d.getRepairCode()));
			BigDecimal tmptaxRate = new BigDecimal(0.00);
			BigDecimal tmptaxAmountUsd = new BigDecimal(0.00);
			BigDecimal tmptaxAmountRmb = new BigDecimal(0.00);
			String tmpChargeKey = "";

			// 开始分类汇总
			for (String key : menuGroupMap.keySet()) {
				List<BillSceneDetail> item = menuGroupMap.get(key);
				// 求和
				Double sum = item.stream().map(b -> b.getAmount().doubleValue()).reduce(0.00, Double::sum);
				BillSceneDetail bsd = item.get(0);
				BusinessDetail bd = new BusinessDetail();
				bd.setBusinessId(bi.getId());
				bd.setProdCourseId(bsd.getProdCourseId());
				bd.setBillCode(record.getBillCode());// + "T" + record.getVersionNo()

				bd.setChargeTypeKey(bsd.getChargeTypeKey());// 费用类型
				bd.setMerchantsKey(bi.getMerchantsKey());// 客户名称
				bd.setSapid(bi.getSapid());// sapid
				

				bd.setCurrencyType(bi.getCurrencyType());// 币种
				bd.setExchangeRate(bi.getExchangeRate());// 汇率

				bd.setTaxRate(record.getTaxRate());
				bd.setTaxAmount(ComputeUtil.mul(bd.getTaxRate(), new BigDecimal(sum)));// 税额
				bd.setAmountRmb(new BigDecimal(sum));// 人民币
				bd.setAmountUsd(ComputeUtil.div(new BigDecimal(sum), bd.getExchangeRate(), 2));// 美金
				// 求和汇总 用于更新到主表
				tmptaxAmountRmb = ComputeUtil.add(tmptaxAmountRmb, ComputeUtil.mul(bd.getTaxRate(), bd.getAmountRmb()));
				tmptaxAmountUsd = ComputeUtil.add(tmptaxAmountUsd, ComputeUtil.mul(bd.getTaxRate(), bd.getAmountUsd()));
//				bd.setInvoiceType(FinanceInvoiceTypeEnum.Invoice03.getCode());

				bd.setRemarks(bsd.getRemarks());
				// 核算部门查询
				BaseAuditDeptInput badInput = new BaseAuditDeptInput();
				// 场站
				badInput.setYard(record.getYard());
				// 箱类别
				badInput.setContainerCategory(bsd.getContainerCategory());
				// 费用类型
				badInput.setChargeKey(tmpChargeKey);

				BaseAuditDept baDept = baseAuditDeptService.getInfo(badInput);
				if (baDept != null) {
					bd.setDeptKey(baDept.getCostDept());// 通过场站查询得到 成本中心
					bd.setDeptCode(baDept.getCostCenterCode());
				}
				bd.setVersionNo(bi.getVersionNo());
				// 根据场站获取公司
				String companyKey = productionFeignClient.queryByKey(record.getYard()).getData().getCompany();
				bd.setCompanyKey(companyKey);
				bd.setYard(record.getYard());
				bd.setChargeInoutType(bi.getChargeInoutType());
				bd.setInterfaceType(FinanceInterfaceTypeEnum.InterfaceType01.getCode());
				bd.setLegacyDocType(FinanceLegacyTypeEnum.LegacyType02.getMessage());// 中文
				
				
				bd.setBillMonth(record.getBillMonth());
				bd.setContainerUser(record.getContainerUser());
				bd.setSourceTable("finance_bill_scene");
				bd.setSourceBillCode(record.getBillCode());
				bd.setSourceBillId(record.getBillId());
				// 净额 全部金额减去 税收

				bd.setNetAmount(ComputeUtil.sub(bd.getAmountRmb(),
						bd.getTaxAmount() == null ? new BigDecimal(0) : bd.getTaxAmount()));
				bd.setBillAuditor(getCurrentUserId());
				bd.setBillAuditorTime(new Date());
				bd.setNumber(new BigDecimal(item.size()));
				bd.setCreateBillUser(getCurrentUserId());

				bd.setCreateTime(new Date());
				bd.setCreateUser(getCurrentUserId());

				bd.setIsDel(PlatformConstants.ISDEL_NO);
				bd.setIsEnabled(FinanceIsEnabledEnum.Enabled.getCode());
				bd.setFreeStatus(FinanceInBillStateEnum.UNINBILL.getCode());// 明细状态 暂时存费用确认状态
				bd.setVersionNo(record.getVersionNo());
				bd.setBillCode(record.getBillCode());
				// 插入明细
				businessDetailDao.insert(bd);

				// RepCode ='PTI' '第三方收费-PTI检测费'
//							RepCode IN ('CC','WW')  '第三方收费-洗箱费'
//							除了以上两种其他都是'第三方收费-冷箱箱体修理费'、'第三方收费-冷箱机组修理费'
//							bd.setChargeTypeKey(chargeTypeKey);
			}

			// 保存主表信息
//			Business updateentity = businessDao.selectByPrimaryKey(bi.getId());
////						updateentity.setChargeTypeKey(tmpChargeTypeKey);// 费用类型
//			updateentity.setTaxRate(tmptaxRate);// 税率
//			updateentity.setTaxAmountRmb(tmptaxAmountRmb);// 税金人民币
//			updateentity.setTaxAmountUsd(tmptaxAmountUsd);// 税金美金
////			updateentity.setTaxTotalCostUsd(ComputeUtil.add(record.getTotalCostUsd(), updateentity.getTaxAmountUsd()));// 金额美金含税
////			updateentity.setTaxTotalCostRmb(ComputeUtil.add(record.getTotalCostRmb(), updateentity.getTaxAmountRmb()));// 金额人民币含税
//
//			businessDao.updateByPrimaryKey(updateentity);// 更新主表

		}
		return true;
	}

	/**
	 * 现场收费减免 判断 部分减免还是全部减免 冲回原账单，生成新账单
	 * 
	 * 
	 */
	@Override
	public String reductionBill(List<BillSceneMDInput> list) {
		// TODO Auto-generated method stub
		// 1、根据进场ID查询相关账单
		Integer billId = 0;
		BillSceneDetailExample example = new BillSceneDetailExample();
		if (list != null && list.size() > 0) {
			example.createCriteria().andProdCourseIdEqualTo(list.get(0).getProdCourseId());
			List<BillSceneDetail> listDetails = daoDetail.selectByExample(example);
			List<Integer> ids = new ArrayList<Integer>();// 用于减免的集合 排除这个集合生成新账单
			if (listDetails != null && listDetails.size() > 0) {
				billId = listDetails.get(0).getBillId();

				// 根据账单查询是否入账
				// 查看商务结算是否已入账
				BusinessExample be = new BusinessExample();
				be.createCriteria().andSourceBillIdEqualTo(billId);
				List<Business> bes = businessDao.selectByExample(be);
				if (bes != null && bes.size() > 0) {
					List<Integer> besIds = bes.stream().map(x -> {
						return x.getId();
					}).collect(Collectors.toList());
					BusinessDetailExample bdExample = new BusinessDetailExample();
					bdExample.createCriteria().andBusinessIdIn(besIds);
					List<BusinessDetail> detailList = businessDetailDao.selectByExample(bdExample);
					Long count = detailList.stream()
							.filter(x -> x.getFreeStatus().equals(FinanceInBillStateEnum.INBILL.getCode())).count();
					if (count != null && count > 0) {
						return "inbill";// 账单已入账，
					} else {
						return "uninbill";// 账单待入账
					}
				} else {
					// 1、根据进场Id和维修代码 全部冲回原账单明细 然后重新插入新的明细
					for (BillSceneDetail billSceneDetail : listDetails) {
						BillSceneDetail bdetiail = new BillSceneDetail();
						BeanUtils.copyProperties(billSceneDetail, bdetiail);
						bdetiail.setAmount(billSceneDetail.getAmount().negate());// 负数，冲回
						daoDetail.insert(bdetiail);
					}

					for (BillSceneMDInput item : list) {
						List<BillSceneDetail> list1 = listDetails.stream()
								.filter(x -> x.getRepairCode().equals(item.getRepairCode())
										&& x.getAmount().compareTo(item.getAmount()) == 0)
								.collect(Collectors.toList());
						if (list1 != null && list1.size() > 0) {
							Integer id = list1.get(0).getId();
							ids.add(id);
						}

					}
					// 更新原账单总金额
					BillScene bsOld = dao.selectByPrimaryKey(billId);
					bsOld.setBillStatus(FinanceBillStatusEnum.NOAUDITOR.getCode());// 待审核状态
					bsOld.setTotalCostRmb(new BigDecimal(0.00));
					bsOld.setTotalCostUsd(new BigDecimal(0.00));
					bsOld.setUpdateTime(new Date());
					bsOld.setUpdateUser(getCurrentUserId());

					dao.updateByPrimaryKey(bsOld);
					// 判断一开始的明细条数 相等就是全减免 否则生成新账单
					if (ids.size() != listDetails.size()) {// 部分减免
						// 生成新账单
						BillSceneInput main = new BillSceneInput();
						// 得到公司代码
						String companyCode = "";
						if (list != null && list.size() > 0) {
							if (list.get(0).getCompanyKey() != null
									&& !StringUtils.isEmpty(list.get(0).getCompanyKey().trim())) {
								BaseSearchInput bsinput = new BaseSearchInput();
								bsinput.setCompanyKey(list.get(0).getCompanyKey().trim());
								List<CompanyOutput> companyList = productionFeignClient.companyList(bsinput).getData();
								if (companyList != null && companyList.size() > 0) {
									companyCode = companyList.get(0).getCompanyCode();
								}
							}
						}
						// 求和 总金额
						Double sum = list.stream().map(a -> a.getAmount().doubleValue()).reduce((a, b) -> a + b).get();
						main.setTotalCostRmb(new BigDecimal(sum));

						// 生成账单号
						main.setBillCode(
								getBillCode(FinanceBillTypeEnum.XCSFZD, FinanceBudgetTypeEnum.INCOME, companyCode));

						try {
							// 账单月份
							main.setBillMonth(DateUtils.dateFormat(new Date(), "YYYY-MM"));
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						main.setRealCurrencyType(FinanceCurrencyType.CNY.getCode());// 实收币种
						// 汇率
						BaseExchangeRateExample ere = new BaseExchangeRateExample();
						ere.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
								.andIsEnabledEqualTo(FinanceIsEnabledEnum.Enabled.getCode())
								.andRateYearMonthEqualTo(main.getBillMonth());// 人民币
						List<BaseExchangeRate> exchangeRateList = exchangeRateDao.selectByExample(ere);
						if (exchangeRateList != null && exchangeRateList.size() > 0) {
							main.setRealRate(exchangeRateList.get(0).getExchangeRate());// 汇率 根据月份取汇率表
						} else {// 如果月份没有查询到数据，开始向前找
							ere = new BaseExchangeRateExample();
							ere.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
									.andIsEnabledEqualTo(FinanceIsEnabledEnum.Enabled.getCode());// 人民币
							ere.setOrderByClause(" `create_time` DESC");
							exchangeRateList = exchangeRateDao.selectByExample(ere);
							// 获取最近一条的汇率
							if (exchangeRateList != null && exchangeRateList.size() > 0) {
								main.setRealRate(exchangeRateList.get(0).getExchangeRate());// 汇率 根据月份取汇率表
							} else {
								main.setRealRate(new BigDecimal("0.00"));// 汇率 根据月份取汇率表
							}
						}
						// 根据汇率计算美金总金额
						main.setTotalCostUsd(ComputeUtil.div(main.getTotalCostRmb(), main.getRealRate(), 2));
						main.setCreateNode("现场收费产生");
						main.setVersionNo("0");
						main.setBillStatus(FinanceBillStatusEnum.NOAUDITOR.getCode());
						main.setIsDel(PlatformConstants.ISDEL_NO);
						main.setIsEnabled(FinanceIsEnabledEnum.Enabled.getCode());
						main.setCreateTime(new Date());
						main.setCreateUser(getCurrentUserId());

						main.setTaxRate(FinanceConstants.taxRate);
						main.setTaxAmountRmb(ComputeUtil.mul(main.getTotalCostRmb(), main.getTaxRate()));
						main.setTaxAmountUsd(ComputeUtil.mul(main.getTotalCostUsd(), main.getTaxRate()));

						BillScene record = new BillScene();
						BeanUtils.copyProperties(main, record);
						// 保存账单
						dao.insert(record);
						// 构造明细
						for (BillSceneDetail billSceneDetail : listDetails) {
							if (!ids.contains(billSceneDetail.getId())) {
								BillSceneDetail detail = new BillSceneDetail();
								BeanUtils.copyProperties(billSceneDetail, detail);
								detail.setBillId(record.getBillId());
								detail.setFreeStatus(FinanceCostStatusEnum.COSTOK.getCode());
								detail.setVersionNo("0");
								detail.setIsDel(PlatformConstants.ISDEL_NO);
								detail.setIsEnabled(FinanceIsEnabledEnum.Enabled.getCode());
								detail.setCreateTime(new Date());
								detail.setCreateUser(getCurrentUserId());
								// 插入明细
								daoDetail.insert(detail);
							}

						}
					} else {// 全部减免
//						System.out.println("全部减免");
						for (BillSceneDetail billSceneDetail : listDetails) {
							BillSceneDetail bdetiail = new BillSceneDetail();
							BeanUtils.copyProperties(billSceneDetail, bdetiail);
							bdetiail.setAmount(billSceneDetail.getAmount().negate());// 负数，冲回

							daoDetail.insert(bdetiail);
						}
					}

				}

			} else {
				return "";
			}
		}
		return "";

	}

	/**
	 * 调账驳回
	 */
	@Override
	public Boolean billFullAdjustmentReturn(String[] ids) {
		// TODO Auto-generated method stub
		BillSceneExample example = new BillSceneExample();
		List<Integer> idList = Arrays.asList(ids).stream().map(a -> Integer.parseInt(a)).collect(Collectors.toList());
		example.createCriteria().andBillIdIn(idList);
		List<BillScene> list = dao.selectByExample(example);
		for (BillScene billScene : list) {
			// 调账驳回
//			billScene.setVersionNo((Integer.parseInt(billScene.getVersionNo())+1)+"");//版本+1
			billScene.setModifyBillStatus(FinanceModifyBillEnum.AdjustmentReturn.getCode());
			dao.updateByPrimaryKey(billScene);
		}
		return true;
	}
//
//	/**
//	 * 调账驳回提交 判断状态 同账单审核走一个口
//	 */
//	@Override
//	public Boolean billFullAdjustmentReturnSubmit(String[] ids) {
//		// TODO Auto-generated method stub
//		for (int i = 0; i < ids.length; i++) {
//			BillScene record = dao.selectByPrimaryKey(Integer.parseInt(ids[i]));
//			// 账单待审核改为已审核
//
//			// 版本号+1
//			if (record.getVersionNo() != null && !StringUtils.isEmpty(record.getVersionNo())) {
//				record.setVersionNo((Integer.parseInt(record.getVersionNo()) + 1) + "");
//			} else {
//				record.setVersionNo("1");
//			}
//
//			// 账单待审核改为已审核
//			record.setBillStatus(FinanceBillStatusEnum.AUDITOR.getCode());
//			record.setBillAuditor(getCurrentUserId());
//			record.setBillAuditorTime(new Date());
//			record.setModifyBillType(FinanceModifyBillTypeEnum.FullAdjustment.getCode());
//			record.setModifyBillStatus(FinanceModifyBillEnum.AdjustmentAudit.getCode());
//			record.setUpdateTime(new Date());
//			record.setUpdateUser(getCurrentUserId());
//
//			dao.updateByPrimaryKey(record);
//			// 根据账单查询商务结算主表信息
//			BusinessExample bexample = new BusinessExample();
//			bexample.createCriteria().andSourceBillIdEqualTo(record.getBillId());
//			// 构造主明细到商务结算
//			Business bi = businessDao.selectByExample(bexample).get(0);
//
//			BeanUtils.copyProperties(record, bi);
//
//			BaseExchangeRateExample ere = new BaseExchangeRateExample();
//			ere.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
//					.andIsEnabledEqualTo(FinanceIsEnabledEnum.Enabled.getCode())
//					.andRateYearMonthEqualTo(record.getBillMonth());// 人民币
//			List<BaseExchangeRate> exchangeRateList = exchangeRateDao.selectByExample(ere);
//			if (exchangeRateList != null && exchangeRateList.size() > 0) {
//				bi.setExchangeRate(exchangeRateList.get(0).getExchangeRate());// 汇率 根据月份取汇率表
//			} else {// 如果月份没有查询到数据，开始向前找
//				ere = new BaseExchangeRateExample();
//				ere.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
//						.andIsEnabledEqualTo(FinanceIsEnabledEnum.Enabled.getCode());// 人民币
//				ere.setOrderByClause(" `create_time` DESC");
//				exchangeRateList = exchangeRateDao.selectByExample(ere);
//				// 获取最近一条的汇率
//				if (exchangeRateList != null && exchangeRateList.size() > 0) {
//					bi.setExchangeRate(exchangeRateList.get(0).getExchangeRate());// 汇率 根据月份取汇率表
//				} else {
//					bi.setExchangeRate(new BigDecimal("0.00"));// 汇率 根据月份取汇率表
//				}
//			}
//
//			bi.setTaxTotalCostRmb(record.getTotalCostRmb());
//			bi.setTaxTotalCostUsd(record.getTotalCostUsd());
//			// bi.setNotaxTotalCostRmb();
//			// bi.setNotaxTotalCostUsd();
////				bi.setTaxRate();
////				bi.setTaxAmountRmb(record.getTotalCostRmb());
////				bi.setTaxAmountUsd(record.getTotalCostUsd());
//
//			bi.setSourceBillId(record.getBillId());// 原账单id
//			bi.setSourceBillCode(record.getBillCode());// 原账单编号
//			bi.setSourceTable("finance_bill_scene");// 原账单表
//			bi.setCurrencyType(FinanceCurrencyType.CNY.getCode());// 币种人民币
//
////				bi.setNotaxTotalCostUsd(record.getTotalCostUsd());// 金额美金不含税
////				bi.setNotaxTotalCostRmb(record.getTotalCostUsd());// 金额人民币不含税
//			// 版本号+1
//			bi.setVersionNo(record.getVersionNo());
//			bi.setChargeInoutType(FinanceBudgetTypeEnum.INCOME.getCode());
////				bi.setCreateTime(new Date());
////				bi.setCreateUser(getCurrentUserId());
////				bi.setIsDel(PlatformConstants.ISDEL_NO);
////				bi.setIsEnabled(FinanceIsEnabledEnum.Enabled.getCode());
////				bi.setCreateBillUser(bi.getCreateUser());
//			bi.setUpdateTime(new Date());
//			bi.setUpdateUser(getCurrentUserId());
//
//			//
////				// 税率的数据在下面通过明细计算得出 然后更新到这个数据中
////				bi.setTaxTotalCostUsd(ComputeUtil.add(record.getTotalCostUsd(), bi.getTaxAmountUsd()));// 金额美金含税
////				bi.setTaxTotalCostRmb(ComputeUtil.add(record.getTotalCostRmb(), bi.getTaxAmountRmb()));// 金额人民币含税
////				bi.setNotaxTotalCostUsd(record.getTotalCostUsd());// 金额美金不含税
////				bi.setNotaxTotalCostRmb(record.getTotalCostUsd());// 金额人民币不含税
//
////				bi.setCreateTime(new Date());
////				bi.setCreateUser(getCurrentUserId());
//			bi.setIsDel(PlatformConstants.ISDEL_NO);
//			bi.setIsEnabled(FinanceIsEnabledEnum.Enabled.getCode());
//
//			// 保存主表信息
//			businessDao.updateByPrimaryKey(bi);
//
//			// 构造明细
//			BillSceneDetailExample detailBS = new BillSceneDetailExample();
//			detailBS.createCriteria().andBillIdEqualTo(record.getBillId());
//			List<BillSceneDetail> detailBsList = daoDetail.selectByExample(detailBS);
//
//			// 按维修代码汇总
//			Map<String, List<BillSceneDetail>> menuGroupMap = detailBsList.stream()
//					.collect(Collectors.groupingBy(d -> d.getRepairCode()));
//			BigDecimal tmptaxRate = new BigDecimal(0.00);
//			BigDecimal tmptaxAmountUsd = new BigDecimal(0.00);
//			BigDecimal tmptaxAmountRmb = new BigDecimal(0.00);
//			String tmpChargeKey = "";
//
//			// 开始分类汇总
//			for (String key : menuGroupMap.keySet()) {
//				List<BillSceneDetail> item = menuGroupMap.get(key);
//				// 求和
//				Double sum = item.stream().map(b -> b.getAmount().doubleValue()).reduce(0.00, Double::sum);
//				BillSceneDetail bsd = item.get(0);
//				BusinessDetail bd = new BusinessDetail();
//				bd.setBusinessId(bi.getId());
//				bd.setProdCourseId(bsd.getProdCourseId());
//				bd.setBillCode(record.getBillCode() + "T" + record.getVersionNo());
//
//				bd.setChargeTypeKey(bsd.getChargeTypeKey());// 费用类型
//				bd.setMerchantsKey(bsd.getContainerUser());// 客户名称
//				bd.setSapid("");// sapid
//
//				bd.setCurrencyType(bi.getCurrencyType());// 币种
//				bd.setExchangeRate(bi.getExchangeRate());// 汇率
//				// 根据费用类型获取费用基本信息
//				BaseChargeTypeExample bctExample = new BaseChargeTypeExample();
//				bctExample.createCriteria().andLangKeyEqualTo(bsd.getChargeTypeKey());
//				List<BaseChargeType> bctList = chargeTypeDao.selectByExample(bctExample);
//				// 得到费用key
//				if (bctList != null && bctList.size() > 0) {
//					tmpChargeKey = bctList.get(0).getChargeKey();
//				}
//				// 根据费用key得到税率
//				BaseChargeRateExample bcrExample = new BaseChargeRateExample();
//				bcrExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
//						.andIsEnabledEqualTo(FinanceIsEnabledEnum.Enabled.getCode()).andChargeKeyEqualTo(tmpChargeKey);
//
//				// 根据费用key 获取税率ID
//				List<BaseChargeRate> bcrList = chargeRateDao.selectByExample(bcrExample);
//				bd.setTaxRate(new BigDecimal(0.00));// 初始化0
//				if (bcrList != null && bcrList.size() > 0) {
//					// 根据税率ID 查询税率
//					BaseTaxRate bcr = taxRateDao.selectByPrimaryKey(bcrList.get(0).getTaxRateId());
//					bd.setTaxRate(bcr.getTaxRate());// 税率 通过费用类型得到
//					if (tmptaxRate.compareTo(new BigDecimal(0.00)) == 0) {
//						tmptaxRate = bd.getTaxRate();// 得到税率 用于更新主表税率
//					}
//				}
//
//				bd.setTaxAmount(ComputeUtil.mul(bd.getTaxRate(), new BigDecimal(sum)));// 税额
//				bd.setAmountRmb(new BigDecimal(sum));// 人民币
//				bd.setAmountUsd(ComputeUtil.div(new BigDecimal(sum), bd.getExchangeRate(), 2));// 美金
//				// 求和汇总 用于更新到主表
//				tmptaxAmountRmb = ComputeUtil.add(tmptaxAmountRmb, ComputeUtil.mul(bd.getTaxRate(), bd.getAmountRmb()));
//				tmptaxAmountUsd = ComputeUtil.add(tmptaxAmountUsd, ComputeUtil.mul(bd.getTaxRate(), bd.getAmountUsd()));
////				bd.setInvoiceType(FinanceInvoiceTypeEnum.Invoice03.getCode());
//
//				bd.setRemarks(bsd.getRemarks());
//				// 核算部门查询
//				BaseAuditDeptInput badInput = new BaseAuditDeptInput();
//				// 场站
//				badInput.setYard(record.getYard());
//				// 箱类别
//				badInput.setContainerCategory(bsd.getContainerCategory());
//				// 费用类型
//				badInput.setChargeKey(tmpChargeKey);
//
//				BaseAuditDept baDept = baseAuditDeptService.getInfo(badInput);
//				if (baDept != null) {
//					bd.setDeptKey(baDept.getCostDept());// 通过场站查询得到 成本中心
//					bd.setDeptCode(baDept.getCostCenterCode());
//				}
//				bd.setVersionNo(bi.getVersionNo());
//				// 根据场站获取公司
//				String companyKey = productionFeignClient.queryByKey(record.getYard()).getData().getCompany();
//				bd.setCompanyKey(companyKey);
//				bd.setYard(record.getYard());
//				bd.setChargeInoutType(bi.getChargeInoutType());
//				bd.setInterfaceType(FinanceInterfaceTypeEnum.InterfaceType01.getCode());
//				bd.setLegacyDocType(FinanceLegacyTypeEnum.LegacyType01.getMessage());//中文
//				bd.setBillMonth(record.getBillMonth());
//				bd.setContainerUser(record.getContainerUser());
//				bd.setSourceTable("finance_bill_scene");
//				bd.setSourceBillCode(record.getBillCode());
//				bd.setSourceBillId(record.getBillId());
//				// 净额 全部金额减去 税收
//
//				bd.setNetAmount(ComputeUtil.sub(bd.getAmountRmb(),
//						bd.getTaxAmount() == null ? new BigDecimal(0) : bd.getTaxAmount()));
//				bd.setBillAuditor(getCurrentUserId());
//				bd.setBillAuditorTime(new Date());
//				bd.setNumber(new BigDecimal(item.size()));
//				bd.setCreateBillUser(getCurrentUserId());
//
//				bd.setCreateTime(new Date());
//				bd.setCreateUser(getCurrentUserId());
//
//				bd.setIsDel(PlatformConstants.ISDEL_NO);
//				bd.setIsEnabled(FinanceIsEnabledEnum.Enabled.getCode());
//				bd.setFreeStatus(FinanceInBillStateEnum.UNINBILL.getCode());// 明细状态 暂时存费用确认状态
//				bd.setVersionNo(record.getVersionNo());
//				bd.setBillCode(record.getBillCode());
//				// 插入明细
//				businessDetailDao.insert(bd);
//
//				// RepCode ='PTI' '第三方收费-PTI检测费'
////								RepCode IN ('CC','WW')  '第三方收费-洗箱费'
////								除了以上两种其他都是'第三方收费-冷箱箱体修理费'、'第三方收费-冷箱机组修理费'
////								bd.setChargeTypeKey(chargeTypeKey);
//			}
//
//			// 保存主表信息
//			Business updateentity = businessDao.selectByPrimaryKey(bi.getId());
////							updateentity.setChargeTypeKey(tmpChargeTypeKey);// 费用类型
//			updateentity.setTaxRate(tmptaxRate);// 税率
//			updateentity.setTaxAmountRmb(tmptaxAmountRmb);// 税金人民币
//			updateentity.setTaxAmountUsd(tmptaxAmountUsd);// 税金美金
////				updateentity.setTaxTotalCostUsd(ComputeUtil.add(record.getTotalCostUsd(), updateentity.getTaxAmountUsd()));// 金额美金含税
////				updateentity.setTaxTotalCostRmb(ComputeUtil.add(record.getTotalCostRmb(), updateentity.getTaxAmountRmb()));// 金额人民币含税
//
//			businessDao.updateByPrimaryKey(updateentity);// 更新主表
//
//		}
//
//		return true;
//	}

	/**
	 * 账单主信息编辑
	 */
	@Override
	public Boolean billEdit(BillInfoInput input) {
		// TODO Auto-generated method stub
		if (input != null && input.getBillId() != null) {
			BillScene record = dao.selectByPrimaryKey(input.getBillId());
			BeanUtils.copyProperties(input, record);
			dao.updateByPrimaryKey(record);
		}
		return true;
	}
}
