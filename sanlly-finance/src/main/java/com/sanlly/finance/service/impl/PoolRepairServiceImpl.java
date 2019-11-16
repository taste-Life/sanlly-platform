package com.sanlly.finance.service.impl;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.enums.FinanceCostStatusEnum;
import com.sanlly.common.enums.FinanceCurrencyType;
import com.sanlly.common.enums.FinanceIsEnabledEnum;
import com.sanlly.common.models.input.finance.PoolRepairInput;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.base.ContainerUserOutput;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.models.output.user.UserInfoOutput;
import com.sanlly.common.utils.ComputeUtil;
import com.sanlly.finance.dao.BaseChargeTypeMapper;
import com.sanlly.finance.dao.BaseExchangeRateMapper;
import com.sanlly.finance.dao.PoolRepairMapper;
import com.sanlly.finance.entity.BaseAuditDept;
import com.sanlly.finance.entity.BaseChargeType;
import com.sanlly.finance.entity.BaseChargeTypeExample;
import com.sanlly.finance.entity.BaseExchangeRate;
import com.sanlly.finance.entity.BaseExchangeRateExample;
import com.sanlly.finance.entity.PoolRepair;
import com.sanlly.finance.entity.PoolRepairExample;
import com.sanlly.finance.enums.ContainerCategoryEnum;
import com.sanlly.finance.models.input.BaseAuditDeptInput;
import com.sanlly.finance.models.input.PoolBaseInput;
import com.sanlly.finance.models.input.SearchBaseInput;
import com.sanlly.finance.models.output.PoolRepairOutput;
import com.sanlly.finance.service.BaseAuditDeptService;
import com.sanlly.finance.service.PoolRepairService;
import com.sanlly.finance.service.feign.AuthFeignClient;
import com.sanlly.finance.service.feign.ProductionFeignClient;
import com.sanlly.finance.utils.DateUtils;

/**
 * 核算部门实现类
 * 
 * @Package com.sanlly.finance.service.impl 
 * @Description: TODO
 * @author fjy   
 * @date 2019年8月20日 上午11:37:58 
 * @version V1.0   
 */
@Service
public class PoolRepairServiceImpl extends BaseServiceImpl implements PoolRepairService {

	@Autowired
	private PoolRepairMapper dao;

	@Autowired
	private BaseChargeTypeMapper chargeTypeDao;
	@Autowired
	private BaseExchangeRateMapper exchangeRateDao;
	@Autowired
	private BaseAuditDeptService baseAuditDeptService;

	@Autowired
	private AuthFeignClient authFeignClient;
	
	@Autowired
	private ProductionFeignClient productionFeignClient;

