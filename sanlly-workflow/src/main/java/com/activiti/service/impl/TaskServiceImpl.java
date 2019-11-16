package com.activiti.service.impl;

import com.activiti.listener.DeleteTaskCmd;
import com.activiti.listener.SetFLowNodeAndGoCmd;
import com.activiti.models.input.SearchModelInput;
import com.alibaba.fastjson.JSONObject;
import com.sanlly.common.models.output.activiti.AuditTaskInfoOutput;
import com.sanlly.common.models.output.activiti.TaskOutPut;
import com.sanlly.common.models.output.pagination.PagedList;
import org.activiti.bpmn.model.BpmnModel;
import org.activiti.bpmn.model.FlowNode;
import org.activiti.engine.*;
import org.activiti.engine.history.*;
import org.activiti.engine.task.Task;
import org.activiti.engine.task.TaskQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @version: v1.0
 * @Description: 任务Service实现类
 * @author: wupzh
 * @date: 2019年6月20日
 */
@Service
public class TaskServiceImpl implements com.activiti.service.TaskService {
	@Resource
	private TaskService taskService;
	@Resource
	private RepositoryService repositoryService;
	@Resource
	private HistoryService historyService;

	@Autowired
	ManagementService managementService;

	@Override
	public List getByUserId(JSONObject param) {
		List<Map<String, Object>> list = new ArrayList<>();
		List<Task> tasks = taskService.createTaskQuery().taskCandidateOrAssigned(param.getString("userId")).list();
		if (tasks != null && tasks.size() > 0) {
			for (Task task : tasks) {
				Map<String, Object> map = new HashMap<>();
				// TODO 其他任务相关字段根据需要添加
				map.put("id", task.getId());
				map.put("name", task.getName());
				list.add(map);
			}
		}
		return list;
	}

	@Override
	public void complete(JSONObject param) {
		taskService.complete(param.getString("taskId"), param.getJSONObject("vars"));
	}

	@Override
	public void setAssignee(JSONObject param) {
		taskService.setAssignee(param.getString("taskId"), param.getString("userId"));
	}

	@Override
	public void setCandidateUsers(JSONObject param) {
		String userIds = param.getString("userIds");
		for (String userId : userIds.split(",")) {
			taskService.addCandidateUser(param.getString("taskId"), userId);
		}
	}

	@Override
	public void setTaskVars(JSONObject param) {
		taskService.setVariables(param.getString("taskId"), param.getJSONObject("vars"));
	}

	@Override
	public Map getTaskVars(JSONObject param) {
		return taskService.getVariables(param.getString("taskId"));
	}

	@Override
	public List<Map<String, Object>> getByProcessInstanceId(JSONObject param) {
		List<Map<String, Object>> list = new ArrayList<>();
		List<Task> tasks = taskService.createTaskQuery().processInstanceId(param.getString("processInstanceId")).list();
		if (tasks != null && tasks.size() > 0) {
			for (Task task : tasks) {
				Map<String, Object> map = new HashMap<>();
				map.put("taskId", task.getId());
				map.put("taskName", task.getName());
				map.put("assignee", task.getAssignee());
				list.add(map);
			}
		}
		return list;
	}

