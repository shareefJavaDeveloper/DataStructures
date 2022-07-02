package com.dll.impl;

public class DoublyLinkedList {

    Node head;
    Node tail;

    public void insert(int data){
        Node newNode = new Node();

        if(head==null){
            head = tail = newNode;
            newNode.data = data;
            newNode.next = null;
            newNode.previous =null;
        }else{
            tail.next = newNode;
            newNode.previous = tail;
            newNode.data= data;
            tail = newNode;
            tail.next=null;

        }

    }

    public void insertAtStart(int data){
        Node n = new Node();
        n.data = data;
        n.previous = null;
        n.next = head;
        head.previous = n;
        head = n;
    }

    public void insertAtIndex(int index, int data){
        Node newNode = new Node();

        if(index == 0){
            insertAtStart(data);
        }else{
            Node n = head;
            for (int i =0;i<index-1;i++){
                n = n.next;
            }
            newNode.data = data;
            newNode.next = n.next;
            n.next = newNode;
            newNode.previous = n;
        }
    }

    public void delete(int data){
        Node n = head;

        while(n.next != null && n.data != data){
            n = n.next;
        }
        if(n.data==data) {
            if (n.next == null) {
                n.previous.next = null;
            } else if (n.previous == null) {
                n.next.previous = null;
                head = n.next;
            } else {
                n.previous.next = n.next;
                n.next.previous = n.previous;
            }
        }

    }

    public int getByIndex(int index){

        Node n = head;

        for (int i=0;i<index;i++){
            n = n.next;
        }



        return n.data;
    }

    public void show(){
        Node n = head;

        if(n == null){
            return;
        }
        while (n.next!=null){
            System.out.print(n.data + ", ");
            n = n.next;
        }
        System.out.print(n.data);
        System.out.println();
    }

}
