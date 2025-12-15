package org.example.basics;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumber {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i=1;i<=50;i++)
        {
            numbers.add(i);
        }

        List<Integer> evenNumbers = numbers.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());

        evenNumbers.forEach(x-> System.out.print(x+" "));

    }

}
