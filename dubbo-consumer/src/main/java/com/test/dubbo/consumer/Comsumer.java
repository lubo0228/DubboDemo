package com.test.dubbo.consumer;

import com.test.dubbo.pojo.User;
import com.test.dubbo.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by mayn on 2018/1/4.
 */
public class Comsumer {
    public static void main(String[] args) throws InterruptedException {
        //测试常规服务
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:dubbo/*.xml");
        context.start();
        System.out.println("consumer start");
        UserService userService = context.getBean(UserService.class);
        System.out.println("consumer");
        List<User> users = userService.queryAll();
        for (User user : users) {
            System.out.println(user.getUsername()+"================="+user.getPassword());
        }
        Thread.sleep(100000);
    }
}
