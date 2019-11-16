package com.sanlly.production.dao;

import com.sanlly.production.entity.InspectionDemand;
import com.sanlly.production.entity.InspectionDemandExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InspectionDemandMapper {
    long countByExample(InspectionDemandExample example);

    int deleteByExample(InspectionDemandExample example);

    int deleteByPrimaryKey(Integer prodInspectionDemandId);

    int insert(InspectionDemand record);

    int insertSelective(InspectionDemand record);

    List<InspectionDemand> selectByExampleWithBLOBs(InspectionDemandExample example);

    List<InspectionDemand> selectByExample(InspectionDemandExample example);

    InspectionDemand selectByPrimaryKey(Integer prodInspectionDemandId);

    int updateByExampleSelective(@Param("record") InspectionDemand record, @Param("example") InspectionDemandExample example);

    int updateByExampleWithBLOBs(@Param("record") InspectionDemand record, @Param("example") InspectionDemandExample example);

    int updateByExample(@Param("record") InspectionDemand record, @Param("example") InspectionDemandExample example);

    int updateByPrimaryKeySelective(InspectionDemand record);

    int updateByPrimaryKeyWithBLOBs(InspectionDemand record);

    int updateByPrimaryKey(InspectionDemand record);
}