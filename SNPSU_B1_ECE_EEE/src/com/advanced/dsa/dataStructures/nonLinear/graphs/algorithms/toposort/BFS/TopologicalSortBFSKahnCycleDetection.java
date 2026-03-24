package com.advanced.dsa.dataStructures.nonLinear.graphs.algorithms.toposort.BFS;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
public class TopologicalSortBFSKahnCycleDetection {
    public boolean isCycle(int v, ArrayList<ArrayList<Integer>> adj) {
        int[] inDegree = new int[v+1]; // 0-based indexing
        //step 1 -> calculate the in degree
        for (int i = 0; i < v; i++) {
            for (int neighbour : adj.get(i)) {
                inDegree[neighbour]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < v; i++) {
            if (inDegree[i] == 0) {
                q.add(i);
            }
        }
        // step-3 -> count the nodes processed in the topo sort.
        int count = 0;
        while (!q.isEmpty()) {
            int node = q.poll();
            count++;
            //reduce the indegree of the adjacent node
            //while reducing, if in degree becomes 0,push the node to the queue
            for (int neighbour : adj.get(node)) {
                inDegree[neighbour]--;
                if (inDegree[neighbour] == 0) {
                    q.add(neighbour);
                }
            }
        }
        // if all the nodes are processed, there is no cycle
        // if even one single node is not processed, there is a cycle
        return count != v;
    }

    public static void main(String[] args) {
        int v = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        //we have to initialize with empty array
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(1).add(2);
        adj.get(2).add(3);
        adj.get(3).add(4);
        adj.get(3).add(5);
        adj.get(4).add(2);
        TopologicalSortBFSKahnCycleDetection obj = new TopologicalSortBFSKahnCycleDetection();
        boolean ans = obj.isCycle(v, adj);
        if (ans) {
            System.out.println("cycle detected");
        } else {
            System.out.println("no cycle detected");
        }
    }
}