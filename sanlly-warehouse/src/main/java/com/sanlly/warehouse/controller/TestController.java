package com.sanlly.warehouse.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.warehouse.dao.MenuMapper;
import com.sanlly.warehouse.entity.Menu;

@RestController
public class TestController {
	
	private Logger logger=LoggerFactory.getLogger(this.getClass());
	
	@Value("${spring.application.name}")
	private String appName;
	
	@Autowired
	private MenuMapper dao;

	@GetMapping("/test")
	public String test(@RequestParam(value="name") String name){
		List<Menu> list=dao.selectByExample(null);
		logger.info("长度{}",list.size());
		return appName+name;
	}
}
