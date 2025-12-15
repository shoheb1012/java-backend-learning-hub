package org.example.intermediate;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class FindTheSumOfEvenNumber {
    public static void main(String[] args) {

        ArrayList<Integer>integers = new ArrayList<>();

        integers.add(12);
        integers.add(10);
        integers.add(11);
        integers.add(13);
        integers.add(14);
        integers.add(18);
        integers.add(19);

        Integer collect = integers.stream().filter(x -> x % 2 == 0).collect(Collectors.summingInt(x -> x));

        int sum = integers.stream().filter(x -> x % 2 == 0).mapToInt(Integer::intValue).sum();

        //By using reduce
        Integer sum1= integers.stream().filter(x -> x % 2 == 0).reduce(0, (x, y) -> x + y);
        System.out.println(collect);
        System.out.println(sum);
        System.out.println(sum1);

    }
}
