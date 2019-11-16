package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.LendSaleDetail;
import com.sanlly.warehouse.entity.LendSaleDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LendSaleDetailMapper {
    long countByExample(LendSaleDetailExample example);

    int deleteByExample(LendSaleDetailExample example);

    int deleteByPrimaryKey(Integer lendSaleDetailId);

    int insert(LendSaleDetail record);

    int insertSelective(LendSaleDetail record);

    List<LendSaleDetail> selectByExample(LendSaleDetailExample example);

    LendSaleDetail selectByPrimaryKey(Integer lendSaleDetailId);

    int updateByExampleSelective(@Param("record") LendSaleDetail record, @Param("example") LendSaleDetailExample example);

    int updateByExample(@Param("record") LendSaleDetail record, @Param("example") LendSaleDetailExample example);

    int updateByPrimaryKeySelective(LendSaleDetail record);

    int updateByPrimaryKey(LendSaleDetail record);
}