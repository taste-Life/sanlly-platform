package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareAssetType;
import com.sanlly.warehouse.entity.WareAssetTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareAssetTypeMapper {
    long countByExample(WareAssetTypeExample example);

    int deleteByExample(WareAssetTypeExample example);

    int deleteByPrimaryKey(Integer wareAssetTypeId);

    int insert(WareAssetType record);

    int insertSelective(WareAssetType record);

    List<WareAssetType> selectByExample(WareAssetTypeExample example);

    WareAssetType selectByPrimaryKey(Integer wareAssetTypeId);

    int updateByExampleSelective(@Param("record") WareAssetType record, @Param("example") WareAssetTypeExample example);

    int updateByExample(@Param("record") WareAssetType record, @Param("example") WareAssetTypeExample example);

    int updateByPrimaryKeySelective(WareAssetType record);

    int updateByPrimaryKey(WareAssetType record);
}