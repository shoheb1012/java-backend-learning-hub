package org.example.intermediate;

import java.util.Arrays;
import java.util.Optional;

public class StringReverseUsingReduce {
    public static void main(String[] args) {

        String str = "Shoheb";

        String reversed = str.chars()
                .mapToObj(c -> String.valueOf((char) c))
                .reduce("", (rev, ch) -> ch + rev);


        System.out.println(reversed);
    }
}
