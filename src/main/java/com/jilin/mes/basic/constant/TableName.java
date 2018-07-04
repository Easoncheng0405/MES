package com.jilin.mes.basic.constant;

/*
 * 创建时间 @{DATE}
 * 作者： 程杰
 * 博客： www.chengjie-jlu.com
 */

import com.jilin.mes.basic.model.*;

/**
 * 基础表名
 */
public class TableName {

    /**
     * 人员工种单位信息表
     * @see Worker
     */
    public static final String WORKER="CTMES_STAFF_WORKER";


    /**
     * 人员详细信息表
     * @see WorkDetails
     */
    public static final String WORKER_DETAILS="CTMES_STAFF_WORKER_DETAILS";


    /**
     * 工种表
     * @see WorkType
     */
    public static final String WORK_TYPE="CTMES_STAFF_WORK_TYPE";


    /**
     * 工人职称表
     * @see WorkerTitle
     */
    public static final String WORKER_TITLE="CTMES_STAFF_WORKER_TITLE";

    /**
     * 科室表
     * @see Department
     */
    public static final String DEPARTMENT="CTMES_STAFF_DEPARTMENT";


    /**
     * 车间表
     * @see WorkShop
     */
    public static final String WORKER_SHOP="CTMES_STAFF_WORKER_SHOP";


    /**
     * 班组表
     * @see WorkerTeam
     */
    public static final String WORKER_TEAM="CTMES_STAFF_WORKER_TEAM";

}
