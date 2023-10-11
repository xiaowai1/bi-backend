package com.cyj.bibackend.common;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName DeleteRequest
 * @Description 删除请求
 * @Author chixiaowai
 * @Date 2023/10/10 16:43
 * @Version 1.0
 */
@Data
public class DeleteRequest implements Serializable {
    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}
