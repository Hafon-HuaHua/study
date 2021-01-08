package com.study.base.pattern.singleton;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 通过锁机制
 * 工作中用的最多
 * 优点：加载类时不需要实例化
 */
public class Singleton_2_1 {
    private static volatile Singleton_2_1 singleton2; //加volatile的原因是防止指令重排导致的线程不安全，属于极端情况
    private static Lock lock = new ReentrantLock();
    private Singleton_2_1(){}

    public static Singleton_2_1 getInstance(){
        if(singleton2 == null){
            try{
                lock.lock();
                Thread.sleep(2);
                if(singleton2 == null){
                    singleton2 = new Singleton_2_1();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
        return singleton2;
    }
}
