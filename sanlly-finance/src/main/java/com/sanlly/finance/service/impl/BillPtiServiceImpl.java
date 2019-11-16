package com.sanlly.finance.service.impl;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
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
import com.sanlly.common.models.input.finance.PoolPtiInput;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.base.ContainerUserOutput;
import com.sanlly.common.models.output.company.CompanyOutput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.models.output.user.UserInfoOutput;
import com.sanlly.common.utils.ComputeUtil;
import com.sanlly.finance.dao.BaseChargeRateMapper;
import com.sanlly.finance.dao.BaseChargeTypeMapper;
import com.sanlly.finance.dao.BaseDiscountMapper;
import com.sanlly.finance.dao.BaseExchangeRateMapper;
import com.sanlly.finance.dao.BaseTaxRateMapper;
import com.sanlly.finance.dao.BillPtiDetailMapper;
import com.sanlly.finance.dao.BillPtiMapper;
import com.sanlly.finance.dao.BusinessDetailMapper;
import com.sanlly.finance.dao.BusinessMapper;
import com.sanlly.finance.dao.PoolOutSourceRepairMapper;
import com.sanlly.finance.dao.PoolPtiMapper;
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
import com.sanlly.finance.entity.BillPti;
import com.sanlly.finance.entity.BillPtiDetail;
import com.sanlly.finance.entity.BillPtiDetailExample;
import com.sanlly.finance.entity.BillPtiExample;
import com.sanlly.finance.entity.BillScene;
import com.sanlly.finance.entity.BillSceneExample;
import com.sanlly.finance.entity.Business;
import com.sanlly.finance.entity.BusinessDetail;
import com.sanlly.finance.entity.BusinessDetailExample;
import com.sanlly.finance.entity.BusinessExample;
import com.sanlly.finance.entity.PoolOutSourceRepairExample;
import com.sanlly.finance.entity.PoolPti;
import com.sanlly.finance.entity.PoolPtiExample;
import com.sanlly.finance.enums.ContainerCategoryEnum;
import com.sanlly.finance.models.input.BaseAuditDeptInput;
import com.sanlly.finance.models.input.BillInfoInput;
import com.sanlly.finance.models.input.BillPtiInput;
import com.sanlly.finance.models.input.RejectInput;
import com.sanlly.finance.models.input.SearchBaseInput;
import com.sanlly.finance.models.output.BillPtiDetailOutput;
import com.sanlly.finance.models.output.BillPtiOutput;
import com.sanlly.finance.models.output.PoolPtiOutput;
import com.sanlly.finance.service.BaseAuditDeptService;
import com.sanlly.finance.service.BillPtiService;
import com.sanlly.finance.service.PoolOutSourceRepairService;
import com.sanlly.finance.service.PoolSourceRepairService;
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
public class BillPtiServiceImpl extends BaseServiceImpl implements BillPtiService {

	@Autowired
	private BillPtiMapper dao;

	@Autowired
	private BillPtiDetailMapper daoDetail;

	@Autowired
	private PoolPtiMapper daoPool;

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
	private BaseDiscountMapper discountDao;

	@Autowired
	private PoolOutSourceRepairService poolOutSourceRepairService;
	
	@Autowired
	private PoolSourceRepairService poolSourceRepairService;

	@Autowired
	private PoolOutSourceRepairMapper poolOutSourcedao;

	@Autowired
	private BaseAuditDeptService baseAuditDeptService;

