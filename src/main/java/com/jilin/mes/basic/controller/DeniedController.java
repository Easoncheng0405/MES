package com.jilin.mes.basic.controller;

/*
 * 作者：程杰
 * 创建时间：2018/7/4
 * 博客地址：www.chengjie-jlu.com
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DeniedController {


    @GetMapping("/denied")
    public String denied() {
        return "denied";
    }
}
