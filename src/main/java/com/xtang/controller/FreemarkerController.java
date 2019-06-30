package com.xtang.controller;

import com.xtang.pojo.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: xtang-springboot-starter
 * @Date: 2019/6/26 22:47
 * @Author: xTang
 * @Description:
 */
@Controller
@RequestMapping("ftl")
public class FreemarkerController {

    @Autowired
    private Resource resource;

    @RequestMapping("/index")
    public String index(ModelMap map){
        map.addAttribute("resource",resource);
        return "freemarker/index";
    }

    @RequestMapping("center")
    public String center(){
        return "freemarker/center/center";
    }
}
