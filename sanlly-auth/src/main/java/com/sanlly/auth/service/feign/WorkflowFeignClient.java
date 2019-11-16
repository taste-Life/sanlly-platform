package com.sanlly.auth.service.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.alibaba.fastjson.JSONObject;
import com.sanlly.auth.config.FeignClientConfig;
import com.sanlly.auth.service.fallback.WorkFlowFallback;
import com.sanlly.common.models.input.activiti.ActGroupInput;
import com.sanlly.common.models.input.activiti.ActUserAndGroupInput;
import com.sanlly.common.models.input.activiti.ActUserInput;

/**
 * 同步流程中的用户和组的  项目内部调用实现
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author fjy
* @date 2019年7月29日  
*
 */
@FeignClient(name = "workflow",configuration=FeignClientConfig.class,fallback=WorkFlowFallback.class)
public interface WorkflowFeignClient {

	/**
	 * 同步activiti用户用户信息   业务系统添加用户时，同步调用该方法
	 * @Description:   
	 * @param param
	 * @return
	 */
	@PostMapping("/user/add")
	Object userAddFromWF(@RequestBody ActUserInput param);
	
	/**
	 * 同步activiti用户用户信息   业务系统修改用户时，同步调用该方法
	 * @Description:   
	 * @param param
	 * @return
	 */
	@PostMapping("/user/update")
	Object userUpdateFromWF(@RequestBody ActUserInput param);
	
	/**
	 * 同步activiti用户用户信息   业务系统删除用户时，同步调用该方法  如果是禁用修改状态，需要业务判断，调用该方法
	 * @Description:   
	 * @param param
	 * @return
	 */
	@PostMapping("/user/delete")
	Object userDeleteFromWF(@RequestBody ActUserAndGroupInput param);

	//公司  用户 角色  部门 
	
	/**
	 * 同步activiti 组信息   业务系统添加角色时，同步调用该方法
	 * @Description:   
	 * @param param
	 * @return
	 */
	@PostMapping("/group/add")
	Object groupAddFromWF(@RequestBody ActGroupInput param);
	
	/**
	 * 同步activiti 组信息   业务系统修改角色时，同步调用该方法
	 * @Description:   
	 * @param param
	 * @return
	 */
	@PostMapping("/group/update")
	Object groupUpdateFromWF(@RequestBody ActGroupInput param);
	
	/**
	 * 同步activiti 组信息   业务系统删除角色时，同步调用该方法，如果是修改禁用状态，业务逻辑判断，调用该方法
	 * @Description:   
	 * @param param
	 * @return
	 */
	@PostMapping("/group/delete")
	Object groupDeleteFromWF(@RequestBody ActUserAndGroupInput param);
	
	
    /**
     * 给用户添加角色
     * @Description:   
     * @param param
     * @return
     */
    @PostMapping("/user/updateActivitiUserGroup")
    Object updateActivitiUserGroup(@RequestBody ActUserAndGroupInput param) ;
    
    /**
     * 删除用户
     * @Description:   
     * @param param
     * @return
     */
    @PostMapping("/user/deleteActivitiUser")
    Object deleteActivitiUser(@RequestBody ActUserAndGroupInput param);
	
	
	
}
