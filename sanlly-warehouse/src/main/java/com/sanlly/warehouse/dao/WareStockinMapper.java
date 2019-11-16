package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareStockin;
import com.sanlly.warehouse.entity.WareStockinExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareStockinMapper {
    long countByExample(WareStockinExample example);

    int deleteByExample(WareStockinExample example);

    int deleteByPrimaryKey(Integer wareStockinId);

    int insert(WareStockin record);

    int insertSelective(WareStockin record);

    List<WareStockin> selectByExample(WareStockinExample example);

    WareStockin selectByPrimaryKey(Integer wareStockinId);

    int updateByExampleSelective(@Param("record") WareStockin record, @Param("example") WareStockinExample example);

    int updateByExample(@Param("record") WareStockin record, @Param("example") WareStockinExample example);

    int updateByPrimaryKeySelective(WareStockin record);

    int updateByPrimaryKey(WareStockin record);
}