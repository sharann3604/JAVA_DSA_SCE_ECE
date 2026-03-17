package com.advanced.dsa.dataStructures.linear.queues;
import java.util.LinkedList;
import java.util.Queue;

    public class BinaryNumberGenerator {
        public static void generateBinary(int N){
            Queue<String> q=new LinkedList<>();
            q.offer("1");
            while (N--> 0){
                String curr=q.poll();
                System.out.print(curr + " ");
                q.offer(curr + "0");
                q.offer(curr + "1");

            }
            System.out.println();
        }

        public static void main(String[] args) {
            int N=3;
            generateBinary(N);
            generateBinary(6);
            generateBinary(10);
        }
    }

