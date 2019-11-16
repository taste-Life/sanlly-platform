package com.sanlly.production.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.common.models.output.Result;
import com.sanlly.production.models.input.ActiveProcessInput;
import com.sanlly.production.service.ProcessService;

@RestController
@RequestMapping(value="/system")
public class SystemController {
	
	/**
	 * 流程管理服务
	 */
    @Autowired
    private ProcessService processService;
	/**
	 *  
	 * @param request
	 * @param response
	 */
	@RequestMapping("/getProcessList")
	public Result getProcessPage(@RequestBody ActiveProcessInput input) {
		return Result.Success(processService.getProcessPagedList(input));
	}
}
