package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.CompressorMaterial;
import com.sanlly.warehouse.entity.CompressorMaterialExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompressorMaterialMapper {
    long countByExample(CompressorMaterialExample example);

    int deleteByExample(CompressorMaterialExample example);

    int deleteByPrimaryKey(Integer wareCompressorMaterialId);

    int insert(CompressorMaterial record);

    int insertSelective(CompressorMaterial record);

    List<CompressorMaterial> selectByExample(CompressorMaterialExample example);

    CompressorMaterial selectByPrimaryKey(Integer wareCompressorMaterialId);

    int updateByExampleSelective(@Param("record") CompressorMaterial record, @Param("example") CompressorMaterialExample example);

    int updateByExample(@Param("record") CompressorMaterial record, @Param("example") CompressorMaterialExample example);

    int updateByPrimaryKeySelective(CompressorMaterial record);

    int updateByPrimaryKey(CompressorMaterial record);
}