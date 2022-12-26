package com.example.demo.mapper;

import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface ZkqClientMapper {

    Map<String, Object> selectByPrimaryKey(Long id);
}