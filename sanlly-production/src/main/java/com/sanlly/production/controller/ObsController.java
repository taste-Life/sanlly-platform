package com.sanlly.production.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.common.models.output.Result;
import com.sanlly.production.service.ContainerUserService;
import com.sanlly.production.service.LangService;
import com.sanlly.production.service.ObsService;

/**
 * OBS 文件上传
 * @author 
 *
 */
@RestController
public class ObsController {

	@Autowired
	private ObsService obsService;
	
	/**
	 * OBS 文件上传
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping("/upload")
	public Result langRuleKeyByTable() {
		String fileName = "F:\\tzl\\timg.jpg";
		return Result.Success(obsService.uploadFile(fileName));
	}
}
