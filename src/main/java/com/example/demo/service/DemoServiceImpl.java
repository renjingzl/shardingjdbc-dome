package com.example.demo.service;

import com.example.demo.entity.Orders;
import com.example.demo.mapper.OrdersMapper;
import groovy.util.logging.Slf4j;
import io.shardingjdbc.core.api.HintManager;
import io.shardingjdbc.core.hint.HintManagerHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Slf4j
@Service
public class DemoServiceImpl implements DemoService{

	@Resource
	OrdersMapper ordersMapper;

	public static String orderNo = "297454965260130006";

	@Transactional
	public void demo() {

//		HintManagerHolder.clear();
//		HintManager hintManager = HintManager.getInstance();
//		hintManager.addTableShardingValue("orders", "order_no", orderNo);
		Orders order = ordersMapper.getOrderByNo(orderNo);
		System.out.println("over.........." + (order == null ? "null" : order));
	}
}
