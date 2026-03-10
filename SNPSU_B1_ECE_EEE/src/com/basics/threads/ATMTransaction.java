package com.basics.threads;

public class ATMTransaction extends Thread{
    public void run(){
        System.out.println("Processing ATM Transaction");
    }

    public static void main(String[] args) {
        ATMTransaction tx = new ATMTransaction();
        System.out.println("Thread State:"+ tx.getState());
        tx.start();
        System.out.println("Thread State:"+ tx.getState());
    }
}
/*
ℹ️Code Information
⭐Initially the thread is in the NEW state
⭐After calling start(), it moves to RUNNABLE state, and it execute the run() method
⭐The exact timing of state change will depend on the JVM Scheduler
ℹ️ POINTS TO REMEMBER
⭐Threads is created only once
⭐start() changes the state
⭐Thread cannot be restarted
⭐Final state is DEAD or TERMINATED
🟨 Bullet points for interview / placements
🟢 A thread can be created by extending the thread class and overriding the run() method.
🟢 run () contains the task()
🟢start () creates a new thread
🟢Calling run() directly (❌ No Multithreading)

 */