package com.example.demo.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.example.demo.DBConstants;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface ZkqClientMapper {

    @DS(value = DBConstants.SHARDING)
    Map<String, Object> selectByPrimaryKey(Long id);
}