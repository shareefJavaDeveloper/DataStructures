public class StackUsingArray {

    int[] a;
    int capacity;
    int top;

    public StackUsingArray(int capacity){
        this.capacity = capacity;
        this.top=-1;
        a = new int[capacity];
    }

    public void push(int element){
        if(top==capacity-1){
            throw new RuntimeException("Couldn't push the element");
        }
        top++;
        a[top]=element;
    }

    public int pop(){
        if (top==-1){
            throw new RuntimeException("No element");
        }
        int topElement = a[top];
        top--;
        return topElement;

    }

    public int peek(){
        if (top==-1){
            throw new RuntimeException("No element");
        }
        return a[top];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public void print(){
        for (int i=0;i<capacity;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }



}
