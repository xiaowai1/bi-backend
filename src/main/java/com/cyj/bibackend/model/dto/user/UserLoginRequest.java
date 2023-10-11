package com.cyj.bibackend.model.dto.user;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName UserLoginRequest
 * @Description 用户登录请求
 * @Author chixiaowai
 * @Date 2023/10/10 15:47
 * @Version 1.0
 */
@Data
public class UserLoginRequest implements Serializable {
    private static final long serialVersionUID = 3191241716373120793L;

    private String userAccount;

    private String userPassword;
}
