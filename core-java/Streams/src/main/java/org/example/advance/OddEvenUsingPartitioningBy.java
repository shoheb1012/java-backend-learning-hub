package org.example.advance;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class OddEvenUsingPartitioningBy {

    public static void main(String[] args) {

        ArrayList<Integer>arrayList = new ArrayList<>();

        for(int i=1;i<20;i++)
        {
            arrayList.add(i);
        }

        Map<Boolean, List<Integer>> collect = arrayList.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0));

        System.out.println(collect);


    }
}
