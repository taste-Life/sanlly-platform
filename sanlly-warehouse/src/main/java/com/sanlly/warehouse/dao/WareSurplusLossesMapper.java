package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareSurplusLosses;
import com.sanlly.warehouse.entity.WareSurplusLossesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareSurplusLossesMapper {
    long countByExample(WareSurplusLossesExample example);

    int deleteByExample(WareSurplusLossesExample example);

    int deleteByPrimaryKey(Integer wareSurplusLossesId);

    int insert(WareSurplusLosses record);

    int insertSelective(WareSurplusLosses record);

    List<WareSurplusLosses> selectByExample(WareSurplusLossesExample example);

    WareSurplusLosses selectByPrimaryKey(Integer wareSurplusLossesId);

    int updateByExampleSelective(@Param("record") WareSurplusLosses record, @Param("example") WareSurplusLossesExample example);

    int updateByExample(@Param("record") WareSurplusLosses record, @Param("example") WareSurplusLossesExample example);

    int updateByPrimaryKeySelective(WareSurplusLosses record);

    int updateByPrimaryKey(WareSurplusLosses record);
}