package com.sanlly.production.dao;

import com.sanlly.production.entity.YardPeroidSetting;
import com.sanlly.production.entity.YardPeroidSettingExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface YardPeroidSettingMapper {
    long countByExample(YardPeroidSettingExample example);

    int deleteByExample(YardPeroidSettingExample example);

    int deleteByPrimaryKey(Integer prodYardPeroidSettingId);

    int insert(YardPeroidSetting record);

    int insertSelective(YardPeroidSetting record);

    List<YardPeroidSetting> selectByExample(YardPeroidSettingExample example);

    YardPeroidSetting selectByPrimaryKey(Integer prodYardPeroidSettingId);

    int updateByExampleSelective(@Param("record") YardPeroidSetting record, @Param("example") YardPeroidSettingExample example);

    int updateByExample(@Param("record") YardPeroidSetting record, @Param("example") YardPeroidSettingExample example);

    int updateByPrimaryKeySelective(YardPeroidSetting record);

    int updateByPrimaryKey(YardPeroidSetting record);
}