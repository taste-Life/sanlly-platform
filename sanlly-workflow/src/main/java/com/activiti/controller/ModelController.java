package com.activiti.controller;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.activiti.domain.ApiResult;
import com.activiti.models.input.ModelFormInput;
import com.activiti.models.input.SearchModelInput;
import com.activiti.service.ModelService;
import com.activiti.service.ProcessService;
import com.alibaba.fastjson.JSONObject;
import com.sanlly.common.models.output.Result;

import cn.hutool.core.io.IoUtil;

/**
 * @version: v1.0
 * @Description: 模型Controller
 * @author: fjy
 * @date: 2019年7月20日
 */
@RestController
@RequestMapping(value = "/model")
public class ModelController {
	@Resource
	private ModelService modelService;

	/**
	 * 模型列表查询
	 * 
	 * @param roleName 要搜索的模型角色名称
	 * @param index    页码
	 * @param size     分页大小
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/getModelPage")
	public Result getModelPage(@RequestBody SearchModelInput input) {
		return Result.Success(modelService.getModelPage(input));
	}

	/**
	 * 创建模型
	* @Title: createModel  
	* @Description: TODO(这里用一句话描述这个方法的作用)  
	* @param @param input
	* @param @return    参数  
	* @return Result    返回类型  
	* @throws
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/createModel")
	public Result createModel(@RequestBody ModelFormInput input) {
		return Result.Success(modelService.createModel(input));
	}
	
	@SuppressWarnings("rawtypes")
	@DeleteMapping("/removeModelById")
	public Result removeModelById(@RequestParam String [] dataIds) {
		return Result.Success(modelService.removeModelById(dataIds));
	}


	@SuppressWarnings("rawtypes")
	@PostMapping("/deploy")
	public Result deploy(@RequestParam String [] dataIds) {
		return Result.Success(modelService.deploy(dataIds));
	}

}
