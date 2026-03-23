
    package com.advanced.dsa.dataStructures.nonLinear.heaps;

import java.util.Collections;
import java.util.PriorityQueue;

    public class KthSmallestLargest {
        public static int KthSmallest(int[] arr, int K) {
            PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
            for (int x : arr) {
                maxHeap.add(x);
                if (maxHeap.size()>K){
                    maxHeap.poll();  // remove extra elements > K size
                }
            }
            return maxHeap.peek(); // peek or poll -> both can be used
        }
        public static int KthLargest(int[] arr, int K) {
            PriorityQueue<Integer> minHeap = new PriorityQueue<>();
            for (int x : arr) {
                minHeap.add(x);
                if (minHeap.size()>K){
                    minHeap.poll();  // remove extra elements > K size
                }
            }
            return minHeap.poll();
        }

        public static void main(String[] args) {
            int[] arr = {3,2,1,5,6,4};
            int K=3;
            System.out.println(KthSmallest(arr, K));  // 3
            System.out.println(KthLargest(arr, K));   // 4
        }
    }