	/**
	 * 查询分页
	 */
	@Override
	public PagedList<PoolRepairOutput> getPage(SearchBaseInput input) {
		// TODO Auto-generated method stub
		PoolRepairExample example = new PoolRepairExample();
		PoolRepairExample.Criteria criteria = example.createCriteria();
		// 过滤掉删除的记录 和未启用的数据
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO)
				.andIsEnabledEqualTo(FinanceIsEnabledEnum.Enabled.getCode());
		if (!StringUtils.isEmpty(input.getName())) {
			criteria.andContainerNoLike("%" + input.getName() + "%");
		}
		// 费用状态
		if (!StringUtils.isEmpty(input.getCode())) {
			criteria.andFreeStatusEqualTo(input.getCode());
		}
		//费用池类型
		if(!StringUtils.isEmpty(input.getPoolType())) {
			criteria.andPoolTypeEqualTo(input.getPoolType());
		}
		int totalCount = (int) dao.countByExample(example);
		PagedList<PoolRepairOutput> pagedList = new PagedList<PoolRepairOutput>(input.getPageIndex(),
				input.getPageSize(), totalCount);
		// 设置开始行数
		example.setLimitStart(pagedList.getLimitStart());
		// 设置结束行数
		example.setLimitEnd(pagedList.getLimitEnd());
		example.setOrderByClause(" `create_time` DESC");
		List<PoolRepair> list = dao.selectByExample(example);
		List<PoolRepairOutput> outputList = list.stream().map(a -> {// 创建日期倒序排列
					PoolRepairOutput output = new PoolRepairOutput();
					// 复制属性值到新对象
					BeanUtils.copyProperties(a, output);
					output.setChargeTypeIdNameLang(a.getChargeTypeKey());
					output.setDeptKeyNameLang(a.getDeptKey());
					output.setFreeStatusNameLang(a.getFreeStatus());
					output.setIsEnabledNameLang(a.getIsEnabled());
					output.setYardNameLang(a.getYard());
					output.setIsBackLeaseNameLang(a.getIsBackLease());
					output.setContainerUserNameLang(a.getContainerUser());
					output.setContainerCategoryNameLang(a.getContainerCategory());
					output.setChargeObjectNameLang(a.getChargeObject());
					// 查询用户
					// 批复人
					if (!StringUtils.isEmpty(a.getReplyFreeUser())) {
						Result<UserInfoOutput> user = authFeignClient.getUserDetail(a.getReplyFreeUser());
						output.setReplyFreeUserName(user.getData().getUserName());
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
	 * 修改或者添加
	 */
	@Override
	public Boolean addOrUpadte(PoolRepairInput input) {
		// TODO Auto-generated method stub
		PoolRepair record = new PoolRepair();
		BeanUtils.copyProperties(input, record);
		if (StringUtils.isEmpty(input.getId())) {

			record.setIsDel(PlatformConstants.ISDEL_NO);
			record.setFreeStatus(FinanceCostStatusEnum.COSTNOOK.getCode());
			record.setCreateTime(new Date());
			record.setCreateUser(getCurrentUserId());
			if (dao.insert(record) > 0) {
				return true;
			}
		} else {
			// 查询一下信息
			PoolRepair info = dao.selectByPrimaryKey(input.getId());
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
	 * 批量修改
	 */
	@Override
	public Boolean Upadtes(List<PoolRepairInput> input) {
		// TODO Auto-generated method stub
		PoolRepair record = new PoolRepair();
		BeanUtils.copyProperties(input, record);
		if (input != null) {
			for (PoolRepairInput poolRepairInput : input) {
				if (poolRepairInput.getId() != null) {
					// 查询一下信息
					PoolRepair info = dao.selectByPrimaryKey(poolRepairInput.getId());
					BeanUtils.copyProperties(info, record);
					BeanUtils.copyProperties(poolRepairInput, record);
					record.setUpdateTime(new Date());
					record.setUpdateUser(getCurrentUserId());
					dao.updateByPrimaryKey(record);
				}
			}
			return true;
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
			PoolRepair record = dao.selectByPrimaryKey(Integer.parseInt(ids[i]));
			record.setIsDel(PlatformConstants.ISDEL_YES);
			record.setUpdateTime(new Date());
			record.setUpdateUser(getCurrentUserId());
			dao.updateByPrimaryKey(record);
		}
		return true;
	}

	/**
	 * 批量费用确认
	 */
	@Override
	public Boolean costOk(String[] ids) {
		// TODO Auto-generated method stub
		for (int i = 0; i < ids.length; i++) {
			PoolRepair record = dao.selectByPrimaryKey(Integer.parseInt(ids[i]));
			record.setFreeStatus(FinanceCostStatusEnum.COSTOK.getCode());
			record.setUpdateTime(new Date());
			record.setUpdateUser(getCurrentUserId());
			dao.updateByPrimaryKey(record);
		}
		return true;
	}

	/**
	 * 无法收费
	 */
	@Override
	public Boolean NoCharge(PoolBaseInput input) {
		// TODO Auto-generated method stub
		PoolRepair record = dao.selectByPrimaryKey(Integer.parseInt(input.getId()));
		record.setFreeStatus(FinanceCostStatusEnum.NOCOST.getCode());
		record.setUpdateTime(new Date());
		record.setUpdateUser(getCurrentUserId());
		record.setNoCostDesc(input.getDesc());
		Integer result = dao.updateByPrimaryKey(record);
		if (result > 0) {
			return true;
		} else {
			return false;
		}

	}

	/**
	 * 批量添加费用
	 */
	@Override
	public Boolean add(List<PoolRepairInput> list) {
		// TODO Auto-generated method stub
		if (list != null && list.size() > 0) {
			
			
			
			for (PoolRepairInput poolRepairInput : list) {
				PoolRepair record = new PoolRepair();
				BeanUtils.copyProperties(poolRepairInput, record);
				
				
				if (poolRepairInput.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_01.getCode())) {
					record.setPoolType(0);// 收入
					// 根据箱类别 判断费用类型
					record.setChargeTypeKey("LKFICHARGT000016");//干箱维修收入
				} else if (poolRepairInput.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_02.getCode())) {
					record.setPoolType(1);// 收入
					// 根据箱类别 判断费用类型
					record.setChargeTypeKey("LKFICHARGT000005");//冷箱箱体修理费
				} else if (poolRepairInput.getContainerCategory().equals(ContainerCategoryEnum.CONTAINER_03.getCode())) {
					record.setPoolType(1);// 收入
					// 根据箱类别 判断费用类型
					record.setChargeTypeKey("LKFICHARGT000001");//冷箱机组维修收入
				}

				record.setFreeStatus(FinanceCostStatusEnum.COSTNOOK.getCode());
				record.setItemStatus(0);
				String tmpChargeKey="";
				// 查询核算部门 根据场站查询利润中心
				BaseChargeTypeExample bctExample=new BaseChargeTypeExample();
				bctExample.createCriteria().andLangKeyEqualTo(record.getChargeTypeKey());
				List<BaseChargeType> bctList=chargeTypeDao.selectByExample(bctExample);
				//得到费用key
				if(bctList!=null && bctList.size()>0) {
					tmpChargeKey=bctList.get(0).getChargeKey();
				}


				// 核算部门查询
				BaseAuditDeptInput badInput = new BaseAuditDeptInput();
				//场站
				badInput.setYard(record.getYard());
				//箱类别
				badInput.setContainerCategory(record.getContainerCategory());
				//费用类型
				badInput.setChargeKey(tmpChargeKey);

				BaseAuditDept baDept = baseAuditDeptService.getInfo(badInput);
				if (baDept != null) {
					record.setDeptKey(baDept.getProfitDept());// 通过场站查询得到 利润中心
					record.setDeptCode(baDept.getProfitCenterCode());
				}
				
				record.setIsEnabled(FinanceIsEnabledEnum.Enabled.getCode());
				record.setIsDel(PlatformConstants.ISDEL_NO);
				record.setFreeStatus(FinanceCostStatusEnum.COSTNOOK.getCode());
				record.setCreateTime(new Date());
				record.setCreateUser(getCurrentUserId());

				record.setCreateTime(new Date());
				record.setCreateUser(getCurrentUserId());
				//收费对象 同用箱人
				record.setChargeObject(record.getContainerUser());
				BigDecimal realRate=new BigDecimal(0.00);
				// 汇率
				BaseExchangeRateExample ere = new BaseExchangeRateExample();
				try {
					ere.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
							.andIsEnabledEqualTo(FinanceIsEnabledEnum.Enabled.getCode())
							.andRateYearMonthEqualTo(DateUtils.dateFormat(new Date(), "YYYY-MM"));
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}// 根据月份查询
				List<BaseExchangeRate> exchangeRateList = exchangeRateDao.selectByExample(ere);
				if (exchangeRateList != null && exchangeRateList.size() > 0) {
					realRate=exchangeRateList.get(0).getExchangeRate();// 汇率 根据月份取汇率表
				} else {// 如果月份没有查询到数据，开始向前找
					ere = new BaseExchangeRateExample();
					ere.createCriteria().andIsDelEqualTo(PlatformConstants.ISDEL_NO)
							.andIsEnabledEqualTo(FinanceIsEnabledEnum.Enabled.getCode());// 人民币
					ere.setOrderByClause(" `create_time` DESC");
					exchangeRateList = exchangeRateDao.selectByExample(ere);
					// 获取最近一条的汇率
					if (exchangeRateList != null && exchangeRateList.size() > 0) {
						realRate=exchangeRateList.get(0).getExchangeRate();// 汇率 根据月份取汇率表
					} 
				}
				//用箱人Code
//				String containerUserCode="";
//				ContainerUserOutput cuoutput=productionFeignClient.getContainerUserByKey(record.getContainerUser()).getData();
//				if(cuoutput!=null) {
//					containerUserCode=cuoutput.getContainerUserCode();
//				}
				//费用计算
				if(record.getEstCurrencyType().equals(FinanceCurrencyType.CNY.getCode())) {//如果人民币，计算美金报价总金额
					record.setValuationMoneyUsd(ComputeUtil.div(record.getValuationMoneyRmb(),realRate, 2));
					//前台默认取值为 含税字段  不含税等字段用于字段模块
//					if(containerUserCode.equals("COS")) {//中远不含税
//						record.setReplyNotaxTotalCostRmb(poolRepairInput.getReplyTaxTotalCostRmb());
//						record.setRealNotaxTotalCostRmb(poolRepairInput.getReplyTaxTotalCostRmb());
//						record.setReplyNotaxTotalCostUsa(ComputeUtil.div(record.getReplyNotaxTotalCostRmb(),realRate, 2));
//						record.setRealNotaxTotalCostUsa(ComputeUtil.div(record.getRealNotaxTotalCostRmb(),realRate, 2));
//					}else {
						record.setReplyTaxTotalCostRmb(poolRepairInput.getReplyTaxTotalCostRmb());
						record.setRealTaxTotalCostRmb(poolRepairInput.getReplyTaxTotalCostRmb());
						record.setReplyTaxTotalCostUsa(ComputeUtil.div(record.getReplyTaxTotalCostRmb(),realRate, 2));
						record.setRealTaxTotalCostUsa(ComputeUtil.div(record.getRealTaxTotalCostRmb(),realRate, 2));
						
//					}
					
				}else {//计算人民币报价总金额
					record.setValuationMoneyRmb(ComputeUtil.mul(record.getValuationMoneyUsd(), realRate));
//					if(containerUserCode.equals("COS")) {//中远不含税
//						record.setReplyNotaxTotalCostUsa(poolRepairInput.getReplyTaxTotalCostRmb());
//						record.setRealNotaxTotalCostUsa(poolRepairInput.getReplyTaxTotalCostRmb());
//						record.setReplyNotaxTotalCostRmb(ComputeUtil.mul(record.getReplyNotaxTotalCostUsa(),realRate));
//						record.setRealNotaxTotalCostRmb(ComputeUtil.mul(record.getRealNotaxTotalCostUsa(),realRate));
//					}else {
						record.setReplyTaxTotalCostUsa(poolRepairInput.getReplyTaxTotalCostUsa());
						record.setRealTaxTotalCostUsa(poolRepairInput.getReplyTaxTotalCostUsa());
						record.setReplyTaxTotalCostRmb(ComputeUtil.mul(record.getReplyTaxTotalCostUsa(),realRate));
						record.setRealTaxTotalCostRmb(ComputeUtil.mul(record.getRealTaxTotalCostUsa(),realRate));
//					}
					
				}
				record.setRealRate(realRate);
				
				dao.insert(record);
			}
			return true;
		}
		return false;

	}

	/**
	 * 取消批复，删除未加入账单的费用 true 取消成功 false 无法取消
	 */
	@Override
	public Boolean cancleReply(PoolRepairInput input) {
		// TODO Auto-generated method stub
		if (input != null && !StringUtils.isEmpty(input.getProdCourseId())
				&& !StringUtils.isEmpty(input.getContainerCategory())) {

			PoolRepairExample example = new PoolRepairExample();
			example.createCriteria().andProdCourseIdEqualTo(input.getProdCourseId())
					.andContainerCategoryEqualTo(input.getContainerCategory());
			List<PoolRepair> recordList = dao.selectByExample(example);

			List<PoolRepair> recordList1 = recordList.stream().filter(x -> x.getItemStatus() == 1)
					.collect(Collectors.toList());
			// 有费用已加入账单，无法删除
			if (recordList1 != null && recordList1.size() > 0) {
				return false;
			}
			// 全部删除
			if (recordList != null && recordList.size() > 0) {
				for (PoolRepair poolRepair : recordList) {
					dao.deleteByPrimaryKey(poolRepair.getId());
				}
			}
			return true;

		}
		return false;
	}

}
