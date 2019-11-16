package com.sanlly.production.dao;

import com.sanlly.production.entity.PayingPartyChange;
import com.sanlly.production.entity.PayingPartyChangeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PayingPartyChangeMapper {
    long countByExample(PayingPartyChangeExample example);

    int deleteByExample(PayingPartyChangeExample example);

    int deleteByPrimaryKey(Integer prodPayingPartyChangeId);

    int insert(PayingPartyChange record);

    int insertSelective(PayingPartyChange record);

    List<PayingPartyChange> selectByExample(PayingPartyChangeExample example);

    PayingPartyChange selectByPrimaryKey(Integer prodPayingPartyChangeId);

    int updateByExampleSelective(@Param("record") PayingPartyChange record, @Param("example") PayingPartyChangeExample example);

    int updateByExample(@Param("record") PayingPartyChange record, @Param("example") PayingPartyChangeExample example);

    int updateByPrimaryKeySelective(PayingPartyChange record);

    int updateByPrimaryKey(PayingPartyChange record);
}