package com.rango.tam;

import com.rango.tam.netty.NettyServer;
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

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        if (contextRefreshedEvent.getApplicationContext().getParent() == null){
            NettyServer.getInstance().start("127.0.0.1", 8024);
        }
    }

}
