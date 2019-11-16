package com.sanlly.auth.models.input.menu;

/**
 * 新增菜单输入类
 * @author RexSheng
 * 2019年8月16日 上午9:37:32
 */
public class AddMenuInput {
	/**
	 * 菜单编号
	 */
	private String menuCode;
	
	/**
	 * 菜单名称
	 */
	private String menuName;
	
	/**
	 * 英文名称
	 */
	private String menuNameEn;
	
	/**
	 * 图标
	 */
	private String menuIcon;
	
	/**
	 * 排序序号
	 */
	private Integer menuOrder;
	
	/**
	 * 父级菜单id
	 */
	private Integer menuParentId;
	
	/**
	 * 列表权限
	 */
	private Integer list;
	
	/**
	 * 新增权限
	 */
	private Integer add;
	
	/**
	 * 修改权限
	 */
	private Integer edit;
	
	/**
	 * 删除权限
	 */
	private Integer del;

	public String getMenuCode() {
		return menuCode;
	}

	public void setMenuCode(String menuCode) {
		this.menuCode = menuCode;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public Integer getMenuOrder() {
		return menuOrder;
	}

	public void setMenuOrder(Integer menuOrder) {
		this.menuOrder = menuOrder;
	}

	public Integer getMenuParentId() {
		return menuParentId;
	}

	public void setMenuParentId(Integer menuParentId) {
		this.menuParentId = menuParentId;
	}

	public String getMenuNameEn() {
		return menuNameEn;
	}

	public void setMenuNameEn(String menuNameEn) {
		this.menuNameEn = menuNameEn;
	}

	public String getMenuIcon() {
		return menuIcon;
	}

	public void setMenuIcon(String menuIcon) {
		this.menuIcon = menuIcon;
	}

	public Integer getList() {
		return list;
	}

	public void setList(Integer list) {
		this.list = list;
	}

	public Integer getAdd() {
		return add;
	}

	public void setAdd(Integer add) {
		this.add = add;
	}

	public Integer getEdit() {
		return edit;
	}

	public void setEdit(Integer edit) {
		this.edit = edit;
	}

	public Integer getDel() {
		return del;
	}

	public void setDel(Integer del) {
		this.del = del;
	}
	
	
}
