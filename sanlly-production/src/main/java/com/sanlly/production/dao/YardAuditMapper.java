package com.sanlly.production.dao;

import com.sanlly.production.entity.YardAudit;
import com.sanlly.production.entity.YardAuditExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YardAuditMapper {
    long countByExample(YardAuditExample example);

    int deleteByExample(YardAuditExample example);

    int deleteByPrimaryKey(Integer prodYardAuditId);

    int insert(YardAudit record);

    int insertSelective(YardAudit record);

    List<YardAudit> selectByExample(YardAuditExample example);

    YardAudit selectByPrimaryKey(Integer prodYardAuditId);

    int updateByExampleSelective(@Param("record") YardAudit record, @Param("example") YardAuditExample example);

    int updateByExample(@Param("record") YardAudit record, @Param("example") YardAuditExample example);

    int updateByPrimaryKeySelective(YardAudit record);

    int updateByPrimaryKey(YardAudit record);
}