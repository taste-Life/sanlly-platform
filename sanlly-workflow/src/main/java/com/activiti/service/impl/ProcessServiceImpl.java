package com.activiti.service.impl;

import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.annotation.Resource;

import org.activiti.bpmn.model.BpmnModel;
import org.activiti.bpmn.model.FlowNode;
import org.activiti.bpmn.model.SequenceFlow;
import org.activiti.engine.HistoryService;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.history.HistoricActivityInstance;
import org.activiti.engine.history.HistoricProcessInstance;
import org.activiti.engine.impl.persistence.entity.ExecutionEntity;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.repository.ProcessDefinition;
import org.activiti.engine.repository.ProcessDefinitionQuery;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.runtime.ProcessInstanceQuery;
import org.activiti.engine.task.Task;
import org.activiti.image.ProcessDiagramGenerator;
import org.activiti.image.impl.DefaultProcessDiagramGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import com.activiti.dao.ProcinstFormMapper;
import com.activiti.entity.ProcinstFormExample;
import com.activiti.entity.ProcinstFormKey;
import com.activiti.models.input.SearchModelInput;
import com.activiti.models.output.ProcessOutPut;
import com.activiti.service.ProcessService;
import com.alibaba.fastjson.JSONObject;
import com.sanlly.common.models.output.pagination.PagedList;

import cn.hutool.core.util.RandomUtil;
import cn.hutool.core.util.StrUtil;

/**
 * @version: v1.0
 * @Description: 流程Service实现类
 * @author: wupzh
 * @date: 2019年6月20日
 */
@Service
public class ProcessServiceImpl implements ProcessService {
	private static final Logger logger = LoggerFactory.getLogger(ProcessServiceImpl.class);

	@Resource
	private RepositoryService repositoryService;
	@Resource
	private RuntimeService runtimeService;
	@Resource
	private HistoryService historyService;
	@Resource
	private ProcinstFormMapper procinstFormDao;
	@Resource
	private TaskService taskService;

	@Override
	public Map<String, Object> getByKeyAndLatestVersion(JSONObject param) {
		ProcessDefinition processDefinition = repositoryService.createProcessDefinitionQuery()
				.processDefinitionKey(param.get("key").toString()).latestVersion().singleResult();
		Map<String, Object> map = new HashMap<>();
		map.put("id", processDefinition.getId());
		map.put("name", processDefinition.getName());
		map.put("key", processDefinition.getKey());
		map.put("version", processDefinition.getVersion());
		map.put("deploymentId", processDefinition.getDeploymentId());
		return map;
	}

	@Override
	public List getByKey(JSONObject param) {
		return repositoryService.createProcessDefinitionQuery().processDefinitionKey(param.get("processKey").toString())
				.orderByProcessDefinitionVersion().desc().list();
	}

	@Override
	public Map getProcessDefinitions(JSONObject param) {
		Map<String, Object> resultMap = new HashMap<>();
		ProcessDefinitionQuery processDefinitionQuery = repositoryService.createProcessDefinitionQuery();
		// 查询条件: 根据key精确查询/是否只获取最新版本/根据名称模糊查询
		if (param.containsKey("key")) {
			processDefinitionQuery = processDefinitionQuery.processDefinitionKey(param.getString("key"));
		}
		if (param.containsKey("latestVersion") && param.getBoolean("latestVersion")) {
			processDefinitionQuery = processDefinitionQuery.latestVersion();
		}
		if (param.containsKey("name")) {
			processDefinitionQuery = processDefinitionQuery.processDefinitionNameLike(param.getString("name"));
		}
		List<ProcessDefinition> processDefinitionList = processDefinitionQuery.list();
		// 总条数
		resultMap.put("total", processDefinitionList.size());
		// 分页
		if (param.containsKey("pageNum") && param.containsKey("pageSize")) {
			int pageSize = param.getIntValue("pageSize");
			int startNum = (param.getIntValue("pageNum") - 1) * pageSize;
			processDefinitionList = processDefinitionQuery.listPage(startNum, pageSize);
		}
		// 封装返回结果
		List<Map<String, Object>> list = new ArrayList<>();
		if (processDefinitionList != null && processDefinitionList.size() > 0) {
			for (ProcessDefinition processDefinition : processDefinitionList) {
				Map<String, Object> map = new HashMap<>();
				// 流程定义id
				map.put("id", processDefinition.getId());
				// 流程定义名称
				map.put("name", processDefinition.getName());
				// 流程定义key
				map.put("key", processDefinition.getKey());
				// 流程定义版本
				map.put("version", processDefinition.getVersion());
				String deploymentId = processDefinition.getDeploymentId();
				// 部署id
				map.put("deploymentId", deploymentId);
				// 发布(部署时间)
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
				String deploymentTime = sdf.format(repositoryService.createDeploymentQuery().deploymentId(deploymentId)
						.singleResult().getDeploymentTime());
				map.put("deploymentTime", deploymentTime);
				list.add(map);
			}
		}

		resultMap.put("data", list);
		return resultMap;
	}

