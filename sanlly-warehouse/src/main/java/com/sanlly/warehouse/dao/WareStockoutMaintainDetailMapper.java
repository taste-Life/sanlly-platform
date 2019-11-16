package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareStockoutMaintainDetail;
import com.sanlly.warehouse.entity.WareStockoutMaintainDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareStockoutMaintainDetailMapper {
    long countByExample(WareStockoutMaintainDetailExample example);

    int deleteByExample(WareStockoutMaintainDetailExample example);

    int deleteByPrimaryKey(Integer wareStockoutMaintainDetailId);

    int insert(WareStockoutMaintainDetail record);

    int insertSelective(WareStockoutMaintainDetail record);

    List<WareStockoutMaintainDetail> selectByExample(WareStockoutMaintainDetailExample example);

    WareStockoutMaintainDetail selectByPrimaryKey(Integer wareStockoutMaintainDetailId);

    int updateByExampleSelective(@Param("record") WareStockoutMaintainDetail record, @Param("example") WareStockoutMaintainDetailExample example);

    int updateByExample(@Param("record") WareStockoutMaintainDetail record, @Param("example") WareStockoutMaintainDetailExample example);

    int updateByPrimaryKeySelective(WareStockoutMaintainDetail record);

    int updateByPrimaryKey(WareStockoutMaintainDetail record);
}