package com.sunliangliang.springsource;

import com.sunliangliang.springsource.util.SpringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = {"com"})
public class SpringSourceApplication {
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringSourceApplication.class, args);
	}
}
