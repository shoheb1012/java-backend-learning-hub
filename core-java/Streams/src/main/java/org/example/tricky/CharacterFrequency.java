package org.example.tricky;

import java.util.Map;
import java.util.stream.Collectors;

public class CharacterFrequency {

    public static void main(String[] args) {

        String str = "hello world";

        Map<Character, Long> collect = str
                .chars()
                .mapToObj(c -> (char) c)
                .filter(x->x!=' ')
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));

        System.out.println(collect);
    }
}
