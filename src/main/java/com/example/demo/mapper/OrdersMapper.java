package com.example.demo.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.DBConstants;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Orders;

import java.util.List;

@Repository
public interface OrdersMapper extends BaseMapper<Orders> {

	@DS(value = DBConstants.SHARDING)
	Orders getOrderByNo(String orderNo);

	@DS(value = DBConstants.SHARDING)
	List<Orders> getOrderList();
}
