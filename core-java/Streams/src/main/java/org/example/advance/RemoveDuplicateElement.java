package org.example.advance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveDuplicateElement {
    public static void main(String[] args) {
        ArrayList<Integer> integerArray = new ArrayList<>();

        integerArray.add(1);
        integerArray.add(2);
        integerArray.add(3);
        integerArray.add(1);
        integerArray.add(2);

         integerArray.stream().distinct().forEach(x-> System.out.print(x+" "));


    }
}
