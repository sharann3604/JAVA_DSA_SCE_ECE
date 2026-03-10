package com.basics.exceptions;

public class E4 {
    static void withdraw(int tb, int amt){
        final int mb =2000;
        if(tb - amt < mb) {
            throw new RuntimeException("Minimum Balance of 2000 must be maintained !");
        }
            System.out.println("amount draw successfully");
            System.out.println("Remaining balance:"+ (tb-amt));
        }
    public static void main(String[] args) {
        withdraw(6000, 3000);
     //   withdraw(5000, 4000);
    }

}
