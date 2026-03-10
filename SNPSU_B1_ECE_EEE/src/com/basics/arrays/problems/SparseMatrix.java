package com.basics.arrays.problems;

public class SparseMatrix {
    public static void main(String[] args) {
        int[][] matrix={
                {0,0,3},
                {0,0,0},
                {4,0,0}
        };
        int rows =matrix.length;
        int cols=matrix[0].length;
        int zeroCount =0, nonZeroCount=0;
        for (int i=0; i<rows;i++){
            for (int j=0;j<cols;j++){
                if (matrix[i][j]==0){
                    zeroCount++;
                }else{
                    nonZeroCount++;
                }
            }
        }
        if (zeroCount>nonZeroCount){
            System.out.println("Matrix is Sparse");
        }else{
            System.out.println("Matrix is Not Sparse");
        }
    }
}
