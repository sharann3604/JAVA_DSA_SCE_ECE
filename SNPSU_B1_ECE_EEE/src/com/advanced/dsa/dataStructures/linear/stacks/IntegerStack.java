package com.advanced.dsa.dataStructures.linear.stacks;

import java.util.Stack;

public class IntegerStack {
    public static void main(String[] args) {
        Stack<Integer>integers=new Stack<>();
        integers.push(1);
        integers.push(2);
        integers.push(1283);
        integers.push(0351);
        System.out.println(integers.peek());
        System.out.println(integers.size());
        System.out.println(integers.empty());

    }
}