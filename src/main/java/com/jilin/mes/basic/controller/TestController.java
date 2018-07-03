package com.jilin.mes.basic.controller;

/*
 * 创建时间 2018/7/3
 * 作者： 程杰
 * 博客： www.chengjie-jlu.com
 */

import com.jilin.mes.basic.model.WorkType;
import com.jilin.mes.basic.model.Worker;
import com.jilin.mes.basic.repository.WorkTypeRepository;
import com.jilin.mes.basic.repository.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/test")
public class TestController {

    private final WorkerRepository workerRepository;

    private final WorkTypeRepository workTypeRepository;

    @Autowired
    public TestController(WorkerRepository workerRepository, WorkTypeRepository workTypeRepository) {
        this.workerRepository = workerRepository;
        this.workTypeRepository = workTypeRepository;
    }

    @GetMapping
    @ResponseBody
    public List<WorkType> get() {

        
        return workerRepository.findById("a1").orElse(null).getTypes();

    }
}
