package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareSurplusLossesDetail;
import com.sanlly.warehouse.entity.WareSurplusLossesDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareSurplusLossesDetailMapper {
    long countByExample(WareSurplusLossesDetailExample example);

    int deleteByExample(WareSurplusLossesDetailExample example);

    int deleteByPrimaryKey(Integer wareSurplusBillDetailId);

    int insert(WareSurplusLossesDetail record);

    int insertSelective(WareSurplusLossesDetail record);

    List<WareSurplusLossesDetail> selectByExample(WareSurplusLossesDetailExample example);

    WareSurplusLossesDetail selectByPrimaryKey(Integer wareSurplusBillDetailId);

    int updateByExampleSelective(@Param("record") WareSurplusLossesDetail record, @Param("example") WareSurplusLossesDetailExample example);

    int updateByExample(@Param("record") WareSurplusLossesDetail record, @Param("example") WareSurplusLossesDetailExample example);

    int updateByPrimaryKeySelective(WareSurplusLossesDetail record);

    int updateByPrimaryKey(WareSurplusLossesDetail record);
}