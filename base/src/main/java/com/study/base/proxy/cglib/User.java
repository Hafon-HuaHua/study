package com.study.base.proxy.cglib;

public class User {
    private String name;

    public void show(){
        System.out.println("cdlib is dancing!!");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
