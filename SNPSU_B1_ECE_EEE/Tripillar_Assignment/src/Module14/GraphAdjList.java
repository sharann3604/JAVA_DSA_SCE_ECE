package Module14;

import java.util.*;

public class GraphAdjList {

    public static void main(String[] args) {

        int V = 5;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i=0;i<V;i++)
            adj.add(new ArrayList<>());

        adj.get(0).add(1);
        adj.get(0).add(4);
        adj.get(1).add(2);

        for(int i=0;i<V;i++)
            System.out.println(i + " -> " + adj.get(i));
    }
}