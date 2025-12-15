package org.example.basics;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctElements {

    public static void main(String[] args) {

        ArrayList<Integer> elements = new ArrayList<>();

        elements.add(1);
        elements.add(1);
        elements.add(2);
        elements.add(3);
        elements.add(4);
        elements.add(4);
        elements.add(5);
        elements.add(6);
        elements.add(6);

        List<Integer> collect = elements.stream().distinct().collect(Collectors.toList());
        System.out.println(collect);
    }
}
