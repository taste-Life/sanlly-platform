package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareExternalSales;
import com.sanlly.warehouse.entity.WareExternalSalesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareExternalSalesMapper {
    long countByExample(WareExternalSalesExample example);

    int deleteByExample(WareExternalSalesExample example);

    int deleteByPrimaryKey(Integer wareExternalSalesId);

    int insert(WareExternalSales record);

    int insertSelective(WareExternalSales record);

    List<WareExternalSales> selectByExample(WareExternalSalesExample example);

    WareExternalSales selectByPrimaryKey(Integer wareExternalSalesId);

    int updateByExampleSelective(@Param("record") WareExternalSales record, @Param("example") WareExternalSalesExample example);

    int updateByExample(@Param("record") WareExternalSales record, @Param("example") WareExternalSalesExample example);

    int updateByPrimaryKeySelective(WareExternalSales record);

    int updateByPrimaryKey(WareExternalSales record);
}