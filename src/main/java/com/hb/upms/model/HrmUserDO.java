package com.hb.upms.model;

import java.io.Serializable;
import lombok.Data;

@Data
public class HrmUserDO implements Serializable {
    /**
     * 用户名ID
     */
    private Integer id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    private static final long serialVersionUID = 1L;
}