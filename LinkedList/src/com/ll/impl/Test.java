package com.ll.impl;

public class Test {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insert1(10);
        linkedList.insert1(20);
        linkedList.insert1(30);
        linkedList.show();
        linkedList.delete(20);
        linkedList.show();
    }

}
