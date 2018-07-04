package com.jilin.mes.basic.model;

/*
 * 创建时间 2018/7/3
 * 作者： 程杰
 * 博客： www.chengjie-jlu.com
 */

import com.jilin.mes.basic.constant.TableName;

import javax.persistence.*;
import java.util.Date;


/**
 * 车间
 */
@Entity
@Table(name = TableName.WORKER_SHOP)
public class WorkShop {


    /**
     * 车间编号
     */
    @Id
    @Column(length = 25)
    private String number;


    /**
     * 车间名称
     */
    private String name;

    /**
     * 备注
     */
    private String note;

    /**
     * 创建时间
     */
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    /**
     * 创建人(暂定)
     */
    private String user;


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

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
