package com.xuan;

import com.xuan.service.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by xuan on 2017/3/1 0001.
 */
public class BeanTest {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
        Person person = ctx.getBean("chinese", Person.class);
        person.userAxe();
    }
}
