package com.sanlly.production.dao;

import com.sanlly.production.entity.TeamEntry;
import com.sanlly.production.entity.TeamEntryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeamEntryMapper {
    long countByExample(TeamEntryExample example);

    int deleteByExample(TeamEntryExample example);

    int deleteByPrimaryKey(Integer prodTeamEntryId);

    int insert(TeamEntry record);

    int insertSelective(TeamEntry record);

    List<TeamEntry> selectByExample(TeamEntryExample example);

    TeamEntry selectByPrimaryKey(Integer prodTeamEntryId);

    int updateByExampleSelective(@Param("record") TeamEntry record, @Param("example") TeamEntryExample example);

    int updateByExample(@Param("record") TeamEntry record, @Param("example") TeamEntryExample example);

    int updateByPrimaryKeySelective(TeamEntry record);

    int updateByPrimaryKey(TeamEntry record);
}