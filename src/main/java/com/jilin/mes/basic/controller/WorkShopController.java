package com.jilin.mes.basic.controller;

/*
 * 作者：程杰
 * 创建时间：2018/7/4
 * 博客地址：www.chengjie-jlu.com
 */


import com.jilin.mes.basic.constant.Router;
import com.jilin.mes.basic.model.WorkShop;
import com.jilin.mes.basic.repository.WorkShopRepository;
import com.jilin.mes.basic.util.AccessUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Date;


/**
 * 车间信息页面
 */
@Controller
public class WorkShopController {

    private final WorkShopRepository workShopRepository;

    @Autowired
    public WorkShopController(WorkShopRepository workShopRepository) {
        this.workShopRepository = workShopRepository;
    }

    /**
     * 页面返回路由
     *
     * @return 页面
     */
    @GetMapping(Router.WORKSHOP)
    public String get(Model model, HttpSession session) {

        if (!AccessUtil.hasAccess(Router.WORKSHOP, session))
            return "denied";
        model.addAttribute("list", workShopRepository.findAll());
        return "workShop";
    }


    /**
     * 添加车间记录
     * @return 操作结果
     */
    @PostMapping(Router.WORKSHOP_ADD)
    @ResponseBody
    public String add(WorkShop shop,HttpSession session) {

        if (!AccessUtil.hasAccess(Router.WORKSHOP_ADD, session))
            return "没有访问权限！";
        if (workShopRepository.findByNumber(shop.getNumber()) != null)
            return "已经存在编号为 " + shop.getNumber() + " 的车间";

        shop.setDate(new Date());
        shop.setUser("root");
        workShopRepository.save(shop);

        return "成功添加记录！";
    }

    @PostMapping(Router.WORKSHOP_DEL)
    @ResponseBody
    public String del(String number,HttpSession session) {

        if (!AccessUtil.hasAccess(Router.WORKSHOP_DEL, session))
            return "没有访问权限！";

        workShopRepository.delete(workShopRepository.findByNumber(number));
        return "成功删除记录！";
    }

    @PostMapping(Router.WORKSHOP_MODIFY)
    @ResponseBody
    public String modify(WorkShop shop,HttpSession session) {


        if (!AccessUtil.hasAccess(Router.WORKSHOP_MODIFY, session))
            return "没有访问权限！";

        WorkShop workShop = workShopRepository.findByNumber(shop.getNumber());
        workShop.setName(shop.getName());
        workShop.setNote(shop.getNote());
        workShopRepository.save(workShop);
        return "成功修改记录！";
    }
}
