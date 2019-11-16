package com.sanlly.finance.dao;

import com.sanlly.finance.entity.BusinessInvoice;
import com.sanlly.finance.entity.BusinessInvoiceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BusinessInvoiceMapper {
    long countByExample(BusinessInvoiceExample example);

    int deleteByExample(BusinessInvoiceExample example);

    int deleteByPrimaryKey(Integer businessInvoiceId);

    int insert(BusinessInvoice record);

    int insertSelective(BusinessInvoice record);

    List<BusinessInvoice> selectByExample(BusinessInvoiceExample example);

    BusinessInvoice selectByPrimaryKey(Integer businessInvoiceId);

    int updateByExampleSelective(@Param("record") BusinessInvoice record, @Param("example") BusinessInvoiceExample example);

    int updateByExample(@Param("record") BusinessInvoice record, @Param("example") BusinessInvoiceExample example);

    int updateByPrimaryKeySelective(BusinessInvoice record);

    int updateByPrimaryKey(BusinessInvoice record);
}