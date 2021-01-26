package com.study.base.socket;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client_1 {
    public static void main(String[] args) {
        try(Socket socket = new Socket("localhost",8080);
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()))){
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入要发送的信息：");
            while(scanner.hasNextLine()){
                writer.write(scanner.nextLine());
                writer.flush();
                char[] bytes = new char[1024];
                int count = reader.read(bytes);
                if(count == -1){
                    continue;
                }
                System.out.println("客户端收到服务端返回的信息为：" + new String(bytes,0,count));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
