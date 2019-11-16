package com.sanlly.production.dao;

import com.sanlly.production.entity.AuditInspector;
import com.sanlly.production.entity.AuditInspectorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuditInspectorMapper {
    long countByExample(AuditInspectorExample example);

    int deleteByExample(AuditInspectorExample example);

    int deleteByPrimaryKey(Integer prodAuditInspectorId);

    int insert(AuditInspector record);

    int insertSelective(AuditInspector record);

    List<AuditInspector> selectByExample(AuditInspectorExample example);

    AuditInspector selectByPrimaryKey(Integer prodAuditInspectorId);

    int updateByExampleSelective(@Param("record") AuditInspector record, @Param("example") AuditInspectorExample example);

    int updateByExample(@Param("record") AuditInspector record, @Param("example") AuditInspectorExample example);

    int updateByPrimaryKeySelective(AuditInspector record);

    int updateByPrimaryKey(AuditInspector record);
}