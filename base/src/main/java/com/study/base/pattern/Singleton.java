package com.study.base.pattern;

import java.util.ArrayList;
import java.util.List;

public class Singleton {
    private static Singleton singleton;
    private Singleton(){}
    public static Singleton getInstance(){
        if(singleton == null){
            synchronized (Singleton.class){
                if(singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
    public void show(Singleton s){
        System.out.println("hashcode:" + s.hashCode());
//        System.out.println("对象本身：" + s);
    }
    static class T extends Thread{
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance();
            singleton.show(singleton);
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Thread[] ts = new Thread[10000];
        for(int i = 0; i < 10000; i++){
            ts[i] = new T();
        }
        for(Thread t : ts){
            t.start();
        }
        for(Thread t : ts){
            t.join();
        }
        System.out.println("main end");
    }
}
