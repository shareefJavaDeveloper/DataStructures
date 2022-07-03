package com.ll.impl.problems;

public class PalindromeOfALinkedList {

    Node head;
    Node middle;
    Node tail;

    class Node{
        char data;
        Node next;
        Node(char data){
            this.data=data;
            this.next=null;
        }
    }

    public void insert(char data){
        Node newNode = new Node(data);
        Node n = head;
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            while(n.next!=null){
                n = n.next;
            }
                n.next = newNode;
                tail  = newNode;
        }
    }

    public void reverse(Node head){
        Node curr = head;
        Node prev = null;
        if(curr!=null){
            Node temp = curr.next;
            curr.next = prev;
            prev=curr;
            curr=temp;
        }
    }

    public void middle(){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        middle = slow;
    }

    public boolean palindrom(){
        Node curr = head;
        while(tail!=null){
            if(tail.data!=curr.data){
                return false;
            }
            tail = tail.next;
            curr = curr.next;

        }
        return true;
    }

    public static void main(String[] args) {

        PalindromeOfALinkedList palindrom = new PalindromeOfALinkedList();

        palindrom.insert('r');
        palindrom.insert('a');
        palindrom.insert('a');
        palindrom.insert('r');
        palindrom.middle();
        palindrom.reverse(palindrom.middle);
        System.out.println(palindrom.palindrom());

    }

}
