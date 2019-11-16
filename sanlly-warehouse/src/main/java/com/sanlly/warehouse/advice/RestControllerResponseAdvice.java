package com.sanlly.warehouse.advice;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import com.sanlly.common.enums.LanguageEnum;
import com.sanlly.common.models.input.lang.LangInput;
import com.sanlly.common.models.output.Result;
import com.sanlly.warehouse.service.feign.ProductionFeignClient;

@ControllerAdvice
public class RestControllerResponseAdvice implements ResponseBodyAdvice<Object> {

	@Autowired
	private ProductionFeignClient langService;

	@Override
	public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> converterType) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType,
			Class<? extends HttpMessageConverter<?>> selectedConverterType, ServerHttpRequest request,
			ServerHttpResponse response) {
		// TODO Auto-generated method stub
		ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder
				.getRequestAttributes();
		HttpServletRequest hsRequest = requestAttributes.getRequest();
		String value = hsRequest.getHeader("Lang");
		if (StringUtils.isNotEmpty(value)) {
			String[] arr = value.split(";");
			Result<Object> result = null;
			if (arr[0].equals("en") || arr[0].toLowerCase().equals("en-us")) {
				result = langService.lang(new LangInput(body, LanguageEnum.LANGEN));
			} else if (arr[0].equals("zh") || arr[0].toLowerCase().equals("zh-cn")) {
				result = langService.lang(new LangInput(body, LanguageEnum.LANGZH));
			}
			if (result != null && result.getCode() == 0) {
				return result.getData();
			}
		}
		return body;
	}

}