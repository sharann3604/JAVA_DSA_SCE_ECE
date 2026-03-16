package com.Conditional_Loops;

import java.util.Scanner;

    public class LargestOfThreeNumbers {
        public static void main(String args[]) {
            int a = 4;
            int b = 2;
            int c = 3;
            if (a > b && a > c) {
                System.out.println(a + " is largest");
            }else if (b > a && b > c) {
                System.out.println(b + " is largest");
            }else {
                System.out.println(c + " is largest");
            }
        }
    }

