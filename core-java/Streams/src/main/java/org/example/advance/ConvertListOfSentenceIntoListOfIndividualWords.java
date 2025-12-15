package org.example.advance;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertListOfSentenceIntoListOfIndividualWords {


    public static void main(String[] args) {

        List<String> sentences = Arrays.asList(
                "I am a Java developer",
                "Streams are powerful",
                "FlatMap helps flatten collections",
                "Practice makes perfect"
        );

        List<String> collect = sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                .collect(Collectors.toList());

        System.out.println(collect);
    }

}
