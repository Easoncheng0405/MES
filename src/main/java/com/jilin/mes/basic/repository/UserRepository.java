package com.jilin.mes.basic.repository;

import com.jilin.mes.basic.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
 * 作者：程杰
 * 创建时间：2018/7/4
 * 博客地址：www.chengjie-jlu.com
 */
@Repository
public interface UserRepository extends JpaRepository<User, String> {

    User findByName(String name);

    User findByNameAndPassword(String name, String password);
}
