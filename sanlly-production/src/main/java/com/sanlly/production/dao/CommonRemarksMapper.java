package com.sanlly.production.dao;

import com.sanlly.production.entity.CommonRemarks;
import com.sanlly.production.entity.CommonRemarksExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommonRemarksMapper {
    long countByExample(CommonRemarksExample example);

    int deleteByExample(CommonRemarksExample example);

    int deleteByPrimaryKey(Integer prodCommonRemarksId);

    int insert(CommonRemarks record);

    int insertSelective(CommonRemarks record);

    List<CommonRemarks> selectByExample(CommonRemarksExample example);

    CommonRemarks selectByPrimaryKey(Integer prodCommonRemarksId);

    int updateByExampleSelective(@Param("record") CommonRemarks record, @Param("example") CommonRemarksExample example);

    int updateByExample(@Param("record") CommonRemarks record, @Param("example") CommonRemarksExample example);

    int updateByPrimaryKeySelective(CommonRemarks record);

    int updateByPrimaryKey(CommonRemarks record);
}