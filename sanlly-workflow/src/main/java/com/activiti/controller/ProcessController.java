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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.activiti.domain.ApiResult;
import com.activiti.models.input.SearchModelInput;
import com.activiti.service.ProcessService;
import com.alibaba.fastjson.JSONObject;
import com.sanlly.common.models.output.Result;

import cn.hutool.core.io.IoUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @version: v1.0
 * @Description: 流程Controller
 * @author: wupzh
 * @date: 2019年6月20日
 */
@RestController
@RequestMapping(value = "/process")
@Api(value = "ProcessController ")
public class ProcessController {
	@Resource
	private ProcessService processService;
	@Resource
	private HttpServletResponse response;

	/**
	 * 根据key获取流程定义的最新版本
	 * 
	 * @param param
	 * @return
	 */
	@PostMapping("/getLatestVersionByKey")
	public Object getLatestVersionByKey(@RequestBody JSONObject param) {
		return ApiResult.success().retData(processService.getByKeyAndLatestVersion(param)).build();
	}

	/**
	 * 获取所有流程定义,支持分页
	 * 
	 * @return
	 */
	@PostMapping("/getProcessDefinitions")
	public Object getProcessDefinitions(@RequestBody JSONObject param) {
		return ApiResult.success().retData(processService.getProcessDefinitions(param)).build();
	}

	/**
	 * 获取所有流程定义,支持分页
	 * 
	 * @return
	 */
	@PostMapping("/getProcessInstances")
	public Object getProcessInstances(@RequestBody JSONObject param) {
		return ApiResult.success().retData(processService.getProcessInstances(param)).build();
	}

	/**
	 * 根据流程定义的key启动流程实例
	 * 
	 * @param param
	 */
	@PostMapping("/startByKey")
	public Object startByKey(@RequestBody JSONObject param) {
		processService.startByKey(param);
		return ApiResult.success().build();
	}

	/**
	 * 根据流程定义的key启动流程实例同时设置流程变量, 可用于传递表单数据
	 * 
	 * @param param
	 */
	@PostMapping("/startByKeyWithVars")
	public String startByKeyWithVars(@RequestBody JSONObject param) {
		return processService.startByKeyWithVars(param);
//		return ApiResult.success().retData(processService.startByKeyWithVars(param)).build();
	}

	/**
	 * 根据流程实例Id获取流程变量 办理任务时可通过该方法获取表单数据渲染表单, 适用于流程过程中表单数据不变的情况
	 * 
	 * @param param
	 */
	@PostMapping("/getProcessVars")
	public Object getProcessVars(@RequestBody JSONObject param) {
		return ApiResult.success().retData(processService.getProcessVars(param)).build();
	}

	/**
	 * 根据流程定义的key获取流程实例列表
	 * 
	 * @param param
	 * @return
	 */
	@PostMapping("/getProcessInstancesByKey")
	public Object getProcessInstancesByKey(@RequestBody JSONObject param) {
		return ApiResult.success().retData(processService.getProcessInstancesByKey(param)).build();
	}

	/**
	 * 流程挂起
	 * 
	 * @param param
	 */
	@PostMapping("/suspend")
	public Object suspend(@RequestBody JSONObject param) {
		processService.suspend(param);
		return ApiResult.success().build();
	}

	/**
	 * 流程激活
	 * 
	 * @param param
	 */
	@PostMapping("/activate")
	public Object activate(@RequestBody JSONObject param) {
		processService.activate(param);
		return ApiResult.success().build();
	}

	/**
	 * 查看流程实例对应的图片
	 * 
	 * @param
	 */
	@PostMapping("/getImgByProcessInstanceId")
	public void getImgByProcessInstanceId(@RequestBody JSONObject param) throws IOException {
		InputStream is = processService.getImgByProcessInstanceId(param);
		// 输出图片内容
		byte[] b = new byte[1024];
		int len;
		OutputStream os = response.getOutputStream();
		while ((len = is.read(b, 0, 1024)) != -1) {
			os.write(b, 0, len);
		}
	}

