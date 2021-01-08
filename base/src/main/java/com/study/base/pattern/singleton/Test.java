package com.study.base.pattern.singleton;

public class Test {
    public static void main(String[] args) {
        /*Singleton_1 s1 = Singleton_1.getInstance();
        Singleton_1 s2 = Singleton_1.getInstance();
        System.out.println(s1 == s2);*/
        for(int i = 0;i<50;i++){
            new Thread(() -> {
                System.out.println(Singleton_2.getInstance().hashCode());
            }).start();
        }
    }
}
