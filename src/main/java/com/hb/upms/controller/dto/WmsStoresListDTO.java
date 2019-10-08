package com.hb.upms.controller.dto;

import lombok.Data;

import java.io.Serializable;

/**
* Created by Mybatis Generator 2019/08/26
*/
@Data
public class WmsStoresListDTO implements Serializable {
    /**
	* 编号
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
    * 可用库存数量
    */
    private Integer usableInventoryNum;

    /**
	* 仓储位置
	*/
    private String storageLocation;

    /**
	* 备注
	*/
    private String note;



    private String productName;  //物料基础表
    private String specificationType;    //物料基础表
    private Integer bigTypeId;//物料基础表
    private Integer smallTypeId;//物料基础表


    private static final long serialVersionUID = 1L;
}