package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author hanlong
 * @Date 2021/11/18
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AvalonCommonDealer {

    /** 子账户编码 */
    private String subAccountCode;
    /** 主账户编码 */
    private String mainAccountCode;
    /** 子账户名称 */
    private String subAccountName;
    /** 所属公司编码 */
    private String orgCode;
    /** 所属公司 */
    private String orgName;
    /** 客户状态 */
    private String subAccountStatus;
    /** 客户分组 */
    private String clientGroup;
    /** 银行账户 */
    private String bankAccounts;
    /** 客户联系人 */
    private String contactName;
    /** 客户联系电话 */
    private String contactTel;
    /** 邮寄地址 */
    private String postAddress;
    /** 经销商级别 - 账号管理系统 - 备注: 经销商、一级分销商、二级分销商 */
    private String dealerLevel;
    /** 账户余额、积分、货补 - 余额管理 - 备注: 子账户属性 */
    private String balance;
    /** 经销商策略（活动策略、价格策略、账期策略） - 策略管理 - 备注: 子账户属性 */
    private String strategy;
    /** 收货地址 - 下单系统 - 备注: 子账户属性 */
    private String receivingAddress;
    /** 部门编码 - 字符串 - 例: 147679457 - 备注: 人工维护：每月维护 */
    private String deptCode;
    /** 部门名称 - 字符串 - 例: 海淀传统一组 - 备注: 系统计算设置，子账户属性 */
    private String deptName;
    /** 战区编码 */
    private String warZoneCode;
    /** 战区名称 */
    private String warZoneName;
    /** 成本中心编码 */
    private String costCenterCode;
    /** 成本中心名称 */
    private String costCenterName;
    /** 利润中心编码 */
    private String profitCenterCode;
    /** 利润中心名称 */
    private String profitCenterName;
    /** 是否闭户: YES 闭户 NO 正常 */
    private String closeStatus;
    /** 客户收件地址 */
    private String clientReceiveAddress;
    /** 销售主管 */
    private String saleManager;
    /** 经销商标签 */
    private String clientTag;
    /** 销售主管原始json */
    private String saleManagerJson;
    /** 金蝶编码 */
    private String sapCode;

    /** 修改时间 */
    private String modifyDate;

    /**  */
    private String owner;
    /**  */
    private String user_phone;
    /** CDP主账户编码 */
    private String cdpMainCode;
    /** 元气唯一ID */
    private String businessAccountCode;

    /** 省区区助json */
    private String zoneAssitant;

}
