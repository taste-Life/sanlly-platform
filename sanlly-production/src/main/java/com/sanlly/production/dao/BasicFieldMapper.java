package com.sanlly.production.dao;

import com.sanlly.production.entity.BasicField;
import com.sanlly.production.entity.BasicFieldExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BasicFieldMapper {
    long countByExample(BasicFieldExample example);

    int deleteByExample(BasicFieldExample example);

    int deleteByPrimaryKey(Integer prodBasicFieldId);

    int insert(BasicField record);

    int insertSelective(BasicField record);

    List<BasicField> selectByExample(BasicFieldExample example);

    BasicField selectByPrimaryKey(Integer prodBasicFieldId);

    int updateByExampleSelective(@Param("record") BasicField record, @Param("example") BasicFieldExample example);

    int updateByExample(@Param("record") BasicField record, @Param("example") BasicFieldExample example);

    int updateByPrimaryKeySelective(BasicField record);

    int updateByPrimaryKey(BasicField record);
}