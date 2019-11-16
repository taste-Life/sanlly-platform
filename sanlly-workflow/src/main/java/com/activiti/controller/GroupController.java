package com.activiti.controller;


import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.activiti.domain.ApiResult;
import com.activiti.service.GroupService;
import com.alibaba.fastjson.JSONObject;
import com.sanlly.common.models.input.activiti.ActGroupInput;
import com.sanlly.common.models.input.activiti.ActUserAndGroupInput;

/**
 * @version: v1.0
 * @Description: 用户组Controller
 * @author: wupzh
 * @date: 2019年6月20日
 */
@RestController
@RequestMapping(value="/group")
public class GroupController {
    @Resource
    private GroupService groupService;

    @PostMapping("/getById")
    public Object getById(@RequestBody JSONObject param) {
        return ApiResult.success().retData(groupService.getById(param)).build();
    }

    @PostMapping("/search")
    public Object search(@RequestBody JSONObject param) {
        return ApiResult.success().retData(groupService.search(param)).build();
    }

    @PostMapping("/add")
    public Object add(@RequestBody ActGroupInput param) {
        groupService.add(param);
        return ApiResult.success().build();
    }

    @PostMapping("/update")
    public Object update(@RequestBody ActGroupInput param) {
        groupService.update(param);
        return ApiResult.success().build();
    }

    @PostMapping("/delete")
    public Object delete(@RequestBody ActUserAndGroupInput param) {
        groupService.delete(param);
        return ApiResult.success().build();
    }
}
