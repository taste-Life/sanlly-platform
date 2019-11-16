package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareTakeStock;
import com.sanlly.warehouse.entity.WareTakeStockExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareTakeStockMapper {
    long countByExample(WareTakeStockExample example);

    int deleteByExample(WareTakeStockExample example);

    int deleteByPrimaryKey(Integer wareTakeStockId);

    int insert(WareTakeStock record);

    int insertSelective(WareTakeStock record);

    List<WareTakeStock> selectByExample(WareTakeStockExample example);

    WareTakeStock selectByPrimaryKey(Integer wareTakeStockId);

    int updateByExampleSelective(@Param("record") WareTakeStock record, @Param("example") WareTakeStockExample example);

    int updateByExample(@Param("record") WareTakeStock record, @Param("example") WareTakeStockExample example);

    int updateByPrimaryKeySelective(WareTakeStock record);

    int updateByPrimaryKey(WareTakeStock record);
}