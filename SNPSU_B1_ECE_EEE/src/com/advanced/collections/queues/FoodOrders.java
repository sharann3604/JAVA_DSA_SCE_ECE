package com.advanced.collections.queues;

import java.util.LinkedList;
import java.util.Queue;

public class FoodOrders {
    public static void main(String[] args) {
        Queue<String> orders = new LinkedList<>();
        orders.add("Order101");
        orders.offer("Order102");
        orders.offer("Order103");
        System.out.println("Orders:"+ orders);
        orders.remove();
        System.out.println("Orders:" + orders);
        orders.poll();
        System.out.println("Orders:"+orders);
    }
}
