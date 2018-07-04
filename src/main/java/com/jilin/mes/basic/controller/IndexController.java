package com.jilin.mes.basic.controller;

/*
 * 创建时间 2018/7/3
 * 作者： 程杰
 * 博客： www.chengjie-jlu.com
 */

import com.jilin.mes.basic.constant.Router;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(Router.WORKER)
public class IndexController {


    @GetMapping
    public String get(){
        return "WorkShop";
    }
}
