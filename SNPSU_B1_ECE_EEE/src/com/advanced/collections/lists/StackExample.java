package com.advanced.collections.lists;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println("Top Element using peek:"+ stack.peek());
        int top = stack.pop();
        System.out.println("Top Element:"+ top);
        System.out.println("Remaining Stack:"+stack);
        System.out.println("Top Elements using peek:"+ stack.peek());
        System.out.println("Size of stack:"+ stack.size());
        System.out.println("Stack is Empty?:"+stack.empty());
    }
}
