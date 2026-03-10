package com.basics.arrays;
class Equipment {
    String name;
    int eqID;
    String lab;
    double voltage;
    boolean isworking;
    Equipment(String name, int eqID, String lab, double voltage, boolean isworking) {
        this.name = name;
        this.eqID = eqID;
        this.lab = lab;
        this.voltage = voltage;
        this.isworking = isworking;
    }
}
public class E9 {
    public static void main(String[] args) {
        Equipment[] eqs = new Equipment[]{
                new Equipment("voltmeter", 3, "CS-lab", 45.50, true),
                new Equipment("dc motor", 19, "CS-lab", 150.20, false),
                new Equipment("multimeter", 17, "CS-lab", 25.80, true),
        };
        for (Equipment e : eqs) {
            System.out.println(e.name+", "+e.eqID+", "+e.lab+", "+e.voltage+", "+e.isworking);
        }
    }
}