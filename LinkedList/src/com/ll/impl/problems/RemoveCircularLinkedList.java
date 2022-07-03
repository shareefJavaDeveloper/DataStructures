package com.ll.impl.problems;

public class RemoveCircularLinkedList {

    Node head;
    Node tail;

    public void insert(int data){
        Node newNode = new Node(data);
        Node node = head;
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }

    }

    public Node fetch(int data){
        Node node = head;
        while(node.next!=null){
            if (node.data==data){
                return node;
            }
            node = node.next;
        }
        throw new RuntimeException("Couldn't find the element or may be you entered an last element");
    }

    public Node detectMeetingPoint(){
        //floyd's slow and fast pointers approach
        Node slow = head;
        Node fast = head;

        while (fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow==fast){
                return slow;
            }
        }

        return null;
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

        RemoveCircularLinkedList list = new RemoveCircularLinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.show();
        list.tail.next = list.fetch(2);
        Node meet = list.detectMeetingPoint();
        Node prev = list.StartingNodeOfCircularLL(meet,list.head);
        prev.next=null; //this should detach the circular linkedList
        //simple way is making list.tail.next as null it will also detach the tail element pointing to circular node
        list.show();



    }

    private Node StartingNodeOfCircularLL(Node meet, Node head) {
        Node prev = null;

        while (meet!=head){
            prev=meet;
            meet=meet.next;
            head=head.next;

        }

        return prev;
    }
}
