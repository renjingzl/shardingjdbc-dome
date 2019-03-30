package com.example.demo.config;


import io.shardingsphere.api.algorithm.sharding.PreciseShardingValue;
import io.shardingsphere.api.algorithm.sharding.standard.PreciseShardingAlgorithm;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class OrdersTableShardingAlgorithm implements PreciseShardingAlgorithm<String> {

	@Override
    public String doSharding(Collection<String> availableTargetNames, PreciseShardingValue<String> shardingValue) {
        for (String tableName : availableTargetNames) {
            System.out.println("tableName: " + tableName);
            if (tableName.endsWith(Long.parseLong(shardingValue.getValue().toString()) % 10+"")) {
                return tableName;
            }
        }

        throw new UnsupportedOperationException();
    }


}