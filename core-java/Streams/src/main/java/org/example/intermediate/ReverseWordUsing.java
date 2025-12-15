package org.example.intermediate;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWordUsing {

    public static void main(String[] args) {


        String str = "I love Java programming";
        String[] words = str.split(" ");

        for(String word : words)
        {
            String reduce = word.chars().mapToObj(c -> String.valueOf((char) c)).reduce("", (x, y) -> y + x);
            //System.out.print(reduce+" ");
        }

        String result = Arrays.stream(words).map(word -> word.chars().mapToObj(c -> String.valueOf((char) c)).reduce("", (x, y) -> y + x)).collect(Collectors.joining(" "));
        System.out.println(result);
    }



}
