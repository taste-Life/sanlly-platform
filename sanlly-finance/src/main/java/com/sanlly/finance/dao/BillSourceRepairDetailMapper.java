package com.sanlly.finance.dao;

import com.sanlly.finance.entity.BillSourceRepairDetail;
import com.sanlly.finance.entity.BillSourceRepairDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BillSourceRepairDetailMapper {
    long countByExample(BillSourceRepairDetailExample example);

    int deleteByExample(BillSourceRepairDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BillSourceRepairDetail record);

    int insertSelective(BillSourceRepairDetail record);

    List<BillSourceRepairDetail> selectByExample(BillSourceRepairDetailExample example);

    BillSourceRepairDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BillSourceRepairDetail record, @Param("example") BillSourceRepairDetailExample example);

    int updateByExample(@Param("record") BillSourceRepairDetail record, @Param("example") BillSourceRepairDetailExample example);

    int updateByPrimaryKeySelective(BillSourceRepairDetail record);

    int updateByPrimaryKey(BillSourceRepairDetail record);
}