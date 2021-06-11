package com.rango.tam.mq.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author rango
 * @description RabbitMQ配置类
 * @date 2021/5/14 22:30
 */
@Configuration
@ComponentScan({"com.rango.tam.mq.*"})
public class RabbitMQConfig {
}
