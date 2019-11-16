package com.sanlly.finance.service.impl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.enums.FinanceBudgetTypeEnum;
import com.sanlly.common.enums.FinanceCostStatusEnum;
import com.sanlly.common.enums.FinanceIsEnabledEnum;
import com.sanlly.common.models.input.finance.PoolPtiInput;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.common.models.output.user.UserInfoOutput;
import com.sanlly.common.utils.ComputeUtil;
import com.sanlly.finance.dao.BaseChargeTypeMapper;
import com.sanlly.finance.dao.BasePtiRateMapper;
import com.sanlly.finance.dao.PoolPtiMapper;
import com.sanlly.finance.entity.BaseAuditDept;
import com.sanlly.finance.entity.BaseChargeType;
import com.sanlly.finance.entity.BaseChargeTypeExample;
import com.sanlly.finance.entity.BasePtiRate;
import com.sanlly.finance.entity.BasePtiRateExample;
import com.sanlly.finance.entity.PoolPti;
import com.sanlly.finance.entity.PoolPtiExample;
import com.sanlly.finance.enums.PTIFormulaEnum;
import com.sanlly.finance.models.input.BaseAuditDeptInput;
import com.sanlly.finance.models.input.PoolBaseInput;
import com.sanlly.finance.models.input.SearchBaseInput;
import com.sanlly.finance.models.output.PoolPtiOutput;
import com.sanlly.finance.service.BaseAuditDeptService;
import com.sanlly.finance.service.BaseExchangeRateService;
import com.sanlly.finance.service.PoolPtiService;
import com.sanlly.finance.service.feign.AuthFeignClient;

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
public class PoolPtiServiceImpl extends BaseServiceImpl implements PoolPtiService {

	@Autowired
	private PoolPtiMapper dao;
	
	@Autowired
	private BasePtiRateMapper ptiRatedao;
	
	@Autowired
	private BaseExchangeRateService exchangeRateService;

	@Autowired
	private BaseChargeTypeMapper chargeTypeDao;

	@Autowired
	private BaseAuditDeptService baseAuditDeptService;

	@Autowired
	private AuthFeignClient authFeignClient;

