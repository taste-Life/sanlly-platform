package com.sanlly.auth.service.fallback;

import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSONObject;
import com.sanlly.auth.service.feign.WorkflowFeignClient;
import com.sanlly.common.models.input.activiti.ActGroupInput;
import com.sanlly.common.models.input.activiti.ActUserAndGroupInput;
import com.sanlly.common.models.input.activiti.ActUserInput;

/**
 * 熔断实现
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author fjy
 * @date 2019年7月26日
 *
 */
@Component
public class WorkFlowFallback implements WorkflowFeignClient {

	@Override
	public Object userAddFromWF(ActUserInput param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object userUpdateFromWF(ActUserInput param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object userDeleteFromWF(ActUserAndGroupInput param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object groupAddFromWF(ActGroupInput param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object groupUpdateFromWF(ActGroupInput param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object groupDeleteFromWF(ActUserAndGroupInput param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object updateActivitiUserGroup(ActUserAndGroupInput param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object deleteActivitiUser(ActUserAndGroupInput param) {
		// TODO Auto-generated method stub
		return null;
	}
 

}
