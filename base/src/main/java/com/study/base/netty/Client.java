package com.study.base.netty;

import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.util.ReferenceCountUtil;

public class Client {
    public static void main(String[] args) {
        //netty封装的线程池
        EventLoopGroup group = new NioEventLoopGroup();
        Bootstrap bootstrap = new Bootstrap();
        try {
            ChannelFuture future = bootstrap.group(group)
                    .channel(NioSocketChannel.class)
                    .handler(new ChannelHandleChild())
                    .connect("localhost",8888);
                    //.sync();
            future.addListener((ChannelFutureListener) channelFuture -> {
                if(!channelFuture.isSuccess()){
                    System.out.println("not connected!");
                }else{
                    System.out.println("connect success!");
                }
            });
            future.sync();
            future.channel().closeFuture().sync();
            System.out.println(".....");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            group.shutdownGracefully();
        }
    }
    static class ChannelHandleChild extends ChannelInitializer<SocketChannel> {


        @Override
        protected void initChannel(SocketChannel channel) throws Exception {
            channel.pipeline().addLast(new ClientInReadHandler());
        }
    }
    static class ClientInReadHandler extends ChannelInboundHandlerAdapter {
        @Override
        public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
            ByteBuf byteBuf = null;
            try{
                byteBuf = (ByteBuf)msg;
                System.out.println(byteBuf);
            }finally {
//                if(byteBuf != null){
//                    ReferenceCountUtil.release(byteBuf);
//                }
            }
        }

        @Override
        public void channelActive(ChannelHandlerContext ctx) throws Exception {
            ByteBuf byteBuf = Unpooled.copiedBuffer("hello".getBytes());
            ctx.writeAndFlush(byteBuf);
        }
    }
}
