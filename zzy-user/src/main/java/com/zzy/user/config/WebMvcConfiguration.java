package com.zzy.user.config;

import com.zzy.user.interceptor.MyInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Description TODO
 * @Author zzy
 * @Date 2019/11/22 10:45
 */
/*
* 配置拦截器
* 1.声明该类是一个配置类
* 2.实现WebMvcConfigurer接口
* */
@Configuration
public class WebMvcConfiguration implements WebMvcConfigurer {
    /*@Autowired
    private MyInterceptor myInterceptor;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(myInterceptor).addPathPatterns("/**");
    }*/
}
