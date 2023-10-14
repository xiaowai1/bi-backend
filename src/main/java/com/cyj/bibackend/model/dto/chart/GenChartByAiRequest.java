package com.cyj.bibackend.model.dto.chart;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName GenChartByAiRequest
 * @Description 文件上传请求
 * @Author chixiaowai
 * @Date 2023/10/11 15:09
 * @Version 1.0
 */
@Data
public class GenChartByAiRequest implements Serializable {
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

    private static final long serialVersionUID = 1L;
}
