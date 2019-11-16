package com.sanlly.production.dao;

import com.sanlly.production.entity.XxContainerUser;
import com.sanlly.production.entity.XxContainerUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XxContainerUserMapper {
    long countByExample(XxContainerUserExample example);

    int deleteByExample(XxContainerUserExample example);

    int deleteByPrimaryKey(Integer prodXxContainerUserId);

    int insert(XxContainerUser record);

    int insertSelective(XxContainerUser record);

    List<XxContainerUser> selectByExample(XxContainerUserExample example);

    XxContainerUser selectByPrimaryKey(Integer prodXxContainerUserId);

    int updateByExampleSelective(@Param("record") XxContainerUser record, @Param("example") XxContainerUserExample example);

    int updateByExample(@Param("record") XxContainerUser record, @Param("example") XxContainerUserExample example);

    int updateByPrimaryKeySelective(XxContainerUser record);

    int updateByPrimaryKey(XxContainerUser record);
}