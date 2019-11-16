package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareDeliverySlip;
import com.sanlly.warehouse.entity.WareDeliverySlipExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareDeliverySlipMapper {
    long countByExample(WareDeliverySlipExample example);

    int deleteByExample(WareDeliverySlipExample example);

    int deleteByPrimaryKey(Integer wareDeliverySlipId);

    int insert(WareDeliverySlip record);

    int insertSelective(WareDeliverySlip record);

    List<WareDeliverySlip> selectByExample(WareDeliverySlipExample example);

    WareDeliverySlip selectByPrimaryKey(Integer wareDeliverySlipId);

    int updateByExampleSelective(@Param("record") WareDeliverySlip record, @Param("example") WareDeliverySlipExample example);

    int updateByExample(@Param("record") WareDeliverySlip record, @Param("example") WareDeliverySlipExample example);

    int updateByPrimaryKeySelective(WareDeliverySlip record);

    int updateByPrimaryKey(WareDeliverySlip record);
}