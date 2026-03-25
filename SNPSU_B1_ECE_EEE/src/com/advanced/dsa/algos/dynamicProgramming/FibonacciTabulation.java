package com.advanced.dsa.algos.dynamicProgramming;

public class FibonacciTabulation {
    public static int fib(int n) {
        // TC -> O(n) bcoz of for loop
        // SC -> O(n)-dp array of size (n+1)
        if (n <= 1) return n;
        // step-1: create a dp array of size n+1(starts with 0)
        int[] dp = new int[n+1];
        // step-2: store the known values{Tabulation}
        dp[0] = 0;
        dp[1] = 1;
        // step-3: calculate the unknown values(2 to n)
        for (int i=2; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 8;
        System.out.println("The "+n+"th fibonacci number is: "+ fib(n));
    }
}