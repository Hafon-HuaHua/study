package com.study.base.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 单线程BIO
 * 如果有一个线程连接到服务端在read的时候会阻塞，第二个客户端连接就无法进来
 */
public class Server_1 {
    public static void main(String[] args) {
        try(ServerSocket serverSocket = new ServerSocket(8080);){

            while (true){
                Socket socket = null;
                InputStream in = null;
                OutputStream out = null;
                try{
                    //如果没有客户端连接则阻塞(第一次阻塞)
                    System.out.println("等待客户端链接...");
                    socket = serverSocket.accept();
                    System.out.println("客户端连接成功");
                    //InputStream inputStream = new BufferedInputStream(socket.getInputStream());
                    in = socket.getInputStream();
                    out = socket.getOutputStream();
                    while (true){
                        byte[] bytes = new byte[1024];
                        //in.read第二次阻塞，此时如果第一个连接阻塞在这里其它的客户端只能等待无法向下执行
                        int count = in.read(bytes);
                        if(count == -1){
                            break;
                        }
                        System.out.println("服务端接收的信息为：" + new String(bytes,0,count));
                        out.write("服务端已收到你发送的数据".getBytes());
                        out.flush();
                    }
                }finally {
                    if(socket!= null){
                        socket.close();
                    }
                    if(in != null){
                        in.close();
                    }
                    if(out != null){
                        out.close();
                    }
                }

            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
