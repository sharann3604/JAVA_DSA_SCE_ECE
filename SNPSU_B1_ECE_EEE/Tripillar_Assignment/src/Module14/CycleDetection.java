package Module14;

import java.util.*;

public class CycleDetection {

    static boolean hasCycle(int node,boolean visited[],int parent,ArrayList<ArrayList<Integer>> adj){

        visited[node] = true;

        for(int n: adj.get(node)){
            if(!visited[n]){
                if(hasCycle(n,visited,node,adj))
                    return true;
            }
            else if(n!=parent)
                return true;
        }
        return false;
    }

    public static void main(String[] args){

        int V=3;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i=0;i<V;i++)
            adj.add(new ArrayList<>());

        adj.get(0).add(1);
        adj.get(1).add(2);
        adj.get(2).add(0);

        boolean visited[] = new boolean[V];

        System.out.println(hasCycle(0,visited,-1,adj));
    }
}