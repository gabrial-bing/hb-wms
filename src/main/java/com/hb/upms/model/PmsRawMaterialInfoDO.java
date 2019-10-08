package com.hb.upms.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator 2019/09/11
*/
@Data
public class PmsRawMaterialInfoDO implements Serializable {
    /**
	* (材料编号)
	*/
    private Integer id;

    /**
	* 原材料类型id号：大类
	*/
    private Integer bigTypeId;

    /**
	* 小类id
	*/
    private Integer smallTypeId;

    /**
	* 流水号
	*/
    private String pipelineNumber;

    /**
	* 原材料品名(物品名称)
	*/
    private String productName;

    /**
	* 规格型号（型号）
	*/
    private String specificationType;

    /**
	* 单价
	*/
    private BigDecimal price;

    /**
	* 单位
	*/
    private String unit;

    /**
	* 供应商Id
	*/
    private Integer supplyId;

    /**
	* 供应商名字
	*/
    private String supplyName;

    /**
	* 时间
	*/
    private Date time;

    /**
	* 备注
	*/
    private String remark;

    private static final long serialVersionUID = 1L;
}