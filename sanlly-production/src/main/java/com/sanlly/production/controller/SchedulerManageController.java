package com.sanlly.production.controller;

import org.quartz.Scheduler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.common.models.output.Result;

@RestController
public class SchedulerManageController {

	@Autowired
	private SchedulerFactoryBean schedulerFactoryBean;
	
	@GetMapping("/scheduler")
	public Result getSchedulerStatus() {
		//获取调度器
				Scheduler scheduler = schedulerFactoryBean.getScheduler();
		return Result.Success();
	}
}
