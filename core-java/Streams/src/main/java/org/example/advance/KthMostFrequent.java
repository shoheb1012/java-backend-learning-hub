package org.example.advance;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class KthMostFrequent {
    public static void main(String[] args) {

        ArrayList<Integer> integerArray = new ArrayList<>();

        integerArray.add(1);
        integerArray.add(2);
        integerArray.add(3);
        integerArray.add(1);
        integerArray.add(2);
        integerArray.add(1);
        int k=2;
        List<Map.Entry<Integer, Long>> collect = integerArray
                .stream()
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()))
                .entrySet().stream().sorted((x, y) -> Long.compare(y.getValue(), x.getValue()))
                .limit(k)
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}
