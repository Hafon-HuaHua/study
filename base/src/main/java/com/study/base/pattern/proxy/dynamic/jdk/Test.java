package com.study.base.pattern.proxy.dynamic.jdk;

public class Test {
    public static void main(String[] args) {
        TankDynamicProxy dynamicProxy = new TankDynamicProxy();
        MoveAble m = dynamicProxy.getInstance();//在内存生成代理类继承Proxy并实现被代理类实现的接口，构造方法中是真正的InvlcationHandler的对象，以便调用invoke方法
        m.move();//此处实际上调用的是代理类的move方法，因为在创建代理类对象时会在内存生成代理类并实现被代理类的接口方法
    }
}
