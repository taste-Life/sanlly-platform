package com.activiti.service;

import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;
import com.sanlly.common.models.input.activiti.ActGroupInput;
import com.sanlly.common.models.input.activiti.ActUserAndGroupInput;

/**
 * @version: v1.0
 * @Description: 用户组Service接口
 * @author: wupzh
 * @date: 2019年6月20日
 */
public interface GroupService {
    /**
     * 根据主键获取单个用户组
     * @param param
     * @return
     */
    Map getById(JSONObject param);

    /**
     * 查询用户组列表
     * @param param
     * @return
     */
    List search(JSONObject param);

    /**
     * 添加一个用户组
     * @param param
     */
    void add(JSONObject param);
    
    /**
     * 添加一个用户组
     * @param param
     */
    void add(ActGroupInput param);

    
    /**
     * 修改用户组信息
     * @param param
     */
    void update(ActGroupInput param);

    /**
     * 删除用户组信息
     * @param param
     */
    void delete(ActUserAndGroupInput param);
}
