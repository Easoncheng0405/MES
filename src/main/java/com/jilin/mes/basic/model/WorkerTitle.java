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
 * 职称表，这里的title是职称的意思
 */
@Entity
@Table(name = TableName.WORKER_TITLE)
public class WorkerTitle {


    /**
     * 职称编号
     */
    @Id
    private String number;

    /**
     * 名称
     */
    private String name;
}