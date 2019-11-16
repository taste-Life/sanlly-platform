package com.sanlly.production.dao;

import com.sanlly.production.entity.ContainerUser;
import com.sanlly.production.entity.ContainerUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContainerUserMapper {
    long countByExample(ContainerUserExample example);

    int deleteByExample(ContainerUserExample example);

    int deleteByPrimaryKey(Integer prodContainerUserId);

    int insert(ContainerUser record);

    int insertSelective(ContainerUser record);

    List<ContainerUser> selectByExample(ContainerUserExample example);

    ContainerUser selectByPrimaryKey(Integer prodContainerUserId);

    int updateByExampleSelective(@Param("record") ContainerUser record, @Param("example") ContainerUserExample example);

    int updateByExample(@Param("record") ContainerUser record, @Param("example") ContainerUserExample example);

    int updateByPrimaryKeySelective(ContainerUser record);

    int updateByPrimaryKey(ContainerUser record);
}