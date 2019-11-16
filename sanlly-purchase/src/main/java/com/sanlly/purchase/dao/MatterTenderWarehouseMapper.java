package com.sanlly.purchase.dao;

import com.sanlly.purchase.entity.MatterTenderWarehouse;
import com.sanlly.purchase.entity.MatterTenderWarehouseExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MatterTenderWarehouseMapper {
    long countByExample(MatterTenderWarehouseExample example);

    int deleteByExample(MatterTenderWarehouseExample example);

    int deleteByPrimaryKey(Integer purcMatterTenderWarehouseId);

    int insert(MatterTenderWarehouse record);

    int insertSelective(MatterTenderWarehouse record);

    List<MatterTenderWarehouse> selectByExample(MatterTenderWarehouseExample example);

    MatterTenderWarehouse selectByPrimaryKey(Integer purcMatterTenderWarehouseId);

    int updateByExampleSelective(@Param("record") MatterTenderWarehouse record, @Param("example") MatterTenderWarehouseExample example);

    int updateByExample(@Param("record") MatterTenderWarehouse record, @Param("example") MatterTenderWarehouseExample example);

    int updateByPrimaryKeySelective(MatterTenderWarehouse record);

    int updateByPrimaryKey(MatterTenderWarehouse record);
}