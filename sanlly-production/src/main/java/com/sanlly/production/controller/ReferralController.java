package com.sanlly.production.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.common.models.output.Result;
import com.sanlly.production.models.input.referral.SearchAutomationInput;
import com.sanlly.production.service.ReferralService;

/**
 * 派工接口
 * 
 * @Package com.sanlly.production.controller 
 * @Description: TODO
 * @author wangxzh   
 * @date 2019年9月5日 下午4:07:17 
 * @version V1.0   
 */
@RestController
public class ReferralController {

	@Autowired
	private ReferralService referralService;

	/**
	 * 自动排程列表
	 * 
	 * @Description: TODO
	 * @param startDate
	 *            派工开始时间
	 * @param endDate
	 *            派工结束时间
	 * @param containerCategory
	 *            箱类别
	 * @param containerNo
	 *            箱号
	 * @param containerUser
	 *            用箱人
	 * @param courseType
	 *            进场类型
	 * @param workGroup
	 *            班组
	 * @param pageIndex
	 * @param pageSize
	 * @return
	 * @throws Exception
	 *             Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/fix/automation")
	public Result getAutomationList(@RequestParam(required = false) String startDate,
			@RequestParam(required = false) String endDate, @RequestParam String containerCategory,
			@RequestParam(required = false) String containerNo, @RequestParam(required = false) String containerUser,
			@RequestParam(required = false) String courseType, @RequestParam(required = false) String workGroup,
			@RequestParam Integer pageIndex, @RequestParam Integer pageSize) throws Exception {
		SearchAutomationInput input = new SearchAutomationInput(pageIndex, pageSize);
		input.setContainerCategory(containerCategory);
		input.setContainerNo(containerNo);
		input.setContainerUser(containerUser);
		input.setCourseType(courseType);
		input.setEndDate(endDate);
		input.setStartDate(startDate);
		input.setWorkGroup(workGroup);
		return Result.Success(referralService.getAutomationList(input));
	}

	/**
	 * 获取维修班组
	 * 
	 * @Description: TODO
	 * @param startDate
	 * @return Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/fix/user")
	public Result getDesignateUser(@RequestParam String yard,
			@RequestParam(required = false) String containerCategory) {
		return Result.Success(referralService.getDesignateUser(yard, containerCategory));
	}

	/**
	 * 根据用户获取工作组
	 * 
	 * @Description: TODO
	 * @param yard
	 * @param containerCategory
	 * @return Result @throws 
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/fix/workGroup")
	public Result getWorkGroupByUser(@RequestParam String yard, @RequestParam Integer user) {
		return Result.Success(referralService.getWorkGroupByUser(yard, user));
	}

}
