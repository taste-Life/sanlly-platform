package com.sanlly.finance.dao;

import com.sanlly.finance.entity.PoolGonContainer;
import com.sanlly.finance.entity.PoolGonContainerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PoolGonContainerMapper {
    long countByExample(PoolGonContainerExample example);

    int deleteByExample(PoolGonContainerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PoolGonContainer record);

    int insertSelective(PoolGonContainer record);

    List<PoolGonContainer> selectByExample(PoolGonContainerExample example);

    PoolGonContainer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PoolGonContainer record, @Param("example") PoolGonContainerExample example);

    int updateByExample(@Param("record") PoolGonContainer record, @Param("example") PoolGonContainerExample example);

    int updateByPrimaryKeySelective(PoolGonContainer record);

    int updateByPrimaryKey(PoolGonContainer record);
}