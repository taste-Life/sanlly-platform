package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareReturnWarehouseDetail;
import com.sanlly.warehouse.entity.WareReturnWarehouseDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareReturnWarehouseDetailMapper {
    long countByExample(WareReturnWarehouseDetailExample example);

    int deleteByExample(WareReturnWarehouseDetailExample example);

    int deleteByPrimaryKey(Integer wareReturnWarehouseDetailId);

    int insert(WareReturnWarehouseDetail record);

    int insertSelective(WareReturnWarehouseDetail record);

    List<WareReturnWarehouseDetail> selectByExample(WareReturnWarehouseDetailExample example);

    WareReturnWarehouseDetail selectByPrimaryKey(Integer wareReturnWarehouseDetailId);

    int updateByExampleSelective(@Param("record") WareReturnWarehouseDetail record, @Param("example") WareReturnWarehouseDetailExample example);

    int updateByExample(@Param("record") WareReturnWarehouseDetail record, @Param("example") WareReturnWarehouseDetailExample example);

    int updateByPrimaryKeySelective(WareReturnWarehouseDetail record);

    int updateByPrimaryKey(WareReturnWarehouseDetail record);
}