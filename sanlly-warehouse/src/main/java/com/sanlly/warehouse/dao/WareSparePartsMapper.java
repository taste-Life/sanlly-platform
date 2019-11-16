package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareSpareParts;
import com.sanlly.warehouse.entity.WareSparePartsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareSparePartsMapper {
    long countByExample(WareSparePartsExample example);

    int deleteByExample(WareSparePartsExample example);

    int deleteByPrimaryKey(Integer wareSparePartsId);

    int insert(WareSpareParts record);

    int insertSelective(WareSpareParts record);

    List<WareSpareParts> selectByExample(WareSparePartsExample example);

    WareSpareParts selectByPrimaryKey(Integer wareSparePartsId);

    int updateByExampleSelective(@Param("record") WareSpareParts record, @Param("example") WareSparePartsExample example);

    int updateByExample(@Param("record") WareSpareParts record, @Param("example") WareSparePartsExample example);

    int updateByPrimaryKeySelective(WareSpareParts record);

    int updateByPrimaryKey(WareSpareParts record);
}