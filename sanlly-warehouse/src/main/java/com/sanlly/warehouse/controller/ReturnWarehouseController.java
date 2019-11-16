package com.sanlly.warehouse.controller;

import java.util.Date;

import com.sanlly.warehouse.models.output.stockout.StockoutOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.common.models.output.Result;
import com.sanlly.warehouse.models.input.returnwarehouse.AddReturnWarehouseInput;
import com.sanlly.warehouse.models.input.returnwarehouse.SearchReturnWarehouseInput;
import com.sanlly.warehouse.service.ReturnWarehouseService;

import io.swagger.annotations.Api;

/**
 * ClassName: ReturnWarehouseController
 * Description: 退库操作接口
 * date: 2019/9/19 19:33
 *
 * @author wannt
 * @since JDK 1.8
 */
@Api(tags = { "退库接口" })
@RestController
public class ReturnWarehouseController {

	@Autowired
	ReturnWarehouseService returnWarehouseService;

	/**
	 * 添加退库单
	 * 
	 * @param input
	 */
	@PostMapping("/returnWarehouses")
	public Result addReturnWarehouse(@RequestBody StockoutOutput input) {
		returnWarehouseService.addReturnWarehouse(input);
		return Result.Success();
	}

	/**
	 * 分页查询退库单列表
	 * @param no
	 * @param startDate
	 * @param endDate
	 * @param index
	 * @param size
	 * @return
	 */
	@GetMapping("/returnWarehouses")
	public Result getReturnWarehouses(
			@RequestParam(required = false) String no,
			@RequestParam(required = false) Date startDate,
			@RequestParam(required = false) Date endDate,
			@RequestParam(required = false) String sparePartsNo,
			@RequestParam(required = false) String containerNo,
			@RequestParam Integer index,
			@RequestParam Integer size) {
		SearchReturnWarehouseInput input = new SearchReturnWarehouseInput(index, size);
		input.setRetuenNo(no);
		input.setStartDate(startDate);
		input.setEndDate(endDate);
		input.setSparePartsNo(sparePartsNo);
		input.setContainerNo(containerNo);
		return Result.Success(returnWarehouseService.getReturnWarehouses(input));
	}

}
