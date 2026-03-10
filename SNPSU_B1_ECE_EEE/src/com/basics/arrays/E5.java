package com.basics.arrays;

public class E5 {
    public static void printArray(int[] arr){
        for (int x: arr){
            System.out.print(x+" ");
        }
        System.out.println();
    }
    public static int[] createArray(){
        return new int[]{7,1,-2,-4,5};
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        printArray(arr);
        int[] result = createArray();
        for (int num:result){
            System.out.print(num+" ");
        }
        System.out.println();
        printArray(new int[]{10,20,30,40,50});
    }
}
