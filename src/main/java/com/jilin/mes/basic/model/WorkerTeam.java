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
 * 班组表
 */
@Entity
@Table(name = TableName.WORKER_TEAM)
public class WorkerTeam {


    /**
     * 班组编号
     */
    @Id
    private String number;


    /**
     *班组名称
     */
    private String name;
}
