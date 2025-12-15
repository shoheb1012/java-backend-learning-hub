package org.example.intermediate;

import java.util.ArrayList;

public class MultiplicationUsingReduce {
    public static void main(String[] args) {

        ArrayList<Integer>arrayList = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

        Integer multiplication = arrayList.stream().reduce(1, (x, y) -> x * y);

        System.out.println(multiplication);
    }
}
