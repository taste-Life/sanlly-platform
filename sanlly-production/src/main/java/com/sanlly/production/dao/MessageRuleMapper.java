package com.sanlly.production.dao;

import com.sanlly.production.entity.MessageRule;
import com.sanlly.production.entity.MessageRuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MessageRuleMapper {
    long countByExample(MessageRuleExample example);

    int deleteByExample(MessageRuleExample example);

    int deleteByPrimaryKey(Integer prodMessageRuleId);

    int insert(MessageRule record);

    int insertSelective(MessageRule record);

    List<MessageRule> selectByExample(MessageRuleExample example);

    MessageRule selectByPrimaryKey(Integer prodMessageRuleId);

    int updateByExampleSelective(@Param("record") MessageRule record, @Param("example") MessageRuleExample example);

    int updateByExample(@Param("record") MessageRule record, @Param("example") MessageRuleExample example);

    int updateByPrimaryKeySelective(MessageRule record);

    int updateByPrimaryKey(MessageRule record);
}