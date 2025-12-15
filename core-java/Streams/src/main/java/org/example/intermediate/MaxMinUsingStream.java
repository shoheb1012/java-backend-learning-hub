package org.example.intermediate;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Collectors;

public class MaxMinUsingStream {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(2);
        numbers.add(3);
        numbers.add(12);
        numbers.add(15);
        numbers.add(7);
        numbers.add(11);
        numbers.add(25);
        numbers.add(30);

        //Max number
        Optional<Integer> collect = numbers.stream().collect(Collectors.maxBy((x, y) -> x.compareTo(y)));
        System.out.println(collect.get());

        //Min number

        Optional<Integer> collect1 = numbers.stream().collect(Collectors.minBy((x, y) -> x.compareTo(y)));

        System.out.println(collect1.get());
    }
}
