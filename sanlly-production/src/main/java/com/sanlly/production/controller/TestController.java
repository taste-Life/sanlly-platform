package com.sanlly.production.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sanlly.common.models.output.Result;
import com.sanlly.production.service.AuthService;

@RestController
public class TestController {

	@Autowired
	private AuthService authService;
	
	@SuppressWarnings("rawtypes")
	@GetMapping("/test/validate")
	public Result test() {
		
		return Result.Success(authService.getCurrentUser());
	}
}
