package com.advanced.dsa.dataStructures.nonLinear.heaps;

import java.util.Arrays;

class GFG {

    static int minCost(int[] arr) {
        int totalCost = 0;
        int n = arr.length;

        // Continue until only one rope remains
        while (n > 1) {

            // Sort ropes to get the two smallest lengths
            Arrays.sort(arr, 0, n);

            // Pick the two smallest ropes
            int first = arr[0];
            int second = arr[1];

            // Cost of connecting these two ropes
            int cost = first + second;
            totalCost += cost;

            // Shift the array to remove the two smallest elements
            for (int i = 2; i < n; i++) {
                arr[i - 2] = arr[i];
            }

            // Place the new rope at the end
            arr[n - 2] = cost;

            // Reduce array size by 1 (two removed, one added)
            n--;
        }

        return totalCost;
    }

    public static void main(String[] args) {
        int[] ropes = {4, 3, 2, 6};
        System.out.println(minCost(ropes));
    }
}