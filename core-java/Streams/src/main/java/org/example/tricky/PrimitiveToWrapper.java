package org.example.tricky;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimitiveToWrapper {

    public static void main(String[] args) {

//     int a=10;
        //primtive to wrapper
        IntStream intStream = IntStream.of(10, 20, 30, 40);
        List<Integer> collect = intStream.boxed().collect(Collectors.toList());
        System.out.println(collect);

        //wrapper to primitive

        List<Integer> integers = new ArrayList<>();
        integers.add(10);
        integers.add(20);
        integers.add(30);

       integers.stream().mapToInt(x -> x).forEach(x-> System.out.print(x+" "));
//        System.out.println(intStream1.);
    }
}
