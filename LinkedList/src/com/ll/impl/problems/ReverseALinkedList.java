package com.ll.impl.problems;

public class ReverseALinkedList {

    static Node head;
    Node tail;

     class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public void insert(int data){

         Node n = head;
         Node newNode = new Node(data);

         if(head == null){
             head = newNode;
             tail = newNode;
         }else{
             while(n.next!=null){
                 n=n.next;
             }
             n.next=newNode;
             tail=newNode;
         }
    }

    public void show(){
         Node n = head;
         while(n!=null){
             System.out.print(n.data+" ");
             n = n.next;
         }
        System.out.println();
    }

    public int size(){
         int count =0;
         Node n = head;
         while(n!=null){
             n = n.next;
             count++;
         }
         return count;
    }

    public void reverse(){
         Node curr = head;
         Node prev = null;

         while(curr!=null){
             Node temp = curr.next;
             curr.next=prev;
             prev=curr;
             curr=temp;
         }
         head = prev;
    }

//    public Node reverseUsingRecursion(Node head){
//
//         if(head==null || head.next==null){
//             return head;
//         }
//         Node newHead = reverseUsingRecursion(head.next);
//         Node headNext = head.next;
//         headNext.next = head;
//         head.next = null;
//         return newHead;
//    }


    public static void main(String[] args) {

         ReverseALinkedList rev = new ReverseALinkedList();
         rev.insert(10);
         rev.insert(20);
         rev.insert(30);
         rev.show();
         System.out.println(rev.size());
         rev.reverse();
         rev.show();

    }
}
