package com.sanlly.zuul.filter;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.sanlly.common.constants.PlatformConstants;
import com.sanlly.common.enums.ResultCodeEnum;
import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.user.SessionOutput;
import com.sanlly.zuul.service.AuthService;


@Component
public class PreRequestFilter extends ZuulFilter {
	
	@Autowired
	private AuthService authService;

    private static final Logger LOG = LoggerFactory.getLogger(PreRequestFilter.class);


    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return FilterConstants.PRE_DECORATION_FILTER_ORDER + 1;//int值来定义过滤器的执行顺序，数值越小优先级越高
    }

    @Override
    public boolean shouldFilter() {
    	RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        LOG.debug("should send {} request to {}",request.getMethod(),request.getRequestURI().toString());
        for(String url:PlatformConstants.ANONYMOUS_URL) {
        	if(request.getRequestURI().toString().startsWith(url)) {
        		return false;
        	}
        }
        return true;
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        Result<SessionOutput> authResult=authService.authValidate();
        if(authResult.getCode().equals(ResultCodeEnum.SUCCESS.getCode()) && authResult.getData()!=null){
        	ctx.addZuulRequestHeader("userId", authResult.getData().getUserId()+"");
        	ctx.addZuulRequestHeader("loginAccount", authResult.getData().getLoginAccount());
        	ctx.addZuulRequestHeader("isAdmin", authResult.getData().getIsAdmin()+"");
        	ctx.addZuulRequestHeader("isHeadCompany", authResult.getData().getIsHeadCompany()+"");
        	ctx.addZuulRequestHeader("auth", String.join("|",authResult.getData().getAuth()));
        	ctx.addZuulRequestHeader("yard", String.join("|",authResult.getData().getYard()));
        }
        else{
        	ctx.setSendZuulResponse(false);
			ctx.setResponseStatusCode(HttpStatus.UNAUTHORIZED.value());
			ctx.getResponse().setContentType("application/json;charset=utf-8");
			ctx.setResponseBody("{\"code\":"+ResultCodeEnum.UNAUTHORIZED.getCode()+",\"message\":\"未认证\",\"data\":null}");
        }
        return null;
    }
}
