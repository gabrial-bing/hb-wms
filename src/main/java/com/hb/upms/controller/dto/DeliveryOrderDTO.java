package com.hb.upms.controller.dto;

import java.io.Serializable;

public class DeliveryOrderDTO implements Serializable {
    /**
    * 出货单id
    */
    private Integer deliveryOrderId;

    /**
    * 订单id
    */
    private String orderId;

    /**
    * 材料id
    */
    private String materialId;

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    private String productName;  //G：原料表中的“物料名”字段

    /**
    * 材料数量
    */
    private Integer materialNum;

    /**
    * 出货状态（0代表请购单1代表即将出库单）
    */
    private Integer status;

    private static final long serialVersionUID = 1L;

    public Integer getDeliveryOrderId() {
        return deliveryOrderId;
    }

    public void setDeliveryOrderId(Integer deliveryOrderId) {
        this.deliveryOrderId = deliveryOrderId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getMaterialId() {
        return materialId;
    }

    public void setMaterialId(String materialId) {
        this.materialId = materialId;
    }

    public Integer getMaterialNum() {
        return materialNum;
    }

    public void setMaterialNum(Integer materialNum) {
        this.materialNum = materialNum;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }


}