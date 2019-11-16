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
import com.sanlly.common.models.input.finance.PoolRepairInput;
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
import com.sanlly.finance.dao.BillRepairDetailMapper;
import com.sanlly.finance.dao.BillRepairMapper;
import com.sanlly.finance.dao.BusinessDetailMapper;
import com.sanlly.finance.dao.BusinessMapper;
import com.sanlly.finance.dao.PoolOutSourceRepairMapper;
import com.sanlly.finance.dao.PoolRepairMapper;
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
import com.sanlly.finance.entity.BillScene;
import com.sanlly.finance.entity.BillSceneExample;
import com.sanlly.finance.entity.Business;
import com.sanlly.finance.entity.BusinessDetail;
import com.sanlly.finance.entity.BusinessDetailExample;
import com.sanlly.finance.entity.BusinessExample;
import com.sanlly.finance.entity.PoolOutSourceRepairExample;
import com.sanlly.finance.entity.PoolRepair;
import com.sanlly.finance.entity.PoolRepairExample;
import com.sanlly.finance.enums.ContainerCategoryEnum;
import com.sanlly.finance.models.input.BaseAuditDeptInput;
import com.sanlly.finance.models.input.BillInfoInput;
import com.sanlly.finance.models.input.BillRepairInput;
import com.sanlly.finance.models.input.RejectInput;
import com.sanlly.finance.models.input.SearchBaseInput;
import com.sanlly.finance.models.output.BillRepairDetailOutput;
import com.sanlly.finance.models.output.BillRepairOutput;
import com.sanlly.finance.models.output.PoolRepairOutput;
import com.sanlly.finance.service.BaseAuditDeptService;
import com.sanlly.finance.service.BillRepairService;
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
public class BillRepairServiceImpl extends BaseServiceImpl implements BillRepairService {

	@Autowired
	private BillRepairMapper dao;

	@Autowired
	private BillRepairDetailMapper daoDetail;

