package com.study.base.io.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.LinkedList;
import java.util.List;

public class Server_1 {
    public static void main(String[] args) {
        List<SocketChannel> channelList = new LinkedList<>();
        try {
            ServerSocketChannel ss = ServerSocketChannel.open();
            ss.bind(new InetSocketAddress(8080));
            ss.configureBlocking(false);//设置accept时不阻塞
            while (true){
                Thread.sleep(1000);
                //由于前面设置了非阻塞式，所以此处会立刻有返回值，没有客户端链接的话返回null
                SocketChannel socketChannel = ss.accept();
                //有客户端链接进来
                if(socketChannel == null){
                    System.out.println("null......");
                } else if(socketChannel != null){
                    //由于BIO的问题有两处阻塞，第一处是在accept处，第 二处在read处，此处设置非阻塞是为了在read时不阻塞
                    socketChannel.configureBlocking(false);
                    channelList.add(socketChannel);
                }
                ByteBuffer byteBuffer = ByteBuffer.allocate(4096);
                for(SocketChannel channel : channelList){
                    int num = channel.read(byteBuffer);
                    if(num > 0){
                        byteBuffer.flip();
                        byte[] data = new byte[byteBuffer.limit()];
                        byteBuffer.get(data);
                        String str = new String(data);
                        System.out.println(channel.socket().getPort() + "," + str);
                        byteBuffer.clear();
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
