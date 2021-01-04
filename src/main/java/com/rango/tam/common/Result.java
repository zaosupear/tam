package com.rango.tam.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;

/**
 * @author rango
 * @description 公用返回类
 * @date 2020-12-27 22:26
 */
@Data
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class Result<T> implements Serializable {

    private Integer code;
    private String message;
    private T data;
    private ResultCode resultCode;

    public Result(ResultCode resultCode){
        this.resultCode = resultCode;
    }

    public Result(ResultCode resultCode, T data){
        this.code = resultCode.code();
        this.message = resultCode.message();
        this.data = data;
    }

    public static <T> Result<T> success(){
        return new Result<>(ResultCode.SUCCESS);
    }

    public static <T> Result<T> success(T data){
        return new Result<>(ResultCode.SUCCESS, data);
    }

    public static <T> Result<T> failure(ResultCode resultCode){
        return new Result<>(resultCode);
    }

    public static <T> Result<T> failure(ResultCode resultCode, T data){
        return new Result<>(resultCode, data);
    }
}
