package com.study.base.pattern.iterator;

import java.util.Collection;
import java.util.Iterator;

public class LinkedList {
    private Node head = null;
    private Node tail = null;
    private int size = 0;
    public void add(String name){
        Node n = new Node();
        n.setName(name);
        if(head != null && tail != null){
            tail.setNext(n);
            tail = n;
        }else{
            head = n;
            tail = n;
        }
        size++;
    }
    public int size(){
        return size;
    }
    /*public Node iterator(){
        if(head.getNext() == null){
            return null;
        }
        return head.getNext();
    }
    public boolean hasNext(){
        return head.getNext() != null;
    }
    public Node next(){
        return
    }*/
    public Node get(Node n1){
        Node n;
        if(n1 == null){
            n = head;
        }else{
            n = n1.getNext();
        }
        return n;
    }
    class Node{
        private String name;
        private Node next;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        for(int i =0;i < 10;i++){
            list.add("n" + i);
        }
        System.out.println(list.size());
        Node n = null;
        for(int i = 0;i<list.size();i++){
            if(i == 0){
                n = list.get(null);
            }
            Node n1 = list.get(n);
            n = n1;
            if(n1 == null){
                break;
            }
            System.out.println(n1.getName());
        }
    }
}
