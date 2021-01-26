package com.study.base.io.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SocketChannel;

public class Client_1 {
    public static void main(String[] args) {
        try {
            InetSocketAddress inetSocketAddress = new InetSocketAddress("81.70.82.185",8080);
            SocketChannel channel = SocketChannel.open();
            channel.bind(new InetSocketAddress("114.242.122.14",50456));
            channel.connect(inetSocketAddress);
            channel.isOpen();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
