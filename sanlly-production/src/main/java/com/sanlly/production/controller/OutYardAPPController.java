package com.sanlly.production.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.common.models.output.Result;
import com.sanlly.production.models.input.app.outYard.OutYardInput;
import com.sanlly.production.service.app.OutYardAPPService;

import io.swagger.annotations.Api;

/**
 * 出厂接口
 * 
 * @Package com.sanlly.production.controller 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年11月7日 下午6:12:24 
 * @version V1.0   
 */
@RestController
@Api(tags = { "APP出厂接口" })
public class OutYardAPPController {

	@Autowired
	private OutYardAPPService outYardAPPService;

	/**
	 * 出厂
	 * 
	 * @Description: TODO
	 * @param photo
	 * @param prodCourseId
	 * @return Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/containerOut")
	public Result outYard(@RequestBody OutYardInput input) {
		outYardAPPService.outYard(input);
		return Result.Success();
	}

	/**
	 * 出厂列表
	 * 
	 * @Description: TODO
	 * @param containerNo
	 * @param index
	 * @param size
	 * @return Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/containerOuts")
	public Result getOutYardList(@RequestParam(required = false) String containerNo,
			@RequestParam(required = false) String outState, @RequestParam Integer index, @RequestParam Integer size) {
		return Result.Success(outYardAPPService.getOutYardList(containerNo, outState, index, size));
	}

	/**
	 * 获取
	 * 
	 * @Description: TODO
	 * @param containerNo
	 * @return Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/containerOut/list")
	public Result getOutYardContainerNOList(@RequestParam(required = false) String containerNo) {
		return Result.Success(outYardAPPService.getOutYardContainerNOList(containerNo));
	}

}
