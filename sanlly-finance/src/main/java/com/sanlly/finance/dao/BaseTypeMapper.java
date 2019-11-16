package com.sanlly.finance.dao;

import com.sanlly.finance.entity.BaseType;
import com.sanlly.finance.entity.BaseTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseTypeMapper {
    long countByExample(BaseTypeExample example);

    int deleteByExample(BaseTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BaseType record);

    int insertSelective(BaseType record);

    List<BaseType> selectByExample(BaseTypeExample example);

    BaseType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BaseType record, @Param("example") BaseTypeExample example);

    int updateByExample(@Param("record") BaseType record, @Param("example") BaseTypeExample example);

    int updateByPrimaryKeySelective(BaseType record);

    int updateByPrimaryKey(BaseType record);
}