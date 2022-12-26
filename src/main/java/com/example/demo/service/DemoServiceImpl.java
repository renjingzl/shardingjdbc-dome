package com.example.demo.service;

import com.example.demo.entity.Orders;
import com.example.demo.mapper.OrdersMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DemoServiceImpl implements DemoService{

	@Autowired
	OrdersMapper ordersMapper;

	@Override
	public Orders getOrder(String orderNo) {
		return ordersMapper.getOrderByNo(orderNo);
	}

	@Override
	public List<Orders> getOrderList() {
		return ordersMapper.getOrderList();
	}

	@Override
	public void saveOrder(Orders orders) {
		ordersMapper.insert(orders);
	}
}
