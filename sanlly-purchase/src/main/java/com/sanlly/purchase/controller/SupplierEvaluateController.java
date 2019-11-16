package com.sanlly.purchase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.common.models.output.Result;
import com.sanlly.purchase.service.SupplierEvaluateService;

import io.swagger.annotations.Api;

/**
 * ClassName: SupplierEvaluateController
 * Description: 供应商评价api
 * date: 2019/10/21 11:47
 *
 * @author zhh
 */
@Api(tags= {"供应商评价API"})
@RestController
public class SupplierEvaluateController {

	@Autowired
	private SupplierEvaluateService evaluateService;
	
	/**
     * 评分考核项目：价格及交货及时性
     * @param deliveryNum 送货编号
     * @return
     */
	@SuppressWarnings("rawtypes")
	@PostMapping("/evaluates")
	public Result evaluatePriceAndTimely(@RequestParam(value="deliveryNum") String deliveryNum,@RequestParam(value="updateUser",required=false) Integer updateUser) {
		evaluateService.evaluatePriceAndTimely(deliveryNum, updateUser);
		return Result.Success();
	}
	
	/**
     * 评分考核项目：质量及服务水平
     * @param deliveryNum 送货编号
     * @param qualityScore 质量分
     * @param serviceScore 服务水平分
     * @return
     */
	@SuppressWarnings("rawtypes")
	@PutMapping("/evaluates")
	public Result evaluateQualityAndService(@RequestParam(value="deliveryNum") String deliveryNum,@RequestParam(value="qualityScore") Double qualityScore,@RequestParam(value="serviceScore") Double serviceScore,@RequestParam(value="updateUser",required=false) Integer updateUser) {
		evaluateService.evaluateQualityAndService(deliveryNum, qualityScore, serviceScore, updateUser);
		return Result.Success();
	}
}
