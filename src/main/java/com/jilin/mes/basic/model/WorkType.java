package com.jilin.mes.basic.model;

/*
 * 创建时间 2018/7/3
 * 作者： 程杰
 * 博客： www.chengjie-jlu.com
 */


import com.jilin.mes.basic.constant.TableName;

import javax.persistence.*;
import java.util.List;


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
    @Column(length = 25)
    private String number;

    /**
     * 工种名称
     */
    private String name;


    /**
     * 此工种下的所有工人
     */
    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<Worker> workers;


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Worker> getWorkers() {
        return workers;
    }

    public void setWorkers(List<Worker> workers) {
        this.workers = workers;
    }
}
