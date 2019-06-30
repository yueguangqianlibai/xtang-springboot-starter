package com.xtang.controller;

import com.xtang.common.XTangJSONResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: xtang-springboot-starter
 * @Date: 2019/6/27 21:31
 * @Author: xTang
 * @Description:
 */
@Controller
@RequestMapping("err")
public class ErrorController {

    @RequestMapping("/error")
    public String error() {
        int a = 1 / 0;
        return "thymeleaf/error";
    }

    @RequestMapping("/ajaxError")
    public String ajaxError() {
        return "thymeleaf/ajaxError";
    }

    @RequestMapping("/getAjaxError")
    @ResponseBody
    public XTangJSONResult getAjaxError() {
        int a = 1 / 0;
        return XTangJSONResult.ok();
    }
}
