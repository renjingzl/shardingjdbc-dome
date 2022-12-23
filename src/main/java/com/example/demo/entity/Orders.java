package com.example.demo.entity;


import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
@Data
public class Orders implements Serializable {
    /**
     * Column: orders_0.order_id
     @mbggenerated 2018-06-21 10:53:53
     */
    private Long id;

    /**
     *   订单号
     * Column: orders_0.order_no
     @mbggenerated 2018-06-21 10:53:53
     */
    private String orderNo;

    /**
     *   用户id
     * Column: orders_0.user_id
     @mbggenerated 2018-06-21 10:53:53
     */
    private Long userId;

    /**
     *   订单状态 100-已预约 200-已取车 300-已还车 400-已取消
     * Column: orders_0.order_status
     @mbggenerated 2018-06-21 10:53:53
     */
    private Integer orderStatus;

    /**
     *   支付状态 0-未支付 100支付成功
     * Column: orders_0.pay_status
     @mbggenerated 2018-06-21 10:53:53
     */
    private Integer payStatus;

    /**
     *   支付方式 100 -微信 200 -支付宝 300 - 蜜币
     * Column: orders_0.pay_method
     @mbggenerated 2018-06-21 10:53:53
     */
    private Integer payMethod;

    /**
     *   支付金额
     * Column: orders_0.pay_amount
     @mbggenerated 2018-06-21 10:53:53
     */
    private BigDecimal payAmount;

    /**
     *   支付时间
     * Column: orders_0.pay_time
     @mbggenerated 2018-06-21 10:53:53
     */
    private Date payTime;

    /**
     *   创建时间
     * Column: orders_0.created_at
     @mbggenerated 2018-06-21 10:53:53
     */
    private Date createdAt;

    /**
     *   修改时间
     * Column: orders_0.updated_at
     @mbggenerated 2018-06-21 10:53:53
     */
    private Date updatedAt;
}
