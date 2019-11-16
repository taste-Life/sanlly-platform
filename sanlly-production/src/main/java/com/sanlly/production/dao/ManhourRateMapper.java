package com.sanlly.production.dao;

import com.sanlly.production.entity.ManhourRate;
import com.sanlly.production.entity.ManhourRateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ManhourRateMapper {
    long countByExample(ManhourRateExample example);

    int deleteByExample(ManhourRateExample example);

    int deleteByPrimaryKey(Integer prodManhourRateId);

    int insert(ManhourRate record);

    int insertSelective(ManhourRate record);

    List<ManhourRate> selectByExample(ManhourRateExample example);

    ManhourRate selectByPrimaryKey(Integer prodManhourRateId);

    int updateByExampleSelective(@Param("record") ManhourRate record, @Param("example") ManhourRateExample example);

    int updateByExample(@Param("record") ManhourRate record, @Param("example") ManhourRateExample example);

    int updateByPrimaryKeySelective(ManhourRate record);

    int updateByPrimaryKey(ManhourRate record);
}