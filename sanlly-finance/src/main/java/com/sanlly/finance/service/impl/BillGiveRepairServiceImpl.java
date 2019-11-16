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
import com.sanlly.common.models.input.finance.BillGiveRepairInput;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.company.CompanyOutput;
import com.sanlly.common.models.output.customerdeliver.CustomerDeliverDetailOutput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.models.output.user.UserInfoOutput;
import com.sanlly.common.utils.ComputeUtil;
import com.sanlly.finance.constants.FinanceConstants;
import com.sanlly.finance.dao.BaseChargeRateMapper;
import com.sanlly.finance.dao.BaseChargeTypeMapper;
import com.sanlly.finance.dao.BaseExchangeRateMapper;
import com.sanlly.finance.dao.BaseMerchantsMapper;
import com.sanlly.finance.dao.BaseTaxRateMapper;
import com.sanlly.finance.dao.BillGiveRepairMapper;
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
import com.sanlly.finance.entity.BillGiveRepair;
import com.sanlly.finance.entity.BillGiveRepairExample;
import com.sanlly.finance.entity.Business;
import com.sanlly.finance.entity.BusinessDetail;
import com.sanlly.finance.entity.BusinessDetailExample;
import com.sanlly.finance.entity.BusinessExample;
import com.sanlly.finance.models.input.BaseAuditDeptInput;
import com.sanlly.finance.models.input.BillInfoInput;
import com.sanlly.finance.models.input.RejectInput;
import com.sanlly.finance.models.input.SearchBaseInput;
import com.sanlly.finance.models.output.BillGiveRepairOutput;
import com.sanlly.finance.service.BaseAuditDeptService;
import com.sanlly.finance.service.BillGiveRepairService;
import com.sanlly.finance.service.feign.AuthFeignClient;
import com.sanlly.finance.service.feign.ProductionFeignClient;
import com.sanlly.finance.service.feign.WareHouseFeignClient;
import com.sanlly.finance.utils.DateUtils;

/**
 * 送修账单服务实现类
 * 
 * @Package com.sanlly.finance.service.impl 
 * @Description: TODO
 * @author fjy   
 * @date 2019年9月3日 下午2:56:58 
 * @version V1.0   
 */
@Service
public class BillGiveRepairServiceImpl extends BaseServiceImpl implements BillGiveRepairService {

	@Autowired
	private BillGiveRepairMapper dao;

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
	private WareHouseFeignClient wareHouseFeignClient;
	

	@Autowired
	private BaseMerchantsMapper merchantsDao;

