package com.sanlly.production.dao;

import com.sanlly.production.entity.ZyRate;
import com.sanlly.production.entity.ZyRateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZyRateMapper {
    long countByExample(ZyRateExample example);

    int deleteByExample(ZyRateExample example);

    int deleteByPrimaryKey(String prodZyRateId);

    int insert(ZyRate record);

    int insertSelective(ZyRate record);

    List<ZyRate> selectByExample(ZyRateExample example);

    ZyRate selectByPrimaryKey(String prodZyRateId);

    int updateByExampleSelective(@Param("record") ZyRate record, @Param("example") ZyRateExample example);

    int updateByExample(@Param("record") ZyRate record, @Param("example") ZyRateExample example);

    int updateByPrimaryKeySelective(ZyRate record);

    int updateByPrimaryKey(ZyRate record);
}