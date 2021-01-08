package com.study.base.pattern.responsibilitychain;

public class Xiaozhang1 extends Handle1{
    @Override
    public boolean handleRequest(int day) {
        if(day < 1){
            return false;
        }
        if(day <= 10){
            ok();
        }else{
            return false;
        }
        return true;
    }

    private void ok() {
        System.out.println("校长批准");
    }
}
