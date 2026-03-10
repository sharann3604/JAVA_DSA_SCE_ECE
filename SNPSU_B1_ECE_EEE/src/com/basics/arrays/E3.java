package com.basics.arrays;

public class E3 {
    public static void main(String[] args) {
        int[] arr= {1,3,5,7,9}; // 1 -  D Array
        System.out.println(arr.length);
        // 2D Array or Matrix or Array of Arrays
        int[][] matrix = {{1,2,3},  //0
                          {4,5,6},  //1
                          {7,8,9},   //2
                          {9,8,7}};   //3
        System.out.println(matrix.length);
        System.out.println(matrix[0].length);
        for (int r=0; r<matrix.length; r++){
            for (int c=0; c<matrix[0].length; c++){
                System.out.print(matrix[r][c]+ " ");
            }
            System.out.println();
        }
        char[][] languages = {{'k','a','n','n','a','d','a'},
                              {'T','e','l','u','g','u'},
                              {'M','a','l','a','y','a','l','a','m'},
                              {'T','a','m','i','l'}};
        System.out.println(languages[0].length);
        System.out.println(languages[1].length);
        System.out.println(languages[2].length);
        System.out.println(languages[3].length);
        for (int r=0; r<languages.length; r++){
            for (int c=0; c<languages[r].length;c++){
                System.out.print(languages[r][c]+" ");
            }
            System.out.println();
        }
        int[][] jagged= {{1,2,3,4,5,6,7,8,9},
                         {1,2,3,4,5,6},
                         {1}};
        for (int r=0; r<jagged.length;r++) {
            for (int c = 0; c < jagged[r].length; c++) {
                System.out.print(jagged[r][c] + " ");
            }
            System.out.println();
        }

    }
}
