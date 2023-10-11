package com.cyj.bibackend.model.dto.user;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName UserUpdateRequest
 * @Description 用户更新请求
 * @Author chixiaowai
 * @Date 2023/10/10 16:44
 * @Version 1.0
 */
@Data
public class UserUpdateRequest implements Serializable {
    /**
     * id
     */
    private Long id;

    /**
     * 用户昵称
     */
    private String userName;

    /**
     * 用户头像
     */
    private String userAvatar;

    /**
     * 简介
     */
    private String userProfile;

    /**
     * 用户角色：user/admin/ban
     */
    private String userRole;

    private static final long serialVersionUID = 1L;
}
