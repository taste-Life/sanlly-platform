package com.sanlly.finance.config;

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
        Integer code=ResultCodeEnum.ERROR.getCode();
        if(e instanceof BindException){
        	code=ResultCodeEnum.BAD_REQUEST.getCode();
        }
        else if(e instanceof NoHandlerFoundException){
        	code=ResultCodeEnum.NOT_FOUND.getCode();
        }
        else if(e instanceof InvalidException){
        	code=ResultCodeEnum.BAD_REQUEST.getCode();
        }
        else if(e instanceof AuthorizationException){
        	code=ResultCodeEnum.UNAUTHORIZED.getCode();
        }
        else{
        	code=ResultCodeEnum.INTERNAL_SERVER_ERROR.getCode();
        }
        return new Result(code,null,e.getMessage());
    }
}
