package com.study.base.io;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 单线程BIO
 * 如果有一个线程连接到服务端在read的时候会阻塞，第二个客户端连接就无法进来
 */
public class Server_1 {
    public static void main(String[] args) {
        try(ServerSocket serverSocket = new ServerSocket(8080)){
            while (true){
                Socket socket = null;
                BufferedReader reader = null;
                BufferedWriter writer = null;
                try{
                    //如果没有客户端连接则阻塞(第一次阻塞)
                    System.out.println("等待客户端链接...");
                    socket = serverSocket.accept();
                    System.out.println("客户端连接成功");
                    //InputStream inputStream = new BufferedInputStream(socket.getInputStream());
                    reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                    writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                    while (true){
                        char[] bytes = new char[1024];
                        //in.read第二次阻塞，此时如果第一个连接阻塞在这里其它的客户端只能等待无法向下执行
                        int count = reader.read(bytes);
                        if(count == -1){
                            break;
                        }
                        String str = new String(bytes,0,count);
                        if("shutdown".equals(str)){
                            break;
                        }
                        System.out.println("服务端接收的信息为：" + str);
                        writer.write("服务端已收到你发送的数据");
                        writer.flush();
                    }
                }finally {
                    if(socket!= null){
                        socket.close();
                    }
                    if(reader != null){
                        reader.close();
                    }
                    if(writer != null){
                        writer.close();
                    }
                }

            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
