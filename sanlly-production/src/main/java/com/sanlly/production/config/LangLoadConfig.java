package com.sanlly.production.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.sanlly.production.service.LangService;

@Component
public class LangLoadConfig{

	private Logger logger=LoggerFactory.getLogger(LangService.class);
	
	@Autowired
	private LangService langService;

	@Scheduled(fixedDelay = 30*60*1000)
	public void timer() {
		logger.info("==========定时加载国际化数据==========");
		langService.reload();
		logger.info("==========成功预加载国际化数据==========");
	}
	
}
