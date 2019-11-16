package com.activiti.listener;


import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.annotation.Resource;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.TaskService;
import org.activiti.engine.delegate.DelegateTask;
import org.activiti.engine.delegate.Expression;
import org.activiti.engine.delegate.TaskListener;
import org.activiti.engine.task.IdentityLink;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.activiti.common.TransactorEnum;
import com.activiti.service.feign.AuthFeignClient;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.sanlly.common.models.input.user.SearchUserInput;
import com.sanlly.common.models.output.user.UserInfoOutput;

/**
 * 采购任务监听器 供应商注册用分公司领导处理
 * 
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author mx
 * @date 2019年7月31日
 * 流程图中添加任务监听器  --  委托表达式 ${purcCompanyLeaderListener}  为了是spring 注解 @Autowired 在任务监听器中生效
 */
@Service("purcCompanyLeaderListener")
public class PurcCompanyLeaderListener implements TaskListener {

	
	/**  
	* @Fields field:field:{todo}(用一句话描述这个变量表示什么)  
	*/  
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private AuthFeignClient authService;
	

	@Override
	public void notify(DelegateTask delegateTask) {

		SearchUserInput input = new SearchUserInput();
		ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
		// 获取公司key
		
		Set<IdentityLink> candidates =delegateTask.getCandidates();
		for (IdentityLink item : candidates) {
			input.setRoleId(Integer.valueOf(item.getGroupId()));
		}
		List<UserInfoOutput> listUser = authService.getCompanyUserList(input);
		
		if (listUser!=null && listUser.size() > 1) {// 设置为候选人
			List<String> accounts = listUser.stream().map(u -> u.getLoginAccount()).collect(Collectors.toList());
			delegateTask.addCandidateUsers(accounts);

		} else if (listUser!=null && listUser.size() == 1) { // 设置为代理人
			delegateTask.setAssignee(listUser.get(0).getLoginAccount());
		} else {
			System.out.println("没有查询到用户");
		}
		// 是否最后一步
		delegateTask.setVariable("is_end", false);

	}
}
