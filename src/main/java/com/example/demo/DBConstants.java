package com.example.demo;

/**
 * @description:
 * @author: renjing
 * @create: 2022-12-27 13:59
 * @Version 1.0
 **/
public class DBConstants {

    /**
     * 数据源分组 - 巡店库
     * 这里的tour是yml中的 spring.datasource.dynamic.datasource.tour
     */
    public static final String TOUR = "tour";

    /**
     * 数据源分组 - 阿瓦隆库
     * 这里的avalon是yml中的 spring.datasource.dynamic.datasource.avalon
     */
    public static final String AVALON = "avalon";

    /**
     * 数据源分组 - 分库分表
     */
    public static final String SHARDING = "sharding";
}