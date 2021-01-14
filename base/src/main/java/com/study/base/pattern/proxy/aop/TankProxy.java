package com.study.base.pattern.proxy.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class TankProxy {

    @Before("execution(void com.study.base.pattern.proxy.aop.Tank.*(..))")
    public void before(){
        System.out.println("spring aop before.......");
    }
    @After("execution(void com.study.base.pattern.proxy.aop.Tank.*(..))")
    public void after(){
        System.out.println("spring aop after.......");
    }
    @Pointcut
    public void pointcut(){

    }
    @Around("execution(void com.study.base.pattern.proxy.aop.Tank.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("spring aop around before.......");
        jp.proceed();
        System.out.println("spring aop around after.......");
    }
}
