package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareInvoiceType;
import com.sanlly.warehouse.entity.WareInvoiceTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareInvoiceTypeMapper {
    long countByExample(WareInvoiceTypeExample example);

    int deleteByExample(WareInvoiceTypeExample example);

    int deleteByPrimaryKey(Integer wareInvoiceTypeId);

    int insert(WareInvoiceType record);

    int insertSelective(WareInvoiceType record);

    List<WareInvoiceType> selectByExample(WareInvoiceTypeExample example);

    WareInvoiceType selectByPrimaryKey(Integer wareInvoiceTypeId);

    int updateByExampleSelective(@Param("record") WareInvoiceType record, @Param("example") WareInvoiceTypeExample example);

    int updateByExample(@Param("record") WareInvoiceType record, @Param("example") WareInvoiceTypeExample example);

    int updateByPrimaryKeySelective(WareInvoiceType record);

    int updateByPrimaryKey(WareInvoiceType record);
}