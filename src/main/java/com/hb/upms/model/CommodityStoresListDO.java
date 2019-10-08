package com.hb.upms.model;

import java.io.Serializable;
import lombok.Data;

/**
* Created by Mybatis Generator 2019/09/15
*/
@Data
public class CommodityStoresListDO implements Serializable {
    /**
	* 成品库库存单编号
	*/
    private Integer commodityInventoryId;

    /**
	* 订单号
	*/
    private Long orderId;

    /**
	* 客户名称
	*/
    private String clientName;

    /**
	* 商品编号
	*/
    private Integer commodityId;

    /**
	* 国内外（0国内1国外)
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
	* 备注
	*/
    private String note;

    private static final long serialVersionUID = 1L;
}