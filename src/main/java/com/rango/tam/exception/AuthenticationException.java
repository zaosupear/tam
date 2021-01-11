package com.rango.tam.exception;

/**
 * @author rango
 * @description
 * @date 2021/1/11 15:23
 */
public class AuthenticationException extends Exception {

    public AuthenticationException(){}

    public AuthenticationException(String message){
        super(message);
    }

    public AuthenticationException(String message, Throwable cause){
        super(message, cause);
    }

}
