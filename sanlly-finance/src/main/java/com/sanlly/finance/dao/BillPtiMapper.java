package com.sanlly.finance.dao;

import com.sanlly.finance.entity.BillPti;
import com.sanlly.finance.entity.BillPtiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BillPtiMapper {
    long countByExample(BillPtiExample example);

    int deleteByExample(BillPtiExample example);

    int deleteByPrimaryKey(Integer billId);

    int insert(BillPti record);

    int insertSelective(BillPti record);

    List<BillPti> selectByExample(BillPtiExample example);

    BillPti selectByPrimaryKey(Integer billId);

    int updateByExampleSelective(@Param("record") BillPti record, @Param("example") BillPtiExample example);

    int updateByExample(@Param("record") BillPti record, @Param("example") BillPtiExample example);

    int updateByPrimaryKeySelective(BillPti record);

    int updateByPrimaryKey(BillPti record);
}