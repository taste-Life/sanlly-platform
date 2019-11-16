package com.sanlly.zuul.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.user.SessionOutput;
import com.sanlly.zuul.config.FeignConfiguration;


@FeignClient(name = "auth",configuration =FeignConfiguration.class)
public interface AuthService {
	@PostMapping("/validate")
    Result<SessionOutput> authValidate();
}
