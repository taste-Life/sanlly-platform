package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareMaintainPresentationDetail;
import com.sanlly.warehouse.entity.WareMaintainPresentationDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareMaintainPresentationDetailMapper {
    long countByExample(WareMaintainPresentationDetailExample example);

    int deleteByExample(WareMaintainPresentationDetailExample example);

    int deleteByPrimaryKey(Integer wareMaintainPresentationDetailId);

    int insert(WareMaintainPresentationDetail record);

    int insertSelective(WareMaintainPresentationDetail record);

    List<WareMaintainPresentationDetail> selectByExample(WareMaintainPresentationDetailExample example);

    WareMaintainPresentationDetail selectByPrimaryKey(Integer wareMaintainPresentationDetailId);

    int updateByExampleSelective(@Param("record") WareMaintainPresentationDetail record, @Param("example") WareMaintainPresentationDetailExample example);

    int updateByExample(@Param("record") WareMaintainPresentationDetail record, @Param("example") WareMaintainPresentationDetailExample example);

    int updateByPrimaryKeySelective(WareMaintainPresentationDetail record);

    int updateByPrimaryKey(WareMaintainPresentationDetail record);
}