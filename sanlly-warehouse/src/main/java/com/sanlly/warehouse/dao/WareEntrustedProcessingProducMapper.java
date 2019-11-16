package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareEntrustedProcessingProduc;
import com.sanlly.warehouse.entity.WareEntrustedProcessingProducExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareEntrustedProcessingProducMapper {
    long countByExample(WareEntrustedProcessingProducExample example);

    int deleteByExample(WareEntrustedProcessingProducExample example);

    int deleteByPrimaryKey(Integer wareEntrustedProcessingProducId);

    int insert(WareEntrustedProcessingProduc record);

    int insertSelective(WareEntrustedProcessingProduc record);

    List<WareEntrustedProcessingProduc> selectByExample(WareEntrustedProcessingProducExample example);

    WareEntrustedProcessingProduc selectByPrimaryKey(Integer wareEntrustedProcessingProducId);

    int updateByExampleSelective(@Param("record") WareEntrustedProcessingProduc record, @Param("example") WareEntrustedProcessingProducExample example);

    int updateByExample(@Param("record") WareEntrustedProcessingProduc record, @Param("example") WareEntrustedProcessingProducExample example);

    int updateByPrimaryKeySelective(WareEntrustedProcessingProduc record);

    int updateByPrimaryKey(WareEntrustedProcessingProduc record);
}