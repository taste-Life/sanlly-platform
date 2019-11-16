package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareSpareTexture;
import com.sanlly.warehouse.entity.WareSpareTextureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareSpareTextureMapper {
    long countByExample(WareSpareTextureExample example);

    int deleteByExample(WareSpareTextureExample example);

    int deleteByPrimaryKey(Integer wareSpareTextureId);

    int insert(WareSpareTexture record);

    int insertSelective(WareSpareTexture record);

    List<WareSpareTexture> selectByExample(WareSpareTextureExample example);

    WareSpareTexture selectByPrimaryKey(Integer wareSpareTextureId);

    int updateByExampleSelective(@Param("record") WareSpareTexture record, @Param("example") WareSpareTextureExample example);

    int updateByExample(@Param("record") WareSpareTexture record, @Param("example") WareSpareTextureExample example);

    int updateByPrimaryKeySelective(WareSpareTexture record);

    int updateByPrimaryKey(WareSpareTexture record);
}