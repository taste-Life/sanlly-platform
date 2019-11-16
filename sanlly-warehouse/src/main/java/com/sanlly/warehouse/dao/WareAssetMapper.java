package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareAsset;
import com.sanlly.warehouse.entity.WareAssetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareAssetMapper {
    long countByExample(WareAssetExample example);

    int deleteByExample(WareAssetExample example);

    int deleteByPrimaryKey(Integer wareAssetId);

    int insert(WareAsset record);

    int insertSelective(WareAsset record);

    List<WareAsset> selectByExample(WareAssetExample example);

    WareAsset selectByPrimaryKey(Integer wareAssetId);

    int updateByExampleSelective(@Param("record") WareAsset record, @Param("example") WareAssetExample example);

    int updateByExample(@Param("record") WareAsset record, @Param("example") WareAssetExample example);

    int updateByPrimaryKeySelective(WareAsset record);

    int updateByPrimaryKey(WareAsset record);
}