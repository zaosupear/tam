package com.rango.tam;

import com.rango.tam.common.ResultCode;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author rango
 * @description
 * @date 2021/1/6 10:11
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class GlobalException extends RuntimeException {

    private Integer code;
    private String message;

    public GlobalException(ResultCode resultCode){
        super(resultCode.message());
        this.code = resultCode.code();
        this.message = resultCode.message();
    }

    public GlobalException(ResultCode resultCode, Throwable cause){
        super(resultCode.message(), cause);
        this.code = resultCode.code();
        this.message = resultCode.message();
    }

    public GlobalException(String message){
        super(message);
        this.setCode(-1);
        this.message = message;
    }

    public GlobalException(Integer code, String message){
        super(message);
        this.code = code;
        this.message =  message;
    }

    public GlobalException(Integer code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
        this.message = message;
    }

    @Override
    public synchronized Throwable fillInStackTrace() {
        return this;
    }
}
