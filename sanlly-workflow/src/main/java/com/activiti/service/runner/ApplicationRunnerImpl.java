package com.activiti.service.runner;

import java.util.List;

import org.activiti.engine.IdentityService;
import org.activiti.engine.identity.Group;
import org.activiti.engine.identity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.activiti.dao.ActGroupMapper;
import com.activiti.dao.ActMemberShipMapper;
import com.activiti.dao.ActUserMapper;
import com.activiti.service.feign.AuthFeignClient;
import com.sanlly.common.enums.SystemTypeEnum;
import com.sanlly.common.models.input.role.SearchRoleInput;
import com.sanlly.common.models.input.user.SearchUserInput;
import com.sanlly.common.models.output.role.RoleOutPut;
import com.sanlly.common.models.output.role.UserRoleOutPut;
import com.sanlly.common.models.output.user.UserInfoOutput;

/**
 * 项目第一次启动，自动同步一次 业务系统中的用户和角色到 流程中
 * 
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author fjy
 * @date 2019年7月30日
 *
 */
@Component
public class ApplicationRunnerImpl implements ApplicationRunner {

	/**
	 * 是否同步用户和组数据
	 */
	@Value("${spring.http.activiti.synch-users}")
	private Boolean synchUsers;

	@Autowired
	private AuthFeignClient authFeignClient;

	@Autowired
	private ActUserMapper actUserDao;

	@Autowired
	private ActGroupMapper actGroupDao;

	@Autowired
	private ActMemberShipMapper actMemberShipDao;

	@Autowired
	private IdentityService identityService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		if (synchUsers) {
			try {

				System.out.println("============同步用户和角色==============");
				// 清空关系表
				actMemberShipDao.deleteByExample(null);
				// 清空用户
				actUserDao.deleteByExample(null);
				// 清空组
				actGroupDao.deleteByExample(null);

				// 开始同步用户数据
				SearchUserInput searchUserInput = new SearchUserInput();
				//查询管理系统用户
				searchUserInput.setSystemType(SystemTypeEnum.MANAGEMENT.getCode());
				List<UserInfoOutput> userList = authFeignClient.userList(searchUserInput);
				System.out.println("============用户==============");
				for (int i = 0; i < userList.size(); i++) {
					try {
						System.out.println(i + "==user:" + userList.get(i).getLoginAccount() + "   userName:"
								+ userList.get(i).getUserName());
						User user = identityService.newUser(userList.get(i).getLoginAccount());
						user.setFirstName(userList.get(i).getUserName());
						user.setLastName("");
						user.setEmail(userList.get(i).getEmail());
//			user.setPassword(param.getString("password"));
						identityService.saveUser(user);

					} catch (Exception e) {
						// TODO: handle exception
					}
				}
				// 开始同步组数据
				SearchRoleInput searchRoleInput = new SearchRoleInput();
				List<RoleOutPut> groupList = authFeignClient.getRoleList(searchRoleInput);
				System.out.println("============角色==============");
				for (int i = 0; i < groupList.size(); i++) {
					System.out.println(i + "==group:" + groupList.get(i).getRoleId().toString() + "   groupName:"
							+ groupList.get(i).getRoleName());
					try {
						Group group = identityService.newGroup(groupList.get(i).getRoleId().toString());
						group.setName(groupList.get(i).getRoleName());
						identityService.saveGroup(group);
					} catch (Exception e) {
						// TODO: handle exception
					}

				}
				System.out.println("============用户角色关系==============");
				// 同步用户和组的关系
				List<UserRoleOutPut> userRoleList = authFeignClient.getUserRoleList();
				for (int i = 0; i < userRoleList.size(); i++) {
					System.out.println(i + "==user:" + userRoleList.get(i).getUser().getLoginAccount() + "   group:"
							+ userRoleList.get(i).getRole().getRoleId().toString());
					try {
						// 防止重复的挂掉
						identityService.createMembership(userRoleList.get(i).getUser().getLoginAccount(),
								userRoleList.get(i).getRole().getRoleId().toString());
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
				System.out.println("=============同步用户和角色结束===========");
			} catch (Exception e) {
				System.out.println("=============同步用户和角色失败===========" + e.getMessage());
			}
		} else {
			System.out.println("=============synch-users 配置未开启，跳过用户数据同步操作===========");

		}

	}
}
