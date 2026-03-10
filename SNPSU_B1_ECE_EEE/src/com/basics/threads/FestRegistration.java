package com.basics.threads;

public class FestRegistration {
    // form fill-up
    static class FormFilling extends Thread {
        public void run() {
            System.out.println("form filling started");
        }
    }
    // upload docs
    static class DocsUpload extends Thread {
        public void run() {
            System.out.println("docs upload started");
        }
    }
    // Email notification
    static class EmailNotification extends Thread {
        public void run() {
            System.out.println("email notification sent");
        }
    }
    public static void main(String[] args) {
        FormFilling t1 = new FormFilling();
        DocsUpload t2 = new DocsUpload();
        EmailNotification t3 = new EmailNotification();
        t1.start();
        t2.start();
        t3.start();
    }
}
/*
⭐ Java program starts with one main Thread
⭐ Thread allow "parallel exceu tion" --> Concurrency
⭐ Output order is never guaranteed
⭐ Threads shared the same memory
⭐ Improves the performance and responsiveness
⭐ when start() is called , the JVM creates the new Thread
⭐ when the run() is called directly, there no concurrency
ℹ️ process Vs Thread
⭐ Process is a running program
⭐ Thread is a path of execution inside the program
⭐ a process as its own memory
⭐ Thread share the same memory
⭐ Creating the Thread is cheaper than creating the process
🔵Example:
⭐ Process --> Google Chrome Browser; Thread --> New Tab of Chrome
⭐ closing a tab will not close chrome or will not kill chrome
⭐⭐⭐
 */