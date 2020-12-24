package com.study.base.pattern.singleton;

/**
 * 通过锁机制
 * 工作中用的最多
 * 优点：加载类时不需要实例化
 */
public class Singleton2 {
    private static volatile Singleton2 singleton2;
    private static Object object = new Object();
    private Singleton2(){}

    public static Singleton2 getInstance(){
        if(singleton2 == null){
            synchronized (object){
                if(singleton2 == null){
                    singleton2 = new Singleton2();
                }
            }
        }
        return singleton2;
    }
}
