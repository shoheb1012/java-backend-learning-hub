package org.example.basics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortListOfNumbers {

    public static void main(String[] args) {

        ArrayList<Integer>arrayList = new ArrayList<>();

        arrayList.add(10);
        arrayList.add(22);
        arrayList.add(1);
        arrayList.add(12);
        arrayList.add(15);
        arrayList.add(11);
        arrayList.add(3);

        //Sorting in Ascending order by using Streams

        arrayList.stream().sorted(Comparator.naturalOrder()).forEach(x->System.out.print(x+" "));

        //Sorting in deAscending order by using Streams
        System.out.println();
        arrayList.stream().sorted(Comparator.reverseOrder()).forEach(x->System.out.print(x+" "));



    }
}
