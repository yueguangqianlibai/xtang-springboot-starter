package com.xtang.controller;

import com.xtang.common.XTangJSONResult;
import com.xtang.pojo.Users;
import com.xtang.service.UserService;
import org.n3r.idworker.Sid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * @program: xtang-springboot-starter
 * @Date: 2019/7/3 23:23
 * @Author: xTang
 * @Description:
 */
@RestController
@RequestMapping("users")
public class UsersController {

    @Autowired
    private UserService userService;

    @Autowired
    private Sid sid;

    @RequestMapping("/saveUser")
    public XTangJSONResult saveUser() throws Exception {

        String userId = sid.nextShort();

        Users user = new Users();
        user.setId(userId);
        user.setUsername("xiaotang" + new Date());
        user.setPassword("2019-07-03");
        user.setCreateTime(new Date());

        userService.saveUser(user);

        return XTangJSONResult.ok("保存成功");
    }

    @RequestMapping("list")
    public XTangJSONResult userList(Integer pageNum,Integer pageSize){
        List<Users> list = userService.queryUserList(pageNum, pageSize);
        return XTangJSONResult.ok(list);
    }
}
