package Module14;

import java.util.*;

public class BipartiteGraph {

    public static void main(String[] args){

        int V=4;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i=0;i<V;i++)
            adj.add(new ArrayList<>());

        adj.get(0).add(1);
        adj.get(1).add(2);
        adj.get(2).add(3);

        int color[] = new int[V];
        Arrays.fill(color,-1);

        Queue<Integer> q = new LinkedList<>();

        q.add(0);
        color[0]=0;

        boolean bip=true;

        while(!q.isEmpty()){

            int node=q.poll();

            for(int n: adj.get(node)){
                if(color[n]==-1){
                    color[n]=1-color[node];
                    q.add(n);
                }
                else if(color[n]==color[node])
                    bip=false;
            }
        }

        System.out.println("Bipartite: "+bip);
    }
}