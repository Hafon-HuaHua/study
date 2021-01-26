package com.study.base.io.bio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * 客户端公共父类
 */
public abstract class ClientParent {
    protected void clientSocket(){
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
                    break;
                }
                System.out.println("客户端收到服务端返回的信息为：" + new String(bytes,0,count));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    protected abstract void testClient();
}
