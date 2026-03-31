package Module14;

import java.util.*;

public class ConnectedComponents {

    static void DFS(int node,boolean visited[],ArrayList<ArrayList<Integer>> adj){

        visited[node]=true;

        for(int n: adj.get(node))
            if(!visited[n])
                DFS(n,visited,adj);
    }

    public static void main(String[] args){

        int V=5;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i=0;i<V;i++)
            adj.add(new ArrayList<>());

        adj.get(0).add(1);
        adj.get(2).add(3);

        boolean visited[] = new boolean[V];
        int count=0;

        for(int i=0;i<V;i++){
            if(!visited[i]){
                DFS(i,visited,adj);
                count++;
            }
        }

        System.out.println("Connected Components: "+count);
    }
}