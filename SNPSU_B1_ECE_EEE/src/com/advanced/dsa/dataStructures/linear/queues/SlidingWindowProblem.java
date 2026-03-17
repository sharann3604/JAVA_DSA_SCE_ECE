package com.advanced.dsa.dataStructures.linear.queues;
    public class SlidingWindowProblem {
        public static void main(String[] args) {
            int[] arr={1,3,-1,-3,5,3,6,7};
            int k=3;
            for(int i=0;i<arr.length -k;i++){
                int max=arr[i];
                for (int j=i;j<i+k;j++){
                    if (arr[i]>max){
                        max=arr[j];
                    }
                }
                System.out.print(max + " ");
            }
        }
    }
