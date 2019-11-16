package com.sanlly.purchase.dao;

import com.sanlly.purchase.entity.MatterTenderProduct;
import com.sanlly.purchase.entity.MatterTenderProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MatterTenderProductMapper {
    long countByExample(MatterTenderProductExample example);

    int deleteByExample(MatterTenderProductExample example);

    int deleteByPrimaryKey(Integer purcMatterTenderProductId);

    int insert(MatterTenderProduct record);

    int insertSelective(MatterTenderProduct record);

    List<MatterTenderProduct> selectByExample(MatterTenderProductExample example);

    MatterTenderProduct selectByPrimaryKey(Integer purcMatterTenderProductId);

    int updateByExampleSelective(@Param("record") MatterTenderProduct record, @Param("example") MatterTenderProductExample example);

    int updateByExample(@Param("record") MatterTenderProduct record, @Param("example") MatterTenderProductExample example);

    int updateByPrimaryKeySelective(MatterTenderProduct record);

    int updateByPrimaryKey(MatterTenderProduct record);
}