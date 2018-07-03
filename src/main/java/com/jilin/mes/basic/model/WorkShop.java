package com.jilin.mes.basic.model;

/*
 * 创建时间 2018/7/3
 * 作者： 程杰
 * 博客： www.chengjie-jlu.com
 */

import com.jilin.mes.basic.constant.TableName;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * 车间
 */
@Entity
@Table(name = TableName.WORKER_SHOP)
public class WorkShop {


    /**
     * 车间编号
     */
    @Id
    private String number;


    /**
     * 车间名称
     */
    private String name;
}
