package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareStorePool;
import com.sanlly.warehouse.entity.WareStorePoolExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareStorePoolMapper {
    long countByExample(WareStorePoolExample example);

    int deleteByExample(WareStorePoolExample example);

    int deleteByPrimaryKey(Integer wareStorePoolId);

    int insert(WareStorePool record);

    int insertSelective(WareStorePool record);

    List<WareStorePool> selectByExample(WareStorePoolExample example);

    WareStorePool selectByPrimaryKey(Integer wareStorePoolId);

    int updateByExampleSelective(@Param("record") WareStorePool record, @Param("example") WareStorePoolExample example);

    int updateByExample(@Param("record") WareStorePool record, @Param("example") WareStorePoolExample example);

    int updateByPrimaryKeySelective(WareStorePool record);

    int updateByPrimaryKey(WareStorePool record);
}