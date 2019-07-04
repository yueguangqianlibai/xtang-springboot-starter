package com.xtang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan(basePackages = "com.xtang.dao")
@ComponentScan(basePackages = {"com.xtang","org.n3r.idworker"})
@EnableScheduling//开启定时任务
@EnableAsync//开启异步调用方法
public class XtangApplication {

	public static void main(String[] args) {
		SpringApplication.run(XtangApplication.class, args);
	}

}
