package com.example.demo.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CommonDealerEntity implements Serializable {

    private static final long serialVersionUID = -3926083069139828741L;

    private String jdyId;

    private Long clientId;

    private String tag;

    private Integer type;

    private String grade;

    private String code;

    private String name;

    private String parentCode;

    private String parentName;

    private String sapName;

    private String sapCode;

    private String sapCompanyCode;

    private String contactName;

    private String contactPhone;

    private String cityName;

    private String provinceName;

    private String costCenter;

    private String costCenterName;

    private String profitCenter;

    private String profitCenterName;

    private String cityManagerUserName;

    private String cityManagerDingId;

    private String saleManagerUserName;

    private String saleManagerDingId;

    private String upperAssistantUserName;

    private String upperAssistantDingId;

    private String zoneAssistantUserName;

    private String zoneAssistantDingId;

    private String deptNo;

    private String deptName;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date deletedAt;

    private Integer businessType;

    private Integer erpPushFlag;
}


