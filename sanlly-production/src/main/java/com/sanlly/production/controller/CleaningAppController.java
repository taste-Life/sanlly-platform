package com.sanlly.production.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.common.models.output.Result;
import com.sanlly.production.models.input.app.cleaning.CleaningAuditInput;
import com.sanlly.production.models.input.app.cleaning.CleaningPhotoInput;
import com.sanlly.production.models.input.app.cleaning.CleaningSearchInput;
import com.sanlly.production.models.input.app.cleaning.CleaningUploaderInput;
import com.sanlly.production.service.app.CleaningAppService;

/**
 * 洗箱相关
 * @author RexSheng
 * 2019年8月26日 下午1:44:05
 */
@RestController
public class CleaningAppController {

	@Autowired
	private CleaningAppService service;
	
	/**
	 * 洗箱列表
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/cleans")
	public Result cleaningList(CleaningSearchInput input) {
		return Result.Success(service.getCleanPagedList(input));
	}
	
	/**
	 * 洗箱员洗箱
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/subCleanDetail")
	public Result subCleanDetail(CleaningUploaderInput input) {
		service.subCleanDetail(input);
		return Result.Success();
	}
	
	
	/**
	 * 预检员洗箱
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/subCheckCleanDetail")
	public Result subCheckCleanDetail(CleaningAuditInput input) {
		service.subCheckCleanDetail(input);
		return Result.Success();
	}
	
	/**
	 * 洗箱员补充完工后照片
	 * @param input
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/subCompletePhoto")
	public Result subCompletePhoto(CleaningPhotoInput input) {
		service.subCompletePhoto(input);
		return Result.Success();
	}
	
	/**
	 * 异味种类列表
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/odorSpecies/list")
	public Result odorSpecies() {
		return Result.Success(service.odorSpeciesList());
	}
	
}