	@Autowired
	private PoolRepairMapper daoPool;

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
	public PagedList<BillRepairOutput> getPage(SearchBaseInput input) {
		// TODO Auto-generated method stub
		BillRepairExample example = new BillRepairExample();
		BillRepairExample.Criteria criteria = example.createCriteria();
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
		PagedList<BillRepairOutput> pagedList = new PagedList<BillRepairOutput>(input.getPageIndex(),
				input.getPageSize(), totalCount);
		// 设置开始行数
		example.setLimitStart(pagedList.getLimitStart());
		// 设置结束行数
		example.setLimitEnd(pagedList.getLimitEnd());
		example.setOrderByClause(" `create_time` DESC");
		List<BillRepair> list = dao.selectByExample(example);
		List<BillRepairOutput> outputList = list.stream().map(a -> {// 创建日期倒序排列
			BillRepairOutput output = new BillRepairOutput();
			// 复制属性值到新对象
			BeanUtils.copyProperties(a, output);

			output.setContainerCategoryNameLang(a.getContainerCategory());// 箱类别
//			output.setContainerTypeNameLang(a.getContainerType());// 箱类型
			output.setModifyBillStatusNameLang(a.getModifyBillStatus());// 调账状态
			output.setModifyBillTypeNameLang(a.getModifyBillType());// 调账方式
			output.setIsEnabledNameLang(a.getIsEnabled());// 是否有效
			output.setBillStatusNameLang(a.getBillStatus());// 账单状态
			output.setMerchantsNameLang(a.getMerchantsKey());// 客商名称
			output.setChargeObjectNameLang(a.getChargeObject());
			output.setBusinessCategoryNameLang(a.getBusinessCategory());
			output.setBusinessTypeNameLang(a.getBusinessType());
			// 查看是否有明细
			BillRepairDetailExample detailEx = new BillRepairDetailExample();
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
	public Boolean createBill(BillRepairInput input) {
		// TODO Auto-generated method stub
//		FinanceBillTypeEnum billTypeEnum,FinanceBudgetTypeEnum inoutEnum,String companyCode
		// 1、获取账单类型 现场收费账单
		// 2、收支类型 收入
		// 3、公司代码 根据公司Key 或者场站查询公司代码
		if (input != null && !StringUtils.isEmpty(input.getBillId())) {

			BillRepair record = dao.selectByPrimaryKey(input.getBillId());
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
			if (input.getBillType() == 0) {// 干箱
				// 生成账单号
				input.setBillCode(getBillCode(FinanceBillTypeEnum.GXXLZD, FinanceBudgetTypeEnum.INCOME, companyCode));
				input.setCreateNode("干箱维修产生");
//				input.setBusinessType(FinanceBusinessTypeEnum.BusinessType2.getCode());//干箱
//				input.setBusinessCategory("LKFIBTCATE000005");//干箱维修

			} else if (input.getBillType() == 1) {// 冷箱
				// 生成账单号
				input.setBillCode(getBillCode(FinanceBillTypeEnum.LXXLZD, FinanceBudgetTypeEnum.INCOME, companyCode));
				input.setCreateNode("冷箱维修产生");
//				input.setBusinessType(FinanceBusinessTypeEnum.BusinessType1.getCode());//冷箱
//				input.setBusinessCategory("LKFIBTCATE000002");//冷箱维修
			} else {// 保修
					// 生成账单号
				input.setBillCode(getBillCode(FinanceBillTypeEnum.BXXLZD, FinanceBudgetTypeEnum.INCOME, companyCode));
				input.setCreateNode("保修产生");
//				input.setBusinessType(FinanceBusinessTypeEnum.BusinessType1.getCode());//干箱
//				input.setBusinessCategory("LKFIBTCATE000001");//冷箱机组维修
			}

			input.setVersionNo("0");
			input.setBillStatus(FinanceBillStatusEnum.CREATE.getCode());
			input.setIsDel(PlatformConstants.ISDEL_NO);
			input.setIsEnabled(FinanceIsEnabledEnum.Enabled.getCode());
			input.setCreateTime(new Date());
			input.setCreateUser(getCurrentUserId());

			BillRepair record = new BillRepair();
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
	public Boolean add(BillRepairInput input) {
		// TODO Auto-generated method stub
		BillRepair record = new BillRepair();
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
			BillRepair info = dao.selectByPrimaryKey(input.getBillId());
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
			BillRepair record = dao.selectByPrimaryKey(Integer.parseInt(input.getId()));
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
			BillRepair record = dao.selectByPrimaryKey(Integer.parseInt(ids[i]));
			BillRepairDetailExample example = new BillRepairDetailExample();
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
	public Boolean Upadtes(List<BillRepairInput> input) {
		// TODO Auto-generated method stub

		if (input != null) {
			for (BillRepairInput item : input) {
				if (item.getBillId() != null) {
					BillRepair main = new BillRepair();

					// 查询一下信息
					BillRepair info = dao.selectByPrimaryKey(item.getBillId());
					// 已审核不能修改
					if (info.getBillStatus() != null
							&& !info.getBillStatus().equals(FinanceBillStatusEnum.AUDITOR.getCode())) {
						BeanUtils.copyProperties(info, main);
//						BeanUtils.copyProperties(item, main);
						main.setReplyTaxTotalCostUsa(item.getReplyTaxTotalCostUsa());
						main.setReplyTaxTotalCostRmb(item.getReplyTaxTotalCostRmb());
						main.setReplyNotaxTotalCostUsa(item.getReplyNotaxTotalCostUsa());
						main.setReplyNotaxTotalCostRmb(item.getReplyNotaxTotalCostRmb());
						main.setDiscountPercentTmp(item.getDiscountPercentTmp());
						main.setReductionAmount(item.getReductionAmount());
						main.setRealTaxTotalCostUsa(item.getRealTaxTotalCostUsa());
						main.setRealNotaxTotalCostUsa(item.getRealNotaxTotalCostUsa());
						main.setRealTaxTotalCostRmb(item.getRealTaxTotalCostRmb());
						main.setRealNotaxTotalCostRmb(item.getRealNotaxTotalCostRmb());

						// 检查是否有临时折扣录入
						if (!StringUtils.isEmpty(item.getDiscountPercentTmp())
								&& !item.getDiscountPercentTmp().equals(info.getDiscountPercentTmp())) {
							// 有变动，更改明细费用
							BigDecimal tmpdiscountAmount = new BigDecimal(0);
							// 计算 折扣金额

							// 判断报价币种 计算金额
							if (main.getEstCurrencyType().equals(FinanceCurrencyType.CNY.getCode())) {// 人民币

								// 批复金额 减去 减免的金额 == 实收金额
								if (main.getReplyTaxTotalCostRmb() != null
										&& main.getReplyTaxTotalCostRmb().compareTo(new BigDecimal(0.00)) == 1) {
									// 公司折扣
									main.setRealTaxTotalCostRmb(
											ComputeUtil.mul(main.getReplyTaxTotalCostRmb(), main.getDiscountPercent()));
									tmpdiscountAmount = ComputeUtil.mul(main.getRealTaxTotalCostRmb(),
											ComputeUtil.sub(new BigDecimal(1), main.getDiscountPercentTmp()));
									// 临时折扣
									main.setRealTaxTotalCostRmb(ComputeUtil.mul(main.getRealTaxTotalCostRmb(),
											main.getDiscountPercentTmp()));

									main.setRealTaxTotalCostUsa(
											ComputeUtil.div(main.getRealTaxTotalCostRmb(), main.getRealRate(), 2));

								} else {

									// 公司折扣
									main.setRealNotaxTotalCostRmb(ComputeUtil.mul(main.getReplyNotaxTotalCostRmb(),
											main.getDiscountPercent()));
									tmpdiscountAmount = ComputeUtil.mul(main.getRealNotaxTotalCostRmb(),
											ComputeUtil.sub(new BigDecimal(1), main.getDiscountPercentTmp()));
									// 临时折扣
									main.setRealNotaxTotalCostRmb(ComputeUtil.mul(main.getRealNotaxTotalCostRmb(),
											main.getDiscountPercentTmp()));
									main.setRealNotaxTotalCostUsa(
											ComputeUtil.div(main.getRealNotaxTotalCostRmb(), main.getRealRate(), 2));

								}
							} else {// 取美金

								// 批复金额 减去 减免的金额 == 实收金额
								if (main.getReplyTaxTotalCostRmb() != null
										&& main.getReplyTaxTotalCostRmb().compareTo(new BigDecimal(0.00)) == 1) {
									// 公司折扣
									main.setRealTaxTotalCostUsa(
											ComputeUtil.mul(main.getReplyTaxTotalCostUsa(), main.getDiscountPercent()));
									tmpdiscountAmount = ComputeUtil.mul(main.getRealTaxTotalCostUsa(),
											ComputeUtil.sub(new BigDecimal(1), main.getDiscountPercentTmp()));

									// 临时折扣
									main.setRealTaxTotalCostUsa(ComputeUtil.mul(main.getRealTaxTotalCostUsa(),
											main.getDiscountPercentTmp()));
									main.setRealTaxTotalCostRmb(
											ComputeUtil.mul(main.getRealTaxTotalCostUsa(), main.getRealRate()));
								} else {

									// 公司折扣
									main.setRealNotaxTotalCostUsa(ComputeUtil.mul(main.getReplyNotaxTotalCostUsa(),
											main.getDiscountPercent()));
									tmpdiscountAmount = ComputeUtil.mul(main.getRealNotaxTotalCostUsa(),
											ComputeUtil.sub(new BigDecimal(1), main.getDiscountPercentTmp()));

									// 临时折扣
									main.setRealNotaxTotalCostUsa(ComputeUtil.mul(main.getRealNotaxTotalCostUsa(),
											main.getDiscountPercentTmp()));
									main.setRealNotaxTotalCostRmb(
											ComputeUtil.mul(main.getRealNotaxTotalCostUsa(), main.getRealRate()));

								}
							}

							// 计算明细
							// 查询所有明细
							BillRepairDetailExample brdexample = new BillRepairDetailExample();
							brdexample.createCriteria().andBillIdEqualTo(main.getBillId());

							List<BillRepairDetail> brDetailList = daoDetail.selectByExample(brdexample);
							// 非负数筛选
							List<BillRepairDetail> list1 = brDetailList.stream().filter(d -> {
								if (d.getRealNotaxTotalCostRmb() != null
										&& d.getRealNotaxTotalCostRmb().compareTo(new BigDecimal(0.00)) == 1) {
									return true;
								}
								if (d.getRealNotaxTotalCostUsa() != null
										&& d.getRealNotaxTotalCostUsa().compareTo(new BigDecimal(0.00)) == 1) {
									return true;
								}
								if (d.getRealTaxTotalCostRmb() != null
										&& d.getRealTaxTotalCostRmb().compareTo(new BigDecimal(0.00)) == 1) {
									return true;
								}
								if (d.getRealTaxTotalCostUsa() != null
										&& d.getRealTaxTotalCostUsa().compareTo(new BigDecimal(0.00)) == 1) {
									return true;
								}
								return false;

							}).collect(Collectors.toList());

							// 计算折扣金额 用于还原 原始金额
							BigDecimal amount = new BigDecimal(0);
							BigDecimal amountTmp = new BigDecimal(0);
							BigDecimal amountSum = ComputeUtil.sub(main.getReplyNotaxTotalCostRmb(),
									main.getRealNotaxTotalCostRmb());
							for (int i = 0; i < list1.size(); i++) {
								BillRepairDetail billRepairDetail = list1.get(i);
								// 用箱人Code
								String containerUserCode = "";
								ContainerUserOutput cuoutput = productionFeignClient
										.getContainerUserByKey(billRepairDetail.getContainerUser()).getData();
								if (cuoutput != null) {
									containerUserCode = cuoutput.getContainerUserCode();
								}
								// 判断是否最后一个
								if (i == list1.size() - 1 && list1.size() > 1) {
									// 判断币种
									if (billRepairDetail.getEstCurrencyType()
											.equals(FinanceCurrencyType.CNY.getCode())) {

										if (containerUserCode.equals("COS")) {// 中远不含税
//											if (billRepairDetail.getRealNotaxTotalCostRmb() != null) {
											// 得到折后总结额
											billRepairDetail.setRealNotaxTotalCostRmb(
													ComputeUtil.sub(billRepairDetail.getReplyNotaxTotalCostRmb(),
															ComputeUtil.sub(main.getRealNotaxTotalCostRmb(), amount)));
											billRepairDetail.setRealNotaxTotalCostRmb(ComputeUtil.sub(
													billRepairDetail.getReplyNotaxTotalCostRmb(),
													ComputeUtil.sub(main.getRealNotaxTotalCostRmb(), amountTmp)));

//											}
//											// 计算汇率
//											if (billRepairDetail.getRealNotaxTotalCostUsa() != null) {
											billRepairDetail.setRealNotaxTotalCostUsa(
													ComputeUtil.div(billRepairDetail.getRealNotaxTotalCostRmb(),
															main.getRealRate(), 2));
//											}
											billRepairDetail.setRealTaxTotalCostRmb(null);
											billRepairDetail.setRealTaxTotalCostUsa(null);
										} else {

//											if (billRepairDetail.getRealTaxTotalCostRmb() != null) {

											billRepairDetail.setRealTaxTotalCostRmb(
													ComputeUtil.sub(billRepairDetail.getReplyTaxTotalCostRmb(),
															ComputeUtil.sub(main.getRealTaxTotalCostRmb(), amount)));

											billRepairDetail.setRealTaxTotalCostRmb(
													ComputeUtil.sub(billRepairDetail.getReplyTaxTotalCostRmb(),
															ComputeUtil.sub(main.getRealTaxTotalCostRmb(), amountTmp)));

//											}

											// 计算汇率
//											if (billRepairDetail.getRealTaxTotalCostUsa() != null) {
											billRepairDetail.setRealTaxTotalCostUsa(ComputeUtil.div(
													billRepairDetail.getRealTaxTotalCostRmb(), main.getRealRate(), 2));
//											}
										}
									} else {
										if (containerUserCode.equals("COS")) {// 中远不含税
//											if (billRepairDetail.getRealNotaxTotalCostUsa() != null) {
											billRepairDetail.setRealNotaxTotalCostUsa(
													ComputeUtil.sub(main.getRealNotaxTotalCostUsa(), amount));
											billRepairDetail.setRealNotaxTotalCostUsa(
													ComputeUtil.sub(main.getRealNotaxTotalCostUsa(), amountTmp));

//											}
											// 计算汇率
//											if (billRepairDetail.getRealNotaxTotalCostRmb() != null) {
											billRepairDetail.setRealNotaxTotalCostRmb(ComputeUtil.mul(
													billRepairDetail.getRealNotaxTotalCostUsa(), main.getRealRate()));
//											}
										} else {
//											if (billRepairDetail.getRealTaxTotalCostUsa() != null) {
											billRepairDetail.setRealTaxTotalCostUsa(
													ComputeUtil.sub(main.getReplyTaxTotalCostUsa(), amount));

											billRepairDetail.setRealTaxTotalCostUsa(
													ComputeUtil.sub(main.getReplyTaxTotalCostUsa(), amountTmp));

//											}

											// 计算汇率
//											if (billRepairDetail.getRealTaxTotalCostRmb() != null) {
											billRepairDetail.setRealTaxTotalCostRmb(ComputeUtil.mul(
													billRepairDetail.getRealTaxTotalCostUsa(), main.getRealRate()));
//											}
										}
									}
								} else {

									// 判断币种
									if (billRepairDetail.getEstCurrencyType()
											.equals(FinanceCurrencyType.CNY.getCode())) {
										if (containerUserCode.equals("COS")) {// 中远不含税
//											if (billRepairDetail.getRealNotaxTotalCostRmb() != null) {
											amount = ComputeUtil.add(amount, ComputeUtil.mul(
													billRepairDetail.getReplyTaxTotalCostRmb(),
													ComputeUtil.sub(new BigDecimal(1), main.getDiscountPercent())));

											billRepairDetail.setRealNotaxTotalCostRmb(
													ComputeUtil.mul(billRepairDetail.getReplyTaxTotalCostRmb(),
															main.getDiscountPercent()));
											// 临时折扣
											amountTmp = ComputeUtil.add(amountTmp, ComputeUtil.mul(
													billRepairDetail.getRealNotaxTotalCostRmb(),
													ComputeUtil.sub(new BigDecimal(1), main.getDiscountPercentTmp())));
											billRepairDetail.setRealNotaxTotalCostRmb(
													ComputeUtil.mul(billRepairDetail.getRealNotaxTotalCostRmb(),
															main.getDiscountPercentTmp()));
//											}
//											// 计算汇率
//											if (billRepairDetail.getRealNotaxTotalCostUsa() != null) {
											billRepairDetail.setRealNotaxTotalCostUsa(
													ComputeUtil.div(billRepairDetail.getRealNotaxTotalCostRmb(),
															main.getRealRate(), 2));
//											}
											billRepairDetail.setRealTaxTotalCostRmb(null);
											billRepairDetail.setRealTaxTotalCostUsa(null);
										} else {
//											if (billRepairDetail.getRealTaxTotalCostRmb() != null) {
											amount = ComputeUtil.add(amount, ComputeUtil.mul(
													billRepairDetail.getReplyTaxTotalCostRmb(),
													ComputeUtil.sub(new BigDecimal(1), main.getDiscountPercent())));
											billRepairDetail.setRealTaxTotalCostRmb(
													ComputeUtil.mul(billRepairDetail.getReplyTaxTotalCostRmb(),
															main.getDiscountPercent()));

											// 临时折扣
											amountTmp = ComputeUtil.add(amountTmp, ComputeUtil.mul(
													billRepairDetail.getRealTaxTotalCostRmb(),
													ComputeUtil.sub(new BigDecimal(1), main.getDiscountPercentTmp())));
											billRepairDetail.setRealTaxTotalCostRmb(
													ComputeUtil.mul(billRepairDetail.getRealTaxTotalCostRmb(),
															main.getDiscountPercentTmp()));
//											}
//
//											// 计算汇率
//											if (billRepairDetail.getRealTaxTotalCostUsa() != null) {
											billRepairDetail.setRealTaxTotalCostUsa(ComputeUtil.div(
													billRepairDetail.getRealTaxTotalCostRmb(), main.getRealRate(), 2));
//											}
										}

									} else {
										if (containerUserCode.equals("COS")) {// 中远不含税
//											if (billRepairDetail.getRealNotaxTotalCostUsa() != null) {
											amount = ComputeUtil.add(amount, ComputeUtil.mul(
													billRepairDetail.getReplyTaxTotalCostUsa(),
													ComputeUtil.sub(new BigDecimal(1), main.getDiscountPercent())));
											billRepairDetail.setRealNotaxTotalCostUsa(
													ComputeUtil.mul(billRepairDetail.getReplyTaxTotalCostUsa(),
															main.getDiscountPercent()));

											// 临时折扣
											amountTmp = ComputeUtil.add(amountTmp, ComputeUtil.mul(
													billRepairDetail.getRealNotaxTotalCostUsa(),
													ComputeUtil.sub(new BigDecimal(1), main.getDiscountPercentTmp())));
											billRepairDetail.setRealNotaxTotalCostUsa(
													ComputeUtil.mul(billRepairDetail.getRealNotaxTotalCostUsa(),
															main.getDiscountPercentTmp()));
//											}
//											// 计算汇率
//											if (billRepairDetail.getRealNotaxTotalCostRmb() != null) {
											billRepairDetail.setRealNotaxTotalCostRmb(ComputeUtil.mul(
													billRepairDetail.getRealNotaxTotalCostUsa(), main.getRealRate()));
//											}

											billRepairDetail.setRealTaxTotalCostRmb(null);
											billRepairDetail.setRealTaxTotalCostUsa(null);
										} else {
//											if (billRepairDetail.getRealTaxTotalCostUsa() != null) {
											amount = ComputeUtil.add(amount, ComputeUtil.mul(
													billRepairDetail.getReplyTaxTotalCostUsa(),
													ComputeUtil.sub(new BigDecimal(1), main.getDiscountPercent())));

											billRepairDetail.setRealTaxTotalCostUsa(
													ComputeUtil.mul(billRepairDetail.getReplyTaxTotalCostUsa(),
															main.getDiscountPercent()));

											// 临时折扣
											amountTmp = ComputeUtil.add(amountTmp, ComputeUtil.mul(
													billRepairDetail.getRealTaxTotalCostUsa(),
													ComputeUtil.sub(new BigDecimal(1), main.getDiscountPercentTmp())));

											billRepairDetail.setRealTaxTotalCostUsa(
													ComputeUtil.mul(billRepairDetail.getRealTaxTotalCostUsa(),
															main.getDiscountPercentTmp()));
//											}
//
//											// 计算汇率
//											if (billRepairDetail.getRealTaxTotalCostRmb() != null) {
											billRepairDetail.setRealTaxTotalCostRmb(ComputeUtil.mul(
													billRepairDetail.getRealTaxTotalCostUsa(), main.getRealRate()));
//											}
										}
									}
								}
								// 更新明细 平分折扣
								daoDetail.updateByPrimaryKey(billRepairDetail);
							}
						}

						// 检查是否有减免费用录入
						if (!StringUtils.isEmpty(item.getReductionAmount())
								&& !item.getReductionAmount().equals(info.getReductionAmount())) {
							// 第一种情况， 有临时折扣
							if (!StringUtils.isEmpty(item.getDiscountPercentTmp())// 现在为空 原来不为空
									&& !item.getDiscountPercentTmp().equals(info.getDiscountPercentTmp())) {
								// 有变动，更改明细费用
								BigDecimal tmpdiscountAmount = new BigDecimal(0);
								// 有变动，更改明细费用
								// 减免金额 计算为比例为
								// 减免后金额/ 总金额 所有明细乘以这个比例，最后的一条数据补充尾差
								BigDecimal reductionRate = new BigDecimal(0);

								// 判断报价币种 计算金额
								if (main.getEstCurrencyType().equals(FinanceCurrencyType.CNY.getCode())) {// 人民币

									// 批复金额 减去 减免的金额 == 实收金额
									if (main.getReplyTaxTotalCostRmb() != null
											&& main.getReplyTaxTotalCostRmb().compareTo(new BigDecimal(0.00)) == 1) {
										// 公司折扣
										main.setRealTaxTotalCostRmb(ComputeUtil.mul(main.getReplyTaxTotalCostRmb(),
												main.getDiscountPercent()));
										tmpdiscountAmount = ComputeUtil.mul(main.getRealTaxTotalCostRmb(),
												ComputeUtil.sub(new BigDecimal(1), main.getDiscountPercentTmp()));
										// 临时折扣
										main.setRealTaxTotalCostRmb(ComputeUtil.mul(main.getRealTaxTotalCostRmb(),
												main.getDiscountPercentTmp()));

										// 270 减免70 实收200 比例：200/270
										reductionRate = ComputeUtil.div(main.getRealTaxTotalCostRmb(), ComputeUtil
												.sub(main.getRealTaxTotalCostRmb(), item.getReductionAmount()), 2);
										main.setRealTaxTotalCostRmb(ComputeUtil.sub(main.getRealTaxTotalCostRmb(),
												item.getReductionAmount()));

										main.setRealTaxTotalCostUsa(
												ComputeUtil.div(main.getRealTaxTotalCostRmb(), main.getRealRate(), 2));

									} else {

										// 公司折扣
										main.setRealNotaxTotalCostRmb(ComputeUtil.mul(main.getReplyNotaxTotalCostRmb(),
												main.getDiscountPercent()));
										tmpdiscountAmount = ComputeUtil.mul(main.getRealNotaxTotalCostRmb(),
												ComputeUtil.sub(new BigDecimal(1), main.getDiscountPercentTmp()));
										// 临时折扣
										main.setRealNotaxTotalCostRmb(ComputeUtil.mul(main.getRealNotaxTotalCostRmb(),
												main.getDiscountPercentTmp()));

										// 270 减免70 实收200 比例：200/270
										reductionRate = ComputeUtil.div(main.getRealNotaxTotalCostRmb(), ComputeUtil
												.sub(main.getRealNotaxTotalCostRmb(), item.getReductionAmount()), 2);
										main.setRealNotaxTotalCostRmb(ComputeUtil.sub(main.getRealNotaxTotalCostRmb(),
												item.getReductionAmount()));

										main.setRealNotaxTotalCostUsa(ComputeUtil.div(main.getRealNotaxTotalCostRmb(),
												main.getRealRate(), 2));

									}
								} else {// 取美金

									// 批复金额 减去 减免的金额 == 实收金额
									if (main.getReplyTaxTotalCostRmb() != null
											&& main.getReplyTaxTotalCostRmb().compareTo(new BigDecimal(0.00)) == 1) {
										// 公司折扣
										main.setRealTaxTotalCostUsa(ComputeUtil.mul(main.getReplyTaxTotalCostUsa(),
												main.getDiscountPercent()));
										tmpdiscountAmount = ComputeUtil.mul(main.getRealTaxTotalCostUsa(),
												ComputeUtil.sub(new BigDecimal(1), main.getDiscountPercentTmp()));

										// 临时折扣
										main.setRealTaxTotalCostUsa(ComputeUtil.mul(main.getRealTaxTotalCostUsa(),
												main.getDiscountPercentTmp()));

										// 270 减免70 实收200 比例：200/270
										reductionRate = ComputeUtil.div(main.getRealTaxTotalCostUsa(), ComputeUtil
												.sub(main.getRealTaxTotalCostUsa(), item.getReductionAmount()), 2);
										main.setRealTaxTotalCostUsa(ComputeUtil.sub(main.getRealTaxTotalCostUsa(),
												item.getReductionAmount()));

										main.setRealTaxTotalCostRmb(
												ComputeUtil.mul(main.getRealTaxTotalCostUsa(), main.getRealRate()));
									} else {

										// 公司折扣
										main.setRealNotaxTotalCostUsa(ComputeUtil.mul(main.getReplyNotaxTotalCostUsa(),
												main.getDiscountPercent()));
										tmpdiscountAmount = ComputeUtil.mul(main.getRealNotaxTotalCostUsa(),
												ComputeUtil.sub(new BigDecimal(1), main.getDiscountPercentTmp()));

										// 临时折扣
										main.setRealNotaxTotalCostUsa(ComputeUtil.mul(main.getRealNotaxTotalCostUsa(),
												main.getDiscountPercentTmp()));

										// 270 减免70 实收200 比例：200/270
										reductionRate = ComputeUtil.div(main.getRealNotaxTotalCostUsa(), ComputeUtil
												.sub(main.getRealNotaxTotalCostUsa(), item.getReductionAmount()), 2);
										main.setRealNotaxTotalCostUsa(ComputeUtil.sub(main.getRealNotaxTotalCostUsa(),
												item.getReductionAmount()));

										main.setRealNotaxTotalCostRmb(
												ComputeUtil.mul(main.getRealNotaxTotalCostUsa(), main.getRealRate()));

									}
								}

								// 计算明细
								// 查询所有明细
								BillRepairDetailExample brdexample = new BillRepairDetailExample();
								brdexample.createCriteria().andBillIdEqualTo(main.getBillId());

								List<BillRepairDetail> brDetailList = daoDetail.selectByExample(brdexample);
								// 非负数筛选
								List<BillRepairDetail> list1 = brDetailList.stream().filter(d -> {
									if (d.getRealNotaxTotalCostRmb() != null
											&& d.getRealNotaxTotalCostRmb().compareTo(new BigDecimal(0.00)) == 1) {
										return true;
									}
									if (d.getRealNotaxTotalCostUsa() != null
											&& d.getRealNotaxTotalCostUsa().compareTo(new BigDecimal(0.00)) == 1) {
										return true;
									}
									if (d.getRealTaxTotalCostRmb() != null
											&& d.getRealTaxTotalCostRmb().compareTo(new BigDecimal(0.00)) == 1) {
										return true;
									}
									if (d.getRealTaxTotalCostUsa() != null
											&& d.getRealTaxTotalCostUsa().compareTo(new BigDecimal(0.00)) == 1) {
										return true;
									}
									return false;

								}).collect(Collectors.toList());

								// 计算折扣金额 用于还原 原始金额
								BigDecimal amount = new BigDecimal(0);
								BigDecimal amountTmp = new BigDecimal(0);
								BigDecimal amountSum = ComputeUtil.sub(main.getReplyNotaxTotalCostRmb(),
										main.getRealNotaxTotalCostRmb());
								// 减免金额和
								BigDecimal reduceAmountSum = new BigDecimal(0);
								for (int i = 0; i < list1.size(); i++) {
									BillRepairDetail billRepairDetail = list1.get(i);
									// 用箱人Code
									String containerUserCode = "";
									ContainerUserOutput cuoutput = productionFeignClient
											.getContainerUserByKey(billRepairDetail.getContainerUser()).getData();
									if (cuoutput != null) {
										containerUserCode = cuoutput.getContainerUserCode();
									}
									// 判断是否最后一个
									if (i == list1.size() - 1 && list1.size() > 1) {
										// 判断币种
										if (billRepairDetail.getEstCurrencyType()
												.equals(FinanceCurrencyType.CNY.getCode())) {

											if (containerUserCode.equals("COS")) {// 中远不含税
//												if (billRepairDetail.getRealNotaxTotalCostRmb() != null) {
												// 得到折后总结额
												billRepairDetail.setRealNotaxTotalCostRmb(ComputeUtil.sub(
														billRepairDetail.getReplyNotaxTotalCostRmb(),
														ComputeUtil.sub(main.getRealNotaxTotalCostRmb(), amount)));
												billRepairDetail.setRealNotaxTotalCostRmb(ComputeUtil.sub(
														billRepairDetail.getReplyNotaxTotalCostRmb(),
														ComputeUtil.sub(main.getRealNotaxTotalCostRmb(), amountTmp)));
												billRepairDetail.setRealNotaxTotalCostRmb(
														ComputeUtil.sub(billRepairDetail.getReplyNotaxTotalCostRmb(),
																ComputeUtil.sub(main.getRealNotaxTotalCostRmb(),
																		reduceAmountSum)));

//												}
//												// 计算汇率
//												if (billRepairDetail.getRealNotaxTotalCostUsa() != null) {
												billRepairDetail.setRealNotaxTotalCostUsa(
														ComputeUtil.div(billRepairDetail.getRealNotaxTotalCostRmb(),
																main.getRealRate(), 2));
//												}
												billRepairDetail.setRealTaxTotalCostRmb(null);
												billRepairDetail.setRealTaxTotalCostUsa(null);
											} else {

												billRepairDetail.setRealTaxTotalCostRmb(ComputeUtil.sub(
														billRepairDetail.getReplyTaxTotalCostRmb(),
														ComputeUtil.sub(main.getRealTaxTotalCostRmb(), amount)));

												billRepairDetail.setRealTaxTotalCostRmb(ComputeUtil.sub(
														billRepairDetail.getReplyTaxTotalCostRmb(),
														ComputeUtil.sub(main.getRealTaxTotalCostRmb(), amountTmp)));

												billRepairDetail.setRealTaxTotalCostRmb(ComputeUtil
														.sub(billRepairDetail.getReplyTaxTotalCostRmb(), ComputeUtil
																.sub(main.getRealTaxTotalCostRmb(), reduceAmountSum)));

												// 计算汇率
												billRepairDetail.setRealTaxTotalCostUsa(
														ComputeUtil.div(billRepairDetail.getRealTaxTotalCostRmb(),
																main.getRealRate(), 2));
											}
										} else {
											if (containerUserCode.equals("COS")) {// 中远不含税
												billRepairDetail.setRealNotaxTotalCostUsa(
														ComputeUtil.sub(main.getRealNotaxTotalCostUsa(), amount));
												billRepairDetail.setRealNotaxTotalCostUsa(
														ComputeUtil.sub(main.getRealNotaxTotalCostUsa(), amountTmp));
												billRepairDetail.setRealNotaxTotalCostUsa(ComputeUtil
														.sub(main.getRealNotaxTotalCostUsa(), reduceAmountSum));

												// 计算汇率
												billRepairDetail.setRealNotaxTotalCostRmb(
														ComputeUtil.mul(billRepairDetail.getRealNotaxTotalCostUsa(),
																main.getRealRate()));
											} else {
//												if (billRepairDetail.getRealTaxTotalCostUsa() != null) {
												billRepairDetail.setRealTaxTotalCostUsa(
														ComputeUtil.sub(main.getReplyTaxTotalCostUsa(), amount));

												billRepairDetail.setRealTaxTotalCostUsa(
														ComputeUtil.sub(main.getReplyTaxTotalCostUsa(), amountTmp));

												billRepairDetail.setRealTaxTotalCostUsa(ComputeUtil
														.sub(main.getReplyTaxTotalCostUsa(), reduceAmountSum));

//												}

												// 计算汇率
//												if (billRepairDetail.getRealTaxTotalCostRmb() != null) {
												billRepairDetail.setRealTaxTotalCostRmb(ComputeUtil.mul(
														billRepairDetail.getRealTaxTotalCostUsa(), main.getRealRate()));
//												}
											}
										}
									} else {

										// 判断币种
										if (billRepairDetail.getEstCurrencyType()
												.equals(FinanceCurrencyType.CNY.getCode())) {
											if (containerUserCode.equals("COS")) {// 中远不含税
//												if (billRepairDetail.getRealNotaxTotalCostRmb() != null) {
												amount = ComputeUtil.add(amount, ComputeUtil.mul(
														billRepairDetail.getReplyTaxTotalCostRmb(),
														ComputeUtil.sub(new BigDecimal(1), main.getDiscountPercent())));

												billRepairDetail.setRealNotaxTotalCostRmb(
														ComputeUtil.mul(billRepairDetail.getReplyTaxTotalCostRmb(),
																main.getDiscountPercent()));
												// 临时折扣
												amountTmp = ComputeUtil.add(amountTmp,
														ComputeUtil.mul(billRepairDetail.getRealNotaxTotalCostRmb(),
																ComputeUtil.sub(new BigDecimal(1),
																		main.getDiscountPercentTmp())));

												billRepairDetail.setRealNotaxTotalCostRmb(
														ComputeUtil.mul(billRepairDetail.getRealNotaxTotalCostRmb(),
																main.getDiscountPercentTmp()));

												reduceAmountSum = ComputeUtil.add(reduceAmountSum,
														ComputeUtil.mul(billRepairDetail.getRealNotaxTotalCostRmb(),
																ComputeUtil.sub(new BigDecimal(1), reductionRate)));

												billRepairDetail.setRealNotaxTotalCostRmb(ComputeUtil.mul(
														billRepairDetail.getRealNotaxTotalCostRmb(), reductionRate));

//												}
//												// 计算汇率
//												if (billRepairDetail.getRealNotaxTotalCostUsa() != null) {
												billRepairDetail.setRealNotaxTotalCostUsa(
														ComputeUtil.div(billRepairDetail.getRealNotaxTotalCostRmb(),
																main.getRealRate(), 2));
//												}
												billRepairDetail.setRealTaxTotalCostRmb(null);
												billRepairDetail.setRealTaxTotalCostUsa(null);
											} else {
//												if (billRepairDetail.getRealTaxTotalCostRmb() != null) {
												amount = ComputeUtil.add(amount, ComputeUtil.mul(
														billRepairDetail.getReplyTaxTotalCostRmb(),
														ComputeUtil.sub(new BigDecimal(1), main.getDiscountPercent())));
												billRepairDetail.setRealTaxTotalCostRmb(
														ComputeUtil.mul(billRepairDetail.getReplyTaxTotalCostRmb(),
																main.getDiscountPercent()));

												// 临时折扣
												amountTmp = ComputeUtil.add(amountTmp,
														ComputeUtil.mul(billRepairDetail.getRealTaxTotalCostRmb(),
																ComputeUtil.sub(new BigDecimal(1),
																		main.getDiscountPercentTmp())));

												billRepairDetail.setRealTaxTotalCostRmb(
														ComputeUtil.mul(billRepairDetail.getRealTaxTotalCostRmb(),
																main.getDiscountPercentTmp()));

												reduceAmountSum = ComputeUtil.add(reduceAmountSum,
														ComputeUtil.mul(billRepairDetail.getRealTaxTotalCostRmb(),
																ComputeUtil.sub(new BigDecimal(1), reductionRate)));

												billRepairDetail.setRealTaxTotalCostRmb(ComputeUtil
														.mul(billRepairDetail.getRealTaxTotalCostRmb(), reductionRate));

//												}
												//
//												// 计算汇率
//												if (billRepairDetail.getRealTaxTotalCostUsa() != null) {
												billRepairDetail.setRealTaxTotalCostUsa(
														ComputeUtil.div(billRepairDetail.getRealTaxTotalCostRmb(),
																main.getRealRate(), 2));
//												}
											}

										} else {
											if (containerUserCode.equals("COS")) {// 中远不含税
//												if (billRepairDetail.getRealNotaxTotalCostUsa() != null) {
												amount = ComputeUtil.add(amount, ComputeUtil.mul(
														billRepairDetail.getReplyTaxTotalCostUsa(),
														ComputeUtil.sub(new BigDecimal(1), main.getDiscountPercent())));
												billRepairDetail.setRealNotaxTotalCostUsa(
														ComputeUtil.mul(billRepairDetail.getReplyTaxTotalCostUsa(),
																main.getDiscountPercent()));

												// 临时折扣
												amountTmp = ComputeUtil.add(amountTmp,
														ComputeUtil.mul(billRepairDetail.getRealNotaxTotalCostUsa(),
																ComputeUtil.sub(new BigDecimal(1),
																		main.getDiscountPercentTmp())));
												billRepairDetail.setRealNotaxTotalCostUsa(
														ComputeUtil.mul(billRepairDetail.getRealNotaxTotalCostUsa(),
																main.getDiscountPercentTmp()));

												reduceAmountSum = ComputeUtil.add(reduceAmountSum,
														ComputeUtil.mul(billRepairDetail.getRealNotaxTotalCostUsa(),
																ComputeUtil.sub(new BigDecimal(1), reductionRate)));

												billRepairDetail.setRealNotaxTotalCostUsa(ComputeUtil.mul(
														billRepairDetail.getRealNotaxTotalCostUsa(), reductionRate));

//												}
//												// 计算汇率
//												if (billRepairDetail.getRealNotaxTotalCostRmb() != null) {
												billRepairDetail.setRealNotaxTotalCostRmb(
														ComputeUtil.mul(billRepairDetail.getRealNotaxTotalCostUsa(),
																main.getRealRate()));
//												}

												billRepairDetail.setRealTaxTotalCostRmb(null);
												billRepairDetail.setRealTaxTotalCostUsa(null);
											} else {
//												if (billRepairDetail.getRealTaxTotalCostUsa() != null) {
												amount = ComputeUtil.add(amount, ComputeUtil.mul(
														billRepairDetail.getReplyTaxTotalCostUsa(),
														ComputeUtil.sub(new BigDecimal(1), main.getDiscountPercent())));

												billRepairDetail.setRealTaxTotalCostUsa(
														ComputeUtil.mul(billRepairDetail.getReplyTaxTotalCostUsa(),
																main.getDiscountPercent()));

												// 临时折扣
												amountTmp = ComputeUtil.add(amountTmp,
														ComputeUtil.mul(billRepairDetail.getRealTaxTotalCostUsa(),
																ComputeUtil.sub(new BigDecimal(1),
																		main.getDiscountPercentTmp())));

												billRepairDetail.setRealTaxTotalCostUsa(
														ComputeUtil.mul(billRepairDetail.getRealTaxTotalCostUsa(),
																main.getDiscountPercentTmp()));

												reduceAmountSum = ComputeUtil.add(reduceAmountSum,
														ComputeUtil.mul(billRepairDetail.getRealTaxTotalCostUsa(),
																ComputeUtil.sub(new BigDecimal(1), reductionRate)));

												billRepairDetail.setRealTaxTotalCostUsa(ComputeUtil
														.mul(billRepairDetail.getRealTaxTotalCostUsa(), reductionRate));

//												}
												//
//												// 计算汇率
//												if (billRepairDetail.getRealTaxTotalCostRmb() != null) {
												billRepairDetail.setRealTaxTotalCostRmb(ComputeUtil.mul(
														billRepairDetail.getRealTaxTotalCostUsa(), main.getRealRate()));
//												}
											}
										}
									}
									// 更新明细 平分折扣
									daoDetail.updateByPrimaryKey(billRepairDetail);
								}

							} else {// 没有临时折扣的情况

								// 有变动，更改明细费用
								BigDecimal tmpdiscountAmount = new BigDecimal(0);
								// 有变动，更改明细费用
								// 减免金额 计算为比例为
								// 减免后金额/ 总金额 所有明细乘以这个比例，最后的一条数据补充尾差
								BigDecimal reductionRate = new BigDecimal(0);

								// 判断报价币种 计算金额
								if (main.getEstCurrencyType().equals(FinanceCurrencyType.CNY.getCode())) {// 人民币

									// 批复金额 减去 减免的金额 == 实收金额
									if (main.getReplyTaxTotalCostRmb() != null
											&& main.getReplyTaxTotalCostRmb().compareTo(new BigDecimal(0.00)) == 1) {
										// 公司折扣
										main.setRealTaxTotalCostRmb(ComputeUtil.mul(main.getReplyTaxTotalCostRmb(),
												main.getDiscountPercent()));

										// 270 减免70 实收200 比例：200/270
										reductionRate = ComputeUtil.div(main.getRealTaxTotalCostRmb(), ComputeUtil
												.sub(main.getRealTaxTotalCostRmb(), item.getReductionAmount()), 2);
										main.setRealTaxTotalCostRmb(ComputeUtil.sub(main.getRealTaxTotalCostRmb(),
												item.getReductionAmount()));

										main.setRealTaxTotalCostUsa(
												ComputeUtil.div(main.getRealTaxTotalCostRmb(), main.getRealRate(), 2));

									} else {

										// 公司折扣
										main.setRealNotaxTotalCostRmb(ComputeUtil.mul(main.getReplyNotaxTotalCostRmb(),
												main.getDiscountPercent()));

										// 270 减免70 实收200 比例：200/270
										reductionRate = ComputeUtil.div(main.getRealNotaxTotalCostRmb(), ComputeUtil
												.sub(main.getRealNotaxTotalCostRmb(), item.getReductionAmount()), 2);
										main.setRealNotaxTotalCostRmb(ComputeUtil.sub(main.getRealNotaxTotalCostRmb(),
												item.getReductionAmount()));

										main.setRealNotaxTotalCostUsa(ComputeUtil.div(main.getRealNotaxTotalCostRmb(),
												main.getRealRate(), 2));

									}
								} else {// 取美金

									// 批复金额 减去 减免的金额 == 实收金额
									if (main.getReplyTaxTotalCostRmb() != null
											&& main.getReplyTaxTotalCostRmb().compareTo(new BigDecimal(0.00)) == 1) {
										// 公司折扣
										main.setRealTaxTotalCostUsa(ComputeUtil.mul(main.getReplyTaxTotalCostUsa(),
												main.getDiscountPercent()));

										// 270 减免70 实收200 比例：200/270
										reductionRate = ComputeUtil.div(main.getRealTaxTotalCostUsa(), ComputeUtil
												.sub(main.getRealTaxTotalCostUsa(), item.getReductionAmount()), 2);
										main.setRealTaxTotalCostUsa(ComputeUtil.sub(main.getRealTaxTotalCostUsa(),
												item.getReductionAmount()));

										main.setRealTaxTotalCostRmb(
												ComputeUtil.mul(main.getRealTaxTotalCostUsa(), main.getRealRate()));
									} else {

										// 公司折扣
										main.setRealNotaxTotalCostUsa(ComputeUtil.mul(main.getReplyNotaxTotalCostUsa(),
												main.getDiscountPercent()));

										// 270 减免70 实收200 比例：200/270
										reductionRate = ComputeUtil.div(main.getRealNotaxTotalCostUsa(), ComputeUtil
												.sub(main.getRealNotaxTotalCostUsa(), item.getReductionAmount()), 2);
										main.setRealNotaxTotalCostUsa(ComputeUtil.sub(main.getRealNotaxTotalCostUsa(),
												item.getReductionAmount()));

										main.setRealNotaxTotalCostRmb(
												ComputeUtil.mul(main.getRealNotaxTotalCostUsa(), main.getRealRate()));

									}
								}

								// 计算明细
								// 查询所有明细
								BillRepairDetailExample brdexample = new BillRepairDetailExample();
								brdexample.createCriteria().andBillIdEqualTo(main.getBillId());

								List<BillRepairDetail> brDetailList = daoDetail.selectByExample(brdexample);
								// 非负数筛选
								List<BillRepairDetail> list1 = brDetailList.stream().filter(d -> {
									if (d.getRealNotaxTotalCostRmb() != null
											&& d.getRealNotaxTotalCostRmb().compareTo(new BigDecimal(0.00)) == 1) {
										return true;
									}
									if (d.getRealNotaxTotalCostUsa() != null
											&& d.getRealNotaxTotalCostUsa().compareTo(new BigDecimal(0.00)) == 1) {
										return true;
									}
									if (d.getRealTaxTotalCostRmb() != null
											&& d.getRealTaxTotalCostRmb().compareTo(new BigDecimal(0.00)) == 1) {
										return true;
									}
									if (d.getRealTaxTotalCostUsa() != null
											&& d.getRealTaxTotalCostUsa().compareTo(new BigDecimal(0.00)) == 1) {
										return true;
									}
									return false;

								}).collect(Collectors.toList());

								// 计算折扣金额 用于还原 原始金额
								BigDecimal amount = new BigDecimal(0);
								BigDecimal amountTmp = new BigDecimal(0);
								BigDecimal amountSum = ComputeUtil.sub(main.getReplyNotaxTotalCostRmb(),
										main.getRealNotaxTotalCostRmb());
								// 减免金额和
								BigDecimal reduceAmountSum = new BigDecimal(0);
								for (int i = 0; i < list1.size(); i++) {
									BillRepairDetail billRepairDetail = list1.get(i);
									// 用箱人Code
									String containerUserCode = "";
									ContainerUserOutput cuoutput = productionFeignClient
											.getContainerUserByKey(billRepairDetail.getContainerUser()).getData();
									if (cuoutput != null) {
										containerUserCode = cuoutput.getContainerUserCode();
									}
									// 判断是否最后一个
									if (i == list1.size() - 1 && list1.size() > 1) {
										// 判断币种
										if (billRepairDetail.getEstCurrencyType()
												.equals(FinanceCurrencyType.CNY.getCode())) {

											if (containerUserCode.equals("COS")) {// 中远不含税
//												if (billRepairDetail.getRealNotaxTotalCostRmb() != null) {
												// 得到折后总结额
												billRepairDetail.setRealNotaxTotalCostRmb(ComputeUtil.sub(
														billRepairDetail.getReplyNotaxTotalCostRmb(),
														ComputeUtil.sub(main.getRealNotaxTotalCostRmb(), amount)));

												billRepairDetail.setRealNotaxTotalCostRmb(
														ComputeUtil.sub(billRepairDetail.getReplyNotaxTotalCostRmb(),
																ComputeUtil.sub(main.getRealNotaxTotalCostRmb(),
																		reduceAmountSum)));

//												}
//												// 计算汇率
//												if (billRepairDetail.getRealNotaxTotalCostUsa() != null) {
												billRepairDetail.setRealNotaxTotalCostUsa(
														ComputeUtil.div(billRepairDetail.getRealNotaxTotalCostRmb(),
																main.getRealRate(), 2));
//												}
												billRepairDetail.setRealTaxTotalCostRmb(null);
												billRepairDetail.setRealTaxTotalCostUsa(null);
											} else {

												billRepairDetail.setRealTaxTotalCostRmb(ComputeUtil.sub(
														billRepairDetail.getReplyTaxTotalCostRmb(),
														ComputeUtil.sub(main.getRealTaxTotalCostRmb(), amount)));

												billRepairDetail.setRealTaxTotalCostRmb(ComputeUtil
														.sub(billRepairDetail.getReplyTaxTotalCostRmb(), ComputeUtil
																.sub(main.getRealTaxTotalCostRmb(), reduceAmountSum)));

												// 计算汇率
												billRepairDetail.setRealTaxTotalCostUsa(
														ComputeUtil.div(billRepairDetail.getRealTaxTotalCostRmb(),
																main.getRealRate(), 2));
											}
										} else {
											if (containerUserCode.equals("COS")) {// 中远不含税
												billRepairDetail.setRealNotaxTotalCostUsa(
														ComputeUtil.sub(main.getRealNotaxTotalCostUsa(), amount));

												billRepairDetail.setRealNotaxTotalCostUsa(ComputeUtil
														.sub(main.getRealNotaxTotalCostUsa(), reduceAmountSum));

												// 计算汇率
												billRepairDetail.setRealNotaxTotalCostRmb(
														ComputeUtil.mul(billRepairDetail.getRealNotaxTotalCostUsa(),
																main.getRealRate()));
											} else {
//												if (billRepairDetail.getRealTaxTotalCostUsa() != null) {
												billRepairDetail.setRealTaxTotalCostUsa(
														ComputeUtil.sub(main.getReplyTaxTotalCostUsa(), amount));

												billRepairDetail.setRealTaxTotalCostUsa(ComputeUtil
														.sub(main.getReplyTaxTotalCostUsa(), reduceAmountSum));

//												}

												// 计算汇率
//												if (billRepairDetail.getRealTaxTotalCostRmb() != null) {
												billRepairDetail.setRealTaxTotalCostRmb(ComputeUtil.mul(
														billRepairDetail.getRealTaxTotalCostUsa(), main.getRealRate()));
//												}
											}
										}
									} else {

										// 判断币种
										if (billRepairDetail.getEstCurrencyType()
												.equals(FinanceCurrencyType.CNY.getCode())) {
											if (containerUserCode.equals("COS")) {// 中远不含税
//												if (billRepairDetail.getRealNotaxTotalCostRmb() != null) {
												amount = ComputeUtil.add(amount, ComputeUtil.mul(
														billRepairDetail.getReplyTaxTotalCostRmb(),
														ComputeUtil.sub(new BigDecimal(1), main.getDiscountPercent())));

												billRepairDetail.setRealNotaxTotalCostRmb(
														ComputeUtil.mul(billRepairDetail.getReplyTaxTotalCostRmb(),
																main.getDiscountPercent()));

												reduceAmountSum = ComputeUtil.add(reduceAmountSum,
														ComputeUtil.mul(billRepairDetail.getRealNotaxTotalCostRmb(),
																ComputeUtil.sub(new BigDecimal(1), reductionRate)));

												billRepairDetail.setRealNotaxTotalCostRmb(ComputeUtil.mul(
														billRepairDetail.getRealNotaxTotalCostRmb(), reductionRate));

//												}
//												// 计算汇率
//												if (billRepairDetail.getRealNotaxTotalCostUsa() != null) {
												billRepairDetail.setRealNotaxTotalCostUsa(
														ComputeUtil.div(billRepairDetail.getRealNotaxTotalCostRmb(),
																main.getRealRate(), 2));
//												}
												billRepairDetail.setRealTaxTotalCostRmb(null);
												billRepairDetail.setRealTaxTotalCostUsa(null);
											} else {
//												if (billRepairDetail.getRealTaxTotalCostRmb() != null) {
												amount = ComputeUtil.add(amount, ComputeUtil.mul(
														billRepairDetail.getReplyTaxTotalCostRmb(),
														ComputeUtil.sub(new BigDecimal(1), main.getDiscountPercent())));
												billRepairDetail.setRealTaxTotalCostRmb(
														ComputeUtil.mul(billRepairDetail.getReplyTaxTotalCostRmb(),
																main.getDiscountPercent()));

												reduceAmountSum = ComputeUtil.add(reduceAmountSum,
														ComputeUtil.mul(billRepairDetail.getRealTaxTotalCostRmb(),
																ComputeUtil.sub(new BigDecimal(1), reductionRate)));

												billRepairDetail.setRealTaxTotalCostRmb(ComputeUtil
														.mul(billRepairDetail.getRealTaxTotalCostRmb(), reductionRate));

//												}
												//
//												// 计算汇率
//												if (billRepairDetail.getRealTaxTotalCostUsa() != null) {
												billRepairDetail.setRealTaxTotalCostUsa(
														ComputeUtil.div(billRepairDetail.getRealTaxTotalCostRmb(),
																main.getRealRate(), 2));
//												}
											}

										} else {
											if (containerUserCode.equals("COS")) {// 中远不含税
//												if (billRepairDetail.getRealNotaxTotalCostUsa() != null) {
												amount = ComputeUtil.add(amount, ComputeUtil.mul(
														billRepairDetail.getReplyTaxTotalCostUsa(),
														ComputeUtil.sub(new BigDecimal(1), main.getDiscountPercent())));
												billRepairDetail.setRealNotaxTotalCostUsa(
														ComputeUtil.mul(billRepairDetail.getReplyTaxTotalCostUsa(),
																main.getDiscountPercent()));

												reduceAmountSum = ComputeUtil.add(reduceAmountSum,
														ComputeUtil.mul(billRepairDetail.getRealNotaxTotalCostUsa(),
																ComputeUtil.sub(new BigDecimal(1), reductionRate)));

												billRepairDetail.setRealNotaxTotalCostUsa(ComputeUtil.mul(
														billRepairDetail.getRealNotaxTotalCostUsa(), reductionRate));

//												}
//												// 计算汇率
//												if (billRepairDetail.getRealNotaxTotalCostRmb() != null) {
												billRepairDetail.setRealNotaxTotalCostRmb(
														ComputeUtil.mul(billRepairDetail.getRealNotaxTotalCostUsa(),
																main.getRealRate()));
//												}

												billRepairDetail.setRealTaxTotalCostRmb(null);
												billRepairDetail.setRealTaxTotalCostUsa(null);
											} else {
//												if (billRepairDetail.getRealTaxTotalCostUsa() != null) {
												amount = ComputeUtil.add(amount, ComputeUtil.mul(
														billRepairDetail.getReplyTaxTotalCostUsa(),
														ComputeUtil.sub(new BigDecimal(1), main.getDiscountPercent())));

												billRepairDetail.setRealTaxTotalCostUsa(
														ComputeUtil.mul(billRepairDetail.getReplyTaxTotalCostUsa(),
																main.getDiscountPercent()));

												reduceAmountSum = ComputeUtil.add(reduceAmountSum,
														ComputeUtil.mul(billRepairDetail.getRealTaxTotalCostUsa(),
																ComputeUtil.sub(new BigDecimal(1), reductionRate)));

												billRepairDetail.setRealTaxTotalCostUsa(ComputeUtil
														.mul(billRepairDetail.getRealTaxTotalCostUsa(), reductionRate));

//												}
												//
//												// 计算汇率
//												if (billRepairDetail.getRealTaxTotalCostRmb() != null) {
												billRepairDetail.setRealTaxTotalCostRmb(ComputeUtil.mul(
														billRepairDetail.getRealTaxTotalCostUsa(), main.getRealRate()));
//												}
											}
										}
									}
									// 更新明细 平分折扣
									daoDetail.updateByPrimaryKey(billRepairDetail);
								}

							}

						}

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
			BillRepair record = dao.selectByPrimaryKey(Integer.parseInt(ids[i]));
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
			BillRepair record = dao.selectByPrimaryKey(Integer.parseInt(ids[i]));
			// 构造主明细到商务结算
			Business bi = new Business();
			bi.setBillCode(record.getBillCode());// 账单号
			bi.setBillMonth(record.getBillMonth());// 月份
			 
			  
			bi.setContainerUser(record.getChargeObject());
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
//			
			bi.setExchangeRate(record.getRealRate());
			bi.setCurrencyType(record.getRealCurrencyType());// 币种

			if (record.getBillType() == 0) {
				bi.setBillType(FinanceBillTypeEnum.GXXLZD.getCode());// 干箱
			} else if (record.getBillType() == 1) {
				bi.setBillType(FinanceBillTypeEnum.LXXLZD.getCode());// 修箱
			} else if (record.getBillType() == 2) {
				bi.setBillType(FinanceBillTypeEnum.BXXLZD.getCode());// 保修
			}

			bi.setContainerUser(record.getChargeObject());
			bi.setMerchantsKey(record.getMerchantsKey()); // 后期需求确定定表结构 用箱人
			bi.setSapid(record.getSapid());
			bi.setSourceBillId(record.getBillId());// 原账单id
			bi.setSourceBillCode(record.getBillCode());// 原账单编号
			bi.setSourceTable("finance_bill_repair");// 原账单表
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
			bi.setChargeInoutType(FinanceBudgetTypeEnum.INCOME.getCode());// 收支类型
			bi.setCreateTime(new Date());
			bi.setCreateUser(getCurrentUserId());
			bi.setIsDel(PlatformConstants.ISDEL_NO);
			bi.setIsEnabled(FinanceIsEnabledEnum.Enabled.getCode());
			bi.setCreateBillUser(record.getCreateUser());
			// 保存主表信息
			businessDao.insert(bi);
			// 构造明细
			BillRepairDetailExample detailBS = new BillRepairDetailExample();
			detailBS.createCriteria().andBillIdEqualTo(record.getBillId());
			List<BillRepairDetail> detailBsList = daoDetail.selectByExample(detailBS);

			// 按核算部门 费用类型汇总
			Map<String, List<BillRepairDetail>> menuGroupMap = detailBsList.stream()
					.collect(Collectors.groupingBy(g -> {
						return g.getDeptKey() + "#" + g.getChargeTypeKey();

					}));
			BigDecimal tmptaxRate = new BigDecimal(0.00);
			BigDecimal tmptaxAmountUsd = new BigDecimal(0.00);
			BigDecimal tmptaxAmountRmb = new BigDecimal(0.00);
			// 开始分类汇总
			for (String key : menuGroupMap.keySet()) {
				List<BillRepairDetail> item = (List<BillRepairDetail>) menuGroupMap.get(key);
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

				BillRepairDetail bsd = item.get(0);

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

				if (!noRmb.equals(0.00)) {// 不含税 是中远的
					bd.setTaxAmount(ComputeUtil.mul(bd.getTaxRate() == null ? new BigDecimal(0.00) : bd.getTaxRate(),
							new BigDecimal(noRmb)));// 税额
					bd.setAmountRmb(new BigDecimal(noRmb));// 人民币
					bd.setAmountUsd(ComputeUtil.div(new BigDecimal(noRmb), bd.getExchangeRate(), 2));// 美金
				} else if (!rmb.equals(0.00)) {// 含税 不是中远的
					bd.setTaxAmount(ComputeUtil.mul(bd.getTaxRate() == null ? new BigDecimal(0.00) : bd.getTaxRate(),
							new BigDecimal(rmb)));// 税额
					bd.setAmountRmb(new BigDecimal(rmb));// 人民币
					bd.setAmountUsd(ComputeUtil.div(new BigDecimal(rmb), bd.getExchangeRate(), 2));// 美金
				} else if (!noUsd.equals(0.00)) {// 含税 不是中远的
					bd.setTaxAmount(ComputeUtil.mul(bd.getTaxRate() == null ? new BigDecimal(0.00) : bd.getTaxRate(),
							new BigDecimal(noUsd)));// 税额
					bd.setAmountRmb(ComputeUtil.mul(new BigDecimal(noUsd), bd.getExchangeRate()));// 人民币
					bd.setAmountUsd(new BigDecimal(noUsd));// 美金
				} else if (!usd.equals(0.00)) {// 含税 不是中远的
					bd.setTaxAmount(ComputeUtil.mul(bd.getTaxRate() == null ? new BigDecimal(0.00) : bd.getTaxRate(),
							new BigDecimal(usd)));// 税额
					bd.setAmountRmb(ComputeUtil.mul(new BigDecimal(usd), bd.getExchangeRate()));// 人民币
					bd.setAmountUsd(new BigDecimal(usd));// 美金
				}

				// 求和汇总 用于更新到主表
				tmptaxAmountRmb = ComputeUtil.add(tmptaxAmountRmb, bd.getAmountRmb());
				tmptaxAmountUsd = ComputeUtil.add(tmptaxAmountUsd, bd.getAmountUsd());
				// 求和汇总 用于更新到主表

				// 根据场站获取公司
				String companyKey = productionFeignClient.queryByKey(bsd.getYard()).getData().getCompany();
				bd.setCompanyKey(companyKey);
				bd.setYard(bsd.getYard());
				bd.setChargeInoutType(bi.getChargeInoutType());
				bd.setInvoiceType(null);
				bd.setInterfaceType(FinanceInterfaceTypeEnum.InterfaceType01.getCode());
				bd.setLegacyDocType(FinanceLegacyTypeEnum.LegacyType01.getMessage());// 中文
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

			// 调用劳务外包生成劳务外包费用
			// 根据账单主表查询明细
			BillRepairDetailExample detailExample = new BillRepairDetailExample();
			detailExample.createCriteria().andBillIdEqualTo(record.getBillId());
			List<BillRepairDetail> listDetail = daoDetail.selectByExample(detailExample);
			// 根据箱类别 箱号进行分组合并
			Map<String, List<BillRepairDetail>> noGroupMap = listDetail.stream().collect(Collectors.groupingBy(g -> {
				return g.getContainerNo() + "#" + g.getContainerCategory();
			}));

			// 开始分类汇总
			for (String key : menuGroupMap.keySet()) {
				List<BillRepairDetail> item = (List<BillRepairDetail>) menuGroupMap.get(key);
				PoolRepairInput wbpool = new PoolRepairInput();
				// 调用劳务外包生成劳务外包费用
				// 每个箱号，箱体、机组是两条外包费，而且成本的付款对象要根据完工班组获取
				// 要看点完工的是外包队还是自己工人，有字段区分，外包的再把供应商信息取过来
				if (item != null && item.size() > 0) {
					// 复制基本属性
					BeanUtils.copyProperties(item.get(0), wbpool);
					wbpool.setPoolType(0);// 修箱0 洗箱1
					wbpool.setValuationHourNumber(null);// 报价工时
					wbpool.setValuationManHourCost(null);// 报价工时费
					wbpool.setValuationMaterialCost(null);// 报价材料费
					wbpool.setValuationMoneyUsd(null);// 报价总费用美金
					wbpool.setValuationMoneyRmb(null);// 报价总费用人民币
					wbpool.setReplyTaxTotalCostUsa(null);// 批复(含税)总费用美金
					wbpool.setReplyTaxTotalCostRmb(null);// 批复(含税)总费用人民币
					wbpool.setReplyNotaxTotalCostUsa(null);// 批复(不含税)总费用美金
					wbpool.setReplyNotaxTotalCostRmb(null);// 批复(不含税)总费用人民币
					wbpool.setRealTaxTotalCostUsa(null);// 实收（美金含税）
					wbpool.setRealNotaxTotalCostUsa(null);// 实收（美金不含税）
					wbpool.setRealTaxTotalCostRmb(null);// 实收（人民币含税）
					wbpool.setRealNotaxTotalCostRmb(null);// 实收（人民币不含税）
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
					// 工时数量
					Double hourNum = item.stream().map(x -> {
						if (x.getValuationHourNumber() == null) {
							return 0.00;
						} else {
							return x.getValuationHourNumber().doubleValue();
						}
					}).reduce(0.00, Double::sum);

					// 工时费
					Double hourCost = item.stream().map(x -> {
						if (x.getValuationManHourCost() == null) {
							return 0.00;
						} else {
							return x.getValuationManHourCost().doubleValue();
						}
					}).reduce(0.00, Double::sum);
					// 材料费
					Double materialCost = item.stream().map(x -> {
						if (x.getValuationMaterialCost() == null) {
							return 0.00;
						} else {
							return x.getValuationMaterialCost().doubleValue();
						}
					}).reduce(0.00, Double::sum);

					// 报价总费用
					Double valuationMoneyUsd = item.stream().map(x -> {
						if (x.getValuationMoneyUsd() == null) {
							return 0.00;
						} else {
							return x.getValuationMoneyUsd().doubleValue();
						}
					}).reduce(0.00, Double::sum);

					// 报价总费用
					Double valuationMoneyRmb = item.stream().map(x -> {
						if (x.getValuationMoneyRmb() == null) {
							return 0.00;
						} else {
							return x.getValuationMoneyRmb().doubleValue();
						}
					}).reduce(0.00, Double::sum);

					wbpool.setReplyTaxTotalCostUsa(ComputeUtil.round(new BigDecimal(usd), 2));// 批复(含税)总费用美金
					wbpool.setReplyTaxTotalCostRmb(ComputeUtil.round(new BigDecimal(rmb), 2));// 批复(含税)总费用人民币
					wbpool.setReplyNotaxTotalCostUsa(ComputeUtil.round(new BigDecimal(noUsd), 2));// 批复(不含税)总费用美金
					wbpool.setReplyNotaxTotalCostRmb(ComputeUtil.round(new BigDecimal(noRmb), 2));// 批复(不含税)总费用人民币
					wbpool.setRealTaxTotalCostUsa(ComputeUtil.round(new BigDecimal(usd), 2));// 实收（美金含税）
					wbpool.setRealNotaxTotalCostUsa(ComputeUtil.round(new BigDecimal(noUsd), 2));// 实收（美金不含税）
					wbpool.setRealTaxTotalCostRmb(ComputeUtil.round(new BigDecimal(rmb), 2));// 实收（人民币含税）
					wbpool.setRealNotaxTotalCostRmb(ComputeUtil.round(new BigDecimal(noRmb), 2));// 实收（人民币不含税）

					wbpool.setValuationHourNumber(ComputeUtil.round(new BigDecimal(hourNum), 2));// 报价工时
					wbpool.setValuationManHourCost(ComputeUtil.round(new BigDecimal(hourCost), 2));// 报价工时费
					wbpool.setValuationMaterialCost(ComputeUtil.round(new BigDecimal(materialCost), 2));// 报价材料费

					wbpool.setValuationMoneyUsd(ComputeUtil.round(new BigDecimal(valuationMoneyUsd), 2));// 报价总费用美金
					wbpool.setValuationMoneyRmb(ComputeUtil.round(new BigDecimal(valuationMoneyRmb), 2));// 报价总费用人民币
					//劳务外包
					poolOutSourceRepairService.wxBillOk(wbpool);
					//成本
					poolSourceRepairService.wxBillOk(wbpool);

				}
			}

			 
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
			BillRepair record = dao.selectByPrimaryKey(Integer.parseInt(ids[i]));
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

			BillRepairDetailExample brdExample = new BillRepairDetailExample();
			brdExample.createCriteria().andBillIdEqualTo(record.getBillId());
			List<BillRepairDetail> listbrd = daoDetail.selectByExample(brdExample);
			// 删除劳务外包费用 判断是否加入账单
			for (BillRepairDetail billRepairDetail : listbrd) {
				PoolOutSourceRepairExample posrExample = new PoolOutSourceRepairExample();
				posrExample.createCriteria().andProdContainerIdEqualTo(billRepairDetail.getProdContainerId())
						.andProdCourseIdEqualTo(billRepairDetail.getProdCourseId()).andItemStatusEqualTo(0)
						.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
				poolOutSourcedao.deleteByExample(posrExample);
			}
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
			BillRepairExample bsexample = new BillRepairExample();
			bsexample.createCriteria().andBillIdIn(idList);
			List<BillRepair> bsList = dao.selectByExample(bsexample);
			for (BillRepair billRepair : bsList) {
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
			BillRepair record = dao.selectByPrimaryKey(Integer.parseInt(ids[i]));
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
			 
			bi.setContainerUser(record.getChargeObject());
			bi.setMerchantsKey(record.getMerchantsKey());
			bi.setSapid(record.getSapid());

			bi.setExchangeRate(record.getRealRate());
			bi.setCurrencyType(record.getRealCurrencyType());// 币种

			if (record.getBillType() == 0) {
				bi.setBillType(FinanceBillTypeEnum.GXXLZD.getCode());// 干箱
			} else if (record.getBillType() == 1) {
				bi.setBillType(FinanceBillTypeEnum.LXXLZD.getCode());// 修箱
			} else if (record.getBillType() == 2) {
				bi.setBillType(FinanceBillTypeEnum.BXXLZD.getCode());// 保修
			}

			bi.setContainerUser(record.getChargeObject());
			bi.setMerchantsKey(record.getMerchantsKey()); // 后期需求确定定表结构 用箱人
			bi.setSapid(record.getSapid());
			bi.setSourceBillId(record.getBillId());// 原账单id
			bi.setSourceBillCode(record.getBillCode());// 原账单编号
			bi.setSourceTable("finance_bill_repair");// 原账单表
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
			businessDao.updateByPrimaryKey(bi);

			// 构造明细
			BillRepairDetailExample detailBS = new BillRepairDetailExample();
			detailBS.createCriteria().andBillIdEqualTo(record.getBillId());
			List<BillRepairDetail> detailBsList = daoDetail.selectByExample(detailBS);

			// 按核算部门 费用类型汇总
			Map<String, List<BillRepairDetail>> menuGroupMap = detailBsList.stream()
					.collect(Collectors.groupingBy(g -> {
						return g.getDeptKey() + "#" + g.getChargeTypeKey();

					}));
			BigDecimal tmptaxRate = new BigDecimal(0.00);
			BigDecimal tmptaxAmountUsd = new BigDecimal(0.00);
			BigDecimal tmptaxAmountRmb = new BigDecimal(0.00);
			// 开始分类汇总
			for (String key : menuGroupMap.keySet()) {
				List<BillRepairDetail> item = (List<BillRepairDetail>) menuGroupMap.get(key);
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

				BillRepairDetail bsd = item.get(0);

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
					bd.setTaxAmount(ComputeUtil.mul(bd.getTaxRate() == null ? new BigDecimal(0.00) : bd.getTaxRate(),
							new BigDecimal(noRmb)));// 税额
					bd.setAmountRmb(new BigDecimal(noRmb));// 人民币
					bd.setAmountUsd(ComputeUtil.div(new BigDecimal(noRmb), bd.getExchangeRate(), 2));// 美金
				} else if (!rmb.equals(0.00)) {// 含税 不是中远的
					bd.setTaxAmount(ComputeUtil.mul(bd.getTaxRate() == null ? new BigDecimal(0.00) : bd.getTaxRate(),
							new BigDecimal(rmb)));// 税额
					bd.setAmountRmb(new BigDecimal(rmb));// 人民币
					bd.setAmountUsd(ComputeUtil.div(new BigDecimal(rmb), bd.getExchangeRate(), 2));// 美金
				} else if (!noUsd.equals(0.00)) {// 含税 不是中远的
					bd.setTaxAmount(ComputeUtil.mul(bd.getTaxRate() == null ? new BigDecimal(0.00) : bd.getTaxRate(),
							new BigDecimal(noUsd)));// 税额
					bd.setAmountRmb(ComputeUtil.mul(new BigDecimal(noUsd), bd.getExchangeRate()));// 人民币
					bd.setAmountUsd(new BigDecimal(noUsd));// 美金
				} else if (!usd.equals(0.00)) {// 含税 不是中远的
					bd.setTaxAmount(ComputeUtil.mul(bd.getTaxRate() == null ? new BigDecimal(0.00) : bd.getTaxRate(),
							new BigDecimal(usd)));// 税额
					bd.setAmountRmb(ComputeUtil.mul(new BigDecimal(usd), bd.getExchangeRate()));// 人民币
					bd.setAmountUsd(new BigDecimal(usd));// 美金
				}

				// 求和汇总 用于更新到主表
				tmptaxAmountRmb = ComputeUtil.add(tmptaxAmountRmb, bd.getAmountRmb());
				tmptaxAmountUsd = ComputeUtil.add(tmptaxAmountUsd, bd.getAmountUsd());
				// 求和汇总 用于更新到主表

				// 根据场站获取公司
				String companyKey = productionFeignClient.queryByKey(bsd.getYard()).getData().getCompany();
				bd.setCompanyKey(companyKey);
				bd.setYard(bsd.getYard());
				bd.setChargeInoutType(bi.getChargeInoutType());
				bd.setInvoiceType(null);
				bd.setInterfaceType(FinanceInterfaceTypeEnum.InterfaceType01.getCode());
				bd.setLegacyDocType(FinanceLegacyTypeEnum.LegacyType02.getMessage());// 中文
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

			// 调用劳务外包生成劳务外包费用
			// 根据账单主表查询明细
			BillRepairDetailExample detailExample = new BillRepairDetailExample();
			detailExample.createCriteria().andBillIdEqualTo(record.getBillId());
			List<BillRepairDetail> listDetail = daoDetail.selectByExample(detailExample);
			// 根据箱类别 箱号进行分组合并
			Map<String, List<BillRepairDetail>> noGroupMap = listDetail.stream().collect(Collectors.groupingBy(g -> {
				return g.getContainerNo() + "#" + g.getContainerCategory();
			}));

			// 开始分类汇总
			for (String key : menuGroupMap.keySet()) {
				List<BillRepairDetail> item = (List<BillRepairDetail>) menuGroupMap.get(key);
				PoolRepairInput wbpool = new PoolRepairInput();
				// 调用劳务外包生成劳务外包费用
				// 每个箱号，箱体、机组是两条外包费，而且成本的付款对象要根据完工班组获取
				// 要看点完工的是外包队还是自己工人，有字段区分，外包的再把供应商信息取过来
				if (item != null && item.size() > 0) {
					// 复制基本属性
					BeanUtils.copyProperties(item.get(0), wbpool);
					wbpool.setPoolType(0);// 修箱0 洗箱1
					wbpool.setValuationHourNumber(null);// 报价工时
					wbpool.setValuationManHourCost(null);// 报价工时费
					wbpool.setValuationMaterialCost(null);// 报价材料费
					wbpool.setValuationMoneyUsd(null);// 报价总费用美金
					wbpool.setValuationMoneyRmb(null);// 报价总费用人民币
					wbpool.setReplyTaxTotalCostUsa(null);// 批复(含税)总费用美金
					wbpool.setReplyTaxTotalCostRmb(null);// 批复(含税)总费用人民币
					wbpool.setReplyNotaxTotalCostUsa(null);// 批复(不含税)总费用美金
					wbpool.setReplyNotaxTotalCostRmb(null);// 批复(不含税)总费用人民币
					wbpool.setRealTaxTotalCostUsa(null);// 实收（美金含税）
					wbpool.setRealNotaxTotalCostUsa(null);// 实收（美金不含税）
					wbpool.setRealTaxTotalCostRmb(null);// 实收（人民币含税）
					wbpool.setRealNotaxTotalCostRmb(null);// 实收（人民币不含税）
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
					// 工时数量
					Double hourNum = item.stream().map(x -> {
						if (x.getValuationHourNumber() == null) {
							return 0.00;
						} else {
							return x.getValuationHourNumber().doubleValue();
						}
					}).reduce(0.00, Double::sum);

					// 工时费
					Double hourCost = item.stream().map(x -> {
						if (x.getValuationManHourCost() == null) {
							return 0.00;
						} else {
							return x.getValuationManHourCost().doubleValue();
						}
					}).reduce(0.00, Double::sum);
					// 材料费
					Double materialCost = item.stream().map(x -> {
						if (x.getValuationMaterialCost() == null) {
							return 0.00;
						} else {
							return x.getValuationMaterialCost().doubleValue();
						}
					}).reduce(0.00, Double::sum);

					// 报价总费用
					Double valuationMoneyUsd = item.stream().map(x -> {
						if (x.getValuationMoneyUsd() == null) {
							return 0.00;
						} else {
							return x.getValuationMoneyUsd().doubleValue();
						}
					}).reduce(0.00, Double::sum);

					// 报价总费用
					Double valuationMoneyRmb = item.stream().map(x -> {
						if (x.getValuationMoneyRmb() == null) {
							return 0.00;
						} else {
							return x.getValuationMoneyRmb().doubleValue();
						}
					}).reduce(0.00, Double::sum);

					wbpool.setReplyTaxTotalCostUsa(ComputeUtil.round(new BigDecimal(usd), 2));// 批复(含税)总费用美金
					wbpool.setReplyTaxTotalCostRmb(ComputeUtil.round(new BigDecimal(rmb), 2));// 批复(含税)总费用人民币
					wbpool.setReplyNotaxTotalCostUsa(ComputeUtil.round(new BigDecimal(noUsd), 2));// 批复(不含税)总费用美金
					wbpool.setReplyNotaxTotalCostRmb(ComputeUtil.round(new BigDecimal(noRmb), 2));// 批复(不含税)总费用人民币
					wbpool.setRealTaxTotalCostUsa(ComputeUtil.round(new BigDecimal(usd), 2));// 实收（美金含税）
					wbpool.setRealNotaxTotalCostUsa(ComputeUtil.round(new BigDecimal(noUsd), 2));// 实收（美金不含税）
					wbpool.setRealTaxTotalCostRmb(ComputeUtil.round(new BigDecimal(rmb), 2));// 实收（人民币含税）
					wbpool.setRealNotaxTotalCostRmb(ComputeUtil.round(new BigDecimal(noRmb), 2));// 实收（人民币不含税）

					wbpool.setValuationHourNumber(ComputeUtil.round(new BigDecimal(hourNum), 2));// 报价工时
					wbpool.setValuationManHourCost(ComputeUtil.round(new BigDecimal(hourCost), 2));// 报价工时费
					wbpool.setValuationMaterialCost(ComputeUtil.round(new BigDecimal(materialCost), 2));// 报价材料费

					wbpool.setValuationMoneyUsd(ComputeUtil.round(new BigDecimal(valuationMoneyUsd), 2));// 报价总费用美金
					wbpool.setValuationMoneyRmb(ComputeUtil.round(new BigDecimal(valuationMoneyRmb), 2));// 报价总费用人民币

					poolOutSourceRepairService.wxBillOk(wbpool);
					//成本
					poolSourceRepairService.wxBillOk(wbpool);

				}
			}

		}

		return true;
	}

	/**
	 * 账单明细查询
	 */
	@Override
	public List<BillRepairDetailOutput> listDetail(SearchBaseInput input) {
		// TODO Auto-generated method stub
		BillRepairDetailExample example = new BillRepairDetailExample();
		BillRepairDetailExample.Criteria criteria = example.createCriteria();
		// 过滤掉删除的记录
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO)
				.andIsEnabledEqualTo(FinanceIsEnabledEnum.Enabled.getCode());
		// 账单主键
		if (input.getPid() != null) {
			criteria.andBillIdEqualTo(input.getPid());
		}

		example.setOrderByClause(" `create_time` DESC");
		List<BillRepairDetail> list = daoDetail.selectByExample(example);
		List<BillRepairDetailOutput> outputList = list.stream().map(a -> {// 创建日期倒序排列
			BillRepairDetailOutput output = new BillRepairDetailOutput();
			// 复制属性值到新对象
			BeanUtils.copyProperties(a, output);

			output.setContainerCategoryNameLang(a.getContainerCategory());// 箱类别
			output.setIsEnabledNameLang(a.getIsEnabled());// 是否有效
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
	public List<PoolRepairOutput> listPoolDetail(SearchBaseInput input) {
		// TODO Auto-generated method stub
		PoolRepairExample example = new PoolRepairExample();
		PoolRepairExample.Criteria criteria = example.createCriteria();
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
		List<PoolRepair> list = daoPool.selectByExample(example);
		List<PoolRepairOutput> outputList = list.stream().map(a -> {// 创建日期倒序排列
			PoolRepairOutput output = new PoolRepairOutput();
			// 复制属性值到新对象
			BeanUtils.copyProperties(a, output);

			output.setContainerCategoryNameLang(a.getContainerCategory());// 箱类别
			output.setIsEnabledNameLang(a.getIsEnabled());// 是否有效
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
	 * 批量删除账单明细 还原费用池状态
	 */
	@Override
	public Boolean deleteDetail(String[] ids) {
		// TODO Auto-generated method stub

		// 查询主表信息
		BillRepair main = new BillRepair();
		// 总金额统计
		for (int i = 0; i < ids.length; i++) {
			BillRepairDetail record = daoDetail.selectByPrimaryKey(Integer.parseInt(ids[i]));

			main = dao.selectByPrimaryKey(record.getBillId());

			daoDetail.deleteByPrimaryKey(Integer.parseInt(ids[i]));
			// 还原费用池状态
			PoolRepair pool = daoPool.selectByPrimaryKey(record.getPoolId());
			pool.setItemStatus(0);// 未加入
			daoPool.updateByPrimaryKey(pool);
			// 更新总费用
			main.setValuationMoneyRmb(ComputeUtil.sub(main.getValuationMoneyRmb(), pool.getValuationMoneyRmb()));
			main.setValuationMoneyUsd(ComputeUtil.sub(main.getValuationMoneyUsd(), pool.getValuationMoneyUsd()));
			// 工时费 材料费 批复费用
			main.setValuationManHourCost(
					ComputeUtil.sub(main.getValuationManHourCost(), pool.getValuationManHourCost()));
			main.setValuationMaterialCost(
					ComputeUtil.sub(main.getValuationMaterialCost(), pool.getValuationMaterialCost()));
			main.setNumber(ComputeUtil.sub(main.getNumber(), new BigDecimal(1)));

			// 更新总费用

			// 批复含税美金 reply_tax_total_cost_usa
			main.setReplyTaxTotalCostUsa(ComputeUtil.sub(
					main.getReplyTaxTotalCostUsa() == null ? new BigDecimal(0.00) : main.getReplyTaxTotalCostUsa(),
					pool.getReplyTaxTotalCostUsa() == null ? new BigDecimal(0.00) : pool.getReplyTaxTotalCostUsa()));
			// 批复含税 人民币reply_tax_total_cost_rmb
			main.setReplyTaxTotalCostRmb(ComputeUtil.sub(
					main.getReplyTaxTotalCostRmb() == null ? new BigDecimal(0.00) : main.getReplyTaxTotalCostRmb(),
					pool.getReplyTaxTotalCostRmb() == null ? new BigDecimal(0.00) : pool.getReplyTaxTotalCostRmb()));
			// 批复(不含税)总费用美金 reply_notax_total_cost_usa
			main.setReplyNotaxTotalCostUsa(ComputeUtil.sub(
					main.getReplyNotaxTotalCostUsa() == null ? new BigDecimal(0.00) : main.getReplyNotaxTotalCostUsa(),
					pool.getReplyNotaxTotalCostUsa() == null ? new BigDecimal(0.00)
							: pool.getReplyNotaxTotalCostUsa()));
			// 批复(不含税)总费用人民币reply_notax_total_cost_rmb
			main.setReplyNotaxTotalCostRmb(ComputeUtil.sub(
					main.getReplyNotaxTotalCostRmb() == null ? new BigDecimal(0.00) : main.getReplyNotaxTotalCostRmb(),
					pool.getReplyNotaxTotalCostRmb() == null ? new BigDecimal(0.00)
							: pool.getReplyNotaxTotalCostRmb()));

			// 更新主表
			dao.updateByPrimaryKey(main);

		}
		// 查询是否还有明细 没有明细，修改账单状态为已生成
		BillRepairDetailExample example = new BillRepairDetailExample();
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
			PoolRepair record = daoPool.selectByPrimaryKey(Integer.parseInt(ids[i]));
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
		BillRepair main = dao.selectByPrimaryKey(billId);
		BigDecimal rateAmountRmb = new BigDecimal(0.00);
		BigDecimal rateAmountUsa = new BigDecimal(0.00);

		// 费用池数据 插入到账单明细中
		for (int i = 0; i < ids.length; i++) {
			PoolRepair pool = daoPool.selectByPrimaryKey(Integer.parseInt(ids[i]));
			BillRepairDetail record = new BillRepairDetail();
			BeanUtils.copyProperties(pool, record);
			record.setBillType(pool.getPoolType());
			record.setPoolId(pool.getId());
			record.setBillId(billId);
			if (daoDetail.insert(record) > 0) {
				pool.setItemStatus(1);// 加入账单
				daoPool.updateByPrimaryKey(pool); // 更新加入状态
			}

			// 更新总费用
			main.setValuationMoneyRmb(ComputeUtil.add(
					main.getValuationMoneyRmb() == null ? new BigDecimal(0.00) : main.getValuationMoneyRmb(),
					pool.getValuationMoneyRmb() == null ? new BigDecimal(0.00) : pool.getValuationMoneyRmb()));
			main.setValuationMoneyUsd(ComputeUtil.add(
					main.getValuationMoneyUsd() == null ? new BigDecimal(0.00) : main.getValuationMoneyUsd(),
					pool.getValuationMoneyUsd() == null ? new BigDecimal(0.00) : pool.getValuationMoneyUsd()));
			// 工时费
			main.setValuationManHourCost(ComputeUtil.add(
					main.getValuationManHourCost() == null ? new BigDecimal(0.00) : main.getValuationManHourCost(),
					pool.getValuationManHourCost() == null ? new BigDecimal(0.00) : pool.getValuationManHourCost()));
			// 材料费
			main.setValuationMaterialCost(ComputeUtil.add(
					main.getValuationMaterialCost() == null ? new BigDecimal(0.00) : main.getValuationMaterialCost(),
					pool.getValuationMaterialCost() == null ? new BigDecimal(0.00) : pool.getValuationMaterialCost()));
			// 用箱人Code
			String containerUserCode = "";
			ContainerUserOutput cuoutput = productionFeignClient.getContainerUserByKey(record.getContainerUser())
					.getData();
			if (cuoutput != null) {
				containerUserCode = cuoutput.getContainerUserCode();
			}
			if (containerUserCode.equals("COS")) {// 中远不含税
				// 批复(不含税)总费用美金 reply_notax_total_cost_usa
				main.setReplyNotaxTotalCostUsa(ComputeUtil.add(
						main.getReplyNotaxTotalCostUsa() == null ? new BigDecimal(0.00)
								: main.getReplyNotaxTotalCostUsa(),
						pool.getReplyTaxTotalCostUsa() == null ? new BigDecimal(0.00)
								: pool.getReplyTaxTotalCostUsa()));
				// 批复(不含税)总费用人民币reply_notax_total_cost_rmb
				main.setReplyNotaxTotalCostRmb(ComputeUtil.add(
						main.getReplyNotaxTotalCostRmb() == null ? new BigDecimal(0.00)
								: main.getReplyNotaxTotalCostRmb(),
						pool.getReplyTaxTotalCostRmb() == null ? new BigDecimal(0.00)
								: pool.getReplyTaxTotalCostRmb()));
			} else {
				// 批复含税美金 reply_tax_total_cost_usa
				main.setReplyTaxTotalCostUsa(ComputeUtil.add(
						main.getReplyTaxTotalCostUsa() == null ? new BigDecimal(0.00) : main.getReplyTaxTotalCostUsa(),
						pool.getReplyTaxTotalCostUsa() == null ? new BigDecimal(0.00)
								: pool.getReplyTaxTotalCostUsa()));
				// 批复含税 人民币reply_tax_total_cost_rmb
				main.setReplyTaxTotalCostRmb(ComputeUtil.add(
						main.getReplyTaxTotalCostRmb() == null ? new BigDecimal(0.00) : main.getReplyTaxTotalCostRmb(),
						pool.getReplyTaxTotalCostRmb() == null ? new BigDecimal(0.00)
								: pool.getReplyTaxTotalCostRmb()));
			}

			// 折扣百分比 discount_percent
			// 查询折扣
			BaseDiscountExample discountExample = new BaseDiscountExample();
			discountExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
					.andIsEnabledEqualTo(FinanceIsEnabledEnum.Enabled.getCode()).andYardEqualTo(pool.getYard())
					.andContainerUserEqualTo(pool.getContainerUser());
			List<BaseDiscount> bdList = discountDao.selectByExample(discountExample);
			if (bdList != null && bdList.size() > 0) {
				if (pool.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_01.getCode())) {// 干箱
					main.setDiscountPercent(bdList.get(0).getDiscountGx());
				} else if (pool.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_02.getCode())) {// 箱体
					main.setDiscountPercent(bdList.get(0).getDiscountXt());
				} else if (pool.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_03.getCode())) {// 机组
					main.setDiscountPercent(bdList.get(0).getDiscountJz());
				}
			} else {// 默认为1
				main.setDiscountPercent(new BigDecimal(1));
			}
			// 报价币种 est_currency_type
			main.setEstCurrencyType(pool.getEstCurrencyType());
			// 实收币种 real_currency_type
			main.setRealCurrencyType(pool.getEstCurrencyType());
			// 实收汇率real_rate
			main.setRealRate(pool.getRealRate());

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
			if (!StringUtils.isEmpty(main.getTaxRate())) {
				// 人民币
				rateAmountRmb = ComputeUtil.add(rateAmountRmb, ComputeUtil.mul(
						pool.getReplyTaxTotalCostRmb() == null ? new BigDecimal(0.00) : pool.getReplyTaxTotalCostRmb(),
						main.getTaxRate()));
				// 美金
				rateAmountUsa = ComputeUtil.add(rateAmountUsa, ComputeUtil.mul(
						pool.getReplyTaxTotalCostUsa() == null ? new BigDecimal(0.00) : pool.getReplyTaxTotalCostUsa(),
						main.getTaxRate()));
			}

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
		BigDecimal discountAmount = new BigDecimal(0);
		// 计算 折扣金额
		if (!StringUtils.isEmpty(main.getDiscountPercent())) {
			// 判断报价币种 计算金额
			if (main.getEstCurrencyType().equals(FinanceCurrencyType.CNY.getCode())) {// 人民币

				// 批复金额 减去 减免的金额 == 实收金额
				if (main.getReplyTaxTotalCostRmb() != null
						&& main.getReplyTaxTotalCostRmb().compareTo(new BigDecimal(0.00)) == 1) {
//					// 折扣金额
//					discountAmount = ComputeUtil.mul(main.getReplyTaxTotalCostRmb(),
//							ComputeUtil.sub(new BigDecimal(1), main.getDiscountPercent()));
					main.setRealTaxTotalCostRmb(
							ComputeUtil.mul(main.getReplyTaxTotalCostRmb(), main.getDiscountPercent()));
					main.setRealTaxTotalCostUsa(ComputeUtil.div(main.getRealTaxTotalCostRmb(), main.getRealRate(), 2));

				} else {
//					// 折扣金额
//					discountAmount = ComputeUtil.mul(main.getReplyNotaxTotalCostRmb(),
//							ComputeUtil.sub(new BigDecimal(1), main.getDiscountPercent()));
					main.setRealNotaxTotalCostRmb(
							ComputeUtil.mul(main.getReplyNotaxTotalCostRmb(), main.getDiscountPercent()));
					main.setRealNotaxTotalCostUsa(
							ComputeUtil.div(main.getRealNotaxTotalCostRmb(), main.getRealRate(), 2));

				}
			} else {// 取美金

				// 批复金额 减去 减免的金额 == 实收金额
				if (main.getReplyTaxTotalCostRmb() != null
						&& main.getReplyTaxTotalCostRmb().compareTo(new BigDecimal(0.00)) == 1) {
//					discountAmount = ComputeUtil.mul(main.getReplyTaxTotalCostUsa(),
//							ComputeUtil.sub(new BigDecimal(1), main.getDiscountPercent()));
					main.setRealTaxTotalCostUsa(
							ComputeUtil.mul(main.getReplyTaxTotalCostUsa(), main.getDiscountPercent()));
					main.setRealTaxTotalCostRmb(ComputeUtil.mul(main.getRealTaxTotalCostUsa(), main.getRealRate()));
				} else {
//					discountAmount = ComputeUtil.mul(main.getReplyNotaxTotalCostUsa(),
//							ComputeUtil.sub(new BigDecimal(1), main.getDiscountPercent()));
					main.setRealNotaxTotalCostUsa(
							ComputeUtil.mul(main.getReplyNotaxTotalCostUsa(), main.getDiscountPercent()));
					main.setRealNotaxTotalCostRmb(ComputeUtil.mul(main.getRealNotaxTotalCostUsa(), main.getRealRate()));

				}
			}
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
//		main.setRealTaxTotalCostRmb(main.getReplyTaxTotalCostRmb());
//		// 实收（美金含税）real_tax_total_cost_usa
//		main.setRealTaxTotalCostUsa(main.getReplyTaxTotalCostUsa());
//		// 实收（人民币不含税）real_notax_total_cost_rmb
//		main.setRealNotaxTotalCostRmb(main.getReplyNotaxTotalCostRmb());
//		// 实收（美金不含税）real_notax_total_cost_usa
//		main.setRealNotaxTotalCostUsa(main.getReplyNotaxTotalCostUsa());

		// 数量（箱量）number
		// 查询明细 根据进场id分组求箱量
		BillRepairDetailExample brdExample = new BillRepairDetailExample();
		brdExample.createCriteria().andBillIdEqualTo(billId);
		List<BillRepairDetail> brdList = daoDetail.selectByExample(brdExample);

		Map<String, List<BillRepairDetail>> numGroupMap = brdList.stream()
				.collect(Collectors.groupingBy(BillRepairDetail::getProdCourseId));
		main.setNumber(new BigDecimal(numGroupMap.size()));

		// 更新主表
		dao.updateByPrimaryKey(main);
		// 明细平分折扣金额 最后一个不全金额

		if (main.getDiscountPercent() != null && main.getDiscountPercent().compareTo(new BigDecimal(1)) != 0) {
			// 查询所有明细
			BillRepairDetailExample brdexample = new BillRepairDetailExample();
			brdexample.createCriteria().andBillIdEqualTo(billId);

			List<BillRepairDetail> brDetailList = daoDetail.selectByExample(brdexample);
			// 非负数筛选
			List<BillRepairDetail> list1 = brDetailList.stream().filter(d -> {
				if (d.getRealNotaxTotalCostRmb() != null
						&& d.getRealNotaxTotalCostRmb().compareTo(new BigDecimal(0.00)) == 1) {
					return true;
				}
				if (d.getRealNotaxTotalCostUsa() != null
						&& d.getRealNotaxTotalCostUsa().compareTo(new BigDecimal(0.00)) == 1) {
					return true;
				}
				if (d.getRealTaxTotalCostRmb() != null
						&& d.getRealTaxTotalCostRmb().compareTo(new BigDecimal(0.00)) == 1) {
					return true;
				}
				if (d.getRealTaxTotalCostUsa() != null
						&& d.getRealTaxTotalCostUsa().compareTo(new BigDecimal(0.00)) == 1) {
					return true;
				}
				return false;

			}).collect(Collectors.toList());

			Integer num = list1.size();
			// 计算折扣金额 用于还原 原始金额
//			BigDecimal tmpMoney = ComputeUtil.div(discountAmount, new BigDecimal(num), 2);// 求平均数
			BigDecimal amount = new BigDecimal(0);
			BigDecimal amountSum = ComputeUtil.sub(main.getReplyNotaxTotalCostRmb(), main.getRealNotaxTotalCostRmb());
			for (int i = 0; i < list1.size(); i++) {
				BillRepairDetail billRepairDetail = list1.get(i);
				// 用箱人Code
				String containerUserCode = "";
				ContainerUserOutput cuoutput = productionFeignClient
						.getContainerUserByKey(billRepairDetail.getContainerUser()).getData();
				if (cuoutput != null) {
					containerUserCode = cuoutput.getContainerUserCode();
				}
				// 判断是否最后一个
				if (i == list1.size() - 1 && list1.size() > 1) {
					// 判断币种
					if (billRepairDetail.getEstCurrencyType().equals(FinanceCurrencyType.CNY.getCode())) {

						if (containerUserCode.equals("COS")) {// 中远不含税
//							if (billRepairDetail.getRealNotaxTotalCostRmb() != null) {

							// 得到折后总结额
							billRepairDetail.setRealNotaxTotalCostRmb(
									ComputeUtil.sub(billRepairDetail.getReplyTaxTotalCostRmb(),
											ComputeUtil.sub(main.getRealTaxTotalCostRmb(), amount)));

//							}
//							// 计算汇率
//							if (billRepairDetail.getRealNotaxTotalCostUsa() != null) {
							billRepairDetail.setRealNotaxTotalCostUsa(
									ComputeUtil.div(billRepairDetail.getRealTaxTotalCostRmb(), main.getRealRate(), 2));
//							}
							billRepairDetail.setRealTaxTotalCostRmb(null);
							billRepairDetail.setRealTaxTotalCostUsa(null);
						} else {

//							if (billRepairDetail.getRealTaxTotalCostRmb() != null) {
//								amount=ComputeUtil.add(amount, ComputeUtil.mul(billRepairDetail.getRealTaxTotalCostRmb(),ComputeUtil.sub(new BigDecimal(1), main.getDiscountPercent())));

							billRepairDetail
									.setRealTaxTotalCostRmb(ComputeUtil.sub(billRepairDetail.getReplyTaxTotalCostRmb(),
											ComputeUtil.sub(main.getRealTaxTotalCostRmb(), amount)));

//							}

							// 计算汇率
//							if (billRepairDetail.getRealTaxTotalCostUsa() != null) {
							billRepairDetail.setRealTaxTotalCostUsa(
									ComputeUtil.div(billRepairDetail.getRealTaxTotalCostRmb(), main.getRealRate(), 2));
//							}
						}
					} else {
						if (containerUserCode.equals("COS")) {// 中远不含税
//							if (billRepairDetail.getRealNotaxTotalCostUsa() != null) {
//								amount=ComputeUtil.add(amount, ComputeUtil.mul(billRepairDetail.getRealNotaxTotalCostUsa(),ComputeUtil.sub(new BigDecimal(1), main.getDiscountPercent())));
							billRepairDetail
									.setRealNotaxTotalCostUsa(ComputeUtil.sub(main.getRealTaxTotalCostUsa(), amount));
//							}
							// 计算汇率
//							if (billRepairDetail.getRealNotaxTotalCostRmb() != null) {
							billRepairDetail.setRealNotaxTotalCostRmb(
									ComputeUtil.mul(billRepairDetail.getRealTaxTotalCostUsa(), main.getRealRate()));
//							}
							billRepairDetail.setRealTaxTotalCostRmb(null);
							billRepairDetail.setRealTaxTotalCostUsa(null);
						} else {
//							if (billRepairDetail.getRealTaxTotalCostUsa() != null) {
//								amount=ComputeUtil.add(amount, ComputeUtil.mul(billRepairDetail.getRealTaxTotalCostUsa(),ComputeUtil.sub(new BigDecimal(1), main.getDiscountPercent())));
							billRepairDetail
									.setRealTaxTotalCostUsa(ComputeUtil.sub(main.getReplyTaxTotalCostUsa(), amount));
//							}

							// 计算汇率
//							if (billRepairDetail.getRealNotaxTotalCostRmb() != null) {
							billRepairDetail.setRealNotaxTotalCostRmb(
									ComputeUtil.mul(billRepairDetail.getRealTaxTotalCostUsa(), main.getRealRate()));
//							}
						}
					}
				} else {

					// 判断币种
					if (billRepairDetail.getEstCurrencyType().equals(FinanceCurrencyType.CNY.getCode())) {
						if (containerUserCode.equals("COS")) {// 中远不含税
//							if (billRepairDetail.getRealNotaxTotalCostRmb() != null) {
							amount = ComputeUtil.add(amount, ComputeUtil.mul(billRepairDetail.getReplyTaxTotalCostRmb(),
									ComputeUtil.sub(new BigDecimal(1), main.getDiscountPercent())));
							billRepairDetail.setRealNotaxTotalCostRmb(ComputeUtil
									.mul(billRepairDetail.getReplyTaxTotalCostRmb(), main.getDiscountPercent()));
//							}
							// 计算汇率
//							if (billRepairDetail.getRealNotaxTotalCostUsa() != null) {
							billRepairDetail.setRealNotaxTotalCostUsa(
									ComputeUtil.div(billRepairDetail.getRealTaxTotalCostRmb(), main.getRealRate(), 2));
//							}
							billRepairDetail.setRealTaxTotalCostRmb(null);
							billRepairDetail.setRealTaxTotalCostUsa(null);
						} else {
//							if (billRepairDetail.getRealTaxTotalCostRmb() != null) {
							amount = ComputeUtil.add(amount, ComputeUtil.mul(billRepairDetail.getReplyTaxTotalCostRmb(),
									ComputeUtil.sub(new BigDecimal(1), main.getDiscountPercent())));
							billRepairDetail.setRealTaxTotalCostRmb(ComputeUtil
									.mul(billRepairDetail.getReplyTaxTotalCostRmb(), main.getDiscountPercent()));
//							}

							// 计算汇率
//							if (billRepairDetail.getRealTaxTotalCostUsa() != null) {
							billRepairDetail.setRealTaxTotalCostUsa(
									ComputeUtil.div(billRepairDetail.getRealTaxTotalCostRmb(), main.getRealRate(), 2));
//							}
						}

					} else {
						if (containerUserCode.equals("COS")) {// 中远不含税
//							if (billRepairDetail.getRealNotaxTotalCostUsa() != null) {
							amount = ComputeUtil.add(amount, ComputeUtil.mul(billRepairDetail.getReplyTaxTotalCostUsa(),
									ComputeUtil.sub(new BigDecimal(1), main.getDiscountPercent())));
							billRepairDetail.setRealNotaxTotalCostUsa(ComputeUtil
									.mul(billRepairDetail.getReplyTaxTotalCostUsa(), main.getDiscountPercent()));
//							}
//							// 计算汇率
//							if (billRepairDetail.getRealNotaxTotalCostRmb() != null) {
							billRepairDetail.setRealNotaxTotalCostRmb(
									ComputeUtil.mul(billRepairDetail.getRealTaxTotalCostUsa(), main.getRealRate()));
//							}
							billRepairDetail.setRealTaxTotalCostRmb(null);
							billRepairDetail.setRealTaxTotalCostUsa(null);
						} else {
//							if (billRepairDetail.getRealTaxTotalCostUsa() != null) {
							amount = ComputeUtil.add(amount, ComputeUtil.mul(billRepairDetail.getReplyTaxTotalCostUsa(),
									ComputeUtil.sub(new BigDecimal(1), main.getDiscountPercent())));

							billRepairDetail.setRealTaxTotalCostUsa(ComputeUtil
									.mul(billRepairDetail.getReplyTaxTotalCostUsa(), main.getDiscountPercent()));
//							}
//
//							// 计算汇率
//							if (billRepairDetail.getRealTaxTotalCostRmb() != null) {
							billRepairDetail.setRealTaxTotalCostRmb(
									ComputeUtil.mul(billRepairDetail.getRealTaxTotalCostUsa(), main.getRealRate()));
//							}
						}
					}
				}
				// 更新明细 平分折扣
				daoDetail.updateByPrimaryKey(billRepairDetail);
			}
		}
		BillRepairDetailExample example = new BillRepairDetailExample();
		example.createCriteria().andBillIdEqualTo(main.getBillId());
		long count = daoDetail.countByExample(example);
		if (count > 0) {// 更新账单状态为待审核
			main.setBillStatus(FinanceBillStatusEnum.NOAUDITOR.getCode());
			dao.updateByPrimaryKey(main);
		}
		return true;
	}

	/**
	 * 刷新明细折扣
	 */
	@Override
	public Boolean refreshDiscount(Integer billId) {
		// TODO Auto-generated method stub
		// 查询主表信息
		BillRepair main = dao.selectByPrimaryKey(billId);
		// 还原打折前的费用 重新计算打折
		if (main.getDiscountPercent() != null && main.getDiscountPercent().compareTo(new BigDecimal(1)) != 0) {
			// 查询所有明细

			BillRepairDetailExample brdexample = new BillRepairDetailExample();
			brdexample.createCriteria().andBillIdEqualTo(main.getBillId());

			List<BillRepairDetail> brDetailList = daoDetail.selectByExample(brdexample);
			// 非负数筛选

			List<BillRepairDetail> list1 = brDetailList.stream().filter(d -> {
				if (d.getRealNotaxTotalCostRmb() != null
						&& d.getRealNotaxTotalCostRmb().compareTo(new BigDecimal(0.00)) == 1) {
					return true;
				}
				if (d.getRealNotaxTotalCostUsa() != null
						&& d.getRealNotaxTotalCostUsa().compareTo(new BigDecimal(0.00)) == 1) {
					return true;
				}
				if (d.getRealTaxTotalCostRmb() != null
						&& d.getRealTaxTotalCostRmb().compareTo(new BigDecimal(0.00)) == 1) {
					return true;
				}
				if (d.getRealTaxTotalCostUsa() != null
						&& d.getRealTaxTotalCostUsa().compareTo(new BigDecimal(0.00)) == 1) {
					return true;
				}
				return false;

			}).collect(Collectors.toList());
			if (list1 != null && list1.size() > 0) {
				Integer num = list1.size();

				// 更新新折扣
				BillRepairDetail billRepairDetail = list1.get(0);

				// 查询折扣
				BaseDiscountExample discountExample = new BaseDiscountExample();
				discountExample.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
						.andIsEnabledEqualTo(FinanceIsEnabledEnum.Enabled.getCode())
						.andYardEqualTo(billRepairDetail.getYard())
						.andContainerUserEqualTo(billRepairDetail.getContainerUser());
				List<BaseDiscount> bdList = discountDao.selectByExample(discountExample);
				if (bdList != null && bdList.size() > 0) {
					if (billRepairDetail.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_01.getCode())) {// 干箱
						main.setDiscountPercent(bdList.get(0).getDiscountGx());
					} else if (billRepairDetail.getContainerCategory()
							.equals(ContainerCategoryEnum.CONTAINER_02.getCode())) {// 箱体
						main.setDiscountPercent(bdList.get(0).getDiscountXt());
					} else if (billRepairDetail.getContainerCategory()
							.equals(ContainerCategoryEnum.CONTAINER_03.getCode())) {// 机组
						main.setDiscountPercent(bdList.get(0).getDiscountJz());
					}
				}
				// 根据折扣 计算减免金额
//				BigDecimal discountAmount = new BigDecimal(0);
				// 计算 折扣金额
				if (!StringUtils.isEmpty(main.getDiscountPercent())) {
					// 判断报价币种 计算金额
					if (main.getEstCurrencyType().equals(FinanceCurrencyType.CNY.getCode())) {// 人民币

						// 批复金额 减去 减免的金额 == 实收金额
						if (main.getReplyTaxTotalCostRmb() != null
								&& main.getReplyTaxTotalCostRmb().compareTo(new BigDecimal(0.00)) == 1) {
//							// 折扣金额
//							discountAmount = ComputeUtil.mul(main.getReplyTaxTotalCostRmb(),
//									ComputeUtil.sub(new BigDecimal(1), main.getDiscountPercent()));
							main.setRealTaxTotalCostRmb(
									ComputeUtil.mul(main.getReplyTaxTotalCostRmb(), main.getDiscountPercent()));
							main.setRealTaxTotalCostUsa(
									ComputeUtil.div(main.getRealTaxTotalCostRmb(), main.getRealRate(), 2));

						} else {
//							// 折扣金额
//							discountAmount = ComputeUtil.mul(main.getReplyNotaxTotalCostRmb(),
//									ComputeUtil.sub(new BigDecimal(1), main.getDiscountPercent()));
							main.setRealNotaxTotalCostRmb(
									ComputeUtil.mul(main.getReplyNotaxTotalCostRmb(), main.getDiscountPercent()));
							main.setRealNotaxTotalCostUsa(
									ComputeUtil.div(main.getRealNotaxTotalCostRmb(), main.getRealRate(), 2));

						}
					} else {// 取美金

						// 批复金额 减去 减免的金额 == 实收金额
						if (main.getReplyTaxTotalCostRmb() != null
								&& main.getReplyTaxTotalCostRmb().compareTo(new BigDecimal(0.00)) == 1) {
//							discountAmount = ComputeUtil.mul(main.getReplyTaxTotalCostUsa(),
//									ComputeUtil.sub(new BigDecimal(1), main.getDiscountPercent()));
							main.setRealTaxTotalCostUsa(
									ComputeUtil.mul(main.getReplyTaxTotalCostUsa(), main.getDiscountPercent()));
							main.setRealTaxTotalCostRmb(
									ComputeUtil.mul(main.getRealTaxTotalCostUsa(), main.getRealRate()));
						} else {
//							discountAmount = ComputeUtil.mul(main.getReplyNotaxTotalCostUsa(),
//									ComputeUtil.sub(new BigDecimal(1), main.getDiscountPercent()));
							main.setRealNotaxTotalCostUsa(
									ComputeUtil.mul(main.getReplyNotaxTotalCostUsa(), main.getDiscountPercent()));
							main.setRealNotaxTotalCostRmb(
									ComputeUtil.mul(main.getRealNotaxTotalCostUsa(), main.getRealRate()));

						}
					}
				}

				// 更新主表
				dao.updateByPrimaryKey(main);

				// 计算折扣金额 用于还原 原始金额
				BigDecimal amount = new BigDecimal(0);
				BigDecimal amountSum = ComputeUtil.sub(main.getReplyNotaxTotalCostRmb(),
						main.getRealNotaxTotalCostRmb());
				for (int i = 0; i < list1.size(); i++) {
					billRepairDetail = list1.get(0);
					// 用箱人Code
					String containerUserCode = "";
					ContainerUserOutput cuoutput = productionFeignClient
							.getContainerUserByKey(billRepairDetail.getContainerUser()).getData();
					if (cuoutput != null) {
						containerUserCode = cuoutput.getContainerUserCode();
					}
					// 判断是否最后一个
					if (i == list1.size() - 1 && list1.size() > 1) {
						// 判断币种
						if (billRepairDetail.getEstCurrencyType().equals(FinanceCurrencyType.CNY.getCode())) {

							if (containerUserCode.equals("COS")) {// 中远不含税
//								if (billRepairDetail.getRealNotaxTotalCostRmb() != null) {

//									amount=ComputeUtil.add(amount, ComputeUtil.mul(billRepairDetail.getRealNotaxTotalCostRmb(),ComputeUtil.sub(new BigDecimal(1), main.getDiscountPercent())));
								// 得到折后总结额
								billRepairDetail.setRealNotaxTotalCostRmb(
										ComputeUtil.sub(billRepairDetail.getReplyTaxTotalCostRmb(),
												ComputeUtil.sub(main.getRealNotaxTotalCostRmb(), amount)));

//									BigDecimal endAmount=ComputeUtil.sub(amountSum, amount);
//									//如果大于零  减去尾数
//									billRepairDetail.setRealNotaxTotalCostRmb(ComputeUtil.add(billRepairDetail.getRealNotaxTotalCostRmb(), endAmount));

//								}
//								// 计算汇率
//								if (billRepairDetail.getRealNotaxTotalCostUsa() != null) {
								billRepairDetail.setRealNotaxTotalCostUsa(ComputeUtil
										.div(billRepairDetail.getRealNotaxTotalCostRmb(), main.getRealRate(), 2));
//								}
								billRepairDetail.setRealTaxTotalCostRmb(null);
								billRepairDetail.setRealTaxTotalCostUsa(null);
							} else {

//								if (billRepairDetail.getRealTaxTotalCostRmb() != null) {
//									amount=ComputeUtil.add(amount, ComputeUtil.mul(billRepairDetail.getRealTaxTotalCostRmb(),ComputeUtil.sub(new BigDecimal(1), main.getDiscountPercent())));

								billRepairDetail.setRealTaxTotalCostRmb(
										ComputeUtil.sub(billRepairDetail.getReplyTaxTotalCostRmb(),
												ComputeUtil.sub(main.getRealTaxTotalCostRmb(), amount)));

//								}

								// 计算汇率
//								if (billRepairDetail.getRealTaxTotalCostUsa() != null) {
								billRepairDetail.setRealTaxTotalCostUsa(ComputeUtil
										.div(billRepairDetail.getRealTaxTotalCostRmb(), main.getRealRate(), 2));
//								}
							}
						} else {
							if (containerUserCode.equals("COS")) {// 中远不含税
//								if (billRepairDetail.getRealNotaxTotalCostUsa() != null) {
//									amount=ComputeUtil.add(amount, ComputeUtil.mul(billRepairDetail.getRealNotaxTotalCostUsa(),ComputeUtil.sub(new BigDecimal(1), main.getDiscountPercent())));
								billRepairDetail.setRealNotaxTotalCostUsa(
										ComputeUtil.sub(billRepairDetail.getReplyTaxTotalCostUsa(), amount));
//								}
//								// 计算汇率
//								if (billRepairDetail.getRealNotaxTotalCostRmb() != null) {
								billRepairDetail.setRealNotaxTotalCostRmb(ComputeUtil
										.mul(billRepairDetail.getRealNotaxTotalCostUsa(), main.getRealRate()));
//								}
								billRepairDetail.setRealTaxTotalCostRmb(null);
								billRepairDetail.setRealTaxTotalCostUsa(null);
							} else {
//								if (billRepairDetail.getRealTaxTotalCostUsa() != null) {
//									amount=ComputeUtil.add(amount, ComputeUtil.mul(billRepairDetail.getRealTaxTotalCostUsa(),ComputeUtil.sub(new BigDecimal(1), main.getDiscountPercent())));
								billRepairDetail.setRealTaxTotalCostUsa(
										ComputeUtil.sub(billRepairDetail.getRealTaxTotalCostUsa(), amount));
//								}

//								// 计算汇率
//								if (billRepairDetail.getRealTaxTotalCostRmb() != null) {
								billRepairDetail.setRealTaxTotalCostRmb(
										ComputeUtil.mul(billRepairDetail.getRealTaxTotalCostUsa(), main.getRealRate()));
//								}
							}
						}
					} else {

						// 判断币种
						if (billRepairDetail.getEstCurrencyType().equals(FinanceCurrencyType.CNY.getCode())) {
							if (containerUserCode.equals("COS")) {// 中远不含税
//								if (billRepairDetail.getRealNotaxTotalCostRmb() != null) {
								amount = ComputeUtil.add(amount,
										ComputeUtil.mul(billRepairDetail.getReplyTaxTotalCostRmb(),
												ComputeUtil.sub(new BigDecimal(1), main.getDiscountPercent())));
								billRepairDetail.setRealNotaxTotalCostRmb(ComputeUtil
										.mul(billRepairDetail.getReplyTaxTotalCostRmb(), main.getDiscountPercent()));
//								}
//								// 计算汇率
//								if (billRepairDetail.getRealNotaxTotalCostUsa() != null) {
								billRepairDetail.setRealNotaxTotalCostUsa(ComputeUtil
										.div(billRepairDetail.getRealNotaxTotalCostRmb(), main.getRealRate(), 2));
//								}
								billRepairDetail.setRealTaxTotalCostRmb(null);
								billRepairDetail.setRealTaxTotalCostUsa(null);
							} else {
//								if (billRepairDetail.getRealTaxTotalCostRmb() != null) {
								amount = ComputeUtil.add(amount,
										ComputeUtil.mul(billRepairDetail.getReplyTaxTotalCostRmb(),
												ComputeUtil.sub(new BigDecimal(1), main.getDiscountPercent())));

								billRepairDetail.setRealTaxTotalCostRmb(ComputeUtil
										.sub(billRepairDetail.getReplyTaxTotalCostRmb(), main.getDiscountPercent()));
//								}
//
//								// 计算汇率
//								if (billRepairDetail.getRealTaxTotalCostUsa() != null) {
								billRepairDetail.setRealTaxTotalCostUsa(ComputeUtil
										.div(billRepairDetail.getRealTaxTotalCostRmb(), main.getRealRate(), 2));
//								}
							}
						} else {
							if (containerUserCode.equals("COS")) {// 中远不含税
//								if (billRepairDetail.getRealNotaxTotalCostUsa() != null) {
								amount = ComputeUtil.add(amount,
										ComputeUtil.mul(billRepairDetail.getReplyTaxTotalCostUsa(),
												ComputeUtil.sub(new BigDecimal(1), main.getDiscountPercent())));

								billRepairDetail.setRealNotaxTotalCostUsa(ComputeUtil
										.mul(billRepairDetail.getReplyTaxTotalCostUsa(), main.getDiscountPercent()));
//								}
//								// 计算汇率
//								if (billRepairDetail.getRealNotaxTotalCostRmb() != null) {
								billRepairDetail.setRealNotaxTotalCostRmb(ComputeUtil
										.mul(billRepairDetail.getRealNotaxTotalCostUsa(), main.getRealRate()));
//								}
								billRepairDetail.setRealTaxTotalCostRmb(null);
								billRepairDetail.setRealTaxTotalCostUsa(null);
							} else {
//								if (billRepairDetail.getRealTaxTotalCostUsa() != null) {
								amount = ComputeUtil.add(amount,
										ComputeUtil.mul(billRepairDetail.getReplyTaxTotalCostUsa(),
												ComputeUtil.sub(new BigDecimal(1), main.getDiscountPercent())));

								billRepairDetail.setRealTaxTotalCostUsa(ComputeUtil
										.mul(billRepairDetail.getReplyTaxTotalCostUsa(), main.getDiscountPercent()));
//								}
//
//								// 计算汇率
//								if (billRepairDetail.getRealTaxTotalCostRmb() != null) {
								billRepairDetail.setRealTaxTotalCostRmb(
										ComputeUtil.mul(billRepairDetail.getRealTaxTotalCostUsa(), main.getRealRate()));
//								}
							}
						}
					}

					// 更新明细 平分折扣
					daoDetail.updateByPrimaryKey(billRepairDetail);
				}

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
		BillRepairExample example = new BillRepairExample();
		List<Integer> idList = Arrays.asList(ids).stream().map(a -> Integer.parseInt(a)).collect(Collectors.toList());
		example.createCriteria().andBillIdIn(idList);
		List<BillRepair> list = dao.selectByExample(example);
		for (BillRepair billRepair : list) {
			// 调账驳回
			billRepair.setModifyBillStatus(FinanceModifyBillEnum.AdjustmentReturn.getCode());
			dao.updateByPrimaryKey(billRepair);
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
			BillRepair record = dao.selectByPrimaryKey(input.getBillId());
			BeanUtils.copyProperties(input, record);
			dao.updateByPrimaryKey(record);
		} else {

		}
		return true;
	}

}
