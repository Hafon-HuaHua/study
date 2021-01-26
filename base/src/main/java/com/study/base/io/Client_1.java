package com.study.base.io;

public class Client_1 extends ClientParent{
    @Override
    public void testClient(){
        super.clientSocket();
    }
    public static void main(String[] args) {
        Client_1 c1 = new Client_1();
        c1.testClient();
    }
}
