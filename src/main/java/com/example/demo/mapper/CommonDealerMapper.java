package com.example.demo.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.example.demo.DBConstants;
import com.example.demo.entity.AvalonCommonDealer;
import com.example.demo.entity.CommonDealerEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


/**
 * Created by harper on 2021/3/25.
 */
@Repository
public interface CommonDealerMapper {

    CommonDealerEntity getCommonDealer(@Param("clientCode") String clientCode);

    @DS(value = DBConstants.AVALON)
    AvalonCommonDealer getShuCangCommonDealer(@Param("clientCode") String clientCode);
}
