//package com.example.demo.config;
//
//import io.shardingsphere.api.config.ShardingRuleConfiguration;
//import io.shardingsphere.api.config.TableRuleConfiguration;
//import io.shardingsphere.api.config.strategy.StandardShardingStrategyConfiguration;
//import io.shardingsphere.shardingjdbc.api.ShardingDataSourceFactory;
//import org.apache.commons.dbcp.BasicDataSource;
//import org.mybatis.spring.annotation.MapperScan;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import javax.sql.DataSource;
//import java.sql.SQLException;
//import java.util.*;
//
//@Configuration
//@MapperScan(basePackages = "com.example.demo.mapper")
//public class DataSourceConfig {
//
//	@Value("${spring.datasource.db0.driver-class-name}")
//	private String driverClassName;
//	@Value("${spring.datasource.db0.url}")
//	private String url;
//	@Value("${spring.datasource.db0.username}")
//	private String username;
//	@Value("${spring.datasource.db0.password}")
//	private String password;
//
//	@Autowired
//    private OrdersTableShardingAlgorithm ordersTableShardingAlgorithm;
//
//	@Bean(name = "shardingDataSource")
//	DataSource getShardingDataSource() throws SQLException {
//        ShardingRuleConfiguration shardingRuleConfig = new ShardingRuleConfiguration();
//        TableRuleConfiguration tableRule = new TableRuleConfiguration();
//        tableRule.setLogicTable("orders");
//        tableRule.setActualDataNodes("bike_order.orders_$->{0..9}");
//        tableRule.setKeyGeneratorColumnName("order_id");
//        tableRule.setTableShardingStrategyConfig(new StandardShardingStrategyConfiguration("order_no", ordersTableShardingAlgorithm, null));
//        shardingRuleConfig.getTableRuleConfigs().add(tableRule);
//
//        Properties props = new Properties();
//		props.put("sql.show", true);
//        return ShardingDataSourceFactory.createDataSource(createDataSourceMap(), shardingRuleConfig, new HashMap<String, Object>(), props);
//	}
//
//	private Map<String, DataSource> createDataSourceMap() {
//		Map<String, DataSource> result = new HashMap<>();
//		result.put("bike_order", createDataSource("bike_order"));
//		return result;
//	}
//
//	private DataSource createDataSource(final String dataSourceName) {
//		BasicDataSource result = new BasicDataSource();
//		result.setDriverClassName(com.mysql.jdbc.Driver.class.getName());
//		result.setUrl(
//				String.format(url + "%s?useUnicode=true&characterEncoding=UTF-8&useSSL=false", dataSourceName));
//		result.setUsername(username);
//		result.setPassword(password);
//		return result;
//	}
//
//}
