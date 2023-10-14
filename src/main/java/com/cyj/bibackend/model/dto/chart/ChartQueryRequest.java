package com.cyj.bibackend.model.dto.chart;

import com.cyj.bibackend.common.PageRequest;
import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName ChartQueryRequest
 * @Description 查询请求
 * @Author chixiaowai
 * @Date 2023/10/11 15:08
 * @Version 1.0
 */
@Data
public class ChartQueryRequest extends PageRequest implements Serializable {
    private Long id;

    /**
     * 名称
     */
    private String name;

    /**
     * 分析目标
     */
    private String goal;

    /**
     * 图表类型
     */
    private String chartType;

    /**
     * 用户 id
     */
    private Long userId;

    private static final long serialVersionUID = 1L;
}
