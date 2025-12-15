package org.example.advance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FlattenList {
    public static void main(String[] args) {

        Map<String,List<Integer>> map = new HashMap<>();

        ArrayList<Integer> evenList = new ArrayList<>();
        evenList.add(2);
        evenList.add(4);
        evenList.add(6);

        ArrayList<Integer> oddList = new ArrayList<>();
        oddList.add(1);
        oddList.add(3);
        oddList.add(5);


        map.put("EvenNumber",evenList);
        map.put("OddNumbers",oddList);

        List<Integer> collect = map
                .values()
                .stream()
                .flatMap(list -> list.stream())
                .collect(Collectors.toList());

        System.out.println(collect);

    }
}
