package org.example.intermediate;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWordUsingReduce {
    public static void main(String[] args) {

        String str = "I love Java Programming";

        String[] split = str.split(" ");

        String collect = Arrays.stream(split).map(x -> x.chars().mapToObj(c -> String.valueOf((char) c)).reduce(" ", (a, b) -> b + a)).collect(Collectors.joining(" "));

        System.out.println(collect);
    }
}
