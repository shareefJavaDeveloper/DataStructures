public class Runner {
    public static void main(String[] args) {
        StackUsingArray stackUsingArray = new StackUsingArray(3);

        stackUsingArray.push(2);
        stackUsingArray.push(3);
        stackUsingArray.push(4);
        stackUsingArray.print();
        System.out.println("pop -> "+stackUsingArray.pop());
        System.out.println("peek -> "+stackUsingArray.peek());
        System.out.println(stackUsingArray.isEmpty());
        System.out.println("pop -> "+stackUsingArray.pop());
        System.out.println(stackUsingArray.isEmpty());

        System.out.println("------------");
        StackUsingLinkedList stackUsingLinkedList = new StackUsingLinkedList();

        stackUsingLinkedList.push(10);
        stackUsingLinkedList.push(20);
        stackUsingLinkedList.push(30);
        stackUsingLinkedList.print();
        System.out.println("pop -> "+stackUsingLinkedList.pop());
        System.out.println("peek -> "+stackUsingLinkedList.peek());
        stackUsingLinkedList.print();
        System.out.println("size -> "+stackUsingLinkedList.size());
        System.out.println(stackUsingLinkedList.isEmpty());
    }
}
