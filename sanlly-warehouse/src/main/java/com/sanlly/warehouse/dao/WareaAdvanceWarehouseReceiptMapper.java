package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareaAdvanceWarehouseReceipt;
import com.sanlly.warehouse.entity.WareaAdvanceWarehouseReceiptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareaAdvanceWarehouseReceiptMapper {
    long countByExample(WareaAdvanceWarehouseReceiptExample example);

    int deleteByExample(WareaAdvanceWarehouseReceiptExample example);

    int deleteByPrimaryKey(Integer wareAdvanceWarehouseReceiptId);

    int insert(WareaAdvanceWarehouseReceipt record);

    int insertSelective(WareaAdvanceWarehouseReceipt record);

    List<WareaAdvanceWarehouseReceipt> selectByExample(WareaAdvanceWarehouseReceiptExample example);

    WareaAdvanceWarehouseReceipt selectByPrimaryKey(Integer wareAdvanceWarehouseReceiptId);

    int updateByExampleSelective(@Param("record") WareaAdvanceWarehouseReceipt record, @Param("example") WareaAdvanceWarehouseReceiptExample example);

    int updateByExample(@Param("record") WareaAdvanceWarehouseReceipt record, @Param("example") WareaAdvanceWarehouseReceiptExample example);

    int updateByPrimaryKeySelective(WareaAdvanceWarehouseReceipt record);

    int updateByPrimaryKey(WareaAdvanceWarehouseReceipt record);
}