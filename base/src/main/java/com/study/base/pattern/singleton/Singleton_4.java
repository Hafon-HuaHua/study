package com.study.base.pattern.singleton;

/**
 * 枚举单例
 * 最完美的一种方式，但工作中基本不用
 * 优点：保证线程安全，并且由于枚举的特性，保证单例，防止反序列化（无法通过反射实例化，因为没有构造方法）
 */
public enum Singleton_4 {
    INSTANCE;
}
