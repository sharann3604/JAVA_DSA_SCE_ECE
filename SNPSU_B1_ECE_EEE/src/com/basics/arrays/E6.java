package com.basics.arrays;

import java.util.Arrays;

public class E6 {
    public static void main(String[] args) {
        // Some Special array methods
        int[] arr = {100,200,300,400,500};
        System.out.println(Arrays.toString(arr));
        int[] arr2 = new int[arr.length];
        System.out.println(Arrays.toString(arr2)); // 0 0 0 0 0
        // Copt the contents of one array into another
        // Method 1
        for (int i=0; i<arr.length;i++){
            arr2[i]= arr[i];
        }
        System.out.println(Arrays.toString(arr2));
        // Method 2
        int[] arr3 = new  int[arr2.length];
        System.arraycopy(arr2,0,arr3,0,arr2.length);
        System.out.println(Arrays.toString(arr3));
        // Method -3
        int[] arr4 = arr3.clone();
        System.out.println(Arrays.toString(arr4));
    }
}
