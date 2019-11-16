package com.sanlly.zuul.config;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.springframework.cloud.netflix.zuul.filters.route.FallbackProvider;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.NoHandlerFoundException;

import com.sanlly.common.enums.ResultCodeEnum;
import com.sanlly.common.models.exception.AuthorizationException;
import com.sanlly.common.models.exception.InvalidException;

@Component
public class ExceptionFallbackProvider implements FallbackProvider{

	@Override
	public String getRoute() {
		return "*";
	}

	@Override
	public ClientHttpResponse fallbackResponse(String route, Throwable cause) {
		
		return new ClientHttpResponse() {
			
			@Override
			public HttpHeaders getHeaders() {
				HttpHeaders headers = new HttpHeaders();
                headers.setContentType(MediaType.APPLICATION_JSON);
                return headers;
			}
			
			@Override
			public InputStream getBody() throws IOException {
				ResultCodeEnum code=ResultCodeEnum.ERROR;
				if(cause instanceof BindException){
		        	code=ResultCodeEnum.BAD_REQUEST;
		        }
		        else if(cause instanceof NoHandlerFoundException){
		        	code=ResultCodeEnum.NOT_FOUND;
		        }
		        else if(cause instanceof InvalidException){
		        	code=ResultCodeEnum.BAD_REQUEST;
		        }
		        else if(cause instanceof AuthorizationException){
		        	code=ResultCodeEnum.UNAUTHORIZED;
		        }
		        else{
		        	code=ResultCodeEnum.INTERNAL_SERVER_ERROR;
		        }
				String msg="{\"code\":"+code.getCode()+",\"message\":\""+code.getMessage()+"\",\"data\":null}";
				return new ByteArrayInputStream(msg.getBytes());
			}
			
			@Override
			public String getStatusText() throws IOException {
				return "OK";
			}
			
			@Override
			public HttpStatus getStatusCode() throws IOException {
				return HttpStatus.OK;
			}
			
			@Override
			public int getRawStatusCode() throws IOException {
				// TODO Auto-generated method stub
				return 200;
			}
			
			@Override
			public void close() {
				// TODO Auto-generated method stub
				
			}
		};
	}

}