	/**
	 * 历史任务查询
	 */
	@Override
	public PagedList<HistoricTaskInstance> queryTaskHistory(SearchModelInput input) {
		HistoricTaskInstanceQuery query = historyService.createHistoricTaskInstanceQuery()
				.taskCandidateUser(input.getLoginAccount());
//				.taskAssignee(input.getLoginAccount());

		Integer totalItemCount = (int) query.count();
		PagedList<HistoricTaskInstance> pagedList = new PagedList<HistoricTaskInstance>(input.getPageIndex(),
				input.getPageSize(), totalItemCount);

		List<HistoricTaskInstance> list = query.orderByHistoricTaskInstanceStartTime().asc()
				.listPage((input.getPageIndex() - 1) * input.getPageSize(), input.getPageSize());
		pagedList.getDataList().addAll(list);
		return pagedList;
//		List<HistoricTaskInstanceVo> list1 = null;
//		if (list != null && list.size() > 0) {
//			list1 = new ArrayList<>();
//			for (HistoricTaskInstance hti : list) {
//				log.debug(hti.getId() + "    " + hti.getName() + "    " + hti.getProcessInstanceId() + "   "
//						+ hti.getStartTime() + "   " + hti.getEndTime() + "   " + hti.getDurationInMillis());
//				log.debug("################################");
//
//				HistoricTaskInstanceVo historicTaskInstanceVo = objToBeanVo(hti, HistoricTaskInstanceVo.class);
//				if (historicTaskInstanceVo != null) {
//
//					List<HistoricVariableInstance> list2 = historyService.createHistoricVariableInstanceQuery()
//							.taskId(hti.getId()).list();
//					if (list2 != null && list2.size() > 0) {
//
//						Map<String, Object> variables = new HashMap<>();
//						for (HistoricVariableInstance historicVariableInstance : list2) {
//							variables.put(historicVariableInstance.getVariableName(),
//									historicVariableInstance.getValue());
//						}
//						historicTaskInstanceVo.setVariables(variables);
//					}
//
//					list1.add(historicTaskInstanceVo);
//				}
//
//			}
//		}
//
//		return list1;
	}
	/**
	 * 历史任务查询
	 */
	@Override
	public List<HistoricTaskInstance> queryTaskHistoryALL(SearchModelInput input) {
		HistoricTaskInstanceQuery query = historyService.createHistoricTaskInstanceQuery()
				.taskCandidateUser(input.getLoginAccount());
//				.taskAssignee(input.getLoginAccount());

		/*Integer totalItemCount = (int) query.count();
		PagedList<HistoricTaskInstance> pagedList = new PagedList<HistoricTaskInstance>(input.getPageIndex(),
				input.getPageSize(), totalItemCount);
*/
		List<HistoricTaskInstance> list = query.list();
		return list;
//		List<HistoricTaskInstanceVo> list1 = null;
//		if (list != null && list.size() > 0) {
//			list1 = new ArrayList<>();
//			for (HistoricTaskInstance hti : list) {
//				log.debug(hti.getId() + "    " + hti.getName() + "    " + hti.getProcessInstanceId() + "   "
//						+ hti.getStartTime() + "   " + hti.getEndTime() + "   " + hti.getDurationInMillis());
//				log.debug("################################");
//
//				HistoricTaskInstanceVo historicTaskInstanceVo = objToBeanVo(hti, HistoricTaskInstanceVo.class);
//				if (historicTaskInstanceVo != null) {
//
//					List<HistoricVariableInstance> list2 = historyService.createHistoricVariableInstanceQuery()
//							.taskId(hti.getId()).list();
//					if (list2 != null && list2.size() > 0) {
//
//						Map<String, Object> variables = new HashMap<>();
//						for (HistoricVariableInstance historicVariableInstance : list2) {
//							variables.put(historicVariableInstance.getVariableName(),
//									historicVariableInstance.getValue());
//						}
//						historicTaskInstanceVo.setVariables(variables);
//					}
//
//					list1.add(historicTaskInstanceVo);
//				}
//
//			}
//		}
//
//		return list1;
	}
	/**
	 * 历史活动查询
	 */
	@Override
	public List<HistoricActivityInstance> historyActInstanceList(SearchModelInput input) {
		
//		findHistoryProcessInstance(input);
//		findHistoryActiviti(input);
//		findHistoryTask(input);
//		findHistoryProcessVariables(input);

		// 得到ProcessEngine对象
		ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();

		HistoricActivityInstanceQuery query = processEngine.getHistoryService().createHistoricActivityInstanceQuery(); // 历史相关Service
		//个人
		if(!StringUtils.isEmpty(input.getLoginAccount())) {
			query.taskAssignee(input.getLoginAccount()).finished();
		}
		//查询整个流程活动 根据流程id
		if(!StringUtils.isEmpty(input.getProcessInstanceId())) {
			query.processInstanceId(input.getProcessInstanceId());
		}
		List<HistoricActivityInstance> list = query.list();
//		Integer totalItemCount = (int) query.count();
//		PagedList<HistoricActivityInstance> pagedList = new PagedList<HistoricActivityInstance>(input.getPageIndex(),
//				input.getPageSize(), totalItemCount);
//
//		List<HistoricActivityInstance> list = query // 执行流程实例id
//				.listPage((input.getPageIndex() - 1) * input.getPageSize(), input.getPageSize());

//	        List<TaskOutPut> listOut=list.stream().map(task -> {
//				TaskOutPut dto = new TaskOutPut();
//	            dto.setTaskId(task.getId());
//	            dto.setTaskName(task.getName());
//	            dto.setProcessInstanceId(task.getProcessInstanceId());
//	            dto.setProcessDefKey(task.getTaskDefinitionKey());
//	            dto.setCategory(task.getCategory());
//	            dto.setTime(task.getCreateTime());
//	            return dto;
//	        }).collect(Collectors.toList());

		// 将分页数据放入结果中
//		pagedList.getDataList().addAll(list);
		return list;
//	        for(HistoricActivityInstance hai:list){
//	            System.out.println("活动ID:"+hai.getId());
//	            System.out.println("流程实例ID:"+hai.getProcessInstanceId());
//	            System.out.println("活动名称："+hai.getActivityName());
//	            System.out.println("办理人："+hai.getAssignee());
//	            System.out.println("开始时间："+hai.getStartTime());
//	            System.out.println("结束时间："+hai.getEndTime());
//	            System.out.println("=================================");
//	        }
	}

