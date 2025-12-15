package org.example.basics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertListOfStringToItsLength {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Apple", "Cat", "Hi", "Java");

        List<Integer> collect = list.stream().map(x -> x.length()).collect(Collectors.toList());

        System.out.println(collect);
    }
}
