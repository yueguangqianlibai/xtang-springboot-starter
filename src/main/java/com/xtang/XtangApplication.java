package com.xtang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.xtang","org.n3r.idworker"})
public class XtangApplication {

	public static void main(String[] args) {
		SpringApplication.run(XtangApplication.class, args);
	}

}
