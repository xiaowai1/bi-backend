package com.cyj.bibackend.model.vo;

import lombok.Data;

/**
 * @ClassName BiResponse
 * @Description Bi 的返回结果
 * @Author chixiaowai
 * @Date 2023/10/12 14:50
 * @Version 1.0
 */
@Data
public class BiResponse {
    private String genChart;

    private String genResult;

    private Long chartId;
}
