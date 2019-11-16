package com.sanlly.finance.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.enums.FinanceBillStatusEnum;
import com.sanlly.common.enums.FinanceBillTypeEnum;
import com.sanlly.common.enums.FinanceCostStateEnum;
import com.sanlly.common.enums.FinanceInBillStateEnum;
import com.sanlly.common.enums.FinanceIsEnabledEnum;
import com.sanlly.common.enums.FinanceRejectEnum;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.models.output.user.UserInfoOutput;
import com.sanlly.finance.dao.BaseChargeTypeMapper;
import com.sanlly.finance.dao.BaseMerchantsMapper;
import com.sanlly.finance.dao.BusinessDetailMapper;
import com.sanlly.finance.dao.BusinessExtMapper;
import com.sanlly.finance.dao.BusinessInvoiceMapper;
import com.sanlly.finance.dao.BusinessMapper;
import com.sanlly.finance.entity.BaseChargeType;
import com.sanlly.finance.entity.BaseChargeTypeExample;
import com.sanlly.finance.entity.BaseMerchants;
import com.sanlly.finance.entity.BaseMerchantsExample;
import com.sanlly.finance.entity.Business;
import com.sanlly.finance.entity.BusinessDetail;
import com.sanlly.finance.entity.BusinessDetailExample;
import com.sanlly.finance.entity.BusinessExample;
import com.sanlly.finance.entity.BusinessInvoice;
import com.sanlly.finance.entity.BusinessInvoiceExample;
import com.sanlly.finance.models.input.RejectInput;
import com.sanlly.finance.models.input.SearchBusinessInput;
import com.sanlly.finance.models.output.BaseChargeTypeOutput;
import com.sanlly.finance.models.output.BusinessDetailOutput;
import com.sanlly.finance.models.output.BusinessInvoiceOutput;
import com.sanlly.finance.models.output.BusinessOutput;
import com.sanlly.finance.models.output.RejectEnumOutput;
import com.sanlly.finance.service.BusinessService;
import com.sanlly.finance.service.feign.AuthFeignClient;
import com.sanlly.finance.utils.DateUtils;

/**
 * 商务结算服务实现
 * 
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author fjy
 * @date 2019年8月8日
 *
 */
@Service
public class BusinessServiceImpl extends BaseServiceImpl implements BusinessService {

	@Autowired
	private BusinessMapper businessDao;

	@Autowired
	private BaseChargeTypeMapper chargeTypeDao;

	@Autowired
	private BusinessInvoiceMapper invoiceDao;

	@Autowired
	private BusinessDetailMapper bussinessDetailDao;

	@Autowired
	private AuthFeignClient authFeignClient;

	@Autowired
	private BaseMerchantsMapper merchantsDao;

	@Autowired
	private BusinessExtMapper businessExtDao;

