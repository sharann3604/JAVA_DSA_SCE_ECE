package com.advanced.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(90,21,32,45,67,23);
        List<Integer> evenNumbers = numbers.stream()
                .filter(n-> n%2==0)
                .collect(Collectors.toList());
        System.out.println("Even: " + evenNumbers);
        List<Integer> oddNumbers = numbers.stream()
                .filter(n-> n%2 !=0).toList();
        System.out.println("Odd: " + oddNumbers);
    }
}