	/**
	 * 查询分页
	 */
	@Override
	public PagedList<BillPtiOutput> getPage(SearchBaseInput input) {
		// TODO Auto-generated method stub
		BillPtiExample example = new BillPtiExample();
		BillPtiExample.Criteria criteria = example.createCriteria();
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
		PagedList<BillPtiOutput> pagedList = new PagedList<BillPtiOutput>(input.getPageIndex(),
				input.getPageSize(), totalCount);
		// 设置开始行数
		example.setLimitStart(pagedList.getLimitStart());
		// 设置结束行数
		example.setLimitEnd(pagedList.getLimitEnd());
		example.setOrderByClause(" `create_time` DESC");
		List<BillPti> list = dao.selectByExample(example);
		List<BillPtiOutput> outputList = list.stream().map(a -> {// 创建日期倒序排列
			BillPtiOutput output = new BillPtiOutput();
			// 复制属性值到新对象
			BeanUtils.copyProperties(a, output);

			output.setContainerCategoryNameLang(a.getContainerCategory());// 箱类别
//			output.setContainerTypeNameLang(a.getContainerType());// 箱类型
			output.setModifyBillStatusNameLang(a.getModifyBillStatus());// 调账状态
			output.setModifyBillTypeNameLang(a.getModifyBillType());// 调账方式
			output.setIsEnabledNameLang(a.getIsEnabled());// 是否有效
			output.setBillStatusNameLang(a.getBillStatus());// 账单状态
			output.setMerchantsNameLang(a.getMerchantsKey());// 客商名称
			output.setContainerUserNameLang(a.getContainerUser());
			output.setBusinessCategoryNameLang(a.getBusinessCategory());
			output.setBusinessTypeNameLang(a.getBusinessType());
			// 查看是否有明细
			BillPtiDetailExample detailEx = new BillPtiDetailExample();
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
	public Boolean createBill(BillPtiInput input) {
		// TODO Auto-generated method stub
//		FinanceBillTypeEnum billTypeEnum,FinanceBudgetTypeEnum inoutEnum,String companyCode
		// 1、获取账单类型 现场收费账单
		// 2、收支类型 收入
		// 3、公司代码 根据公司Key 或者场站查询公司代码
		if (input != null && !StringUtils.isEmpty(input.getBillId())) {

			BillPti record = dao.selectByPrimaryKey(input.getBillId());
			record.setChargecode(input.getChargecode());
			record.setChargeTypeKey(input.getChargeTypeKey());
			record.setBillMonth(input.getBillMonth());
			record.setTaxRate(input.getTaxRate());
			record.setRealRate(input.getRealRate());
			record.setMerchantsKey(input.getMerchantsKey());
			record.setSapid(input.getSapid());
			record.setBillRemark(input.getBillRemark());
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
			if (input.getChargeInoutType().equals(FinanceBudgetTypeEnum.INCOME.getCode())) {// 收入
				// 生成账单号
				input.setBillCode(getBillCode(FinanceBillTypeEnum.PTIZD, FinanceBudgetTypeEnum.INCOME, companyCode));
				input.setCreateNode("PTI收入产生");
//				input.setBusinessType(FinanceBusinessTypeEnum.BusinessType2.getCode());//干箱
//				input.setBusinessCategory("LKFIBTCATE000005");//干箱维修

			} else {// 成本
					// 生成账单号
				input.setBillCode(getBillCode(FinanceBillTypeEnum.PTIZD, FinanceBudgetTypeEnum.EXPENDITURE, companyCode));
				input.setCreateNode("PTI成本产生");
//				input.setBusinessType(FinanceBusinessTypeEnum.BusinessType1.getCode());//干箱
//				input.setBusinessCategory("LKFIBTCATE000001");//冷箱机组维修
			}

			input.setVersionNo("0");
			input.setBillStatus(FinanceBillStatusEnum.CREATE.getCode());
			input.setIsDel(PlatformConstants.ISDEL_NO);
			input.setIsEnabled(FinanceIsEnabledEnum.Enabled.getCode());
			input.setCreateTime(new Date());
			input.setCreateUser(getCurrentUserId());

			BillPti record = new BillPti();
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
	public Boolean add(BillPtiInput input) {
		// TODO Auto-generated method stub
		BillPti record = new BillPti();
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
			BillPti info = dao.selectByPrimaryKey(input.getBillId());
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
			BillPti record = dao.selectByPrimaryKey(Integer.parseInt(input.getId()));
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
	 * 批量删除 已生成 且没有明细 可以删除，
	 */
	@Override
	public Boolean deletes(String[] ids) {
		// TODO Auto-generated method stub
		for (int i = 0; i < ids.length; i++) {
			BillPti record = dao.selectByPrimaryKey(Integer.parseInt(ids[i]));
			BillPtiDetailExample example = new BillPtiDetailExample();
			example.createCriteria().andBillIdEqualTo(record.getBillId());
			long count = daoDetail.countByExample(example);
			if (!record.getBillStatus().equals(FinanceBillStatusEnum.CREATE.getCode()) || count == 0) {
				record.setIsDel(PlatformConstants.ISDEL_YES);
				record.setUpdateTime(new Date());
				record.setUpdateUser(getCurrentUserId());
				dao.updateByPrimaryKey(record);
			}

		}
		return true;
	}

	/**
	 * 批量修改
	 */
	@Override
	public Boolean Upadtes(List<BillPtiInput> input) {
		// TODO Auto-generated method stub

		if (input != null) {
			for (BillPtiInput item : input) {
				if (item.getBillId() != null) {
					BillPti main = new BillPti();

					// 查询一下信息
					BillPti info = dao.selectByPrimaryKey(item.getBillId());
					// 已审核不能修改
					if (info.getBillStatus() != null
							&& !info.getBillStatus().equals(FinanceBillStatusEnum.AUDITOR.getCode())) {
						BeanUtils.copyProperties(info, main);
//						BeanUtils.copyProperties(item, main);
						   
						main.setRealTaxTotalCostUsa(item.getRealTaxTotalCostUsa());
						main.setRealNotaxTotalCostUsa(item.getRealNotaxTotalCostUsa());
						main.setRealTaxTotalCostRmb(item.getRealTaxTotalCostRmb());
						main.setRealNotaxTotalCostRmb(item.getRealNotaxTotalCostRmb());
 
						main.setUpdateTime(new Date());
						main.setUpdateUser(getCurrentUserId());
						dao.updateByPrimaryKey(main);
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
			BillPti record = dao.selectByPrimaryKey(Integer.parseInt(ids[i]));
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
			BillPti record = dao.selectByPrimaryKey(Integer.parseInt(ids[i]));
			// 构造主明细到商务结算
			Business bi = new Business();
			bi.setBillCode(record.getBillCode());// 账单号
			bi.setBillMonth(record.getBillMonth());// 月份
			bi.setBillType(FinanceBillTypeEnum.PTIZD.getCode());// 现场收费
			bi.setContainerUser(record.getContainerUser());
			bi.setMerchantsKey(record.getMerchantsKey());
			bi.setSapid(record.getSapid());

			bi.setExchangeRate(record.getRealRate());
			bi.setCurrencyType(record.getRealCurrencyType());// 币种

			  
			bi.setMerchantsKey(record.getMerchantsKey()); // 后期需求确定定表结构 用箱人
			bi.setSapid(record.getSapid());
			bi.setSourceBillId(record.getBillId());// 原账单id
			bi.setSourceBillCode(record.getBillCode());// 原账单编号
			bi.setSourceTable("finance_bill_pti");// 原账单表
			bi.setCurrencyType(record.getRealCurrencyType());// 币种人民币

			bi.setTaxTotalCostRmb(record.getRealTaxTotalCostRmb());
			bi.setTaxTotalCostUsd(record.getRealTaxTotalCostUsa());
			bi.setNotaxTotalCostRmb(record.getRealNotaxTotalCostRmb());
			bi.setNotaxTotalCostUsd(record.getRealNotaxTotalCostUsa());
			bi.setTaxRate(record.getTaxRate());

			bi.setTaxAmountRmb(record.getTaxAmountRbm());
			bi.setTaxAmountUsd(record.getTaxAmountUsa());

			// 税率的数据在下面通过明细计算得出 然后更新到这个数据中
//			bi.setTaxRate(taxRate);//根据费用类型获取税率表  子表有这个字段，这里不需要
//			bi.setTaxAmountUsd(taxAmountUsd);//税金美金  子表合计
//			bi.setTaxAmountRmb(taxAmountRmb);//税金人民币 子表合计
//			bi.setTaxTotalCostRmb(record.getTaxAmountRbm());
//			bi.setTaxAmountUsd(record.getTaxAmountUsa());
//			bi.setNotaxTotalCostUsd(record.getRealNotaxTotalCostUsa());// 金额美金不含税
//			bi.setNotaxTotalCostRmb(record.getRealNotaxTotalCostRmb());// 金额人民币不含税

			bi.setVersionNo(record.getVersionNo());
			bi.setChargeInoutType(record.getChargeInoutType());// 收支类型
			bi.setCreateTime(new Date());
			bi.setCreateUser(getCurrentUserId());
			bi.setIsDel(PlatformConstants.ISDEL_NO);
			bi.setIsEnabled(FinanceIsEnabledEnum.Enabled.getCode());
			bi.setCreateBillUser(record.getCreateUser());
			// 保存主表信息
			businessDao.insert(bi);
			// 构造明细
			BillPtiDetailExample detailBS = new BillPtiDetailExample();
			detailBS.createCriteria().andBillIdEqualTo(record.getBillId());
			List<BillPtiDetail> detailBsList = daoDetail.selectByExample(detailBS);

			// 按核算部门  汇总
			Map<String, List<BillPtiDetail>> menuGroupMap = detailBsList.stream()
					.collect(Collectors.groupingBy(g -> g.getDeptKey()));
//			BigDecimal tmptaxRate = new BigDecimal(0.00);
//			BigDecimal tmptaxAmountUsd = new BigDecimal(0.00);
//			BigDecimal tmptaxAmountRmb = new BigDecimal(0.00);
			// 开始分类汇总
			for (String key : menuGroupMap.keySet()) {
				List<BillPtiDetail> item = (List<BillPtiDetail>) menuGroupMap.get(key);
				// 求和
				Double rmb = item.stream().map(x -> {
					if (x.getRealCost() == null) {
						return 0.00;
					} else {
						return x.getRealCost().doubleValue();
					}
				}).reduce(0.00, Double::sum);
				 

				BillPtiDetail bsd = item.get(0);

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
//				 得到费用key
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

				
					bd.setTaxAmount(ComputeUtil.mul(bd.getTaxRate() == null ? new BigDecimal(0.00) : bd.getTaxRate(),
							new BigDecimal(rmb)));// 税额
					bd.setAmountRmb(new BigDecimal(rmb));// 人民币
					bd.setAmountUsd(ComputeUtil.div(new BigDecimal(rmb), bd.getExchangeRate(), 2));// 美金
				

				// 求和汇总 用于更新到主表
//				tmptaxAmountRmb = ComputeUtil.add(tmptaxAmountRmb, bd.getAmountRmb());
//				tmptaxAmountUsd = ComputeUtil.add(tmptaxAmountUsd, bd.getAmountUsd());
				// 求和汇总 用于更新到主表

				// 根据场站获取公司
				String companyKey = productionFeignClient.queryByKey(bsd.getYard()).getData().getCompany();
				bd.setCompanyKey(companyKey);
				bd.setYard(bsd.getYard());
				bd.setChargeInoutType(bi.getChargeInoutType());
				if(bi.getChargeInoutType().equals(FinanceBudgetTypeEnum.EXPENDITURE.getCode())) {//如果是收入
					bd.setInvoiceType(null);
					bd.setInterfaceType(FinanceInterfaceTypeEnum.InterfaceType01.getCode());
					bd.setLegacyDocType(FinanceLegacyTypeEnum.LegacyType01.getMessage());// 中文
				}else {
					bd.setInvoiceType(record.getInvoiceType()==null ? FinanceInvoiceTypeEnum.Invoice02.getMessage(): record.getInvoiceType());
					bd.setInterfaceType(FinanceInterfaceTypeEnum.InterfaceType04.getCode());
					bd.setLegacyDocType(FinanceLegacyTypeEnum.LegacyType03.getMessage());// 中文
				}
				
				bd.setBillMonth(record.getBillMonth());
				bd.setContainerUser(bsd.getContainerUser());
				bd.setSourceTable("finance_bill_pti");
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
			BillPti record = dao.selectByPrimaryKey(Integer.parseInt(ids[i]));
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
			BillPtiExample bsexample = new BillPtiExample();
			bsexample.createCriteria().andBillIdIn(idList);
			List<BillPti> bsList = dao.selectByExample(bsexample);
			for (BillPti BillPti : bsList) {
				BillPti.setModifyBillStatus(FinanceModifyBillEnum.FullReturn.getCode());// 已重回
				BillPti.setModifyBillType(FinanceModifyBillTypeEnum.FullReturn.getCode());// 全额冲回
				BillPti.setUpdateTime(new Date());
				BillPti.setUpdateUser(getCurrentUserId());
				BillPti.setVersionNo((Integer.parseInt(BillPti.getVersionNo()) + 1) + "");
				dao.updateByPrimaryKey(BillPti);
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
			BillPti record = dao.selectByPrimaryKey(Integer.parseInt(ids[i]));
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
			// 构造主明细到商务结算
			bi.setBillCode(record.getBillCode());// 账单号
			bi.setBillMonth(record.getBillMonth());// 月份
			bi.setBillType(FinanceBillTypeEnum.PTIZD.getCode());// 现场收费
			bi.setContainerUser(record.getContainerUser());
			bi.setMerchantsKey(record.getMerchantsKey());
			bi.setSapid(record.getSapid());

			bi.setExchangeRate(record.getRealRate());
			bi.setCurrencyType(record.getRealCurrencyType());// 币种

			  
			bi.setMerchantsKey(record.getMerchantsKey()); // 后期需求确定定表结构 用箱人
			bi.setSapid(record.getSapid());
			bi.setSourceBillId(record.getBillId());// 原账单id
			bi.setSourceBillCode(record.getBillCode());// 原账单编号
			bi.setSourceTable("finance_bill_pti");// 原账单表
			bi.setCurrencyType(record.getRealCurrencyType());// 币种人民币

			bi.setTaxTotalCostRmb(record.getRealTaxTotalCostRmb());
			bi.setTaxTotalCostUsd(record.getRealTaxTotalCostUsa());
			bi.setNotaxTotalCostRmb(record.getRealNotaxTotalCostRmb());
			bi.setNotaxTotalCostUsd(record.getRealNotaxTotalCostUsa());
			bi.setTaxRate(record.getTaxRate());

			bi.setTaxAmountRmb(record.getTaxAmountRbm());
			bi.setTaxAmountUsd(record.getTaxAmountUsa());

			bi.setVersionNo(record.getVersionNo());
			bi.setChargeInoutType(record.getChargeInoutType());// 收支类型
			bi.setCreateTime(new Date());
			bi.setCreateUser(getCurrentUserId());
			bi.setIsDel(PlatformConstants.ISDEL_NO);
			bi.setIsEnabled(FinanceIsEnabledEnum.Enabled.getCode());
			bi.setCreateBillUser(record.getCreateUser());

			// 保存主表信息
			businessDao.updateByPrimaryKey(bi);
 
			// 构造明细
						BillPtiDetailExample detailBS = new BillPtiDetailExample();
						detailBS.createCriteria().andBillIdEqualTo(record.getBillId());
						List<BillPtiDetail> detailBsList = daoDetail.selectByExample(detailBS);

						// 按核算部门  汇总
						Map<String, List<BillPtiDetail>> menuGroupMap = detailBsList.stream()
								.collect(Collectors.groupingBy(g -> g.getDeptKey()));
//						BigDecimal tmptaxRate = new BigDecimal(0.00);
//						BigDecimal tmptaxAmountUsd = new BigDecimal(0.00);
//						BigDecimal tmptaxAmountRmb = new BigDecimal(0.00);
						// 开始分类汇总
						for (String key : menuGroupMap.keySet()) {
							List<BillPtiDetail> item = (List<BillPtiDetail>) menuGroupMap.get(key);
							// 求和
							Double rmb = item.stream().map(x -> {
								if (x.getRealCost() == null) {
									return 0.00;
								} else {
									return x.getRealCost().doubleValue();
								}
							}).reduce(0.00, Double::sum);
							 

							BillPtiDetail bsd = item.get(0);

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

							
								bd.setTaxAmount(ComputeUtil.mul(bd.getTaxRate() == null ? new BigDecimal(0.00) : bd.getTaxRate(),
										new BigDecimal(rmb)));// 税额
								bd.setAmountRmb(new BigDecimal(rmb));// 人民币
								bd.setAmountUsd(ComputeUtil.div(new BigDecimal(rmb), bd.getExchangeRate(), 2));// 美金
							

							// 求和汇总 用于更新到主表
//							tmptaxAmountRmb = ComputeUtil.add(tmptaxAmountRmb, bd.getAmountRmb());
//							tmptaxAmountUsd = ComputeUtil.add(tmptaxAmountUsd, bd.getAmountUsd());
							// 求和汇总 用于更新到主表

							// 根据场站获取公司
							String companyKey = productionFeignClient.queryByKey(bsd.getYard()).getData().getCompany();
							bd.setCompanyKey(companyKey);
							bd.setYard(bsd.getYard());
							bd.setChargeInoutType(bi.getChargeInoutType());
							if(bi.getChargeInoutType().equals(FinanceBudgetTypeEnum.EXPENDITURE.getCode())) {//如果是收入
								bd.setInvoiceType(null);
								bd.setInterfaceType(FinanceInterfaceTypeEnum.InterfaceType01.getCode());
								bd.setLegacyDocType(FinanceLegacyTypeEnum.LegacyType02.getMessage());// 中文
							}else {
								bd.setInvoiceType(record.getInvoiceType()==null ? FinanceInvoiceTypeEnum.Invoice02.getMessage(): record.getInvoiceType());
								bd.setInterfaceType(FinanceInterfaceTypeEnum.InterfaceType04.getCode());
								bd.setLegacyDocType(FinanceLegacyTypeEnum.LegacyType03.getMessage());// 中文
							}
							  
				bd.setBillMonth(record.getBillMonth());
				bd.setContainerUser(bsd.getContainerUser());
				bd.setSourceTable("finance_bill_pti");
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

		}

		return true;
	}

	/**
	 * 账单明细查询
	 */
	@Override
	public List<BillPtiDetailOutput> listDetail(SearchBaseInput input) {
		// TODO Auto-generated method stub
		BillPtiDetailExample example = new BillPtiDetailExample();
		BillPtiDetailExample.Criteria criteria = example.createCriteria();
		// 过滤掉删除的记录
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO)
				.andIsEnabledEqualTo(FinanceIsEnabledEnum.Enabled.getCode());
		// 账单主键
		if (input.getPid() != null) {
			criteria.andBillIdEqualTo(input.getPid());
		}

		example.setOrderByClause(" `create_time` DESC");
		List<BillPtiDetail> list = daoDetail.selectByExample(example);
		List<BillPtiDetailOutput> outputList = list.stream().map(a -> {// 创建日期倒序排列
			BillPtiDetailOutput output = new BillPtiDetailOutput();
			// 复制属性值到新对象
			BeanUtils.copyProperties(a, output);

			output.setContainerCategoryNameLang(a.getContainerCategory());// 箱类别
			 
			output.setChargeTypeKeyNameLang(a.getChargeTypeKey());// 费用类型
			output.setYardNameLang(a.getYard());// 场站
			output.setContainerUserNameLang(a.getContainerUser());// 用箱人
			output.setFreeStatusNameLang(a.getFreeStatus());// 费用状态
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
	public List<PoolPtiOutput> listPoolDetail(SearchBaseInput input) {
		// TODO Auto-generated method stub
		PoolPtiExample example = new PoolPtiExample();
		PoolPtiExample.Criteria criteria = example.createCriteria();
		// 过滤掉删除的记录
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO).andIsEnabledEqualTo(FinanceIsEnabledEnum.Enabled.getCode())
				.andItemStatusEqualTo(0).andFreeStatusEqualTo(FinanceCostStatusEnum.COSTOK.getCode());
		// 账单类型
		if (input.getPoolType() != null) {
			criteria.andPoolTypeEqualTo(input.getPoolType());
		}
		// 收费对象
		if (input.getChargeObject() != null && !StringUtils.isEmpty(input.getChargeObject())) {
			criteria.andContainerUserEqualTo(input.getChargeObject());
		}
		example.setOrderByClause(" `create_time` DESC");
		List<PoolPti> list = daoPool.selectByExample(example);
		List<PoolPtiOutput> outputList = list.stream().map(a -> {// 创建日期倒序排列
			PoolPtiOutput output = new PoolPtiOutput();
			// 复制属性值到新对象
			BeanUtils.copyProperties(a, output);

			output.setContainerCategoryNameLang(a.getContainerCategory());// 箱类别
			output.setIsEnabledNameLang(a.getIsEnabled());// 是否有效
			output.setChargeTypeKeyNameLang(a.getChargeTypeKey());// 费用类型
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
		BillPti main = new BillPti();
		// 总金额统计
		for (int i = 0; i < ids.length; i++) {
			BillPtiDetail record = daoDetail.selectByPrimaryKey(Integer.parseInt(ids[i]));

			main = dao.selectByPrimaryKey(record.getBillId());

			daoDetail.deleteByPrimaryKey(Integer.parseInt(ids[i]));
			// 还原费用池状态
			PoolPti pool = daoPool.selectByPrimaryKey(record.getPoolId());
			pool.setItemStatus(0);// 未加入
			daoPool.updateByPrimaryKey(pool);
			// 更新总费用
			 
			main.setRealTaxTotalCostRmb(ComputeUtil.sub(main.getRealTaxTotalCostRmb(), pool.getRealCost()));
			main.setRealTaxTotalCostUsa(ComputeUtil.div(main.getRealTaxTotalCostRmb(), main.getRealRate(), 2));
			// 更新主表
			dao.updateByPrimaryKey(main);

		}
		// 查询是否还有明细 没有明细，修改账单状态为已生成
		BillPtiDetailExample example = new BillPtiDetailExample();
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
			PoolPti record = daoPool.selectByPrimaryKey(Integer.parseInt(ids[i]));
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
		// 查询主表信息
		BillPti main = dao.selectByPrimaryKey(billId);
		BigDecimal rateAmountRmb = new BigDecimal(0.00);
		BigDecimal rateAmountUsa = new BigDecimal(0.00);

		// 费用池数据 插入到账单明细中
		for (int i = 0; i < ids.length; i++) {
			PoolPti pool = daoPool.selectByPrimaryKey(Integer.parseInt(ids[i]));
			BillPtiDetail record = new BillPtiDetail();
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
				
				main.setRealNotaxTotalCostRmb(ComputeUtil.add(main.getRealNotaxTotalCostRmb()== null ? new BigDecimal(0.00)
						:main.getRealTaxTotalCostRmb() ,pool.getRealCost()== null ? new BigDecimal(0.00)
								: pool.getRealCost()));
				main.setRealNotaxTotalCostUsa(ComputeUtil.div(main.getRealNotaxTotalCostRmb(), main.getRealRate(), 2));
			} else {
				main.setRealTaxTotalCostRmb(ComputeUtil.add(main.getRealTaxTotalCostRmb()== null ? new BigDecimal(0.00)
						:main.getRealTaxTotalCostRmb() ,pool.getRealCost()== null ? new BigDecimal(0.00)
								: pool.getRealCost()));
				main.setRealTaxTotalCostUsa(ComputeUtil.div(main.getRealTaxTotalCostRmb(), main.getRealRate(), 2)); 
			}
  
			// 实收币种 real_currency_type
			main.setRealCurrencyType(pool.getChargeCurrencyType()); //收费币种
			// 实收汇率real_rate
			//main.setRealRate(pool.getCurrentRate());

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
			main.setContainerUser(pool.getContainerUser());
			// 箱类别
			main.setContainerCategory(pool.getContainerCategory());
//			if (!StringUtils.isEmpty(main.getTaxRate())) {
//				// 人民币
//				rateAmountRmb = ComputeUtil.add(rateAmountRmb, ComputeUtil.mul(
//						pool.getRealCost() == null ? new BigDecimal(0.00) : pool.getRealCost(),
//						main.getTaxRate()));
//				// 美金
//				rateAmountUsa = 
//						ComputeUtil.add(rateAmountUsa, ComputeUtil.mul(
//						pool.getRealCost() == null ? new BigDecimal(0.00) : pool.getRealCost(),
//						main.getTaxRate()));
//			}

//			// 根据费用key得到税率
//			BaseChargeRateExample bcrExample = new BaseChargeRateExample();
//			bcrExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
//					.andIsEnabledEqualTo(FinanceIsEnabledEnum.Enabled.getCode()).andChargeKeyEqualTo(tmpChargeKey);
//
//			// 根据费用key 获取税率ID
//			List<BaseChargeRate> bcrList = chargeRateDao.selectByExample(bcrExample);
//			if (bcrList != null && bcrList.size() > 0) {
//				// 根据税率ID 查询税率
//				BaseTaxRate bcr = taxRateDao.selectByPrimaryKey(bcrList.get(0).getTaxRateId());
//				// 税率 tax_rate
//				main.setTaxRate(bcr.getTaxRate());// 税率 通过费用类型得到
//				// 人民币
//				rateAmountRmb = ComputeUtil.add(rateAmountRmb, ComputeUtil.mul(
//						pool.getReplyTaxTotalCostRmb() == null ? new BigDecimal(0.00) : pool.getReplyTaxTotalCostRmb(),
//						bcr.getTaxRate()));
//				// 美金
//				rateAmountUsa = ComputeUtil.add(rateAmountUsa, ComputeUtil.mul(
//						pool.getReplyTaxTotalCostUsa() == null ? new BigDecimal(0.00) : pool.getReplyTaxTotalCostUsa(),
//						bcr.getTaxRate()));
//			}

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

		// 数量（箱量）number
		// 查询明细 根据进场id分组求箱量
		BillPtiDetailExample brdExample = new BillPtiDetailExample();
		brdExample.createCriteria().andBillIdEqualTo(billId);
		List<BillPtiDetail> brdList = daoDetail.selectByExample(brdExample);

		Map<String, List<BillPtiDetail>> numGroupMap = brdList.stream()
				.collect(Collectors.groupingBy(BillPtiDetail::getProdCourseId));
		main.setNumber(new BigDecimal(numGroupMap.size()));

		// 更新主表
		dao.updateByPrimaryKey(main);
		// 明细平分折扣金额 最后一个不全金额
 
		BillPtiDetailExample example = new BillPtiDetailExample();
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
		BillPtiExample example = new BillPtiExample();
		List<Integer> idList = Arrays.asList(ids).stream().map(a -> Integer.parseInt(a)).collect(Collectors.toList());
		example.createCriteria().andBillIdIn(idList);
		List<BillPti> list = dao.selectByExample(example);
		for (BillPti BillPti : list) {
			// 调账驳回
			BillPti.setModifyBillStatus(FinanceModifyBillEnum.AdjustmentReturn.getCode());
			dao.updateByPrimaryKey(BillPti);
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
			BillPti record = dao.selectByPrimaryKey(input.getBillId());
			BeanUtils.copyProperties(input, record);
			dao.updateByPrimaryKey(record);
		} else {

		}
		return true;
	}

}
