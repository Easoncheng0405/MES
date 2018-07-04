package com.jilin.mes.basic.constant;

import com.jilin.mes.basic.controller.AccessController;
import com.jilin.mes.basic.controller.LoginController;
import com.jilin.mes.basic.controller.UserController;
import com.jilin.mes.basic.controller.WorkShopController;

/*
 * 创建时间 2018/7/3
 * 作者： 程杰
 * 博客： www.chengjie-jlu.com
 */


/**
 * 路由表
 */
public class Router {

    /**
     * 车间页面
     * @see WorkShopController#get
     */
    public static final String WORKSHOP="/workShop";


    /**
     * 添加车间记录
     * @see WorkShopController#add
     */
    public static final String WORKSHOP_ADD="/workShop/add";

    /**
     * 删除车间记录
     * @see WorkShopController#del
     */
    public static final String WORKSHOP_DEL="/workShop/del";

    /**
     * 修改车间记录
     * @see WorkShopController#modify
     */
    public static final String WORKSHOP_MODIFY="/workShop/modify";


    /**
     * 登陆页面
     * @see LoginController#get
     */
    public static final String SYSTEM_LOGIN="/login";


    /**
     * 用户信息页面
     * @see UserController#get
     */
    public static final String USER ="/user";


    /**
     * 用户信息页面
     * @see UserController#add
     */
    public static final String USER_ADD="/user/add";

    /**
     * 用户信息页面
     * @see UserController#del
     */
    public static final String USER_DEL="/user/del";


    /**
     * 用户信息页面
     * @see UserController#modify
     */
    public static final String USER_MODIFY="/user/modify";


    /**
     * 权限修改路由
     * @see AccessController#modify
     */
    public static final String ACCESS_MODIFY="/access";
}
