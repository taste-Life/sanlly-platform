package com.sanlly.finance.dao;

import org.apache.ibatis.annotations.Param;

import com.sanlly.finance.entity.BaseBillType;
/**
 * 账单号自增查询 加锁
* @Package com.sanlly.finance.dao 
* @Description: TODO 
* @author fjy   
* @date 2019年9月2日 下午2:03:25 
* @version V1.0   
 */
public interface BaseBillTypeExtMapper {
    
	BaseBillType selectByKeyForUpdate(@Param(value = "langKey")String langKey);

}