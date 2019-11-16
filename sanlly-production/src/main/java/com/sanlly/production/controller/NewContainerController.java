package com.sanlly.production.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.newContainer.NewContainerAddInput;
import com.sanlly.production.models.output.newContainer.NewContainerListOutput;
import com.sanlly.production.service.NewContainerService;

import io.swagger.annotations.Api;

/**
 * 新箱controller
 * @author zhangkai
 *
 */
@RestController
@Api(tags={"新箱API"})
@RequestMapping("/newContainer")
public class NewContainerController {

	@Autowired
	private NewContainerService newContainerService;
	
	/**
	 * 新增&更新
	 * @param input
	 */
	@PostMapping("/doAdd")
	public Result<Integer> add(@RequestBody NewContainerAddInput input) {
		return Result.Success(newContainerService.add(input));
	}
	
	/**
	 * 新箱列表
	 * @param beginTime
	 * @param endTime
	 * @param customerName
	 * @param orderNo
	 * @param state
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@GetMapping("/doList")
	public Result<PagedList<NewContainerListOutput>> list(
			@RequestParam(required = false, value="beginDate") String beginDate,
			@RequestParam(required = false, value="endDate") String endDate,
			@RequestParam(required = false, value="customerName") String customerName,
			@RequestParam(required = false, value="orderNo") String orderNo,
			@RequestParam(required = false, value="state") String state,
			@RequestParam(required = true, value="pageNum") Integer pageNum,
			@RequestParam(required = true, value="pageSize") Integer pageSize
			) {
		return Result.Success(newContainerService.list(beginDate, endDate, customerName, orderNo, state, pageNum, pageSize));
	}
	
	/**
	 * 根据订单号获取订单详情
	 * @param orderNo
	 * @return
	 */
	@GetMapping("/doGetDetail")
	public Result<NewContainerListOutput> getDetail(@RequestParam(required = true, value = "orderNo") String orderNo) {
		return Result.Success(newContainerService.getDetail(orderNo));
	}
	
	/**
	 * 删除订单
	 * @param orderIds
	 */
	@DeleteMapping("/doDelete")
	@SuppressWarnings("rawtypes")
	public Result delete(@RequestParam(required = true, value = "orderIds") Integer[] orderIds) {
		newContainerService.delete(orderIds);
		return Result.Success();
	}
	
	/**
	 * 提交审核
	 * @param orderIds
	 */
	@PutMapping("/doAuditSumbit")
	@SuppressWarnings("rawtypes")
	public Result auditSubmit(@RequestParam(required = true, value = "orderIds") Integer[] orderIds) {
		newContainerService.auditSumbit(orderIds);
		return Result.Success();
	}
	
	/**
	 * 检验完成
	 * @param detailIds
	 */
	@PutMapping("/doFinishCheck")
	@SuppressWarnings("rawtypes")
	public Result finishCheck(@RequestParam(required = true, value = "detailIds") Integer[] detailIds) {
		newContainerService.finishCheck(detailIds);
		return Result.Success();
	}
}
