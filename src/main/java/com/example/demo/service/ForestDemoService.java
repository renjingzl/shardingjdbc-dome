package com.example.demo.service;

import com.dtflys.forest.annotation.DataParam;
import com.dtflys.forest.annotation.Request;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public interface ForestDemoService {

	@Request(
			url = "http://ditu.amap.com/service/regeo",
			dataType = "json",
			type = "get"
	)
	Map getLocation(@DataParam("longitude") String longitude, @DataParam("latitude") String latitude);
}
