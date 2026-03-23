package com.advanced.dsa.dataStructures.nonLinear.heaps;

import java.util.PriorityQueue;
import java.util.Queue;

public class EmergencyRoom {
    public static void main(String[] args) {
        Queue<Integer> serverity = new PriorityQueue<>();
        serverity.offer(5);
        serverity.offer(3);
        serverity.offer(1);
        System.out.println("Patient that gets operated first:" + serverity.poll());
        System.out.println("Patients in queue:" + serverity);
    }
}
