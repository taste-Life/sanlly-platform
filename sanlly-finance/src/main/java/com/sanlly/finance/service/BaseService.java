package com.sanlly.finance.service;

import java.util.List;

import com.sanlly.common.enums.FinanceBillStatusEnum;
import com.sanlly.common.enums.FinanceBillTypeEnum;
import com.sanlly.common.enums.FinanceBudgetTypeEnum;

/**
 * 通用查询实现
* @Package com.sanlly.finance.service 
* @Description: TODO 
* @author fjy   
* @date 2019年9月2日 下午2:05:12 
* @version V1.0   
 */
public interface BaseService {
	
	/**
	 * 根据账单类型 langkey获取相应的账单编号
	* @Description: TODO 
	* @param billTypeEnum  账单类型枚举
	* @param inoutEnum  收支类型枚举
	* @param companyCode  公司代码
	* @return String  账单号
	* @throws 账单标记（1）+ 账单类型（2）+ 收入/成本标记（1）+ 公司代码（4）+ 账单号递增排序（7）+ 调账版本（3）
	 */
	String getBillCode(FinanceBillTypeEnum billTypeEnum,FinanceBudgetTypeEnum inoutEnum,String companyCode);
	

}
