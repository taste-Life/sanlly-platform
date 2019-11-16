package com.sanlly.auth.dao;

import com.sanlly.auth.entity.RoleYard;
import com.sanlly.auth.entity.RoleYardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleYardMapper {
    long countByExample(RoleYardExample example);

    int deleteByExample(RoleYardExample example);

    int deleteByPrimaryKey(Integer roleYardId);

    int insert(RoleYard record);

    int insertSelective(RoleYard record);

    List<RoleYard> selectByExample(RoleYardExample example);

    RoleYard selectByPrimaryKey(Integer roleYardId);

    int updateByExampleSelective(@Param("record") RoleYard record, @Param("example") RoleYardExample example);

    int updateByExample(@Param("record") RoleYard record, @Param("example") RoleYardExample example);

    int updateByPrimaryKeySelective(RoleYard record);

    int updateByPrimaryKey(RoleYard record);
}