package com.sanlly.production.dao;

import com.sanlly.production.entity.ReferralEntry;
import com.sanlly.production.entity.ReferralEntryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReferralEntryMapper {
    long countByExample(ReferralEntryExample example);

    int deleteByExample(ReferralEntryExample example);

    int deleteByPrimaryKey(String prodReferralEntryId);

    int insert(ReferralEntry record);

    int insertSelective(ReferralEntry record);

    List<ReferralEntry> selectByExampleWithBLOBs(ReferralEntryExample example);

    List<ReferralEntry> selectByExample(ReferralEntryExample example);

    ReferralEntry selectByPrimaryKey(String prodReferralEntryId);

    int updateByExampleSelective(@Param("record") ReferralEntry record, @Param("example") ReferralEntryExample example);

    int updateByExampleWithBLOBs(@Param("record") ReferralEntry record, @Param("example") ReferralEntryExample example);

    int updateByExample(@Param("record") ReferralEntry record, @Param("example") ReferralEntryExample example);

    int updateByPrimaryKeySelective(ReferralEntry record);

    int updateByPrimaryKeyWithBLOBs(ReferralEntry record);

    int updateByPrimaryKey(ReferralEntry record);
}