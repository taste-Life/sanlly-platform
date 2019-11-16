package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareBilltypeWarehousetype;
import com.sanlly.warehouse.entity.WareBilltypeWarehousetypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareBilltypeWarehousetypeMapper {
    long countByExample(WareBilltypeWarehousetypeExample example);

    int deleteByExample(WareBilltypeWarehousetypeExample example);

    int deleteByPrimaryKey(Integer wareBilltypeWarehousetypeId);

    int insert(WareBilltypeWarehousetype record);

    int insertSelective(WareBilltypeWarehousetype record);

    List<WareBilltypeWarehousetype> selectByExample(WareBilltypeWarehousetypeExample example);

    WareBilltypeWarehousetype selectByPrimaryKey(Integer wareBilltypeWarehousetypeId);

    int updateByExampleSelective(@Param("record") WareBilltypeWarehousetype record, @Param("example") WareBilltypeWarehousetypeExample example);

    int updateByExample(@Param("record") WareBilltypeWarehousetype record, @Param("example") WareBilltypeWarehousetypeExample example);

    int updateByPrimaryKeySelective(WareBilltypeWarehousetype record);

    int updateByPrimaryKey(WareBilltypeWarehousetype record);
}