package com.sanlly.production.interceptor;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sanlly.production.dao.SqlMapper;

/**
 * 
 * @author RexSheng
 * 2019年9月13日 下午11:02:25
 */
@Aspect
@Component
public class SqlAspect {
	
	@Autowired
	private ObjectMapper objectMapper;
	
	@Autowired
	private SqlMapper sqlDao;
	
	@Around("execution(public * com.sanlly.production.dao.SqlMapper.query(..))")
	public Object Interceptor(ProceedingJoinPoint joinPoint) throws Throwable {
		Object result = null; 
        try {
        	String sql=String.valueOf(joinPoint.getArgs()[0]);
        	if(StringUtils.isNotEmpty(sql)) {
        		List<Map<String,Object>> mapList=sqlDao.selectBySql(sql);
				JavaType modelType=objectMapper.getTypeFactory().constructParametricType(List.class, (Class<?>)joinPoint.getArgs()[1]);
        		result= objectMapper.convertValue(mapList, modelType);
        	}
        	else {
        		throw new NullPointerException("sql不能为空");
        	}
        } catch (Throwable e) {
        	throw e;
        }  
        return result;

	}
	
}
