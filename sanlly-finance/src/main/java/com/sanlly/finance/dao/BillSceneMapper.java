package com.sanlly.finance.dao;

import com.sanlly.finance.entity.BillScene;
import com.sanlly.finance.entity.BillSceneExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BillSceneMapper {
    long countByExample(BillSceneExample example);

    int deleteByExample(BillSceneExample example);

    int deleteByPrimaryKey(Integer billId);

    int insert(BillScene record);

    int insertSelective(BillScene record);

    List<BillScene> selectByExample(BillSceneExample example);

    BillScene selectByPrimaryKey(Integer billId);

    int updateByExampleSelective(@Param("record") BillScene record, @Param("example") BillSceneExample example);

    int updateByExample(@Param("record") BillScene record, @Param("example") BillSceneExample example);

    int updateByPrimaryKeySelective(BillScene record);

    int updateByPrimaryKey(BillScene record);
}