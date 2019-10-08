package com.hb.upms.common;

import com.hb.upms.constant.ResultCode;
import org.springframework.http.HttpStatus;


public class RestResult {

    private int code;
    private String message;
    private Object data;
    private boolean success;

    public RestResult() {

    }

    public RestResult(int code, String message, Object data, boolean success) {
        this.code = code;
        this.message = message;
        this.data = data;
        this.success = success;
    }

    public static RestResult success() {
        return success(HttpStatus.OK.value(),
                HttpStatus.OK.getReasonPhrase(), null);
    }

    public static RestResult success(Object data) {
        return success(HttpStatus.OK.value(),
                HttpStatus.OK.getReasonPhrase(), data);
    }

    public static RestResult success(ResultCode resultCode) {
        return success(resultCode.getCode(), resultCode.getMessage(), null);
    }

    public static RestResult success(ResultCode resultCode, Object data) {
        return success(resultCode.getCode(), resultCode.getMessage(), data);
    }

    public static RestResult success(int code, String message, Object data) {
        return new RestResult(code, message, data, true);
    }

    public static RestResult failed(ResultCode resultCode) {
        return failed(resultCode.getCode(), resultCode.getMessage(), null);
    }

    public static RestResult failed(int code, String message) {
        return failed(code, message, null);
    }

    public static RestResult failed(int code, String message, Object data) {
        return new RestResult(code, message, data, false);
    }



    @Override
    public String toString() {
        return "ResponseObject{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                ", success=" + success +
                '}';
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public boolean getSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
