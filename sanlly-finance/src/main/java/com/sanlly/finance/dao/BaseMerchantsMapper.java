package com.sanlly.finance.dao;

import com.sanlly.finance.entity.BaseMerchants;
import com.sanlly.finance.entity.BaseMerchantsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseMerchantsMapper {
    long countByExample(BaseMerchantsExample example);

    int deleteByExample(BaseMerchantsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BaseMerchants record);

    int insertSelective(BaseMerchants record);

    List<BaseMerchants> selectByExample(BaseMerchantsExample example);

    BaseMerchants selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BaseMerchants record, @Param("example") BaseMerchantsExample example);

    int updateByExample(@Param("record") BaseMerchants record, @Param("example") BaseMerchantsExample example);

    int updateByPrimaryKeySelective(BaseMerchants record);

    int updateByPrimaryKey(BaseMerchants record);
}