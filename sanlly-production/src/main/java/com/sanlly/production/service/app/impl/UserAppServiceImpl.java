package com.sanlly.production.service.app.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.enums.ResultCodeEnum;
import com.sanlly.common.models.input.user.ChangePasswordInput;
import com.sanlly.common.models.input.user.EditUserInput;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.user.UserInfoOutput;
import com.sanlly.production.dao.AppVersionMapper;
import com.sanlly.production.entity.AppVersion;
import com.sanlly.production.entity.AppVersionExample;
import com.sanlly.production.models.input.app.user.ChangePwdInput;
import com.sanlly.production.models.input.app.user.UserEditInput;
import com.sanlly.production.models.output.app.user.UserAppInfoOutput;
import com.sanlly.production.models.output.app.version.VersionDetailOutput;
import com.sanlly.production.service.AuthService;
import com.sanlly.production.service.app.UserAppService;

/**
 * 用户app接口
 * @author RexSheng
 * 2019年8月28日 上午10:27:50
 */
@Service
public class UserAppServiceImpl implements UserAppService{

	@Autowired
	private AuthService authClient;
	
	@Autowired
	private AppVersionMapper versionDao;
	
	/**
	 * 获取用户信息
	 */
	@Override
	public UserAppInfoOutput getUser(Integer userId) {
		Result<UserInfoOutput> userRlt=authClient.getUserDetail(userId);
		if(userRlt!=null && userRlt.getCode()!=null && userRlt.getCode().equals(ResultCodeEnum.SUCCESS.getCode())) {
			UserInfoOutput output=userRlt.getData();
			if(output!=null) {
				UserAppInfoOutput item=new UserAppInfoOutput();
				item.setUserId(output.getUserId());
				item.setUserName(output.getUserName());
				item.setPhone(output.getMobile());
				item.setGender(output.getUserSex());
				item.setEmail(output.getEmail());
				return item;
			}
		}
		return null;
	}

	/**
	 * 修改密码
	 */
	@SuppressWarnings("rawtypes")
	@Override
	public Result changePassword(ChangePwdInput input) {
		ChangePasswordInput newInput=new ChangePasswordInput();
		newInput.setUserId(input.getUserId());
		newInput.setOldPassword(input.getOldPwd());
		newInput.setNewPassword(input.getNewPwd());
		return authClient.changePwd(newInput);
	}
	
	/**
	 * 修改用户信息
	 */
	@Override
	public void updateUser(UserEditInput input) {
		EditUserInput newInput=new EditUserInput();
		newInput.setUserId(input.getUserId());
		newInput.setUserSex(input.getGender());
		newInput.setMobile(input.getPhone());
		newInput.setEmail(input.getEmail());
		authClient.updateUser(newInput);
	}
	
	/**
	 * 获取app最新版本
	 * @return
	 */
	@Override
	public VersionDetailOutput getLatestVersion() {
		AppVersionExample example=new AppVersionExample();
		example.createCriteria()
			.andIsDelEqualTo(PlatformConstants.ISDEL_NO)
			.andIsValidEqualTo(PlatformConstants.ISVALID_YES);
		//按照创建时间倒序取第一条
		example.setOrderByClause("create_time desc");
		List<AppVersion> versionList=versionDao.selectByExample(example);
		if(versionList.size()>0) {
			AppVersion record=versionList.get(0);
			VersionDetailOutput output=new VersionDetailOutput();
			//版本号
			output.setVersionCode(record.getVersionCode());
			output.setVersionName(record.getVersionName());
			output.setRemarks(record.getRemarks());
			output.setApkFilePath(record.getApkFilePath());
			return output;
		}
		return null;
	}
}
