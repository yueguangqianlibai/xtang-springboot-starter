package com.xtang.controller;

import com.xtang.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @program: xtang-springboot-starter
 * @Date: 2019/6/26 23:04
 * @Author: xTang
 * @Description:
 */
@Controller
@RequestMapping("th")
public class ThymeleafController {

    @RequestMapping("/index")
    public String index(ModelMap map){
        map.addAttribute("name","thymeleaf-Thymeleaf-xtang-index.html");
        return "thymeleaf/index";
    }

    @RequestMapping("center")
    public String center(){
        return "thymeleaf/center/center";
    }

    @RequestMapping("test")
    public String test(ModelMap map){
        User user = new User();
        user.setUsername("xiaotang");
        user.setAge(18);
        user.setEmail("cooldude008@163.com");
        user.setPhone("15686058902");
        user.setCreateTime(new Date());
        user.setDesc("<font color='red'><b>USER_DESC</b></font>");

        map.addAttribute("user",user);

        User user1 = new User();
        user1.setUsername("xiaowu");
        user1.setAge(22);
        user1.setEmail("xiaowushisb@163.com");
        user1.setPhone("18688888888");
        user1.setCreateTime(new Date());

        User user2 = new User();
        user2.setUsername("xiaohei");
        user2.setAge(8);
        user2.setEmail("xiaoheishixiaokeai@163.com");
        user2.setPhone("17688888888");
        user2.setCreateTime(new Date());

        List<User> userList = new ArrayList<>();
        userList.add(user);
        userList.add(user1);
        userList.add(user2);

        map.addAttribute("userList", userList);

        return "thymeleaf/test";
    }

    @PostMapping("postform")
    public String postform(User user){
        System.err.println("姓名"+user.getUsername());
        System.err.println("年龄"+user.getAge());
        System.err.println("电话"+user.getPhone());
        return "redirect:/th/test";
    }
}
