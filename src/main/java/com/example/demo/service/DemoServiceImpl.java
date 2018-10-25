package com.example.demo.service;

import com.example.demo.entity.Orders;
import com.example.demo.mapper.OrdersMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DemoServiceImpl implements DemoService{

	@Autowired
	OrdersMapper ordersMapper;

	public Orders getOrder(String orderNo) {
		return ordersMapper.getOrderByNo(orderNo);
	}
}
