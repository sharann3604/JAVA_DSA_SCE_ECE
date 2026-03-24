package com.advanced.dsa.dataStructures.nonLinear.graphs.traversal;

import java.util.ArrayList;
import java.util.List;

class GrapfDFS{
    private void dfs(int node, List<List<Integer>>adjList,
                     boolean[] visited,List<Integer>ans){
        visited[node]=true;
        ans.add(node);
        for (int neighbour:adjList.get(node)){
            if (!visited[neighbour]){
                dfs(neighbour,adjList,visited,ans);
            }
        }
    }
    public List<Integer>dfsGraph(int V,List<List<Integer>>adjList){
        boolean[] visied=new boolean[V+1];
        List<Integer>ans=new ArrayList<>();
        int start=1;
        dfs(start,adjList,visied,ans);
        return ans;
    }
}
public class GraphDFSTraversal {
    public static void main(String[] args) {
        int V=5;
        List<List<Integer>>adjList=new ArrayList<>();
        for (int i=0;i<=V;i++){
            adjList.add(new ArrayList<>());
        }
        addEdge(adjList,1,2);
        addEdge(adjList,1,3);
        addEdge(adjList,2,4);
        addEdge(adjList,2,5);
        addEdge(adjList,4,5);
        GrapfDFS obj=new GrapfDFS();
        List<Integer>ans=obj.dfsGraph(V,adjList);
        printDFS(ans);
    }
    public static void addEdge(List<List<Integer>>adjList,int u,int v){
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }
    public static void printDFS(List<Integer>ans){
        for (int num:ans){
            System.out.print(num+" ");
        }
        System.out.println();
    }
}