package com.scrumcenter.csd;

public class FizzBuzz {
    public static String fizzbuzz(int n) {
        return fizzbuzz(n, "Fizz");
    }

    public static String fizzbuzz(int n, String wordOne) {
        return fizzbuzz(n, wordOne, "Buzz");
    }

    public static String fizzbuzz(int n, String wordOne, String wordTwo) {
        System.out.println("Using words " + wordOne + " and " + wordTwo + ".");
        if (n % 3 == 0 && n % 5 == 0) return wordOne + wordTwo;
        if (n % 3 == 0) return wordOne;
        if (n % 5 == 0) return wordTwo;
        return String.valueOf(n);
    }
}