	@Override
	public Map getProcessInstances(JSONObject param) {
		Map<String, Object> resultMap = new HashMap<>();
		ProcessInstanceQuery processInstanceQuery = runtimeService.createProcessInstanceQuery();

		// 查询条件
		// 流程实例名称,模糊匹配
		if (param.containsKey("name")) {
			processInstanceQuery = processInstanceQuery.processInstanceNameLike(param.getString("name"));
		}
		// 流程定义key,精确匹配
		if (param.containsKey("key")) {
			processInstanceQuery = processInstanceQuery.processDefinitionKey(param.getString("key"));
		}
		// 流程定义名称,精确匹配
		if (param.containsKey("processDefinitionName")) {
			processInstanceQuery = processInstanceQuery.processDefinitionName(param.getString("processDefinitionName"));
		}
		// 流程实例发起人id
		if (param.containsKey("startedBy")) {
			processInstanceQuery = processInstanceQuery.startedBy(param.getString("startedBy"));
		}
		// 流程实例创建时间起始
		if (param.containsKey("startedAfter")) {
			processInstanceQuery = processInstanceQuery.startedAfter(param.getDate("startedAfter"));
		}
		// 流程实例创建时间终止
		if (param.containsKey("startedBefore")) {
			processInstanceQuery = processInstanceQuery.startedBefore(param.getDate("startedBefore"));
		}
		// 流程实例状态,是否挂起
		if (param.containsKey("suspended") && param.getBoolean("suspended")) {
			processInstanceQuery = processInstanceQuery.suspended();
		}

		List<ProcessInstance> processInstanceList = processInstanceQuery.list();
		// 总条数
		resultMap.put("total", processInstanceList.size());

		// 分页
		if (param.containsKey("pageNum") && param.containsKey("pageSize")) {
			int pageSize = param.getIntValue("pageSize");
			int startNum = (param.getIntValue("pageNum") - 1) * pageSize;
			processInstanceList = processInstanceQuery.listPage(startNum, pageSize);
		}

		// 封装返回结果
		List<Map<String, Object>> list = new ArrayList<>();
		if (processInstanceList != null && processInstanceList.size() > 0) {
			for (ProcessInstance processInstance : processInstanceList) {
				Map<String, Object> map = new HashMap<>();
				// 流程实例id
				map.put("id", processInstance.getId());
				// 流程实例名称
				map.put("name", processInstance.getName());
				// 流程定义名称
				map.put("processDefinitionName", processInstance.getProcessDefinitionName());
				// 流程key
				map.put("processDefinitionKey", processInstance.getProcessDefinitionKey());
				// 创建时间
				map.put("startTime",
						new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(processInstance.getStartTime()));
				// 是否挂起
				map.put("isSuspended", processInstance.isSuspended());
				list.add(map);
			}
		}

		resultMap.put("data", list);
		return resultMap;
	}

	@Override
	public List<ProcessDefinition> getByLatestVersion() {
		return repositoryService.createProcessDefinitionQuery().latestVersion().list();
	}

	@Override
	public void startByKey(JSONObject param) {
		runtimeService.startProcessInstanceByKey(param.getString("key"));
	}

	@Override
	public String startByKeyWithVars(JSONObject param) {
		return runtimeService.startProcessInstanceByKey(param.getString("key"), param.getJSONObject("vars"))
				.getProcessInstanceId();
	}

	@Override
	public Map getProcessVars(JSONObject param) {
		return runtimeService.getVariables(param.getString("vars"));
	}

	@Override
	public List getProcessInstancesByKey(JSONObject param) {
		List<Map<String, Object>> list = new ArrayList<>();
		List<ProcessInstance> processInstances = runtimeService.createProcessInstanceQuery()
				.processDefinitionKey(param.getString("key")).list();
		if (processInstances != null && processInstances.size() > 0) {
			for (ProcessInstance processInstance : processInstances) {
				Map<String, Object> map = new HashMap<>();
				map.put("processInstanceId", processInstance.getProcessInstanceId());
				list.add(map);
			}
		}
		return list;
	}

