package com.sanlly.warehouse.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.common.models.output.Result;
import com.sanlly.warehouse.models.input.surplusLosses.AddSLInput;
import com.sanlly.warehouse.models.input.surplusLosses.EditSLInput;
import com.sanlly.warehouse.models.input.surplusLosses.SearchSLInput;
import com.sanlly.warehouse.service.SurplusLossesService;

import io.swagger.annotations.Api;

/**
 * 盘盈盘亏api
 * 
 * @author zhh
 *
 */
@Api(tags = {"盘盈盘亏API"})
@RestController
public class SurplusLossesController {
	
	@Autowired
	private SurplusLossesService slService;

	/**
	 * 盘盈盘亏单分页列表
	 * 
	 * @param input
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/surplusLosses")
	public Result addSL(@RequestParam(required = false) Date startDate,@RequestParam(required = false) Date endDate,
			            @RequestParam(required = false) String yard,@RequestParam(required = false) String warehouse,
			            @RequestParam(required = false) String surplusLossesNo,@RequestParam(required = false) String sparePartsNo,
			            @RequestParam(required = false) String sparePartsName,@RequestParam(required = false) String billStatus,
			            @RequestParam String type,@RequestParam Integer index,@RequestParam Integer size) {
		SearchSLInput input = new SearchSLInput(index, size);
		input.setType(type);
		input.setStartDate(startDate);
		input.setEndDate(endDate);
		input.setYard(yard);
		input.setWarehouse(warehouse);
		input.setSurplusLossesNo(surplusLossesNo);
		input.setSparePartsNo(sparePartsNo);
		input.setSparePartsName(sparePartsName);
		input.setBillStatus(billStatus);
		return Result.Success(slService.getSLPageList(input));
	}
	
	/**
	 * 添加盘盈盘亏单
	 * 
	 * @param input
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/surplusLosses")
	public Result addSL(@RequestBody AddSLInput input) {
		slService.addSL(input);
		return Result.Success();
	}
	
	/**
	 * 修改盘盈盘亏单
	 * 
	 * @param input
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/surplusLosses")
	public Result editSL(@RequestBody EditSLInput input) {
		slService.editSL(input);
		return Result.Success();
	}
	
	/**
	 * 审核盘盈盘亏单
	 * 
	 * @param ids
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/surplusLosses/audit")
	public Result auditSL(@RequestParam Integer[] ids) {
		slService.auditSL(ids);
		return Result.Success();
	}
	
	/**
	 * 盘盈入库
	 * 
	 * @param ids
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/surplusLosses/stockIn")
	public Result stockIn(@RequestParam Integer[] ids) {
		slService.stockIn(ids);
		return Result.Success();
	}
	
	/**
	 * 盘亏出库
	 * 
	 * @param ids
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/surplusLosses/stockOut")
	public Result stockOut(@RequestParam Integer[] ids) {
		slService.stockOut(ids); 
		return Result.Success();
	}
}
