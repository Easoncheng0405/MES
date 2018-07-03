package com.jilin.mes.basic.model;

/*
 * 创建时间 2018/7/3
 * 作者： 程杰
 * 博客： www.chengjie-jlu.com
 */


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.jilin.mes.basic.constant.TableName;

import javax.persistence.*;
import java.util.List;


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
    @Column(length = 25)
    private String number;

    /**
     * 所属工种编号
     */
    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "workers")
    @JsonIgnore //这里添加JsonIgnore是因为在序列化得时候关系双方会递归无限调用toString导致栈溢出
    private List<WorkType> types;


    /**
     * 所属车间编号
     */
    @ManyToOne
    private WorkShop workShop;

    /**
     * 所属班组编号
     */
    @ManyToOne
    private WorkerTeam workerTeam;


    /**
     * 职称编号
     */
    @ManyToOne
    private WorkerTitle workerTitle;


    /**
     * 所属科室编号
     */
    @ManyToOne
    private Department department;


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public List<WorkType> getTypes() {
        return types;
    }

    public void setTypes(List<WorkType> types) {
        this.types = types;
    }

    public WorkShop getWorkShop() {
        return workShop;
    }

    public void setWorkShop(WorkShop workShop) {
        this.workShop = workShop;
    }

    public WorkerTeam getWorkerTeam() {
        return workerTeam;
    }

    public void setWorkerTeam(WorkerTeam workerTeam) {
        this.workerTeam = workerTeam;
    }

    public WorkerTitle getWorkerTitle() {
        return workerTitle;
    }

    public void setWorkerTitle(WorkerTitle workerTitle) {
        this.workerTitle = workerTitle;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
