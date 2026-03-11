package com.advanced.collections.maps;

import java.util.Hashtable;

public class Hastable1 {
    public static void main(String[] args) {
        Hashtable<Integer,String> ht = new Hashtable<>();
        ht.put(106,"Anu");
        ht.put(117,"Naveen");
        ht.put(128,"Megha");
        ht.put(102,"Punith");
        ht.put(100,"Sinchu");
        ht.put(99,"Kavana");
        ht.put(98,"Sheethal");
        System.out.println(ht.getOrDefault(99,"No found"));
        System.out.println(ht.getOrDefault(101,"No found"));
        ht.putIfAbsent(90,"Akash");
        System.out.println("Updated Table:" + ht);
        ht.putIfAbsent(102,"Saurav");
        System.out.println("Updated Table:" + ht);
    }
}
