package com.sanlly.production.dao;

import com.sanlly.production.entity.PickingList;
import com.sanlly.production.entity.PickingListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PickingListMapper {
    long countByExample(PickingListExample example);

    int deleteByExample(PickingListExample example);

    int deleteByPrimaryKey(Integer prodPickingListId);

    int insert(PickingList record);

    int insertSelective(PickingList record);

    List<PickingList> selectByExample(PickingListExample example);

    PickingList selectByPrimaryKey(Integer prodPickingListId);

    int updateByExampleSelective(@Param("record") PickingList record, @Param("example") PickingListExample example);

    int updateByExample(@Param("record") PickingList record, @Param("example") PickingListExample example);

    int updateByPrimaryKeySelective(PickingList record);

    int updateByPrimaryKey(PickingList record);
}