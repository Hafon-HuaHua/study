package com.spring.demo;

import com.spring.demo.po.User;
import com.spring.demo.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springTx.xml");
        UserServiceImpl service = context.getBean("userServiceImpl",UserServiceImpl.class);
        User user = new User();
        user.setName("测试事务执行111");
        user.setPassword("222");
        user.setNickName("如果调用目标方法不支持事务，那么在目标方法中通过this的方式调用支持事务的方法事务也不会生效;由于事务是通过AOP动态代理" +
                "实现，所以可以通过在目标方法获取当前代理类然后通过代理调用支持事务的方法则事务就会生效");
        service.b(user);
    }
}
