package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareLaborReceiveDetail;
import com.sanlly.warehouse.entity.WareLaborReceiveDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareLaborReceiveDetailMapper {
    long countByExample(WareLaborReceiveDetailExample example);

    int deleteByExample(WareLaborReceiveDetailExample example);

    int deleteByPrimaryKey(Integer wareLaborReceiveDetailId);

    int insert(WareLaborReceiveDetail record);

    int insertSelective(WareLaborReceiveDetail record);

    List<WareLaborReceiveDetail> selectByExample(WareLaborReceiveDetailExample example);

    WareLaborReceiveDetail selectByPrimaryKey(Integer wareLaborReceiveDetailId);

    int updateByExampleSelective(@Param("record") WareLaborReceiveDetail record, @Param("example") WareLaborReceiveDetailExample example);

    int updateByExample(@Param("record") WareLaborReceiveDetail record, @Param("example") WareLaborReceiveDetailExample example);

    int updateByPrimaryKeySelective(WareLaborReceiveDetail record);

    int updateByPrimaryKey(WareLaborReceiveDetail record);
}