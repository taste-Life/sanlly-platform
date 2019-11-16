package com.sanlly.production.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.common.models.output.Result;
import com.sanlly.production.models.input.maintenance.EstimateSearchInput;
import com.sanlly.production.service.MaintenanceEstimateService;

/**
 * 保修估价接口
 * @author RexSheng
 * 2019年10月9日 下午5:40:41
 */
@RestController
public class MaintenanceEstimateController {

	
	@Autowired
	private MaintenanceEstimateService service;
	
	/**
	 * 获取保修估价单列表
	 * @param containerNo
	 * @param ladingNo
	 * @param beginCourseTime
	 * @param endCourseTime
	 * @param beginValuationTime
	 * @param endValuationTime
	 * @param beginReplyTime
	 * @param endReplyTime
	 * @param containerUser
	 * @param courseType
	 * @param valuationStates
	 * @param index
	 * @param size
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/maintenance/estimate")
	public Result getEstimateList(
			@RequestParam(value="containerNo",required=false) String containerNo,
			@RequestParam(value="ladingNo",required=false) String ladingNo,
			@RequestParam(value="beginCourseTime",required=false) String beginCourseTime,
			@RequestParam(value="endCourseTime",required=false) String endCourseTime,
			@RequestParam(value="beginValuationTime",required=false) String beginValuationTime,
			@RequestParam(value="endValuationTime",required=false) String endValuationTime,
			@RequestParam(value="beginReplyTime",required=false) String beginReplyTime,
			@RequestParam(value="endReplyTime",required=false) String endReplyTime,
			@RequestParam(value="containerUser",required=false) String containerUser,
			@RequestParam(value="courseType",required=false) String courseType,
			@RequestParam(value="valuationState",required=false) String[] valuationStates,
			@RequestParam(value="index",required=true) Integer index,
			@RequestParam(value="size",required=true) Integer size
	) 
			throws Exception
	{
		EstimateSearchInput input=new EstimateSearchInput();
		input.setContainerNo(containerNo);
		input.setLadingNo(ladingNo);
		input.setBeginCourseTime(beginCourseTime);
		input.setEndCourseTime(endCourseTime);
		input.setBeginValuationTime(beginValuationTime);
		input.setEndValuationTime(endValuationTime);
		input.setBeginReplyTime(beginReplyTime);
		input.setEndReplyTime(endReplyTime);
		input.setContainerUser(containerUser);
		input.setCourseType(courseType);
		input.setValuationStates(valuationStates);
		input.setPageIndex(index);
		input.setPageSize(size);
		return Result.Success(service.getEstimateList(input));
	}
}
