package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareEntrustedProcessingMaterial;
import com.sanlly.warehouse.entity.WareEntrustedProcessingMaterialExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareEntrustedProcessingMaterialMapper {
    long countByExample(WareEntrustedProcessingMaterialExample example);

    int deleteByExample(WareEntrustedProcessingMaterialExample example);

    int deleteByPrimaryKey(Integer wareEntrustedProcessingMaterialId);

    int insert(WareEntrustedProcessingMaterial record);

    int insertSelective(WareEntrustedProcessingMaterial record);

    List<WareEntrustedProcessingMaterial> selectByExample(WareEntrustedProcessingMaterialExample example);

    WareEntrustedProcessingMaterial selectByPrimaryKey(Integer wareEntrustedProcessingMaterialId);

    int updateByExampleSelective(@Param("record") WareEntrustedProcessingMaterial record, @Param("example") WareEntrustedProcessingMaterialExample example);

    int updateByExample(@Param("record") WareEntrustedProcessingMaterial record, @Param("example") WareEntrustedProcessingMaterialExample example);

    int updateByPrimaryKeySelective(WareEntrustedProcessingMaterial record);

    int updateByPrimaryKey(WareEntrustedProcessingMaterial record);
}