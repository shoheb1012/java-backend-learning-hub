package org.example.basics;

import java.util.ArrayList;
import java.util.Optional;

public class FindFirstElement {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        Optional<Integer> first = numbers.stream().findFirst();
        if(first.isPresent())
        {
            System.out.println(first.get());
        }
    }
}
