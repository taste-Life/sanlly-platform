package com.sanlly.finance.dao;

import com.sanlly.finance.entity.Schema;
import com.sanlly.finance.entity.SchemaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SchemaMapper {
    long countByExample(SchemaExample example);

    int deleteByExample(SchemaExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Schema record);

    int insertSelective(Schema record);

    List<Schema> selectByExample(SchemaExample example);

    Schema selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Schema record, @Param("example") SchemaExample example);

    int updateByExample(@Param("record") Schema record, @Param("example") SchemaExample example);

    int updateByPrimaryKeySelective(Schema record);

    int updateByPrimaryKey(Schema record);
}