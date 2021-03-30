package com.study.base.proxy.cglib;

import org.springframework.cglib.core.DebuggingClassWriter;

public class Test {
    public static void main(String[] args) {
//        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "D:/Temp/code/cglib");
        CglibProxy<User1> proxy = new CglibProxy(new User1());
        User1 user1 = proxy.getInstance();
        user1.show();
    }
}
