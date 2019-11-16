package com.sanlly.purchase.service.feign;


import com.alibaba.fastjson.JSONObject;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.activiti.AuditTaskInfoOutput;
import com.sanlly.common.models.output.activiti.TaskOutPut;
import com.sanlly.purchase.models.input.feign.SearchModelInput;
import com.sanlly.purchase.service.fallback.WorkFlowFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@FeignClient(name = "workflow",fallback=WorkFlowFallback.class)
public interface WorkFlowFeignClient {
	
	/**
	 * 根据流程定义的key启动流程实例同时设置流程变量, 可用于传递表单数据
	 * @Description:   
	 * @param param
	 * @return
	 */
	@PostMapping("/process/startByKeyWithVars")
	String startByKeyWithVars(@RequestBody JSONObject param);	
	
	@PostMapping("/task/getMyAgencyTask")
	List<TaskOutPut> getMyAgencyTask(@RequestBody SearchModelInput input);

	@PostMapping("/task/historyActInstanceList")
	Result historyActInstanceList(@RequestBody  SearchModelInput input);
	@PostMapping("/task/queryTaskHistory")
	Result queryTaskHistory(@RequestBody  SearchModelInput input);

	@PostMapping("/task/queryTaskHistoryAll")
	Result queryTaskHistoryAll(@RequestBody  SearchModelInput input);

//	@PostMapping("/queryTaskHistory")
//	Result<PagedList<HistoricTaskInstance>> queryTaskHistory(@RequestBody SearchModelInput input);

	@PostMapping("/task/complete")
	Object complete(@RequestBody JSONObject param);
	
	@GetMapping("/process/isEndProcess/{processInstanceId}")
	Boolean isEndProcess(@PathVariable("processInstanceId")  String processInstanceId);
	
	@PostMapping("/task/rejectTask")
	Result rejectTask(@RequestParam(value = "taskId", required = true) String taskId,@RequestParam(value = "returnStart") boolean returnStart);
	
	@PostMapping("/task/findHistoryProcessVariables")
	List<AuditTaskInfoOutput> findHistoryProcessVariables(@RequestBody  SearchModelInput input);
	
	@DeleteMapping("/process/removeProcessByProcessId")
	Result removeProcessByProcessId(@RequestParam(value = "processInstanceId", required = true)  String processInstanceId);
	@PostMapping("/task/getByProcessInstanceId")
	List<Map<String, Object>> getByProcessInstanceId(@RequestBody JSONObject param);
}
