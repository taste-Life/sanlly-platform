package com.sanlly.finance.dao;

import com.sanlly.finance.entity.BillRepairDetail;
import com.sanlly.finance.entity.BillRepairDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BillRepairDetailMapper {
    long countByExample(BillRepairDetailExample example);

    int deleteByExample(BillRepairDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BillRepairDetail record);

    int insertSelective(BillRepairDetail record);

    List<BillRepairDetail> selectByExample(BillRepairDetailExample example);

    BillRepairDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BillRepairDetail record, @Param("example") BillRepairDetailExample example);

    int updateByExample(@Param("record") BillRepairDetail record, @Param("example") BillRepairDetailExample example);

    int updateByPrimaryKeySelective(BillRepairDetail record);

    int updateByPrimaryKey(BillRepairDetail record);
}