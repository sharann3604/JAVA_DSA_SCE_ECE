package com.advanced.dsa.dataStructures.nonLinear.graphs.algorithms.toposort.BFS;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
public class TopologicalSortBFSKahn {
    public List<Integer> topoSort(int v, ArrayList<ArrayList<Integer>> adj) {
        int[] inDegree = new int[v];
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
        List<Integer> topo = new ArrayList<>();
        while (!q.isEmpty()) {
            int node = q.poll();
            topo.add(node);//stores it in the answer
            //reduce the indegree of the adjacent node
            //while reducing, if in degree becomes 0,push the node to the queue
            for (int neighbour : adj.get(node)) {
                inDegree[neighbour]--;
                if (inDegree[neighbour] == 0) {
                    q.add(neighbour);
                }
            }
        }
        return topo;
    }
    public static void main(String[] args) {
        int v=6;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        //we have to initialize with empty array
        for(int i=0; i<v;i++){
            adj.add(new ArrayList<>());
        }
        adj.get(2).add(3);
        adj.get(3).add(1);
        adj.get(4).add(0);
        adj.get(4).add(1);
        adj.get(5).add(0);
        adj.get(5).add(2);
        TopologicalSortBFSKahn obj = new TopologicalSortBFSKahn();
        List<Integer> ans = obj.topoSort(v , adj);
        System.out.println("The toposort Linear Ordering u <--> v is ;  ");
        for (int node:ans){
            System.out.print(node + " ");
        }
        System.out.println();
    }
}