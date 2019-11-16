package com.sanlly.production.config;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.NoHandlerFoundException;

import com.sanlly.common.enums.ResultCodeEnum;
import com.sanlly.common.models.exception.AuthorizationException;
import com.sanlly.common.models.exception.InvalidException;
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
        ResultCodeEnum result =ResultCodeEnum.ERROR;
        String msg="";
        if(e instanceof BindException){
        	result = ResultCodeEnum.BAD_REQUEST;
        }
        else if(e instanceof NoHandlerFoundException){
        	result = ResultCodeEnum.NOT_FOUND;
        }
        else if(e instanceof InvalidException){
        	result = ResultCodeEnum.BAD_REQUEST;
        	msg=e.getMessage();
        }
        else if(e instanceof AuthorizationException){
        	result = ResultCodeEnum.UNAUTHORIZED;
        	msg=e.getMessage();
        }
        else{
        	result = ResultCodeEnum.INTERNAL_SERVER_ERROR;
        }
        return new Result(result.getCode(),null,StringUtils.isNotEmpty(msg)?msg:result.getMessage());
    }
}
