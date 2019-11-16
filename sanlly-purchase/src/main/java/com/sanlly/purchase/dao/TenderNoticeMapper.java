package com.sanlly.purchase.dao;

import com.sanlly.purchase.entity.TenderNotice;
import com.sanlly.purchase.entity.TenderNoticeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TenderNoticeMapper {
    long countByExample(TenderNoticeExample example);

    int deleteByExample(TenderNoticeExample example);

    int deleteByPrimaryKey(Integer purcTenderNoticeId);

    int insert(TenderNotice record);

    int insertSelective(TenderNotice record);

    List<TenderNotice> selectByExample(TenderNoticeExample example);

    TenderNotice selectByPrimaryKey(Integer purcTenderNoticeId);

    int updateByExampleSelective(@Param("record") TenderNotice record, @Param("example") TenderNoticeExample example);

    int updateByExample(@Param("record") TenderNotice record, @Param("example") TenderNoticeExample example);

    int updateByPrimaryKeySelective(TenderNotice record);

    int updateByPrimaryKey(TenderNotice record);
}