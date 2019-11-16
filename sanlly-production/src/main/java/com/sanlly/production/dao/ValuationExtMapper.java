package com.sanlly.production.dao;

import java.util.List;
import java.util.Map;

import com.sanlly.production.entity.Valuation;

/**
 * 
 * @author zhangkai
 *
 */
public interface ValuationExtMapper {

	List<Valuation> selectValuationCodeList(Map<String, Object> map);
	
	Integer selectValuationCodeCount(Map<String, Object> map);
}
