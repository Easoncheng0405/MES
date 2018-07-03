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
 * 工种编号
 */
@Entity
@Table(name = TableName.WORK_TYPE)
public class WorkType {


    /**
     * 工种编号
     */
    @Id
    private String number;

    /**
     * 工种名称
     */
    private String name;


}
