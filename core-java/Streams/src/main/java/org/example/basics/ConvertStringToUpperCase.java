package org.example.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertStringToUpperCase {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("shoheb");
        names.add("Ashok");
        names.add("Achal");
        names.add("Rahul");
        names.add("Ajay");

        List<String> namesInUpperCase = names.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());

        System.out.println(namesInUpperCase);


        String str[] = new String[]{"Shoheb","Rahul","Raaj","Alice","Bob"};

        List<String> collect = Arrays.stream(str).map(x -> x.toUpperCase()).collect(Collectors.toList());

        System.out.println(collect);

    }
}
