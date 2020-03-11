package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author XiangRui
 * @create 2020-03-10 9:56 下午
 */
@Data
//全参数构造
@AllArgsConstructor
//无参构造
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T       data;

    public CommonResult(Integer code, String message) {
        this(code,message,null);
    }




}
