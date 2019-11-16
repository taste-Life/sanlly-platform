package com.sanlly.purchase.dao;

import com.sanlly.purchase.entity.StorehouseType;
import com.sanlly.purchase.entity.StorehouseTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StorehouseTypeMapper {
    long countByExample(StorehouseTypeExample example);

    int deleteByExample(StorehouseTypeExample example);

    int deleteByPrimaryKey(Integer purcStorehouseTypeid);

    int insert(StorehouseType record);

    int insertSelective(StorehouseType record);

    List<StorehouseType> selectByExample(StorehouseTypeExample example);

    StorehouseType selectByPrimaryKey(Integer purcStorehouseTypeid);

    int updateByExampleSelective(@Param("record") StorehouseType record, @Param("example") StorehouseTypeExample example);

    int updateByExample(@Param("record") StorehouseType record, @Param("example") StorehouseTypeExample example);

    int updateByPrimaryKeySelective(StorehouseType record);

    int updateByPrimaryKey(StorehouseType record);
}