package com.jilin.mes.basic.model;

/*
 * 创建时间 2018/7/3
 * 作者： 程杰
 * 博客： www.chengjie-jlu.com
 */


import com.jilin.mes.basic.constant.TableName;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * 科室表
 */
@Entity
@Table(name = TableName.DEPARTMENT)
public class Department {


    /**
     *科室编号
     */
    @Id
    @Column(length = 25)
    private String number;

    /**
     * 科室名称
     */
    private String name;


}
