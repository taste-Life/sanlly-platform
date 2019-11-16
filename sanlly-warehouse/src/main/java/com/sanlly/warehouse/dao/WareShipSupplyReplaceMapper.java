package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareShipSupplyReplace;
import com.sanlly.warehouse.entity.WareShipSupplyReplaceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareShipSupplyReplaceMapper {
    long countByExample(WareShipSupplyReplaceExample example);

    int deleteByExample(WareShipSupplyReplaceExample example);

    int deleteByPrimaryKey(Integer wareShipSupplyReplaceId);

    int insert(WareShipSupplyReplace record);

    int insertSelective(WareShipSupplyReplace record);

    List<WareShipSupplyReplace> selectByExample(WareShipSupplyReplaceExample example);

    WareShipSupplyReplace selectByPrimaryKey(Integer wareShipSupplyReplaceId);

    int updateByExampleSelective(@Param("record") WareShipSupplyReplace record, @Param("example") WareShipSupplyReplaceExample example);

    int updateByExample(@Param("record") WareShipSupplyReplace record, @Param("example") WareShipSupplyReplaceExample example);

    int updateByPrimaryKeySelective(WareShipSupplyReplace record);

    int updateByPrimaryKey(WareShipSupplyReplace record);
}