	/**
	 * 查询分页
	 */
	@Override
	public PagedList<PoolPtiOutput> getPage(SearchBaseInput input) {
		// TODO Auto-generated method stub
		PoolPtiExample example = new PoolPtiExample();
		PoolPtiExample.Criteria criteria = example.createCriteria();
		// 过滤掉删除的记录 和未启用的数据
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO)
				.andIsEnabledEqualTo(FinanceIsEnabledEnum.Enabled.getCode());
		if (!StringUtils.isEmpty(input.getName())) {
			criteria.andContainerNoLike("%" + input.getName() + "%");
		}
		// 类型
		if (!StringUtils.isEmpty(input.getChargeInoutType())) {
			criteria.andChargeInoutTypeEqualTo(input.getChargeInoutType());
		}
		// 费用状态
		if (!StringUtils.isEmpty(input.getCode())) {
			criteria.andFreeStatusEqualTo(input.getCode());
		}
		int totalCount = (int) dao.countByExample(example);
		PagedList<PoolPtiOutput> pagedList = new PagedList<PoolPtiOutput>(input.getPageIndex(), input.getPageSize(),
				totalCount);
		// 设置开始行数
		example.setLimitStart(pagedList.getLimitStart());
		// 设置结束行数
		example.setLimitEnd(pagedList.getLimitEnd());
		example.setOrderByClause(" `create_time` DESC");
		List<PoolPti> list = dao.selectByExample(example);
		List<PoolPtiOutput> outputList = list.stream().map(a -> {// 创建日期倒序排列
					PoolPtiOutput output = new PoolPtiOutput();
					// 复制属性值到新对象
					BeanUtils.copyProperties(a, output);
					output.setChargeTypeIdNameLang(a.getChargeTypeKey());
					output.setDeptKeyNameLang(a.getDeptKey());
					output.setFreeStatusNameLang(a.getFreeStatus());
					output.setIsEnabledNameLang(a.getIsEnabled());
					output.setYardNameLang(a.getYard());
					output.setIsFormulaNameLang(a.getIsFormula());
					output.setContainerUserNameLang(a.getContainerUser());
					output.setContainerCategoryNameLang(a.getContainerCategory());
					output.setChargeTypeIdNameLang(a.getChargeTypeKey());
					output.setChargeInoutTypeNameLang(a.getChargeInoutType());
					output.setIsEnabledNameLang(a.getIsEnabled());

					// 查询用户

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
	public Boolean addOrUpadte(PoolPtiInput input) {
		// TODO Auto-generated method stub
		PoolPti record = new PoolPti();
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
			PoolPti info = dao.selectByPrimaryKey(input.getId());
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
	public Boolean Upadtes(List<PoolPtiInput> input) {
		// TODO Auto-generated method stub
		PoolPti record = new PoolPti();
		BeanUtils.copyProperties(input, record);
		if (input != null) {
			for (PoolPtiInput PoolPtiInput : input) {
				if (PoolPtiInput.getId() != null) {
					// 查询一下信息
					PoolPti info = dao.selectByPrimaryKey(PoolPtiInput.getId());
					BeanUtils.copyProperties(info, record);
					BeanUtils.copyProperties(PoolPtiInput, record);
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
			PoolPti record = dao.selectByPrimaryKey(Integer.parseInt(ids[i]));
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
			PoolPti record = dao.selectByPrimaryKey(Integer.parseInt(ids[i]));
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
		PoolPti record = dao.selectByPrimaryKey(Integer.parseInt(input.getId()));
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
	 * PtiOK确认产生收入费用
	 */
	@Override
	public Boolean ptiOkNode(PoolPtiInput input) {
		// TODO Auto-generated method stub
		PoolPti record = new PoolPti();
		input.setPtiOkdate(new Date());
		BeanUtils.copyProperties(input, record);
		
		//根据用箱人 场站 查询PTI费率
		BasePtiRateExample example=new BasePtiRateExample();
		BasePtiRateExample.Criteria criteria=example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO)
//		.andPtiTypeEqualTo(FinanceBudgetTypeEnum.INCOME.getCode())//获取收入pti  类型废弃  一条数据 应收 为 收入  应付为成本
		.andIsEnabledEqualTo(FinanceIsEnabledEnum.Enabled.getCode());
		//场站
		if(!StringUtils.isEmpty(input.getYard())) {
			criteria.andYardEqualTo(input.getYard());
		}
		//用箱人
		if(!StringUtils.isEmpty(input.getContainerUser())) {
			criteria.andContainerUserEqualTo(input.getContainerUser());
		}
		//箱型尺寸
		if(!StringUtils.isEmpty(input.getContainerSize())) {
			criteria.andContainerSizeEqualTo(input.getContainerSize());
		}
		
		example.setOrderByClause(" `create_time` DESC");
		List<BasePtiRate> ptiRateList=ptiRatedao.selectByExample(example);
		if(ptiRateList!=null && ptiRateList.size()>0) {
			BasePtiRate rate=ptiRateList.get(0);
			//判断是否使用公式
			if(rate.getIsFormulaYs().equals(FinanceIsEnabledEnum.NoEnabled.getCode())) {//不使用公式
				record.setPtiCost(rate.getReceivable());//应收费用
				record.setOldCost(rate.getReceivable());//原始费用
				record.setOldCurrencyType(rate.getCurrencyType());
				record.setIsFormula(rate.getIsFormulaYs());
				record.setComputeFormula(rate.getComputeFormulaYs());
				record.setChargeCurrencyType(rate.getCurrencyType());//收费币种
				record.setOptionValue(rate.getOptionValueYs());
				record.setRealCost(rate.getReceivable());
			}else {//使用公式计算
				BigDecimal tmp1=new BigDecimal(0.00);
				//获取当前汇率
				BigDecimal exchangeRate=new BigDecimal(exchangeRateService.getNewRate());
				//(xx)USD*汇率-(xx)CNY
				if(rate.getOptionValueYs().equals(PTIFormulaEnum.Formula_01.getCode())) {
					//截取
					if(!StringUtils.isEmpty(rate.getOptionValueYs())) {
						//截取第一个括号的值   String str1=str.substring(0, str.indexOf("?"));
						String str=rate.getOptionValueYs();
						String firstNum=str.substring(str.indexOf("(")+1, str.indexOf(")"));
						//去掉第一个括号
						String tmpStr=str.substring(str.lastIndexOf("("),str.length());
						String secondNum=tmpStr.substring(tmpStr.indexOf("(")+1, tmpStr.indexOf(")"));
						//开始计算
						tmp1=ComputeUtil.mul(new BigDecimal(firstNum), exchangeRate);
						//减号
						tmp1=ComputeUtil.sub(tmp1,new BigDecimal(secondNum));
					}
					//(xx)CNY-(xx)USD*汇率
				}else if(rate.getOptionValueYs().equals(PTIFormulaEnum.Formula_02.getCode())){//XX人民币 -XX美金*汇率
					//截取
					if(!StringUtils.isEmpty(rate.getOptionValueYs())) {
						//截取第一个括号的值   String str1=str.substring(0, str.indexOf("?"));
						String str=rate.getOptionValueYs();
						String firstNum=str.substring(str.indexOf("(")+1, str.indexOf(")"));
						//去掉第一个括号
						String tmpStr=str.substring(str.lastIndexOf("("),str.length());
						String secondNum=tmpStr.substring(tmpStr.indexOf("(")+1, tmpStr.indexOf(")"));
						//开始计算
						tmp1=ComputeUtil.mul(new BigDecimal(secondNum), exchangeRate);
						//减号
						tmp1=ComputeUtil.sub(new BigDecimal(firstNum),tmp1);
						
					}
				}else if(rate.getOptionValueYs().equals(PTIFormulaEnum.Formula_03.getCode())){//(xx)USD*汇率+(xx)CNY
					//截取
					if(!StringUtils.isEmpty(rate.getOptionValueYs())) {
						//截取第一个括号的值   String str1=str.substring(0, str.indexOf("?"));
						String str=rate.getOptionValueYs();
						String firstNum=str.substring(str.indexOf("(")+1, str.indexOf(")"));
						//去掉第一个括号
						String tmpStr=str.substring(str.lastIndexOf("("),str.length());
						String secondNum=tmpStr.substring(tmpStr.indexOf("(")+1, tmpStr.indexOf(")"));
						//开始计算
						tmp1=ComputeUtil.mul(new BigDecimal(firstNum), exchangeRate);
						//减号
						tmp1=ComputeUtil.add(tmp1,new BigDecimal(secondNum));
					}
				}else if(rate.getOptionValueYs().equals(PTIFormulaEnum.Formula_04.getCode())){//(xx)CNY+(xx)USD*汇率
					//截取
					if(!StringUtils.isEmpty(rate.getOptionValueYs())) {
						//截取第一个括号的值   String str1=str.substring(0, str.indexOf("?"));
						String str=rate.getOptionValueYs();
						String firstNum=str.substring(str.indexOf("(")+1, str.indexOf(")"));
						//去掉第一个括号
						String tmpStr=str.substring(str.lastIndexOf("("),str.length());
						String secondNum=tmpStr.substring(tmpStr.indexOf("(")+1, tmpStr.indexOf(")"));
						//开始计算
						tmp1=ComputeUtil.mul(new BigDecimal(secondNum), exchangeRate);
						//减号
						tmp1=ComputeUtil.add(new BigDecimal(firstNum),tmp1);
						
					}
				}
				
				record.setPtiCost(tmp1);//应收费用
				record.setOldCost(tmp1);//原始费用
				if(!StringUtils.isEmpty(rate.getCurrencyTypeYs())) {
					record.setOldCurrencyType(rate.getCurrencyTypeYs());
					record.setChargeCurrencyType(rate.getCurrencyTypeYs());//收费币种
				}else {
					record.setOldCurrencyType(rate.getCurrencyType());
					record.setChargeCurrencyType(rate.getCurrencyType());//收费币种
				}
				
				record.setIsFormula(rate.getIsFormulaYs());
				record.setComputeFormula(rate.getComputeFormulaYs());
				
				record.setOptionValue(rate.getOptionValueYs());
				record.setRealCost(tmp1);
				
				
				
			}
		}
		record.setPoolType(0);//收入
		record.setChargeTypeKey("LKFICHARGT000007"); //PTI检测费
		
		record.setChargeInoutType(FinanceBudgetTypeEnum.INCOME.getCode());
		record.setFreeStatus(FinanceCostStatusEnum.COSTNOOK.getCode());
		record.setItemStatus(0);
		//查询核算部门 根据场站查询利润中心
		String tmpChargeKey="";
		BaseChargeTypeExample bctExample=new BaseChargeTypeExample();
		bctExample.createCriteria().andLangKeyEqualTo(record.getChargeTypeKey());
		List<BaseChargeType> bctList=chargeTypeDao.selectByExample(bctExample);
		//得到费用key
		if(bctList!=null && bctList.size()>0) {
			tmpChargeKey=bctList.get(0).getChargeKey();
		}


		//核算部门查询
		BaseAuditDeptInput badInput = new BaseAuditDeptInput();
		//场站
		badInput.setYard(record.getYard());
		//箱类别
		badInput.setContainerCategory(record.getContainerCategory());
		//费用类型
		badInput.setChargeKey(tmpChargeKey);

		BaseAuditDept baDept = baseAuditDeptService.getInfo(badInput);
		if (baDept != null) {
			record.setDeptKey(baDept.getProfitDept());// 通过场站查询得到 成本中心
			record.setDeptCode(baDept.getProfitCenterCode());
		}

//		record.setChargeInoutType(FinanceBudgetTypeEnum.INCOME.getCode());
//		//根据箱类别 判断费用类型
//		record.setChargeTypeKey("LKFICHARGT000007");
		
		record.setIsEnabled(FinanceIsEnabledEnum.Enabled.getCode());
		record.setIsDel(PlatformConstants.ISDEL_NO);
		record.setFreeStatus(FinanceCostStatusEnum.COSTNOOK.getCode());
		record.setCreateTime(new Date());
		record.setCreateUser(getCurrentUserId());
		if (dao.insert(record) > 0) {
			//收入完成 开始计算 pti分成
			ptiOkNodeChengBen(input);
			return true;
		}

		return false;
	}
	

	/**
	 * PtiOK确认产生成本费用
	 */
	public Boolean ptiOkNodeChengBen(PoolPtiInput input) {
		// TODO Auto-generated method stub
		PoolPti record = new PoolPti();
		BeanUtils.copyProperties(input, record);
		
		//根据用箱人 场站 查询PTI费率
		BasePtiRateExample example=new BasePtiRateExample();
		BasePtiRateExample.Criteria criteria=example.createCriteria();
		criteria.andIsDelEqualTo(PlatformConstants.ISDEL_NO)
//		.andPtiTypeEqualTo(FinanceBudgetTypeEnum.EXPENDITURE.getCode())//获取成本pti
		.andIsEnabledEqualTo(FinanceIsEnabledEnum.Enabled.getCode());
		//场站
		if(!StringUtils.isEmpty(input.getYard())) {
			criteria.andYardEqualTo(input.getYard());
		}
		//用箱人
		if(!StringUtils.isEmpty(input.getContainerUser())) {
			criteria.andContainerUserEqualTo(input.getContainerUser());
		}
		//箱型尺寸
		if(!StringUtils.isEmpty(input.getContainerSize())) {
			criteria.andContainerSizeEqualTo(input.getContainerSize());
		}
		
		example.setOrderByClause(" `create_time` DESC");
		List<BasePtiRate> ptiRateList=ptiRatedao.selectByExample(example);
		if(ptiRateList!=null && ptiRateList.size()>0) {
			BasePtiRate rate=ptiRateList.get(0);
			//判断是否使用公式
			if(rate.getIsFormulaYf().equals(FinanceIsEnabledEnum.NoEnabled.getCode())) {
				record.setPtiCost(rate.getPayFee());//应付费用
				record.setOldCost(rate.getPayFee());//原始费用
				record.setOldCurrencyType(rate.getPayCurrencyType());
				record.setIsFormula(rate.getIsFormulaYf());
				record.setComputeFormula(rate.getComputeFormulaYf());
				record.setChargeCurrencyType(rate.getCurrencyType());//收费币种
				record.setOptionValue(rate.getOptionValueYf());
				record.setRealCost(rate.getPayFee());
			}else {//使用公式计算
				BigDecimal tmp1=new BigDecimal(0.00);
				//获取当前汇率
				BigDecimal exchangeRate=new BigDecimal(exchangeRateService.getNewRate());
				//(xx)USD*汇率-(xx)CNY
				if(rate.getOptionValueYf().equals(PTIFormulaEnum.Formula_01.getCode())) {
					//截取
					if(!StringUtils.isEmpty(rate.getOptionValueYf())) {
						//截取第一个括号的值   String str1=str.substring(0, str.indexOf("?"));
						String str=rate.getOptionValueYf();
						String firstNum=str.substring(str.indexOf("(")+1, str.indexOf(")"));
						//去掉第一个括号
						String tmpStr=str.substring(str.lastIndexOf("("),str.length());
						String secondNum=tmpStr.substring(tmpStr.indexOf("(")+1, tmpStr.indexOf(")"));
						//开始计算
						tmp1=ComputeUtil.mul(new BigDecimal(firstNum), exchangeRate);
						//减号
						tmp1=ComputeUtil.sub(tmp1,new BigDecimal(secondNum));
					}
					//(xx)CNY-(xx)USD*汇率
				}else if(rate.getOptionValueYf().equals(PTIFormulaEnum.Formula_02.getCode())){//XX人民币 -XX美金*汇率
					//截取
					if(!StringUtils.isEmpty(rate.getOptionValueYf())) {
						//截取第一个括号的值   String str1=str.substring(0, str.indexOf("?"));
						String str=rate.getOptionValueYf();
						String firstNum=str.substring(str.indexOf("(")+1, str.indexOf(")"));
						//去掉第一个括号
						String tmpStr=str.substring(str.lastIndexOf("("),str.length());
						String secondNum=tmpStr.substring(tmpStr.indexOf("(")+1, tmpStr.indexOf(")"));
						//开始计算
						tmp1=ComputeUtil.mul(new BigDecimal(secondNum), exchangeRate);
						//减号
						tmp1=ComputeUtil.sub(new BigDecimal(firstNum),tmp1);
						
					}
				}else if(rate.getOptionValueYf().equals(PTIFormulaEnum.Formula_03.getCode())){//(xx)USD*汇率+(xx)CNY
					//截取
					if(!StringUtils.isEmpty(rate.getOptionValueYf())) {
						//截取第一个括号的值   String str1=str.substring(0, str.indexOf("?"));
						String str=rate.getOptionValueYf();
						String firstNum=str.substring(str.indexOf("(")+1, str.indexOf(")"));
						//去掉第一个括号
						String tmpStr=str.substring(str.lastIndexOf("("),str.length());
						String secondNum=tmpStr.substring(tmpStr.indexOf("(")+1, tmpStr.indexOf(")"));
						//开始计算
						tmp1=ComputeUtil.mul(new BigDecimal(firstNum), exchangeRate);
						//减号
						tmp1=ComputeUtil.add(tmp1,new BigDecimal(secondNum));
					}
				}else if(rate.getOptionValueYf().equals(PTIFormulaEnum.Formula_04.getCode())){//(xx)CNY+(xx)USD*汇率
					//截取
					if(!StringUtils.isEmpty(rate.getOptionValueYf())) {
						//截取第一个括号的值   String str1=str.substring(0, str.indexOf("?"));
						String str=rate.getOptionValueYf();
						String firstNum=str.substring(str.indexOf("(")+1, str.indexOf(")"));
						//去掉第一个括号
						String tmpStr=str.substring(str.lastIndexOf("("),str.length());
						String secondNum=tmpStr.substring(tmpStr.indexOf("(")+1, tmpStr.indexOf(")"));
						//开始计算
						tmp1=ComputeUtil.mul(new BigDecimal(secondNum), exchangeRate);
						//减号
						tmp1=ComputeUtil.add(new BigDecimal(firstNum),tmp1);
						
					}
				}
				
				record.setPtiCost(tmp1);//应收费用
				record.setOldCost(tmp1);//原始费用
				if(!StringUtils.isEmpty(rate.getCurrencyTypeYf())) {
					record.setOldCurrencyType(rate.getCurrencyTypeYf());
					record.setChargeCurrencyType(rate.getCurrencyTypeYf());//收费币种
				}else {
					record.setOldCurrencyType(rate.getCurrencyType());
					record.setChargeCurrencyType(rate.getCurrencyType());//收费币种
				}
				
				record.setIsFormula(rate.getIsFormulaYf());
				record.setComputeFormula(rate.getComputeFormulaYf());
				
				record.setOptionValue(rate.getOptionValueYf());
				record.setRealCost(tmp1);
				
				
				
			}
		}
		record.setPoolType(1);//成本
		record.setChargeTypeKey("LKFICHARGT000007"); //PTI检测费
		
		record.setChargeInoutType(FinanceBudgetTypeEnum.EXPENDITURE.getCode());
		record.setFreeStatus(FinanceCostStatusEnum.COSTNOOK.getCode());
		record.setItemStatus(0);
		//查询核算部门 根据场站查询利润中心
		String tmpChargeKey="";
		BaseChargeTypeExample bctExample=new BaseChargeTypeExample();
		bctExample.createCriteria().andLangKeyEqualTo(record.getChargeTypeKey());
		List<BaseChargeType> bctList=chargeTypeDao.selectByExample(bctExample);
		//得到费用key
		if(bctList!=null && bctList.size()>0) {
			tmpChargeKey=bctList.get(0).getChargeKey();
		}


		//核算部门查询
		BaseAuditDeptInput badInput = new BaseAuditDeptInput();
		//场站
		badInput.setYard(record.getYard());
		//箱类别
		badInput.setContainerCategory(record.getContainerCategory());
		//费用类型
		badInput.setChargeKey(tmpChargeKey);

		BaseAuditDept baDept = baseAuditDeptService.getInfo(badInput);
		if (baDept != null) {
			record.setDeptKey(baDept.getProfitDept());// 通过场站查询得到 成本中心
			record.setDeptCode(baDept.getProfitCenterCode());
		}
//
//		record.setChargeInoutType(FinanceBudgetTypeEnum.INCOME.getCode());
//		//根据箱类别 判断费用类型
//		record.setChargeTypeKey("LKFICHARGT000007");
		
		record.setIsEnabled(FinanceIsEnabledEnum.Enabled.getCode());
		record.setIsDel(PlatformConstants.ISDEL_NO);
		record.setFreeStatus(FinanceCostStatusEnum.COSTNOOK.getCode());
		record.setCreateTime(new Date());
		record.setCreateUser(getCurrentUserId());
		if (dao.insert(record) > 0) {
			return true;
		}

		return false;
	}
}
