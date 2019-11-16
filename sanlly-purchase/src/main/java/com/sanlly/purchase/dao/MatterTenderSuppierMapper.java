package com.sanlly.purchase.dao;

import com.sanlly.purchase.entity.MatterTenderSuppier;
import com.sanlly.purchase.entity.MatterTenderSuppierExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MatterTenderSuppierMapper {
    long countByExample(MatterTenderSuppierExample example);

    int deleteByExample(MatterTenderSuppierExample example);

    int deleteByPrimaryKey(Integer purcMatterTenderSuppierId);

    int insert(MatterTenderSuppier record);

    int insertSelective(MatterTenderSuppier record);

    List<MatterTenderSuppier> selectByExample(MatterTenderSuppierExample example);

    MatterTenderSuppier selectByPrimaryKey(Integer purcMatterTenderSuppierId);

    int updateByExampleSelective(@Param("record") MatterTenderSuppier record, @Param("example") MatterTenderSuppierExample example);

    int updateByExample(@Param("record") MatterTenderSuppier record, @Param("example") MatterTenderSuppierExample example);

    int updateByPrimaryKeySelective(MatterTenderSuppier record);

    int updateByPrimaryKey(MatterTenderSuppier record);
}