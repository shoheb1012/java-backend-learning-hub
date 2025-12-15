package org.example.advance;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateElements {

    public static void main(String[] args) {

        ArrayList<Integer> integerArray = new ArrayList<>();

        integerArray.add(1);
        integerArray.add(2);
        integerArray.add(3);
        integerArray.add(1);
        integerArray.add(2);

        Set<Integer> collect = integerArray.stream().filter(x -> Collections.frequency(integerArray, x) > 1).collect(Collectors.toSet());
        System.out.println(collect);
    }
}
