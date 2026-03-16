package com.Methods_and_oop;

public class EncapsulationUsage {
    static void main(String[] args) {
        EncapsulationPrivate p1 = new EncapsulationPrivate();
        p1.SetName("Naveen Kumar");
        p1.SetId(5);
        System.out.println("Name is = " + p1.getName());
        System.out.println("Id is = " + p1.getId());
    }
}