package com.xtang.tasks;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.concurrent.Future;

/**
 * @program: xtang-springboot-starter
 * @Date: 2019/7/4 10:41
 * @Author: xTang
 * @Description:
 */
@Component
public class AsyncTask {

    @Async
    public Future<Boolean> doTask11() throws Exception {
        long start = System.currentTimeMillis();
        Thread.sleep(1000);
        long end = System.currentTimeMillis();
        System.out.println("任务一耗时："+(end-start)+"毫秒");
        return new AsyncResult<>(true);
    }

    @Async
    public Future<Boolean> doTask22() throws Exception {
        long start = System.currentTimeMillis();
        Thread.sleep(700);
        long end = System.currentTimeMillis();
        System.out.println("任务一耗时："+(end-start)+"毫秒");
        return new AsyncResult<>(true);
    }


    @Async
    public Future<Boolean> doTask33() throws Exception {
        long start = System.currentTimeMillis();
        Thread.sleep(600);
        long end = System.currentTimeMillis();
        System.out.println("任务一耗时："+(end-start)+"毫秒");
        return new AsyncResult<>(true);
    }
}
