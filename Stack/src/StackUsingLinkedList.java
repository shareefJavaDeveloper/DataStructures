public class StackUsingLinkedList {

    Node head;
    int size;

    public void push(int data){
        Node newNode = new Node(data);

        newNode.next = head;
        size++;
        head = newNode;
    }

    public int pop(){
        if (head==null){
            throw new RuntimeException("Couldn't find the element to pop");
        }
        int res = head.data;
        head = head.next;
        size--;
        return res;

    }

    public int peek(){
        return head.data;
    }

    public boolean isEmpty(){
        return head==null;
    }

    public int size(){
        return size;
    }

    public void print(){
        Node node = head;
        while (node!=null){
            System.out.print(node.data+ " ");
            node = node.next;

        }
        System.out.println();
    }


}
