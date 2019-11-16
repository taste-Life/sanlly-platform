package com.sanlly.production.controller;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sanlly.common.constants.PayConstants;
import com.sanlly.common.models.output.Result;
import com.sanlly.production.entity.Charge;
import com.sanlly.production.service.ChargeService;
import com.sanlly.production.utils.FuncUtil;

import io.swagger.annotations.Api;

/**
 * 支付Controller
 * @author zhangkai
 *
 */
@Controller
@Api(tags = { "支付相关API" })
public class PayController {
	
	@Autowired
	private ChargeService chargeService;

	@SuppressWarnings("rawtypes")
	@PostMapping("/pay/save")
	public void save(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("支付回调开始!!!!!!!!!!!!!!!!!!!!!!!");
		TreeMap<String, String> params = new TreeMap<String, String>();
		Map reqMap = request.getParameterMap();
		for (Object key : reqMap.keySet()) {
			params.put(key.toString(), ((String[])reqMap.get(key))[0]);
		}
		try {
			boolean isSign = FuncUtil.validSign(params, PayConstants.KEY);
			System.out.println("验签结果："+isSign);
			// 成功回调业务逻辑
			// 交易结果码
			String trxstatus = params.get("trxstatus");
			// 商户订单号（oid）
			String bizseq = params.get("bizseq");
			// 通联交易流水号
			String trxid = params.get("trxid");
			chargeService.updateCharge(trxstatus, bizseq, trxid);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			// 收到通知，返回success
			response.getOutputStream().write("success".getBytes());
			response.flushBuffer();
		}
	}
	
	/**
	 * 查询交易结果
	 * @param chargeCode 交易单号（唯一）
	 * @return
	 */
	@GetMapping("/pay/queryPayRes")
	@ResponseBody
	public Result<String> queryPayRes(String chargeCode) {
		return Result.Success(chargeService.queryPayRes(chargeCode));
	}
	
	/**
	 * 支付后更新退款信息
	 * @param charge
	 */
	@SuppressWarnings("rawtypes")
	@ResponseBody
	@PutMapping("/pay/updatePayBackInfo")
	public Result updatePayBackInfo(@RequestBody Charge charge) {
		chargeService.updatePayBackInfo(charge);
		return Result.Success();
	}
}
