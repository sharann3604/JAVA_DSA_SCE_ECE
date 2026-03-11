package com.basics.methods.recursion;

public class SumOfNTerms {
    public static int sun(int n){
        //Base Case: if n==0 -> return 0;
        if (n==0){
            return 0;
        }
        return n+sun(n-1);
    }

    public static void main(String[] args) {
        System.out.println(sun(10));
        System.out.println(sun(100));
        System.out.println(sun(5));
    }
}
