package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.ReturnStore;
import com.sanlly.warehouse.entity.ReturnStoreExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReturnStoreMapper {
    long countByExample(ReturnStoreExample example);

    int deleteByExample(ReturnStoreExample example);

    int deleteByPrimaryKey(Integer wareReturnStoreId);

    int insert(ReturnStore record);

    int insertSelective(ReturnStore record);

    List<ReturnStore> selectByExample(ReturnStoreExample example);

    ReturnStore selectByPrimaryKey(Integer wareReturnStoreId);

    int updateByExampleSelective(@Param("record") ReturnStore record, @Param("example") ReturnStoreExample example);

    int updateByExample(@Param("record") ReturnStore record, @Param("example") ReturnStoreExample example);

    int updateByPrimaryKeySelective(ReturnStore record);

    int updateByPrimaryKey(ReturnStore record);
}