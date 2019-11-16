package com.sanlly.production.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.common.models.output.Result;
import com.sanlly.production.models.input.xx.XxSearchInput;
import com.sanlly.production.service.XxService;

/**
 * xx箱相关接口
 * @author RexSheng
 * 2019年9月2日 上午10:52:03
 */
@RestController
public class XxController {
	
	@Autowired
	private XxService service;

	/**
	 * 获取xx箱分页列表
	 * @param containerNo
	 * @param containerUser
	 * @param xxState
	 * @param index
	 * @param size
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/xx/list")
	public Result getXxPagedList(@RequestParam(value="containerNo",required = false) String containerNo,
			@RequestParam(value="containerUser",required = false) String containerUser,
			@RequestParam(value="xxState",required = false) String xxState,
			@RequestParam(value="index",required = true) Integer index,
			@RequestParam(value="size",required = true) Integer size) {
		XxSearchInput input=new XxSearchInput();
		input.setContainerNo(containerNo);
		input.setContainerUser(containerUser);
		input.setXxState(xxState);
		input.setPageIndex(index);
		input.setPageSize(size);
		return Result.Success(service.getXxPagedList(input));
	}
	
	/**
	 * 设置xx箱OK
	 * @param courseIds
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/xx/ok")
	public Result xxOkConfirm(String[] courseIds) {
		service.confirmOk(courseIds);
		return Result.Success();
	}
	
	/**
	 * pti ok确认列表
	 * @param containerNo 箱号
	 * @param containerUser 用箱人
	 * @param xxState xx状态
	 * @param index 页码
	 * @param size 页大小
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/pti/list")
	public Result getPtiOkPagedList(@RequestParam(value="containerNo",required = false) String containerNo,
			@RequestParam(value="containerUser",required = false) String containerUser,
			@RequestParam(value="xxState",required = false) String xxState,
			@RequestParam(value="index",required = true) Integer index,
			@RequestParam(value="size",required = true) Integer size) {
		XxSearchInput input=new XxSearchInput();
		input.setContainerNo(containerNo);
		input.setContainerUser(containerUser);
		input.setXxState(xxState);
		input.setPageIndex(index);
		input.setPageSize(size);
		return Result.Success(service.getPtiOkPagedList(input));
	}
	
	/**
	 * pti notok确认
	 * @param courseIds
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/pti/notok")
	public Result ptiNotOkConfirm(String[] courseIds) {
		service.ptiNotOkConfirm(courseIds);
		return Result.Success();
	}
	
	/**
	 * pti ok确认
	 * @param courseIds
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/pti/ok")
	public Result ptiOkConfirm(String[] courseIds) {
		service.ptiOkConfirm(courseIds);
		return Result.Success();
	}
}
