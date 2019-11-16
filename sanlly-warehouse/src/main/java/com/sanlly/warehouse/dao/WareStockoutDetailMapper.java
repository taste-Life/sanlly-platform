package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareStockoutDetail;
import com.sanlly.warehouse.entity.WareStockoutDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareStockoutDetailMapper {
    long countByExample(WareStockoutDetailExample example);

    int deleteByExample(WareStockoutDetailExample example);

    int deleteByPrimaryKey(Integer wareStockoutOrderDetailId);

    int insert(WareStockoutDetail record);

    int insertSelective(WareStockoutDetail record);

    List<WareStockoutDetail> selectByExample(WareStockoutDetailExample example);

    WareStockoutDetail selectByPrimaryKey(Integer wareStockoutOrderDetailId);

    int updateByExampleSelective(@Param("record") WareStockoutDetail record, @Param("example") WareStockoutDetailExample example);

    int updateByExample(@Param("record") WareStockoutDetail record, @Param("example") WareStockoutDetailExample example);

    int updateByPrimaryKeySelective(WareStockoutDetail record);

    int updateByPrimaryKey(WareStockoutDetail record);
}