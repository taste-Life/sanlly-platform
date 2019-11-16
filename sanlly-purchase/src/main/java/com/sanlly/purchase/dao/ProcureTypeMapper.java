package com.sanlly.purchase.dao;

import com.sanlly.purchase.entity.ProcureType;
import com.sanlly.purchase.entity.ProcureTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProcureTypeMapper {
    long countByExample(ProcureTypeExample example);

    int deleteByExample(ProcureTypeExample example);

    int deleteByPrimaryKey(Integer purcProcureTypeId);

    int insert(ProcureType record);

    int insertSelective(ProcureType record);

    List<ProcureType> selectByExample(ProcureTypeExample example);

    ProcureType selectByPrimaryKey(Integer purcProcureTypeId);

    int updateByExampleSelective(@Param("record") ProcureType record, @Param("example") ProcureTypeExample example);

    int updateByExample(@Param("record") ProcureType record, @Param("example") ProcureTypeExample example);

    int updateByPrimaryKeySelective(ProcureType record);

    int updateByPrimaryKey(ProcureType record);
}