package com.sanlly.production.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.common.models.output.Result;
import com.sanlly.production.models.input.foaming.SearchFoamingInput;
import com.sanlly.production.service.FoamingService;

import io.swagger.annotations.Api;

/**
 * 发泡
 * 
 * @Package com.sanlly.production.controller 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年9月3日 下午2:53:43 
 * @version V1.0   
 */
@RestController
@Api(tags = { "发泡接口" })
public class FoamingController {

	@Autowired
	private FoamingService foamingService;

	/**
	 * 发泡新增
	 * 
	 * @Description: TODO
	 * @param courseId
	 * @return Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/addFoaming")
	public Result addFoaming(@RequestParam String courseId) {
		foamingService.addFoaming(courseId);
		return Result.Success();
	}

	/**
	 * 发泡列表查询
	 * 
	 * @Description: TODO
	 * @param containerUser
	 * @param state
	 * @param index
	 * @param size
	 * @return Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/foaming")
	public Result foamingPagedList(@RequestParam(required = false) String containerNo,
			@RequestParam(required = false) String state, @RequestParam Integer index, @RequestParam Integer size) {
		SearchFoamingInput input = new SearchFoamingInput(index, size);
		input.setContainerNo(containerNo);
		input.setState(state);
		return Result.Success(foamingService.getFoamingPagedList(input));
	}

	/**
	 * 发泡完工
	 * 
	 * @Description: TODO
	 * @param listIds
	 * @return Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/foaming/finish")
	public Result finishFoaming(@RequestParam Integer[] listIds) {
		foamingService.finishFoaming(listIds);
		return Result.Success();
	}
	
	/**
	 * 上传发泡图片
	* @Description: TODO 
	* @param foamingId
	* @param photo
	* @return Result
	* @throws 
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/foaming/upload")
	public Result finishFoaming(Integer foamingId, String photo) {
		foamingService.uploadFoaming(foamingId, photo);
		return Result.Success();
	}

}