	/**
	 * 
	 * Title: getBusinessPage Description: 商务结算分页列表查询
	 * 
	 * @param input
	 * @return
	 * @see com.sanlly.finance.service.BusinessService#getBusinessPage(com.sanlly.common.models.input.finance.SearchBusinessInput)
	 */
	@Override
	public PagedList<BusinessOutput> getBusinessPage(SearchBusinessInput input) {
		BusinessExample example = new BusinessExample();
		BusinessExample.Criteria criteria = example.createCriteria();
		// 过滤掉删除的记录
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		// 账单号
		if (input.getBillCode() != null && !StringUtils.isEmpty(input.getBillCode().trim())) {
			criteria.andBillCodeLike("%" + input.getBillCode().trim() + "%");
		}
		// 账单月份
		if (input.getBillMonth() != null && !StringUtils.isEmpty(input.getBillMonth())) {
			criteria.andBillMonthEqualTo(input.getBillMonth());
		}
		// 账单类型
		if (!StringUtils.isEmpty(input.getBillType())) {
			criteria.andBillTypeEqualTo(input.getBillType());
		}
		// 收支类型
		if (!StringUtils.isEmpty(input.getChargeInoutType())) {
			criteria.andChargeInoutTypeEqualTo(input.getChargeInoutType());
		}

		int totalCount = (int) businessDao.countByExample(example);
		PagedList<BusinessOutput> pagedList = new PagedList<BusinessOutput>(input.getPageIndex(), input.getPageSize(),
				totalCount);
		// 设置开始行数
		example.setLimitStart(pagedList.getLimitStart());
		// 设置结束行数
		example.setLimitEnd(pagedList.getLimitEnd());
		example.setOrderByClause(" `create_time` DESC");
		List<Business> businessList = businessDao.selectByExample(example);
		List<BusinessOutput> outputList = businessList.stream().map(a -> {
			BusinessOutput output = new BusinessOutput();
			// 复制属性值到新对象
			BeanUtils.copyProperties(a, output);

			output.setMerchantsNameLang(a.getMerchantsKey());
			output.setBillTypeNameLang(a.getBillType());
			output.setChargeInoutTypeNameLang(a.getChargeInoutType());

			output.setContainerUserNameLang(a.getContainerUser());
			output.setIsOverdue(false);// 先设置未过期
			output.setIsChangeBg(false);
			// 查询用户
			// 查看商务结算是否已入账

			BusinessDetailExample bdExample = new BusinessDetailExample();
			bdExample.createCriteria().andBusinessIdEqualTo(a.getId());
			List<BusinessDetail> detailList = bussinessDetailDao.selectByExample(bdExample);
			Long count = detailList.stream()
					.filter(x -> x.getFreeStatus().equals(FinanceInBillStateEnum.INBILL.getCode())).count();
			if (count != null && count > 0) {
				output.setIsInBill(true);
			} else {
				output.setIsInBill(false);
			}

			// 创建用户
			if (!StringUtils.isEmpty(a.getCreateUser())) {
				Result<UserInfoOutput> user = authFeignClient.getUserDetail(a.getCreateUser());
				output.setInBillUserName(user.getData().getUserName());
			}
			// 制单人
			if (!StringUtils.isEmpty(a.getCreateBillUser())) {
				Result<UserInfoOutput> user = authFeignClient.getUserDetail(a.getCreateBillUser());
				output.setInBillUserName(user.getData().getUserName());
			}
			// 修改用户
			if (!StringUtils.isEmpty(a.getUpdateUser())) {
				Result<UserInfoOutput> user = authFeignClient.getUserDetail(a.getUpdateUser());
				output.setUpdateUserName(user.getData().getUserName());
			}
			// 查询客户信息
			BaseMerchantsExample meExample = new BaseMerchantsExample();
			meExample.createCriteria().andMerchantsKeyEqualTo(a.getMerchantsKey());
			List<BaseMerchants> mList = merchantsDao.selectByExample(meExample);
			BaseMerchants merchants = null;
			if (mList.size() > 0) {
				merchants = mList.get(0);
			}
			// 如果查询不到用户 就没有过期提醒状态
			if (merchants != null) {
				// 查看发票是否到期
				// 查询所有的发票

				BusinessInvoiceExample invoiceExample = new BusinessInvoiceExample();
				BusinessInvoiceExample.Criteria invoiceCriteria = invoiceExample.createCriteria();
				List<String> chargeStatusList = new ArrayList<String>();
				chargeStatusList.add(FinanceCostStateEnum.NOCOST.getCode());// 未收费
				chargeStatusList.add(FinanceCostStateEnum.SUBCOST.getCode());// 部分收费
				// 过滤掉删除的记录
				invoiceCriteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO).andBusinessIdEqualTo(a.getId())
						.andChargeStatusIn(chargeStatusList);// 未核销状态

				List<BusinessInvoice> businessDetailList = invoiceDao.selectByExample(invoiceExample);

				for (BusinessInvoice item : businessDetailList) {
					// 没有设置过期 就一直循环完 有一个发票到期 就设置为变红提醒
					if (output.getIsOverdue()) {
						break;
					}
					Date InvoiceDate = DateUtils.dateAddDays(item.getInvoiceDatetime(),
							merchants.getCreditDate().intValue());
					Date lastDate = DateUtils.dateAddDays(InvoiceDate, -2);// 最终开始提醒的日期
					// 比较当前日期 和当前日期相等 或者小于当前日期 需要提醒变红
					Integer re = DateUtils.dateCompare(new Date(), lastDate);
					if (re <= 0) {
						output.setIsOverdue(true);
						output.setIsChangeBg(true);
					} else {
						output.setIsOverdue(false);
						output.setIsChangeBg(false);
					}
				}

			} else {
				output.setIsOverdue(false);
				output.setIsChangeBg(false);
			}

			return output;
		}).collect(Collectors.toList());
		pagedList.setDataList(outputList);
		return pagedList;
	}

	/**
	 * 入账 对接SBS Title: inBill Description: 明细入账
	 * 
	 * @param businessId
	 * @see com.sanlly.finance.service.BusinessService#inBill(java.lang.String)
	 */
	@Override
	public Boolean inBill(String[] ids) {
		// TODO Auto-generated method stub
		// 将数据发送到SBS
		// 接收返回的发票信息 保存到发票表
		if (ids != null && ids.length > 0) {
			for (int i = 0; i < ids.length; i++) {
				BusinessDetail record = bussinessDetailDao.selectByPrimaryKey(Integer.parseInt(ids[i]));
				record.setFreeStatus(FinanceInBillStateEnum.INBILL.getCode());// 已入账
				record.setInBillTime(new Date());// 入账时间
				record.setInBillUser(getCurrentUserId());
				bussinessDetailDao.updateByPrimaryKey(record);
				
				
			}
			return true;
		}
		return false;
	}

	/**
	 * 财务驳回 Title: Reject Description:
	 * 
	 * @param input
	 * @see com.sanlly.finance.service.BusinessService#Reject(java.lang.String)
	 */
	@Override
	@Transactional
	public void Reject(RejectInput input) {
		// TODO Auto-generated method stub
		if (!StringUtils.isEmpty(input.getId())) {
			// 修改原账单的状态 已驳回 插入驳回原因 账单写完 回来写
			// 根据费用类型更新表状态 ？？？？？？？？

			// 删除商务结算表中的记录 和明细
			BusinessDetailExample example = new BusinessDetailExample();
			example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
					.andBusinessIdEqualTo(Integer.parseInt(input.getId()));
			List<BusinessDetail> list = bussinessDetailDao.selectByExample(example);
			List<Integer> ids = list.stream().map(d -> d.getBusinessDetaillId()).collect(Collectors.toList());
			// 删除明细表
			BusinessDetailExample example2 = new BusinessDetailExample();
			example2.createCriteria().andBusinessDetaillIdIn(ids);
			bussinessDetailDao.deleteByExample(example2);
			// 删除主表
			Business main = businessDao.selectByPrimaryKey(Integer.parseInt(input.getId()));
			businessDao.deleteByPrimaryKey(Integer.parseInt(input.getId()));
			// 判断原表数据
			
			 SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss") ; //使用了默认的格式创建了一个日期格式化对象。
			 String time = dateFormat.format(new Date()); //可以把日期转换转指定格式的字符串
			// 更新账单表状态为已驳回
			businessExtDao.updateBillStatus(main.getSourceTable(), FinanceBillStatusEnum.FINANCERETURN.getCode(),
					getCurrentUserId(), time, input.getRejectCode(), input.getRemark(), main.getSourceBillId());

		}

	}

	/**
	 * 获取费用类型集合 Title: getChargeTypeList Description:
	 * 
	 * @return
	 * @see com.sanlly.finance.service.BusinessService#getChargeTypeList()
	 */
	@Override
	public List<BaseChargeTypeOutput> getChargeTypeList() {
		// TODO Auto-generated method stub
		BaseChargeTypeExample example = new BaseChargeTypeExample();
		// 过滤掉删除的记录 启用的记录
		example.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
				.andIsEnabledEqualTo(FinanceIsEnabledEnum.Enabled.getCode());
		List<BaseChargeType> list = chargeTypeDao.selectByExample(example);
		List<BaseChargeTypeOutput> outlist = list.stream().map(b -> {
			BaseChargeTypeOutput out = new BaseChargeTypeOutput();
			BeanUtils.copyProperties(b, out);
			out.setChargeInoutTypeNameLang(b.getChargeInoutType());
			out.setBusinessCategoryNameLang(b.getBusinessCategory());
			out.setBusinessTypeNameLang(b.getBusinessType());
//			out.setCtNameLang(b.getLangKey());// 国际化
			return out;
		}).collect(Collectors.toList());
		return outlist;
	}
	
	/**
	 * 商务结算明细分页查询 Title: getBusinessDetailPage Description:
	 * 
	 * @param businessId
	 * @return
	 * @see com.sanlly.finance.service.BusinessService#getBusinessDetailPage(java.lang.String)
	 */
	@Override
	public List<BusinessDetailOutput> getBusinessDetailList(SearchBusinessInput input) {
		// TODO Auto-generated method stub
		BusinessDetailExample example = new BusinessDetailExample();
		BusinessDetailExample.Criteria criteria = example.createCriteria();

		// 过滤掉删除的记录
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO);
		if(!StringUtils.isEmpty(input.getInBillStatus())) {
			criteria.andFreeStatusEqualTo(input.getInBillStatus());
		}
		example.setOrderByClause(" `create_time` DESC");
		List<BusinessDetail> businessDetailList = bussinessDetailDao.selectByExample(example);
		List<BusinessDetailOutput> outputList = businessDetailList.stream().map(a -> {
					BusinessDetailOutput output = new BusinessDetailOutput();
					// 复制属性值到新对象
					BeanUtils.copyProperties(a, output);

					output.setMerchantsNameLang(a.getMerchantsKey());
					output.setChargeInoutTypeNameLang(a.getChargeInoutType());
					output.setChargeTypeNameLang(a.getChargeTypeKey());
//					output.setInvoiceTypeNameLang(a.getInvoiceType());
					output.setDeptKeyNameLang(a.getDeptKey());
					output.setCompanyKeyNameLang(a.getCompanyKey());
					output.setYardNameLang(a.getYard());
//					output.setInterfaceTypeNameLang(a.getInterfaceType());
//					output.setLegacyDocTypeNameLang(a.getLegacyDocType());
					output.setContainerUserNameLang(a.getContainerUser());
					output.setFreeStatusNameLang(a.getFreeStatus());
					// 制单人
					if (!StringUtils.isEmpty(a.getCreateBillUser())) {
						Result<UserInfoOutput> user = authFeignClient.getUserDetail(a.getCreateBillUser());
						output.setCreateBillUserName(user.getData().getUserName());
					}

					return output;
				}).collect(Collectors.toList());
		 
		return outputList;

	}

	/**
	 * 商务结算明细分页查询 Title: getBusinessDetailPage Description:
	 * 
	 * @param businessId
	 * @return
	 * @see com.sanlly.finance.service.BusinessService#getBusinessDetailPage(java.lang.String)
	 */
	@Override
	public PagedList<BusinessDetailOutput> getBusinessDetailPage(SearchBusinessInput input) {
		// TODO Auto-generated method stub
		BusinessDetailExample example = new BusinessDetailExample();
		BusinessDetailExample.Criteria criteria = example.createCriteria();

		// 过滤掉删除的记录
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO)
				.andBusinessIdEqualTo(Integer.parseInt(input.getBusinessId()));

		int totalCount = (int) bussinessDetailDao.countByExample(example);
		PagedList<BusinessDetailOutput> pagedList = new PagedList<BusinessDetailOutput>(input.getPageIndex(),
				input.getPageSize(), totalCount);
		// 设置开始行数
		example.setLimitStart(pagedList.getLimitStart());
		// 设置结束行数
		example.setLimitEnd(pagedList.getLimitEnd());
		example.setOrderByClause(" `create_time` DESC");
		List<BusinessDetail> businessDetailList = bussinessDetailDao.selectByExample(example);
		List<BusinessDetailOutput> outputList = businessDetailList.stream().map(a -> {
					BusinessDetailOutput output = new BusinessDetailOutput();
					// 复制属性值到新对象
					BeanUtils.copyProperties(a, output);

					output.setMerchantsNameLang(a.getMerchantsKey());
					output.setChargeInoutTypeNameLang(a.getChargeInoutType());
					output.setChargeTypeNameLang(a.getChargeTypeKey());
					output.setInvoiceTypeNameLang(a.getInvoiceType());
					output.setDeptKeyNameLang(a.getDeptKey());
					output.setCompanyKeyNameLang(a.getCompanyKey());
					output.setYardNameLang(a.getYard());
					output.setInterfaceTypeNameLang(a.getInterfaceType());
					output.setLegacyDocTypeNameLang(a.getLegacyDocType());
					output.setContainerUserNameLang(a.getContainerUser());
					output.setFreeStatusNameLang(a.getFreeStatus());
					// 制单人
					if (!StringUtils.isEmpty(a.getCreateBillUser())) {
						Result<UserInfoOutput> user = authFeignClient.getUserDetail(a.getCreateBillUser());
						output.setCreateBillUserName(user.getData().getUserName());
					}

					// 入账人
					if (!StringUtils.isEmpty(a.getInBillUser())) {
						Result<UserInfoOutput> user = authFeignClient.getUserDetail(a.getInBillUser());
						output.setInBillUserName(user.getData().getUserName());
					}

					// 账单审核人
					if (!StringUtils.isEmpty(a.getBillAuditor())) {
						Result<UserInfoOutput> user = authFeignClient.getUserDetail(a.getBillAuditor());
						output.setBillAuditorName(user.getData().getUserName());
					}
					
					return output;
				}).collect(Collectors.toList());
		pagedList.setDataList(outputList);
		return pagedList;

	}

	/**
	 * 商务结算发票分页查询 Title: getBusinessInvoicePage Description:
	 * 
	 * @param businessId
	 * @return
	 * @see com.sanlly.finance.service.BusinessService#getBusinessInvoicePage(java.lang.String)
	 */
	@Override
	public PagedList<BusinessInvoiceOutput> getBusinessInvoicePage(SearchBusinessInput input) {
		// TODO Auto-generated method stub
		BusinessInvoiceExample example = new BusinessInvoiceExample();
		BusinessInvoiceExample.Criteria criteria = example.createCriteria();

		// 过滤掉删除的记录
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO)
				.andBusinessIdEqualTo(Integer.parseInt(input.getBusinessId()));

		int totalCount = (int) invoiceDao.countByExample(example);
		PagedList<BusinessInvoiceOutput> pagedList = new PagedList<BusinessInvoiceOutput>(input.getPageIndex(),
				input.getPageSize(), totalCount);
		// 设置开始行数
		example.setLimitStart(pagedList.getLimitStart());
		// 设置结束行数
		example.setLimitEnd(pagedList.getLimitEnd());
		example.setOrderByClause(" `create_time` DESC");
		List<BusinessInvoice> businessDetailList = invoiceDao.selectByExample(example);
		List<BusinessInvoiceOutput> outputList = businessDetailList.stream().map(a -> {
					BusinessInvoiceOutput output = new BusinessInvoiceOutput();
					// 复制属性值到新对象
					BeanUtils.copyProperties(a, output);
					output.setChargeStatusNameLang(a.getChargeStatus());
					output.setInvoiceStatusNameLang(a.getInvoiceStatus());
					return output;
				}).collect(Collectors.toList());
		pagedList.setDataList(outputList);
		return pagedList;
	}

	/**
	 * 获取财务驳回原因列表 Title: getRejectList Description:
	 * 
	 * @return
	 * @see com.sanlly.finance.service.BusinessService#getRejectList()
	 */
	@Override
	public List<RejectEnumOutput> getRejectList() {
		FinanceRejectEnum[] rejects = FinanceRejectEnum.values();

		List<RejectEnumOutput> output = new ArrayList<RejectEnumOutput>();
		boolean first = true;
		for (FinanceRejectEnum reject : rejects) {
			RejectEnumOutput out = new RejectEnumOutput();
			out.setRejectCode(reject.getCode());
			out.setRejectNameLang(reject.getCode());
			if (first) {
				first = false;
				out.setStatus(1);
			} else {
				out.setStatus(0);
			}

			output.add(out);
		}

		return output;
	}

}
