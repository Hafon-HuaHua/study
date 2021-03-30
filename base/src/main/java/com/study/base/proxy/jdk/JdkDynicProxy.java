package com.study.base.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkDynicProxy implements InvocationHandler {

    /**
     * 要代理的目标类
     */
    private Object targetUser;

    /*通过构造将目标类传进来进行代理使用*/
    public JdkDynicProxy(Object targetUser){
        this.targetUser = targetUser;
    }
    public Object newInstance(){
        //创建代理类的实例，生成class字节码文件
        //此处会把InvocationHandler通过生成的代理类的构造当作参数传进去，实际调用方法的时候调用的是代理类
        //中的方法，代理类中有静态代码块标识最终要调的是哪个接口的哪个方法，然后通过之前传进来的
        //InvocationHandler来调用invoke方法把最终要调用的方法名和接口名进来，然后执行代理类中的
        //逻辑，再执行目标类的方法
      return Proxy.newProxyInstance(targetUser.getClass().getClassLoader(),targetUser.getClass().getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("jdk动态代理开始....");
        Object res = method.invoke(targetUser,args);
        System.out.println("jdk动态代理结束....");
        return res;
    }
}
