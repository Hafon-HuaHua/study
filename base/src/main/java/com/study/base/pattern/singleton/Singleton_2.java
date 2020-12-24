package com.study.base.pattern.singleton;

/**
 * 通过锁机制
 * 工作中用的最多
 * 优点：加载类时不需要实例化
 */
public class Singleton_2 {
    private static volatile Singleton_2 singleton2; //加volatile的原因是防止指令重排导致的线程不安全，属于极端情况
    private static Object object = new Object();
    private Singleton_2(){}

    public static Singleton_2 getInstance(){
        if(singleton2 == null){
            synchronized (object){
                if(singleton2 == null){
                    singleton2 = new Singleton_2();
                }
            }
        }
        return singleton2;
    }
}
