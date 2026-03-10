package com.basics.threads;

public class JoinProof{
    static class Task extends Thread{
        public void run(){
            try{
                Thread.sleep(2000);
            }catch (Exception e){

            }
            System.out.println("Food has been cooked !!");
        }
    }

    public static void main(String[] args) throws Exception{
        Task t = new Task();
        t.start(); // No guaranteed
        t.join(); // Guaranteed wait to finish the child Thread
        System.out.println("Customer has started eating!!!");

    }

}
