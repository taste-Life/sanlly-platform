package com.sanlly.auth.models.input.menu;

import com.sanlly.common.models.input.PageInput;

/**
 * 搜索菜单输入类
 * @author RexSheng
 * 2019年8月16日 上午9:39:08
 */
public class SearchMenuInput extends PageInput{

	private String menuName;

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	
	
}
