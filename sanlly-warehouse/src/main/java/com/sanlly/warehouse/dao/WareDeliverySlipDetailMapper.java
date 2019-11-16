package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareDeliverySlipDetail;
import com.sanlly.warehouse.entity.WareDeliverySlipDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareDeliverySlipDetailMapper {
    long countByExample(WareDeliverySlipDetailExample example);

    int deleteByExample(WareDeliverySlipDetailExample example);

    int deleteByPrimaryKey(Integer wareDeliverySlipDetailId);

    int insert(WareDeliverySlipDetail record);

    int insertSelective(WareDeliverySlipDetail record);

    List<WareDeliverySlipDetail> selectByExample(WareDeliverySlipDetailExample example);

    WareDeliverySlipDetail selectByPrimaryKey(Integer wareDeliverySlipDetailId);

    int updateByExampleSelective(@Param("record") WareDeliverySlipDetail record, @Param("example") WareDeliverySlipDetailExample example);

    int updateByExample(@Param("record") WareDeliverySlipDetail record, @Param("example") WareDeliverySlipDetailExample example);

    int updateByPrimaryKeySelective(WareDeliverySlipDetail record);

    int updateByPrimaryKey(WareDeliverySlipDetail record);
}