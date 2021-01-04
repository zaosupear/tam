package com.rango.tam.entity;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author rango
 * @description
 * @date 2020/12/16 16:54
 */
@Data
@Accessors(chain = true)
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
