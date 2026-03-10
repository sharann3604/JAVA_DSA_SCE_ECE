package com.advanced.collections.queues;

import java.util.ArrayDeque;
import java.util.Deque;

// Undo - Redo Operations
public class ArrayDequeExample {
    public static void main(String[] args) {
        Deque<String > actions = new ArrayDeque<>();
        actions.addLast("User Type A");
        actions.addLast("User Type B");
        actions.addLast("User Deletes B");
        System.out.println("Initial actions:"+actions);
        System.out.println("Undo action:"+ actions.removeLast());
        System.out.println("Remaining actions:"+ actions);
    }
}
