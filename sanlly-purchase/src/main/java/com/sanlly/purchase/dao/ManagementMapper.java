package com.sanlly.purchase.dao;

import com.sanlly.purchase.entity.Management;
import com.sanlly.purchase.entity.ManagementExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ManagementMapper {
    long countByExample(ManagementExample example);

    int deleteByExample(ManagementExample example);

    int deleteByPrimaryKey(Integer purcManagementId);

    int insert(Management record);

    int insertSelective(Management record);

    List<Management> selectByExample(ManagementExample example);

    Management selectByPrimaryKey(Integer purcManagementId);

    int updateByExampleSelective(@Param("record") Management record, @Param("example") ManagementExample example);

    int updateByExample(@Param("record") Management record, @Param("example") ManagementExample example);

    int updateByPrimaryKeySelective(Management record);

    int updateByPrimaryKey(Management record);
}