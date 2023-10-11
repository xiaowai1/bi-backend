package com.cyj.bibackend.common;

import com.cyj.bibackend.constant.CommonConstant;
import lombok.Data;

/**
 * @ClassName PageRequest
 * @Description 分页请求
 * @Author chixiaowai
 * @Date 2023/10/10 16:47
 * @Version 1.0
 */
@Data
public class PageRequest {
    /**
     * 当前页号
     */
    private long current = 1;

    /**
     * 页面大小
     */
    private long pageSize = 10;

    /**
     * 排序字段
     */
    private String sortField;

    /**
     * 排序顺序（默认升序）
     */
    private String sortOrder = CommonConstant.SORT_ORDER_ASC;
}
