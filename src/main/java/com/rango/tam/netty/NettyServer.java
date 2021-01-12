package com.rango.tam.netty;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import org.springframework.stereotype.Component;

/**
 * @author rango
 * @description
 * @date 2021-01-03 16:15
 */
@Component
public class NettyServer {

    private EventLoopGroup bossGroup;
    private EventLoopGroup workGroup;
    private ServerBootstrap serverBootstrap;
    private ChannelFuture channelFuture;

    private static NettyServer nettyServer;

    private NettyServer(){
        bossGroup = new NioEventLoopGroup();
        workGroup = new NioEventLoopGroup();
        serverBootstrap = new ServerBootstrap();
        serverBootstrap.group(bossGroup, workGroup)
                .channel(NioServerSocketChannel.class)
                .childHandler(new ServerInitializer());
    }

    public static synchronized NettyServer getInstance(){
        if(nettyServer == null){
            nettyServer = new NettyServer();
        }
        return nettyServer;
    }

    public void start(String host, int port) {
        this.channelFuture = serverBootstrap.bind(host, port);
    }
}
