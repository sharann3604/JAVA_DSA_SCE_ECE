package com.advanced.dsa.algos.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void BubbleSort(int[] arr) {
        int n= arr.length;
        for(int i=1;i<n;i++){//no of iterations n-1
            for(int j=0;j<n-i;j++){//second last element
                if(arr[j]>arr[j+1]){
                    int temp=arr [j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={9,2,1,4,6,8,7};
        System.out.println("original"+Arrays.toString(arr));
        BubbleSort(arr);
        System.out.println("sorted" +Arrays.toString(arr));

    }
}