package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.ShouldReturn;
import com.sanlly.warehouse.entity.ShouldReturnExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShouldReturnMapper {
    long countByExample(ShouldReturnExample example);

    int deleteByExample(ShouldReturnExample example);

    int deleteByPrimaryKey(Integer wareShouldReturnId);

    int insert(ShouldReturn record);

    int insertSelective(ShouldReturn record);

    List<ShouldReturn> selectByExample(ShouldReturnExample example);

    ShouldReturn selectByPrimaryKey(Integer wareShouldReturnId);

    int updateByExampleSelective(@Param("record") ShouldReturn record, @Param("example") ShouldReturnExample example);

    int updateByExample(@Param("record") ShouldReturn record, @Param("example") ShouldReturnExample example);

    int updateByPrimaryKeySelective(ShouldReturn record);

    int updateByPrimaryKey(ShouldReturn record);
}