package com.rango.tam.config;

import com.rango.tam.filter.CorsFilter;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

/**
 * @author rango
 * @description Jersey配置类
 * @date 2021/7/5 10:55
 */
@Component
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig(){
        register(CorsFilter.class);
    }
}
