package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareShipSupplyreplaceDetail;
import com.sanlly.warehouse.entity.WareShipSupplyreplaceDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareShipSupplyreplaceDetailMapper {
    long countByExample(WareShipSupplyreplaceDetailExample example);

    int deleteByExample(WareShipSupplyreplaceDetailExample example);

    int deleteByPrimaryKey(Integer wareShipSupplyreplaceDetailId);

    int insert(WareShipSupplyreplaceDetail record);

    int insertSelective(WareShipSupplyreplaceDetail record);

    List<WareShipSupplyreplaceDetail> selectByExample(WareShipSupplyreplaceDetailExample example);

    WareShipSupplyreplaceDetail selectByPrimaryKey(Integer wareShipSupplyreplaceDetailId);

    int updateByExampleSelective(@Param("record") WareShipSupplyreplaceDetail record, @Param("example") WareShipSupplyreplaceDetailExample example);

    int updateByExample(@Param("record") WareShipSupplyreplaceDetail record, @Param("example") WareShipSupplyreplaceDetailExample example);

    int updateByPrimaryKeySelective(WareShipSupplyreplaceDetail record);

    int updateByPrimaryKey(WareShipSupplyreplaceDetail record);
}