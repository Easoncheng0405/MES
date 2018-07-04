package com.jilin.mes.basic.config;

import com.jilin.mes.basic.constant.Router;
import com.jilin.mes.basic.fifter.LoginInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/*
 * 作者：程杰
 * 创建时间：2018/7/4
 * 博客地址：www.chengjie-jlu.com
 */
@Component
public class InterceptorConfig implements WebMvcConfigurer {


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        String urls[] = new String[]{Router.WORKSHOP, Router.USER};
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns(urls);
    }

}
