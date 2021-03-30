package com.study.base.proxy.jdk;

public class Test {
    public static void main(String[] args) {
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");
        User user = new User();
        user.setName("hafon");
        JdkDynicProxy proxy = new JdkDynicProxy(user);
        Show s = (Show) proxy.newInstance();
        s.show();

    }
}
