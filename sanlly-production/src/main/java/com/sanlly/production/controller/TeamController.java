package com.sanlly.production.controller;

import com.sanlly.common.models.output.Result;
import com.sanlly.production.models.output.team.TeamOutput;
import com.sanlly.production.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zhq
 * @date 2019/11/8
 * @description
 */
@RestController
public class TeamController {

    @Autowired
    private TeamService teamService;

    /**
     * @author zhq
     * @date 2019/11/8
     * @description 根据场站查询所有的班组
     */
    @GetMapping("/getTeamListByYardKey")
    public Result<List<TeamOutput>> getTeamListByYardKey(String yardKey) {
        Assert.notNull(yardKey, "yardKey不能为空");
        return Result.Success(teamService.getTeamListByYardKey(yardKey));
    }
}
