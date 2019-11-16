package com.sanlly.production.dao;

import com.sanlly.production.entity.SpareChangeRecord;
import com.sanlly.production.entity.SpareChangeRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpareChangeRecordMapper {
    long countByExample(SpareChangeRecordExample example);

    int deleteByExample(SpareChangeRecordExample example);

    int deleteByPrimaryKey(String prodCourseEntryId);

    int insert(SpareChangeRecord record);

    int insertSelective(SpareChangeRecord record);

    List<SpareChangeRecord> selectByExample(SpareChangeRecordExample example);

    SpareChangeRecord selectByPrimaryKey(String prodCourseEntryId);

    int updateByExampleSelective(@Param("record") SpareChangeRecord record, @Param("example") SpareChangeRecordExample example);

    int updateByExample(@Param("record") SpareChangeRecord record, @Param("example") SpareChangeRecordExample example);

    int updateByPrimaryKeySelective(SpareChangeRecord record);

    int updateByPrimaryKey(SpareChangeRecord record);
}