package com.scrumcenter.csd;

import java.util.ArrayList;

public class FizzBuzz {
    public static String fizzbuzz(int n) {
        return fizzbuzz(n, "Fizz");
    }

    public static String fizzbuzz(int n, String wordOne) {
        return fizzbuzz(n, wordOne, "Buzz");
    }

    public static String fizzbuzz(int n, String wordOne, String wordTwo) {
        System.out.println("Using words " + wordOne + " and " + wordTwo + ".");
        return fizzbuzzNoPrint(n, wordOne, wordTwo);
    }


    public static String fizzbuzzNoPrint(int n, String wordOne, String wordTwo) {
        if (n % 3 == 0 && n % 5 == 0) return wordOne + wordTwo;
        if (n % 3 == 0) return wordOne;
        if (n % 5 == 0) return wordTwo;
        return String.valueOf(n);
    }

    public static String[] fizzbuzz(int start, int end) {
        ArrayList<String> res = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            String curr = fizzbuzzNoPrint(i, "Fizz", "Buzz");
            System.out.println(curr);
            res.add(curr);
        }

        return res.toArray(new String[0]);
    }
}
