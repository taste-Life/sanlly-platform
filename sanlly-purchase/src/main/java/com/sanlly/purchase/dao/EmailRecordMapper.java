package com.sanlly.purchase.dao;

import com.sanlly.purchase.entity.EmailRecord;
import com.sanlly.purchase.entity.EmailRecordExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmailRecordMapper {
    long countByExample(EmailRecordExample example);

    int deleteByExample(EmailRecordExample example);

    int deleteByPrimaryKey(Integer purcEmailRecordId);

    int insert(EmailRecord record);

    int insertSelective(EmailRecord record);

    List<EmailRecord> selectByExample(EmailRecordExample example);

    EmailRecord selectByPrimaryKey(Integer purcEmailRecordId);

    int updateByExampleSelective(@Param("record") EmailRecord record, @Param("example") EmailRecordExample example);

    int updateByExample(@Param("record") EmailRecord record, @Param("example") EmailRecordExample example);

    int updateByPrimaryKeySelective(EmailRecord record);

    int updateByPrimaryKey(EmailRecord record);
}