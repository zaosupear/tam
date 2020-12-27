package com.rango.tam;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.rango.tam.mapper")
public class TamApplication {

    public static void main(String[] args) {
        SpringApplication.run(TamApplication.class, args);
    }

}
