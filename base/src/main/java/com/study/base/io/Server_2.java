package com.study.base.io;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 多线程BIO
 * 每个客户端链接都会创建一个线程去执行，所以第二次的read不影响其它客户端链接，但是随着客户端连接越来越多，线程创建越来越多就会出现问题
 */
public class Server_2 {
    static class ServerInner implements Runnable{
        private Socket socket;
        public ServerInner(Socket socket){
            this.socket = socket;
        }
        @Override
        public void run() {
            try(BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()))){
                while (true){
                    char[] bytes = new char[1024];
                    //in.read第二次阻塞
                    int count = reader.read(bytes);
                    if(count == -1){
                        break;
                    }
                    System.out.println("服务端接收的信息为：" + new String(bytes,0,count));
                    writer.write("服务端已收到你发送的数据");
                    writer.flush();
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if(socket!= null){
                    try {
                        socket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

        }
    }
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8080);
            System.out.println("等待客户端链接...");
            while(true){
                //如果没有客户端连接则阻塞(第一次阻塞)
                Socket socket = serverSocket.accept();
                System.out.println("客户端连接成功");
                new Thread(new ServerInner(socket)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
