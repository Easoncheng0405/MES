package com.jilin.mes.basic.model;

/*
 * 作者：程杰
 * 创建时间：2018/7/4
 * 博客地址：www.chengjie-jlu.com
 */

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Access {


    /**
     * 权限对应路由
     */
    @Id
    private String router;

    /**
     * 权限名称
     */
    private String name;


    public String getRouter() {
        return router;
    }

    public void setRouter(String router) {
        this.router = router;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
