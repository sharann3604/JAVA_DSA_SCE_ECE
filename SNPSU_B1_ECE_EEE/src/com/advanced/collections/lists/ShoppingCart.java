package com.advanced.collections.lists;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    public static void main(String[] args) {
        List<String> cart = new ArrayList<>();
        cart.add("m5-Laptop");
        cart.add("Mouse");
        cart.add("Keyword");
        cart.remove("Mouse");
        System.out.println("Latest Cart after removal:"+ cart);
        cart.set(1,"Mechanical Keyword");
        System.out.println("Latest Cart after Update:"+cart);
    }
}
