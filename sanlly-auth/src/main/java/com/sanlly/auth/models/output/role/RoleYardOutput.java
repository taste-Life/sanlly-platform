package com.sanlly.auth.models.output.role;

import java.util.List;

/**
 * 角色场站输出
 * @author RexSheng
 * 2019年8月16日 上午9:45:23
 */
public class RoleYardOutput {
	/**
	 * 角色id
	 */
	private Integer roleId;
	
	/**
	 * 包含公司
	 */
	private List<CompanyOutput> companyList;
	
	/**
	 * 包含场站
	 */
	private Integer[] yardIds;
	
	/**
	 * 当前所属公司
	 */
	private Integer currentCompanyId;
	
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public Integer[] getYardIds() {
		return yardIds;
	}
	public void setYardIds(Integer[] yardIds) {
		this.yardIds = yardIds;
	}
	public List<CompanyOutput> getCompanyList() {
		return companyList;
	}
	public void setCompanyList(List<CompanyOutput> companyList) {
		this.companyList = companyList;
	}
	public Integer getCurrentCompanyId() {
		return currentCompanyId;
	}
	public void setCurrentCompanyId(Integer currentCompanyId) {
		this.currentCompanyId = currentCompanyId;
	}
	
	
}
