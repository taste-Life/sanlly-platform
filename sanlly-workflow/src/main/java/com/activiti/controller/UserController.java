package com.activiti.controller;


import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.activiti.domain.ApiResult;
import com.activiti.service.UserService;
import com.alibaba.fastjson.JSONObject;
import com.sanlly.common.models.input.activiti.ActUserAndGroupInput;
import com.sanlly.common.models.input.activiti.ActUserInput;

/**
 * @version: v1.0
 * @Description: 用户Controller
 * @author: wupzh
 * @date: 2019年6月20日
 */
@RestController
@RequestMapping(value="/user")
public class UserController {
    @Resource
    private UserService userService;
    
    @PostMapping("/getById")
    public Object getById(@RequestBody JSONObject param) {
        return ApiResult.success().retData(userService.getById(param)).build();
    }

    @PostMapping("/search")
    public Object search(@RequestBody JSONObject param) {
        return ApiResult.success().retData(userService.search(param)).build();
    }

    /**

     * @Description:   
     * @param param
     * uid
     * firstName
     * lastName
     * email
     * password
     * @return
     */
    @PostMapping("/add")
    public Object add(@RequestBody ActUserInput param) {
        //添加用户
    	userService.add(param);
        return ApiResult.success().build();
    }

    /**
     * 修改用户信息
     * @Description:   
     * @param param
     * @return
     */
    @PostMapping("/update")
    public Object update(@RequestBody ActUserInput param) {
        userService.update(param);
        return ApiResult.success().build();
    }
/**
 * 删除用户信息
 * @Description:   
 * @param param
 * @return
 */
    @PostMapping("/delete")
    public Object delete(@RequestBody JSONObject param) {
        userService.delete(param);
        return ApiResult.success().build();
    }
    /**
     * 添加用户和组的关系
     * @Description:   
     * @param param
     * @return
     */
    @PostMapping("/addMembershipToIdentify")
    public Object addMembershipToIdentify(@RequestBody ActUserAndGroupInput param) {
        userService.addMembershipToIdentify(param);
        return ApiResult.success().build();
    }
    /**
     * 修改用户和组的关系
     * @Description:   
     * @param param
     * @return
     */
    @PostMapping("/updateMembershipToIdentify")
    public Object updateMembershipToIdentify(@RequestBody ActUserAndGroupInput param) {
        userService.updateMembershipToIdentify(param);
        return ApiResult.success().build();
    }
    /**
     * 删除用户和组的关系
     * @Description:   
     * @param param
     * @return
     */
    @PostMapping("/deleteMembershipToIdentify")
    public Object deleteMembershipToIdentify(@RequestBody ActUserAndGroupInput param) {
        userService.deleteMembershipToIdentify(param);
        return ApiResult.success().build();
    }
    
    
    //整理几个业务
    /**
     * 给用户添加角色
     * @Description:   
     * @param param
     * @return
     */
    @PostMapping("/updateActivitiUserGroup")
    public Object updateActivitiUserGroup(@RequestBody ActUserAndGroupInput param) {
    	//删除用户已有的用户和组的关系
        userService.deleteMembershipToIdentify(param);
        //添加新的用户和组的关系
        userService.addMembershipToIdentify(param);
        return ApiResult.success().build();
    }
    /**
     * 删除用户
     * @Description:   
     * @param param
     * @return
     */
    @PostMapping("/deleteActivitiUser")
    public Object deleteActivitiUser(@RequestBody ActUserAndGroupInput param) {
    	//删除用户和组的关系
        userService.deleteMembershipToIdentify(param);
        //删除用户
        userService.delete(param);
        return ApiResult.success().build();
    }
    
    
}
