package com.sanlly.finance.dao;

import com.sanlly.finance.entity.BaseYardSchema;
import com.sanlly.finance.entity.BaseYardSchemaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseYardSchemaMapper {
    long countByExample(BaseYardSchemaExample example);

    int deleteByExample(BaseYardSchemaExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BaseYardSchema record);

    int insertSelective(BaseYardSchema record);

    List<BaseYardSchema> selectByExample(BaseYardSchemaExample example);

    BaseYardSchema selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BaseYardSchema record, @Param("example") BaseYardSchemaExample example);

    int updateByExample(@Param("record") BaseYardSchema record, @Param("example") BaseYardSchemaExample example);

    int updateByPrimaryKeySelective(BaseYardSchema record);

    int updateByPrimaryKey(BaseYardSchema record);
}