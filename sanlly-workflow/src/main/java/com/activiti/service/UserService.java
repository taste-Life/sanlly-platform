package com.activiti.service;

import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;
import com.sanlly.common.models.input.activiti.ActUserAndGroupInput;
import com.sanlly.common.models.input.activiti.ActUserInput;

/**
 * @version: v1.0
 * @Description: 用户Service接口
 * @author: wupzh
 * @date: 2019年6月20日
 */
public interface UserService {
    /**
     * 根据主键获取单个用户
     * @param param
     * @return
     */
    Map getById(JSONObject param);

    /**
     * 查询用户列表
     * @param param
     * @return
     */
    List search(JSONObject param);

    /**
     * 添加一个用户
     * @param param
     */
    void add(JSONObject param);
    
    /**
     * 添加一个用户
     * @param param
     */
    void add(ActUserInput param);

    /**
     * 修改用户信息
     * @param param
     */
    void update(JSONObject param);
    
    /**
     * 修改用户信息
     * @param param
     */
    void update(ActUserInput param);

    /**
     * 删除用户信息
     * @param param
     */
    void delete(JSONObject param);
    
    /**
     * 删除用户信息
     * @param param
     */
    void delete(ActUserAndGroupInput param);
    
	/**
	 * 添加Activiti Identify的用户于组关系
	 * @param roleIds	角色ID集合
	 * @param userId	用户ID
	 */
    void addMembershipToIdentify(ActUserAndGroupInput param);
    
	/**
	 * 更新添加Activiti Identify的用户于组关系
	 * @param roleIds	角色ID集合
	 * @param userId	用户ID
	 */
    void updateMembershipToIdentify(ActUserAndGroupInput param);
    
	/**
	 * 删除Activiti Identify的用户于组关系
	 * @param roleIds	角色ID集合
	 * @param userId	用户ID
	 */
    void deleteMembershipToIdentify(ActUserAndGroupInput param);
    
}
