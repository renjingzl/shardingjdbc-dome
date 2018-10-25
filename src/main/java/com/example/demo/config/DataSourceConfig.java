package com.example.demo.config;

import io.shardingjdbc.core.api.config.ShardingRuleConfiguration;
import io.shardingjdbc.core.api.config.TableRuleConfiguration;
import io.shardingjdbc.core.api.config.strategy.StandardShardingStrategyConfiguration;
import io.shardingjdbc.core.jdbc.core.datasource.ShardingDataSource;
import org.apache.commons.dbcp.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.*;

@Configuration
@MapperScan(basePackages = "com.example.demo.mapper", sqlSessionTemplateRef = "testSqlSessionTemplate")
public class DataSourceConfig {

	@Value("${spring.datasource.db0.driver-class-name}")
	private String driverClassName;
	@Value("${spring.datasource.db0.url}")
	private String url;
	@Value("${spring.datasource.db0.username}")
	private String username;
	@Value("${spring.datasource.db0.password}")
	private String password;

	@Bean(name = "shardingDataSource")
	DataSource getShardingDataSource() throws SQLException {
		ShardingRuleConfiguration shardingRuleConfig = new ShardingRuleConfiguration();
		shardingRuleConfig.getTableRuleConfigs().add(getOrderTableRuleConfiguration());
		shardingRuleConfig.getTableRuleConfigs().add(getOrderBikeTableRuleConfiguration());// 多个分表可以用
//		分片规则相同组的放在一起。
//		例：订单表和订单项表，均按照订单ID分片，则此两张表互为BindingTable关系。
//		BindingTable关系的多表关联查询不会出现笛卡尔积关联，关联查询效率将大大提升。参考：http://shardingsphere.io/document/current/cn/features/sharding/concept/sql/
//		shardingRuleConfig.getBindingTableGroups().add("orders,orders_bike");
		
		// shardingRuleConfig.setDefaultDatabaseShardingStrategyConfig(
		//new StandardShardingStrategyConfiguration("order_no", DemoDatabaseShardingAlgorithm.class.getName()));
		//设置分片策略，自定义分片策略类
		shardingRuleConfig.setDefaultTableShardingStrategyConfig(
				new StandardShardingStrategyConfiguration("order_no", DemoTableShardingAlgorithm.class.getName()));
		return new ShardingDataSource(shardingRuleConfig.build(createDataSourceMap()));
	}

	@Bean
	TableRuleConfiguration getOrderTableRuleConfiguration() {
		TableRuleConfiguration orderTableRuleConfig = new TableRuleConfiguration();
		// 配置逻辑表名，并非数据库中真实存在的表名
		orderTableRuleConfig.setLogicTable("orders");
		// 配置真实的数据节点，即数据库中真实存在的节点，由数据源名 + 表名组成
		// ${} 是一个groovy表达式，[]表示枚举，{...}表示一个范围。
		// 整个inline表达式最终会是一个笛卡尔积，表示bike_order.orders_0, bike_order.orders_1, bike_order.orders_2, bike_order.orders_3,...
		orderTableRuleConfig.setActualDataNodes("bike_order.orders_${0..9}");
		//主键生成列
		orderTableRuleConfig.setKeyGeneratorColumnName("order_no");
		return orderTableRuleConfig;
	}

	// 多个分表可以用,作用同上
	@Bean
	TableRuleConfiguration getOrderBikeTableRuleConfiguration() {
		TableRuleConfiguration orderTableRuleConfig = new TableRuleConfiguration();
		orderTableRuleConfig.setLogicTable("orders_bike");
		orderTableRuleConfig.setActualDataNodes("bike_order.orders_bike_${0..9}");
		orderTableRuleConfig.setKeyGeneratorColumnName("order_no");
		return orderTableRuleConfig;
	}

	// 因为配置了sqlSessionFactory，所以会选择框架默认的配置，
	// 而配置文件中的mybatis.configuration不生效，需要将application.properties
	// mybatis的congfig加载到类中，再注入到SqlSessionFactoryBean中
	@Bean(name = "mybatisConfig")
	@ConfigurationProperties(prefix = "mybatis.configuration")
	org.apache.ibatis.session.Configuration configuration() {
		return new org.apache.ibatis.session.Configuration();
	}

	/**
	 * 需要手动配置事务管理器
	 * @param shardingDataSource
	 * @return
	 */
	@Bean
	public DataSourceTransactionManager transactitonManager(DataSource shardingDataSource) {
		return new DataSourceTransactionManager(shardingDataSource);
	}

	@Bean
	public SqlSessionFactory sqlSessionFactory(DataSource shardingDataSource,
			org.apache.ibatis.session.Configuration mybatisConfig) throws Exception {
		SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
		bean.setDataSource(shardingDataSource);//替换原理的DataSource，改用shardingDataSource
		bean.setConfiguration(mybatisConfig);
		bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapper/*.xml"));
		return bean.getObject();
	}

	@Bean
	public SqlSessionTemplate testSqlSessionTemplate(SqlSessionFactory sqlSessionFactory) throws Exception {
		return new SqlSessionTemplate(sqlSessionFactory);
	}

	private Map<String, DataSource> createDataSourceMap() {
		Map<String, DataSource> result = new HashMap<>();
		result.put("bike_order", createDataSource("bike_order"));
		return result;
	}

	private DataSource createDataSource(final String dataSourceName) {
		BasicDataSource result = new BasicDataSource();
		result.setDriverClassName(com.mysql.jdbc.Driver.class.getName());
		result.setUrl(
				String.format(url + "%s?useUnicode=true&characterEncoding=UTF-8&useSSL=false", dataSourceName));
		result.setUsername(username);
		result.setPassword(password);
		return result;
	}

}
