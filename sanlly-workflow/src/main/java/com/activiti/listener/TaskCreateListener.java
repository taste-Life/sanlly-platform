package com.activiti.listener;

import javax.annotation.Resource;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.TaskService;
import org.activiti.engine.delegate.DelegateTask;
import org.activiti.engine.delegate.Expression;
import org.activiti.engine.delegate.TaskListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.activiti.service.feign.AuthFeignClient;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;


/**
 * @version: v1.0
 * @Description: 任务监听器
 * @author: wupzh
 * @date: 2019年6月20日
 */
@Service
public class TaskCreateListener implements TaskListener {

	@Autowired
	private AuthFeignClient authService;
	
    @Resource
    private TaskService taskService;

    private Expression rule;

    @Override
    public void notify(DelegateTask delegateTask) {
    	ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
		String userId = (String) processEngine.getRuntimeService().getVariable(delegateTask.getExecutionId(), "userId");

        JSONObject postData = new JSONObject();
        postData.put("rule", rule.getValue(delegateTask).toString());
        postData.put("id", userId);
        // 根据任务选取规则拉取业务系统中的人员信息
        
        System.out.println("============================="+delegateTask.getId());
        
//        authService.getUsersFromAuth(name)  //沒有完事，等待实现用户接口返回一个集合
//        
//        String response = restTemplate.postForEntity(userServicePath, postData, String.class).getBody();
//        JSONArray jsonArray = JSONArray.parseArray(response);
//        // 如果返回多个用户， 设为候选人
//        if(jsonArray.size() > 1) {
//            for(Object object : jsonArray) {
//                // String name = ((JSONObject) object).getString("name");
//                taskService.addCandidateUser(delegateTask.getId(), ((JSONObject)object).get("id").toString());
//            }
//        }
//        // 如果返回单个用户设为代理人
//        if(jsonArray.size() == 1) {
//            taskService.setAssignee(delegateTask.getId(), ((JSONObject)jsonArray.get(0)).get("id").toString());
//        }
    }
}
