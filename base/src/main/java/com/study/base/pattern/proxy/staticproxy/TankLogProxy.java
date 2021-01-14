package com.study.base.pattern.proxy.staticproxy;

public class TankLogProxy implements MoveAble{
    private MoveAble moveAble;
    @Override
    public void move() {
        System.out.println("pre log...");
        moveAble.move();
        System.out.println("end log...");
    }

    public MoveAble getMoveAble() {
        return moveAble;
    }

    public void setMoveAble(MoveAble moveAble) {
        this.moveAble = moveAble;
    }
}
