package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareImages;
import com.sanlly.warehouse.entity.WareImagesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareImagesMapper {
    long countByExample(WareImagesExample example);

    int deleteByExample(WareImagesExample example);

    int deleteByPrimaryKey(Integer wareImagesId);

    int insert(WareImages record);

    int insertSelective(WareImages record);

    List<WareImages> selectByExample(WareImagesExample example);

    WareImages selectByPrimaryKey(Integer wareImagesId);

    int updateByExampleSelective(@Param("record") WareImages record, @Param("example") WareImagesExample example);

    int updateByExample(@Param("record") WareImages record, @Param("example") WareImagesExample example);

    int updateByPrimaryKeySelective(WareImages record);

    int updateByPrimaryKey(WareImages record);
}