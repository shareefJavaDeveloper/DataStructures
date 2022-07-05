package com.stack;

import java.util.Stack;

public class ParanthesisMatchingProblem {

    public static void main(String[] args) {
        String paranthesis = "{(())}()";

        boolean ans = parathensisHelper(paranthesis);
        System.out.println(ans);
    }

    private static boolean parathensisHelper(String s) {

        Stack<Character> stack = new Stack<>();
        for (int i=0;i<s.length();i++){
            char a =s.charAt(i);
            if(isOpening(a)){
                stack.push(a);
            }else {
                if (stack.isEmpty()) {
                    return false;
                } else if (!isMatching(a, stack.peek())) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }

    private static boolean isMatching(char a, Character peek) {
        return (a==')' && peek=='(')||
                (a=='}' && peek=='{')||
                (a==']' && peek=='[');

    }

    public static boolean isOpening(char a){
        return a=='('||
                a=='{'||
                a=='[';
    }

}
