package com.sanlly.finance.dao;

import com.sanlly.finance.entity.PoolCostTransport;
import com.sanlly.finance.entity.PoolCostTransportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PoolCostTransportMapper {
    long countByExample(PoolCostTransportExample example);

    int deleteByExample(PoolCostTransportExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PoolCostTransport record);

    int insertSelective(PoolCostTransport record);

    List<PoolCostTransport> selectByExample(PoolCostTransportExample example);

    PoolCostTransport selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PoolCostTransport record, @Param("example") PoolCostTransportExample example);

    int updateByExample(@Param("record") PoolCostTransport record, @Param("example") PoolCostTransportExample example);

    int updateByPrimaryKeySelective(PoolCostTransport record);

    int updateByPrimaryKey(PoolCostTransport record);
}