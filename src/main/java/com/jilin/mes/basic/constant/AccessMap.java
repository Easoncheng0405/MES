package com.jilin.mes.basic.constant;

import java.util.HashMap;

/*
 * 作者：程杰
 * 创建时间：2018/7/4
 * 博客地址：www.chengjie-jlu.com
 */
public class AccessMap {


    private static HashMap<String,String> CRUDMap;

    static {
        CRUDMap =new HashMap<>();

        //车间管理
        CRUDMap.put("车间管理",Router.WORKSHOP);
        //用户管理
        CRUDMap.put("用户管理",Router.USER);

    }

    public static HashMap<String,String> getCRUDMap(){
        return CRUDMap;
    }

}
