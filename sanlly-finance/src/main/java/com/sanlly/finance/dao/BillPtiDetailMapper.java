package com.sanlly.finance.dao;

import com.sanlly.finance.entity.BillPtiDetail;
import com.sanlly.finance.entity.BillPtiDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BillPtiDetailMapper {
    long countByExample(BillPtiDetailExample example);

    int deleteByExample(BillPtiDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BillPtiDetail record);

    int insertSelective(BillPtiDetail record);

    List<BillPtiDetail> selectByExample(BillPtiDetailExample example);

    BillPtiDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BillPtiDetail record, @Param("example") BillPtiDetailExample example);

    int updateByExample(@Param("record") BillPtiDetail record, @Param("example") BillPtiDetailExample example);

    int updateByPrimaryKeySelective(BillPtiDetail record);

    int updateByPrimaryKey(BillPtiDetail record);
}