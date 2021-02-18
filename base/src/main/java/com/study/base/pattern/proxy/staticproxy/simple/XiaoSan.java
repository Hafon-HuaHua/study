package com.study.base.pattern.proxy.staticproxy.simple;

public class XiaoSan implements IService{
    @Override
    public void paoMeiYan() {
        System.out.println("xiaosan paomeiyan");
    }

    @Override
    public void happyWithMan() {
        System.out.println("xiaosan with man happy");
    }
}
