package com.example.demo.controller;

import com.example.demo.service.ForestDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class ForestDemoController {

	@Autowired
	ForestDemoService forestDemoService;

	@RequestMapping("/forest/test")
	public Map getLocation() {
		return forestDemoService.getLocation("124.730329", "31.463683");
	}
}
