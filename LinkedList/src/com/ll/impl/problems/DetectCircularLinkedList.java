package com.ll.impl.problems;

public class DetectCircularLinkedList {
    static Node head;
    static Node tail;

    static class Node{
        char data;
        Node next;

        Node(char data){
            this.data = data;
            this.next = null;
        }
    }

    public void insert(Node node){
        Node n = head;
        if(n==null){
            head = node;
            tail = node;
        }
        else{
            tail.next=node;
            tail = node;
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

    public static Node fetch(char data){
        Node node = head;
            while (node.next != null) {
                if (node.data == data) {
                    return node;
                }
                node = node.next;
            }
        throw new RuntimeException("Couldn't find the element");
    }

    private boolean detectCircularLinkedList() {
        //Floyd’s slow and fast pointers approach
        //Another approach is to use hashmap, but it will O(N) space complexity.
        Node slow = head;
        Node fast = head;

        if(head==null || head.next==null){
            return false;
        }

        while (fast!=null&&fast.next!=null){
            slow = slow.next;
            fast= fast.next.next;
            if(slow==fast){
                return true;
            }
        }


        return false;
    }

    public static void main(String[] args) {

        DetectCircularLinkedList detect = new DetectCircularLinkedList();
        detect.insert(new Node('a'));
        detect.insert(new Node('b'));
        detect.insert(new Node('c'));
        detect.insert(new Node('d'));
        detect.show();
        System.out.println(tail.data + " "+tail.next);
        tail.next=fetch('b');
        System.out.println(tail.data + " "+tail.next.data);

        System.out.println(detect.detectCircularLinkedList());

    }

}
