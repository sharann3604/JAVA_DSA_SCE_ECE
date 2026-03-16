package com.Conditional_Loops;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int count = 0;
        if (n<=0){
            System.out.println(n + "Invalid input");
        }
        for (int i = 1; i <= n; i++) {
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.print(" is a Prime Number");
        }else {
            System.out.print(" is not a Prime Number");
        }
    }
}
