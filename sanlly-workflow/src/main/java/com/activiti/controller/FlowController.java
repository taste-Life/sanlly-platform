package com.activiti.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import javax.annotation.Resource;

import org.activiti.engine.IdentityService;
import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.history.HistoricTaskInstance;
import org.activiti.engine.identity.Group;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.activiti.domain.ApiResult;
import com.activiti.entity.LeaveOpinion;
import com.activiti.service.FlowServic;
import com.activiti.service.ProcessService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * 流程控制器
 * 
 * @author wangxzh
 *
 */
@RestController
@RequestMapping(value = "/flow")
public class FlowController {
	@Resource
	private FlowServic flowService;
	@Autowired
	private RepositoryService repositoryService;
	@Autowired
	private TaskService taskService;
	@Autowired
	private IdentityService identityService;
	@Autowired
	private RuntimeService runtimeService;

	private String complete = "completeInfo";
    @Resource
    private ProcessService processService;

	/**
	 * 流程发布
	 * 
	 * @param id
	 * @return
	 */
	@PostMapping(value = "open")
	@ResponseBody
	public Object open(String id) {
		return flowService.open(id);

	}

	/**
	 * 流程启动
	 * @param id 表单id
	 * @param userId 申请人id
	 * @param key 流程key
	 * @param infoJson 表单数据
	 */
	@PostMapping(value = "start")
//	public void start(@RequestBody String id, String userId, String key, String infoJson) {
	public void start(@RequestBody JSONObject object) {
		Map<String, Object> map = new HashMap<>();
		map.put("baseTask", object.get("infoJson"));
		// map.put("baseTask", infoJson);
		map.put("userId", object.get("userId"));
		// 得到ProcessEngine对象
		ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
		ProcessInstance instance = processEngine.getRuntimeService() // 运行时Service
				.startProcessInstanceByKey(object.get("key").toString(), map); // 流程定义表act_re_procdef的KEY字段值
		// 将流程id和表单id存入关联表
		JSONObject param=new JSONObject();
		param.put("procInstId", instance.getId());
		param.put("formId", object.get("id"));
		processService.insertProcInstForm(param);
	}

	/**
	 * 编辑后提交
	 * @param id 表单id
	 * @param infoJson 表单数据
	 */
	@PostMapping(value = "editstart")
	@ResponseBody
	public void editstart(String id, String infoJson) {
		Map<String, Object> map = new HashMap<>();
		map.put("baseTask", JSON.parseObject(infoJson));
		// 根据业务数据id查询关联表获取相对应的流程id
		JSONObject param=new JSONObject();
		param.put("formId", id);
		String instanceId = processService.selectProcInstIdByFormId(param);
		// 根据流程id，获取task
		ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
		Task task = processEngine.getTaskService().createTaskQuery().processInstanceId(instanceId).active()
				.singleResult();

		// 结束当前task
		taskService.complete(task.getId(), map);
	}

	/**
	 * 审批
	 * @param userId 审批人
	 * @param taskId 任务id
	 * @param isFlag 审批结果
	 * @return
	 */
	@PostMapping(value = "complete")
	@ResponseBody
	public Boolean complete(String userId, String taskId, Boolean isFlag) {
		Map<String, Object> variables = taskService.getVariables(taskId);

		LeaveOpinion op = new LeaveOpinion();
		op.setCreateTime(new Date());
		op.setOpId(userId);

		// User userInDb =
		// identityService.createUserQuery().userId(userId).singleResult();
		// op.setOpName(userInDb.getFirstName());
		op.setOpName("审批人名称");
		op.setTaskId(taskId);
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
		// 根据taskid查询流程id
		String pId = taskService.createTaskQuery().taskId(taskId).singleResult().getProcessInstanceId();

		taskService.setVariableLocal(taskId, "date", new Date());
		taskService.complete(taskId, map);

		// 流程是否结束
		return IsEnd(pId);
	}

	/**
	 * 我的任务
	 * @param userId 用户id
	 * @param key 流程key
	 * @return
	 */
	@PostMapping(value = "mylist")
	@ResponseBody
	public String showTaskList(String userId,String key) {
//		String key = "leaveProcess";// 流程key
		// 根绝流程查询待办
		List<Task> taskList = taskService.createTaskQuery().taskCandidateUser(userId).processDefinitionKey(key).list();// 参与者，组任务查询
		List<Task> assigneeList = taskService.createTaskQuery().taskAssignee(userId).processDefinitionKey(key).list();// 指定查询人
		List<Task> candidateGroup = new ArrayList<>();
		// 通过用户查询用户组
		List<Group> groupList = identityService.createGroupQuery().groupMember(userId).listPage(0, 100);
		if (groupList != null && groupList.size() > 0) {
			List<String> groupIdList = groupList.stream().map(Group::getId).collect(Collectors.toList());
			candidateGroup = taskService.createTaskQuery().taskCandidateGroupIn(groupIdList).processDefinitionKey(key)
					.list();// 用户组查询
		}
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
			JSONObject infoJson = (JSONObject) map.get("baseTask");

			taskEntity = new com.activiti.entity.Task(task1);
			try {
				taskEntity.setUserName(map.get("userId").toString());
			} catch (Exception e) {
				// TODO: handle exception
			}
			taskEntity.setInfoJson(infoJson.toString());
			// taskEntity.setUserName(model.getUserName());
			/** 如果是自己 */
			if (userId.equals(map.get("userId").toString())) {
				// if (true) {
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
	 * 审批记录
	 * @param formId
	 * @return
	 */
	@PostMapping(value = "approverecord")
	@ResponseBody
	public String approveRecord(String formId) {
		// 根据业务数据id查询关联表获取相对应的流程id
		JSONObject param=new JSONObject();
		param.put("formId", formId);
		String instanceId = processService.selectProcInstIdByFormId(param);
		// 得到ProcessEngine对象
		ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
		 List<HistoricTaskInstance> list = processEngine.getHistoryService()
	                .createHistoricTaskInstanceQuery()
	                .processInstanceId(instanceId)
	                .list();
        return JSONObject.toJSONString(list);
	}
	
	
	/**
	 * 判断流程结束状态
	 * @param processInstanceId 流程id
	 * @return 结束状态（true：结束   false：未结束）
	 */
	private Boolean IsEnd(String processInstanceId) {
		ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
		ProcessInstance rpi = processEngine.getRuntimeService()//
				.createProcessInstanceQuery()// 创建流程实例查询对象
				.processInstanceId(processInstanceId).singleResult();
		if (rpi == null) {
			return true;
		} else {
			return false;
		}
	}

}
