package com.sanlly.auth.models.input.role;

/**
 * 修改角色输入
 * @author RexSheng
 * 2019年8月16日 上午9:40:33
 */
public class EditRoleInput {
	
	private Integer roleId;

	private String roleName;
	
	private String remark;

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

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
	
	
}
