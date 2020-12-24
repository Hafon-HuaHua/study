package com.study.base.pattern.singleton;

/**
 * 饿汉式
 * 工作中用的较多
 * 优点：由JVM保证单例，不需要我们关注
 * 缺点：在类加载的时候就实例化，占用空间，耗费时间。但反过来说，不需要的话为什么要写它，加载它呢？
 */
public class Singleton_1 {
    private static final Singleton_1 singleton1 = new Singleton_1();
    private Singleton_1(){}

    public static Singleton_1 getInstance(){
        return singleton1;
    }
    public void m(){
        System.out.println("mmmm");
    }

}
