# shardingjdbc-dome
只支持分表，分库需要再加配置
注：
1、config2目录中是2.X版本的配置（已弃用，保留只为了看文件中的注释说明）
2、config目录中是3.0版本的配置，需要自己写数据源和分表规则配置文件，即：DataSourceConfig.java
3、新添加3.0版本整合spring boot starter配置方法。需打开xml中依赖配置，打开yml中数据源和分表规则配置。因为配置都写到了yml中，所以config目录中我们自己写的DataSourceConfig配置可以全部去掉
4、启动类@ForestScan和ForestDemoService相关会影响单元测试启动，要注释掉
5、新增5.0版本，仅需yml中的配置



CREATE TABLE `orders_0` (
  `id` bigint NOT NULL COMMENT '主键',
  `order_no` varchar(255) NOT NULL COMMENT '订单号',
  `user_id` bigint NOT NULL COMMENT '用户id',
  `pay_amount` decimal(20,2) NOT NULL DEFAULT '0' COMMENT '支付金额',
  `order_status` int NOT NULL COMMENT '订单状态 1-已预约 2-已取车 3-已还车 4-已取消',
  `pay_status` int NOT NULL DEFAULT '0' COMMENT '支付状态 0-未支付 1-支付成功',
  `pay_method` int DEFAULT NULL COMMENT '支付方式 1-微信 2-支付宝',
  `pay_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '支付时间',
  `created_at` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updated_at` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;