package com.activiti.dao;

import com.activiti.entity.ProcinstFormExample;
import com.activiti.entity.ProcinstFormKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProcinstFormMapper {
    long countByExample(ProcinstFormExample example);

    int deleteByExample(ProcinstFormExample example);

    int deleteByPrimaryKey(ProcinstFormKey key);

    int insert(ProcinstFormKey record);

    int insertSelective(ProcinstFormKey record);

    List<ProcinstFormKey> selectByExample(ProcinstFormExample example);

    int updateByExampleSelective(@Param("record") ProcinstFormKey record, @Param("example") ProcinstFormExample example);

    int updateByExample(@Param("record") ProcinstFormKey record, @Param("example") ProcinstFormExample example);
}