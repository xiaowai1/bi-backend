package com.cyj.bibackend.common;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName BaseResponse
 * @Description 通用返回类
 * @Author chixiaowai
 * @Date 2023/10/10 15:36
 * @Version 1.0
 */
@Data
public class BaseResponse<T> implements Serializable {
    private int code;

    private T data;

    private String message;

    public BaseResponse(int code, T data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    public BaseResponse(int code, T data) {
        this(code, data, "");
    }

    public BaseResponse(ErrorCode errorCode) {
        this(errorCode.getCode(), null, errorCode.getMessage());
    }
}
