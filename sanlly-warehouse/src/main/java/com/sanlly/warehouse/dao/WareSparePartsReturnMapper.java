package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareSparePartsReturn;
import com.sanlly.warehouse.entity.WareSparePartsReturnExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareSparePartsReturnMapper {
    long countByExample(WareSparePartsReturnExample example);

    int deleteByExample(WareSparePartsReturnExample example);

    int deleteByPrimaryKey(Integer wareSparePartsReturnId);

    int insert(WareSparePartsReturn record);

    int insertSelective(WareSparePartsReturn record);

    List<WareSparePartsReturn> selectByExample(WareSparePartsReturnExample example);

    WareSparePartsReturn selectByPrimaryKey(Integer wareSparePartsReturnId);

    int updateByExampleSelective(@Param("record") WareSparePartsReturn record, @Param("example") WareSparePartsReturnExample example);

    int updateByExample(@Param("record") WareSparePartsReturn record, @Param("example") WareSparePartsReturnExample example);

    int updateByPrimaryKeySelective(WareSparePartsReturn record);

    int updateByPrimaryKey(WareSparePartsReturn record);
}