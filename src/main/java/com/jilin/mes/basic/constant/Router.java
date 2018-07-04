package com.jilin.mes.basic.constant;

import com.jilin.mes.basic.controller.IndexController;
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
    public static final String WORKSHOP="/WorkShop";


    /**
     * 添加车间记录
     * @see WorkShopController#add
     */
    public static final String WORKSHOP_ADD="/WorkShop/add";

    /**
     * 删除车间记录
     * @see WorkShopController#del
     */
    public static final String WORKSHOP_DEL="/WorkShop/del";

    /**
     * 修改车间记录
     * @see WorkShopController#modify
     */
    public static final String WORKSHOP_MODIFY="/WorkShop/modify";

    /**
     * @see IndexController#get()
     */
    public static final String WORKER="Worker";
}
