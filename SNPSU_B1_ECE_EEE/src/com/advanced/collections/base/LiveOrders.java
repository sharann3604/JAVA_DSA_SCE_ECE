package com.advanced.collections.base;

import java.util.ArrayList;
import java.util.Collection;

public class LiveOrders {
    public static void main(String[] args){
        Collection<String> liveOrders=new ArrayList<>();
        liveOrders.add("ORD101");
        liveOrders.add("ORD102");
        liveOrders.add("ORD103");
        //check orders
        System.out.println("ORD101 available? Exists?"+liveOrders.contains("ORD101"));
        //check al the orders
        System.out.println("live Orders:"+liveOrders);
    }
}