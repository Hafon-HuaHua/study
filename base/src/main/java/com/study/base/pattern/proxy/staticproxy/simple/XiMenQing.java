package com.study.base.pattern.proxy.staticproxy.simple;

public class XiMenQing {
    public static void main(String[] args) {
        WangPo wangPo = new WangPo(new XiaoSan());
        wangPo.paoMeiYan();
        wangPo.happyWithMan();
    }
}