	@Override
	public void suspend(JSONObject param) {
		runtimeService.suspendProcessInstanceById(param.getString("processInstanceId"));
	}

	@Override
	public void activate(JSONObject param) {
		runtimeService.activateProcessInstanceById(param.getString("processInstanceId"));
	}

	@Override
	public InputStream getImgByProcessInstanceId(JSONObject param) {
		String processInstanceId = param.getString("processInstanceId");
		// 获取历史流程实例
		HistoricProcessInstance historicProcessInstance = historyService.createHistoricProcessInstanceQuery()
				.processInstanceId(processInstanceId).singleResult();
		// 获取流程中已经执行的节点，按照执行先后顺序排序
		List<HistoricActivityInstance> historicActivityInstances = historyService.createHistoricActivityInstanceQuery()
				.processInstanceId(processInstanceId).orderByHistoricActivityInstanceId().asc().list();
		// 高亮已经执行流程节点ID集合
		List<String> highLightedActivitiIds = new ArrayList<>();
		for (HistoricActivityInstance historicActivityInstance : historicActivityInstances) {
			highLightedActivitiIds.add(historicActivityInstance.getActivityId());
		}
		ProcessDiagramGenerator processDiagramGenerator = new DefaultProcessDiagramGenerator();

		BpmnModel bpmnModel = repositoryService.getBpmnModel(historicProcessInstance.getProcessDefinitionId());
		// 高亮流程已发生流转的线id集合
		List<String> highLightedFlowIds = getHighLightedFlows(bpmnModel, historicActivityInstances);
		// 根据流程ID获取当前任务
		List<Task> tasks = taskService.createTaskQuery().processInstanceId(processInstanceId).list();
		
		if(tasks.size()>0) {
			String excId = tasks.get(0).getExecutionId();
			ExecutionEntity execution = (ExecutionEntity) runtimeService.createExecutionQuery().executionId(excId).singleResult();
			String activitiId = execution.getActivityId();
			highLightedActivitiIds.clear();
			highLightedActivitiIds.add(activitiId);
		}
		// 使用默认配置获得流程图表生成器，并生成追踪图片字符流
		InputStream imageStream = processDiagramGenerator.generateDiagram(bpmnModel, "png", highLightedActivitiIds,
				highLightedFlowIds, "宋体", "微软雅黑", "黑体", null, 2.0);
		return imageStream;
	}

	@Override
	public Map<String, Object> getModelIdByProcessDefinitionId(JSONObject param) {
		Map<String, Object> map = new HashMap<>();
		// 根据流程定义id获取部署id
		String deploymentId = repositoryService.createProcessDefinitionQuery()
				.processDefinitionId(param.getString("processDefinitionId")).singleResult().getDeploymentId();
		// 根据部署id获取模型id, 用于查看定义相关的流程图
		map.put("modelId", repositoryService.createModelQuery().deploymentId(deploymentId).singleResult().getId());
		return map;
	}

	@Override
	public void insertProcInstForm(JSONObject param) {
		ProcinstFormKey record = new ProcinstFormKey();
		record.setFormId(param.getString("formId"));

		procinstFormDao.insert(record);
	}

	@Override
	public String selectProcInstIdByFormId(JSONObject param) {
		String formId = param.getString("formId");
		ProcinstFormExample example = new ProcinstFormExample();
		example.createCriteria().andFormIdEqualTo(formId);
		List<ProcinstFormKey> list = procinstFormDao.selectByExample(example);
		return list.get(0).getProcInstId();
	}

