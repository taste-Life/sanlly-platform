package com.sanlly.warehouse.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.common.models.output.Result;
import com.sanlly.warehouse.models.input.transfer.AddTransferInput;
import com.sanlly.warehouse.models.input.transfer.EditTransferInput;
import com.sanlly.warehouse.models.input.transfer.SearchTransferInput;
import com.sanlly.warehouse.service.TransferService;

import io.swagger.annotations.Api;

/**
 * 调拨 移动 下料API
 * 
 * @author lishzh
 *
 */
@Api(tags = { "调拨 移动 下料API" })
@RestController
public class TransferController {

	@Autowired
	private TransferService transferService;

	/**
	 * 添加调拨单
	 * 
	 * @param input
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/transfers")
	public Result addTransfer(@RequestBody AddTransferInput input) {
		transferService.addTransfer(input);
		return Result.Success();
	}

	/**
	 * 查询调拨单列表
	 * 
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/transfers")
	public Result getPageTransfers(@RequestParam(required = false) Date startDate,
			@RequestParam(required = false) Date endDate, @RequestParam(required = false) String no,
			@RequestParam(required = false) String outWarehouse,
			@RequestParam(required = false) String outWarehouseType, @RequestParam(required = false) String inWarehouse,
			@RequestParam(required = false) String inWarehouseType, @RequestParam(required = false) String billStatus,
			@RequestParam(required = false) String auditStatus, @RequestParam Integer index, @RequestParam Integer size,
			@RequestParam Integer category) {
		SearchTransferInput input = new SearchTransferInput(index, size);
		input.setStartDate(startDate);
		input.setEndDate(endDate);
		input.setNo(no);
		input.setOutWarehouse(outWarehouse);
		input.setOutWarehouseType(outWarehouseType);
		input.setInWarehouse(inWarehouse);
		input.setInWarehouseType(inWarehouseType);
		input.setAuditStatus(auditStatus);
		input.setBillStatus(billStatus);
		input.setCategory(category);
		return Result.Success(transferService.getPageTransfers(input));
	}

	/**
	 * 根据调拨单id获取调拨单详情
	 * 
	 * @param id
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/transfers/{transferId}")
	public Result getTransferById(@PathVariable(value = "transferId") Integer transferId) {
		return Result.Success(transferService.getTransferById(transferId));
	}

	/**
	 * 修改调拨单
	 * 
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/transfers")
	public Result editTransfer(@RequestBody EditTransferInput input) {
		transferService.editTransfer(input);
		return Result.Success();
	}

	/**
	 * 删除调拨单
	 * 
	 * @param input
	 */
	@SuppressWarnings("rawtypes")
	@DeleteMapping("/transfers")
	public Result deleteTransfer(@RequestParam List<Integer> ids) {
		transferService.deleteTransfer(ids);
		return Result.Success();
	}

	/**
	 * 调拨单审核
	 * 
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/transfers/audit")
	public Result transferAudit(@RequestBody List<Integer> ids) {
		transferService.transferAudit(ids);
		return Result.Success();
	}

	/**
	 * 调拨单驳回
	 * 
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/transfers/reject")
	public Result transferAudit(@RequestBody EditTransferInput input) {
		transferService.transferReject(input);
		return Result.Success();
	}

	/**
	 * 调拨单确认
	 * 
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/transfers/confirm")
	public Result transferConfirm(@RequestBody EditTransferInput input) {
		transferService.transferConfirm(input.getIds());
		return Result.Success();
	}

}
