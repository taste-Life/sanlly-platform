package com.sanlly.auth.config;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.google.code.kaptcha.util.Config;
import com.sanlly.common.constants.PlatformConstants;

/**
 * 验证码配置
 * @author 生旭鹏
 *
 */
@Configuration
public class KaptchaConfig {
	 @Bean
    public DefaultKaptcha producer(){
        Properties properties = new Properties();
     // 图片边框
        properties.put("kaptcha.border", "no");
     // 边框颜色
//        properties.put("kaptcha.border.color", "105,179,90");     
     // 字体颜色
        properties.put("kaptcha.textproducer.font.color", "black");
//        properties.put("kaptcha.textproducer.char.space", "10");
     // 验证码长度
		properties.put("kaptcha.textproducer.char.length", PlatformConstants.KAPTCHA_LENGTH);
     // 字体
        properties.setProperty("kaptcha.textproducer.font.names", "宋体,楷体,微软雅黑");
     // 图片宽
        properties.put("kaptcha.image.width", "100");
     // 图片高
        properties.put("kaptcha.image.height","36");
     // 字体大小
        properties.put("kaptcha.textproducer.font.size","25");
 
        properties.put("kaptcha.noise.impl","com.google.code.kaptcha.impl.NoNoise");
        Config config = new Config(properties);
        DefaultKaptcha defaultKaptcha = new DefaultKaptcha();
        defaultKaptcha.setConfig(config);
        return defaultKaptcha;
	 }
}
