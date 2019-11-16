package com.sanlly.production.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.app.newContainer.OrderDetailSubInput;
import com.sanlly.production.models.output.app.newContainer.NewContainerDetailListOutput;
import com.sanlly.production.models.output.app.newContainer.NewContainerListOutput;
import com.sanlly.production.service.NewContainerAppService;

import io.swagger.annotations.Api;

/**
 * APP端新箱Controller
 * @author zhangkai
 *
 */
@RestController
@Api(tags = {"新箱相关API"})
public class NewContainerAppController {

	@Autowired
	private NewContainerAppService newContainerAppService;
	
	/**
	 * 新箱订单列表
	 * @param orderNo 订单号
	 * @param status 审核状态
	 * @param pageNum 页码
	 * @param pageSize 条数
	 * @return
	 */
	@GetMapping("/newContainer/orders")
	public Result<PagedList<NewContainerListOutput>> list(
			@RequestParam(required = false, value = "orderNo") String orderNo,
			@RequestParam(required = false, value = "status") String status,
			@RequestParam(required = true, value = "pageNum") Integer pageNum,
			@RequestParam(required = true, value = "pageSize") Integer pageSize
			) {
		return Result.Success(newContainerAppService.list(orderNo, status, pageNum, pageSize));
	}
	
	/**
	 * 新箱订单明细列表
	 * @param order
	 * @param containerNo
	 * @param status
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@GetMapping("/newContainer/orderDetails")
	public Result<PagedList<NewContainerDetailListOutput>> detailList(
			@RequestParam(required = true, value = "orderNo") String orderNo, 
			@RequestParam(required = false, value = "containerNo") String containerNo, 
			@RequestParam(required = false, value = "status") String status, 
			@RequestParam(required = true, value = "pageNum") Integer pageNum, 
			@RequestParam(required = true, value = "pageSize") Integer pageSize) {
		return Result.Success(newContainerAppService.detailList(orderNo, containerNo, status, pageNum, pageSize));
	}
	
	/**
	 * 批量确认订单明细
	 * @param orderDetailIds
	 */
	@PutMapping("/newContainer/orderDetailConfirm")
	@SuppressWarnings("rawtypes")
	public Result orderDetailConfirm(String orderDetailIds) {
		newContainerAppService.orderDetailConfirm(orderDetailIds);
		return Result.Success();
	}
	
	/**
	 * 新增修改新箱订单明细
	 * @param input
	 */
	@PutMapping("/newContainer/orderDetailsSub")
	@SuppressWarnings("rawtypes")
	public Result orderDetailsSub(@RequestBody OrderDetailSubInput input) {
		newContainerAppService.orderDetailsSub(input);
		return Result.Success();
	}
}
