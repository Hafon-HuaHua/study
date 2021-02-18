package com.study.base.pattern.proxy.staticproxy.simple;

public class PanJinLian implements IService{
    @Override
    public void paoMeiYan() {
        System.out.println("panjinlian paomeiyan");
    }

    @Override
    public void happyWithMan() {
        System.out.println("panjinlian with man happy");
    }
}
