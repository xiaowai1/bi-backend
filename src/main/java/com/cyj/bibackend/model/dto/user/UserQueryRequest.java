package com.cyj.bibackend.model.dto.user;

import com.cyj.bibackend.common.PageRequest;
import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName UserQueryRequest
 * @Description 用户查询请求
 * @Author chixiaowai
 * @Date 2023/10/10 16:47
 * @Version 1.0
 */
@Data
public class UserQueryRequest extends PageRequest implements Serializable {
    /**
     * id
     */
    private Long id;

    /**
     * 开放平台id
     */
    private String unionId;

    /**
     * 公众号openId
     */
    private String mpOpenId;

    /**
     * 用户昵称
     */
    private String userName;

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
