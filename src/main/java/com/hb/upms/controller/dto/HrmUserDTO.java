package com.hb.upms.controller.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class HrmUserDTO implements Serializable {
    /**
     * 用户名ID
     */
    private Integer id;

    /**
     * 用户名
     */
    private String username;


    private static final long serialVersionUID = 1L;
}