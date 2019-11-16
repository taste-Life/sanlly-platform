package com.activiti.listener;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.annotation.Resource;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.TaskService;
import org.activiti.engine.delegate.*;
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
 * 采购任务监听器 供应商注册用总公司领导处理
 * 
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author fjy
 * @date 2019年7月31日 流程图中添加任务监听器 -- 委托表达式 ${purcCompanyParentListener} 为了是spring
 *       注解 @Autowired 在任务监听器中生效
 * 
 */
@Service("purcCompanyParentListener")
public class PurcCompanyParentListener implements JavaDelegate,TaskListener {
	// 必须与监听器声明的参数名称一致
	private Expression roleId;
	/**
	 * @Fields field:field:{todo}(用一句话描述这个变量表示什么)
	 */
	private static final long serialVersionUID = 1L;

	@Autowired
	private AuthFeignClient authService;

	@Override
	public void notify(DelegateTask delegateTask) {
		ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
		// 获取公司key
		String companyKey = (String) processEngine.getRuntimeService().getVariable(delegateTask.getExecutionId(),
				"companyKey");
		SearchUserInput input = new SearchUserInput();
		input.setCompanyKey(companyKey);
		// 模型流程监听器添加的参数roleId[角色id]
		input.setRoleId(Integer.valueOf(roleId.getExpressionText()));
		List<UserInfoOutput> listUser =authService.getCompanyUserList(input);
		
		if (listUser.size() > 1) {// 设置为候选人
			List<String> accounts = listUser.stream().map(u -> u.getLoginAccount()).collect(Collectors.toList());
			delegateTask.addCandidateUsers(accounts);
		} else if (listUser.size() == 1) { // 设置为代理人
			delegateTask.setAssignee(listUser.get(0).getLoginAccount());
		} else {
			System.out.println("没有查询到用户");
		}
		// 是否最后一步
		delegateTask.setVariable("is_end", true);
	}

	@Override
	public void execute(DelegateExecution execution) {

	}
}
