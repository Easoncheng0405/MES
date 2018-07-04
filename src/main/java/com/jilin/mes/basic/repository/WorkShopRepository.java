package com.jilin.mes.basic.repository;

import com.jilin.mes.basic.model.WorkShop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;

/*
 * 作者：程杰
 * 创建时间：2018/7/4
 * 博客地址：www.chengjie-jlu.com
 */


@Repository
public interface WorkShopRepository extends JpaRepository<WorkShop,String> {

    WorkShop findByNumber(String number);
}
