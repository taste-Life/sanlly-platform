package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareLaborStock;
import com.sanlly.warehouse.entity.WareLaborStockExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareLaborStockMapper {
    long countByExample(WareLaborStockExample example);

    int deleteByExample(WareLaborStockExample example);

    int deleteByPrimaryKey(Integer wareLaborStockId);

    int insert(WareLaborStock record);

    int insertSelective(WareLaborStock record);

    List<WareLaborStock> selectByExample(WareLaborStockExample example);

    WareLaborStock selectByPrimaryKey(Integer wareLaborStockId);

    int updateByExampleSelective(@Param("record") WareLaborStock record, @Param("example") WareLaborStockExample example);

    int updateByExample(@Param("record") WareLaborStock record, @Param("example") WareLaborStockExample example);

    int updateByPrimaryKeySelective(WareLaborStock record);

    int updateByPrimaryKey(WareLaborStock record);
}