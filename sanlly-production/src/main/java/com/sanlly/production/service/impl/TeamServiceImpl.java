package com.sanlly.production.service.impl;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.production.dao.TeamMapper;
import com.sanlly.production.entity.TeamExample;
import com.sanlly.production.models.output.team.TeamOutput;
import com.sanlly.production.service.TeamService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author zhq
 * @date 2019/11/8
 * @description
 */
@Service
public class TeamServiceImpl extends BaseServiceImpl implements TeamService {
    @Autowired
    private TeamMapper teamMapper;

    /**
     * @param yardKey
     * @author zhq
     * @date 2019/11/8
     * @description 根据yardKey查询班组
     */
    @Override
    public List<TeamOutput> getTeamListByYardKey(String yardKey) {
        TeamExample teamExample = new TeamExample();
        teamExample.or().andYardEqualTo(yardKey).andIsDelEqualTo(PlatformConstants.ISDEL_NO);
        return teamMapper.selectByExample(teamExample).stream().map(team -> {
            TeamOutput teamOutput = new TeamOutput();
            BeanUtils.copyProperties(team, teamOutput);
            return teamOutput;
        }).collect(Collectors.toList());
    }
}
