package com.sanlly.auth.models.input.role;

/**
 * 新增角色输入类
 * @author RexSheng
 * 2019年8月16日 上午9:39:19
 */
public class AddRoleInput {

	/**
	 * 角色名称
	 */
	private String roleName;
	
	/**
	 * 备注
	 */
	private String remark;
	
	/**
	 * 角色类型0普通，1场站
	 */
	private Integer roleType;

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getRoleType() {
		return roleType;
	}

	public void setRoleType(Integer roleType) {
		this.roleType = roleType;
	}

	
}
