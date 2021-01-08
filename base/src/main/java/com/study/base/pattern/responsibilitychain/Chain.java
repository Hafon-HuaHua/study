package com.study.base.pattern.responsibilitychain;

import org.omg.PortableServer.LIFESPAN_POLICY_ID;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Chain extends Handle{
    List<Handle1> list = new LinkedList<>();

    public Chain(){
        list.add(new Banzhuren1());
        list.add(new Xizhuren1());
        list.add(new Xiaozhang1());
    }

    @Override
    public void handleRequest(int day) {
        Iterator<Handle1> itor = list.iterator();
        while(itor.hasNext()){
            Handle1 h = itor.next();
            if(h.handleRequest(day)){
                break;
            }
        }
        /*for(int i = 0; i<list.size();i++){
            if(list.get(i).handleRequest(day)){
                break;
            }
        }*/
    }
}