	/**
	 * 查询分页
	 */
	@Override
	public PagedList<BillGiveRepairOutput> getPage(SearchBaseInput input) {
		// TODO Auto-generated method stub
		BillGiveRepairExample example = new BillGiveRepairExample();
		BillGiveRepairExample.Criteria criteria = example.createCriteria();

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
		PagedList<BillGiveRepairOutput> pagedList = new PagedList<BillGiveRepairOutput>(input.getPageIndex(), input.getPageSize(),
				totalCount);
		// 设置开始行数
		example.setLimitStart(pagedList.getLimitStart());
		// 设置结束行数
		example.setLimitEnd(pagedList.getLimitEnd());
		example.setOrderByClause(" `create_time` DESC");
		List<BillGiveRepair> list = dao.selectByExample(example);
		List<BillGiveRepairOutput> outputList = list.stream().map(a -> {// 创建日期倒序排列
			BillGiveRepairOutput output = new BillGiveRepairOutput();
			// 复制属性值到新对象
			BeanUtils.copyProperties(a, output);
			 output.setCompanyKeyNameLang(a.getCompanyKey());
			output.setYardNameLang(a.getYard());// 场站
			output.setModifyBillStatusNameLang(a.getModifyBillStatus());// 调账状态
			output.setModifyBillTypeNameLang(a.getModifyBillType());// 调账方式
			output.setIsEnabledNameLang(a.getIsEnabled());// 是否有效
			output.setBillStatusNameLang(a.getBillStatus());// 账单状态
 
				output.setIsDetail(true);
			 
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
	public Boolean createBill(List<BillGiveRepairInput> list) {
		// TODO Auto-generated method stub

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
			
			for (BillGiveRepairInput input : list) {
				BillGiveRepair main = new BillGiveRepair();
				BeanUtils.copyProperties(input, main);
				main.setCompanyKey(input.getCompanyKey());
				BaseSearchInput bsinput = new BaseSearchInput();
				bsinput.setCompanyKey(input.getCompanyKey().trim());
				List<CompanyOutput> companyList = productionFeignClient.companyList(bsinput).getData();
				String companyCode = "";
				if (companyList != null && companyList.size() > 0) {
					companyCode = companyList.get(0).getCompanyCode();
				}
				
				// 生成账单号
				main.setBillCode(
						getBillCode(FinanceBillTypeEnum.SXZD, FinanceBudgetTypeEnum.INCOME, companyCode));
				// 账单月份
				main.setBillMonth(yearMonth);
				main.setRealCurrencyType(FinanceCurrencyType.CNY.getCode());// 实收币种
				// 汇率
				main.setRealRate(realRate);
				// 根据汇率计算美金总金额
				main.setRealTaxTotalCostRmb(input.getRepairIncome());
				main.setRealTaxTotalCostUsa(ComputeUtil.div(main.getRealTaxTotalCostRmb(), main.getRealRate(), 2));
				
				//查询客户sapid
				if(StringUtils.isEmpty(input.getMerchantsKey())) {
					BaseMerchantsExample mexample=new BaseMerchantsExample();
					mexample.createCriteria().andMerchantsKeyEqualTo(input.getMerchantsKey());
					 
					List<BaseMerchants> bmList = merchantsDao.selectByExample(mexample);
					// 根据key 查询sapid
					if (bmList != null && bmList.size() > 0) {
						input.setSapid(bmList.get(0).getSapid());
					}
					 
				}
				 
				main.setCreateNode("备件维修收入产生");
				main.setVersionNo("0");
				main.setBillStatus(FinanceBillStatusEnum.NOAUDITOR.getCode());
				main.setIsDel(PlatformConstants.ISDEL_NO);
				main.setIsEnabled(FinanceIsEnabledEnum.Enabled.getCode());
				main.setCreateTime(new Date());
				main.setCreateUser(getCurrentUserId());
				
				main.setBusinessCategory("LKFIBTCATE000004");
				main.setBusinessType("LEFIBUSINESSTYPE01");
				main.setChargeTypeKey("LKFICHARGE000005");//备件维修收入
				// 费用类型 根据费用类型查询费用key
				BaseChargeTypeExample bctExample = new BaseChargeTypeExample();
				bctExample.createCriteria().andLangKeyEqualTo(main.getChargeTypeKey());
				List<BaseChargeType> bctList = chargeTypeDao.selectByExample(bctExample);
				// 得到费用key
				String chargeKey = "";
				if (bctList != null && bctList.size() > 0) {
					chargeKey = bctList.get(0).getChargeKey();
					main.setChargecode(bctList.get(0).getChargeCode());
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
						main.setTaxRate(bcr.getTaxRate());
						main.setTaxAmountRmb(ComputeUtil.mul(main.getRealTaxTotalCostRmb(), main.getTaxRate()));
						main.setTaxAmountUsd(ComputeUtil.mul(main.getRealTaxTotalCostUsa(), main.getTaxRate()));
						 
					}else {
						main.setTaxRate(FinanceConstants.taxRate);
						main.setTaxAmountRmb(ComputeUtil.mul(main.getRealTaxTotalCostRmb(), main.getTaxRate()));
						main.setTaxAmountUsd(ComputeUtil.mul(main.getRealTaxTotalCostUsa(), main.getTaxRate()));
					}
				}
				
				// 保存账单
				dao.insert(main);
			}
			
		}

		return true;
	}

	/**
	 * 添加
	 */
	@Override
	public Boolean add(BillGiveRepairInput input) {
		// TODO Auto-generated method stub
		BillGiveRepair record = new BillGiveRepair();
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
			BillGiveRepair info = dao.selectByPrimaryKey(input.getBillId());
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
			BillGiveRepair record = dao.selectByPrimaryKey(Integer.parseInt(input.getId()));
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
			BillGiveRepair record = dao.selectByPrimaryKey(Integer.parseInt(ids[i]));
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
	public Boolean Upadtes(List<BillGiveRepairInput> input) {
		// TODO Auto-generated method stub
		BillGiveRepair record = new BillGiveRepair();
		BeanUtils.copyProperties(input, record);
		if (input != null) {
			for (BillGiveRepairInput item : input) {
				if (item.getBillId() != null) {
					// 查询一下信息
					BillGiveRepair info = dao.selectByPrimaryKey(item.getBillId());
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
			BillGiveRepair record = dao.selectByPrimaryKey(Integer.parseInt(ids[i]));
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
			BillGiveRepair record = dao.selectByPrimaryKey(Integer.parseInt(ids[i]));
			// 构造主明细到商务结算
			Business bi = new Business();
			bi.setBillCode(record.getBillCode());// 账单号
			bi.setBillMonth(record.getBillMonth());// 月份
			bi.setBillType(FinanceBillTypeEnum.SXZD.getCode());// 现场收费
//			bi.setContainerUser(record.getContainerUser());
			bi.setMerchantsKey(record.getMerchantsKey());
			bi.setSapid(record.getSapid());

			bi.setExchangeRate(record.getRealRate());
			bi.setCurrencyType(FinanceCurrencyType.CNY.getCode());// 币种人民币

			bi.setTaxTotalCostRmb(record.getRealTaxTotalCostRmb());
			bi.setTaxTotalCostUsd(record.getRealTaxTotalCostUsa());
			bi.setTaxRate(record.getTaxRate());
			// 税金
			bi.setTaxAmountRmb(record.getTaxAmountRmb());
			bi.setTaxAmountUsd(record.getTaxAmountUsd());

			bi.setSourceBillId(record.getBillId());// 原账单id
			bi.setSourceBillCode(record.getBillCode());// 原账单编号
			bi.setSourceTable("finance_bill_giverepair");// 原账单表
			bi.setCurrencyType(FinanceCurrencyType.CNY.getCode());// 币种人民币

			bi.setVersionNo(record.getVersionNo());
			bi.setChargeInoutType(FinanceBudgetTypeEnum.INCOME.getCode());
			bi.setCreateTime(new Date());
			bi.setCreateUser(getCurrentUserId());
			bi.setIsDel(PlatformConstants.ISDEL_NO);
			bi.setIsEnabled(FinanceIsEnabledEnum.Enabled.getCode());
			bi.setCreateBillUser(bi.getCreateUser());
			// 保存主表信息
			businessDao.insert(bi);
			
			List<CustomerDeliverDetailOutput> detailBsList=  wareHouseFeignClient.getCustomerDeliverDetailOutputs(record.getDeliverId()).getData();
			 
			// 开始分类汇总
			for (CustomerDeliverDetailOutput bsd : detailBsList) {
				  
				BusinessDetail bd = new BusinessDetail();
				bd.setBusinessId(bi.getId());
				bd.setBillCode(record.getBillCode());

				bd.setChargeTypeKey(record.getChargeTypeKey());// 费用类型
				bd.setMerchantsKey(bi.getMerchantsKey());// 客户名称
				bd.setSapid(bi.getSapid());// sapid
//				bd.setContainerUser(bsd.getContainerUser());
				bd.setCurrencyType(bi.getCurrencyType());// 币种
				bd.setExchangeRate(bi.getExchangeRate());// 汇率

				bd.setTaxRate(record.getTaxRate());

				bd.setTaxAmount(ComputeUtil.mul(bd.getTaxRate(), bsd.getRepairIncome()==null ? new BigDecimal(0):bsd.getRepairIncome()));// 税额
				bd.setAmountRmb(bsd.getRepairIncome());// 人民币
				bd.setAmountUsd(ComputeUtil.div(bsd.getRepairIncome()==null ? new BigDecimal(0):bsd.getRepairIncome(), bd.getExchangeRate(), 2));// 美金
				bd.setRemarks(bsd.getRemark());
				// 核算部门查询
				BaseAuditDeptInput badInput = new BaseAuditDeptInput();
				// 场站
				badInput.setYard(record.getYard());
//				// 箱类别
//				badInput.setContainerCategory(bsd.getContainerCategory());
				// 费用类型
				badInput.setChargeKey(record.getChargeTypeKey());

				BaseAuditDept baDept = baseAuditDeptService.getInfo(badInput);
				if (baDept != null) {
					bd.setDeptKey(baDept.getCostDept());// 通过场站查询得到 成本中心
					bd.setDeptCode(baDept.getCostCenterCode());
				}
				bd.setVersionNo(bi.getVersionNo());
				// 根据场站获取公司
				 
				bd.setCompanyKey(record.getCompanyKey());
				bd.setYard(record.getYard());
				bd.setChargeInoutType(bi.getChargeInoutType());
				bd.setInterfaceType(FinanceInterfaceTypeEnum.InterfaceType01.getCode());
				bd.setLegacyDocType(FinanceLegacyTypeEnum.LegacyType01.getMessage());// 中文
//				bd.setInvoiceType(FinanceInvoiceTypeEnum.Invoice01.);//收入没有发票类型
				bd.setBillMonth(record.getBillMonth());
//				bd.setContainerUser(record.getContainerUser());
				bd.setSourceTable("finance_bill_giverepair");
				bd.setSourceBillCode(record.getBillCode());
				bd.setSourceBillId(record.getBillId());
				// 净额 全部金额减去 税收

				bd.setNetAmount(ComputeUtil.sub(bd.getAmountRmb()==null ? new BigDecimal(0) : bd.getAmountRmb() ,
						bd.getTaxAmount() == null ? new BigDecimal(0) : bd.getTaxAmount()));
				bd.setBillAuditor(getCurrentUserId());
				bd.setBillAuditorTime(new Date());
				bd.setNumber(new BigDecimal(bsd.getNum()));
				bd.setCreateBillUser(record.getCreateUser());

				bd.setCreateTime(new Date());
				bd.setCreateUser(getCurrentUserId());

				bd.setIsDel(PlatformConstants.ISDEL_NO);
				bd.setIsEnabled(FinanceIsEnabledEnum.Enabled.getCode());
				bd.setFreeStatus(FinanceInBillStateEnum.UNINBILL.getCode());//未入账
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
			BillGiveRepair record = dao.selectByPrimaryKey(Integer.parseInt(ids[i]));
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
			BillGiveRepairExample bsexample = new BillGiveRepairExample();
			bsexample.createCriteria().andBillIdIn(idList);
			List<BillGiveRepair> bsList = dao.selectByExample(bsexample);
			for (BillGiveRepair repari : bsList) {
				repari.setModifyBillStatus(FinanceModifyBillEnum.FullReturn.getCode());// 已重回
				repari.setModifyBillType(FinanceModifyBillTypeEnum.FullReturn.getCode());// 全额冲回
				repari.setUpdateTime(new Date());
				repari.setUpdateUser(getCurrentUserId());
				repari.setVersionNo((Integer.parseInt(repari.getVersionNo()) + 1) + "");
				dao.updateByPrimaryKey(repari);
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
			BillGiveRepair record = dao.selectByPrimaryKey(Integer.parseInt(ids[i]));
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
			bi.setBillCode(record.getBillCode());// 账单号
			bi.setBillMonth(record.getBillMonth());// 月份
			bi.setBillType(FinanceBillTypeEnum.SXZD.getCode());// 现场收费
//			bi.setContainerUser(record.getContainerUser());
			bi.setMerchantsKey(record.getMerchantsKey());
			bi.setSapid(record.getSapid());

			bi.setExchangeRate(record.getRealRate());
			bi.setCurrencyType(FinanceCurrencyType.CNY.getCode());// 币种人民币

			bi.setTaxTotalCostRmb(record.getRealTaxTotalCostRmb());
			bi.setTaxTotalCostUsd(record.getRealTaxTotalCostUsa());
			bi.setTaxRate(record.getTaxRate());
			// 税金
			bi.setTaxAmountRmb(record.getTaxAmountRmb());
			bi.setTaxAmountUsd(record.getTaxAmountUsd());

			bi.setSourceBillId(record.getBillId());// 原账单id
			bi.setSourceBillCode(record.getBillCode());// 原账单编号
			bi.setSourceTable("finance_bill_giverepair");// 原账单表
			bi.setCurrencyType(FinanceCurrencyType.CNY.getCode());// 币种人民币

			bi.setVersionNo(record.getVersionNo());
			bi.setChargeInoutType(FinanceBudgetTypeEnum.INCOME.getCode());
			bi.setCreateTime(new Date());
			bi.setCreateUser(getCurrentUserId());
			bi.setIsDel(PlatformConstants.ISDEL_NO);
			bi.setIsEnabled(FinanceIsEnabledEnum.Enabled.getCode());
			bi.setCreateBillUser(bi.getCreateUser());

			// 保存主表信息
			businessDao.updateByPrimaryKey(bi);

			List<CustomerDeliverDetailOutput> detailBsList= (List<CustomerDeliverDetailOutput>) wareHouseFeignClient.getCustomerDeliverDetailOutputs(record.getDeliverId()).getData();
			 
			// 开始分类汇总
			for (CustomerDeliverDetailOutput bsd : detailBsList) {
				  
				BusinessDetail bd = new BusinessDetail();
				bd.setBusinessId(bi.getId());
				bd.setBillCode(record.getBillCode());

				bd.setChargeTypeKey(record.getChargeTypeKey());// 费用类型
				bd.setMerchantsKey(bi.getMerchantsKey());// 客户名称
				bd.setSapid(bi.getSapid());// sapid
//				bd.setContainerUser(bsd.getContainerUser());
				bd.setCurrencyType(bi.getCurrencyType());// 币种
				bd.setExchangeRate(bi.getExchangeRate());// 汇率

				bd.setTaxRate(record.getTaxRate());

				bd.setTaxAmount(ComputeUtil.mul(bd.getTaxRate(), bsd.getRepairIncome()));// 税额
				bd.setAmountRmb(bsd.getRepairIncome());// 人民币
				bd.setAmountUsd(ComputeUtil.div(bsd.getRepairIncome(), bd.getExchangeRate(), 2));// 美金
				bd.setRemarks(bsd.getRemark());
				// 核算部门查询
				BaseAuditDeptInput badInput = new BaseAuditDeptInput();
				// 场站
				badInput.setYard(record.getYard());
//				// 箱类别
//				badInput.setContainerCategory(bsd.getContainerCategory());
				// 费用类型
				badInput.setChargeKey(record.getChargeTypeKey());

				BaseAuditDept baDept = baseAuditDeptService.getInfo(badInput);
				if (baDept != null) {
					bd.setDeptKey(baDept.getCostDept());// 通过场站查询得到 成本中心
					bd.setDeptCode(baDept.getCostCenterCode());
				}
				bd.setVersionNo(bi.getVersionNo());
				// 根据场站获取公司
				 
				bd.setCompanyKey(record.getCompanyKey());
				bd.setYard(record.getYard());
				bd.setChargeInoutType(bi.getChargeInoutType());
				bd.setInterfaceType(FinanceInterfaceTypeEnum.InterfaceType01.getCode());
				bd.setLegacyDocType(FinanceLegacyTypeEnum.LegacyType01.getMessage());// 中文
//				bd.setInvoiceType(FinanceInvoiceTypeEnum.Invoice01.);//收入没有发票类型
				bd.setBillMonth(record.getBillMonth());
//				bd.setContainerUser(record.getContainerUser());
				bd.setSourceTable("finance_bill_giverepair");
				bd.setSourceBillCode(record.getBillCode());
				bd.setSourceBillId(record.getBillId());
				// 净额 全部金额减去 税收

				bd.setNetAmount(ComputeUtil.sub(bd.getAmountRmb(),
						bd.getTaxAmount() == null ? new BigDecimal(0) : bd.getTaxAmount()));
				bd.setBillAuditor(getCurrentUserId());
				bd.setBillAuditorTime(new Date());
				bd.setNumber(new BigDecimal(bsd.getNum()));
				bd.setCreateBillUser(record.getCreateUser());

				bd.setCreateTime(new Date());
				bd.setCreateUser(getCurrentUserId());

				bd.setIsDel(PlatformConstants.ISDEL_NO);
				bd.setIsEnabled(FinanceIsEnabledEnum.Enabled.getCode());
				bd.setFreeStatus(FinanceInBillStateEnum.UNINBILL.getCode());//未入账
				bd.setVersionNo(record.getVersionNo());
				bd.setBillCode(record.getBillCode());
				// 插入明细
				businessDetailDao.insert(bd);
 
			}
		}
		return true;
	}

	

	/**
	 * 调账驳回
	 */
	@Override
	public Boolean billFullAdjustmentReturn(String[] ids) {
		// TODO Auto-generated method stub
		BillGiveRepairExample example = new BillGiveRepairExample();
		List<Integer> idList = Arrays.asList(ids).stream().map(a -> Integer.parseInt(a)).collect(Collectors.toList());
		example.createCriteria().andBillIdIn(idList);
		List<BillGiveRepair> list = dao.selectByExample(example);
		for (BillGiveRepair record : list) {
			// 调账驳回
//			record.setVersionNo((Integer.parseInt(record.getVersionNo())+1)+"");//版本+1
			record.setModifyBillStatus(FinanceModifyBillEnum.AdjustmentReturn.getCode());
			dao.updateByPrimaryKey(record);
		}
		return true;
	}

	/**
	 * 账单主信息编辑
	 */
	@Override
	public Boolean billEdit(BillInfoInput input) {
		// TODO Auto-generated method stub
		if (input != null && input.getBillId() != null) {
			BillGiveRepair record = dao.selectByPrimaryKey(input.getBillId());
			BeanUtils.copyProperties(input, record);
			dao.updateByPrimaryKey(record);
		}
		return true;
	}
}
