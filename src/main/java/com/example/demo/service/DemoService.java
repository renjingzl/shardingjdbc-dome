package com.example.demo.service;

import com.example.demo.entity.Orders;

import java.util.List;

public interface DemoService {

	Orders getOrder(String orderNo);

	List<Orders> getOrderList();

	void saveOrder(Orders orders);

}
