package com.study.base.pattern.proxy.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TankDynamicProxy {
    private MoveAble m;

    public MoveAble getInstance(){
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");
        m = (MoveAble) Proxy.newProxyInstance(Tank.class.getClassLoader(),new Class[]{MoveAble.class},new TankLogInvocationHandler(new Tank()));
        return m;
    }
    class TankLogInvocationHandler implements InvocationHandler {
        private MoveAble m;

        public TankLogInvocationHandler(Tank tank) {
            this.m = tank;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("dynamicproxy pre hanle....");
            Object o = method.invoke(m,args);
            System.out.println("dynamicproxy after handle....");
            return o;
        }
    }
}
