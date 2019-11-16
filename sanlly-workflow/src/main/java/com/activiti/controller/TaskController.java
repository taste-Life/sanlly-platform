package com.activiti.controller;

import com.activiti.domain.ApiResult;
import com.activiti.models.input.SearchModelInput;
import com.activiti.service.TaskService;
import com.alibaba.fastjson.JSONObject;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.activiti.AuditTaskInfoOutput;
import com.sanlly.common.models.output.activiti.TaskOutPut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @version: v1.0
 * @Description: 任务Controller
 * @author: wupzh
 * @date: 2019年6月20日
 */
@RestController
@RequestMapping(value = "/task")
public class TaskController {
	@Autowired
	private TaskService taskService;

	@PostMapping("/getByUserId")
	public Object getByUserId(@RequestBody JSONObject param) {
		return ApiResult.success().retData(taskService.getByUserId(param)).build();
	}

	@PostMapping("/getByProcessInstanceId")
	public List<Map<String, Object>> getByProcessInstanceId(@RequestBody JSONObject param) {
		return taskService.getByProcessInstanceId(param);
	}

	@PostMapping("/complete")
	public Object complete(@RequestBody JSONObject param) {
		taskService.complete(param);
		return ApiResult.success().build();
	}

	@PostMapping("/setTaskVars")
	public Object setTaskVars(@RequestBody JSONObject param) {
		taskService.setTaskVars(param);
		return ApiResult.success().build();
	}

	@PostMapping("/getTaskVars")
	public Object getTaskVars(@RequestBody JSONObject param) {
		return ApiResult.success().retData(taskService.getTaskVars(param)).build();
	}

	@PostMapping("/setAssignee")
	public Object setAssignee(@RequestBody JSONObject param) {
		taskService.setAssignee(param);
		return ApiResult.success().build();
	}

	@PostMapping("/setCandidateUsers")
	public Object setCandidateUsers(@RequestBody JSONObject param) {
		taskService.setCandidateUsers(param);
		return ApiResult.success().build();
	}

	/**
	 * 我的代办任务
	 * 
	 * @Description:
	 * @param input
	 * @return
	 */
	@PostMapping("/getMyAgencyTask")
	public List<TaskOutPut> getMyAgencyTask(@RequestBody SearchModelInput input) {
		return taskService.getMyAgencyTask(input);
	}

	/**
	 * 驳回任务
	 * 
	 * @Description:
	 * @param input
	 * @return
	 */
	@PostMapping("/rejectTask")
	public Result rejectTask(@RequestParam(value = "taskId", required = true) String taskId,@RequestParam(value = "returnStart") boolean returnStart) {
		taskService.rejectTask(taskId, returnStart);
		return Result.Success();
	}
	
	
	/**
	 * 历史活动查询   参数2选1
	 * 	//用户账号       loginAccount;
	 *  //流程启动id processInstanceId;
	 */
	@PostMapping("/historyActInstanceList")
	public Result historyActInstanceList(@RequestBody  SearchModelInput input){
		return Result.Success(taskService.historyActInstanceList(input));
	}
	
	/**
	 * 历史任务查询
	 */
	@PostMapping("/queryTaskHistory")
	public Result queryTaskHistory(@RequestBody SearchModelInput input) {
		return Result.Success(taskService.queryTaskHistory(input));
	}
	/**
	 * 历史任务查询
	 */
	@PostMapping("/queryTaskHistoryAll")
	public Result queryTaskHistoryAll(@RequestBody SearchModelInput input) {
		return Result.Success(taskService.queryTaskHistoryALL(input));
	}
	
	/**
	 * 历史活动查询 查询流程变量 用于显示记录
	 *  //流程启动id processInstanceId;
	 */
	@PostMapping("/findHistoryProcessVariables")
	public List<AuditTaskInfoOutput> findHistoryProcessVariables(@RequestBody  SearchModelInput input){
		return taskService.findHistoryProcessVariables(input);
	}
	
	
	

}
