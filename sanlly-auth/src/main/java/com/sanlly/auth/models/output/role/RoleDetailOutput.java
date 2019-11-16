package com.sanlly.auth.models.output.role;

/**
 * 角色明细
 * @author RexSheng
 * 2019年8月16日 上午9:44:45
 */
public class RoleDetailOutput {

	/**
	 * 角色id
	 */
	private Integer roleId;
	
	/**
	 * 角色类型
	 */
	private Integer roleType;
	
	/**
	 * 角色名称
	 */
	private String roleName;
	
	/**
	 * 备注
	 */
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

	public Integer getRoleType() {
		return roleType;
	}

	public void setRoleType(Integer roleType) {
		this.roleType = roleType;
	}
	
	
}
