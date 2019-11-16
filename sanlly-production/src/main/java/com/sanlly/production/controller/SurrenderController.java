package com.sanlly.production.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.common.models.output.Result;
import com.sanlly.production.models.input.containerTesting.CourseCopyInput;
import com.sanlly.production.models.input.surrender.SurrenderCourseSearchInput;
import com.sanlly.production.models.input.surrender.SurrenderPlanDeleteInput;
import com.sanlly.production.models.input.surrender.SurrenderPlanDetailInput;
import com.sanlly.production.models.input.surrender.SurrenderPlanFinishInput;
import com.sanlly.production.models.input.surrender.SurrenderPlanInput;
import com.sanlly.production.models.input.surrender.SurrenderPlanSearchInput;
import com.sanlly.production.service.ContainerTestingService;
import com.sanlly.production.service.SurrenderService;

@RestController
public class SurrenderController {

	@Autowired
	private SurrenderService surrenderService;

	@Autowired
	private ContainerTestingService containerTestingService;
	
	/**
	 *  
	 * 
	 * @Description: TODO 退租箱进场列表
	 * @param input @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/surrenders/list")
	public Result surrenderCourse(@RequestParam(required = false) String startDate,
			@RequestParam(required = false) String endDate, @RequestParam(required = false) String containerOwner,
			@RequestParam(required = false) String containerCategory,
			@RequestParam(required = false) String containerNo, @RequestParam(required = false) String containerUser,
			@RequestParam(required = false) String courseType, @RequestParam(required = true) Integer pageIndex,
			@RequestParam(required = true) Integer pageSize) throws Exception {
		SurrenderCourseSearchInput input = new SurrenderCourseSearchInput();
		input.setContainerCategory(containerCategory);
		input.setContainerNo(containerNo);
		input.setContainerUser(containerUser);
		input.setCourseType(courseType);
		input.setEndDate(endDate);
		input.setStartDate(startDate);
		input.setContainerOwner(containerOwner);
		input.setPageIndex(pageIndex);
		input.setPageSize(pageSize);
		return Result.Success(containerTestingService.surrenderCourse(input));
	}
	
	/**
	 *  
	 * 
	 * @Description: TODO 退租箱拷贝进场
	 * @param input @throws 
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/surrenders/copy")
	public Result surrenderCopyCourse(@RequestBody CourseCopyInput input) throws Exception {
		return Result.Success(containerTestingService.surrenderCopyCourse(input));
	}

	/**
	 *  
	 * 
	 * @Description: TODO 退租计划列表
	 * @param input
	 * @return List<SurrenderPlanOutput> @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/surrenders/plans")
	public Result surrenderPlanlist(@RequestParam(required = false) String planNo,
			@RequestParam(required = false) String startTime, @RequestParam(required = false) String endTime,
			@RequestParam(required = false) String isValid, @RequestParam(required = false) String planState, @RequestParam(required = true) Integer pageIndex,
			@RequestParam(required = true) Integer pageSize)
			throws Exception {
		SurrenderPlanSearchInput input = new SurrenderPlanSearchInput();
		input.setPlanNo(planNo);
		input.setStartTime(startTime);
		input.setEndTime(endTime);
		input.setIsValid(isValid);
		input.setPlanState(planState);
		input.setPageIndex(pageIndex);
		input.setPageSize(pageSize);
		return Result.Success(surrenderService.surrenderPlanlist(input));
	}

	/**
	 *  
	 * 
	 * @Description: TODO 保存退租计划
	 * @param input
	 * @return String @throws 
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/surrenders/plans/save")
	public Result saveSurrenderPlan(@RequestBody SurrenderPlanInput input) throws Exception {
		return Result.Success(surrenderService.saveSurrenderPlan(input));
	}

	/**
	 *  
	 * 
	 * @Description: TODO 批量删除退租计划
	 * @param input
	 * @return String @throws 
	 */
	@SuppressWarnings("rawtypes")
	@DeleteMapping("/surrenders/plans/delete")
	public Result deleteSurrenderPlans(@RequestBody SurrenderPlanDeleteInput input) throws Exception {
		surrenderService.deleteSurrenderPlans(input);
		return Result.Success();
	}

	/**
	 *  
	 * 
	 * @Description: TODO 退租计划明细列表
	 * @return List<SurrenderPlanDetailOutput> @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/surrenders/details")
	public Result surrenderPlanDetailist(@RequestParam(required = true) Integer prodSurrenderPlanId) throws Exception {
		return Result.Success(surrenderService.surrenderPlanDetailist(prodSurrenderPlanId));
	}

	/**
	 *  
	 * 
	 * @Description: TODO 保存退租计划明细
	 * @param input
	 * @return String @throws 
	 */
	@SuppressWarnings("rawtypes")
	@PutMapping("/surrenders/details/save")
	public Result saveSurrenderPlanDetail(@RequestBody SurrenderPlanDetailInput input) throws Exception {
		return Result.Success(surrenderService.saveSurrenderPlanDetail(input));
	}

	/**
	 *  
	 * 
	 * @Description: TODO 批量删除退租计划明细
	 * @param input
	 * @return String @throws 
	 */
	@SuppressWarnings("rawtypes")
	@DeleteMapping("/surrenders/details/delete")
	public Result deleteSurrenderPlanDetails(@RequestBody SurrenderPlanDeleteInput input) throws Exception {
		surrenderService.deleteSurrenderPlanDetails(input);
		return Result.Success();
	}
	
	/**
	 *  
	 * 
	 * @Description: TODO 批量完工退租计划
	 * @param input
	 * @return String @throws 
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/surrenders/plans/finish")
	public Result finishSurrenderPlans(@RequestBody SurrenderPlanFinishInput input) throws Exception{
		surrenderService.finishSurrenderPlans(input);
		return Result.Success();
	}
}
