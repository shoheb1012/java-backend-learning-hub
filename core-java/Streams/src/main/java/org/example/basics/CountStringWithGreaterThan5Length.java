package org.example.basics;

import java.util.ArrayList;

public class CountStringWithGreaterThan5Length {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("shoheb");
        names.add("Ashok");
        names.add("Achal");
        names.add("Rahul");
        names.add("Ajay");
        names.add("Soheltr");
        names.add("Alice");
        names.add("sanskar");

        long count = names.stream().filter(x -> x.length() > 5).count();
        System.out.println("names greater than 5 length count is : "+count);
    }
}
