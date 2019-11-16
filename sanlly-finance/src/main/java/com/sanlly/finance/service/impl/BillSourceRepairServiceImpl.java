package com.sanlly.finance.service.impl;

import java.math.BigDecimal;
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
import com.sanlly.common.enums.FinanceIsEnabledEnum;
import com.sanlly.common.enums.FinanceLegacyTypeEnum;
import com.sanlly.common.enums.FinanceModifyBillEnum;
import com.sanlly.common.enums.FinanceModifyBillTypeEnum;
import com.sanlly.common.enums.FinanceRejectEnum;
import com.sanlly.common.models.input.base.BaseSearchInput;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.base.ContainerUserOutput;
import com.sanlly.common.models.output.company.CompanyOutput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.models.output.user.UserInfoOutput;
import com.sanlly.common.utils.ComputeUtil;
import com.sanlly.finance.dao.BaseChargeRateMapper;
import com.sanlly.finance.dao.BaseChargeTypeMapper;
import com.sanlly.finance.dao.BaseExchangeRateMapper;
import com.sanlly.finance.dao.BaseTaxRateMapper;
import com.sanlly.finance.dao.BillSourceRepairDetailMapper;
import com.sanlly.finance.dao.BillSourceRepairMapper;
import com.sanlly.finance.dao.BusinessDetailMapper;
import com.sanlly.finance.dao.BusinessMapper;
import com.sanlly.finance.dao.PoolSourceRepairMapper;
import com.sanlly.finance.entity.BaseAuditDept;
import com.sanlly.finance.entity.BaseChargeRate;
import com.sanlly.finance.entity.BaseChargeRateExample;
import com.sanlly.finance.entity.BaseChargeType;
import com.sanlly.finance.entity.BaseChargeTypeExample;
import com.sanlly.finance.entity.BaseDiscount;
import com.sanlly.finance.entity.BaseDiscountExample;
import com.sanlly.finance.entity.BaseExchangeRate;
import com.sanlly.finance.entity.BaseExchangeRateExample;
import com.sanlly.finance.entity.BaseTaxRate;
import com.sanlly.finance.entity.BillRepair;
import com.sanlly.finance.entity.BillRepairDetail;
import com.sanlly.finance.entity.BillRepairDetailExample;
import com.sanlly.finance.entity.BillRepairExample;
import com.sanlly.finance.entity.BillSourceRepair;
import com.sanlly.finance.entity.BillSourceRepairDetail;
import com.sanlly.finance.entity.BillSourceRepairDetailExample;
import com.sanlly.finance.entity.BillSourceRepairExample;
import com.sanlly.finance.entity.Business;
import com.sanlly.finance.entity.BusinessDetail;
import com.sanlly.finance.entity.BusinessDetailExample;
import com.sanlly.finance.entity.BusinessExample;
import com.sanlly.finance.entity.PoolOutSourceRepairExample;
import com.sanlly.finance.entity.PoolRepair;
import com.sanlly.finance.entity.PoolSourceRepair;
import com.sanlly.finance.entity.PoolSourceRepairExample;
import com.sanlly.finance.enums.ContainerCategoryEnum;
import com.sanlly.finance.models.input.BaseAuditDeptInput;
import com.sanlly.finance.models.input.BillSourceRepairInput;
import com.sanlly.finance.models.input.RejectInput;
import com.sanlly.finance.models.input.SearchBaseInput;
import com.sanlly.finance.models.output.BillSourceRepairDetailOutput;
import com.sanlly.finance.models.output.BillSourceRepairOutput;
import com.sanlly.finance.models.output.PoolSourceRepairOutput;
import com.sanlly.finance.service.BaseAuditDeptService;
import com.sanlly.finance.service.BillSourceRepairService;
import com.sanlly.finance.service.feign.AuthFeignClient;
import com.sanlly.finance.service.feign.ProductionFeignClient;

/**
 * 维修账单实现类
 * 
 * @Package com.sanlly.finance.service.impl 
 * @Description: TODO
 * @author fjy   
 * @date 2019年8月20日 上午11:37:58 
 * @version V1.0   
 */
@Service
public class BillSourceRepairServiceImpl extends BaseServiceImpl implements BillSourceRepairService {

	@Autowired
	private BillSourceRepairMapper dao;

	@Autowired
	private BillSourceRepairDetailMapper daoDetail;

	@Autowired
	private PoolSourceRepairMapper daoPool;

	@Autowired
	private AuthFeignClient authFeignClient;
	@Autowired
	private ProductionFeignClient productionFeignClient;
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
	private BaseAuditDeptService baseAuditDeptService;

	/**
	 * 查询分页
	 */
	@Override
	public PagedList<BillSourceRepairOutput> getPage(SearchBaseInput input) {
		// TODO Auto-generated method stub
		BillSourceRepairExample example = new BillSourceRepairExample();
		BillSourceRepairExample.Criteria criteria = example.createCriteria();
		// 过滤掉删除的记录
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO)
				.andIsEnabledEqualTo(FinanceIsEnabledEnum.Enabled.getCode());
		// 账单类型
		if (input.getBillType() != null) {
			criteria.andBillTypeEqualTo(input.getBillType());
		}
		// 账单月份
		if (input.getBillMonth() != null && !StringUtils.isEmpty(input.getBillMonth().trim())) {
			criteria.andBillMonthEqualTo(input.getBillMonth().trim());
		}
		// 账单编号
		if (input.getCode() != null && !StringUtils.isEmpty(input.getCode().trim())) {
			criteria.andBillCodeLike("%" + input.getCode().trim() + "%");
		}
		// 账单状态
		if (input.getBillStatus() != null && !StringUtils.isEmpty(input.getBillStatus().trim())) {
			criteria.andBillStatusEqualTo(input.getBillStatus().trim());
		}

