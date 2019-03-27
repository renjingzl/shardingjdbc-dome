package com.example.demo.mapper;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.Orders;

import java.util.List;

@Repository
public interface OrdersMapper {
	
	Orders getOrderByNo(String orderNo);

	List<Orders> getOrderList();
	
}
