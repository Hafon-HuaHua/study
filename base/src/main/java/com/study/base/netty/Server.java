package com.study.base.netty;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.util.ReferenceCountUtil;

public class Server {
    public static void main(String[] args) {
        /*try {
            ServerSocket serverSocket = new ServerSocket();
            serverSocket.bind(new InetSocketAddress(8888));
            serverSocket.accept();
            System.out.println("server handle done");
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        EventLoopGroup baseGroup = new NioEventLoopGroup(1);
        EventLoopGroup workerGroup = new NioEventLoopGroup(2);
        ServerBootstrap bootstrap = new ServerBootstrap();
        try {
            ChannelFuture f = bootstrap.group(baseGroup,workerGroup)
                    .channel(NioServerSocketChannel.class)
                    .childHandler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        protected void initChannel(SocketChannel socketChannel) {
                            ChannelPipeline pl = socketChannel.pipeline();
                            pl.addLast(new ServerChannelHandler());
                            System.out.println("initChannel....");
                        }
                    })
                    .bind(8888)
                    .sync();
            System.out.println("server started!");
            f.channel().closeFuture().sync();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            baseGroup.shutdownGracefully();
            workerGroup.shutdownGracefully();
        }
    }
}
class ServerChannelHandler extends ChannelInboundHandlerAdapter{
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        ByteBuf byteBuf = null;
        try{
            byteBuf = (ByteBuf)msg;
            System.out.println(byteBuf);
            ctx.writeAndFlush(msg);
        }finally {
            if(byteBuf != null){
                ReferenceCountUtil.release(byteBuf);
            }
        }
    }
}
