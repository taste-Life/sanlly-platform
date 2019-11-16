package com.sanlly.production.dao;

import com.sanlly.production.entity.LangKeyRule;
import com.sanlly.production.entity.LangKeyRuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LangKeyRuleMapper {
    long countByExample(LangKeyRuleExample example);

    int deleteByExample(LangKeyRuleExample example);

    int deleteByPrimaryKey(String keyPrefix);

    int insert(LangKeyRule record);

    int insertSelective(LangKeyRule record);

    List<LangKeyRule> selectByExample(LangKeyRuleExample example);

    LangKeyRule selectByPrimaryKey(String keyPrefix);

    int updateByExampleSelective(@Param("record") LangKeyRule record, @Param("example") LangKeyRuleExample example);

    int updateByExample(@Param("record") LangKeyRule record, @Param("example") LangKeyRuleExample example);

    int updateByPrimaryKeySelective(LangKeyRule record);

    int updateByPrimaryKey(LangKeyRule record);
}