package com.jilin.mes.basic.controller;

/*
 * 作者：程杰
 * 创建时间：2018/7/4
 * 博客地址：www.chengjie-jlu.com
 */


import com.jilin.mes.basic.constant.AccessMap;
import com.jilin.mes.basic.constant.Router;
import com.jilin.mes.basic.model.Access;
import com.jilin.mes.basic.model.User;
import com.jilin.mes.basic.repository.AccessRepository;
import com.jilin.mes.basic.repository.UserRepository;
import com.jilin.mes.basic.util.AccessUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

@Controller
public class AccessController {


    private final UserRepository userRepository;

    private final AccessRepository accessRepository;

    @Autowired
    public AccessController(UserRepository userRepository, AccessRepository accessRepository) {
        this.userRepository = userRepository;
        this.accessRepository = accessRepository;
        initAccess();
    }

    @PostMapping(Router.ACCESS_MODIFY)
    @ResponseBody
    public String modify(@RequestParam String name, @RequestParam String access,HttpSession session,
                         @RequestParam(required = false) String select,
                         @RequestParam(required = false) String add,
                         @RequestParam(required = false) String modify,
                         @RequestParam(required = false) String del) {

        if (!AccessUtil.hasAccess(Router.ACCESS_MODIFY, session))
            return "没有访问权限！";

        User user = userRepository.findByName(name);

        ArrayList<Access> list = new ArrayList<>();

        //把已有权限先添加到列表，正在修改的权限去除
        for (Access a : user.getAccesses()) {
            if (!a.getName().equals(access))
                list.add(a);
        }

        HashMap<String, String> map = AccessMap.getCRUDMap();

        if (select != null && !select.equals("")) {
            Access a = new Access();
            a.setName(access);
            a.setRouter(map.get(access));
            list.add(a);
        }

        if (add != null && !add.equals("")) {
            Access a = new Access();
            a.setName(access);
            a.setRouter(map.get(access) + "/add");
            list.add(a);
        }


        if (modify != null && !modify.equals("")) {
            Access a = new Access();
            a.setName(access);
            a.setRouter(map.get(access) + "/modify");
            list.add(a);
        }


        if (del != null && !del.equals("")) {
            Access a = new Access();
            a.setName(access);
            a.setRouter(map.get(access) + "/del");
            list.add(a);
        }

        user.setAccesses(list);

        userRepository.save(user);

        return "权限修改成功！";
    }


    private void initAccess() {

        HashMap<String, String> map = AccessMap.getCRUDMap();

        Set<String> set = map.keySet();


        //经过这一步操作就把AccessMap里CRUDMap里的增删改查权限添加到数据库了
        for (String str : set) {

            String router = map.get(str);
            Access access = new Access();

            access.setName(str);
            access.setRouter(router);
            accessRepository.save(access);

            access.setName(str);
            access.setRouter(router + "/add");
            accessRepository.save(access);


            access.setName(str);
            access.setRouter(router + "/del");
            accessRepository.save(access);

            access.setName(str);
            access.setRouter(router + "/modify");
            accessRepository.save(access);

        }
    }

}
