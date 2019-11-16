package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareEntrustedProcessing;
import com.sanlly.warehouse.entity.WareEntrustedProcessingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareEntrustedProcessingMapper {
    long countByExample(WareEntrustedProcessingExample example);

    int deleteByExample(WareEntrustedProcessingExample example);

    int deleteByPrimaryKey(Integer wareEntrustedProcessingId);

    int insert(WareEntrustedProcessing record);

    int insertSelective(WareEntrustedProcessing record);

    List<WareEntrustedProcessing> selectByExample(WareEntrustedProcessingExample example);

    WareEntrustedProcessing selectByPrimaryKey(Integer wareEntrustedProcessingId);

    int updateByExampleSelective(@Param("record") WareEntrustedProcessing record, @Param("example") WareEntrustedProcessingExample example);

    int updateByExample(@Param("record") WareEntrustedProcessing record, @Param("example") WareEntrustedProcessingExample example);

    int updateByPrimaryKeySelective(WareEntrustedProcessing record);

    int updateByPrimaryKey(WareEntrustedProcessing record);
}