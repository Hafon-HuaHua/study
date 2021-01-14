package com.study.base.pattern.proxy.dynamic.cglib;

import com.sun.corba.se.impl.interceptors.InterceptorInvoker;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxy {
    public void handle(){
        Enhancer en = new Enhancer();
        en.setSuperclass(Tank.class);
        en.setCallback(new CglibInterceptor());
        Tank tank = (Tank) en.create();
        tank.move();
    }

    class CglibInterceptor implements MethodInterceptor {

        @Override
        public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
            System.out.println("pre cglib....");
            Object re = methodProxy.invokeSuper(o,objects);
            System.out.println("after cglib....");
            return re;
        }
    }
}
