package com.teachbit;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static int fibonacci(int n) {
        // Create an array to store previously computed Fibonacci numbers
        int[] memo = new int[n + 1];
        return fibonacciHelper(n, memo);
    }

    private static int fibonacciHelper(int n, int[] memo) {
        // Base cases
        if (n == 0) return 0;
        if (n == 1) return 1;

        // Check if the Fibonacci number has already been computed
        if (memo[n] == 0) {
            // Compute and store the Fibonacci number
            memo[n] = fibonacciHelper(n - 1, memo) + fibonacciHelper(n - 2, memo);
        }

        return memo[n];
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Fibonacci number at position " + n + ": " + fibonacci(n));
    }
}
