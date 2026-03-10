package com.basics.oops.pillars.abstraction.interfaces;

public interface Demo {
    void display();
    }
    class Main {
        public static void main(String[] args) {
            // Can w create an object of an interface
            Demo obj = new Demo() {
                public void display() {
                    System.out.println("Normal code - Boilerplate Code");
                }

            };
            obj.display();
            // SCALA _ Java - 8 : Lambda Expression ->
            Demo obj1= () -> System.out.println("Scala Code");
            obj1.display();
        }
    }
