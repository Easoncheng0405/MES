package com.jilin.mes.basic.repository;

import com.jilin.mes.basic.model.Access;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
 * 作者：程杰
 * 创建时间：2018/7/4
 * 博客地址：www.chengjie-jlu.com
 */
@Repository
public interface AccessRepository extends JpaRepository<Access,String> {
}
