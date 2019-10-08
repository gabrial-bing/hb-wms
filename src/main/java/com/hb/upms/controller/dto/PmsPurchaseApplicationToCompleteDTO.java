package com.hb.upms.controller.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
* Created by Mybatis Generator 2019/08/18
*/
@Data
public class PmsPurchaseApplicationToCompleteDTO implements Serializable {
    /**
	* 编号
	*/
    private Integer id;

    /**
	* 为那个订单采购得原料
	*/
    private String fromOrder;

    /**
	* 原材料id
	*/
    private Integer rawMatrialId;

    /**
	* 数量
	*/
    private Integer number;

    /**
	* 请求时间
	*/
    private Date requestTime;

    /**
	* 生产计划员计划使用原料的时间：需求时间
	*/
    private Date demandTime;

    /**
	* 请购人
	*/
    private String purchaser;

    /**
	* 请购部门
	*/
    private String department;

    /**
	* 审核状态位：0：审核采购申请单、1：领导审核采购计划单、2：总经理审批、3：未到货 4：到货未入库、5：已入库、6：终止请购
	*/
    private Integer status;

    /**
	* 供应商id
	*/
    private Integer supplyId;

    /**
	* 合同编号
	*/
    private Integer contactId;

    private Long price;

    /**
	* 金额
	*/
    private Long totalMoney;

    private Date deliveryTime;

    private String remark;

    private String productName;//G：原料表中的“物料名”字段

    private Integer inventoryNum; //G：仓库库存表中库存数量字段

    private static final long serialVersionUID = 1L;
}