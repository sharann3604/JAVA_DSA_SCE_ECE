package com.advanced.dsa.algos.searching;

import java.util.Arrays;

public class LinearSearch {
    public static int LinearSearch(int [] arr,int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] arr={9,2,-1,4,6,7,3,8};
        int key=6;
        int index=LinearSearch(arr,key);
        if(index==-1) {
            System.out.println(key + "is not present in the array:" + Arrays.toString(arr));
        }else{
            System.out.println(key + " is present at index"+ index +" in the array"+ Arrays.toString(arr));
        }

    }
}