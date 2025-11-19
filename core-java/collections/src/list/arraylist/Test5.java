package list.arraylist;

import java.util.*;
//fail-safe using iterator
public class Test5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        ListIterator<String> it = list.listIterator();

        while (it.hasNext()) {
            String val = it.next();
            if (val.equals("B")) {
                it.add("X");
            }
        }
        System.out.println(list);
    }
}


