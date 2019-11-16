package com.sanlly.production.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.common.models.output.Result;
import com.sanlly.production.models.input.app.foamoing.UpdateFoamingInput;
import com.sanlly.production.service.app.FoamingAppService;

import io.swagger.annotations.Api;

@RestController
@Api(tags = { "发泡App接口" })
public class FoamingAppController {

	@Autowired
	private FoamingAppService foamingService;

	/**
	 * 发泡列表
	 * 
	 * @Description: TODO
	 * @param containerNo
	 * @param index
	 * @param size
	 * @return Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/foamings")
	public Result foamingsPagedList(@RequestParam(required = false) String containerNo,
			@RequestParam(required = false) String foamingState, @RequestParam Integer index,
			@RequestParam Integer size) {
		return Result.Success(foamingService.getFoamingsPagedList(containerNo, foamingState, index, size));
	}

	/**
	 * 
	 * @Description: TODO
	 * @return Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/foamingSave")
	public Result updateFoaming(@RequestBody UpdateFoamingInput input) {
		foamingService.updateFoaming(input);
		return Result.Success();
	}

	/**
	 * 批量发泡
	 * 
	 * @Description: TODO
	 * @param prodCourseIdList
	 * @return Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/subFoaming")
	public Result subFoaming(@RequestParam String[] prodCourseIdList) {
		foamingService.subFoaming(prodCourseIdList);
		return Result.Success();
	}

	/**
	 * 单箱发泡
	 * 
	 * @Description: TODO
	 * @param input
	 * @return Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/subFoamingSingle")
	public Result subFoamingSingle(@RequestBody UpdateFoamingInput input) {
		foamingService.subFoamingSingle(input);
		return Result.Success();
	}

}
