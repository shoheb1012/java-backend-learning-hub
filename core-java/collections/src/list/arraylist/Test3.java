package list.arraylist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test3 {

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        for(int i=0;i<10000;i++)
        {
            arrayList.add(i);
            linkedList.add(i);
        }
        long sum=0,sum1=0;

        long start= System.currentTimeMillis();


        for(int i =0;i<arrayList.size();i++)
        {
            sum+=arrayList.get(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("ArrayList "+(end-start)+"ms Sum "+sum);


        long start1= System.currentTimeMillis();


        for(int i =0;i<linkedList.size();i++)
        {
            sum1+=linkedList.get(i);
        }
        long end1 = System.currentTimeMillis();
        System.out.println("LinkedList "+(end1-start1)+"ms Sum "+sum1);


    }
}
