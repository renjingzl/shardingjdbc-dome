package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Orders;

import java.util.List;

@Repository
public interface OrdersMapper extends BaseMapper<Orders> {
	
	Orders getOrderByNo(String orderNo);

	List<Orders> getOrderList();
}
