package org.example.tricky;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ImplementPaginationUsingStream {

    public static void main(String[] args) {

        ArrayList<Integer> integers = new ArrayList<>();

        for(int i =1;i<50;i++)
        {
            integers.add(i);
        }
        int pageNumber=3;
        int pageSize=5;

        List<Integer> collect = integers.stream()
                .skip((pageNumber - 1) * pageSize)
                .limit(pageSize)
                .collect(Collectors.toList());
        System.out.println(collect);

    }
}