		int totalCount = (int) dao.countByExample(example);
		PagedList<BillSourceRepairOutput> pagedList = new PagedList<BillSourceRepairOutput>(input.getPageIndex(),
				input.getPageSize(), totalCount);
		// 设置开始行数
		example.setLimitStart(pagedList.getLimitStart());
		// 设置结束行数
		example.setLimitEnd(pagedList.getLimitEnd());
		example.setOrderByClause(" `create_time` DESC");
		List<BillSourceRepair> list = dao.selectByExample(example);
		List<BillSourceRepairOutput> outputList = list.stream().map(a -> {// 创建日期倒序排列
			BillSourceRepairOutput output = new BillSourceRepairOutput();
			// 复制属性值到新对象
			BeanUtils.copyProperties(a, output);

			output.setContainerCategoryNameLang(a.getContainerCategory());// 箱类别
			output.setModifyBillStatusNameLang(a.getModifyBillStatus());// 调账状态
			output.setModifyBillTypeNameLang(a.getModifyBillType());// 调账方式
			output.setIsEnabledNameLang(a.getIsEnabled());// 是否有效
			output.setBillStatusNameLang(a.getBillStatus());// 账单状态
			output.setMerchantsNameLang(a.getMerchantsKey());// 客商名称
			// 查看是否有明细
			BillSourceRepairDetailExample detailEx = new BillSourceRepairDetailExample();
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
	public Boolean createBill(BillSourceRepairInput input) {
		// TODO Auto-generated method stub
//		FinanceBillTypeEnum billTypeEnum,FinanceBudgetTypeEnum inoutEnum,String companyCode
		// 1、获取账单类型 现场收费账单
		// 2、收支类型 收入
		// 3、公司代码 根据公司Key 或者场站查询公司代码

		if (input != null && !StringUtils.isEmpty(input.getBillId())) {

			BillSourceRepair record = dao.selectByPrimaryKey(input.getBillId());
			record.setChargecode(input.getChargecode());
			record.setChargeTypeKey(input.getChargeTypeKey());
			record.setBillMonth(input.getBillMonth());
			record.setTaxRate(input.getTaxRate());
			record.setRealRate(input.getRealRate());
			record.setMerchantsKey(input.getMerchantsKey());
			record.setSapid(input.getSapid());
			record.setBillRemark(input.getBillRemark());
			record.setInvoiceType(input.getInvoiceType());// 发票类型
			// 保存账单
			dao.updateByPrimaryKey(record);

		} else {// 新增

			// 得到公司代码
			String companyCode = "";
			if (input.getCompanyKey() != null && !StringUtils.isEmpty(input.getCompanyKey().trim())) {
				BaseSearchInput bsinput = new BaseSearchInput();
				bsinput.setCompanyKey(input.getCompanyKey().trim());
				List<CompanyOutput> companyList = productionFeignClient.companyList(bsinput).getData();
				if (companyList != null && companyList.size() > 0) {
					companyCode = companyList.get(0).getCompanyCode();
				}
			}

			// 生成账单号
			input.setBillCode(getBillCode(FinanceBillTypeEnum.CBWXZD, FinanceBudgetTypeEnum.EXPENDITURE, companyCode));
			input.setCreateNode("成本维修产生");

			input.setVersionNo("0");
			input.setBillStatus(FinanceBillStatusEnum.CREATE.getCode());
			input.setIsDel(PlatformConstants.ISDEL_NO);
			input.setIsEnabled(FinanceIsEnabledEnum.Enabled.getCode());
			input.setCreateTime(new Date());
			input.setCreateUser(getCurrentUserId());

			BillSourceRepair record = new BillSourceRepair();
			BeanUtils.copyProperties(input, record);
			// 保存账单
			dao.insert(record);
		}

		return true;
	}

	/**
	 * 添加
	 */
	@Override
	public Boolean add(BillSourceRepairInput input) {
		// TODO Auto-generated method stub
		BillSourceRepair record = new BillSourceRepair();
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
			BillSourceRepair info = dao.selectByPrimaryKey(input.getBillId());
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
			BillSourceRepair record = dao.selectByPrimaryKey(Integer.parseInt(input.getId()));
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
			BillSourceRepair record = dao.selectByPrimaryKey(Integer.parseInt(ids[i]));
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
	public Boolean Upadtes(List<BillSourceRepairInput> input) {
		// TODO Auto-generated method stub
		BillSourceRepair record = new BillSourceRepair();
		BeanUtils.copyProperties(input, record);
		if (input != null) {
			for (BillSourceRepairInput item : input) {
				if (item.getBillId() != null) {
					// 查询一下信息
					BillSourceRepair info = dao.selectByPrimaryKey(item.getBillId());
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
		// TODO Auto-generated method stub
		for (int i = 0; i < ids.length; i++) {
			BillSourceRepair record = dao.selectByPrimaryKey(Integer.parseInt(ids[i]));
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
	@SuppressWarnings("unchecked")
	@Override
	public Boolean billAudit(String[] ids) {
		// TODO Auto-generated method stub
		for (int i = 0; i < ids.length; i++) {
			BillSourceRepair record = dao.selectByPrimaryKey(Integer.parseInt(ids[i]));
			// 构造主明细到商务结算
			Business bi = new Business();

			bi.setBillCode(record.getBillCode());// 账单号
			bi.setBillMonth(record.getBillMonth());// 月份
			bi.setBillType(FinanceBillTypeEnum.CBWXZD.getCode());// 现场收费
			bi.setContainerUser(record.getChargeObject());
			bi.setMerchantsKey(record.getMerchantsKey());
			bi.setSapid(record.getSapid());
			bi.setExchangeRate(record.getRealRate());
			bi.setCurrencyType(record.getRealCurrencyType());// 币种

			bi.setContainerUser(record.getChargeObject());
			bi.setMerchantsKey(record.getMerchantsKey()); // 后期需求确定定表结构 用箱人
			bi.setSapid(record.getSapid());
			bi.setSourceBillId(record.getBillId());// 原账单id
			bi.setSourceBillCode(record.getBillCode());// 原账单编号
			bi.setSourceTable("finance_bill_source_repair");// 原账单表
			bi.setCurrencyType(record.getRealCurrencyType());// 币种人民币

			bi.setTaxTotalCostRmb(record.getRealTaxTotalCostRmb());
			bi.setTaxTotalCostUsd(record.getRealTaxTotalCostUsa());
			bi.setNotaxTotalCostRmb(record.getRealNotaxTotalCostRmb());
			bi.setNotaxTotalCostUsd(record.getRealNotaxTotalCostUsa());
			bi.setTaxRate(record.getTaxRate());

			bi.setTaxAmountRmb(record.getTaxAmountRbm());
			bi.setTaxAmountUsd(record.getTaxAmountUsa());
			bi.setVersionNo(record.getVersionNo());
			bi.setChargeInoutType(FinanceBudgetTypeEnum.EXPENDITURE.getCode());// 收支类型
			bi.setCreateTime(new Date());
			bi.setCreateUser(getCurrentUserId());
			bi.setIsDel(PlatformConstants.ISDEL_NO);
			bi.setIsEnabled(FinanceIsEnabledEnum.Enabled.getCode());
			bi.setCreateBillUser(record.getCreateUser());

			// 保存主表信息
			businessDao.insert(bi);
			// 构造明细
			BillSourceRepairDetailExample detailBS = new BillSourceRepairDetailExample();
			detailBS.createCriteria().andBillIdEqualTo(record.getBillId());
			List<BillSourceRepairDetail> detailBsList = daoDetail.selectByExample(detailBS);

			// 按核算部门 费用类型汇总
			Map<String, List<BillSourceRepairDetail>> menuGroupMap = detailBsList.stream()
					.collect(Collectors.groupingBy(g -> {
						return g.getDeptKey() + "#" + g.getChargeTypeKey();

					}));

			BigDecimal tmptaxRate = new BigDecimal(0.00);
			BigDecimal tmptaxAmountUsd = new BigDecimal(0.00);
			BigDecimal tmptaxAmountRmb = new BigDecimal(0.00);
			String tmpChargeTypeKey = "";
			// 开始分类汇总
			for (String key : menuGroupMap.keySet()) {
				List<BillSourceRepairDetail> item = (List<BillSourceRepairDetail>) menuGroupMap.get(key);
				// 求和
				Double noRmb = item.stream().map(x -> {
					if (x.getRealNotaxTotalCostRmb() == null) {
						return 0.00;
					} else {
						return x.getRealNotaxTotalCostRmb().doubleValue();
					}
				}).reduce(0.00, Double::sum);
				// 不含税美金
				Double noUsd = item.stream().map(x -> {
					if (x.getRealNotaxTotalCostUsa() == null) {
						return 0.00;
					} else {
						return x.getRealNotaxTotalCostUsa().doubleValue();
					}
				}).reduce(0.00, Double::sum);
				// 含税人民币
				Double rmb = item.stream().map(x -> {
					if (x.getRealTaxTotalCostRmb() == null) {
						return 0.00;
					} else {
						return x.getRealNotaxTotalCostRmb().doubleValue();
					}
				}).reduce(0.00, Double::sum);
				// 含税人民币
				Double usd = item.stream().map(x -> {
					if (x.getRealTaxTotalCostUsa() == null) {
						return 0.00;
					} else {
						return x.getRealNotaxTotalCostUsa().doubleValue();
					}
				}).reduce(0.00, Double::sum);

				BillSourceRepairDetail bsd = item.get(0);
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

				String tmpChargeKey = "";

				// 根据费用类型获取费用基本信息
				BaseChargeTypeExample bctExample = new BaseChargeTypeExample();
				bctExample.createCriteria().andLangKeyEqualTo(bsd.getChargeTypeKey());
				List<BaseChargeType> bctList = chargeTypeDao.selectByExample(bctExample);
//							 得到费用key
				if (bctList != null && bctList.size() > 0) {
					tmpChargeKey = bctList.get(0).getChargeKey();
				}
				// 核算部门查询
				BaseAuditDeptInput badInput = new BaseAuditDeptInput();
				// 场站
				badInput.setYard(bsd.getYard());
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
				bd.setInvoiceType(record.getInvoiceType());// 发票类型

				if (!noRmb.equals(0.00)) {// 不含税 是中远的
					bd.setTaxAmount(ComputeUtil.mul(bd.getTaxRate(), new BigDecimal(noRmb)));// 税额
					bd.setAmountRmb(new BigDecimal(noRmb));// 人民币
					bd.setAmountUsd(ComputeUtil.div(new BigDecimal(noRmb), bd.getExchangeRate(), 2));// 美金
				} else if (!rmb.equals(0.00)) {// 含税 不是中远的
					bd.setTaxAmount(ComputeUtil.mul(bd.getTaxRate(), new BigDecimal(rmb)));// 税额
					bd.setAmountRmb(new BigDecimal(rmb));// 人民币
					bd.setAmountUsd(ComputeUtil.div(new BigDecimal(rmb), bd.getExchangeRate(), 2));// 美金
				} else if (!noUsd.equals(0.00)) {// 含税 不是中远的
					bd.setTaxAmount(ComputeUtil.mul(bd.getTaxRate(), new BigDecimal(noUsd)));// 税额
					bd.setAmountRmb(ComputeUtil.mul(new BigDecimal(noUsd), bd.getExchangeRate()));// 人民币
					bd.setAmountUsd(new BigDecimal(noUsd));// 美金
				} else if (!usd.equals(0.00)) {// 含税 不是中远的
					bd.setTaxAmount(ComputeUtil.mul(bd.getTaxRate(), new BigDecimal(usd)));// 税额
					bd.setAmountRmb(ComputeUtil.mul(new BigDecimal(usd), bd.getExchangeRate()));// 人民币
					bd.setAmountUsd(new BigDecimal(usd));// 美金
				}

				// 根据场站获取公司
				String companyKey = productionFeignClient.queryByKey(bsd.getYard()).getData().getCompany();
				bd.setCompanyKey(companyKey);
				bd.setYard(bsd.getYard());
				bd.setChargeInoutType(bi.getChargeInoutType());
				 
				bd.setInterfaceType(FinanceInterfaceTypeEnum.InterfaceType04.getCode());
				bd.setLegacyDocType(FinanceLegacyTypeEnum.LegacyType03.getMessage());// 中文
				bd.setBillMonth(record.getBillMonth());
				bd.setContainerUser(bsd.getContainerUser());
				bd.setSourceTable("finance_bill_repair");
				bd.setSourceBillCode(record.getBillCode());
				bd.setSourceBillId(record.getBillId());

				// 净额 全部金额减去 税收

				bd.setNetAmount(ComputeUtil.sub(bd.getAmountRmb(),
						bd.getTaxAmount() == null ? new BigDecimal(0) : bd.getTaxAmount()));
				bd.setBillAuditor(getCurrentUserId());
				bd.setBillAuditorTime(new Date());
				bd.setNumber(new BigDecimal(item.size()));
				bd.setCreateBillUser(record.getCreateUser());

				bd.setCreateTime(new Date());
				bd.setCreateUser(getCurrentUserId());

				bd.setIsDel(PlatformConstants.ISDEL_NO);
				bd.setIsEnabled(FinanceIsEnabledEnum.Enabled.getCode());
				bd.setFreeStatus(FinanceInBillStateEnum.UNINBILL.getCode());// 明细状态 暂时存费用确认状态
				bd.setVersionNo(record.getVersionNo());
				bd.setBillCode(record.getBillCode());

				// 插入明细
				businessDetailDao.insert(bd);

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
////			updateentity.setChargeTypeKey(tmpChargeTypeKey);// 费用类型
//			updateentity.setTaxRate(tmptaxRate);// 税率
//			updateentity.setTaxAmountRmb(tmptaxAmountRmb);// 税金人民币
//			updateentity.setTaxAmountUsd(tmptaxAmountUsd);// 税金美金
////			updateentity.setTaxTotalCostUsd(ComputeUtil.add(record.getTaxAmountUsa(), updateentity.getTaxAmountUsd()));// 金额美金含税
////			updateentity.setTaxTotalCostRmb(ComputeUtil.add(record.getTaxAmountUsa(), updateentity.getTaxAmountRmb()));// 金额人民币含税
//
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
			BillSourceRepair record = dao.selectByPrimaryKey(Integer.parseInt(ids[i]));
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
					d.setFreeStatus(FinanceInBillStateEnum.UNINBILL.getCode());// 未入账
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
			BillSourceRepairExample bsexample = new BillSourceRepairExample();
			bsexample.createCriteria().andBillIdIn(idList);
			List<BillSourceRepair> bsList = dao.selectByExample(bsexample);
			for (BillSourceRepair billRepair : bsList) {
				billRepair.setModifyBillStatus(FinanceModifyBillEnum.FullReturn.getCode());// 已重回
				billRepair.setModifyBillType(FinanceModifyBillTypeEnum.FullReturn.getCode());// 全额冲回
				billRepair.setUpdateTime(new Date());
				billRepair.setUpdateUser(getCurrentUserId());
				billRepair.setVersionNo((Integer.parseInt(billRepair.getVersionNo()) + 1) + "");
				dao.updateByPrimaryKey(billRepair);
			}
			// 全部更新成功，上传SBS 手动点？ 后期自动上传sbs？加 ？？？
		}

		return true;
	}

	/**
	 * 全额调账 账单全额冲回后，才可全额调账。商务结算明细表中追加相应的费用明细，主表数据入账状态改为待入账其它不变。上传SBS。 商务结算明细版本号+1
	 * 账单号改为 账单号 + T01
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Boolean billFullAdjustment(String[] ids) {
		// TODO Auto-generated method stub
		// 重新构造明细数据到商务结算明细表中
		// 修改原账单版本号
		for (int i = 0; i < ids.length; i++) {
			BillSourceRepair record = dao.selectByPrimaryKey(Integer.parseInt(ids[i]));
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
			// 构造主明细到商务结算
			// 根据账单查询商务结算主表信息
			BusinessExample bexample = new BusinessExample();
			bexample.createCriteria().andSourceBillIdEqualTo(record.getBillId());
			// 构造主明细到商务结算
			Business bi = businessDao.selectByExample(bexample).get(0);

			BeanUtils.copyProperties(record, bi);
			// 构造主明细到商务结算

			bi.setBillCode(record.getBillCode());// 账单号
			bi.setBillMonth(record.getBillMonth());// 月份
			bi.setBillType(FinanceBillTypeEnum.CBWXZD.getCode());// 现场收费
			bi.setContainerUser(record.getChargeObject());
			bi.setMerchantsKey(record.getMerchantsKey());
			bi.setSapid(record.getSapid());

			bi.setExchangeRate(record.getRealRate());
			bi.setCurrencyType(record.getRealCurrencyType());// 币种

			bi.setContainerUser(record.getChargeObject());
			bi.setMerchantsKey(record.getMerchantsKey()); // 后期需求确定定表结构 用箱人
			bi.setSapid(record.getSapid());
			bi.setSourceBillId(record.getBillId());// 原账单id
			bi.setSourceBillCode(record.getBillCode());// 原账单编号
			bi.setSourceTable("finance_bill_source_repair");// 原账单表
			bi.setCurrencyType(record.getRealCurrencyType());// 币种人民币

			bi.setTaxTotalCostRmb(record.getRealTaxTotalCostRmb());
			bi.setTaxTotalCostUsd(record.getRealTaxTotalCostUsa());
			bi.setNotaxTotalCostRmb(record.getRealNotaxTotalCostRmb());
			bi.setNotaxTotalCostUsd(record.getRealNotaxTotalCostUsa());
			bi.setTaxRate(record.getTaxRate());

			bi.setTaxAmountRmb(record.getTaxAmountRbm());
			bi.setTaxAmountUsd(record.getTaxAmountUsa());

			bi.setVersionNo(record.getVersionNo());
			bi.setChargeInoutType(FinanceBudgetTypeEnum.INCOME.getCode());// 收支类型
			bi.setUpdateTime(new Date());
			bi.setUpdateUser(getCurrentUserId());
			bi.setIsDel(PlatformConstants.ISDEL_NO);
			bi.setIsEnabled(FinanceIsEnabledEnum.Enabled.getCode());
			// 保存主表信息
			businessDao.insert(bi);
			// 构造明细
			BillSourceRepairDetailExample detailBS = new BillSourceRepairDetailExample();
			detailBS.createCriteria().andBillIdEqualTo(record.getBillId());
			List<BillSourceRepairDetail> detailBsList = daoDetail.selectByExample(detailBS);

			// 按核算部门 费用类型汇总
			Map<String, List<BillSourceRepairDetail>> menuGroupMap = detailBsList.stream()
					.collect(Collectors.groupingBy(g -> {
						return g.getDeptKey() + "#" + g.getChargeTypeKey();

					}));

			BigDecimal tmptaxRate = new BigDecimal(0.00);
			BigDecimal tmptaxAmountUsd = new BigDecimal(0.00);
			BigDecimal tmptaxAmountRmb = new BigDecimal(0.00);
			String tmpChargeTypeKey = "";
			// 开始分类汇总
			for (String key : menuGroupMap.keySet()) {
				List<BillSourceRepairDetail> item = (List<BillSourceRepairDetail>) menuGroupMap.get(key);
				// 求和
				Double noRmb = item.stream().map(x -> {
					if (x.getRealNotaxTotalCostRmb() == null) {
						return 0.00;
					} else {
						return x.getRealNotaxTotalCostRmb().doubleValue();
					}
				}).reduce(0.00, Double::sum);
				// 不含税美金
				Double noUsd = item.stream().map(x -> {
					if (x.getRealNotaxTotalCostUsa() == null) {
						return 0.00;
					} else {
						return x.getRealNotaxTotalCostUsa().doubleValue();
					}
				}).reduce(0.00, Double::sum);
				// 含税人民币
				Double rmb = item.stream().map(x -> {
					if (x.getRealTaxTotalCostRmb() == null) {
						return 0.00;
					} else {
						return x.getRealNotaxTotalCostRmb().doubleValue();
					}
				}).reduce(0.00, Double::sum);
				// 含税人民币
				Double usd = item.stream().map(x -> {
					if (x.getRealTaxTotalCostUsa() == null) {
						return 0.00;
					} else {
						return x.getRealNotaxTotalCostUsa().doubleValue();
					}
				}).reduce(0.00, Double::sum);

				BillSourceRepairDetail bsd = item.get(0);
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

				String tmpChargeKey = "";

				// 根据费用类型获取费用基本信息
				BaseChargeTypeExample bctExample = new BaseChargeTypeExample();
				bctExample.createCriteria().andLangKeyEqualTo(bsd.getChargeTypeKey());
				List<BaseChargeType> bctList = chargeTypeDao.selectByExample(bctExample);
//							 得到费用key
				if (bctList != null && bctList.size() > 0) {
					tmpChargeKey = bctList.get(0).getChargeKey();
				}
				// 核算部门查询
				BaseAuditDeptInput badInput = new BaseAuditDeptInput();
				// 场站
				badInput.setYard(bsd.getYard());
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

				if (!noRmb.equals(0.00)) {// 不含税 是中远的
					bd.setTaxAmount(ComputeUtil.mul(bd.getTaxRate(), new BigDecimal(noRmb)));// 税额
					bd.setAmountRmb(new BigDecimal(noRmb));// 人民币
					bd.setAmountUsd(ComputeUtil.div(new BigDecimal(noRmb), bd.getExchangeRate(), 2));// 美金
				} else if (!rmb.equals(0.00)) {// 含税 不是中远的
					bd.setTaxAmount(ComputeUtil.mul(bd.getTaxRate(), new BigDecimal(rmb)));// 税额
					bd.setAmountRmb(new BigDecimal(rmb));// 人民币
					bd.setAmountUsd(ComputeUtil.div(new BigDecimal(rmb), bd.getExchangeRate(), 2));// 美金
				} else if (!noUsd.equals(0.00)) {// 含税 不是中远的
					bd.setTaxAmount(ComputeUtil.mul(bd.getTaxRate(), new BigDecimal(noUsd)));// 税额
					bd.setAmountRmb(ComputeUtil.mul(new BigDecimal(noUsd), bd.getExchangeRate()));// 人民币
					bd.setAmountUsd(new BigDecimal(noUsd));// 美金
				} else if (!usd.equals(0.00)) {// 含税 不是中远的
					bd.setTaxAmount(ComputeUtil.mul(bd.getTaxRate(), new BigDecimal(usd)));// 税额
					bd.setAmountRmb(ComputeUtil.mul(new BigDecimal(usd), bd.getExchangeRate()));// 人民币
					bd.setAmountUsd(new BigDecimal(usd));// 美金
				}

				// 求和汇总 用于更新到主表
				tmptaxAmountRmb = ComputeUtil.add(tmptaxAmountRmb, bd.getAmountRmb());
				tmptaxAmountUsd = ComputeUtil.add(tmptaxAmountUsd, bd.getAmountUsd());

				// 根据场站获取公司
				String companyKey = productionFeignClient.queryByKey(bsd.getYard()).getData().getCompany();
				bd.setCompanyKey(companyKey);
				bd.setYard(bsd.getYard());
				bd.setChargeInoutType(bi.getChargeInoutType());
				bd.setInvoiceType(record.getInvoiceType());
				bd.setInterfaceType(FinanceInterfaceTypeEnum.InterfaceType04.getCode());
				bd.setLegacyDocType(FinanceLegacyTypeEnum.LegacyType04.getMessage());// 中文
				bd.setBillMonth(record.getBillMonth());
				bd.setContainerUser(bsd.getContainerUser());
				bd.setSourceTable("finance_bill_source_repair");
				bd.setSourceBillCode(record.getBillCode());
				bd.setSourceBillId(record.getBillId());

				// 净额 全部金额减去 税收

				bd.setNetAmount(ComputeUtil.sub(bd.getAmountRmb(),
						bd.getTaxAmount() == null ? new BigDecimal(0) : bd.getTaxAmount()));
				bd.setBillAuditor(getCurrentUserId());
				bd.setBillAuditorTime(new Date());
				bd.setNumber(new BigDecimal(item.size()));
				bd.setCreateBillUser(record.getCreateUser());

				bd.setCreateTime(new Date());
				bd.setCreateUser(getCurrentUserId());

				bd.setIsDel(PlatformConstants.ISDEL_NO);
				bd.setIsEnabled(FinanceIsEnabledEnum.Enabled.getCode());
				bd.setFreeStatus(FinanceInBillStateEnum.UNINBILL.getCode());// 明细状态 暂时存费用确认状态
				bd.setVersionNo(record.getVersionNo());
				bd.setBillCode(record.getBillCode());
				// 插入明细
				businessDetailDao.insert(bd);

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
////			updateentity.setChargeTypeKey(tmpChargeTypeKey);// 费用类型
//			updateentity.setTaxRate(tmptaxRate);// 税率
//			updateentity.setTaxAmountRmb(tmptaxAmountRmb);// 税金人民币
//			updateentity.setTaxAmountUsd(tmptaxAmountUsd);// 税金美金
//			businessDao.updateByPrimaryKey(updateentity);// 更新主表

		}
		return true;
	}

	/**
	 * 账单明细查询
	 */
	@Override
	public List<BillSourceRepairDetailOutput> listDetail(SearchBaseInput input) {
		// TODO Auto-generated method stub
		BillSourceRepairDetailExample example = new BillSourceRepairDetailExample();
		BillSourceRepairDetailExample.Criteria criteria = example.createCriteria();
		// 过滤掉删除的记录
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO)
				.andIsEnabledEqualTo(FinanceIsEnabledEnum.Enabled.getCode());
		// 账单主键
		if (input.getBillType() != null) {
			criteria.andBillIdEqualTo(input.getPid());
		}

		example.setOrderByClause(" `create_time` DESC");
		List<BillSourceRepairDetail> list = daoDetail.selectByExample(example);
		List<BillSourceRepairDetailOutput> outputList = list.stream().map(a -> {// 创建日期倒序排列
			BillSourceRepairDetailOutput output = new BillSourceRepairDetailOutput();
			// 复制属性值到新对象
			BeanUtils.copyProperties(a, output);

			output.setContainerCategoryNameLang(a.getContainerCategory());// 箱类别
			output.setIsEnabledNameLang(a.getIsEnabled());// 是否有效
			output.setYardNameLang(a.getYard());// 场站
			output.setContainerUserNameLang(a.getContainerUser());// 用箱人
			output.setFreeStatusNameLang(a.getFreeStatus());// 费用状态
			output.setChargeTypeNameLang(a.getChargeTypeKey());//费用类型
			output.setChargeObjectNameLang(a.getChargeObject());
			
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

		return outputList;
	}

	/**
	 * 费用池明细查询
	 */
	@Override
	public List<PoolSourceRepairOutput> listPoolDetail(SearchBaseInput input) {
		// TODO Auto-generated method stub
		PoolSourceRepairExample example = new PoolSourceRepairExample();
		PoolSourceRepairExample.Criteria criteria = example.createCriteria();
		// 过滤掉删除的记录
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO).andIsEnabledEqualTo(FinanceIsEnabledEnum.Enabled.getCode())
				.andItemStatusEqualTo(0).andFreeStatusEqualTo(FinanceCostStatusEnum.COSTOK.getCode());
		// 账单类型
		if (input.getPoolType() != null) {
			criteria.andPoolTypeEqualTo(input.getPoolType());
		}
		// 收费对象
		if (input.getChargeObject() != null && !StringUtils.isEmpty(input.getChargeObject())) {
			criteria.andChargeObjectEqualTo(input.getChargeObject());
		}
		example.setOrderByClause(" `create_time` DESC");
		List<PoolSourceRepair> list = daoPool.selectByExample(example);
		List<PoolSourceRepairOutput> outputList = list.stream().map(a -> {// 创建日期倒序排列
			PoolSourceRepairOutput output = new PoolSourceRepairOutput();
			// 复制属性值到新对象
			BeanUtils.copyProperties(a, output);

			output.setContainerCategoryNameLang(a.getContainerCategory());// 箱类别
			output.setIsEnabledNameLang(a.getIsEnabled());// 是否有效
			output.setChargeTypeIdNameLang(a.getChargeTypeKey());// 费用类型
			output.setYardNameLang(a.getYard());// 场站
			output.setContainerUserNameLang(a.getContainerUser());// 用箱人
			output.setFreeStatusNameLang(a.getFreeStatus());// 费用状态
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

		return outputList;
	}

	/**
	 * 批量删除账单明细 还原费用池状态
	 */
	@Override
	public Boolean deleteDetail(String[] ids) {
		// TODO Auto-generated method stub
		// 查询主表信息
		BillSourceRepair main = new BillSourceRepair();
		// 总金额统计
		for (int i = 0; i < ids.length; i++) {
			BillSourceRepairDetail record = daoDetail.selectByPrimaryKey(Integer.parseInt(ids[i]));

			main = dao.selectByPrimaryKey(record.getBillId());

			daoDetail.deleteByPrimaryKey(Integer.parseInt(ids[i]));
			// 还原费用池状态
			PoolSourceRepair pool = daoPool.selectByPrimaryKey(record.getPoolId());
			pool.setItemStatus(0);// 未加入
			daoPool.updateByPrimaryKey(pool);
			// 更新总费用
			main.setRealTaxTotalCostRmb(ComputeUtil.sub(main.getRealTaxTotalCostRmb() == null ? new BigDecimal(0.00) :main.getRealTaxTotalCostRmb(), pool.getRealTaxTotalCostRmb()== null ? new BigDecimal(0.00) :pool.getRealTaxTotalCostRmb()));
			main.setRealTaxTotalCostUsa(ComputeUtil.sub(main.getRealTaxTotalCostUsa() == null ? new BigDecimal(0.00) :main.getRealTaxTotalCostUsa(), pool.getRealTaxTotalCostUsa()== null ? new BigDecimal(0.00) :pool.getRealTaxTotalCostUsa()));
			main.setRealNotaxTotalCostRmb(ComputeUtil.sub(main.getRealNotaxTotalCostRmb() == null ? new BigDecimal(0.00) :main.getRealNotaxTotalCostRmb(), pool.getRealNotaxTotalCostRmb()== null ? new BigDecimal(0.00) :pool.getRealNotaxTotalCostRmb()));
			main.setRealNotaxTotalCostUsa(ComputeUtil.sub(main.getRealNotaxTotalCostUsa() == null ? new BigDecimal(0.00) :main.getRealNotaxTotalCostUsa(), pool.getRealNotaxTotalCostUsa()== null ? new BigDecimal(0.00) :pool.getRealNotaxTotalCostUsa()));
			
			// 更新主表
			dao.updateByPrimaryKey(main);

		}
		// 查询是否还有明细 没有明细，修改账单状态为已生成
		BillSourceRepairDetailExample example = new BillSourceRepairDetailExample();
		example.createCriteria().andBillIdEqualTo(main.getBillId());
		long count = daoDetail.countByExample(example);
		if (count == 0) {// 更新账单状态为已生成
			main.setBillStatus(FinanceBillStatusEnum.CREATE.getCode());
			dao.updateByPrimaryKey(main);
		}
		return true;
	}

	/**
	 * 取消费用确认
	 */
	@Override
	public Boolean cancleFreeOk(String[] ids) {
		// TODO Auto-generated method stub
		for (int i = 0; i < ids.length; i++) {
			PoolSourceRepair record = daoPool.selectByPrimaryKey(Integer.parseInt(ids[i]));
			record.setFreeStatus(FinanceCostStatusEnum.COSTNOOK.getCode());
			daoPool.updateByPrimaryKey(record);
		}
		return true;
	}

	/**
	 * 加入账单
	 */
	@Override
	public Boolean billAdd(String[] ids, Integer billId) {
		// TODO Auto-generated method stub
		// 费用池数据 插入到账单明细中
//		for (int i = 0; i < ids.length; i++) {
//			PoolSourceRepair pool = daoPool.selectByPrimaryKey(Integer.parseInt(ids[i]));
//			BillSourceRepairDetail record = new BillSourceRepairDetail();
//			BeanUtils.copyProperties(pool, record);
//			record.setBillType(pool.getPoolType());
//			record.setPoolId(pool.getId());
//			record.setBillId(billId);
//			if (daoDetail.insert(record) > 0) {
//				pool.setItemStatus(1);// 加入账单
//				daoPool.updateByPrimaryKey(pool); // 更新加入状态
//			}
//		}
		
		BillSourceRepair main = dao.selectByPrimaryKey(billId);
		BigDecimal rateAmountRmb = new BigDecimal(0.00);
		BigDecimal rateAmountUsa = new BigDecimal(0.00);

		// 费用池数据 插入到账单明细中
		for (int i = 0; i < ids.length; i++) {
			PoolSourceRepair pool = daoPool.selectByPrimaryKey(Integer.parseInt(ids[i]));
			BillSourceRepairDetail record = new BillSourceRepairDetail();
			BeanUtils.copyProperties(pool, record);
			record.setBillType(pool.getPoolType());
			record.setPoolId(pool.getId());
			record.setBillId(billId);
			if (daoDetail.insert(record) > 0) {
				pool.setItemStatus(1);// 加入账单
				daoPool.updateByPrimaryKey(pool); // 更新加入状态
			}

			// 用箱人Code
			String containerUserCode = "";
			ContainerUserOutput cuoutput = productionFeignClient.getContainerUserByKey(record.getContainerUser())
					.getData();
			if (cuoutput != null) {
				containerUserCode = cuoutput.getContainerUserCode();
			}
			if (containerUserCode.equals("COS")) {// 中远不含税
				// 批复(不含税)总费用美金 reply_notax_total_cost_usa
				main.setRealNotaxTotalCostUsa(ComputeUtil.add(
						main.getRealNotaxTotalCostUsa() == null ? new BigDecimal(0.00)
								: main.getRealNotaxTotalCostUsa(),
						pool.getRealTaxTotalCostUsa() == null ? new BigDecimal(0.00)
								: pool.getRealTaxTotalCostUsa()));
				// 批复(不含税)总费用人民币reply_notax_total_cost_rmb
				main.setRealNotaxTotalCostRmb(ComputeUtil.add(
						main.getRealNotaxTotalCostRmb() == null ? new BigDecimal(0.00)
								: main.getRealNotaxTotalCostRmb(),
						pool.getRealTaxTotalCostRmb() == null ? new BigDecimal(0.00)
								: pool.getRealTaxTotalCostRmb()));
			} else {
				// 批复含税美金 reply_tax_total_cost_usa
				main.setRealTaxTotalCostUsa(ComputeUtil.add(
						main.getRealTaxTotalCostUsa() == null ? new BigDecimal(0.00) : main.getRealTaxTotalCostUsa(),
						pool.getRealTaxTotalCostUsa() == null ? new BigDecimal(0.00)
								: pool.getRealTaxTotalCostUsa()));
				// 批复含税 人民币reply_tax_total_cost_rmb
				main.setRealTaxTotalCostRmb(ComputeUtil.add(
						main.getRealTaxTotalCostRmb() == null ? new BigDecimal(0.00) : main.getRealTaxTotalCostRmb(),
						pool.getRealTaxTotalCostRmb() == null ? new BigDecimal(0.00)
								: pool.getRealTaxTotalCostRmb()));
			}
   

			String tmpChargeKey = "";
			 

			// 根据费用类型获取费用基本信息
			BaseChargeTypeExample bctExample = new BaseChargeTypeExample();
			bctExample.createCriteria().andLangKeyEqualTo(pool.getChargeTypeKey());
			List<BaseChargeType> bctList = chargeTypeDao.selectByExample(bctExample);
			// 得到费用key
			if (bctList != null && bctList.size() > 0) {
				tmpChargeKey = bctList.get(0).getChargeKey();
				main.setBusinessCategory(bctList.get(0).getBusinessCategory());
				main.setBusinessType(bctList.get(0).getBusinessType());
			}

			// 收费对象
			main.setChargeObject(pool.getChargeObject());
			// 箱类别
			main.setContainerCategory(pool.getContainerCategory());
			

		}
 
		// 税金计算
		if (main.getTaxRate() != null) {
			// 根据实收费用计算税金
			rateAmountRmb = ComputeUtil.mul(
					main.getRealTaxTotalCostRmb() == null ? new BigDecimal(0.00) : main.getRealTaxTotalCostRmb(),
					main.getTaxRate());

			rateAmountUsa = ComputeUtil.mul(
					main.getRealTaxTotalCostUsa() == null ? new BigDecimal(0.00) : main.getRealTaxTotalCostUsa(),
					main.getTaxRate());
		}

		// 税金(人民币)tax_amount_rbm
		main.setTaxAmountRbm(rateAmountRmb);
		// 税金(美金) tax_amount_usa
		main.setTaxAmountUsa(rateAmountUsa);
		// 实收（人民币含税）real_tax_total_cost_rmb

		// 数量（箱量）number
		// 查询明细 根据进场id分组求箱量
		BillSourceRepairDetailExample brdExample = new BillSourceRepairDetailExample();
		brdExample.createCriteria().andBillIdEqualTo(billId);
		List<BillSourceRepairDetail> brdList = daoDetail.selectByExample(brdExample);

		Map<String, List<BillSourceRepairDetail>> numGroupMap = brdList.stream()
				.collect(Collectors.groupingBy(BillSourceRepairDetail::getProdCourseId));
		main.setNumber(new BigDecimal(numGroupMap.size()));

		// 更新主表
		dao.updateByPrimaryKey(main);

		BillSourceRepairDetailExample example = new BillSourceRepairDetailExample();
		example.createCriteria().andBillIdEqualTo(main.getBillId());
		long count = daoDetail.countByExample(example);
		if (count > 0) {// 更新账单状态为待审核
			main.setBillStatus(FinanceBillStatusEnum.NOAUDITOR.getCode());
			dao.updateByPrimaryKey(main);
		}
		return true;
	}
	
	/**
	 * 调账驳回
	 */
	@Override
	public Boolean billFullAdjustmentReturn(String[] ids) {
		// TODO Auto-generated method stub
		BillSourceRepairExample example = new BillSourceRepairExample();
		List<Integer> idList = Arrays.asList(ids).stream().map(a -> Integer.parseInt(a)).collect(Collectors.toList());
		example.createCriteria().andBillIdIn(idList);
		List<BillSourceRepair> list = dao.selectByExample(example);
		for (BillSourceRepair billRepair : list) {
			// 调账驳回
			billRepair.setModifyBillStatus(FinanceModifyBillEnum.AdjustmentReturn.getCode());
			dao.updateByPrimaryKey(billRepair);
		}
		return true;
	}

}
