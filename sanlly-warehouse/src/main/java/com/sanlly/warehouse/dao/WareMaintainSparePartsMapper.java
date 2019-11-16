package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareMaintainSpareParts;
import com.sanlly.warehouse.entity.WareMaintainSparePartsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareMaintainSparePartsMapper {
    long countByExample(WareMaintainSparePartsExample example);

    int deleteByExample(WareMaintainSparePartsExample example);

    int deleteByPrimaryKey(Integer wareMaintainSparePartsId);

    int insert(WareMaintainSpareParts record);

    int insertSelective(WareMaintainSpareParts record);

    List<WareMaintainSpareParts> selectByExample(WareMaintainSparePartsExample example);

    WareMaintainSpareParts selectByPrimaryKey(Integer wareMaintainSparePartsId);

    int updateByExampleSelective(@Param("record") WareMaintainSpareParts record, @Param("example") WareMaintainSparePartsExample example);

    int updateByExample(@Param("record") WareMaintainSpareParts record, @Param("example") WareMaintainSparePartsExample example);

    int updateByPrimaryKeySelective(WareMaintainSpareParts record);

    int updateByPrimaryKey(WareMaintainSpareParts record);
}