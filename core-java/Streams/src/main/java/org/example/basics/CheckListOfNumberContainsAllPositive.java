package org.example.basics;

import java.util.ArrayList;

public class CheckListOfNumberContainsAllPositive {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        boolean b = numbers.stream().allMatch(x -> x > 0);

        System.out.println("is all list contains positive number ? "+b);
    }
}
