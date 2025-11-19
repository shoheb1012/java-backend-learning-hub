package list.arraylist;
import java.util.*;
//fail fast
public class Test4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        for (Integer n : list) {
            System.out.println(n);
            if (n == 2) list.add(99); // ConcurrentModificationException
        }
    }
}
