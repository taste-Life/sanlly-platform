package com.sanlly.warehouse.dao;

import java.util.List;
import java.util.Map;

import com.sanlly.warehouse.entity.WareReturnWarehouse;

public interface WareStockExtMapper {

    int updateSurplusNum(Map<String, Object> map);
    List<WareReturnWarehouse> selectStockOutNumByOriginalBatchAndparts(Map<String, Object> map);
}