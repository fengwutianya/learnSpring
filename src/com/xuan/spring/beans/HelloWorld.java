package com.xuan.spring.beans;

/**
 * Created by xuan on 2017/3/1 0001.
 */
public class HelloWorld {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println(name);
    }

    private String name;
}
