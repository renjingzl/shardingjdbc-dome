package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.entity.Orders;
import com.example.demo.service.DemoService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	@Autowired
	DemoService demoService;

	@Test
	public void contextLoads() {
		Orders order = demoService.getOrder("297454965260130006");
		System.out.println("over.........." + (order == null ? "null" : order));
	}
}
