package com.study.base.stream;

import org.apache.commons.io.Charsets;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamTest {

    private static void write() {
        try(OutputStream outputStream = new FileOutputStream("stream.txt")){
            String writeText = "test hafon writeStream 哈哈哈";
            byte[] bytes = writeText.getBytes(Charsets.UTF_8);
            outputStream.write(bytes);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    private static void write_1(){
        try(OutputStream outputStream = new BufferedOutputStream(new FileOutputStream("stream.txt"))){
            String writeText = "test hafon writeStream 嘿嘿嘿";
            byte[] bytes = writeText.getBytes(Charsets.UTF_8);
            outputStream.write(bytes);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
    private static void write_2(){
        try(Writer writer = new OutputStreamWriter(new BufferedOutputStream(new FileOutputStream("stream.txt")),Charsets.UTF_8)){
            String writeText = "test hafon writeStream 啦啦啦";
            writer.write(writeText);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    private static void read(){
        long t1 = System.currentTimeMillis();
        try(InputStream in = new FileInputStream("stream.txt")){
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            byte[] bytes = new byte[1024];
            int readCount;
            while((readCount = in.read(bytes)) != -1){
                outputStream.write(bytes,0,readCount);
            }
            System.out.println(outputStream.toString());
        }catch (Exception e){
            e.printStackTrace();
        }
        long t2 = System.currentTimeMillis();
        System.out.println("read操作时间：" + (t2 -t1));
    }
    private static void read_1(){
        long t1 = System.currentTimeMillis();
        try(InputStream in = new BufferedInputStream(new FileInputStream("stream.txt"))){
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            byte[] bytes = new byte[1024];
            int readCount;
            while((readCount = in.read(bytes)) != -1){
                outputStream.write(bytes,0,readCount);
            }
            String str = outputStream.toString(Charsets.UTF_8.name());
            System.out.println(str);
        }catch (Exception e){
            e.printStackTrace();
        }
        long t2 = System.currentTimeMillis();
        System.out.println("read_1操作时间：" + (t2 -t1));
    }
    private static void read_2(){
        long t1 = System.currentTimeMillis();
        try(Reader reader = new InputStreamReader(new BufferedInputStream(new FileInputStream("stream.txt")))){
            char[] bytes = new char[1024];
            reader.read(bytes);
            System.out.println(new String(bytes));
        }catch (Exception e){
            e.printStackTrace();
        }
        long t2 = System.currentTimeMillis();
        System.out.println("read_2操作时间：" + (t2 -t1));
    }
    private static void read_3(){
        long t1 = System.currentTimeMillis();
        try(Reader reader = new InputStreamReader(new BufferedInputStream(new FileInputStream("stream.txt")))){
            CharArrayWriter writer = new CharArrayWriter();
            char[] chars = new char[1024];
            int count;
            while((count = reader.read(chars)) != -1){
                writer.write(chars,0,count);
            }
            System.out.println(writer.toString());
        }catch (Exception e){
            e.printStackTrace();
        }
        long t2 = System.currentTimeMillis();
        System.out.println("read_3操作时间：" + (t2 -t1));
    }
    private static void datOutPut(){
        List<Hafon> list = Arrays.asList(new Hafon(1, "h1"), new Hafon(2, "h2"));
        try(DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("stream.dat")))){
            out.writeInt(list.size());
            for(Hafon h : list){
                out.writeInt(h.getAge());
                out.writeUTF(h.getName());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    private static List<Hafon> dataInput(){
        try(DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("stream.dat")))){
            int size = in.readInt();
            List<Hafon> list = new ArrayList<>(size);
            for(int i = 0;i < size;i++){
                Hafon hafon = new Hafon();
                hafon.setAge(in.readInt());
                hafon.setName(in.readUTF());
                list.add(hafon);
            }
            return list;
        }catch (Exception e){
            e.printStackTrace();
        }
        return new ArrayList<>();
    }
     static class Hafon{
        private int age;
        private String name;
        private Hafon(){}
        private Hafon(int age,String name){
            this.age = age;
            this.name = name;
        }
        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

         @Override
         public String toString() {
             return "Hafon{" +
                     "age=" + age +
                     ", name='" + name + '\'' +
                     '}';
         }
     }
    public static void main(String[] args) {
        /*List<Hafon> list = dataInput();
        for(Hafon h : list){
            System.out.println(h);
        }*/
        read_2();
    }
}
