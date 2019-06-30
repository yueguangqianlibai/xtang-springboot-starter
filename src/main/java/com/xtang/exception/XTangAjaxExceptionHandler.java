package com.xtang.exception;

import com.xtang.common.XTangJSONResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletResponse;

/**
 * @program: xtang-springboot-starter
 * @Date: 2019/6/27 22:48
 * @Author: xTang
 * @Description:
 */
@RestControllerAdvice
public class XTangAjaxExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public XTangJSONResult defaultErrorHandler(HttpServletResponse req,Exception e) throws Exception{

        e.printStackTrace();

        return XTangJSONResult.errorException(e.getMessage());
    }

}
