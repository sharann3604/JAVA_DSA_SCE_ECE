package com.basics.arrays;

public class E1 {
    public static void main(String[] args) {
        // method 1
        int[] arr; // declaration
        arr = new int[5]; // memory allocation (20 bytes) -> 4 bytes * 5 blocks
        System.out.println(arr[4]);

    /* if we do not provide any values, the JVM uses "FALLBACK MECHANISM"
       it uses the default values of that particular data type
       int = 0, float=0.0, char and string = null, boolean=false
    */
        //  Declaration and memory allocation in single line
        // method 2
        int[] arr2 = new int[5];
        System.out.println(arr2[4]);
        // method 3
        int[] arr3 = {2,1,3,4,6};
        System.out.println(arr3[4]);
        // method 4

    }
}