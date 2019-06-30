package com.xtang.controller;

import com.xtang.pojo.Resource;
import com.xtang.common.XTangJSONResult;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: xtang-springboot-starter
 * @Date: 2019/6/26 16:42
 * @Author: xTang
 * @Description:
 */

@RestController
public class HelloController {

    @Autowired
    private Resource resource;

    @RequestMapping("/hello")
    public Object hello(){
        return "hello springboot~";
    }

    @RequestMapping("/getResource")
    public XTangJSONResult getResource(){
        Resource bean = new Resource();
        BeanUtils.copyProperties(resource,bean);

        return XTangJSONResult.ok(bean);
    }
}
