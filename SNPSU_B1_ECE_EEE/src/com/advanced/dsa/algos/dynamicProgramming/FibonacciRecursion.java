package com.advanced.dsa.algos.dynamicProgramming;
// time complexity and space complexity are large (recursion)(stack)(O(n))
public class FibonacciRecursion {
    public static int fib(int n) {
        if (n<=1) return n;  // 0 for 0 & 1 for 1
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println("The "+n+"th fibonacci number is: "+ fib(n));
    }
}