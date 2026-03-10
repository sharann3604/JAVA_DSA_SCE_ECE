package com.advanced.dsa.algos.searching;

import java.util.Scanner;

public class SquareRoot {
    public static int squareRoot(int n){
        int s=0;
        int e = n;
        int ans =-1;
        while (s<=e){
            int mid =s +(e-s)/2;
            int square = mid*mid;
            if (square==n){
                return mid;
            }else if (square > n){
                e=mid-1;
            }else {
                ans=mid;
                s=mid+1;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = scanner.nextInt();
        int sq_rt = squareRoot(n);
        System.out.println("The square root of "+ n + " is "+ sq_rt);
    }
}
