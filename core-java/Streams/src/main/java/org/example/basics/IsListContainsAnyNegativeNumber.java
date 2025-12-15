package org.example.basics;

import java.util.ArrayList;

public class IsListContainsAnyNegativeNumber {

    public static void main(String[] args) {

        ArrayList<Integer>numbers = new ArrayList<>();

        numbers.add(-1);
        numbers.add(2);
        numbers.add(3);

        boolean b = numbers.stream().anyMatch(x -> x < 0);
        System.out.println("is list contains any negative number ? "+b);
    }
}