	/**
	 * 
	 * 查看流程图
	 * @param procDefId
	 * @param proInsId
	 * @param resType
	 * @return
	 */
	@GetMapping(value = "/getActiveProcessImg/{proInsId}")
	public void getActiveProcessImg(@PathVariable String proInsId) throws IOException{


		JSONObject obj=new JSONObject();
		obj.put("processInstanceId", proInsId);
		InputStream is = processService.getImgByProcessInstanceId(obj);
		// 输出图片内容
		byte[] b = new byte[1024];
		int len;
		OutputStream os = response.getOutputStream();
		while ((len = is.read(b, 0, 1024)) != -1) {
			os.write(b, 0, len);
		}
//		HttpHeaders headers = new HttpHeaders();
//		headers.setContentType(MediaType.IMAGE_PNG);
//		return new ResponseEntity(is, headers, HttpStatus.CREATED);
	}
	

	/**
	 * 根据流程定义Id获取模型Id
	 * 
	 * @param param
	 */
	@PostMapping("/getModelIdByProcessDefinitionId")
	public Object getModelIdByProcessDefinitionId(@RequestBody JSONObject param) {
		return ApiResult.success().retData(processService.getModelIdByProcessDefinitionId(param)).build();
	}

	/**
	 * 插入一条数据
	 * 
	 * @param param
	 */
	@PostMapping("/insertProcInstForm")
	public Object insertProcInstForm(@RequestBody JSONObject param) {
		processService.insertProcInstForm(param);
		return ApiResult.success().build();
	}

	/**
	 * 根据表单id获取流程实例id
	 * 
	 * @param param
	 * @return
	 */
	@PostMapping("/selectProcInstIdByFormId")
	public Object selectProcInstIdByFormId(@RequestBody JSONObject param) {
		return ApiResult.success().retData(processService.selectProcInstIdByFormId(param)).build();
	}

	/*****************************************************/

	/**
	 * 模型列表查询
	 * 
	 * @param roleName 要搜索的模型角色名称
	 * @param index    页码
	 * @param size     分页大小
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@PostMapping("/getProcessPage")
	public Result getProcessPage(@RequestBody SearchModelInput input) {
		return Result.Success(processService.getProcessByPage(input));
	}

	/**
	 * 
	 * 查看流程图
	 * @param procDefId
	 * @param proInsId
	 * @param resType
	 * @return
	 */
	@GetMapping(value = "/resource/{proInsId}/{procDefId}/{resType}")
	public ResponseEntity resourceRead(@PathVariable String procDefId, @PathVariable String proInsId,
			@PathVariable String resType) {

		HttpHeaders headers = new HttpHeaders();

		if ("xml".equals(resType)) {
			headers.setContentType(MediaType.APPLICATION_XML);
		} else {
			headers.setContentType(MediaType.IMAGE_PNG);
		}

		InputStream resourceAsStream = processService.readResource(procDefId, proInsId, resType);
		return new ResponseEntity(IoUtil.readBytes(resourceAsStream), headers, HttpStatus.CREATED);
	}

	/**
	 * 
	 * @Description: 激活 挂起流程  
	 * @param procDefId
	 * @param status
	 * @return
	 */
	@ApiOperation(value = "激活 挂起流程" ,  notes="激活 挂起流程")
	@PostMapping("/status")
	public Result updateState(@RequestParam String [] procDefId, String status) {
		return Result.Success(processService.updateStatus(status, procDefId));
	}

	/**
	 * 
	 * @Description:   删除部署的流程
	 * @param deploymentId
	 * @return
	 */
	@DeleteMapping("/deleteProcIns")
	public Result deleteProcIns(@RequestParam String[] deploymentId) {
		return Result.Success(processService.removeProcIns(deploymentId));
	}
	/**
	 * 
	 * @Description:   删除流程
	 * @param processInstanceId
	 * @return
	 */
	@DeleteMapping("/removeProcessByProcessId")
	public Result removeProcessByProcessId(@RequestParam(value = "processInstanceId", required = true)  String processInstanceId) {
		return Result.Success(processService.removeProcessByProcessId(processInstanceId));
	}
	
	

	/**
	 * 提交流程
	 *
	 * @param deploymentId
	 * @return Result
	 */
	@PostMapping("/start")
	public Result submit(@RequestParam String [] deploymentId) {
		return Result.Success(processService.saveStartProcess(deploymentId));
	}
	
	/**
	 * 查询一个流程是否结束
	 * @param processInstanceId
	 * @return Result  结束返回true  未结束返回false
	 */
	@GetMapping("/isEndProcess/{processInstanceId}")
	public Boolean isEndProcess(@PathVariable("processInstanceId") String processInstanceId) {
		return processService.isEndProcess(processInstanceId);
	}
	

}
