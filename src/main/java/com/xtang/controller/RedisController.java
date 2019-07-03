package com.xtang.controller;

import com.xtang.common.XTangJSONResult;
import com.xtang.pojo.Users;
import com.xtang.utils.JsonUtils;
import com.xtang.utils.RedisOperator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @program: xtang-springboot-starter
 * @Date: 2019/7/3 23:10
 * @Author: xTang
 * @Description:
 */
@RestController
@RequestMapping("redis")
public class RedisController {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisOperator redisOperator;

    @RequestMapping("test")
    public XTangJSONResult test(){
        stringRedisTemplate.opsForValue().set("kay","(value)hello redis~~");

        Users user = new Users();
        user.setId("1000001");
        user.setUsername("xiaotang" + new Date());
        user.setPassword("2019-07-03");
        user.setCreateTime(new Date());
        stringRedisTemplate.opsForValue().set("json:user", JsonUtils.objectToJson(user));
        Users jsonUser = JsonUtils.jsonToPojo(stringRedisTemplate.opsForValue().get("json:user"),Users.class);
        return XTangJSONResult.ok(jsonUser);
    }

}
