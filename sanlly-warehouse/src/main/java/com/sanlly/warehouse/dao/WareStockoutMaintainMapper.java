package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareStockoutMaintain;
import com.sanlly.warehouse.entity.WareStockoutMaintainExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareStockoutMaintainMapper {
    long countByExample(WareStockoutMaintainExample example);

    int deleteByExample(WareStockoutMaintainExample example);

    int deleteByPrimaryKey(Integer wareStockoutMaintainId);

    int insert(WareStockoutMaintain record);

    int insertSelective(WareStockoutMaintain record);

    List<WareStockoutMaintain> selectByExample(WareStockoutMaintainExample example);

    WareStockoutMaintain selectByPrimaryKey(Integer wareStockoutMaintainId);

    int updateByExampleSelective(@Param("record") WareStockoutMaintain record, @Param("example") WareStockoutMaintainExample example);

    int updateByExample(@Param("record") WareStockoutMaintain record, @Param("example") WareStockoutMaintainExample example);

    int updateByPrimaryKeySelective(WareStockoutMaintain record);

    int updateByPrimaryKey(WareStockoutMaintain record);
}