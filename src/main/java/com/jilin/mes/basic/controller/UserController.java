package com.jilin.mes.basic.controller;

/*
 * 作者：程杰
 * 创建时间：2018/7/4
 * 博客地址：www.chengjie-jlu.com
 */

import com.jilin.mes.basic.constant.AccessMap;
import com.jilin.mes.basic.constant.Constant;
import com.jilin.mes.basic.constant.Router;
import com.jilin.mes.basic.model.User;
import com.jilin.mes.basic.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.Set;

@Controller
public class UserController {


    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping(Router.USER)
    public String get(Model model) {
        model.addAttribute("list", userRepository.findAll());
        model.addAttribute("superAdmin", Constant.USER_TYPE_SUPER_ADMIN);
        model.addAttribute("admin", Constant.USER_TYPE_ADMIN);
        model.addAttribute("worker", Constant.USER_TYPE_WORKER);
        Set<String> set = AccessMap.getCRUDMap().keySet();
        model.addAttribute("set", set);
        return "user";
    }

    @PostMapping(Router.USER_ADD)
    @ResponseBody
    public String add(User user, HttpSession session) {


        if (!user.getType().equals(Constant.USER_TYPE_SUPER_ADMIN))
            return "只有超级管理员可以添加用户！";

        if (userRepository.findByName(user.getName()) != null)
            return "已存在名为 " + user.getName() + " 的用户!";

        User current = (User) session.getAttribute(Constant.CURRENT_USER);
        user.setDate(new Date());
        user.setUser(current.getName());
        userRepository.save(user);
        return "成功添加用户！";
    }

    @PostMapping(Router.USER_DEL)
    @ResponseBody
    public String del(String name) {

        User user = userRepository.findByName(name);

        if (user.getType().equals(Constant.USER_TYPE_SUPER_ADMIN))
            return "无法删除超级管理员!";
        userRepository.delete(user);
        return "成功删除用户！";
    }

    @PostMapping(Router.USER_MODIFY)
    @ResponseBody
    public String modify() {


        return "";
    }
}
