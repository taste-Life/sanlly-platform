package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareYard;
import com.sanlly.warehouse.entity.WareYardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareYardMapper {
    long countByExample(WareYardExample example);

    int deleteByExample(WareYardExample example);

    int deleteByPrimaryKey(Integer wareYardId);

    int insert(WareYard record);

    int insertSelective(WareYard record);

    List<WareYard> selectByExample(WareYardExample example);

    WareYard selectByPrimaryKey(Integer wareYardId);

    int updateByExampleSelective(@Param("record") WareYard record, @Param("example") WareYardExample example);

    int updateByExample(@Param("record") WareYard record, @Param("example") WareYardExample example);

    int updateByPrimaryKeySelective(WareYard record);

    int updateByPrimaryKey(WareYard record);
}