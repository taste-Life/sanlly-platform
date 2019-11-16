package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareToolApplyDetail;
import com.sanlly.warehouse.entity.WareToolApplyDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareToolApplyDetailMapper {
    long countByExample(WareToolApplyDetailExample example);

    int deleteByExample(WareToolApplyDetailExample example);

    int deleteByPrimaryKey(Integer wareToolApplyDetailId);

    int insert(WareToolApplyDetail record);

    int insertSelective(WareToolApplyDetail record);

    List<WareToolApplyDetail> selectByExample(WareToolApplyDetailExample example);

    WareToolApplyDetail selectByPrimaryKey(Integer wareToolApplyDetailId);

    int updateByExampleSelective(@Param("record") WareToolApplyDetail record, @Param("example") WareToolApplyDetailExample example);

    int updateByExample(@Param("record") WareToolApplyDetail record, @Param("example") WareToolApplyDetailExample example);

    int updateByPrimaryKeySelective(WareToolApplyDetail record);

    int updateByPrimaryKey(WareToolApplyDetail record);
}