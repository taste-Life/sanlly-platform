package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareExternalSalesDetail;
import com.sanlly.warehouse.entity.WareExternalSalesDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareExternalSalesDetailMapper {
    long countByExample(WareExternalSalesDetailExample example);

    int deleteByExample(WareExternalSalesDetailExample example);

    int deleteByPrimaryKey(Integer wareExternalSalesDetailId);

    int insert(WareExternalSalesDetail record);

    int insertSelective(WareExternalSalesDetail record);

    List<WareExternalSalesDetail> selectByExample(WareExternalSalesDetailExample example);

    WareExternalSalesDetail selectByPrimaryKey(Integer wareExternalSalesDetailId);

    int updateByExampleSelective(@Param("record") WareExternalSalesDetail record, @Param("example") WareExternalSalesDetailExample example);

    int updateByExample(@Param("record") WareExternalSalesDetail record, @Param("example") WareExternalSalesDetailExample example);

    int updateByPrimaryKeySelective(WareExternalSalesDetail record);

    int updateByPrimaryKey(WareExternalSalesDetail record);
}