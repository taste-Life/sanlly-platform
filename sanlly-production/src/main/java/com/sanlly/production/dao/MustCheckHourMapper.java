package com.sanlly.production.dao;

import com.sanlly.production.entity.MustCheckHour;
import com.sanlly.production.entity.MustCheckHourExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MustCheckHourMapper {
    long countByExample(MustCheckHourExample example);

    int deleteByExample(MustCheckHourExample example);

    int deleteByPrimaryKey(Integer prodMustCheckHourId);

    int insert(MustCheckHour record);

    int insertSelective(MustCheckHour record);

    List<MustCheckHour> selectByExample(MustCheckHourExample example);

    MustCheckHour selectByPrimaryKey(Integer prodMustCheckHourId);

    int updateByExampleSelective(@Param("record") MustCheckHour record, @Param("example") MustCheckHourExample example);

    int updateByExample(@Param("record") MustCheckHour record, @Param("example") MustCheckHourExample example);

    int updateByPrimaryKeySelective(MustCheckHour record);

    int updateByPrimaryKey(MustCheckHour record);
}