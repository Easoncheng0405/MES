package com.jilin.mes.basic.util;

/*
 * 作者：程杰
 * 创建时间：2018/7/4
 * 博客地址：www.chengjie-jlu.com
 */

import com.jilin.mes.basic.constant.Constant;
import com.jilin.mes.basic.model.Access;
import com.jilin.mes.basic.model.User;

import javax.servlet.http.HttpSession;

/**
 * 权限检查工具
 */
public class AccessUtil {


    /**
     * 检查是否有访问路由的权限
     *
     * @param router 目标路由
     * @param session  session
     * @return boolean
     */
    public static boolean hasAccess(String router, HttpSession session) {

        User user = (User) session.getAttribute(Constant.CURRENT_USER);
        //超级管理员拥有所有权限
        if (user.getType().equals(Constant.USER_TYPE_SUPER_ADMIN))
            return true;
        for (Access access : user.getAccesses())
            if (access.getRouter().equals(router))
                return true;
        return false;
    }
}
