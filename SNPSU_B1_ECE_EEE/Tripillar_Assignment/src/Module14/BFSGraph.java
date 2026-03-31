package Module14;

import java.util.*;

public class BFSGraph {

    static void BFS(ArrayList<ArrayList<Integer>> adj,int start){

        boolean visited[] = new boolean[adj.size()];
        Queue<Integer> q = new LinkedList<>();

        visited[start] = true;
        q.add(start);

        while(!q.isEmpty()){
            int node = q.poll();
            System.out.print(node + " ");

            for(int n : adj.get(node)){
                if(!visited[n]){
                    visited[n] = true;
                    q.add(n);
                }
            }
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

        BFS(adj,0);
    }
}