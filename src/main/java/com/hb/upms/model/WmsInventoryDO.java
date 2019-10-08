package com.hb.upms.model;

import java.io.Serializable;
import lombok.Data;

@Data
public class WmsInventoryDO implements Serializable {
    /**
    * ID
    */
    private Integer id;

    /**
    * 物品ID
    */
    private String inventoryId;

    /**
    * 物品名称
    */
    private String name;

    /**
    * 物品类型(原料、成品...)
    */
    private String type;

    /**
    * 物品数量
    */
    private String amount;

    /**
    * 所在仓库ID
    */
    private String warehouseId;

    /**
    * 物品入库时间
    */
    private String putInTime;

    private static final long serialVersionUID = 1L;
}