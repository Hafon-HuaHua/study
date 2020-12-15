package com.study.base.exception;

import java.io.*;

public class ExceptionTest {

    public static void show(){
        int a = 10;
        int b = 0;
        a:
        try{
            int c = a/b;
            System.out.println(c);
        }catch (ArithmeticException e){
            b = 5;
            break a;
        }
    }

    public static void show1(){
        try{
            System.out.println("show1");
            System.exit(0);
        }finally {
            System.out.println("finally");
        }
    }

    public static void main(String[] args) {
        //show();
        /*try(InputStream in = new FileInputStream("");
            OutputStream out = new FileOutputStream("")) {
            byte[] bytes = new byte[1024];
            int r;
            while((r = in.read(bytes)) != -1){
                out.write(bytes,0,r);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        show1();
    }
}
