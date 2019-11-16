package com.sanlly.production.dao;

import com.sanlly.production.entity.MessageField;
import com.sanlly.production.entity.MessageFieldExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MessageFieldMapper {
    long countByExample(MessageFieldExample example);

    int deleteByExample(MessageFieldExample example);

    int deleteByPrimaryKey(Integer prodMessageFieldId);

    int insert(MessageField record);

    int insertSelective(MessageField record);

    List<MessageField> selectByExample(MessageFieldExample example);

    MessageField selectByPrimaryKey(Integer prodMessageFieldId);

    int updateByExampleSelective(@Param("record") MessageField record, @Param("example") MessageFieldExample example);

    int updateByExample(@Param("record") MessageField record, @Param("example") MessageFieldExample example);

    int updateByPrimaryKeySelective(MessageField record);

    int updateByPrimaryKey(MessageField record);
}