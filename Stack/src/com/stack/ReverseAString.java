package com.stack;

import java.util.Stack;

public class ReverseAString {

    public static void main(String[] args) {
        String str = "shareef";
        String reversedStr = reverse(str);
        System.out.println(reversedStr);
    }

    private static String reverse(String str) {
        Stack<Character> stack = new Stack<>();
        char[] charArray = new char[str.length()];
        for (int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            stack.push(ch);
        }
        for (int i =0;i<str.length();i++){
            char ch = stack.pop();
            charArray[i]=ch;
        }

        return new String(charArray);
    }
}
