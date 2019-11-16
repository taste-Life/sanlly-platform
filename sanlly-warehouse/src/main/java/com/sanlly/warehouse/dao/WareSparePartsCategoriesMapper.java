package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareSparePartsCategories;
import com.sanlly.warehouse.entity.WareSparePartsCategoriesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareSparePartsCategoriesMapper {
    long countByExample(WareSparePartsCategoriesExample example);

    int deleteByExample(WareSparePartsCategoriesExample example);

    int deleteByPrimaryKey(Integer wareSparePartsCategoriesId);

    int insert(WareSparePartsCategories record);

    int insertSelective(WareSparePartsCategories record);

    List<WareSparePartsCategories> selectByExample(WareSparePartsCategoriesExample example);

    WareSparePartsCategories selectByPrimaryKey(Integer wareSparePartsCategoriesId);

    int updateByExampleSelective(@Param("record") WareSparePartsCategories record, @Param("example") WareSparePartsCategoriesExample example);

    int updateByExample(@Param("record") WareSparePartsCategories record, @Param("example") WareSparePartsCategoriesExample example);

    int updateByPrimaryKeySelective(WareSparePartsCategories record);

    int updateByPrimaryKey(WareSparePartsCategories record);
}