package com.jilin.mes.basic.fifter;

/*
 * 作者：程杰
 * 创建时间：2018/7/4
 * 博客地址：www.chengjie-jlu.com
 */


import com.jilin.mes.basic.constant.Constant;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor extends HandlerInterceptorAdapter {


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (request.getSession().getAttribute(Constant.CURRENT_USER) != null) {
            return true;
        }

        response.sendRedirect("/login");
        return false;
    }
}
