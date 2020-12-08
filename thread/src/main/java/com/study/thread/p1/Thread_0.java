package com.study.thread.p1;

public class Thread_0 {
    static class T0 implements Runnable{

        @Override
        public void run() {
            System.out.println("name:" + Thread.currentThread().getName());
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[10];
        for(int i = 0; i < 10;i++){
            threads[i] = new Thread(new T0());
        }
        for(int i = 0; i < 10;i++){
            threads[i].start();
        }
        for(int i = 0; i < 10; i++){
            threads[i].join();
        }
        System.out.println("end");
    }
}
