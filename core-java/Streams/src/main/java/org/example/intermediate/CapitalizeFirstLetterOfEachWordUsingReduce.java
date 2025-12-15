package org.example.intermediate;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CapitalizeFirstLetterOfEachWordUsingReduce {

    public static void main(String[] args) {


        String str = "i am a backend developer";

        String[] words = str.split(" ");

        String collect = Arrays.stream(words)
                .map(word -> word.chars().mapToObj(x -> String.valueOf((char) x))
                        .reduce("", (a, b) -> a.isEmpty() ? b.toUpperCase() : a + b))
                .collect(Collectors.joining(" "));

        System.out.println(collect);

    }

}
