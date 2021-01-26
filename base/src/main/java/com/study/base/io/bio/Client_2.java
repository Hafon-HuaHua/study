package com.study.base.io.bio;

public class Client_2 extends ClientParent{
    @Override
    public void testClient(){
        super.clientSocket();
    }
    public static void main(String[] args) {
        Client_2 c2 = new Client_2();
        c2.testClient();
    }
}
