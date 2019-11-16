package com.sanlly.warehouse.dao;

import com.sanlly.warehouse.entity.EntrustProcess;
import com.sanlly.warehouse.entity.EntrustProcessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EntrustProcessMapper {
    long countByExample(EntrustProcessExample example);

    int deleteByExample(EntrustProcessExample example);

    int deleteByPrimaryKey(Integer wareEntrustedProcessingId);

    int insert(EntrustProcess record);

    int insertSelective(EntrustProcess record);

    List<EntrustProcess> selectByExample(EntrustProcessExample example);

    EntrustProcess selectByPrimaryKey(Integer wareEntrustedProcessingId);

    int updateByExampleSelective(@Param("record") EntrustProcess record, @Param("example") EntrustProcessExample example);

    int updateByExample(@Param("record") EntrustProcess record, @Param("example") EntrustProcessExample example);

    int updateByPrimaryKeySelective(EntrustProcess record);

    int updateByPrimaryKey(EntrustProcess record);
}