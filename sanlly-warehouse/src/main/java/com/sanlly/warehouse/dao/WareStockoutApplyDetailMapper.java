package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareStockoutApplyDetail;
import com.sanlly.warehouse.entity.WareStockoutApplyDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareStockoutApplyDetailMapper {
    long countByExample(WareStockoutApplyDetailExample example);

    int deleteByExample(WareStockoutApplyDetailExample example);

    int deleteByPrimaryKey(Integer wareStockoutOrderDetailId);

    int insert(WareStockoutApplyDetail record);

    int insertSelective(WareStockoutApplyDetail record);

    List<WareStockoutApplyDetail> selectByExample(WareStockoutApplyDetailExample example);

    WareStockoutApplyDetail selectByPrimaryKey(Integer wareStockoutOrderDetailId);

    int updateByExampleSelective(@Param("record") WareStockoutApplyDetail record, @Param("example") WareStockoutApplyDetailExample example);

    int updateByExample(@Param("record") WareStockoutApplyDetail record, @Param("example") WareStockoutApplyDetailExample example);

    int updateByPrimaryKeySelective(WareStockoutApplyDetail record);

    int updateByPrimaryKey(WareStockoutApplyDetail record);
}