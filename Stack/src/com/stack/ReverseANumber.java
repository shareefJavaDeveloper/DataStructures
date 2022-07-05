package com.stack;

import java.util.Stack;

public class ReverseANumber {

    public static void main(String[] args) {
        int number = 14321;

        System.out.println(reverse(number));
    }

    private static  int reverse(int number) {
        int reverse = 0;
        int i=1;
        Stack<Integer> stack = push_Digits(number);
        while (!stack.isEmpty()){
            reverse = reverse+(stack.peek()*i);
            stack.pop();
            i = i*10;
        }
        return reverse;

    }

    private static Stack<Integer> push_Digits(int number) {
        Stack<Integer> stack = new Stack<>();

        while(number!=0){
            int digit = number%10;
            stack.push(digit);
            number = number/10;
        }
        return stack;
    }

}
