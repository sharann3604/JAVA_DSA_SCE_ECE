package com.advanced.collections.sets;

import java.util.HashSet;

public class EmailNotification {
    public static void main(String[] args) {
        HashSet<String> emailQueue  = new HashSet<>();
        emailQueue.add("a@gmail.com");
        emailQueue.add("b@gmail.com");
        emailQueue.add("a@gmail.com");
        emailQueue.add("a@gmail.com");
        emailQueue.add("c@gmail.com");
        emailQueue.add("d@gmail.com");
        emailQueue.add("c@gmail.com");
        System.out.println("Emails to send:"+ emailQueue);
        System.out.println("Unique emails:"+emailQueue.size());
    }
}
