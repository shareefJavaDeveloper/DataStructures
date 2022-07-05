package com.stack;

import java.util.Stack;

public class NextGreaterElement {

    public static void main(String[] args) {

        int[] array = new int[]{1,3,2,5,24,5,14,4};
        int[] result = new int[array.length];

        functionToFindNextGreater(array,result);

        for (int i =0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }


    }

    private static void functionToFindNextGreater(int[] array,int[] result) {

        Stack<Integer> stack = new Stack<>();

        for (int i = array.length-1;i>=0;i--){

            while(!stack.isEmpty() && stack.peek()<=array[i]){
                stack.pop();
            }
            if (stack.isEmpty()){
                result[i] = -1;
            }
            else result[i] = stack.peek();

            stack.push(array[i]);

        }
    }


}
