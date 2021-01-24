package com.rango.tam;

import com.rango.tam.netty.NettyServer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * @author rango
 * @description netty服务启动器
 * @date 2021-01-12 23:20
 */
@Component
public class NettyStarter implements ApplicationListener<ContextRefreshedEvent> {

    @Value("${netty.tcp.server.host}")
    private String host;

    @Value("${netty.tcp.server.port}")
    private Integer port;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        if (contextRefreshedEvent.getApplicationContext().getParent() == null){
            NettyServer.getInstance().start(host, port);
        }
    }

}
