package com.activiti.dao;

import com.activiti.entity.ActMemberShipExample;
import com.activiti.entity.ActMemberShipKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActMemberShipMapper {
    long countByExample(ActMemberShipExample example);

    int deleteByExample(ActMemberShipExample example);

    int deleteByPrimaryKey(ActMemberShipKey key);

    int insert(ActMemberShipKey record);

    int insertSelective(ActMemberShipKey record);

    List<ActMemberShipKey> selectByExample(ActMemberShipExample example);

    int updateByExampleSelective(@Param("record") ActMemberShipKey record, @Param("example") ActMemberShipExample example);

    int updateByExample(@Param("record") ActMemberShipKey record, @Param("example") ActMemberShipExample example);
}