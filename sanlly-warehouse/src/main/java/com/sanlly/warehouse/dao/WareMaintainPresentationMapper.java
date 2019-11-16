package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareMaintainPresentation;
import com.sanlly.warehouse.entity.WareMaintainPresentationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareMaintainPresentationMapper {
    long countByExample(WareMaintainPresentationExample example);

    int deleteByExample(WareMaintainPresentationExample example);

    int deleteByPrimaryKey(Integer wareMaintainPresentationId);

    int insert(WareMaintainPresentation record);

    int insertSelective(WareMaintainPresentation record);

    List<WareMaintainPresentation> selectByExample(WareMaintainPresentationExample example);

    WareMaintainPresentation selectByPrimaryKey(Integer wareMaintainPresentationId);

    int updateByExampleSelective(@Param("record") WareMaintainPresentation record, @Param("example") WareMaintainPresentationExample example);

    int updateByExample(@Param("record") WareMaintainPresentation record, @Param("example") WareMaintainPresentationExample example);

    int updateByPrimaryKeySelective(WareMaintainPresentation record);

    int updateByPrimaryKey(WareMaintainPresentation record);
}