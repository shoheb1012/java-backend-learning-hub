package list.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ReverseIterator {
    public static void main(String[] args) {

        LinkedList<Integer> integerList = new LinkedList<>();

        for(int i =0;i<20;i++)
        {
            integerList.add(i);

        }
        System.out.println(integerList);

        ListIterator<Integer> integerIterator = integerList.listIterator(integerList.size());

        while(integerIterator.hasPrevious())
        {
            System.out.println(integerIterator.previous());
        }


        Iterator<Integer> integerIterator1 = integerList.descendingIterator();
        while (integerIterator1.hasNext())
        {
            System.out.print(integerIterator1.next()+" ");
        }
    }
}
