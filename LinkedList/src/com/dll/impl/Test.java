package com.dll.impl;

public class Test {

    public static void main(String[] args) {

        DoublyLinkedList doublelist = new DoublyLinkedList();

        doublelist.show();
        doublelist.insert(23);
        doublelist.insert(24);
        doublelist.insert(25);

        doublelist.show();

        doublelist.insertAtStart(26);
        doublelist.show();
        doublelist.insertAtIndex(1,27);
        doublelist.show();
        doublelist.insertAtIndex(5,28);
        doublelist.show();
        doublelist.delete(26);
        doublelist.show();
        doublelist.delete(53);
        doublelist.show();
        System.out.println(doublelist.getByIndex(0));
    }
}
