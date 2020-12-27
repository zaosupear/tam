package com.rango.tam.entity;

import lombok.Data;

/**
 * @author rango
 * @description
 * @date 2020/12/16 16:54
 */
@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
