package com.sanlly.finance.dao;

import com.sanlly.finance.entity.BaseAuditDept;
import com.sanlly.finance.entity.BaseAuditDeptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseAuditDeptMapper {
    long countByExample(BaseAuditDeptExample example);

    int deleteByExample(BaseAuditDeptExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BaseAuditDept record);

    int insertSelective(BaseAuditDept record);

    List<BaseAuditDept> selectByExample(BaseAuditDeptExample example);

    BaseAuditDept selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BaseAuditDept record, @Param("example") BaseAuditDeptExample example);

    int updateByExample(@Param("record") BaseAuditDept record, @Param("example") BaseAuditDeptExample example);

    int updateByPrimaryKeySelective(BaseAuditDept record);

    int updateByPrimaryKey(BaseAuditDept record);
}