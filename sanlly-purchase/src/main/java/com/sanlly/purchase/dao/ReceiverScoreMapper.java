package com.sanlly.purchase.dao;

import com.sanlly.purchase.entity.ReceiverScore;
import com.sanlly.purchase.entity.ReceiverScoreExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReceiverScoreMapper {
    long countByExample(ReceiverScoreExample example);

    int deleteByExample(ReceiverScoreExample example);

    int deleteByPrimaryKey(Integer purcReceiverScoreId);

    int insert(ReceiverScore record);

    int insertSelective(ReceiverScore record);

    List<ReceiverScore> selectByExample(ReceiverScoreExample example);

    ReceiverScore selectByPrimaryKey(Integer purcReceiverScoreId);

    int updateByExampleSelective(@Param("record") ReceiverScore record, @Param("example") ReceiverScoreExample example);

    int updateByExample(@Param("record") ReceiverScore record, @Param("example") ReceiverScoreExample example);

    int updateByPrimaryKeySelective(ReceiverScore record);

    int updateByPrimaryKey(ReceiverScore record);
}