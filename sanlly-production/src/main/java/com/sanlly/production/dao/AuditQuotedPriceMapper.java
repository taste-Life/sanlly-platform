package com.sanlly.production.dao;

import com.sanlly.production.entity.AuditQuotedPrice;
import com.sanlly.production.entity.AuditQuotedPriceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuditQuotedPriceMapper {
    long countByExample(AuditQuotedPriceExample example);

    int deleteByExample(AuditQuotedPriceExample example);

    int deleteByPrimaryKey(Integer prodAuditQuotedPriceId);

    int insert(AuditQuotedPrice record);

    int insertSelective(AuditQuotedPrice record);

    List<AuditQuotedPrice> selectByExample(AuditQuotedPriceExample example);

    AuditQuotedPrice selectByPrimaryKey(Integer prodAuditQuotedPriceId);

    int updateByExampleSelective(@Param("record") AuditQuotedPrice record, @Param("example") AuditQuotedPriceExample example);

    int updateByExample(@Param("record") AuditQuotedPrice record, @Param("example") AuditQuotedPriceExample example);

    int updateByPrimaryKeySelective(AuditQuotedPrice record);

    int updateByPrimaryKey(AuditQuotedPrice record);
}