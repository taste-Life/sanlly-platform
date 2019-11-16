package com.sanlly.production.dao;

import com.sanlly.production.entity.AuditPayingChange;
import com.sanlly.production.entity.AuditPayingChangeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuditPayingChangeMapper {
    long countByExample(AuditPayingChangeExample example);

    int deleteByExample(AuditPayingChangeExample example);

    int deleteByPrimaryKey(Integer prodAuditPayingChangeId);

    int insert(AuditPayingChange record);

    int insertSelective(AuditPayingChange record);

    List<AuditPayingChange> selectByExample(AuditPayingChangeExample example);

    AuditPayingChange selectByPrimaryKey(Integer prodAuditPayingChangeId);

    int updateByExampleSelective(@Param("record") AuditPayingChange record, @Param("example") AuditPayingChangeExample example);

    int updateByExample(@Param("record") AuditPayingChange record, @Param("example") AuditPayingChangeExample example);

    int updateByPrimaryKeySelective(AuditPayingChange record);

    int updateByPrimaryKey(AuditPayingChange record);
}