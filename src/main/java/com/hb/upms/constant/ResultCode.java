package com.hb.upms.constant;

/**
 * 自定义业务逻辑异常在该ErrorCodeInfoEnum中需添加对应code和message，抛异常时直接
 * throw new BusinessException(ErrorCodeInfoEnum.自定义_ERROR)
 */
public enum ResultCode {

    /**
     * Controller层中@Valid校验错误
     */
    PARAMETER_ERROR(10000, "Parameter error"),
    /**
     * service层接口返回null
     */
    SERVICE_API_RETURN_NULL(10001, "service层接口返回null"),
    /**
     * 无权限访问
     */
    NO_PERMISSION(10002,"无权限访问"),
    /**
     * 非法参数异常
     */
    IllegalArgument_ERROR(10003, "非法参数异常"),

    FORM_ERROR(10004,"表单提交出错"),

    PAGE_LIST_ERROR(10005,"分页列表查询出错"),

    DELETE_ERROR(10006,"删除出错"),

    LIST_FIND_ERROR(10007,"列表查询出错"),

    PERMISSION_EXISTS(10008,"该权限标识或名称在该业务系统中已经存在了"),

    ROLE_EXISTS(10009, "该角色标签或角色名称在该业务系统中已经存在了"),

    FIND_USER_S_ROLE_LIST_ERROR(10010, "查找用户拥有的角色列表失败"),

    /**
     * 账号不存在
     */
    UNKNOWN_ACCOUNT(20000, "账号不存在"),

    /**
     * 登录密码错误
     */
    INCORRECT_CREDENTIALS(20001, "登录密码错误"),

    /**
     * 验证码错误
     */
    CHECKED_CODE_ERROR(20002, "验证码错误"),

    /**
     * 用户已被锁定
     */
    LOCKED_ACCOUNT(20003, "用户已被锁定"),

    /**
     * 用户已被禁用
     */
    DISABLED_ACCOUNT(20004, "用户已被禁用"),

    UNKNOWN_USER(20005, "用户不存在"),


    /**
     * 数据重复异常
     */
    REPEAT_DATA(30000, "数据重复异常"),

    /**
     * 并发操作
     */
    CONCURRENCE_OPER(40000, "并发操作"),

    /**
     * 响应成功
     */
    SUCCESS(200, "ok"),

    /**
     * 响应失败：未知异常
     */
    UNKNOWN_ERROR(500, "未知异常")

    ;

    private final int code;
    private final String message;

    ResultCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}
