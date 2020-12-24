package com.study.base.pattern.singleton;

/**
 * 静态内部类
 * 比较完美的一种写法，但实际工作中用的不多
 * 优点：保证线程安全，加载类时不需要实例化，只有在真正调用的时候才会实例化并且由jVM帮我们控制单例（JVM加载类的时候只会加载一次）
 */
public class Singleton_3 {
    private Singleton_3(){}
    private static class Singleton_3_Inner{
        private static final Singleton_3 s3 = new Singleton_3();
    }
    public static Singleton_3 getInstance(){
        return Singleton_3_Inner.s3;
    }
}
