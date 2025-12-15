package org.example.tricky;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FindTheShortestString {
    public static void main(String[] args) {
        ArrayList<String> listOfString= new ArrayList<>();
        listOfString.add("Shoheb");
        listOfString.add("Rahul");
        listOfString.add("Achal");
        listOfString.add("Sanskar");

        String shortestString = listOfString.stream().sorted(Comparator.comparing(String::length)).findFirst().get();

        System.out.println("Shortest String in List : "+shortestString);


    }
}
