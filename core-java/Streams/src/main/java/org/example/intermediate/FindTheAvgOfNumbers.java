package org.example.intermediate;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class FindTheAvgOfNumbers {
    public static void main(String[] args) {

        ArrayList<Integer>numbers = new ArrayList<>();

        for(int i=1;i<10;i++)
        {
            numbers.add(i);
        }
        Double collect = numbers.stream().collect(Collectors.averagingDouble(x -> x));
        System.out.println(collect);
    }
}
