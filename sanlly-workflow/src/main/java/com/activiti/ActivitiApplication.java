package com.activiti;

import org.activiti.spring.boot.SecurityAutoConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @version: v1.0 
 * @Description: 流程模块入口
 * @author: fangjy
 * @date: 2019年6月18日
 */
@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrix
@MapperScan("com.activiti.dao")
public class ActivitiApplication{ // extends SpringBootServletInitializer

    public static void main(String[] args) {
        SpringApplication.run(ActivitiApplication.class, args);
    }

//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//        return builder.sources(ActivitiApplication.class);
//    }

//    @Bean
//    public ServletRegistrationBean apiDispatcher() {
//        DispatcherServlet api = new DispatcherServlet();
//        api.setContextClass(AnnotationConfigWebApplicationContext.class);
//        api.setContextConfigLocation(ApiDispatcherServletConfiguration.class.getName());
//        ServletRegistrationBean registrationBean = new ServletRegistrationBean();
//        registrationBean.setServlet(api);
//        registrationBean.addUrlMappings("/api/*"); // api下面的所有内容都访问到这里
//        registrationBean.setLoadOnStartup(1);
//        registrationBean.setAsyncSupported(true);
//        registrationBean.setName("api"); // 不能重复，重复则以最后一个设置的为准
//
//        return registrationBean;
//    }

//    @Bean
//    public ServletRegistrationBean appDispatcher() {
//        DispatcherServlet api = new DispatcherServlet();
//        api.setContextClass(AnnotationConfigWebApplicationContext.class);
//        api.setContextConfigLocation(AppDispatcherServletConfiguration.class.getName());
//        ServletRegistrationBean registrationBean = new ServletRegistrationBean();
//        registrationBean.setServlet(api);
//        registrationBean.addUrlMappings("/app/*"); // app下面的所有内容都访问到这里
//        registrationBean.setLoadOnStartup(1);
//        registrationBean.setAsyncSupported(true);
//        registrationBean.setName("app"); // 不能重复，重复则以最后一个设置的为准
//
//        return registrationBean;
//    }

//    @Bean
//    public FilterRegistrationBean openEntityManagerInViewFilter() {
//        FilterRegistrationBean<OpenEntityManagerInViewFilter> filterRegistrationBean
//                = new FilterRegistrationBean<>(new OpenEntityManagerInViewFilter());
//        filterRegistrationBean.addUrlPatterns("/*");
//        filterRegistrationBean.setName("openEntityManagerInViewFilter");
//        filterRegistrationBean.setOrder(-200); // 必须在安全过滤器（-100）之前执行
//        filterRegistrationBean.setDispatcherTypes(EnumSet.of(DispatcherType.REQUEST, DispatcherType.FORWARD));
//
//        return filterRegistrationBean;
//    }
}
