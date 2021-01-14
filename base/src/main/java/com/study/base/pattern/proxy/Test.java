package com.study.base.pattern.proxy;

import com.study.base.pattern.proxy.staticproxy.Tank;
import com.study.base.pattern.proxy.staticproxy.TankLogProxy;
import com.study.base.pattern.proxy.staticproxy.TankTimeProxy;

public class Test {
    public static void main(String[] args) {
        Tank tank = new Tank();
        TankLogProxy log = new TankLogProxy();
        log.setMoveAble(tank);
        TankTimeProxy time = new TankTimeProxy();
        time.setMoveAble(log);
        time.move();
    }
}
