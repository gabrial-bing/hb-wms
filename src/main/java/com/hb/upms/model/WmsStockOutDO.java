package com.hb.upms.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator 2019/08/25
*/
@Data
public class WmsStockOutDO implements Serializable {
    /**
	* 编号
	*/
    private Integer stockOutId;

    /**
	* 材料编号
	*/
    private Integer materialId;

    /*
    * 请求数量
    */
    private Integer requestOutNum;

    /**
	* 出库数量
	*/
    private Integer outStorageNum;

    /**
	* 出库时间
	*/
    private Date outStorageDate;

    /**
	* 出库人员
	*/
    private String outStorageName;

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