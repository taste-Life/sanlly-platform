package com.sanlly.production.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.common.models.output.Result;
import com.sanlly.production.models.output.guarantee.MaintenanceSiteOutput;
import com.sanlly.production.service.MaintenanceSiteService;

import io.swagger.annotations.Api;

@RestController
@Api(tags = {"保修地点相关操作API"})
public class MaintenanceSiteController {
	
	@Autowired
	private MaintenanceSiteService maintenanceSiteService;
	
	/**
	 * 根据companyKey获取保修地点
	 * @param companyKey
	 * @return
	 * @author zhangkai
	 */
	@GetMapping("/maintenanceSites/{companyKey}")
	public Result<List<MaintenanceSiteOutput>> getMaintenanceSiteByCompanyKey(@PathVariable("companyKey") String companyKey) {
		return Result.Success(maintenanceSiteService.getMaintenanceSiteByCompanyKey(companyKey));
	}

}
