package com.cyj.bibackend.constant;

/**
 * @ClassName UserConstant
 * @Description 用户常量
 * @Author chixiaowai
 * @Date 2023/10/10 15:50
 * @Version 1.0
 */

public interface UserConstant {
    /**
     * 用户登录态键
     */
    String USER_LOGIN_STATE = "user_login";

    //  region 权限

    /**
     * 默认角色
     */
    String DEFAULT_ROLE = "user";

    /**
     * 管理员角色
     */
    String ADMIN_ROLE = "admin";

    /**
     * 被封号
     */
    String BAN_ROLE = "ban";

}
