package com.jilin.mes.basic.controller;

/*
 * 创建时间 2018/7/3
 * 作者： 程杰
 * 博客： www.chengjie-jlu.com
 */

import com.jilin.mes.basic.constant.Router;
import com.jilin.mes.basic.model.Access;
import com.jilin.mes.basic.model.User;
import com.jilin.mes.basic.model.WorkType;
import com.jilin.mes.basic.repository.AccessRepository;
import com.jilin.mes.basic.repository.UserRepository;
import com.jilin.mes.basic.repository.WorkTypeRepository;
import com.jilin.mes.basic.repository.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试类，测试部分功能
 */
@Controller
@RequestMapping("/test")
public class TestController {

    private final UserRepository userRepository;

    private final AccessRepository accessRepository;


    public TestController(UserRepository userRepository, AccessRepository accessRepository) {
        this.userRepository = userRepository;
        this.accessRepository = accessRepository;
    }


}
