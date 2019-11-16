package com.sanlly.common.models.output.menu;

import java.util.List;

import com.sanlly.common.models.output.auth.AuthDetailOutput;

/**
 * 菜单详细信息
 * @author RexSheng
 * 2019年8月16日 下午1:04:55
 */
public class MenuDetailOutput {
	
	private Integer menuId;
	
	private String menuCode;
	
	private String menuName;
	
	private String menuNameEn;
	
	private Integer menuParentId;
	
	private Integer menuOrder;
	
	private String menuIcon;
	
	private Boolean hasChildren;
	
	private List<MenuDetailOutput> subMenuList;
	
	private List<AuthDetailOutput> authList;

	public Integer getMenuId() {
		return menuId;
	}

	public void setMenuId(Integer menuId) {
		this.menuId = menuId;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getMenuNameEn() {
		return menuNameEn;
	}

	public void setMenuNameEn(String menuNameEn) {
		this.menuNameEn = menuNameEn;
	}

	public Integer getMenuOrder() {
		return menuOrder;
	}

	public void setMenuOrder(Integer menuOrder) {
		this.menuOrder = menuOrder;
	}

	public String getMenuIcon() {
		return menuIcon;
	}

	public void setMenuIcon(String menuIcon) {
		this.menuIcon = menuIcon;
	}

	public List<MenuDetailOutput> getSubMenuList() {
		return subMenuList;
	}

	public void setSubMenuList(List<MenuDetailOutput> subMenuList) {
		this.subMenuList = subMenuList;
	}

	public String getMenuCode() {
		return menuCode;
	}

	public void setMenuCode(String menuCode) {
		this.menuCode = menuCode;
	}

	public Integer getMenuParentId() {
		return menuParentId;
	}

	public void setMenuParentId(Integer menuParentId) {
		this.menuParentId = menuParentId;
	}

	public Boolean getHasChildren() {
		return hasChildren;
	}

	public void setHasChildren(Boolean hasChildren) {
		this.hasChildren = hasChildren;
	}

	public List<AuthDetailOutput> getAuthList() {
		return authList;
	}

	public void setAuthList(List<AuthDetailOutput> authList) {
		this.authList = authList;
	}
	
	
}
