package com.sanlly.finance.dao;

import com.sanlly.finance.entity.BillSceneDetail;
import com.sanlly.finance.entity.BillSceneDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BillSceneDetailMapper {
    long countByExample(BillSceneDetailExample example);

    int deleteByExample(BillSceneDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BillSceneDetail record);

    int insertSelective(BillSceneDetail record);

    List<BillSceneDetail> selectByExample(BillSceneDetailExample example);

    BillSceneDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BillSceneDetail record, @Param("example") BillSceneDetailExample example);

    int updateByExample(@Param("record") BillSceneDetail record, @Param("example") BillSceneDetailExample example);

    int updateByPrimaryKeySelective(BillSceneDetail record);

    int updateByPrimaryKey(BillSceneDetail record);
}