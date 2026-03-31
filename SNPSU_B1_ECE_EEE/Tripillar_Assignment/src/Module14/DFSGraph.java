package Module14;

import java.util.*;

public class DFSGraph {

    static void DFS(int node,boolean visited[],ArrayList<ArrayList<Integer>> adj){

        visited[node] = true;
        System.out.print(node + " ");

        for(int n: adj.get(node)){
            if(!visited[n])
                DFS(n,visited,adj);
        }
    }

    public static void main(String[] args){

        int V=4;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i=0;i<V;i++)
            adj.add(new ArrayList<>());

        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(3);

        boolean visited[] = new boolean[V];

        DFS(0,visited,adj);
    }
}