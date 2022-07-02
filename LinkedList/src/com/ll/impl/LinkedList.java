package com.ll.impl;

public class LinkedList {

    Node head;
    Node tail;

    public void insert(int data){
        Node node = new Node();

        node.data = data;
        node.next = null;

        if (head == null) {
            head = node;
        }else{
            Node n = head;
            while (n.next!=null){
                n=n.next;
            }
            n.next = node;
        }

    }

    public void insert1(int data){
        Node newNode = new Node();

        newNode.data = data;
        newNode.next = null;

        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
    }

    public  void insertAtStart( int data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        node.next = head;
        head = node;

    }

    public void insertAtIndex(int index, int data){
        Node node = new Node();
        node .data = data;
        node.next = null;

        if(index == 0) {
            insertAtStart(data);
        }
        else {
            Node n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }

    public boolean search(int key){

        Node n = head;

        while(n.next!=null){

            if(n.data==key) return true;
            n = n.next;
        }
        if(n.data==key) return true;

        return false;
    }

    public void delete(int data){

        Node n = head;
        Node prev = null;

        if(n!=null && n.data == data){
            head = n.next;
            return;
        }

        while(n.next!=null && n.data != data){
            prev = n;
            n = n.next;
        }

        if(n == null){
            return;
        }

        prev.next = n.next;


    }

    public int getElementIndex(int index){
        Node n = head;
        for (int i=0;i<=index;i++){
            if(i==index){
                return n.data;
            }
            n = n.next;
        }
         return -1;
    }

    public void show(){
        Node node = head;
        if(head==null) return;
        System.out.print("{");
        while(node.next!=null){
            System.out.print(node.data +", ");
            node = node.next;
        }
        System.out.print(node.data);
        System.out.print("}");
        System.out.println();
    }

}
