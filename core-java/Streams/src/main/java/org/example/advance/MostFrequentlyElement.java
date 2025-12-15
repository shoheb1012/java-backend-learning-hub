package org.example.advance;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MostFrequentlyElement {
    public static void main(String[] args) {

        ArrayList<Integer> integerArray = new ArrayList<>();

        integerArray.add(1);
        integerArray.add(2);
        integerArray.add(3);
        integerArray.add(1);
        integerArray.add(2);
        integerArray.add(1);

        Map<Integer, Long> frequency = integerArray.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()));

        Map.Entry<Integer, Long> integerLongEntry = frequency.entrySet().stream().max(Map.Entry.comparingByValue()).get();



        System.out.println(integerLongEntry.getKey()+" Element "+integerLongEntry.getValue()+" times ");




    }
}
