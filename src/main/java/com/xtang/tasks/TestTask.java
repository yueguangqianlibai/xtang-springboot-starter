package com.xtang.tasks;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: xtang-springboot-starter
 * @Date: 2019/7/4 10:23
 * @Author: xTang
 * @Description:
 */
@Component
public class TestTask {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("y-M-d h:m:s a E");

    /**
     * 定义没过三秒执行一次任务
     */
//    @Scheduled(fixedRate = 3000)
    @Scheduled(cron = "4-40 * * * * ? ")
    public void reportCurrentTime(){
        System.err.println("当前时间："+dateFormat.format(new Date()));
    }
}
