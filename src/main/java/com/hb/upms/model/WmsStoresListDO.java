package com.hb.upms.model;

import java.io.Serializable;
import lombok.Data;

/**
 * Created by Mybatis Generator 2019/09/14
 */
@Data
public class WmsStoresListDO implements Serializable {
    /**
     * 非成品库库存单编号
     */
    private Integer inventoryId;

    /**
     * 材料编号
     */
    private Integer materialId;

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

    /**
     * 可用库存数量
     */
    private Integer usableInventoryNum;

    private static final long serialVersionUID = 1L;

    public WmsStoresListDO() {
    }

    protected boolean canEqual(Object other) {
        return other instanceof com.hb.upms.model.WmsStoresListDO;
    }
}