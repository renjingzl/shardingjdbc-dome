# shardingjdbc-dome
只支持分表，分库需要再加配置
注：
1、config2目录中是2.X版本的配置（已弃用，保留只为了看文件中的注释说明）
2、config目录中是3.0版本的配置，需要自己写数据源和分表规则配置文件，即：DataSourceConfig.java
3、新添加3.0版本整合spring boot starter配置方法。需打开xml中依赖配置，打开yml中数据源和分表规则配置。因为配置都写到了yml中，所以config目录中我们自己写的DataSourceConfig配置可以全部去掉
4、启动类@ForestScan和ForestDemoService相关会影响单元测试启动，要注释掉
5、新增5.0版本，仅需yml中的配置


CREATE TABLE `orders_0` (
  `id` bigint NOT NULL COMMENT '主键，自动生成',
  `order_no` varchar(255) DEFAULT NULL,
  `user_id` bigint DEFAULT NULL,
  `pay_amount` decimal(20,2) DEFAULT NULL,
  `order_status` int DEFAULT NULL,
  `pay_status` int DEFAULT NULL,
  `pay_method` int DEFAULT NULL,
  `pay_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `created_at` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
