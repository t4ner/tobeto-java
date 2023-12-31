package org.example;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("First 100 numbers of fibonacci series : ");

        long firstNumber = 0;
        long secondNumber = 1;
        System.out.println("1. --> " + firstNumber);
        System.out.println("2. --> " + secondNumber);


        for(int i = 3; i<=100; i++) {
            long thirdNumber = firstNumber + secondNumber;
            System.out.println((i) + ". --> " + thirdNumber);
            firstNumber = secondNumber;
            secondNumber = thirdNumber;
        }
    }
}
