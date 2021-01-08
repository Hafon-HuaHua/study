package com.study.base.pattern.responsibilitychain;

public class Banzhuren1 extends Handle1 {
    @Override
    public boolean handleRequest(int day) {
        if(day < 1){
            return false;
        }
        if(day <= 2){
            ok();
            return true;
        }else{
            return false;
        }
    }
    private void ok(){
        System.out.println("班主任批准");
    }
}
