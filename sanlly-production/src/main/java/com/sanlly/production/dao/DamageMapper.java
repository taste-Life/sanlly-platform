package com.sanlly.production.dao;

import com.sanlly.production.entity.Damage;
import com.sanlly.production.entity.DamageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DamageMapper {
    long countByExample(DamageExample example);

    int deleteByExample(DamageExample example);

    int deleteByPrimaryKey(Integer prodDamageId);

    int insert(Damage record);

    int insertSelective(Damage record);

    List<Damage> selectByExample(DamageExample example);

    Damage selectByPrimaryKey(Integer prodDamageId);

    int updateByExampleSelective(@Param("record") Damage record, @Param("example") DamageExample example);

    int updateByExample(@Param("record") Damage record, @Param("example") DamageExample example);

    int updateByPrimaryKeySelective(Damage record);

    int updateByPrimaryKey(Damage record);
}