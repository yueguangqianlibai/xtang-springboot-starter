package com.xtang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(basePackages = "com.xtang.dao")
@ComponentScan(basePackages = {"com.xtang","org.n3r.idworker"})
public class XtangApplication {

	public static void main(String[] args) {
		SpringApplication.run(XtangApplication.class, args);
	}

}
