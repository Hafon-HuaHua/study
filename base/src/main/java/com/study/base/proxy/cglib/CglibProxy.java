package com.study.base.proxy.cglib;

import org.springframework.cglib.proxy.Enhancer;

public class CglibProxy<T> {
    private Object target;
    public CglibProxy(Object target){
        this.target = target;
    }
    public T getInstance(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(new UserMethodInterceptor());
        return (T)enhancer.create();
    }

}
