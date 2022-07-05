package com.stack;

import java.util.Stack;

public class PreviousSmallerElement {
    public static void main(String[] args) {
        int[] a = new int[]{4,3,10,4,15,18,25,8};

        int[] res = new int[a.length];
        previousSmallerElements(a,res);
        for (int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }

    }

    private static void previousSmallerElements(int[] a,int[] res) {

        Stack<Integer> stack = new Stack<>();

        for (int i=0;i<a.length;i++){
            while (!stack.isEmpty() && stack.peek()<=a[i]){
                stack.pop();
            }
            if (stack.isEmpty()){
                res[i]=-1;
            }else{
                res[i]=stack.peek();
            }
            stack.push(a[i]);
        }

    }
}
