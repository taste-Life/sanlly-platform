package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WarePurchaseRequisitions;
import com.sanlly.warehouse.entity.WarePurchaseRequisitionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WarePurchaseRequisitionsMapper {
    long countByExample(WarePurchaseRequisitionsExample example);

    int deleteByExample(WarePurchaseRequisitionsExample example);

    int deleteByPrimaryKey(Integer warePurchaseRequisitionsId);

    int insert(WarePurchaseRequisitions record);

    int insertSelective(WarePurchaseRequisitions record);

    List<WarePurchaseRequisitions> selectByExample(WarePurchaseRequisitionsExample example);

    WarePurchaseRequisitions selectByPrimaryKey(Integer warePurchaseRequisitionsId);

    int updateByExampleSelective(@Param("record") WarePurchaseRequisitions record, @Param("example") WarePurchaseRequisitionsExample example);

    int updateByExample(@Param("record") WarePurchaseRequisitions record, @Param("example") WarePurchaseRequisitionsExample example);

    int updateByPrimaryKeySelective(WarePurchaseRequisitions record);

    int updateByPrimaryKey(WarePurchaseRequisitions record);
}