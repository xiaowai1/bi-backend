package com.cyj.bibackend.model.dto.user;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName UserRegisterRequest
 * @Description 用户注册请求体
 * @Author chixiaowai
 * @Date 2023/10/10 15:40
 * @Version 1.0
 */
@Data
public class UserRegisterRequest implements Serializable {
    private static final long serialVersionUID = 3191241716373120793L;

    private String userAccount;

    private String userPassword;

    private String checkPassword;
}
