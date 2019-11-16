package com.sanlly.production.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.common.models.output.Result;
import com.sanlly.production.models.input.inspectionDemand.InspectionDemandSelectInput;
import com.sanlly.production.models.output.inspectionDemand.InspectionDemandSelectOutput;
import com.sanlly.production.service.InspectionDemandService;

import io.swagger.annotations.Api;

/**
 * 
* @Package com.sanlly.production.controller 
* @Description: 检验要求 
* @author zhangkai   
* @date 2019年8月28日 下午3:28:18 
* @version V1.0   
 */
@RestController
@Api(tags = {"检验要求API"})
public class InspectionDemandController {
	
	@Autowired
	private InspectionDemandService inspectionDemandService;

	/**
	 * tianzhl要的接口
	 * @author zhangkai
	 */
	@GetMapping("/inspectionDemand/select")
	public Result<List<InspectionDemandSelectOutput>> select(
			@RequestParam(required = true, value = "company") String company,
			@RequestParam(required = true, value = "yard") String yard,
			@RequestParam(required = true, value = "containerCategory") String containerCategory,
			@RequestParam(required = true, value = "containerUser") String containerUser
			) {
		InspectionDemandSelectInput input = new InspectionDemandSelectInput();
		input.setCompany(company);
		input.setContainerCategory(containerCategory);
		input.setContainerUser(containerUser);
		input.setYard(yard);
		return Result.Success(inspectionDemandService.select(input));
	}
}
