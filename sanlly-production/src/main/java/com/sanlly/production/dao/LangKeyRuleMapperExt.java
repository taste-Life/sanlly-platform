package com.sanlly.production.dao;

import com.sanlly.production.entity.LangKeyRule;
import com.sanlly.production.entity.LangKeyRuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LangKeyRuleMapperExt {
	/**
	 * 根据表名获取一个规则 包含行锁
	 * @param tableName
	 * @return
	 */
	LangKeyRule selectByTableNameForUpdate(@Param(value = "tableName")String tableName);
}