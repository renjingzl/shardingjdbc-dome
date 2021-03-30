package com.example.demo.entity;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

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
     * Column: orders_0.create_time
     @mbggenerated 2018-06-21 10:53:53
     */
    private Date createdAt;

    /**
     *   修改时间
     * Column: orders_0.modify_time
     @mbggenerated 2018-06-21 10:53:53
     */
    private Date updatedAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    public Integer getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(Integer payMethod) {
        this.payMethod = payMethod;
    }

    public BigDecimal getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "OrdersEntity{" +
                "id=" + id +
                ", orderNo='" + orderNo + '\'' +
                ", userId=" + userId +
                ", orderStatus=" + orderStatus +
                ", payStatus=" + payStatus +
                ", payMethod=" + payMethod +
                ", payAmount=" + payAmount +
                ", payTime=" + payTime +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
