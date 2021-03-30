package com.study.base.proxy.jdk;

import com.study.base.proxy.jdk.Show;

public class User implements Show {
    private String name;

    @Override
    public void show(){
        System.out.println(name + " is dancing");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
