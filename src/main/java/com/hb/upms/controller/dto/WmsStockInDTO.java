package com.hb.upms.controller.dto;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
* Created by Mybatis Generator 2019/08/20
*/
@Data
public class WmsStockInDTO implements Serializable {

    private Integer status;     //G：该字段是采购单中的状态字段

    private Integer id;  //G：采购单里的id

    private String fromOrder;//G：采购单里的对应订单号
    private String productName;  //G：物料基础表中物料名
    /**
	* 编号
	*/
    private Integer stockInId;

    /**
	* 材料编号
	*/
    private Integer materialId;

    private Integer rawMatrialId;


    /**
	* 入库数量
	*/
    private Integer inStorageNum;

    private  Integer number;
    /**
	* 入库时间
	*/
    private String inStorageDate;

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

    private static final long serialVersionUID = 1L;
}