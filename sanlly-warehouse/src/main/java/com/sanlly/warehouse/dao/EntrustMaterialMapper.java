package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.EntrustMaterial;
import com.sanlly.warehouse.entity.EntrustMaterialExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EntrustMaterialMapper {
    long countByExample(EntrustMaterialExample example);

    int deleteByExample(EntrustMaterialExample example);

    int deleteByPrimaryKey(Integer wareEntrustedProcessingMaterialId);

    int insert(EntrustMaterial record);

    int insertSelective(EntrustMaterial record);

    List<EntrustMaterial> selectByExample(EntrustMaterialExample example);

    EntrustMaterial selectByPrimaryKey(Integer wareEntrustedProcessingMaterialId);

    int updateByExampleSelective(@Param("record") EntrustMaterial record, @Param("example") EntrustMaterialExample example);

    int updateByExample(@Param("record") EntrustMaterial record, @Param("example") EntrustMaterialExample example);

    int updateByPrimaryKeySelective(EntrustMaterial record);

    int updateByPrimaryKey(EntrustMaterial record);
}