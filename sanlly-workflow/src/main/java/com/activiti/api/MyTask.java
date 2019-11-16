package com.activiti.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.activiti.engine.HistoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.history.HistoricActivityInstance;
import org.activiti.engine.history.HistoricDetail;
import org.activiti.engine.history.HistoricVariableUpdate;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;
import org.springframework.beans.factory.annotation.Autowired;

import com.activiti.domain.ApiResult;
import com.activiti.entity.BaseTask;
import com.activiti.entity.LeaveOpinion;
import com.alibaba.fastjson.JSON;

public class MyTask {

	@Autowired
	private TaskService taskService;
	@Autowired
	private RuntimeService runtimeService;
	@Autowired
	private HistoryService historyService;
	
	private String complete = "complete";

	/**
	 * 我的任务
	 * 
	 * @param roleString
	 * @param userId
	 * @return
	 */
	public String showTaskList(List<String> roleString, String userId) {
		String key = "";// 流程key
		// 根绝流程查询待办
		List<Task> taskList = taskService.createTaskQuery().taskCandidateUser(userId).processDefinitionKey(key).list();// 参与者，组任务查询
		List<Task> assigneeList = taskService.createTaskQuery().taskAssignee(userId).processDefinitionKey(key).list();// 指定查询人
		List<Task> candidateGroup = taskService.createTaskQuery().taskCandidateGroupIn(roleString)
				.processDefinitionKey(key).list();// 用户组查询
		taskList.addAll(assigneeList);
		taskList.addAll(candidateGroup);
		List<com.activiti.entity.Task> tasks = new ArrayList<>();
		Map<String, Object> map = new HashMap<>();
		com.activiti.entity.Task taskEntity = null;

		Map<String, Map<String, Object>> mapMap = new HashMap<>();
		Map<String, Object> objectMap = null;
		Set<String> taskSet = new HashSet<String>();
		for (Task task1 : taskList) {
			objectMap = new HashMap<>();
			String taskId = task1.getId();
			if (taskSet.contains(taskId)) {
				continue;
			}

			map = taskService.getVariables(taskId);
			BaseTask userLeave = (BaseTask) map.get("baseTask");

			taskEntity = new com.activiti.entity.Task(task1);
			taskEntity.setUserName(userLeave.getUserName());
			taskEntity.setReason(userLeave.getReason());
			taskEntity.setUrlpath(userLeave.getUrlpath());
			/** 如果是自己 */
			if (userId.equals(userLeave.getUserId())) {
				if (map.get("flag") != null) {
					if (!(boolean) map.get("flag")) {
						objectMap.put("flag", true);
					} else {
						objectMap.put("flag", false);
					}
				} else {
					objectMap.put("flag", true);
				}
			} else {
				objectMap.put("flag", false);
			}
			mapMap.put(taskEntity.getId(), objectMap);
			tasks.add(taskEntity);
			taskSet.add(taskId);
		}

		return ApiResult.jsonStrng(taskList.size(), tasks, mapMap, "id");
	}

	/**
	 * 审批过程记录
	 * 
	 * @param processId
	 * @return
	 */
	public String completeDetail(String processId) {
		ProcessInstance instance = runtimeService.createProcessInstanceQuery().processInstanceId(processId)
				.singleResult();
		// 保证运行ing
		List<LeaveOpinion> leaveList = null;
		if (instance != null) {
			Task task = this.taskService.createTaskQuery().processInstanceId(processId).singleResult();
			Map<String, Object> variables = taskService.getVariables(task.getId());
			Object o = variables.get(complete);
			if (o != null) {
				/* 获取历史审核信息 */
				leaveList = (List<LeaveOpinion>) o;
			}
		} else {
			leaveList = new ArrayList<>();
			List<HistoricDetail> list = historyService.createHistoricDetailQuery().processInstanceId(processId).list();
			HistoricVariableUpdate variable = null;
			for (HistoricDetail historicDetail : list) {
				variable = (HistoricVariableUpdate) historicDetail;
				if (complete.equals(variable.getVariableName())) {
					leaveList.clear();
					leaveList.addAll((List<LeaveOpinion>) variable.getValue());
				}
			}
		}
		return JSON.toJSONString(leaveList);
	}

}
