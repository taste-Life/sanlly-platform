package com.sanlly.production.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.common.models.output.Result;
import com.sanlly.production.models.input.surrender.EstimateSearchInput;
import com.sanlly.production.service.SurrenderEstimateService;

/**
 * 退租估价相关
 * @author RexSheng
 * 2019年10月31日 下午1:59:49
 */
@RestController
public class SurrenderEstimateController {

	@Autowired
	private SurrenderEstimateService estimateService;
	
	/**
	 * 退租估价列表
	 * @return
	 * @throws Exception 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/surrenders/estimates")
	public Result estimateList(@RequestParam(value="containerNo",required=false) String containerNo,
			@RequestParam(value="beginCourseTime",required=false) String beginCourseTime,
			@RequestParam(value="endCourseTime",required=false) String endCourseTime,
			@RequestParam(value="containerUser",required=false) String containerUser,
			@RequestParam(value="courseType",required=false) String courseType,
			@RequestParam(value="valuationState",required=false) String valuationState,
			@RequestParam(value="ownerValuationState",required=false) String ownerValuationState,
			@RequestParam(value="containerOwner",required=false) String containerOwner,
			@RequestParam(value="containerCategory",required=false) String containerCategory,
			@RequestParam(value="index",required=true) Integer index,
			@RequestParam(value="size",required=true) Integer size) throws Exception {
		EstimateSearchInput input=new EstimateSearchInput();
		input.setContainerNo(containerNo);
		input.setContainerCategory(containerCategory);
		input.setContainerOwner(containerOwner);
		input.setBeginCourseTime(beginCourseTime);
		input.setEndCourseTime(endCourseTime);
		input.setContainerUser(containerUser);
		input.setCourseType(courseType);
		input.setValuationState(valuationState);
		input.setOwnerValuationState(ownerValuationState);
		input.setPageIndex(index);
		input.setPageSize(size);
		return Result.Success(estimateService.getEstimateList(input));
	}
}
