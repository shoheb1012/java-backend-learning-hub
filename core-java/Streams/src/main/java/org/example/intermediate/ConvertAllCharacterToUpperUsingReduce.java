package org.example.intermediate;

public class ConvertAllCharacterToUpperUsingReduce {

    public static void main(String[] args) {

        String str ="shoheb";


        String upperCase = str.chars().mapToObj(c -> String.valueOf((char) c)).reduce("", (x, y) -> x + y).toUpperCase();

        System.out.println(upperCase);
    }
}

