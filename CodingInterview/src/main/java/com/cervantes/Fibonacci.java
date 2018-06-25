package com.cervantes;

/**
 * Created by ancervan on 25/06/2018.
 */
public class Fibonacci {

    public static int fibonacci(int n){
        if (n == 1 || n == 0)
            return n;

        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(6)); // result = 8
    }
}
