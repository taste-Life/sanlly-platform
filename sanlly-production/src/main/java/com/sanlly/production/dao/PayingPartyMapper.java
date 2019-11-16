package com.sanlly.production.dao;

import com.sanlly.production.entity.PayingParty;
import com.sanlly.production.entity.PayingPartyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PayingPartyMapper {
    long countByExample(PayingPartyExample example);

    int deleteByExample(PayingPartyExample example);

    int deleteByPrimaryKey(Integer prodPayingPartyId);

    int insert(PayingParty record);

    int insertSelective(PayingParty record);

    List<PayingParty> selectByExample(PayingPartyExample example);

    PayingParty selectByPrimaryKey(Integer prodPayingPartyId);

    int updateByExampleSelective(@Param("record") PayingParty record, @Param("example") PayingPartyExample example);

    int updateByExample(@Param("record") PayingParty record, @Param("example") PayingPartyExample example);

    int updateByPrimaryKeySelective(PayingParty record);

    int updateByPrimaryKey(PayingParty record);
}