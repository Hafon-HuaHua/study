package com.study.base.pattern.proxy.staticproxy;

public class TankTimeProxy implements MoveAble{
    private MoveAble moveAble;
    @Override
    public void move() {
        long t1 = System.currentTimeMillis();
        moveAble.move();
        long t2 = System.currentTimeMillis();
        System.out.println("花费的时间：" + (t2 -t1));
    }

    public MoveAble getMoveAble() {
        return moveAble;
    }

    public void setMoveAble(MoveAble moveAble) {
        this.moveAble = moveAble;
    }
}
