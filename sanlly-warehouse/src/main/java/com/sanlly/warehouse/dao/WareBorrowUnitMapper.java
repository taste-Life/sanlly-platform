package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareBorrowUnit;
import com.sanlly.warehouse.entity.WareBorrowUnitExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WareBorrowUnitMapper {
    long countByExample(WareBorrowUnitExample example);

    int deleteByExample(WareBorrowUnitExample example);

    int deleteByPrimaryKey(Integer wareBorrowUnitId);

    int insert(WareBorrowUnit record);

    int insertSelective(WareBorrowUnit record);

    List<WareBorrowUnit> selectByExample(WareBorrowUnitExample example);

    WareBorrowUnit selectByPrimaryKey(Integer wareBorrowUnitId);

    int updateByExampleSelective(@Param("record") WareBorrowUnit record, @Param("example") WareBorrowUnitExample example);

    int updateByExample(@Param("record") WareBorrowUnit record, @Param("example") WareBorrowUnitExample example);

    int updateByPrimaryKeySelective(WareBorrowUnit record);

    int updateByPrimaryKey(WareBorrowUnit record);
}