package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareMasterSpareParts;
import com.sanlly.warehouse.entity.WareMasterSparePartsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareMasterSparePartsMapper {
    long countByExample(WareMasterSparePartsExample example);

    int deleteByExample(WareMasterSparePartsExample example);

    int deleteByPrimaryKey(Integer wareMasterSparePartsId);

    int insert(WareMasterSpareParts record);

    int insertSelective(WareMasterSpareParts record);

    List<WareMasterSpareParts> selectByExample(WareMasterSparePartsExample example);

    WareMasterSpareParts selectByPrimaryKey(Integer wareMasterSparePartsId);

    int updateByExampleSelective(@Param("record") WareMasterSpareParts record, @Param("example") WareMasterSparePartsExample example);

    int updateByExample(@Param("record") WareMasterSpareParts record, @Param("example") WareMasterSparePartsExample example);

    int updateByPrimaryKeySelective(WareMasterSpareParts record);

    int updateByPrimaryKey(WareMasterSpareParts record);
}