package com.study.base.pattern.proxy.staticproxy.simple;

public class WangPo implements IService{
    private IService iService;

    public WangPo(IService iService){
        this.iService = iService;
    }

    @Override
    public void paoMeiYan() {
        iService.paoMeiYan();
    }

    @Override
    public void happyWithMan() {
        iService.happyWithMan();
    }
}
