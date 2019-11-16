package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareReturnSlip;
import com.sanlly.warehouse.entity.WareReturnSlipExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareReturnSlipMapper {
    long countByExample(WareReturnSlipExample example);

    int deleteByExample(WareReturnSlipExample example);

    int deleteByPrimaryKey(Integer wareReturnSlipId);

    int insert(WareReturnSlip record);

    int insertSelective(WareReturnSlip record);

    List<WareReturnSlip> selectByExample(WareReturnSlipExample example);

    WareReturnSlip selectByPrimaryKey(Integer wareReturnSlipId);

    int updateByExampleSelective(@Param("record") WareReturnSlip record, @Param("example") WareReturnSlipExample example);

    int updateByExample(@Param("record") WareReturnSlip record, @Param("example") WareReturnSlipExample example);

    int updateByPrimaryKeySelective(WareReturnSlip record);

    int updateByPrimaryKey(WareReturnSlip record);
}