package com.sanlly.warehouse.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.common.models.input.base.BaseSearchInput;
import com.sanlly.common.models.output.Result;
import com.sanlly.warehouse.models.input.warehouse.AddWareWarehouseTypeRelationInput;
import com.sanlly.warehouse.models.input.warehouse.AddWarehouseInput;
import com.sanlly.warehouse.models.input.warehouse.EditWarehouseInput;
import com.sanlly.warehouse.models.input.warehouse.SearchWarehouseInput;
import com.sanlly.warehouse.models.input.warehouse.AddWarehouseYardRelationInput;
import com.sanlly.warehouse.service.WarehouseService;

import io.swagger.annotations.Api;

/**
 * ClassName: WarehouseController
 * Description: 仓库信息API
 * date: 2019/7/25 16:34
 *
 * @author zhh
 * 
 */
@Api(tags= {"仓库信息API"})
@RestController
public class WarehouseController {
	
	@Autowired
    private WarehouseService warehouseService;
	
	/**
     * 仓库分页列表查询
     * @param warehouseName 要搜索的仓库名称   
     * @param warehouseAddr 要搜索的仓库地址
     * @param company 要搜索的公司key
     * @param index 页码
     * @param size 分页大小
     * @return
     */
	@SuppressWarnings("rawtypes")
	@GetMapping("/warehouses/pages")
    public Result warehousePagedList(@RequestParam(required=false) String warehouseName,@RequestParam(required=false) String warehouseAddr,@RequestParam(required=false) String company, @RequestParam Integer index, @RequestParam Integer size){
		SearchWarehouseInput searchWarehouseInput = new SearchWarehouseInput(index, size);
		searchWarehouseInput.setWarehouseName(warehouseName);
		searchWarehouseInput.setWarehouseAddr(warehouseAddr);
		searchWarehouseInput.setCompany(company);
		return Result.Success(warehouseService.getWarehousePageList(searchWarehouseInput));
	}
	
	/**
     * 获取全部仓库信息
     * 
     * @return
     */
	@SuppressWarnings("rawtypes")
	@GetMapping("/warehouses")
	public Result warehouseList() {
		return Result.Success(warehouseService.getWarehouseList());
	}
	
	/**
     * 根据场站key获取全部仓库信息及对应仓库类型信息
     * 
     * @return
     */
	@SuppressWarnings("rawtypes")
	@GetMapping("/warehouses/yards/{yard}")
	public Result getWarehouseByYard(@PathVariable(value="yard") String yard) {
		AddWarehouseYardRelationInput input = new AddWarehouseYardRelationInput();
		input.setYard(yard);
		return Result.Success(warehouseService.getWarehouseByYard(input));
	}
	
	/**
     * 根据场站key以及单据类型名称获取全部仓库信息及对应仓库类型信息
     * 
     * @return
     */
	@SuppressWarnings("rawtypes")
	@GetMapping("/warehouses/yards")
	public Result getWarehouseInfoByYard(@RequestParam String yard,@RequestParam(required=false) String billName) {
		AddWarehouseYardRelationInput input = new AddWarehouseYardRelationInput();
		input.setYard(yard);
		input.setBillName(billName);
		return Result.Success(warehouseService.getWarehouseByYard(input));
	}
	
	
	/**
     * 获取全部公司信息
     * 
     * @return
     */
	@SuppressWarnings("rawtypes")
	@GetMapping("/warehouses/company")
	public Result getCompanyList(BaseSearchInput input) {
		return Result.Success(warehouseService.getProdCompanyList(input));
	}
	
	/**
     * 根据公司key查询同一公司下的仓库信息
     * 
     * @return
     */
	@SuppressWarnings("rawtypes")
	@GetMapping("/warehouses/company/{company}")
	public Result getWarehouseListByCompany(@PathVariable(value="company") String company) {
		EditWarehouseInput input = new EditWarehouseInput();
		input.setCompany(company);
		return Result.Success(warehouseService.getWarehouseListByCompany(input));
	}
	
