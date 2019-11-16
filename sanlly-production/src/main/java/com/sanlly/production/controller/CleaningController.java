package com.sanlly.production.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.common.models.output.Result;
import com.sanlly.production.models.input.cleaning.CleaningSearchInput;
import com.sanlly.production.service.CleaningService;

/**
 * 洗箱
 * @author RexSheng
 * 2019年8月22日 下午1:30:43
 */
@RestController
public class CleaningController {

	@Autowired
	private CleaningService service;
	
	/**
	 * 获取异味种类列表
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/flavors")
	public Result getFlavorList() {
		return Result.Success(service.getFlavorList());
	}
	
	/**
	 * 洗箱列表
	 * @param containerNo 箱号
	 * @param zone 区位
	 * @param pageIndex 页码
	 * @param pageSize 页大小
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/clean")
	public Result getCleaningPagedList(
			@RequestParam(value="containerNo",required = false) String containerNo,
			@RequestParam(value="zone",required = false) String zone,
			@RequestParam(value="index") Integer pageIndex,
			@RequestParam(value="size") Integer pageSize
			) 
	{
		CleaningSearchInput input=new CleaningSearchInput();
		input.setContainerNo(containerNo);
		input.setZone(zone);
		input.setPageIndex(pageIndex);
		input.setPageSize(pageSize);
		return Result.Success(service.getPagedList(input));
	}
	
	/**
	 * 上传洗箱照片
	 * @param cleaningId
	 * @param photo
	 * @param flavor
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/clean/wash")
	public Result setPhotoAndFlavor(Integer cleaningId,String photo, String flavor,String isSpecial,String remark) {
		service.setPhotoAndFlavor(cleaningId,photo, flavor,isSpecial,remark);
		return Result.Success();
	}
	
	/**
	 * 洗箱完工
	 * @param cleaningIds
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/clean/complete")
	public Result setComplete(Integer[] cleaningIds) {
		service.setComplete(cleaningIds);
		return Result.Success();
	}
	
	/**
	 * 洗箱完工上传照片
	 * @param cleaningIds
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/clean/complete/photo")
	public Result setCompletePhoto(Integer cleaningId,String photo) {
		service.setCompletePhoto(cleaningId, photo);
		return Result.Success();
	}
	
	/**
	 * 洗箱审核
	 * @param cleaningId
	 * @param photo
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/clean/audit")
	public Result setAudited(Integer cleaningId,String photo) {
		service.setAudited(cleaningId, photo);
		return Result.Success();
	}
	
}
