package com.xtang.exception;

import com.xtang.common.XTangJSONResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @program: xtang-springboot-starter
 * @Date: 2019/6/27 21:35
 * @Author: xTang
 * @Description:
 */
@ControllerAdvice
public class XTangExceptionHandler {

    public static final String XTANG_ERROR_VIEW = "error";

//    @ExceptionHandler(value = Exception.class)
//    public Object errorHandler(HttpServletRequest request, HttpServletResponse response,Exception e) throws Exception{
//        e.printStackTrace();
//
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject("exception",e);
//        modelAndView.addObject("url",request.getRequestURL());
//        modelAndView.setViewName(XTANG_ERROR_VIEW);
//        return modelAndView;
//    }


    @ExceptionHandler(value = Exception.class)
    public Object errorHandler(HttpServletRequest request,HttpServletResponse response,Exception e){
        e.printStackTrace();

        if (isAjax(request)){
            return XTangJSONResult.errorException(e.getMessage());
        }else {
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.addObject("exception",e);
            modelAndView.addObject("url",request.getRequestURL());
            modelAndView.setViewName(XTANG_ERROR_VIEW);
            return modelAndView;
        }
    }


    /**
    * @Description: 判断是否是ajax请求
    */
    public static boolean isAjax(HttpServletRequest httpServletRequest){
        return (httpServletRequest.getHeader("X-Requested-With") != null && "XMLHttpRequest".
                equals(httpServletRequest.getHeader("X-Requested-With").toString()));
    }
}
