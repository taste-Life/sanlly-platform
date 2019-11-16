package com.activiti.listener;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.DelegateTask;
import org.activiti.engine.delegate.Expression;
import org.activiti.engine.delegate.JavaDelegate;
import org.activiti.engine.delegate.TaskListener;
import org.activiti.engine.task.IdentityLink;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.activiti.service.feign.AuthFeignClient;
import com.sanlly.common.models.input.user.SearchUserInput;
import com.sanlly.common.models.output.user.UserInfoOutput;

/**
 * 
* Description:采购任务监听器  分公司采购管理员审核采购单
* @ClassName: PurchaseAudit
* @date 2019年8月14日
*
* @author jlx
* 流程图中添加任务监听器  --  委托表达式 ${purchaseLeaderAuditListener}  为了是spring 注解 @Autowired 在任务监听器中生效
* 
* 监听器添加的角色id字段需要实现JavaDelegate，才能获取到角色id的值
 */
@Service("purchaseLeaderAuditListener")
public class PurchaseLeaderAuditListener implements JavaDelegate, TaskListener {

	/**  
	* @Fields field:field:{todo}(用一句话描述这个变量表示什么)  
	*/  
	private static final long serialVersionUID = 1L;

	// 必须与监听器声明的参数名称一致
	private Expression roleId;
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
		List<UserInfoOutput> listUser = authService.getPurchaseLeaderAuditCompanyUserList(input);
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

	@Override
	public void execute(DelegateExecution execution) {
		// TODO Auto-generated method stub
		
	}

}
