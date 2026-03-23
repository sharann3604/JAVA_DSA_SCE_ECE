package com.advanced.dsa.dataStructures.nonLinear.heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class MaxHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.add(8);
        maxHeap.add(6);
        maxHeap.add(4);
        maxHeap.add(2);
        maxHeap.add(1);
        maxHeap.add(9);
        maxHeap.add(7);
        maxHeap.add(5);
        System.out.println(maxHeap);
        System.out.println(maxHeap.poll());
        System.out.println(maxHeap.poll());
    }
}
