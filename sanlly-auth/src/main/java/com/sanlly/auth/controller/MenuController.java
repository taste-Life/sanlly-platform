package com.sanlly.auth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.auth.models.input.auth.AddAuthInput;
import com.sanlly.auth.models.input.auth.EditAuthInput;
import com.sanlly.auth.models.input.menu.AddMenuInput;
import com.sanlly.auth.models.input.menu.EditMenuInput;
import com.sanlly.auth.models.input.menu.SearchMenuInput;
import com.sanlly.auth.service.MenuService;
import com.sanlly.common.models.output.Result;

/**
 * 菜单控制器
 * @author RexSheng
 * 2019年8月16日 上午9:35:38
 */
@RestController
public class MenuController {

	@Autowired
	private MenuService menuService;
	
	/**
	 * 菜单分页列表
	 * @param menuName
	 * @param index
	 * @param size
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/menus/page")
	public Result getMenuPagedList(@RequestParam(required = false) String menuName,Integer index,Integer size) {
		SearchMenuInput input=new SearchMenuInput();
		input.setMenuName(menuName);
		input.setPageIndex(index);
		input.setPageSize(size);
		return Result.Success(menuService.getMenuPagedList(input));
	}
	
	/**
	 * 菜单列表
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/menus")
	public Result getMenuList(SearchMenuInput input) {
		return Result.Success(menuService.getMenuList(input));
	}
	
	/**
	 * 获取菜单信息
	 * @param menuId
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/menus/{menuId}")
	public Result getMenu(@PathVariable("menuId") Integer menuId) {
		return Result.Success(menuService.getMenu(menuId));
	}
	
	/**
	 * 修改菜单
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/menus")
	public Result editMenu(@RequestBody EditMenuInput input) {
		menuService.editMenu(input);
		return Result.Success();
	}
	
	/**
	 * 新增菜单
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/menus")
	public Result addMenu(@RequestBody AddMenuInput input) {
		menuService.addMenu(input);
		return Result.Success();
	}
	
	/**
	 * 删除菜单
	 * @param menuIds
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@DeleteMapping("/menus/{menuIds}")
	public Result deleteMenu(@PathVariable("menuIds") Integer[] menuIds) {
		menuService.deleteMenu(menuIds);
		return Result.Success();
	}
	
	/**
	 * 获取菜单的权限
	 * @param menuId
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/menus/{menuId}/auth")
	public Result getMenuAuthList(@PathVariable("menuId") Integer menuId) {
		return Result.Success(menuService.getAuthList(menuId));
	}
	
	/**
	 * 获取菜单下的权限信息
	 * @param menuId
	 * @param authId
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/menus/{menuId}/auth/{authId}")
	public Result getMenuAuth(@PathVariable("menuId") Integer menuId,@PathVariable("authId") Integer authId) {
		return Result.Success(menuService.getAuth(authId));
	}
	
	/**
	 * 新增菜单权限
	 * @param menuId
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/menus/{menuId}/auth")
	public Result addMenuAuth(@PathVariable("menuId") Integer menuId,@RequestBody AddAuthInput input) {
		menuService.addAuth(input);
		return Result.Success();
	}
	
	/**
	 * 修改菜单权限
	 * @param menuId
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/menus/{menuId}/auth")
	public Result editMenuAuth(@PathVariable("menuId") Integer menuId,@RequestBody EditAuthInput input) {
		menuService.updateAuth(input);
		return Result.Success();
	}
	
	/**
	 * 删除菜单权限
	 * @param menuId
	 * @param authIds
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@DeleteMapping("/menus/{menuId}/auth/{authIds}")
	public Result deleteMenuAuth(@PathVariable("menuId") Integer menuId,@PathVariable("authIds") Integer[] authIds) {
		menuService.deleteAuth(authIds);
		return Result.Success();
	}
}
