package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareSellProgrammeDetail;
import com.sanlly.warehouse.entity.WareSellProgrammeDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareSellProgrammeDetailMapper {
    long countByExample(WareSellProgrammeDetailExample example);

    int deleteByExample(WareSellProgrammeDetailExample example);

    int deleteByPrimaryKey(Integer wareSellProgrammeDetailId);

    int insert(WareSellProgrammeDetail record);

    int insertSelective(WareSellProgrammeDetail record);

    List<WareSellProgrammeDetail> selectByExample(WareSellProgrammeDetailExample example);

    WareSellProgrammeDetail selectByPrimaryKey(Integer wareSellProgrammeDetailId);

    int updateByExampleSelective(@Param("record") WareSellProgrammeDetail record, @Param("example") WareSellProgrammeDetailExample example);

    int updateByExample(@Param("record") WareSellProgrammeDetail record, @Param("example") WareSellProgrammeDetailExample example);

    int updateByPrimaryKeySelective(WareSellProgrammeDetail record);

    int updateByPrimaryKey(WareSellProgrammeDetail record);
}