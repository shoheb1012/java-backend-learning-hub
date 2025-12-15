package org.example.advance;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertListOfObjectToCSV {
    public static void main(String[] args) {

        List<Object> listOfObject = new ArrayList<>();
        listOfObject.add("shoheb");
        listOfObject.add(1);
        listOfObject.add(23);
        listOfObject.add("Hyderabad");

        String collect = listOfObject.stream().map(Object::toString).collect(Collectors.joining(","));

        System.out.println(collect);
    }
}
