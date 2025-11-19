package list.linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;

public class ReverseLinkedList {
    public static void main(String[] args) {

        LinkedList<Integer>integers = new LinkedList<>();

        integers.add(10);
        integers.add(20);
        integers.add(30);
        integers.add(40);
        System.out.println("initially list "+integers);
       // integers.sort((x,y)->y-x);

        ListIterator<Integer> integerListIterator = integers.listIterator(integers.size());

        while(integerListIterator.hasPrevious())
        {
            Integer previous = integerListIterator.previous();
            System.out.println(previous);
        }

        System.out.println("reverse integers :"+integers);
    }
}
