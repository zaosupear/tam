package com.rango.tam;

import com.rango.tam.netty.NettyServer;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.rango.tam.mapper")
public class TamApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(TamApplication.class, args);
        NettyServer nettyServer = new NettyServer();
        nettyServer.start("127.0.0.1", 8024);
    }

}
