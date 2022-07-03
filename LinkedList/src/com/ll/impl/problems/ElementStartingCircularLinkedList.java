package com.ll.impl.problems;

public class ElementStartingCircularLinkedList {

    Node head;
    Node tail;

    public void insert(int data){
        Node newNode = new Node(data);
        Node n = head;
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }

    }

    public Node fetch(int data){

        Node node = head;

        while (node!=null){
            if (node.data==data){
                return node;
            }
            node = node.next;
        }

        throw new RuntimeException("Couldn't find the node");
    }

    public Node detectMeetingNode(){
        Node slow = head;
        Node fast = head;

         while(fast!=null&&fast.next!=null){
             slow = slow.next;
             fast = fast.next.next;
             if (slow==fast){
                 return slow;
             }
         }

         return null;
    }

    public Node circularLLStartingNode(Node meet,Node head){

        while(meet!=head){
            meet = meet.next;
            head = head.next;
        }

        return meet;


    }

    public void show(){
        Node node = head;
        while (node!=null){
            System.out.print(node.data+" ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        ElementStartingCircularLinkedList list = new ElementStartingCircularLinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.show();
        list.tail.next = list.fetch(2);
        Node meet = list.detectMeetingNode();
        System.out.println(list.circularLLStartingNode(meet,list.head).data);

    }

}
