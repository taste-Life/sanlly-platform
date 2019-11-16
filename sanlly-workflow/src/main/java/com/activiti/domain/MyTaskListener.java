package com.activiti.domain;

import java.util.HashMap;
import java.util.Map;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.delegate.DelegateTask;
import org.activiti.engine.delegate.TaskListener;
import org.activiti.engine.runtime.ProcessInstance;
import org.springframework.beans.factory.annotation.Autowired;

import com.activiti.common.TransactorEnum;
import com.alibaba.fastjson.JSONObject;

public class MyTaskListener implements TaskListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = -419207972623113543L;
	private static final String IP = "http://192.168.9.62:8080";

	public void notify(DelegateTask task) {
		// 原task指定办理人
		System.out.println(task.getAssignee());
		// 判断是都是特殊id
		// if (task.getAssignee().indexOf("ACTIVITI") > -1) {
		// 获取流程启动是传入的userId
		ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
		String userId = (String) processEngine.getRuntimeService().getVariable(task.getExecutionId(), "userId");

		// 获取接口访问路径
		String url = TransactorEnum.getUrl(task.getAssignee());
		// 接口调用返回指定办理人
		// 参数userId
		JSONObject para = new JSONObject();
		para.put("id", userId);
		para.put("rule", "01");
//		String assignee = new RequestUrl().interfaceUtil(IP + url, para);

		// // 修改任务办理人
		// task.setAssignee("22");
		// }
	}
}
