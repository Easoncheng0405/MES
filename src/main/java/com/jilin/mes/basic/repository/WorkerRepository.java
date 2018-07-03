package com.jilin.mes.basic.repository;

import com.jilin.mes.basic.model.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
 * 创建时间 2018/7/3
 * 作者： 程杰
 * 博客： www.chengjie-jlu.com
 */

@Repository
public interface WorkerRepository extends JpaRepository<Worker,String> {


}
