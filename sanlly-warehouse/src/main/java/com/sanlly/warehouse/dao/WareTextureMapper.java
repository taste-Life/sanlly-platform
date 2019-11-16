package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareTexture;
import com.sanlly.warehouse.entity.WareTextureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareTextureMapper {
    long countByExample(WareTextureExample example);

    int deleteByExample(WareTextureExample example);

    int deleteByPrimaryKey(Integer wareTextureId);

    int insert(WareTexture record);

    int insertSelective(WareTexture record);

    List<WareTexture> selectByExample(WareTextureExample example);

    WareTexture selectByPrimaryKey(Integer wareTextureId);

    int updateByExampleSelective(@Param("record") WareTexture record, @Param("example") WareTextureExample example);

    int updateByExample(@Param("record") WareTexture record, @Param("example") WareTextureExample example);

    int updateByPrimaryKeySelective(WareTexture record);

    int updateByPrimaryKey(WareTexture record);
}