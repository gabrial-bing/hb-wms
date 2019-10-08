package com.hb.upms.controller.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
* Created by Mybatis Generator 2019/09/15
*/
@Data
public class CommodityStockOutDTO implements Serializable {
    /**
	* 成品库出库单编号
	*/
    private Integer id;

    /**
	* 订单号
	*/
    private Integer orderId;

    /**
	* 客户名称
	*/
    private String clientName;

    /**
	* 商品编号
	*/
    private Integer commodityId;

    /**
	* 国内外
	*/
    private Boolean inlandOrOut;

    /**
	* 库存数量
	*/
    private Integer inventoryNum;

    /**
	* 仓储位置
	*/
    private String storageLocation;

    /**
	* 出库数量
	*/
    private String outStorageNum;

    /**
	* 出库时间
	*/
    private Date outStorageDate;

    /**
	* 出库申请人
	*/
    private String outStorageName;

    /**
	* 备注
	*/
    private String note;

    private static final long serialVersionUID = 1L;
}