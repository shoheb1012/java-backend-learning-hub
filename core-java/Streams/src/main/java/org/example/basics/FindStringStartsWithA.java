package org.example.basics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class FindStringStartsWithA {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("shoheb");
        names.add("Ashok");
        names.add("Achal");
        names.add("Rahul");
        names.add("Ajay");

        List<String> stringsStartsWithA= names.stream().map(x -> x.toUpperCase()).filter(x -> x.startsWith("A")).collect(Collectors.toList());

        Iterator<String> iterator = stringsStartsWithA.iterator();

       while(iterator.hasNext())
       {
           System.out.println(iterator.next());
       }

    }
}