	/**
	 * 获取已经流转的线
	 * 
	 * @param bpmnModel
	 * @param historicActivityInstances
	 * @return
	 */
	private static List<String> getHighLightedFlows(BpmnModel bpmnModel,
			List<HistoricActivityInstance> historicActivityInstances) {
		// 高亮流程已发生流转的线id集合
		List<String> highLightedFlowIds = new ArrayList<>();
		// 全部活动节点
		List<FlowNode> historicActivityNodes = new ArrayList<>();
		// 已完成的历史活动节点
		List<HistoricActivityInstance> finishedActivityInstances = new ArrayList<>();

		for (HistoricActivityInstance historicActivityInstance : historicActivityInstances) {
			FlowNode flowNode = (FlowNode) bpmnModel.getMainProcess()
					.getFlowElement(historicActivityInstance.getActivityId(), true);
			historicActivityNodes.add(flowNode);
			if (historicActivityInstance.getEndTime() != null) {
				finishedActivityInstances.add(historicActivityInstance);
			}
		}

		FlowNode currentFlowNode = null;
		FlowNode targetFlowNode = null;
		// 遍历已完成的活动实例，从每个实例的outgoingFlows中找到已执行的
		for (HistoricActivityInstance currentActivityInstance : finishedActivityInstances) {
			// 获得当前活动对应的节点信息及outgoingFlows信息
			currentFlowNode = (FlowNode) bpmnModel.getMainProcess()
					.getFlowElement(currentActivityInstance.getActivityId(), true);
			List<SequenceFlow> sequenceFlows = currentFlowNode.getOutgoingFlows();

			/**
			 * 遍历outgoingFlows并找到已已流转的 满足如下条件认为已已流转：
			 * 1.当前节点是并行网关或兼容网关，则通过outgoingFlows能够在历史活动中找到的全部节点均为已流转
			 * 2.当前节点是以上两种类型之外的，通过outgoingFlows查找到的时间最早的流转节点视为有效流转
			 */
			if ("parallelGateway".equals(currentActivityInstance.getActivityType())
					|| "inclusiveGateway".equals(currentActivityInstance.getActivityType())) {
				// 遍历历史活动节点，找到匹配流程目标节点的
				for (SequenceFlow sequenceFlow : sequenceFlows) {
					targetFlowNode = (FlowNode) bpmnModel.getMainProcess().getFlowElement(sequenceFlow.getTargetRef(),
							true);
					if (historicActivityNodes.contains(targetFlowNode)) {
						highLightedFlowIds.add(targetFlowNode.getId());
					}
				}
			} else {
				List<Map<String, Object>> tempMapList = new ArrayList<>();
				for (SequenceFlow sequenceFlow : sequenceFlows) {
					for (HistoricActivityInstance historicActivityInstance : historicActivityInstances) {
						if (historicActivityInstance.getActivityId().equals(sequenceFlow.getTargetRef())) {
							Map<String, Object> map = new HashMap<>();
							map.put("highLightedFlowId", sequenceFlow.getId());
							map.put("highLightedFlowStartTime", historicActivityInstance.getStartTime().getTime());
							tempMapList.add(map);
						}
					}
				}

				if (!CollectionUtils.isEmpty(tempMapList)) {
					// 遍历匹配的集合，取得开始时间最早的一个
					long earliestStamp = 0L;
					String highLightedFlowId = null;
					for (Map<String, Object> map : tempMapList) {
						long highLightedFlowStartTime = Long.valueOf(map.get("highLightedFlowStartTime").toString());
						if (earliestStamp == 0 || earliestStamp >= highLightedFlowStartTime) {
							highLightedFlowId = map.get("highLightedFlowId").toString();
							earliestStamp = highLightedFlowStartTime;
						}
					}

					highLightedFlowIds.add(highLightedFlowId);
				}

			}

		}
		return highLightedFlowIds;
	}

	/**
	 * 流程分页查询
	 */
	@Override
	public PagedList<ProcessOutPut> getProcessByPage(SearchModelInput input) {

		ProcessDefinitionQuery query = repositoryService.createProcessDefinitionQuery()
		// 暂不支持多租户
		// .processDefinitionTenantId(String.valueOf(TenantContextHolder.getTenantId()))
				.latestVersion();

		String category = input.getCategory();
		if (category != null && !category.equals("")) {
			query.processDefinitionCategoryLike(category);
		}
		if (input.getName() != null && !input.getName().equals("")) {
			query.processDefinitionNameLike(input.getName());
		}
		if (StrUtil.isNotBlank(category)) {
			query.processDefinitionCategory(category);
		}

		Integer totalItemCount = (int) query.count();
		PagedList<ProcessOutPut> pagedList = new PagedList<ProcessOutPut>(input.getPageIndex(), input.getPageSize(),
				totalItemCount);
		// 分页查询
		List<ProcessOutPut> deploymentList = query
				.listPage((input.getPageIndex() - 1) * input.getPageSize(), input.getPageSize()).stream()
				.map(processDefinition -> {
					Deployment deployment = repositoryService.createDeploymentQuery()
							.deploymentId(processDefinition.getDeploymentId()).singleResult();
					return ProcessOutPut.toProcessDefDTO(processDefinition, deployment);
				}).collect(Collectors.toList());

		// 将分页数据放入结果中
		pagedList.getDataList().addAll(deploymentList);
		return pagedList;

	}

