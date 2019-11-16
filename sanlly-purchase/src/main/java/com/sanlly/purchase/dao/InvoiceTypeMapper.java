package com.sanlly.purchase.dao;

import com.sanlly.purchase.entity.InvoiceType;
import com.sanlly.purchase.entity.InvoiceTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InvoiceTypeMapper {
    long countByExample(InvoiceTypeExample example);

    int deleteByExample(InvoiceTypeExample example);

    int deleteByPrimaryKey(Integer purcInvoiceTypeId);

    int insert(InvoiceType record);

    int insertSelective(InvoiceType record);

    List<InvoiceType> selectByExample(InvoiceTypeExample example);

    InvoiceType selectByPrimaryKey(Integer purcInvoiceTypeId);

    int updateByExampleSelective(@Param("record") InvoiceType record, @Param("example") InvoiceTypeExample example);

    int updateByExample(@Param("record") InvoiceType record, @Param("example") InvoiceTypeExample example);

    int updateByPrimaryKeySelective(InvoiceType record);

    int updateByPrimaryKey(InvoiceType record);
}