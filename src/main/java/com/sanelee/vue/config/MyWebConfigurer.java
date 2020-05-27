package com.sanelee.vue.config;

import com.sanelee.vue.interceptor.LoginInterceptor;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author sanelee
 * @date 2020/5/27
 **/
@SpringBootConfiguration
public class MyWebConfigurer implements WebMvcConfigurer {
    @Bean
    public LoginInterceptor getloginIntercepter(){
        return new LoginInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(getloginIntercepter()).addPathPatterns("/**").excludePathPatterns("/index.html");
    }
}
