package com.sanlly.production.dao;

import com.sanlly.production.entity.CommonRepair;
import com.sanlly.production.entity.CommonRepairExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommonRepairMapper {
    long countByExample(CommonRepairExample example);

    int deleteByExample(CommonRepairExample example);

    int deleteByPrimaryKey(Integer prodCommonRepairId);

    int insert(CommonRepair record);

    int insertSelective(CommonRepair record);

    List<CommonRepair> selectByExample(CommonRepairExample example);

    CommonRepair selectByPrimaryKey(Integer prodCommonRepairId);

    int updateByExampleSelective(@Param("record") CommonRepair record, @Param("example") CommonRepairExample example);

    int updateByExample(@Param("record") CommonRepair record, @Param("example") CommonRepairExample example);

    int updateByPrimaryKeySelective(CommonRepair record);

    int updateByPrimaryKey(CommonRepair record);
}