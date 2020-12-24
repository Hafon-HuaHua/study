package com.study.base.pattern.singleton;

/**
 * 枚举单例
 * 最完美的一种方式，但工作中基本不用
 * 优点：保证线程安全，并且由于枚举的特性，保证单例，防止反序列化
 */
public enum Singleton_4 {
    INSTANCE;

    public Singleton_4 getInstance(){
        return INSTANCE;
    }
}
