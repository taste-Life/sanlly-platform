package com.sanlly.production.service.app;

import com.sanlly.common.models.output.Result;
import com.sanlly.production.models.input.app.user.ChangePwdInput;
import com.sanlly.production.models.input.app.user.UserEditInput;
import com.sanlly.production.models.output.app.user.UserAppInfoOutput;
import com.sanlly.production.models.output.app.version.VersionDetailOutput;

/**
 * 用户app接口
 * @author RexSheng
 * 2019年8月27日 下午7:41:23
 */
public interface UserAppService {

	/**
	 * 根据id获取用户信息
	 * @param userId
	 * @return
	 */
	UserAppInfoOutput getUser(Integer userId);
	
	/**
	 * 修改密码
	 * @param input
	 */
	@SuppressWarnings("rawtypes")
	Result changePassword(ChangePwdInput input);
	
	/**
	 * 修改用户信息
	 * @param input
	 */
	void updateUser(UserEditInput input);
	
	/**
	 * 获取app最新版本
	 * @return
	 */
	VersionDetailOutput getLatestVersion();
}
