package com.sanlly.production.dao;

import com.sanlly.production.entity.AuditRestrict;
import com.sanlly.production.entity.AuditRestrictExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuditRestrictMapper {
    long countByExample(AuditRestrictExample example);

    int deleteByExample(AuditRestrictExample example);

    int deleteByPrimaryKey(Integer prodAuditRestrictId);

    int insert(AuditRestrict record);

    int insertSelective(AuditRestrict record);

    List<AuditRestrict> selectByExample(AuditRestrictExample example);

    AuditRestrict selectByPrimaryKey(Integer prodAuditRestrictId);

    int updateByExampleSelective(@Param("record") AuditRestrict record, @Param("example") AuditRestrictExample example);

    int updateByExample(@Param("record") AuditRestrict record, @Param("example") AuditRestrictExample example);

    int updateByPrimaryKeySelective(AuditRestrict record);

    int updateByPrimaryKey(AuditRestrict record);
}