package com.sanlly.finance.service.impl;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
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
import com.sanlly.common.enums.FinanceIsEnabledEnum;
import com.sanlly.common.enums.FinanceLeaseEnum;
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
import com.sanlly.finance.dao.BillLeaseMapper;
import com.sanlly.finance.dao.BusinessDetailMapper;
import com.sanlly.finance.dao.BusinessMapper;
import com.sanlly.finance.entity.BaseAuditDept;
import com.sanlly.finance.entity.BaseChargeRate;
import com.sanlly.finance.entity.BaseChargeRateExample;
import com.sanlly.finance.entity.BaseChargeType;
import com.sanlly.finance.entity.BaseChargeTypeExample;
import com.sanlly.finance.entity.BaseExchangeRate;
import com.sanlly.finance.entity.BaseExchangeRateExample;
import com.sanlly.finance.entity.BaseTaxRate;
import com.sanlly.finance.entity.BillLease;
import com.sanlly.finance.entity.BillLeaseExample;
import com.sanlly.finance.entity.Business;
import com.sanlly.finance.entity.BusinessDetail;
import com.sanlly.finance.entity.BusinessDetailExample;
import com.sanlly.finance.entity.BusinessExample;
import com.sanlly.finance.entity.PoolLease;
import com.sanlly.finance.enums.ContainerCategoryEnum;
import com.sanlly.finance.models.input.BaseAuditDeptInput;
import com.sanlly.finance.models.input.BillLeaseInput;
import com.sanlly.finance.models.input.PoolLeaseInput;
import com.sanlly.finance.models.input.RejectInput;
import com.sanlly.finance.models.input.SearchBaseInput;
import com.sanlly.finance.models.output.BillLeaseOutput;
import com.sanlly.finance.service.BaseAuditDeptService;
import com.sanlly.finance.service.BillLeaseService;
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
public class BillLeaseServiceImpl extends BaseServiceImpl implements BillLeaseService {

	@Autowired
	private BillLeaseMapper dao;

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

