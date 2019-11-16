package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.TransferDetail;
import com.sanlly.warehouse.entity.TransferDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TransferDetailMapper {
    long countByExample(TransferDetailExample example);

    int deleteByExample(TransferDetailExample example);

    int deleteByPrimaryKey(Integer wareTransferDetailId);

    int insert(TransferDetail record);

    int insertSelective(TransferDetail record);

    List<TransferDetail> selectByExample(TransferDetailExample example);

    TransferDetail selectByPrimaryKey(Integer wareTransferDetailId);

    int updateByExampleSelective(@Param("record") TransferDetail record, @Param("example") TransferDetailExample example);

    int updateByExample(@Param("record") TransferDetail record, @Param("example") TransferDetailExample example);

    int updateByPrimaryKeySelective(TransferDetail record);

    int updateByPrimaryKey(TransferDetail record);
}