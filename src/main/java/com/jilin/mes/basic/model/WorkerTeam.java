package com.jilin.mes.basic.model;

/*
 * 创建时间 2018/7/3
 * 作者： 程杰
 * 博客： www.chengjie-jlu.com
 */


import com.jilin.mes.basic.constant.TableName;

import javax.persistence.*;


/**
 * 班组表
 */
@Entity
@Table(name = TableName.WORKER_TEAM)
public class WorkerTeam {


    public static void main(){}


    /**
     * 班组编号
     */
    @Id
    @Column(length = 25)
    private String number;


    /**
     *班组名称
     */
    private String name;


    /**
     * 所属车间
     */
    @ManyToOne
    private WorkShop workShop;
}
