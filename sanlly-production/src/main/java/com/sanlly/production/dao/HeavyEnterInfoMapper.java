package com.sanlly.production.dao;

import com.sanlly.production.entity.HeavyEnterInfo;
import com.sanlly.production.entity.HeavyEnterInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HeavyEnterInfoMapper {
    long countByExample(HeavyEnterInfoExample example);

    int deleteByExample(HeavyEnterInfoExample example);

    int deleteByPrimaryKey(Integer prodHeavyEnterId);

    int insert(HeavyEnterInfo record);

    int insertSelective(HeavyEnterInfo record);

    List<HeavyEnterInfo> selectByExample(HeavyEnterInfoExample example);

    HeavyEnterInfo selectByPrimaryKey(Integer prodHeavyEnterId);

    int updateByExampleSelective(@Param("record") HeavyEnterInfo record, @Param("example") HeavyEnterInfoExample example);

    int updateByExample(@Param("record") HeavyEnterInfo record, @Param("example") HeavyEnterInfoExample example);

    int updateByPrimaryKeySelective(HeavyEnterInfo record);

    int updateByPrimaryKey(HeavyEnterInfo record);
}