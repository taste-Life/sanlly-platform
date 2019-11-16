package com.sanlly.zuul.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CorsConfig {
	private CorsConfiguration buildConfig() {  
        CorsConfiguration corsConfiguration = new CorsConfiguration();  
        corsConfiguration.addAllowedOrigin("*");  
        corsConfiguration.addAllowedHeader("*");  
        corsConfiguration.setAllowCredentials(true);
        corsConfiguration.addAllowedMethod("*");
        return corsConfiguration;  
    }  
      
    /** 
     * 跨域过滤器 
     * @return 
     */  
    @Bean  
    public CorsFilter corsFilter() {  
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();  
        source.registerCorsConfiguration("/**", buildConfig()); // 4  
        return new CorsFilter(source);  
    }
    
    /**
     *  官方方法，未测试
     *  @Bean
		public WebMvcConfigurer corsConfigurer() {
		    return new WebMvcConfigurer() {
		        public void addCorsMappings(CorsRegistry registry) {
		            registry.addMapping("/path-1/**")
		                    .allowedOrigins("http://allowed-origin.com")
		                    .allowedMethods("GET", "POST");
		        }
		    };
		}
     */
}
