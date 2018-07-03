package com.jilin.mes.basic.model;

/*
 * 创建时间 @{DATE}
 * 作者： 程杰
 * 博客： www.chengjie-jlu.com
 */


import com.jilin.mes.basic.constant.TableName;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


/**
 * 人员工种单位信息表
 */
@Entity
@Table(name = TableName.WORKER)
public class Worker {


    /**
     * 工号作为ID
     */
    @Id
    private String number;

    /**
     * 所属工种编号
     */
    @OneToOne
    private WorkType type;


    /**
     * 所属车间编号
     */
    @OneToOne
    private WorkShop workShop;

    /**
     * 所属班组编号
     */
    @OneToOne
    private WorkerTeam workerTeam;


    /**
     * 职称编号
     */
    @OneToOne
    private WorkerTitle workerTitle;


    /**
     * 所属科室编号
     */
    @OneToOne
    private Department department;

}