	/**
	 * 读取xml/image资源
	 *
	 * @param procDefId
	 * @param proInsId
	 * @param resType
	 * @return
	 */
	@Override
	public InputStream readResource(String procDefId, String proInsId, String resType) {
		if (StrUtil.isBlank(procDefId)) {
			ProcessInstance processInstance = runtimeService.createProcessInstanceQuery().processInstanceId(proInsId)
					.singleResult();
			procDefId = processInstance.getProcessDefinitionId();
		}
		ProcessDefinition processDefinition = repositoryService.createProcessDefinitionQuery()
				.processDefinitionId(procDefId).singleResult();

		String resourceName = "";
		if ("image".equals(resType)) {
			resourceName = processDefinition.getDiagramResourceName();
		} else if ("xml".equals(resType)) {
			resourceName = processDefinition.getResourceName();
		}

		InputStream resourceAsStream = repositoryService.getResourceAsStream(processDefinition.getDeploymentId(),
				resourceName);
		return resourceAsStream;
	}

	/**
	 * 更新状态
	 *
	 * @param status
	 * @param procDefId
	 * @return
	 */
	@Override
	public Boolean updateStatus(String status, String[] procDefId) {
		List<String> list = Arrays.asList(procDefId);
		for (int i = 0; i < list.size(); i++) {
			if ("active".equals(status)) {
				repositoryService.activateProcessDefinitionById(list.get(i), true, null);
			} else if ("suspend".equals(status)) {
				repositoryService.suspendProcessDefinitionById(list.get(i), true, null);
			}
		}

		return Boolean.TRUE;
	}

	/**
	 * 删除部署的流程，级联删除流程实例
	 *
	 * @param deploymentId
	 * @return
	 */
	@Override
	public Boolean removeProcIns(String[] deploymentId) {
		List<String> list = Arrays.asList(deploymentId);
		for (int i = 0; i < list.size(); i++) {
			repositoryService.deleteDeployment(list.get(i), true);
		}
		return Boolean.TRUE;
	}

	/**
	 * 启动流程
	 *
	 * @param deploymentId
	 * @return
	 */
	@Override
	@Transactional(rollbackFor = Exception.class)
	public Boolean saveStartProcess(String[] deploymentId) {
		/*
		 * LeaveBill leaveBill = leaveBillMapper.selectById(leaveId);
		 * leaveBill.setState(TaskStatusEnum.CHECK.getStatus());
		 * 
		 * String key = leaveBill.getClass().getSimpleName(); String businessKey = key +
		 * "_" + leaveBill.getLeaveId();
		 */
		List<String> list = Arrays.asList(deploymentId);
		for (int i = 0; i < list.size(); i++) {
			ProcessDefinition processDefinition = repositoryService.createProcessDefinitionQuery()
					.deploymentId(list.get(i))
					// .processDefinitionId(processDefinitionId)
					.singleResult();

			String key = processDefinition.getKey();
			String businessKey = key + "_" + RandomUtil.randomUUID();
			runtimeService.startProcessInstanceByKeyAndTenantId(key, businessKey, null // 暂不支持多租户
																						// //String.valueOf(TenantContextHolder.getTenantId())
			);

			/* leaveBillMapper.updateById(leaveBill); */
		}
		return Boolean.TRUE;
	}

	/**
	 * 查询一个流程是否结束 Title: isEndProcess Description:
	 * 
	 * @param processInstanceId
	 * @return
	 * @see com.activiti.service.ProcessService#isEndProcess(java.lang.String)
	 */
	@Override
	public Boolean isEndProcess(String processInstanceId) {
		/** 判断流程是否结束，查询正在执行的执行对象表 */
		ProcessInstance rpi = runtimeService.createProcessInstanceQuery()// 创建流程实例查询对象
				.processInstanceId(processInstanceId).singleResult();
		// 说明流程实例结束了
		if (rpi == null) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 删除流程实例
	* Title: removeProcessByProcessId 
	* Description: 
	* @param processInstanceId
	* @return  
	* @see com.activiti.service.ProcessService#removeProcessByProcessId(java.lang.String)
	 */
	@Override
	public Boolean removeProcessByProcessId(String processInstanceId) {
		// TODO Auto-generated method stub

		runtimeService.deleteProcessInstance(processInstanceId, "");
//		historyService.deleteHistoricProcessInstance(processInstanceId);
		
		return true;

	}

	/*********************************/

}
