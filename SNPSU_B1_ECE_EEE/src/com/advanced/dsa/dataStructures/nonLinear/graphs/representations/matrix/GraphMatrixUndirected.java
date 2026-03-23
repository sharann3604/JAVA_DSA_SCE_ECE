package com.advanced.dsa.dataStructures.nonLinear.graphs.representations.matrix;

import java.util.Scanner;

public class GraphMatrixUndirected {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] adjacencyMatrix= new int[n+1][n+1];
        for (int i=0;i<m;i++){
            int u =sc.nextInt();
            int v = sc.nextInt();
            adjacencyMatrix[u][v]=1;
            adjacencyMatrix[v][u]=1;
        }
        for (int i=1;i<=n;i++){
            for (int j=0;j<=n;j++){
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
