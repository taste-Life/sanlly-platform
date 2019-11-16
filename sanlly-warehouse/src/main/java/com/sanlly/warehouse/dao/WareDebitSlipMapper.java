package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareDebitSlip;
import com.sanlly.warehouse.entity.WareDebitSlipExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareDebitSlipMapper {
    long countByExample(WareDebitSlipExample example);

    int deleteByExample(WareDebitSlipExample example);

    int deleteByPrimaryKey(Integer wareDebitSlipId);

    int insert(WareDebitSlip record);

    int insertSelective(WareDebitSlip record);

    List<WareDebitSlip> selectByExample(WareDebitSlipExample example);

    WareDebitSlip selectByPrimaryKey(Integer wareDebitSlipId);

    int updateByExampleSelective(@Param("record") WareDebitSlip record, @Param("example") WareDebitSlipExample example);

    int updateByExample(@Param("record") WareDebitSlip record, @Param("example") WareDebitSlipExample example);

    int updateByPrimaryKeySelective(WareDebitSlip record);

    int updateByPrimaryKey(WareDebitSlip record);
}