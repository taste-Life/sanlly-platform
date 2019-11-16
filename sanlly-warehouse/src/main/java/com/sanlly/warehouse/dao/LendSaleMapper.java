package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.LendSale;
import com.sanlly.warehouse.entity.LendSaleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LendSaleMapper {
    long countByExample(LendSaleExample example);

    int deleteByExample(LendSaleExample example);

    int deleteByPrimaryKey(Integer lendSaleId);

    int insert(LendSale record);

    int insertSelective(LendSale record);

    List<LendSale> selectByExample(LendSaleExample example);

    LendSale selectByPrimaryKey(Integer lendSaleId);

    int updateByExampleSelective(@Param("record") LendSale record, @Param("example") LendSaleExample example);

    int updateByExample(@Param("record") LendSale record, @Param("example") LendSaleExample example);

    int updateByPrimaryKeySelective(LendSale record);

    int updateByPrimaryKey(LendSale record);
}