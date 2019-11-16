package com.sanlly.production.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.pagination.PagedList;
import com.sanlly.production.models.output.heavyContainer.HeavyContainerOutput;
import com.sanlly.production.service.HeavyContainerService;

import io.swagger.annotations.Api;

/**
 * 重箱监管controller（web端）
 * @author zhangkai
 *
 */
@Api(tags={"重箱监管API"})
@RestController
@RequestMapping("/heavyContainer")
public class HeavyContainerController {
	
	@Autowired
	private HeavyContainerService heavyContainerService;

	/**
	 * 列表
	 * @param vesVos 船名航次
	 * @param state 状态
	 * @param pageNum 页码
	 * @param pageSize 条数
	 * @return
	 */
	@GetMapping("/list")
	public Result<PagedList<HeavyContainerOutput>> list(
			@RequestParam(required = false, value = "vesVos") String vesVos,
			@RequestParam(required = false, value = "state") String state,
			@RequestParam(required = true, value = "pageNum") Integer pageNum,
			@RequestParam(required = true, value = "pageSize") Integer pageSize
			) {
		return Result.Success(heavyContainerService.list(vesVos, state, pageNum, pageSize));
	}
	
	/**
	 * 装船
	 * @param ids
	 * @return
	 */
	@PutMapping("/doSetShip")
	@SuppressWarnings("rawtypes")
	public Result doSetShip(@RequestParam(required = true, value = "ids") Integer[] ids) {
		heavyContainerService.doSetShip(ids);
		return Result.Success();
	}
	
	/**
	 * 转船
	 * @param ids
	 * @param vesVos
	 * @return
	 */
	@PutMapping("/doChangeShip")
	@SuppressWarnings("rawtypes")
	public Result doChangeShip(
			@RequestParam(required = true, value = "ids") Integer[] ids,
			@RequestParam(required = true, value = "vesVos") String vesVos) {
		heavyContainerService.doChangeShip(ids, vesVos);
		return Result.Success();
	}
	
	/**
	 * 退载
	 * @param ids
	 * @return
	 */
	@PutMapping("/doBackLoad")
	@SuppressWarnings("rawtypes")
	public Result doBackLoad(@RequestParam(required = true, value = "ids") Integer[] ids) {
		heavyContainerService.doBackLoad(ids);
		return Result.Success();
	}
}
