package com.sanlly.production.dao;

import com.sanlly.production.entity.UnitFailure;
import com.sanlly.production.entity.UnitFailureExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UnitFailureMapper {
    long countByExample(UnitFailureExample example);

    int deleteByExample(UnitFailureExample example);

    int deleteByPrimaryKey(Integer prodUnitFailureId);

    int insert(UnitFailure record);

    int insertSelective(UnitFailure record);

    List<UnitFailure> selectByExample(UnitFailureExample example);

    UnitFailure selectByPrimaryKey(Integer prodUnitFailureId);

    int updateByExampleSelective(@Param("record") UnitFailure record, @Param("example") UnitFailureExample example);

    int updateByExample(@Param("record") UnitFailure record, @Param("example") UnitFailureExample example);

    int updateByPrimaryKeySelective(UnitFailure record);

    int updateByPrimaryKey(UnitFailure record);
}