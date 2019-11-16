package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.EntrustProduct;
import com.sanlly.warehouse.entity.EntrustProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EntrustProductMapper {
    long countByExample(EntrustProductExample example);

    int deleteByExample(EntrustProductExample example);

    int deleteByPrimaryKey(Integer wareEntrustedProcessingProducId);

    int insert(EntrustProduct record);

    int insertSelective(EntrustProduct record);

    List<EntrustProduct> selectByExample(EntrustProductExample example);

    EntrustProduct selectByPrimaryKey(Integer wareEntrustedProcessingProducId);

    int updateByExampleSelective(@Param("record") EntrustProduct record, @Param("example") EntrustProductExample example);

    int updateByExample(@Param("record") EntrustProduct record, @Param("example") EntrustProductExample example);

    int updateByPrimaryKeySelective(EntrustProduct record);

    int updateByPrimaryKey(EntrustProduct record);
}