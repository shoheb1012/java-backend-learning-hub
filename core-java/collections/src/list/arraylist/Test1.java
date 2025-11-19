package list.arraylist;

import java.util.ArrayList;

public class Test1  {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i = 0; i < 15; i++)
        {
            arrayList.add(i);
            System.out.println("Element Added "+i+" Size "+arrayList.size());
        }
        System.out.println(arrayList);
    }
}
