package com.sanlly.production.controller;

import javax.annotation.Resource;

import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

	@Resource
	private ThreadPoolTaskScheduler threadPoolTaskScheduler;
	
	
}
