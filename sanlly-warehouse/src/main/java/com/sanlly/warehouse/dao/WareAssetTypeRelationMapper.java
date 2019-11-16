package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareAssetTypeRelation;
import com.sanlly.warehouse.entity.WareAssetTypeRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareAssetTypeRelationMapper {
    long countByExample(WareAssetTypeRelationExample example);

    int deleteByExample(WareAssetTypeRelationExample example);

    int deleteByPrimaryKey(Integer wareAssetTypeId);

    int insert(WareAssetTypeRelation record);

    int insertSelective(WareAssetTypeRelation record);

    List<WareAssetTypeRelation> selectByExample(WareAssetTypeRelationExample example);

    WareAssetTypeRelation selectByPrimaryKey(Integer wareAssetTypeId);

    int updateByExampleSelective(@Param("record") WareAssetTypeRelation record, @Param("example") WareAssetTypeRelationExample example);

    int updateByExample(@Param("record") WareAssetTypeRelation record, @Param("example") WareAssetTypeRelationExample example);

    int updateByPrimaryKeySelective(WareAssetTypeRelation record);

    int updateByPrimaryKey(WareAssetTypeRelation record);
}