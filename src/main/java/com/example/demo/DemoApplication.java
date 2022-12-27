package com.example.demo;

import com.thebeastshop.forest.springboot.annotation.ForestScan;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.example.demo.mapper")
//@ForestScan(basePackages = "com.example.demo")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("==========项目启动完成=========");
	}
}
