package com.hb.upms.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * Created by Mybatis Generator 2019/09/04
 */
@Data
public class WmsStockInDO implements Serializable {
    /**
     * 非成品库入库单编号
     */
    private Integer stockInId;

    /**
     * 材料编号
     */
    private Integer materialId;

    /**
     * 入库数量
     */
    private Integer inStorageNum;

    /**
     * 入库时间
     */
    private Date inStorageDate;

    /**
     * 入库人员
     */
    private String inStorageName;

    /**
     * 仓储位置
     */
    private String storageLocation;

    /**
     * 入库总价
     */
    private BigDecimal inStorageMoney;

    /**
     * 备注
     */
    private String note;

    /**
     * 对应订单编号
     */
    private String fromOrder;

    private static final long serialVersionUID = 1L;

    public WmsStockInDO() {
    }

    protected boolean canEqual(Object other) {
        return other instanceof com.hb.upms.model.WmsStockInDO;
    }
}