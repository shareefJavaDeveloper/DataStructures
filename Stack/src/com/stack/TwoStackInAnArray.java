package com.stack;

public class TwoStackInAnArray {

     static class MyTwoStack{
        int top1=-1;
        int top2;
        int capacity;

        int array[];

        MyTwoStack(int capacity){
            this.capacity = capacity;
            this.top2=capacity;
            array = new int[capacity];
        }

        public void push1(int element){
            if(top1<top2-1){
                array[++top1]=element;
            }
            else{
                throw new StackOverflowError();
            }
        }

        public void push2(int element){
            if (top1<top2-1){
                array[--top2]=element;
            }
            else{
                throw new StackOverflowError();
            }
        }

        public int pop1(){
            if (top1!=-1){
                int x = array[top1];
                top1--;
                return x;
            }
            else{
                throw new RuntimeException("no elements to pop");
            }
        }

        public int pop2(){
            if(top2!=capacity){
                int x = array[top2];
                top2++;
                return  x;
            }
            else {
                throw new RuntimeException("no elements to be popped");
            }
        }
    }

    public static void main(String[] args) {
        MyTwoStack stack = new MyTwoStack(3);
        stack.push1(2);
        stack.push1(3);
        stack.push2(1);
        System.out.println(stack.pop1());
        stack.push2(4);
        System.out.println(stack.pop2());

    }
}
