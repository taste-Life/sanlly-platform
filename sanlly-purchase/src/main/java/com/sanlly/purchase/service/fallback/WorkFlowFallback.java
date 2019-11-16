package com.sanlly.purchase.service.fallback;

import com.alibaba.fastjson.JSONObject;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.activiti.AuditTaskInfoOutput;
import com.sanlly.common.models.output.activiti.TaskOutPut;
import com.sanlly.purchase.models.input.feign.SearchModelInput;
import com.sanlly.purchase.service.feign.WorkFlowFeignClient;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * 熔断实现
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author fjy
 * @date 2019年7月26日
 *
 */
@Component
public class WorkFlowFallback implements WorkFlowFeignClient {

	@Override
	public String startByKeyWithVars(JSONObject param) {
		System.out.println("熔断回调");
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<TaskOutPut> getMyAgencyTask(SearchModelInput input) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result historyActInstanceList(SearchModelInput input) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result queryTaskHistory(SearchModelInput input) {
		return null;
	}

	@Override
	public Result queryTaskHistoryAll(SearchModelInput input) {
		return null;
	}

	@Override
	public Object complete(JSONObject param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean isEndProcess(String processInstanceId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result rejectTask(String taskId, boolean returnStart) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AuditTaskInfoOutput> findHistoryProcessVariables(SearchModelInput input) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Result removeProcessByProcessId(String processInstanceId) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Map<String, Object>> getByProcessInstanceId(JSONObject param) {
		// TODO Auto-generated method stub
		return null;
	}

 
 

}
