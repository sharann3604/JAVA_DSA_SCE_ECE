package com.advanced.dsa.algos.dynamicProgramming;
import java.util.Arrays;
public class FibonacciMemoization {
    public static int fib(int n, int[] dp) {
        if (n <= 1) return n;
        // step 2: if u hv the value, don't calculate, just return -> memoization
        if (dp[n] != -1) {
            return dp[n];
        }
        // step-3: if u don't hv the value, calculate it
        return dp[n] = fib(n-1,dp) + fib(n-2,dp);
    }
    public static void main(String[] args) {
        int n=6;
        // step 1 : initially we will take a DP array of -1 values
        int[] dp = new int[n+1];  // the starting fibonacci number is 0, so (n+1)
        Arrays.fill(dp, -1);  // fill with default values '-1'
        System.out.println("The fibonacci of 6th is: "+fib(n,dp));
    }
}