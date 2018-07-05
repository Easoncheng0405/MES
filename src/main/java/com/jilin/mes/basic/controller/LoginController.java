package com.jilin.mes.basic.controller;

/*
 * 作者：程杰
 * 创建时间：2018/7/4
 * 博客地址：www.chengjie-jlu.com
 */


import com.jilin.mes.basic.constant.Constant;
import com.jilin.mes.basic.model.User;
import com.jilin.mes.basic.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.jilin.mes.basic.constant.Router;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Date;

@Controller
@RequestMapping(Router.SYSTEM_LOGIN)
public class LoginController {

    private final UserRepository userRepository;


    private String next;

    @Autowired
    public LoginController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public String get(@RequestParam(required = false) String next) {


        this.next = next;
        User user = userRepository.findByName("admin");
        if (user == null) {
            user = new User();
            user.setDate(new Date());
            user.setName("admin");
            user.setPassword("1");
            user.setType(Constant.USER_TYPE_SUPER_ADMIN);
            userRepository.save(user);
        }
        return "login";
    }

    @PostMapping
    public String post(@RequestParam String name, @RequestParam String password, HttpSession session, Model model) {
        User user = userRepository.findByNameAndPassword(name, password);


        if (user == null) {
            model.addAttribute("error", "用户名或密码错误!");
            return "login";
        }

        session.setAttribute(Constant.CURRENT_USER, user);
        if (next == null || next.equals(""))
            return "redirect:" + Router.WORKSHOP;
        else
            return "redirect:" + next;
    }
}
