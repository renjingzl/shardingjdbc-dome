//package com.example.demo.config2;
//
//import io.shardingjdbc.core.api.algorithm.sharding.PreciseShardingValue;
//import io.shardingjdbc.core.api.algorithm.sharding.standard.PreciseShardingAlgorithm;
//
//import java.util.Collection;
//
//public class DemoTableShardingAlgorithm implements PreciseShardingAlgorithm<String> {
//    @Override
//    public String doSharding(Collection<String> collection, PreciseShardingValue<String> preciseShardingValue) {
//        for (String each : collection) {
//        	System.out.println("each:"+each);
//        	String shardingKey = preciseShardingValue.getValue();
//            if (each.endsWith(Integer.parseInt(shardingKey.trim().substring(shardingKey.length()-1,shardingKey.length()))+"")) {
//                return each;
//            }
//        }
//        throw new IllegalArgumentException();
//    }
//
//}