	/**
	 * 添加仓库信息
	 * 
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/warehouses")
	public Result addWarehouse(@RequestBody AddWarehouseInput input) {
		warehouseService.addWarehouse(input);
		return Result.Success();
	}
	
	/**
	 * 修改仓库信息
	 * 
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/warehouses")
	public Result editWarehouse(@RequestBody EditWarehouseInput input) {
		warehouseService.editWarehouse(input);
		return Result.Success();
	}
	
	/**
	 * 批量删除仓库信息
	 * 
	 * @param key
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@DeleteMapping("/warehouses")
	public Result deleteWarehouse(@RequestParam String[] keys) {
		warehouseService.deleteWarehouse(keys);
		return Result.Success();
	}
	
	/**
	 * 根据key获取仓库信息
	 * 
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/warehouses/{key}")
	public Result getWarehouseDetail(@PathVariable String key) {
		EditWarehouseInput input = new EditWarehouseInput();
		input.setKey(key);
		return Result.Success(warehouseService.getWarehouseDetail(input));
	}
	
	/**
     * 获得仓库同一公司下场站信息
     * 
     * @param company 公司key
     * @return
     */
	@SuppressWarnings("rawtypes")
	@GetMapping("/warehouses/yard/{company}")
	public Result getWarehouseYardList(@PathVariable String company) {
		EditWarehouseInput input = new EditWarehouseInput();
		input.setCompany(company);
		return Result.Success(warehouseService.getWarehouseYardList(input));
	}
	
	/**
     * 根据仓库key获得对应场站信息
     * 
     * @return
     */
	
	@SuppressWarnings("rawtypes")
	@GetMapping("/warehouses/yard")
	public Result getYardListByWarehouse(@RequestParam String warehouse,@RequestParam String company) {
		EditWarehouseInput input = new EditWarehouseInput();
		input.setCompany(company);
		input.setKey(warehouse);
		return Result.Success(warehouseService.getYardListByWarehouse(input));
	}
	/**
     * 为仓库分配场站
     * 
     * @param input
     * @return
     */
	@SuppressWarnings("rawtypes")
	@PostMapping("/warehouses/yard")
	public Result addWarehouseYardRelation(@RequestBody AddWarehouseYardRelationInput input) {
		warehouseService.addWarehouseYardRelation(input);
		return Result.Success();
		
	}
	
	/**
     * 根据仓库key获得对应仓库类型信息
     * 
     * @return
     */
	@SuppressWarnings("rawtypes")
	@GetMapping("/warehouses/warehouseType")
	public Result getWarehouseTypeListByWarehouse(@RequestParam String warehouse) {
		EditWarehouseInput input = new EditWarehouseInput();
		input.setKey(warehouse);
		return Result.Success(warehouseService.getWarehouseTypeListByWarehouse(input));
	}
	
	/**
     * 设置仓库类型
     * 
     * @param input
     * @return
     */
	@SuppressWarnings("rawtypes")
	@PostMapping("/warehouses/warehouseType")
	public Result addWareWarehouseTypeRelation(@RequestBody AddWareWarehouseTypeRelationInput input) {
		warehouseService.addWareWarehouseTypeRelation(input);
		return Result.Success();
		
	}
	/**
     * 锁定指定公司下的仓库
     * 
     * @param company
     * @return
     */
	@SuppressWarnings("rawtypes")
	@PutMapping("/warehouses/lock")
	public Result lockWarehouse(@RequestParam(required=true) String company,@RequestParam(required=false) Date lockTime) {
		warehouseService.lockWarehouse(company);
		return Result.Success();
		
	}
	/**
     * 解锁指定公司下的仓库库存 
     * 
     * @param company
     * @return
     */
	@SuppressWarnings("rawtypes")
	@PutMapping("/warehouses/unLock")
	public Result unLockWarehouse(@RequestParam(required=true) String company) {
		warehouseService.unLockWarehouse(company);
		return Result.Success();
		
	}
	/**
     * 取得指定公司的锁库状态 
     * 
     * @param company
     * @return
     */
	@SuppressWarnings("rawtypes")
	@GetMapping("/warehouses/lockStatus")
	public Result getLockStatus(@RequestParam(required=true) String company) {
		
		return Result.Success(warehouseService.getLockStatus(company));
		
	}
	
	/**
     * 获得场站列表信息
     * 
     * @param company 公司key
     * @param yardName 场站名称
     * @return
     */
	@SuppressWarnings("rawtypes")
	@GetMapping("/warehouses/yardlist")
	public Result getWarehouseYardList(@RequestParam String company,@RequestParam(required = false) String yardName) {
		return Result.Success(warehouseService.getYardList(company, yardName));
	}
	
	/**
     * 给场站设置默认仓库
     * 
     * @param yard 场站id
     * @param defaultWarehouse 仓库key
     * @return
     */
	@SuppressWarnings("rawtypes")
	@PostMapping("/warehouses/yardlist")
	public Result setDefaultWarehouse(@RequestParam Integer yard,@RequestParam String defaultWarehouse) {
		warehouseService.setDefaultWarehouse(yard,defaultWarehouse);
		return Result.Success();
	}
	
}
