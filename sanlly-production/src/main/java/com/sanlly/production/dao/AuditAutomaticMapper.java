package com.sanlly.production.dao;

import com.sanlly.production.entity.AuditAutomatic;
import com.sanlly.production.entity.AuditAutomaticExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuditAutomaticMapper {
    long countByExample(AuditAutomaticExample example);

    int deleteByExample(AuditAutomaticExample example);

    int deleteByPrimaryKey(Integer prodAuditAutomaticId);

    int insert(AuditAutomatic record);

    int insertSelective(AuditAutomatic record);

    List<AuditAutomatic> selectByExample(AuditAutomaticExample example);

    AuditAutomatic selectByPrimaryKey(Integer prodAuditAutomaticId);

    int updateByExampleSelective(@Param("record") AuditAutomatic record, @Param("example") AuditAutomaticExample example);

    int updateByExample(@Param("record") AuditAutomatic record, @Param("example") AuditAutomaticExample example);

    int updateByPrimaryKeySelective(AuditAutomatic record);

    int updateByPrimaryKey(AuditAutomatic record);
}