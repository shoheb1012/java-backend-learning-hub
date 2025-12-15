package org.example.intermediate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FIndSecondHighestNumber {

    public static void main(String[] args) {

        ArrayList<Integer>numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(2);
        numbers.add(3);
        numbers.add(12);
        numbers.add(15);
        numbers.add(7);
        numbers.add(11);
        numbers.add(25);
        numbers.add(30);

        Integer secondHighestNumber = numbers.stream().sorted((x, y) -> y.compareTo(x)).limit(2).skip(1).findFirst().get();


        System.out.println(secondHighestNumber);
    }
}
