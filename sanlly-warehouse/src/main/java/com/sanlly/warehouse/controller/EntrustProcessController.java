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
import com.sanlly.warehouse.models.input.entrustprocess.EntrustProcessInput;
import com.sanlly.warehouse.models.input.entrustprocess.SearchEntrustProcessInput;
import com.sanlly.warehouse.service.EntrustProcessService;

/**
 * 委托加工API
 * 
 * @author lishzh
 *
 */
@RestController
public class EntrustProcessController {

	@Autowired
	private EntrustProcessService entrustProcessService;

	/**
	 * 添加委托加工单
	 *
	 * @author lishzh
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/entrustProcess")
	public Result addEntrustProcess(@RequestBody EntrustProcessInput input) {
		entrustProcessService.addEntrustProcess(input);
		return Result.Success();
	}

	/**
	 * 修改委托加工单
	 *
	 * @author lishzh
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/entrustProcess")
	public Result editEntrustProcess(@RequestBody EntrustProcessInput input) {
		entrustProcessService.editEntrustProcess(input);
		return Result.Success();
	}

	/**
	 * 删除委托加单
	 *
	 * @author lishzh
	 * @param ids
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@DeleteMapping("/entrustProcess")
	public Result deleteEntrustProcess(@RequestParam List<Integer> ids) {
		entrustProcessService.deleteEntrustProcess(ids);
		return Result.Success();
	}

	/**
	 * 获取委托加工单列表
	 *
	 * @author lishzh
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/entrustProcess")
	public Result getEntrustProcess(@RequestParam(required = false) Date startDate,
			@RequestParam(required = false) Date endDate, @RequestParam Integer index, @RequestParam Integer size) {
		SearchEntrustProcessInput input = new SearchEntrustProcessInput(index, size);
		input.setStartDate(startDate);
		input.setEndDate(endDate);
		return Result.Success(entrustProcessService.getEntrustProcess(input));
	}

	/**
	 * 根据id获取委托加工单
	 *
	 * @author lishzh
	 * @param id
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/entrustProcess/{id}")
	public Result getEntrustProcessById(@PathVariable(value = "id") Integer id) {
		return Result.Success(entrustProcessService.getEntrustProcessById(id));
	}

	/**
	 * 出库审核
	 *
	 * @author lishzh
	 * @param ids
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/entrustProcess/audit")
	public Result audit(@RequestBody List<Integer> ids) {
		entrustProcessService.audit(ids);
		return Result.Success();
	}

	/**
	 * 出库驳回
	 *
	 * @author lishzh
	 * @param input
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/entrustProcess/reject")
	public Result reject(@RequestBody EntrustProcessInput input) {
		entrustProcessService.reject(input);
		return Result.Success();
	}

	/**
	 * 加工成品入库
	 *
	 * @author lishzh
	 * @param id
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/entrustProcess/productIn")
	public Result productIn(@RequestBody EntrustProcessInput input) {
		entrustProcessService.productIn(input.getWareEntrustedProcessingId());
		return Result.Success();
	}

}
