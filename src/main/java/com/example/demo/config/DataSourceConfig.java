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
        shardingRuleConfig.getTableRuleConfigs().add(getOrderBikeTableRuleConfiguration());//多个分表可以用
        shardingRuleConfig.getBindingTableGroups().add("orders");
//        shardingRuleConfig.setDefaultDatabaseShardingStrategyConfig(new StandardShardingStrategyConfiguration("order_no", DemoDatabaseShardingAlgorithm.class.getName()));
        shardingRuleConfig.setDefaultTableShardingStrategyConfig(new StandardShardingStrategyConfiguration("order_no", DemoTableShardingAlgorithm.class.getName()));
        return new ShardingDataSource(shardingRuleConfig.build(createDataSourceMap()));
    }

    @Bean
    TableRuleConfiguration getOrderTableRuleConfiguration() {
        TableRuleConfiguration orderTableRuleConfig = new TableRuleConfiguration();
        orderTableRuleConfig.setLogicTable("orders");
        orderTableRuleConfig.setActualDataNodes("bike_order.orders_${0..9}");
        orderTableRuleConfig.setKeyGeneratorColumnName("order_no");
        return orderTableRuleConfig;
    }
    
    //多个分表可以用
    @Bean
    TableRuleConfiguration getOrderBikeTableRuleConfiguration() {
    	TableRuleConfiguration orderTableRuleConfig = new TableRuleConfiguration();
    	orderTableRuleConfig.setLogicTable("orders_bike");
    	orderTableRuleConfig.setActualDataNodes("bike_order.orders_bike_${0..9}");
    	orderTableRuleConfig.setKeyGeneratorColumnName("order_no");
    	return orderTableRuleConfig;
    }
    
    @Bean(name="mybatisConfig")
    @ConfigurationProperties(prefix="mybatis.configuration")
    org.apache.ibatis.session.Configuration configuration() {
    	return new org.apache.ibatis.session.Configuration();
    }

    /**
     * 需要手动配置事务管理器
     *
     * @param shardingDataSource
     * @return
     */
    @Bean
    public DataSourceTransactionManager transactitonManager(DataSource shardingDataSource) {
        return new DataSourceTransactionManager(shardingDataSource);
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource shardingDataSource, org.apache.ibatis.session.Configuration mybatisConfig) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(shardingDataSource);
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
        result.setUrl(String.format(url + "%s%s", dataSourceName, "?useUnicode=true&characterEncoding=UTF-8&useSSL=false"));
        result.setUsername(username);
        result.setPassword(password);
        return result;
    }

}
