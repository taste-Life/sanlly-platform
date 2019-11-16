package com.sanlly.auth.service;

import java.util.List;

import com.sanlly.auth.models.input.auth.AddAuthInput;
import com.sanlly.auth.models.input.auth.EditAuthInput;
import com.sanlly.auth.models.input.menu.AddMenuInput;
import com.sanlly.auth.models.input.menu.EditMenuInput;
import com.sanlly.auth.models.input.menu.SearchMenuInput;
import com.sanlly.common.models.output.auth.AuthDetailOutput;
import com.sanlly.common.models.output.menu.MenuDetailOutput;
import com.sanlly.common.models.output.pagination.PagedList;

/**
 * 菜单接口
 * @author RexSheng
 * 2019年7月30日 下午7:07:58
 */
public interface MenuService {
	
	/**
	 * 获取菜单列表
	 * @param input
	 * @return
	 */
	List<MenuDetailOutput> getMenuList(SearchMenuInput input);

	/**
	 * 获取菜单分页列表
	 * @param input
	 * @return
	 */
	PagedList<MenuDetailOutput> getMenuPagedList(SearchMenuInput input);
	
	/**
	 * 新增菜单
	 * @param input
	 */
	void addMenu(AddMenuInput input);
	
	/**
	 * 修改菜单
	 * @param input
	 */
	void editMenu(EditMenuInput input);
	
	/**
	 * 获取菜单信息
	 * @param menuId
	 * @return
	 */
	MenuDetailOutput getMenu(Integer menuId);
	
	/**
	 * 删除菜单
	 * @param menuIds
	 */
	void deleteMenu(Integer[] menuIds);
	
	/**
	 * 根据菜单获取权限列表
	 * @param menuId
	 * @return
	 */
	List<AuthDetailOutput> getAuthList(Integer menuId);
	
	/**
	 * 获取某个权限信息
	 * @param authId
	 * @return
	 */
	AuthDetailOutput getAuth(Integer authId);
	
	/**
	 * 新增权限
	 * @param input
	 */
	void addAuth(AddAuthInput input);
	
	/**
	 * 修改权限
	 * @param input
	 */
	void updateAuth(EditAuthInput input);
	
	/**
	 * 删除权限
	 * @param authIds
	 */
	void deleteAuth(Integer[] authIds);
}
