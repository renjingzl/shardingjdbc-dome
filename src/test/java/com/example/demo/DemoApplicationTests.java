package com.example.demo;

import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.entity.Orders;
import com.example.demo.service.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	@Autowired
	DemoService demoService;

	@Test
	public void contextLoads() {
		Orders order = demoService.getOrder("297454965260130006");
		System.out.println("查询结果：" + order);
	}

	@Test
	public void getOrderList() {
        List<Orders> orderList = demoService.getOrderList();
        orderList.forEach((e)-> System.out.println("查询结果：" + e));
	}


	/**  
	 * @Description: 测试防止缓存击穿
	*/
	@Test
	public void TestBloomFilter() {
		int count = 1000000;
		int foundKey = 488889;
		BloomFilter<Integer> bloomFilter = BloomFilter.create(Funnels.integerFunnel(), count, 0.01);
		for (int i = 0; i < count; i++) {
			bloomFilter.put(i);
		}
		long start = System.nanoTime();
		if(bloomFilter.mightContain(foundKey)) {
			System.out.println("存在");
		}else {
			System.out.println("不存在");
		}
		System.out.println("查到用时：" + (System.nanoTime() - start) + "微秒");

		int sum = 0;
		for (int i = count + 20000; i < count + 30000; i++) {
			if (bloomFilter.mightContain(i)) {
				sum = sum + 1;
			}
		}
		System.out.println("错判次数为:" + sum);
	}


	@Test
	public void seckill() {
//		@RequestMapping("/seckill")
//		public Boolean seckill(Long pid) {
//			String key = "666_test_seckill_" + pid;
//			int userId = user.incrementAndGet();
//			redisTemplate.setEnableTransactionSupport(true);
//			redisTemplate.watch(key);
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			Object count = redisTemplate.opsForValue().get(key);
//			if (count != null && Integer.parseInt(count.toString()) == 5) {
//				redisTemplate.unwatch();
//				return false;
//			}
//			redisTemplate.multi();
//			redisTemplate.opsForValue().increment(key, 1);
//			redisTemplate.opsForList().rightPush(pid + "-" + "user", userId + "");
//			List list = redisTemplate.exec();
//			//队列不执行的原因：没有执行exec；监控的key发送了改变；取消事务discard
//			if (list == null || list.isEmpty()) {
//				System.out.println(userId + "秒杀失败");
//			} else {
//				System.out.println(userId + "秒杀成功");
//			}
//			redisTemplate.setEnableTransactionSupport(false);
//			return true;
//		}
	}
}
