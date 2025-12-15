package org.example.tricky;

import java.util.ArrayList;
import java.util.Comparator;

public class FindLongestStringInList {

    public static void main(String[] args) {

        ArrayList<String> listOfString= new ArrayList<>();
        listOfString.add("Shoheb");
        listOfString.add("Rahul");
        listOfString.add("Achal");
        listOfString.add("Sanskar");

        String s = listOfString.stream().sorted(Comparator.comparing(String::length).reversed()).findFirst().get();

        System.out.println("Longest String "+s);

    }

}
