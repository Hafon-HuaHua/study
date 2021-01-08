package com.study.base.pattern.singleton;

/**
 * 通过锁机制
 * 工作中用的最多
 * 优点：加载类时不需要实例化
 */
public class Singleton_2_2 implements Runnable {
    private static volatile Singleton_2_2 singleton2; //加volatile的原因是防止指令重排导致的线程不安全，属于极端情况
    //private Singleton_2_2(){}
    private Object object = new Object();
    public static void main(String[] args) throws InterruptedException {
        Singleton_2_2 s1 = new Singleton_2_2();
        Singleton_2_2 s2 = new Singleton_2_2();
        for(int i = 0;i<20;i++){
            new Thread(s1).start();
            Thread.sleep(2);
        }
        for(int i = 0;i<20;i++){
            new Thread(s2).start();
            Thread.sleep(2);
        }
    }
    @Override
    public void run() {
        if(singleton2 == null){
            synchronized (object){
                if(singleton2 == null){
                    singleton2 = new Singleton_2_2();
                }
            }
        }
        System.out.println(singleton2.hashCode());
    }
}
