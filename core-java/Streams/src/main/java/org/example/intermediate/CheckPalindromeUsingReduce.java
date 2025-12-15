package org.example.intermediate;

public class CheckPalindromeUsingReduce {
    public static void main(String[] args) {

        String str ="level";

        boolean equals = str.chars().mapToObj(c -> String.valueOf((char) (c))).reduce("", (x, y) -> y + x).equalsIgnoreCase(str);
        System.out.println(equals);
    }
}
