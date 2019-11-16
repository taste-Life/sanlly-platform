package com.sanlly.warehouse.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.common.models.output.Result;
import com.sanlly.warehouse.models.input.takestock.SearchTakeStockInput;
import com.sanlly.warehouse.models.input.wareearlywarning.SearchWareSafeStockInput;
import com.sanlly.warehouse.service.WareTakeStockService;

import io.swagger.annotations.Api;

/**
 * 
* @Package com.sanlly.warehouse.controller 
* @Description: 库存盘点 
* @author jlx   
* @date 2019年10月10日 下午6:05:19 
* @version V1.0   
 */
@Api(tags = { "库存盘点API" })
@RestController
public class WareTakeStockController {

	@Autowired
	private WareTakeStockService wareTakeStockService;
	
	/**
	 * 库存盘点分页列表
	 * @param wareSafeStockInput
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping(value="/wareTakeStock")
	public Result getPageListSafeStock(@RequestParam(required=false) String sparePartsNo,
			@RequestParam(required=false)  String warehouse,
			@RequestParam(required=false)  String createTime,
			@RequestParam(required=false)  String warehouseType,
			@RequestParam(required=false)  String sparePartsName,
			@RequestParam(required=false)  String storageLocation,
			@RequestParam(required=false)  String company,
			@RequestParam(required=false)  String sparePartsCategories,
			@RequestParam(required=false)  Integer sparePartsNum,
			@RequestParam Integer index,@RequestParam Integer size){
		SearchTakeStockInput input = new SearchTakeStockInput(index,size);
		input.setSparePartsNo(sparePartsNo);
		input.setWarehouse(warehouse);
		input.setCompany(company);
		input.setCreateTime(createTime);
		input.setWarehouseType(warehouseType);
		input.setSparePartsName(sparePartsName);
		input.setStorageLocation(storageLocation);
		input.setSparePartsCategories(sparePartsCategories);
		input.setSparePartsNum(sparePartsNum);
		return Result.Success(wareTakeStockService.getWareTakeStockPagedList(input));
	}
}
