package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareAssetLog;
import com.sanlly.warehouse.entity.WareAssetLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareAssetLogMapper {
    long countByExample(WareAssetLogExample example);

    int deleteByExample(WareAssetLogExample example);

    int deleteByPrimaryKey(Integer wareAssetLogId);

    int insert(WareAssetLog record);

    int insertSelective(WareAssetLog record);

    List<WareAssetLog> selectByExample(WareAssetLogExample example);

    WareAssetLog selectByPrimaryKey(Integer wareAssetLogId);

    int updateByExampleSelective(@Param("record") WareAssetLog record, @Param("example") WareAssetLogExample example);

    int updateByExample(@Param("record") WareAssetLog record, @Param("example") WareAssetLogExample example);

    int updateByPrimaryKeySelective(WareAssetLog record);

    int updateByPrimaryKey(WareAssetLog record);
}