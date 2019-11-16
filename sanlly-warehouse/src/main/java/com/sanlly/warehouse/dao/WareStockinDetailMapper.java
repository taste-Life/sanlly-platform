package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareStockinDetail;
import com.sanlly.warehouse.entity.WareStockinDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareStockinDetailMapper {
    long countByExample(WareStockinDetailExample example);

    int deleteByExample(WareStockinDetailExample example);

    int deleteByPrimaryKey(Integer wareStockinDetailId);

    int insert(WareStockinDetail record);

    int insertSelective(WareStockinDetail record);

    List<WareStockinDetail> selectByExample(WareStockinDetailExample example);

    WareStockinDetail selectByPrimaryKey(Integer wareStockinDetailId);

    int updateByExampleSelective(@Param("record") WareStockinDetail record, @Param("example") WareStockinDetailExample example);

    int updateByExample(@Param("record") WareStockinDetail record, @Param("example") WareStockinDetailExample example);

    int updateByPrimaryKeySelective(WareStockinDetail record);

    int updateByPrimaryKey(WareStockinDetail record);
}