	/**
	 * 我的代办任务分页查询
	 */
	@Override
	public List<TaskOutPut> getMyAgencyTask(SearchModelInput input) {
		TaskQuery tasksQuery = taskService.createTaskQuery().taskCandidateOrAssigned(input.getLoginAccount());
		List<Task> list=tasksQuery.list();
		List<TaskOutPut> listOut = list.stream().map(task -> {
			TaskOutPut dto = new TaskOutPut();
			dto.setTaskId(task.getId());
			dto.setTaskName(task.getName());
			dto.setProcessInstanceId(task.getProcessInstanceId());
			dto.setProcessDefKey(task.getTaskDefinitionKey());
			dto.setCategory(task.getCategory());
			dto.setTime(task.getCreateTime());
			return dto;
		}).collect(Collectors.toList());
//		Integer totalItemCount = (int) tasksQuery.count();
//		PagedList<TaskOutPut> pagedList = new PagedList<TaskOutPut>(input.getPageIndex(), input.getPageSize(),
//				totalItemCount);
//		// 分页查询
//		List<Task> list = tasksQuery.listPage((input.getPageIndex() - 1) * input.getPageSize(), input.getPageSize());
//		List<TaskOutPut> listOut = list.stream().map(task -> {
//			TaskOutPut dto = new TaskOutPut();
//			dto.setTaskId(task.getId());
//			dto.setTaskName(task.getName());
//			dto.setProcessInstanceId(task.getProcessInstanceId());
//			dto.setProcessDefKey(task.getTaskDefinitionKey());
//			dto.setCategory(task.getCategory());
//			dto.setTime(task.getCreateTime());
//			return dto;
//		}).collect(Collectors.toList());
//
//		// 将分页数据放入结果中
//		pagedList.getDataList().addAll(listOut);
		return listOut;

	}

	/**
	 * 驳回任务
	 * 
	 * @Description:
	 * @param taskId
	 * @param returnStart
	 */
	@Override
	public void rejectTask(String taskId, boolean returnStart) {
		jump(taskId, returnStart);
	}

	// 跳转方法
	public void jump(String taskId, boolean returnStart) {
		// 当前任务
		Task currentTask = this.taskService.createTaskQuery().taskId(taskId).singleResult();
		// 获取流程定义
//        Process process = activitiService.repositoryService.getBpmnModel(currentTask.getProcessDefinitionId()).getMainProcess();
		BpmnModel bpmnModel = this.repositoryService.getBpmnModel(currentTask.getProcessDefinitionId());

		List<HistoricActivityInstance> list = historyService.createHistoricActivityInstanceQuery()
				.processInstanceId(currentTask.getProcessInstanceId()).activityType("userTask").finished()
				.orderByHistoricActivityInstanceEndTime().asc().list();
		if (list == null || list.size() == 0) {
			throw new ActivitiException("操作历史流程不存在");
		}

		// 获取目标节点定义
		FlowNode targetNode = null;

		if (returnStart) {// 驳回到发起点

			targetNode = (FlowNode) bpmnModel.getMainProcess().getFlowElement(list.get(0).getActivityId());
		} else {// 驳回到上一个节点

			FlowNode currNode = (FlowNode) bpmnModel.getMainProcess()
					.getFlowElement(currentTask.getTaskDefinitionKey());

			for (int i = 0; i < list.size(); i++) {// 倒序审核任务列表，最后一个不与当前节点相同的节点设置为目标节点
				FlowNode lastNode = (FlowNode) bpmnModel.getMainProcess().getFlowElement(list.get(i).getActivityId());
				if (list.size() > 0 && currNode.getId().equals(lastNode.getId())) {
					targetNode = (FlowNode) bpmnModel.getMainProcess().getFlowElement(list.get(i - 1).getActivityId());
					break;
				}
			}

			if (targetNode == null && list.size() > 0) {
				targetNode = (FlowNode) bpmnModel.getMainProcess()
						.getFlowElement(list.get(list.size() - 1).getActivityId());
			}

//            Map<String, Object> flowElementMap = new TreeMap<>();
//            Collection<FlowElement> flowElements = bpmnModel.getMainProcess().getFlowElements();
//            for (FlowElement flowElement : flowElements) {
//
//                flowElementMap.put(flowElement.getId(), flowElement);
//            }
//
//            targetNode = (FlowNode) bpmnModel.getMainProcess().getFlowElement(tmplist.get(tmplist.size() - 1).getActivityId());
		}

		if (targetNode == null) {
			throw new ActivitiException("开始节点不存在");
		}

		// 删除当前运行任务
		String executionEntityId = managementService.executeCommand(new DeleteTaskCmd(currentTask.getId()));
		// 流程执行到来源节点
		managementService.executeCommand(new SetFLowNodeAndGoCmd(targetNode, executionEntityId));
	}
	
	
	
	
	
	
	/**
	 * 1.查询历史流程实例(act_hi_procinst表)
	 */
	public void findHistoryProcessInstance(SearchModelInput input){
		String processInstanceId = input.getProcessInstanceId();
		HistoricProcessInstance hpi = historyService                    //与历史数据（历史表）相关的Service
				.createHistoricProcessInstanceQuery()                                      //创建历史流程实例查询
				.processInstanceId(processInstanceId)                                      //使用流程实例ID查询
				.orderByProcessInstanceStartTime().asc()
				.singleResult();
		System.out.println(hpi.getId()+"    "+hpi.getProcessDefinitionId()+"    "+hpi.getStartTime()+"    "+hpi.getEndTime()+"     "+hpi.getDurationInMillis());
	}
	
