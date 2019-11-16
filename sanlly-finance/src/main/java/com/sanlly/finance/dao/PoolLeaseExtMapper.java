package com.sanlly.finance.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sanlly.finance.entity.PoolLease;
/**
 * 
* @Package com.sanlly.finance.dao 
* @Description: TODO 
* @author fjy   
* @date 2019年9月2日 下午2:03:25 
* @version V1.0   
 */
public interface PoolLeaseExtMapper {
    
	List<PoolLease> selectList(@Param(value = "isDel")Integer isDel,@Param(value = "isEnabled")String isEnabled,@Param(value = "yearMonth")String yearMonth);

}