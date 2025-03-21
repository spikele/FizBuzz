package com.scrumcenter.csd;

public class FizzBuzz {
    public static String fizzbuzz(int n) {
        return fizzbuzz(n, "Fizz");
    }

    public static String fizzbuzz(int n, String wordOne) {
        if (n % 3 == 0 && n % 5 == 0) return wordOne + "Buzz";
        if (n % 3 == 0) return wordOne;
        if (n % 5 == 0) return "Buzz";
        return String.valueOf(n);
    }
}
