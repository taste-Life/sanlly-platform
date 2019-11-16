package com.sanlly.zuul.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.NoHandlerFoundException;

import com.sanlly.common.enums.ResultCodeEnum;
import com.sanlly.common.models.exception.InvalidException;
import com.sanlly.common.models.exception.AuthorizationException;
import com.sanlly.common.models.output.Result;

@ControllerAdvice
@ResponseBody
public class ExceptionConfig {
	
	private static Logger logger = LoggerFactory.getLogger(ExceptionConfig.class);
	 
	/**
     * 获取异常。
     * @param e
     * @return
     * @throws Exception
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
	@ExceptionHandler(value = Exception.class)
    public Result defaultErrorHandler(Exception e){
        logger.error("Exception", e);
        Integer code=1;
        if(e instanceof BindException){
        	code=HttpStatus.BAD_REQUEST.value();
        }
        else if(e instanceof NoHandlerFoundException){
        	code=HttpStatus.NOT_FOUND.value();
        }
        else if(e instanceof InvalidException){
        	code=ResultCodeEnum.BAD_REQUEST.getCode();
        }
        else if(e instanceof AuthorizationException){
        	code=HttpStatus.UNAUTHORIZED.value();
        }
        else{
        	code=HttpStatus.INTERNAL_SERVER_ERROR.value();
        }
        return new Result(code,null,e.getMessage());
    }
}
