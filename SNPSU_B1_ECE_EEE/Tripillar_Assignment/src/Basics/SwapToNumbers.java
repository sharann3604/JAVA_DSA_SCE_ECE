package com.basics;

public class SwapToNumbers {
    public static void main(String[] args) {
        //with third varaiable
        int a=5;
        int b=10;
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a="+a+" b="+b);
        //without third variable
        int x=10;
        int y=5;
        x = x-y;
        y = y+x;
        System.out.println("x="+x+" y="+y);
    }
}

