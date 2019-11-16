package com.sanlly.production.dao;

import com.sanlly.production.entity.HeavyTempRecord;
import com.sanlly.production.entity.HeavyTempRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HeavyTempRecordMapper {
    long countByExample(HeavyTempRecordExample example);

    int deleteByExample(HeavyTempRecordExample example);

    int deleteByPrimaryKey(Integer prodHeavyTempRecordId);

    int insert(HeavyTempRecord record);

    int insertSelective(HeavyTempRecord record);

    List<HeavyTempRecord> selectByExample(HeavyTempRecordExample example);

    HeavyTempRecord selectByPrimaryKey(Integer prodHeavyTempRecordId);

    int updateByExampleSelective(@Param("record") HeavyTempRecord record, @Param("example") HeavyTempRecordExample example);

    int updateByExample(@Param("record") HeavyTempRecord record, @Param("example") HeavyTempRecordExample example);

    int updateByPrimaryKeySelective(HeavyTempRecord record);

    int updateByPrimaryKey(HeavyTempRecord record);
}