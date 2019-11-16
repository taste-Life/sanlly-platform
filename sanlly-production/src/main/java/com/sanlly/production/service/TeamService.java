package com.sanlly.production.service;

import com.sanlly.production.models.output.team.TeamOutput;

import java.util.List;

/**
 * @author zhq
 * @date 2019/11/8
 * @description
 */
public interface TeamService {
    /**
     * @author zhq
     * @date 2019/11/8
     * @description 根据yardKey查询班组
     */
    List<TeamOutput> getTeamListByYardKey(String yardKey);
}
