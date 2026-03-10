package com.basics.exceptions;

public class E2 {
    public static void main(String[] args) {
        int i,j,k=0;
        i=10;
        j=2;
        try{
            k=i/j;
            String str="SNPSU";
            System.out.println(str.charAt(9));
        }catch (ArithmeticException | StringIndexOutOfBoundsException e){
            System.out.println("Error!");
        }finally {
            System.out.println("End of the execution code");
        }
        System.out.println("The value of k: "+ k);
    }
}
