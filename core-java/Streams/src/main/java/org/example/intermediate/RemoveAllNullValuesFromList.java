package org.example.intermediate;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class RemoveAllNullValuesFromList {

    public static void main(String[] args) {

        ArrayList<Integer>arrayList = new ArrayList<>();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(10);

//         arrayList.removeIf(Objects::isNull);
//        System.out.println(arrayList);
        List<Integer> collect = arrayList.stream().filter(x->x!=null).collect(Collectors.toList());
        System.out.println(collect);
    }
}
