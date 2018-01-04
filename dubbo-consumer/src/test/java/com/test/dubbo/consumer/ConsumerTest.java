package com.test.dubbo.consumer;

import com.test.dubbo.pojo.User;
import com.test.dubbo.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by mayn on 2018/1/4.
 */
public class ConsumerTest {

    private UserService userService;

    @Before
    public void setUp() throws Exception {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "classpath:dubbo/*.xml");
        this.userService = applicationContext.getBean(UserService.class);
    }

    @Test
    public void testQueryAll() throws Exception {
        List<User> users = this.userService.queryAll();
        for (User user : users) {
            System.out.println(user.getUsername()+"================="+user.getPassword());
        }

    }

    @Test
    public void test(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "classpath:dubbo/*.xml");
        applicationContext.start();
    }


}