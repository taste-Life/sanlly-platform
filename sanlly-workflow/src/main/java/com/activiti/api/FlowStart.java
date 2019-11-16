package com.activiti.api;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.activiti.bpmn.model.Activity;
import org.activiti.bpmn.model.FlowElement;
import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.TaskService;
import org.activiti.engine.repository.Model;
import org.activiti.engine.repository.ProcessDefinitionQuery;
import org.activiti.engine.runtime.ProcessInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.activiti.entity.LeaveOpinion;

public class FlowStart {
	@Autowired
	private RepositoryService repositoryService;
	@Autowired
	private TaskService taskService;

	private String complete = "complete";

	/**
	 * 流程开始
	 * @param info 提交信息
	 * @param modelId 流程id
	 */
	public void start(Object info, String modelId) {
		Model modelData = repositoryService.getModel(modelId);
		// 查询act_re_procdef表
		String key = "";
		ProcessDefinitionQuery query = repositoryService.createProcessDefinitionQuery();
		query.deploymentId(modelData.getDeploymentId());
		if (query.count() > 0) {
			key = query.list().get(0).getKey();
		}

		Map<String, Object> map = new HashMap<>();
		map.put("baseTask", info);

		// 得到ProcessEngine对象
		ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
		ProcessInstance instance = processEngine.getRuntimeService() // 运行时Service
				.startProcessInstanceByKey(key, map); // 流程定义表act_re_procdef的KEY字段值
	}

	/**
	 * 流程审批
	 * @param userId userid
	 * @param taskId taskid
	 * @param isFlag 审批结果
	 */
	public void complete(String userId, String taskId, Boolean isFlag) {
		Map<String, Object> variables = taskService.getVariables(taskId);

		LeaveOpinion op = new LeaveOpinion();
		op.setCreateTime(new Date());
		op.setOpId(userId);
		// op.setOpName(user.getRealName());
		Map<String, Object> map = new HashMap<>();
		map.put("flag", isFlag);

		// 判断节点是否已经拒绝过一次了
		Object needend = variables.get("needend");
		if (needend != null && (boolean) needend && (!isFlag)) {
			map.put("needfinish", -1); // 结束
		} else {
			if (isFlag) {
				map.put("needfinish", 1);// 通过下一个节点
			} else {
				map.put("needfinish", 0);// 不通过
				// map.put("needfinish", -1);
			}
		}
		// 审批信息叠加
		List<LeaveOpinion> leaveList = new ArrayList<>();
		Object o = variables.get(complete);
		if (o != null) {
			leaveList = (List<LeaveOpinion>) o;
		}
		leaveList.add(op);
		map.put(complete, leaveList);
		taskService.complete(taskId, map);
	}
}
