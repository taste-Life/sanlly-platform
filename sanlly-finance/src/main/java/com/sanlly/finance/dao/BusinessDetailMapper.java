package com.sanlly.finance.dao;

import com.sanlly.finance.entity.BusinessDetail;
import com.sanlly.finance.entity.BusinessDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BusinessDetailMapper {
    long countByExample(BusinessDetailExample example);

    int deleteByExample(BusinessDetailExample example);

    int deleteByPrimaryKey(Integer businessDetaillId);

    int insert(BusinessDetail record);

    int insertSelective(BusinessDetail record);

    List<BusinessDetail> selectByExample(BusinessDetailExample example);

    BusinessDetail selectByPrimaryKey(Integer businessDetaillId);

    int updateByExampleSelective(@Param("record") BusinessDetail record, @Param("example") BusinessDetailExample example);

    int updateByExample(@Param("record") BusinessDetail record, @Param("example") BusinessDetailExample example);

    int updateByPrimaryKeySelective(BusinessDetail record);

    int updateByPrimaryKey(BusinessDetail record);
}