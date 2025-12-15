package org.example.tricky;

import java.util.ArrayList;

public class FindTheSumOfSquare {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);

        Integer sumOfSquare = arrayList.stream().map(x -> x * x).reduce(0, Integer::sum);
        System.out.println(sumOfSquare);

        //Product of numbers using reduce

        Integer productOfNUmber = arrayList.stream().reduce(1, (x, y) -> x * y);
        System.out.println(productOfNUmber);



    }
}
