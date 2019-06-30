package com.xtang.controller;

import com.xtang.common.XTangJSONResult;
import com.xtang.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @program: xtang-springboot-starter
 * @Date: 2019/6/26 16:42
 * @Author: xTang
 * @Description:
 */

@RestController  //@RestController = @Controller + @ResponseBody
//@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/getUserInfo")
//    @ResponseBody
    public User getUserInfo(){
        User user = new User();
        user.setUsername("xiaotang");
        user.setPassword("123456");
        user.setPhone("13080901252");
        user.setEmail("cooldude008@163.com");
        user.setCreateTime(new Date());
        user.setDesc("hello springboot~");
        return user;
    }

    @RequestMapping("/getUserInfoJson")
    public XTangJSONResult getUserInfoJson(){
        User user = new User();
        user.setUsername("xiaotang");
        user.setPassword("123456");
        user.setPhone("15686058902");
        user.setEmail("cooldude008@163.com");
        user.setCreateTime(new Date());
        user.setDesc("hello springboot~");
        return XTangJSONResult.ok(user);
    }
}
