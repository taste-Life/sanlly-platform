package com.sanlly.production.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.allot.AllotAddInput;
import com.sanlly.production.models.input.allot.AllotUpdateInput;
import com.sanlly.production.models.output.allot.AllotOutput;
import com.sanlly.production.service.AllotService;

import io.swagger.annotations.Api;

/**
 * 坏箱调拨controller
 * @author zhangkai
 *
 */
@RestController
@Api(tags={"坏箱调拨API"})
@RequestMapping("/allot")
public class AllotController {

	@Autowired
	private AllotService allotService;
	
	/**
	 * 列表
	 * @param containerNo 箱号
	 * @param exitYard 调出场站
	 * @param entryYard 调入场站
	 * @param state 调拨状态
	 * @param pageNum 页码
	 * @param pageSize 条数
	 * @return
	 */
	@GetMapping("/list")
	public Result<PagedList<AllotOutput>> list(
			@RequestParam(value = "containerNo", required = false) String containerNo,
			@RequestParam(value = "exitYard", required = false) String exitYard,
			@RequestParam(value = "entryYard", required = false) String entryYard,
			@RequestParam(value = "state", required = false) String state,
			@RequestParam(value = "pageNum", required = true) Integer pageNum,
			@RequestParam(value = "pageSize", required = true) Integer pageSize
			) {
		return Result.Success(allotService.list(containerNo, exitYard, entryYard, state, pageNum, pageSize));
	}
	
	/**
	 * 新增
	 * @param inputs
	 */
	@PostMapping("/add")
	@SuppressWarnings("rawtypes")
	public Result add(@RequestBody List<AllotAddInput> inputs) {
		allotService.add(inputs);
		return Result.Success();
	}
	
	/**
	 * 编辑
	 * @param input
	 */
	@PutMapping("/update")
	@SuppressWarnings("rawtypes")
	public Result update(@RequestBody AllotUpdateInput input) {
		allotService.update(input);
		return Result.Success();
	}
	
	/**
	 * 确认调入
	 * @param ids
	 */
	@PutMapping("/inConfirm")
	@SuppressWarnings("rawtypes")
	public Result inConfirm(@RequestParam(value = "ids", required = true) Integer[] ids) {
		allotService.inConfirm(ids);
		return Result.Success();
	}
	
	/**
	 * 申请调回
	 * @param ids 坏箱调拨id集合
	 * @param fleet 车队
	 * @param plateNo 车牌号
	 * @param cost 费用
	 * @param reason 调回原因
	 */
	@PostMapping("/applyBack")
	@SuppressWarnings("rawtypes")
	public Result applyBack(
			@RequestParam(value = "ids", required = true) Integer[] ids, 
			@RequestParam(value = "fleet", required = true) String fleet, 
			@RequestParam(value = "plateNo", required = true) String plateNo, 
			@RequestParam(value = "cost", required = true) String cost, 
			@RequestParam(value = "reason", required = true) String reason) {
		allotService.applyBack(ids, fleet, plateNo, cost, reason);
		return Result.Success();
	}
	
	/**
	 * 确认调回
	 * @param ids
	 */
	@PutMapping("/backConfirm")
	@SuppressWarnings("rawtypes")
	public Result backConfirm(@RequestParam(value = "ids", required = true) Integer[] ids) {
		allotService.backConfirm(ids);
		return Result.Success();
	}
	
}
