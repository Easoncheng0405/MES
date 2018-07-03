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
 * 职称表，这里的title是职称的意思
 */
@Entity
@Table(name = TableName.WORKER_TITLE)
public class WorkerTitle {


    /**
     * 职称编号
     */
    @Id
    @Column(length = 25)
    private String number;

    /**
     * 名称
     */
    private String name;
}
