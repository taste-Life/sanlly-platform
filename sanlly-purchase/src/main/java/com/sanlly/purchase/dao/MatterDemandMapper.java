package com.sanlly.purchase.dao;

import com.sanlly.purchase.entity.MatterDemand;
import com.sanlly.purchase.entity.MatterDemandExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MatterDemandMapper {
    long countByExample(MatterDemandExample example);

    int deleteByExample(MatterDemandExample example);

    int deleteByPrimaryKey(Integer purcMatterDemandId);

    int insert(MatterDemand record);

    int insertSelective(MatterDemand record);

    List<MatterDemand> selectByExample(MatterDemandExample example);

    MatterDemand selectByPrimaryKey(Integer purcMatterDemandId);

    int updateByExampleSelective(@Param("record") MatterDemand record, @Param("example") MatterDemandExample example);

    int updateByExample(@Param("record") MatterDemand record, @Param("example") MatterDemandExample example);

    int updateByPrimaryKeySelective(MatterDemand record);

    int updateByPrimaryKey(MatterDemand record);
}