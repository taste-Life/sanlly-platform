package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareDebitSlipDetail;
import com.sanlly.warehouse.entity.WareDebitSlipDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareDebitSlipDetailMapper {
    long countByExample(WareDebitSlipDetailExample example);

    int deleteByExample(WareDebitSlipDetailExample example);

    int deleteByPrimaryKey(Integer wareDebitSlipDetailId);

    int insert(WareDebitSlipDetail record);

    int insertSelective(WareDebitSlipDetail record);

    List<WareDebitSlipDetail> selectByExample(WareDebitSlipDetailExample example);

    WareDebitSlipDetail selectByPrimaryKey(Integer wareDebitSlipDetailId);

    int updateByExampleSelective(@Param("record") WareDebitSlipDetail record, @Param("example") WareDebitSlipDetailExample example);

    int updateByExample(@Param("record") WareDebitSlipDetail record, @Param("example") WareDebitSlipDetailExample example);

    int updateByPrimaryKeySelective(WareDebitSlipDetail record);

    int updateByPrimaryKey(WareDebitSlipDetail record);
}