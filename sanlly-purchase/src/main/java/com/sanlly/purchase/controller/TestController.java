package com.sanlly.purchase.controller;

import com.alibaba.fastjson.JSONObject;
import com.sanlly.purchase.dao.MenuMapper;
import com.sanlly.purchase.entity.Menu;
import com.sanlly.purchase.service.feign.WorkFlowFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

	@Autowired
	private MenuMapper dao;
	
	@Autowired
	private WorkFlowFeignClient workflowFeignClient;
	
	@RequestMapping("/test")
	public void testConnection(){
		List<Menu> menuList=dao.selectByExample(null);
		System.out.println(menuList.size());
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping("/startProcess")
	public void startProcess(){
		 // 创建流程变量
		
		//去流程字典表查询相应的流程key
		
		JSONObject obj=new JSONObject();
		obj.put("key", "process");
		
		JSONObject vars=new JSONObject();
		//发起人ID
		vars.put("userId", 1);
		//公司key
		vars.put("companyKey", "company.qingdao");
		
		obj.put("vars", vars);
		workflowFeignClient.startByKeyWithVars(obj);
	}
	
}
