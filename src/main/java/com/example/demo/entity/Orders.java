package com.example.demo.entity;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * [STRATO MyBatis Generator]
 * Table: orders_0
 @mbggenerated do_not_delete_during_merge 2018-05-26 10:47:12
 */
public class Orders implements Serializable {
    /**
     * Column: orders_0.order_id
     @mbggenerated 2018-06-21 10:53:53
     */
    private Long orderId;

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
     *   车辆id
     * Column: orders_0.bike_id
     @mbggenerated 2018-06-21 10:53:53
     */
    private Long bikeId;

    /**
     *   订单状态 100-已预约 200-已取车 300-已还车 400-已取消
     * Column: orders_0.order_status
     @mbggenerated 2018-06-21 10:53:53
     */
    private Integer orderStatus;

    /**
     *   取消类型 100-用户取消 200-人工取消 300-超时取消 400-扫码不是本车辆导致的取消
     * Column: orders_0.cancel_type
     @mbggenerated 2018-06-21 10:53:53
     */
    private Integer cancelType;

    /**
     *   取消时间
     * Column: orders_0.cancel_time
     @mbggenerated 2018-06-21 10:53:53
     */
    private Date cancelTime;

    /**
     *   还车类型 100-用户还车 200-人工还车
     * Column: orders_0.return_type
     @mbggenerated 2018-06-21 10:53:53
     */
    private Integer returnType;

    /**
     *   下单类型 1-预约用车 2-扫码用车
     * Column: orders_0.order_type
     @mbggenerated 2018-06-21 10:53:53
     */
    private Integer orderType;

    /**
     *   订单金额
     * Column: orders_0.order_amount
     @mbggenerated 2018-06-21 10:53:53
     */
    private BigDecimal orderAmount;

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
     *   运营区id
     * Column: orders_0.operate_id
     @mbggenerated 2018-06-21 10:53:53
     */
    private Long operateAreaId;

    /**
     *   公司id
     * Column: orders_0.company_id
     @mbggenerated 2018-06-21 10:53:53
     */
    private Long companyId;

    /**
     *   城市code
     * Column: orders_0.city_code
     @mbggenerated 2018-06-21 10:53:53
     */
    private String cityCode;

    /**
     *   县区code
     * Column: orders_0.ad_code
     @mbggenerated 2018-06-21 10:53:53
     */
    private String adCode;

    /**
     *   蜜币支付时花费赠送蜜币数量
     * Column: orders_0.give_mi_amount
     @mbggenerated 2018-06-21 10:53:53
     */
    private BigDecimal giveMiAmount;

    /**
     *   蜜币支付时花费充值蜜币数量
     * Column: orders_0.mi_amount
     @mbggenerated 2018-06-21 10:53:53
     */
    private BigDecimal miAmount;

    /**
     *   创建时间
     * Column: orders_0.create_time
     @mbggenerated 2018-06-21 10:53:53
     */
    private Date createTime;

    /**
     *   修改时间
     * Column: orders_0.modify_time
     @mbggenerated 2018-06-21 10:53:53
     */
    private Date modifyTime;
    /**
     *   退款状态，0未退款，1已退款
     * Column: orders_0.refund_status
     @mbggenerated 2018-06-28 11:18:23
     */
    private Integer refundStatus;

    /**
     *   退款金额
     * Column: orders_0.refund_amount
     @mbggenerated 2018-06-28 11:18:23
     */
    private BigDecimal refundAmount;
    /**
     *   品牌id
     * Column: orders_0.brands_id
     @mbggenerated 2018-07-26 11:47:55
     */
    private Long brandsId;
    /**
     * 退款时间
     * Column: orders_0.refund_time
     @mbggenerated 2018-07-26 11:47:55
     */
    private Date refundTime;
    /**
     * Table: orders_0
     @mbggenerated 2018-06-21 10:53:53
     */
    private static final long serialVersionUID = 1L;
    /**
     * 订单总金额（实收金额）
     */
    private BigDecimal totalAmount;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getBikeId() {
        return bikeId;
    }

    public void setBikeId(Long bikeId) {
        this.bikeId = bikeId;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getCancelType() {
        return cancelType;
    }

    public void setCancelType(Integer cancelType) {
        this.cancelType = cancelType;
    }

    public Date getCancelTime() {
        return cancelTime;
    }

    public void setCancelTime(Date cancelTime) {
        this.cancelTime = cancelTime;
    }

    public Integer getReturnType() {
        return returnType;
    }

    public void setReturnType(Integer returnType) {
        this.returnType = returnType;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
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

    public Long getOperateAreaId() {
        return operateAreaId;
    }

    public void setOperateAreaId(Long operateAreaId) {
        this.operateAreaId = operateAreaId;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    public String getAdCode() {
        return adCode;
    }

    public void setAdCode(String adCode) {
        this.adCode = adCode == null ? null : adCode.trim();
    }

    public BigDecimal getGiveMiAmount() {
        return giveMiAmount;
    }

    public void setGiveMiAmount(BigDecimal giveMiAmount) {
        this.giveMiAmount = giveMiAmount;
    }

    public BigDecimal getMiAmount() {
        return miAmount;
    }

    public void setMiAmount(BigDecimal miAmount) {
        this.miAmount = miAmount;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Integer getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(Integer refundStatus) {
        this.refundStatus = refundStatus;
    }

    public BigDecimal getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(BigDecimal refundAmount) {
        this.refundAmount = refundAmount;
    }

    public Long getBrandsId() {
        return brandsId;
    }

    public void setBrandsId(Long brandsId) {
        this.brandsId = brandsId;
    }

    public Date getRefundTime() {
        return refundTime;
    }

    public void setRefundTime(Date refundTime) {
        this.refundTime = refundTime;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", orderNo=" + orderNo + ", userId=" + userId + ", bikeId=" + bikeId
				+ ", orderStatus=" + orderStatus + ", cancelType=" + cancelType + ", cancelTime=" + cancelTime
				+ ", returnType=" + returnType + ", orderType=" + orderType + ", orderAmount=" + orderAmount
				+ ", payStatus=" + payStatus + ", payMethod=" + payMethod + ", payAmount=" + payAmount + ", payTime="
				+ payTime + ", operateAreaId=" + operateAreaId + ", companyId=" + companyId + ", cityCode=" + cityCode
				+ ", adCode=" + adCode + ", giveMiAmount=" + giveMiAmount + ", miAmount=" + miAmount + ", createTime="
				+ createTime + ", modifyTime=" + modifyTime + ", refundStatus=" + refundStatus + ", refundAmount="
				+ refundAmount + ", brandsId=" + brandsId + ", refundTime=" + refundTime + ", totalAmount="
				+ totalAmount + "]";
	}
    
}
