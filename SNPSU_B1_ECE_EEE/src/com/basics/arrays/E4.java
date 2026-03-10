package com.basics.arrays;

public class E4 {
    public static void main(String[] args) {
        int[][] numbers= {{1,2,3,4,5},
                          {6,7},
                          {8}};
        for (int[] x: numbers){
            for (int n: x){
                System.out.print(n +" ");
            }
        }
        System.out.println();
        char[][] names = {{'R','a','m'},
                          {'S','i','t','a'},
                          {'S','h','i','v','a'},
                          {'H','o','n','e','y'},
                          {'S','o','n','i','y','a'}};
        for (char[] ch : names){
            for (char c : ch){
                System.out.print(c+" ");
            }
            System.out.println();
        }
        boolean[][] data = {{true,false,true},
                {false},
                {true,true}};
        for (boolean[] bool : data){
            for (boolean b : bool){
                System.out.print(b+" ");
            }
            System.out.println();
        }
    }
}