	/**
	 * 查询分页
	 */
	@Override
	public PagedList<BillLeaseOutput> getPage(SearchBaseInput input) {
		// TODO Auto-generated method stub
		BillLeaseExample example = new BillLeaseExample();
		BillLeaseExample.Criteria criteria = example.createCriteria();

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
		// 账单状态
		if (input.getBillStatus() != null && !StringUtils.isEmpty(input.getBillStatus().trim())) {
			criteria.andBillStatusEqualTo(input.getBillStatus().trim());
		}
		int totalCount = (int) dao.countByExample(example);
		PagedList<BillLeaseOutput> pagedList = new PagedList<BillLeaseOutput>(input.getPageIndex(), input.getPageSize(),
				totalCount);
		// 设置开始行数
		example.setLimitStart(pagedList.getLimitStart());
		// 设置结束行数
		example.setLimitEnd(pagedList.getLimitEnd());
		example.setOrderByClause(" `create_time` DESC");
		List<BillLease> list = dao.selectByExample(example);
		List<BillLeaseOutput> outputList = list.stream().map(a -> {// 创建日期倒序排列
			BillLeaseOutput output = new BillLeaseOutput();
			// 复制属性值到新对象
			BeanUtils.copyProperties(a, output);

			output.setContainerUserNameLang(a.getContainerUser());// 用箱人
			output.setYardNameLang(a.getYard());// 场站
			output.setModifyBillStatusNameLang(a.getModifyBillStatus());// 调账状态
			output.setModifyBillTypeNameLang(a.getModifyBillType());// 调账方式
			output.setIsEnabledNameLang(a.getIsEnabled());// 是否有效
			output.setBillStatusNameLang(a.getBillStatus());// 账单状态
			output.setCustomerNameNameLang(a.getCustomerName());
			output.setChargeInoutTypeNameLang(a.getChargeInoutType());
			output.setBusinessCategoryNameLang(a.getBusinessCategory());
			output.setBusinessTypeNameLang(a.getBusinessType());
			output.setChargeTypeKeyNameLang(a.getChargeTypeKey());
			output.setCompanyKeyNameLang(a.getCompanyKey());
			output.setDeptKeyNameLang(a.getDeptKey());

			// 查看商务结算是否已入账
			BusinessExample be = new BusinessExample();
			be.createCriteria().andSourceBillIdEqualTo(a.getBillId());
			List<Business> bes = businessDao.selectByExample(be);
			if (bes != null && bes.size() > 0) {
				// 查询商务结算明细
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
	public Boolean createBill(List<PoolLeaseInput> list) {
		// 判断进场id是否是同一个，不同的进场id分不同的账单
		if (list != null && list.size() > 0) {
			BigDecimal realRate = new BigDecimal(0.00);
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

			for (PoolLeaseInput item : list) {

				BillLease main = new BillLease();
				BeanUtils.copyProperties(item, main);
				String tmpChargeKey = "";

				// 根据费用类型获取费用基本信息
				BaseChargeTypeExample bctExample = new BaseChargeTypeExample();
				bctExample.createCriteria().andLangKeyEqualTo(item.getChargeTypeKey());
				List<BaseChargeType> bctList = chargeTypeDao.selectByExample(bctExample);
				// 得到费用key
				if (bctList != null && bctList.size() > 0) {
					tmpChargeKey = bctList.get(0).getChargeKey();
					main.setBusinessCategory(bctList.get(0).getBusinessCategory());
					main.setBusinessType(bctList.get(0).getBusinessType());
					main.setChargeTypeKey(bctList.get(0).getChargeKey());
				}
				// 根据费用key得到税率
				BaseChargeRateExample bcrExample = new BaseChargeRateExample();
				bcrExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
						.andIsEnabledEqualTo(FinanceIsEnabledEnum.Enabled.getCode()).andChargeKeyEqualTo(tmpChargeKey);

				// 根据费用key 获取税率ID
				List<BaseChargeRate> bcrList = chargeRateDao.selectByExample(bcrExample);
				if (bcrList != null && bcrList.size() > 0) {
					// 根据税率ID 查询税率
					BaseTaxRate bcr = taxRateDao.selectByPrimaryKey(bcrList.get(0).getTaxRateId());
					main.setTaxRate(bcr.getTaxRate());// 税率 通过费用类型得到
				}
				// 1、获取账单类型 租赁 场地账单
				// 2、收支类型 收入
				// 3、公司代码 根据公司Key 或者场站查询公司代码
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
				// 计算金额 查看模式公式是哪个 如果是公式2需要计算天数
				if (item.getFormulaType().equals(FinanceLeaseEnum.Lease_02.getCode())) {
					// 计算当前月的天数
					Calendar aCalendar = Calendar.getInstance(Locale.CHINA);
					int day = aCalendar.getActualMaximum(Calendar.DATE);
					main.setDayNumber(new BigDecimal(day));
					item.setAmount(ComputeUtil.mul(item.getAmount(), main.getDayNumber()));
				}
				// 用箱人Code
				String containerUserCode = "";
				ContainerUserOutput cuoutput = productionFeignClient.getContainerUserByKey(item.getContainerUser())
						.getData();
				if (cuoutput != null) {
					containerUserCode = cuoutput.getContainerUserCode();
				}

				if (containerUserCode.equals("COS")) {
					if (item.getRealCurrencyType().equals(FinanceCurrencyType.CNY.getCode())) {

						main.setRealNotaxTotalCostRmb(item.getAmount());
						// 计算美金
						main.setRealNotaxTotalCostUsd(ComputeUtil.div(item.getAmount(), realRate, 2));

					} else {
						main.setRealNotaxTotalCostUsd(item.getAmount());
						// 计算人民币
						main.setRealNotaxTotalCostRmb(ComputeUtil.mul(item.getAmount(), realRate));

					}
				} else {
					if (item.getRealCurrencyType().equals(FinanceCurrencyType.CNY.getCode())) {
						main.setRealTaxTotalCostRmb(item.getAmount());
						// 计算美金
						main.setRealTaxTotalCostUsd(ComputeUtil.div(item.getAmount(), realRate, 2));
						if (!StringUtils.isEmpty(main.getTaxRate())) {
							main.setTaxAmountRmb(ComputeUtil.mul(main.getTaxRate(), item.getAmount()));// 税额
							// 计算美金
							main.setTaxAmountUsd(ComputeUtil.div(main.getTaxAmountRmb(), realRate, 2));
						}

					} else {
						main.setRealTaxTotalCostUsd(item.getAmount());
						// 计算人民币
						main.setRealTaxTotalCostRmb(ComputeUtil.mul(item.getAmount(), realRate));
						if (!StringUtils.isEmpty(main.getTaxRate())) {
							main.setTaxAmountUsd(ComputeUtil.mul(main.getTaxRate(), item.getAmount()));// 税额
							// 计算美金
							main.setTaxAmountRmb(ComputeUtil.mul(main.getTaxAmountRmb(), realRate));
						}

					}
				}
				if (item.getChargeInoutType().equals(FinanceBudgetTypeEnum.INCOME.getCode())) {
					// 生成账单号
					main.setBillCode(getBillCode(FinanceBillTypeEnum.ZLZD, FinanceBudgetTypeEnum.INCOME, companyCode));
					main.setCreateNode("租赁定时生成");
				} else {
					// 生成账单号
					main.setBillCode(
							getBillCode(FinanceBillTypeEnum.ZLZD, FinanceBudgetTypeEnum.EXPENDITURE, companyCode));
					main.setCreateNode("场地费定时生成");
				}
				// 账单月份
				main.setBillMonth(yearMonth);
				// 汇率
				main.setRealRate(realRate);
				main.setVersionNo("0");
				main.setBillStatus(FinanceBillStatusEnum.NOAUDITOR.getCode());
				main.setIsDel(PlatformConstants.ISDEL_NO);
				main.setIsEnabled(FinanceIsEnabledEnum.Enabled.getCode());
				main.setCreateTime(new Date());
//				main.setCreateUser();
				BillLease record = new BillLease();
				BeanUtils.copyProperties(main, record);
				// 保存账单
				dao.insert(record);

			}

		}

		return true;
	}

	/**
	 * 添加
	 */
	@Override
	public Boolean add(BillLeaseInput input) {
		// TODO Auto-generated method stub
		BillLease record = new BillLease();
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
			BillLease info = dao.selectByPrimaryKey(input.getBillId());
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
			BillLease record = dao.selectByPrimaryKey(Integer.parseInt(input.getId()));
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
			BillLease record = dao.selectByPrimaryKey(Integer.parseInt(ids[i]));
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
	public Boolean Upadtes(List<BillLeaseInput> input) {
		// TODO Auto-generated method stub
		BillLease record = new BillLease();
		BeanUtils.copyProperties(input, record);
		if (input != null) {
			for (BillLeaseInput item : input) {
				if (item.getBillId() != null) {
					// 查询一下信息
					BillLease info = dao.selectByPrimaryKey(item.getBillId());
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
			BillLease record = dao.selectByPrimaryKey(Integer.parseInt(ids[i]));
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
			BillLease record = dao.selectByPrimaryKey(Integer.parseInt(ids[i]));
			// 构造主明细到商务结算
			Business bi = new Business();
			bi.setBillCode(record.getBillCode());// 账单号
			bi.setBillMonth(record.getBillMonth());// 月份
			bi.setBillType(FinanceBillTypeEnum.ZLZD.getCode());// 现场收费
			bi.setContainerUser(record.getContainerUser());
			bi.setMerchantsKey(record.getCustomerName());// 客户
			bi.setSapid(record.getSapid());

			bi.setSourceBillId(record.getBillId());// 原账单id
			bi.setSourceBillCode(record.getBillCode());// 原账单编号
			bi.setSourceTable("finance_bill_lease");// 原账单表
			bi.setCurrencyType(record.getRealCurrencyType());// 币种人民币
			BaseExchangeRateExample ere = new BaseExchangeRateExample();
			ere.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
					.andIsEnabledEqualTo(FinanceIsEnabledEnum.Enabled.getCode())
					.andRateYearMonthEqualTo(record.getBillMonth());// 人民币
			List<BaseExchangeRate> exchangeRateList = exchangeRateDao.selectByExample(ere);
			if (exchangeRateList != null && exchangeRateList.size() > 0) {
				bi.setExchangeRate(exchangeRateList.get(0).getExchangeRate());// 汇率 根据月份取汇率表
			} else {// 如果月份没有查询到数据，开始向前找
				ere = new BaseExchangeRateExample();
				ere.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
						.andIsEnabledEqualTo(FinanceIsEnabledEnum.Enabled.getCode());// 人民币
				ere.setOrderByClause(" `create_time` DESC");
				exchangeRateList = exchangeRateDao.selectByExample(ere);
				// 获取最近一条的汇率
				if (exchangeRateList != null && exchangeRateList.size() > 0) {
					bi.setExchangeRate(exchangeRateList.get(0).getExchangeRate());// 汇率 根据月份取汇率表
				} else {
					bi.setExchangeRate(new BigDecimal("0.00"));// 汇率 根据月份取汇率表
				}
			}

			bi.setNotaxTotalCostUsd(record.getRealNotaxTotalCostUsd());// 金额美金不含税
			bi.setNotaxTotalCostRmb(record.getRealNotaxTotalCostRmb());// 金额人民币不含税
			bi.setTaxTotalCostRmb(record.getRealTaxTotalCostRmb());
			bi.setTaxTotalCostUsd(record.getRealTaxTotalCostUsd());

			bi.setCreateTime(new Date());
			bi.setCreateUser(getCurrentUserId());
			bi.setIsDel(PlatformConstants.ISDEL_NO);
			bi.setIsEnabled(FinanceIsEnabledEnum.Enabled.getCode());

			bi.setTaxRate(record.getTaxRate());// 税率
			bi.setTaxAmountRmb(record.getTaxAmountRmb());// 税金人民币
			bi.setTaxAmountUsd(record.getTaxAmountUsd());// 税金美金
			bi.setVersionNo("0");
			bi.setChargeInoutType(FinanceBudgetTypeEnum.INCOME.getCode());
			bi.setCreateBillUser(record.getCreateUser());
//			// 保存主表信息
			businessDao.insert(bi);

			// 账单待审核改为已审核
			record.setBillStatus(FinanceBillStatusEnum.AUDITOR.getCode());
			record.setBillAuditor(getCurrentUserId());
			record.setBillAuditorTime(new Date());
			record.setUpdateTime(new Date());
			record.setUpdateUser(getCurrentUserId());

			dao.updateByPrimaryKey(record);

			// 构造明细

			BusinessDetail bd = new BusinessDetail();
			bd.setBusinessId(bi.getId());
			bd.setChargeTypeKey(record.getChargeTypeKey());// 费用类型
			bd.setMerchantsKey(record.getContainerUser());// 客户名称
			bd.setSapid(record.getSapid());// sapid

			bd.setCurrencyType(bi.getCurrencyType());// 币种
			bd.setExchangeRate(bi.getExchangeRate());// 汇率

			bd.setTaxRate(bi.getTaxRate());// 初始化0

			if (!StringUtils.isEmpty(bi.getNotaxTotalCostRmb())) {// 不含税
				bd.setAmountRmb(bi.getNotaxTotalCostRmb());// 人民币
				bd.setAmountUsd(bi.getNotaxTotalCostUsd());// 美金
			} else {// 含税
				bd.setAmountRmb(bi.getTaxTotalCostRmb());// 人民币
				bd.setAmountUsd(bi.getTaxTotalCostUsd());// 美金
			}

//			bd.setBillType(FinanceBillTypeEnum.ZLZD.getCode());// 现场收费

			bd.setDeptKey(record.getDeptKey());// 通过场站查询得到 成本中心

			bd.setCreateTime(new Date());
			bd.setCreateUser(getCurrentUserId());
			bd.setIsDel(PlatformConstants.ISDEL_NO);
			bd.setIsEnabled(FinanceIsEnabledEnum.Enabled.getCode());
			bd.setFreeStatus(FinanceCostStatusEnum.COSTOK.getCode());// 明细状态 暂时存费用确认状态
			bd.setVersionNo(record.getVersionNo());
			bd.setBillCode(record.getBillCode());
			// 插入明细
			businessDetailDao.insert(bd);

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
			BillLease record = dao.selectByPrimaryKey(Integer.parseInt(ids[i]));
			// 已审核修改为待审核，同时删除商务结算模块未入账记录和明细
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
			// 根据主表id集合查询明细集合
			BusinessDetailExample bdetailexample = new BusinessDetailExample();
			bdetailexample.createCriteria().andBusinessIdIn(businessIds);
			List<BusinessDetail> detailList = businessDetailDao.selectByExample(bdetailexample);
			detailList = detailList.stream().map(d -> {
				d.setAmountRmb(d.getAmountRmb().negate());// 取相反数 得到负数值 人民币
				d.setAmountUsd(d.getAmountUsd().negate()); // 取相反数 得到负数值 美金
				return d;
			}).collect(Collectors.toList());
			// 开始插入负费用
			for (BusinessDetail businessDetail : detailList) {
				businessDetailDao.insert(businessDetail);
			}
			// 更新主表费用为0 同时状态改为待入账
			for (Business item : bList) {
//				item.setBillStatus(FinanceInBillStateEnum.UNINBILL.getCode());// 待入账
				item.setTaxAmountRmb(new BigDecimal(0.00));
				item.setTaxAmountUsd(new BigDecimal(0.00));
				item.setNotaxTotalCostRmb(new BigDecimal(0.00));
				item.setNotaxTotalCostUsd(new BigDecimal(0.00));
				businessDao.updateByPrimaryKey(item);
			}
			// 更新原账单调账状态为已冲回
			BillLeaseExample bsexample = new BillLeaseExample();
			bsexample.createCriteria().andBillIdIn(idList);
			List<BillLease> bsList = dao.selectByExample(bsexample);
			for (BillLease BillLease : bsList) {
				BillLease.setModifyBillStatus(FinanceModifyBillEnum.FullReturn.getCode());// 已重回
				BillLease.setModifyBillType(FinanceModifyBillTypeEnum.FullReturn.getCode());// 全额冲回
				BillLease.setUpdateTime(new Date());
				BillLease.setUpdateUser(getCurrentUserId());
				dao.updateByPrimaryKey(BillLease);
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
			BillLease record = dao.selectByPrimaryKey(Integer.parseInt(ids[i]));
			// 账单待审核改为已审核
			record.setBillStatus(FinanceBillStatusEnum.AUDITOR.getCode());
			record.setUpdateTime(new Date());
			record.setUpdateUser(getCurrentUserId());
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
			record.setUpdateTime(new Date());
			record.setUpdateUser(getCurrentUserId());

			dao.updateByPrimaryKey(record);
			// 构造主明细到商务结算
			Business bi = new Business();
//			bi.setBusinessCode(record.getBillCode());// 账单号
//			bi.setBusinessMonth(record.getBillMonth());// 月份
//			bi.setBillType(FinanceBillTypeEnum.ZLZD.getCode());// 现场收费
//			bi.setBillAuditorTime(new Date());// 审核日期
//			bi.setBillAuditor(getCurrentUserId());
			bi.setMerchantsKey(record.getContainerUser()); // 后期需求确定定表结构 用箱人
			bi.setSourceBillId(record.getBillId());// 原账单id
			bi.setSourceBillCode(record.getBillCode());// 原账单编号
			bi.setSourceTable("finance_bill_lease");// 原账单表
			bi.setCurrencyType(record.getRealCurrencyType());// 币种人民币
			BaseExchangeRateExample ere = new BaseExchangeRateExample();
			ere.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
					.andIsEnabledEqualTo(FinanceIsEnabledEnum.Enabled.getCode())
					.andRateYearMonthEqualTo(record.getBillMonth());// 人民币
			List<BaseExchangeRate> exchangeRateList = exchangeRateDao.selectByExample(ere);
			if (exchangeRateList != null && exchangeRateList.size() > 0) {
				bi.setExchangeRate(exchangeRateList.get(0).getExchangeRate());// 汇率 根据月份取汇率表
			} else {// 如果月份没有查询到数据，开始向前找
				ere = new BaseExchangeRateExample();
				ere.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
						.andIsEnabledEqualTo(FinanceIsEnabledEnum.Enabled.getCode());// 人民币
				ere.setOrderByClause(" `create_time` DESC");
				exchangeRateList = exchangeRateDao.selectByExample(ere);
				// 获取最近一条的汇率
				if (exchangeRateList != null && exchangeRateList.size() > 0) {
					bi.setExchangeRate(exchangeRateList.get(0).getExchangeRate());// 汇率 根据月份取汇率表
				} else {
					bi.setExchangeRate(new BigDecimal("0.00"));// 汇率 根据月份取汇率表
				}
			}

			bi.setNotaxTotalCostUsd(record.getRealNotaxTotalCostUsd());// 金额美金不含税
			bi.setNotaxTotalCostRmb(record.getRealNotaxTotalCostRmb());// 金额人民币不含税
			bi.setTaxTotalCostRmb(record.getRealTaxTotalCostRmb());
			bi.setTaxTotalCostUsd(record.getRealTaxTotalCostUsd());

			bi.setCreateTime(new Date());
			bi.setCreateUser(getCurrentUserId());
			bi.setIsDel(PlatformConstants.ISDEL_NO);
			bi.setIsEnabled(FinanceIsEnabledEnum.Enabled.getCode());

//			bi.setChargeTypeKey(record.getChargeTypeKey());// 费用类型
			bi.setTaxRate(record.getTaxRate());// 税率
			bi.setTaxAmountRmb(record.getTaxAmountRmb());// 税金人民币
			bi.setTaxAmountUsd(record.getTaxAmountUsd());// 税金美金

			// 保存主表信息
			businessDao.insert(bi);

			// 构造明细

			BusinessDetail bd = new BusinessDetail();
			bd.setBusinessId(bi.getId());
			bd.setChargeTypeKey(record.getChargeTypeKey());// 费用类型
			bd.setMerchantsKey(record.getContainerUser());// 客户名称
			bd.setSapid("");// sapid

			bd.setCurrencyType(bi.getCurrencyType());// 币种
			bd.setExchangeRate(bi.getExchangeRate());// 汇率

			bd.setTaxRate(bi.getTaxRate());// 初始化0

			if (!StringUtils.isEmpty(bi.getNotaxTotalCostRmb())) {// 不含税
				bd.setAmountRmb(bi.getNotaxTotalCostRmb());// 人民币
				bd.setAmountUsd(bi.getNotaxTotalCostUsd());// 美金
			} else {// 含税
				bd.setAmountRmb(bi.getTaxTotalCostRmb());// 人民币
				bd.setAmountUsd(bi.getTaxTotalCostUsd());// 美金
			}

//			bd.setBillType(FinanceBillTypeEnum.ZLZD.getCode());// 现场收费

			bd.setDeptKey(record.getDeptKey());// 通过场站查询得到 成本中心

			bd.setCreateTime(new Date());
			bd.setCreateUser(getCurrentUserId());
			bd.setIsDel(PlatformConstants.ISDEL_NO);
			bd.setIsEnabled(FinanceIsEnabledEnum.Enabled.getCode());
			bd.setFreeStatus(FinanceCostStatusEnum.COSTOK.getCode());// 明细状态 暂时存费用确认状态
			bd.setVersionNo(record.getVersionNo());
			bd.setBillCode(record.getBillCode());
			// 插入明细
			businessDetailDao.insert(bd);

		}
		return true;
	}

}
