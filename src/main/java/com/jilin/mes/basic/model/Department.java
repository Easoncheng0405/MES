package com.jilin.mes.basic.model;

/*
 * 创建时间 @{DATE}
 * 作者： 程杰
 * 博客： www.chengjie-jlu.com
 */


import com.jilin.mes.basic.constant.TableName;

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
    private String number;

    /**
     * 科室名称
     */
    private String name;
}