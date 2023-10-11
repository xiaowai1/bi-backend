package com.cyj.bibackend.utils;

import org.apache.commons.lang3.StringUtils;

/**
 * @ClassName SqlUtils
 * @Description SQL 工具
 * @Author chixiaowai
 * @Date 2023/10/10 16:50
 * @Version 1.0
 */

public class SqlUtils {
    /**
     * 校验排序字段是否合法（防止 SQL 注入）
     *
     * @param sortField
     * @return
     */
    public static boolean validSortField(String sortField) {
        if (StringUtils.isBlank(sortField)) {
            return false;
        }
        return !StringUtils.containsAny(sortField, "=", "(", ")", " ");
    }
}
