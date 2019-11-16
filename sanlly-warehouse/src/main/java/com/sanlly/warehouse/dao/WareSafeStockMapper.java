package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareSafeStock;
import com.sanlly.warehouse.entity.WareSafeStockExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareSafeStockMapper {
    long countByExample(WareSafeStockExample example);

    int deleteByExample(WareSafeStockExample example);

    int deleteByPrimaryKey(Integer wareSafeStockId);

    int insert(WareSafeStock record);

    int insertSelective(WareSafeStock record);

    List<WareSafeStock> selectByExample(WareSafeStockExample example);

    WareSafeStock selectByPrimaryKey(Integer wareSafeStockId);

    int updateByExampleSelective(@Param("record") WareSafeStock record, @Param("example") WareSafeStockExample example);

    int updateByExample(@Param("record") WareSafeStock record, @Param("example") WareSafeStockExample example);

    int updateByPrimaryKeySelective(WareSafeStock record);

    int updateByPrimaryKey(WareSafeStock record);
}