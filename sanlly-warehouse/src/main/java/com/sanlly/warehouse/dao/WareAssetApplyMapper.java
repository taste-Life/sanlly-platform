package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareAssetApply;
import com.sanlly.warehouse.entity.WareAssetApplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareAssetApplyMapper {
    long countByExample(WareAssetApplyExample example);

    int deleteByExample(WareAssetApplyExample example);

    int deleteByPrimaryKey(Integer wareAssetApplyId);

    int insert(WareAssetApply record);

    int insertSelective(WareAssetApply record);

    List<WareAssetApply> selectByExample(WareAssetApplyExample example);

    WareAssetApply selectByPrimaryKey(Integer wareAssetApplyId);

    int updateByExampleSelective(@Param("record") WareAssetApply record, @Param("example") WareAssetApplyExample example);

    int updateByExample(@Param("record") WareAssetApply record, @Param("example") WareAssetApplyExample example);

    int updateByPrimaryKeySelective(WareAssetApply record);

    int updateByPrimaryKey(WareAssetApply record);
}