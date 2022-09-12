package com.stack;

import java.util.Stack;

public class ReverseAStack {

    Node head;
    int size;

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void push(int data){
            Node newNode = new Node(data);

            newNode.next = head;
            size++;
            head = newNode;
    }

    public void reverse(){



    }

    public void show(){
        Node node = head;
        while (node!=null){
            System.out.print(node.data+" ");
            node=node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        ReverseAStack stack = new ReverseAStack();
        stack.push(23);
        stack.push(12);
        stack.push(10);
        stack.show();

    }
}
