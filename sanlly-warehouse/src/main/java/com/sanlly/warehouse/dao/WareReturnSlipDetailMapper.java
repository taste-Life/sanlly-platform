package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.WareReturnSlipDetail;
import com.sanlly.warehouse.entity.WareReturnSlipDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareReturnSlipDetailMapper {
    long countByExample(WareReturnSlipDetailExample example);

    int deleteByExample(WareReturnSlipDetailExample example);

    int deleteByPrimaryKey(Integer wareReturnSlipDetailId);

    int insert(WareReturnSlipDetail record);

    int insertSelective(WareReturnSlipDetail record);

    List<WareReturnSlipDetail> selectByExample(WareReturnSlipDetailExample example);

    WareReturnSlipDetail selectByPrimaryKey(Integer wareReturnSlipDetailId);

    int updateByExampleSelective(@Param("record") WareReturnSlipDetail record, @Param("example") WareReturnSlipDetailExample example);

    int updateByExample(@Param("record") WareReturnSlipDetail record, @Param("example") WareReturnSlipDetailExample example);

    int updateByPrimaryKeySelective(WareReturnSlipDetail record);

    int updateByPrimaryKey(WareReturnSlipDetail record);
}