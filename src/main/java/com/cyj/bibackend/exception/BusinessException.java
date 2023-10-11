package com.cyj.bibackend.exception;

import com.cyj.bibackend.common.ErrorCode;

/**
 * @ClassName BusinessException
 * @Description 自定义异常类
 * @Author chixiaowai
 * @Date 2023/10/10 15:41
 * @Version 1.0
 */

public class BusinessException extends RuntimeException{
    /**
     * 错误码
     */
    private final int code;

    public BusinessException(int code, String message) {
        super(message);
        this.code = code;
    }

    public BusinessException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.code = errorCode.getCode();
    }

    public BusinessException(ErrorCode errorCode, String message) {
        super(message);
        this.code = errorCode.getCode();
    }

    public int getCode() {
        return code;
    }
}
