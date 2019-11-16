package com.sanlly.production.dao;

import com.sanlly.production.entity.ShortcutRecord;
import com.sanlly.production.entity.ShortcutRecordExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShortcutRecordMapper {
    long countByExample(ShortcutRecordExample example);

    int deleteByExample(ShortcutRecordExample example);

    int deleteByPrimaryKey(Integer prodShortcutRecordId);

    int insert(ShortcutRecord record);

    int insertSelective(ShortcutRecord record);

    List<ShortcutRecord> selectByExample(ShortcutRecordExample example);

    ShortcutRecord selectByPrimaryKey(Integer prodShortcutRecordId);

    int updateByExampleSelective(@Param("record") ShortcutRecord record, @Param("example") ShortcutRecordExample example);

    int updateByExample(@Param("record") ShortcutRecord record, @Param("example") ShortcutRecordExample example);

    int updateByPrimaryKeySelective(ShortcutRecord record);

    int updateByPrimaryKey(ShortcutRecord record);
}