	/**
	 * 2.查询历史活动(act_hi_actinst表)
	 */
	public void findHistoryActiviti(SearchModelInput input){
		String processInstanceId = input.getProcessInstanceId();
		List<HistoricActivityInstance> list = historyService
				.createHistoricActivityInstanceQuery()                                      //创建历史活动实例的查询
				.processInstanceId(processInstanceId)
				.orderByHistoricActivityInstanceStartTime().asc()
				.list();
		if(list !=null && list.size()>0){
			for(HistoricActivityInstance hai : list){
				System.out.println(hai.getId()+"   "+hai.getProcessInstanceId()+"   "+hai.getActivityType()+"  "+hai.getStartTime()+"   "+hai.getEndTime()+"   "+hai.getDurationInMillis());
				System.out.println("#####################");
			}
		}
	}
	
	/**
	 * 3.查询历史任务(act_hi_taskinst表)
	 */
	public void findHistoryTask(SearchModelInput input){
		String processInstanceId = input.getProcessInstanceId();
		List<HistoricTaskInstance> list = historyService                 //与历史数据（历史表）相关的Service
				.createHistoricTaskInstanceQuery()                                          //创建历史任务实例查询
				.processInstanceId(processInstanceId)
				.orderByHistoricTaskInstanceStartTime().asc()
				.list();
		if(list !=null && list.size()>0){
			for(HistoricTaskInstance hti:list){
				System.out.println(hti.getId()+"    "+hti.getName()+"    "+hti.getProcessInstanceId()+"   "+hti.getStartTime()+"   "+hti.getEndTime()+"   "+hti.getDurationInMillis());
				System.out.println("################################");
			}
		}
	}
	
	/**
	 * 4.查询历史流程变量(act_hi_varinst表)
	 */
	@Override
	public List<AuditTaskInfoOutput> findHistoryProcessVariables(SearchModelInput input){
		String processInstanceId = input.getProcessInstanceId();
		List<HistoricVariableInstance> list = historyService
				.createHistoricVariableInstanceQuery()                                      //创建一个历史的流程变量查询对象
				.processInstanceId(processInstanceId)
				.list();
		 List<AuditTaskInfoOutput> auditTaskInfoOutputList = new ArrayList<AuditTaskInfoOutput>();
		 SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		 ParsePosition pos = new ParsePosition(0);
		if(list !=null && list.size()>0){
			for(HistoricVariableInstance hvi:list){
				System.out.println(hvi.getId()+"   "+hvi.getProcessInstanceId()+"   "+hvi.getVariableName()+"   "+hvi.getVariableTypeName()+"    "+hvi.getValue());
				System.out.println("###############################################");
				AuditTaskInfoOutput auditTaskInfoOutput = new AuditTaskInfoOutput();
				if("userName".equals(hvi.getVariableName())) {
					auditTaskInfoOutput.setAuditUser(hvi.getValue().toString());
				}
				if("auditTime".equals(hvi.getVariableName())) {
					auditTaskInfoOutput.setAuditDate(formatter.parse(hvi.getValue().toString(),pos));
				}
				auditTaskInfoOutputList.add(auditTaskInfoOutput);
			}
		}
		return auditTaskInfoOutputList;
	}

	
	
	
	
	
	

}
