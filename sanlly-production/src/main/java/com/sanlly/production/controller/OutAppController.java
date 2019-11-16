package com.sanlly.production.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.common.models.output.Result;
import com.sanlly.production.models.input.app.out.MoveSearchInput;
import com.sanlly.production.models.input.app.out.OutSearchInput;
import com.sanlly.production.models.input.app.out.PtiOkSearchInput;
import com.sanlly.production.service.app.OutAppService;

/**
 * 出箱操作
 * @author RexSheng
 * 2019年8月27日 下午4:36:27
 */
@RestController
public class OutAppController {

	@Autowired
	private OutAppService service;
	
	/**
	 * 出箱列表
	 * @param zone
	 * @param containerNo
	 * @param index
	 * @param size
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/outs")
	public Result outs(@RequestParam(value="zone",required = false) String zone,
			@RequestParam(value="containerNo",required = false) String containerNo,
			@RequestParam(value="index",required = true) Integer index,
			@RequestParam(value="size",required = true) Integer size) {
		OutSearchInput input=new OutSearchInput();
		input.setContainerNo(containerNo);
		input.setZone(zone);
		input.setPageIndex(index);
		input.setPageSize(size);
		return Result.Success(service.getOutPagedList(input));
	}
	
	/**
	 * 确认PTI
	 * @param prodCourseIds
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/PTIOK")
	public Result ptiOkConfirm(String[] prodCourseIdList) {
		service.ptiOkConfirm(prodCourseIdList);
		return Result.Success();
	}
	
	/**
	 * 取消PTIok
	 * @param prodCourseIds
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/cancelPTIok")
	public Result ptiNotOkConfirm(String[] prodCourseIdList) {
		service.ptiNotOkConfirm(prodCourseIdList);
		return Result.Success();
	}
	
	/**
	 * 出箱
	 * @param prodCourseIds
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/outLeave")
	public Result outLeave(String[] prodCourseIdList) {
		service.outLeave(prodCourseIdList);
		return Result.Success();
	}
	
	/**
	 * 原移
	 * @param prodCourseIds
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/outMove")
	public Result move(String[] prodCourseIdList) {
		service.move(prodCourseIdList);
		return Result.Success();
	}
	
	/**
	 * 取消原移
	 * @param prodCourseIds
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/cancelMove")
	public Result cancelMove(String[] prodCourseIdList) {
		service.cancelMove(prodCourseIdList);
		return Result.Success();
	}
	
	/**
	 * 添加备注
	 * @param prodCourseIds
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/outRemarks")
	public Result outRemarks(String[] prodCourseIdList,String remarks) {
		service.outRemarks(prodCourseIdList,remarks);
		return Result.Success();
	}
	
	/**
	 * 原移箱列表
	 * @param zone
	 * @param containerNo
	 * @param index
	 * @param size
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/moves")
	public Result moves(
			@RequestParam(value="containerNo",required = false) String containerNo,
			@RequestParam(value="index",required = true) Integer index,
			@RequestParam(value="size",required = true) Integer size) {
		MoveSearchInput input=new MoveSearchInput();
		input.setContainerNo(containerNo);
		input.setPageIndex(index);
		input.setPageSize(size);
		return Result.Success(service.getMoveOutPagedList(input));
	}
	
	/**
	 * 已确认PTIok列表
	 * @param zone
	 * @param containerNo
	 * @param index
	 * @param size
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/ptioks")
	public Result getPtiOks(
			@RequestParam(value="containerNo",required = false) String containerNo,
			@RequestParam(value="index",required = true) Integer index,
			@RequestParam(value="size",required = true) Integer size) {
		PtiOkSearchInput input=new PtiOkSearchInput();
		input.setContainerNo(containerNo);
		input.setPageIndex(index);
		input.setPageSize(size);
		return Result.Success(service.getPtiOks(input));
	}
}
