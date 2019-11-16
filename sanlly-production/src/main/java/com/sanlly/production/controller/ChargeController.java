package com.sanlly.production.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.input.app.charge.SignInput;
import com.sanlly.production.models.output.app.pay.ChargeAppOutput;
import com.sanlly.production.models.output.containerTesting.ChargeOutput;
import com.sanlly.production.service.ChargeService;

import io.swagger.annotations.Api;

/**
 * 收费记录Controller
 * @author zhangkai
 *
 */
@RestController
@Api(tags={"收费记录相关API"})
public class ChargeController {

	@Autowired
	private ChargeService chargeService;
	
	/**
	 * 收费记录列表
	 * @param containerNo 箱号
	 * @param paymentType 收款类型
	 * @param chargeType 付款方式
	 * @param index 页面
	 * @param size 条数
	 * @return
	 */
	@GetMapping("/chargeRecord/list")
	public Result<PagedList<ChargeOutput>> list(
			@RequestParam(required = false, value = "containerNo") String containerNo,
			@RequestParam(required = false, value = "paymentType") String paymentType,
			@RequestParam(required = false, value = "chargeType") String chargeType,
			@RequestParam(required = true, value = "index") Integer index,
			@RequestParam(required = true, value = "size") Integer size
			) {
		return Result.Success(chargeService.list(containerNo, paymentType, chargeType, index, size));
	}
	
	/**
	 * 获取缴费状态-回填发票信息二维码（APP端循环调用）
	 * @param chargeCode
	 * @return
	 */
	@GetMapping("/containers/chargeState")
	public Result<ChargeAppOutput> chargeState(@RequestParam(required = true, value = "chargeCode") String chargeCode) {
		return Result.Success(chargeService.chargeState(chargeCode));
	}
	
	/**
	 * 签字确认
	 * @param prodCourseId
	 * @param containerCategory
	 * @param signaturePic
	 * @return
	 */
	@PutMapping("/containers/signature")
	@SuppressWarnings("rawtypes")
	public Result sign(@RequestBody SignInput input) {
		chargeService.sign(input.getProdCourseId(), input.getContainerCategory(), input.getSignaturePic());
		return Result.Success();
	}
}
