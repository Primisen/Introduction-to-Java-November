package com.primisen.java_november.part1.main_task1;

// Разработайте программу, которая проверяет, что числа a, b и c различны (одинаковы).

public class Task1 {

    public static void main(String[] args) {

        double firstNumber = 5.7;
        double secondNumber = 6.2;
        double thirdNumber = 3.4;

        System.out.println(numberEquals(firstNumber, secondNumber, thirdNumber));
    }

    public static boolean numberEquals(double firstNumber, double secondNumber, double thirdNumber) {
        return firstNumber == secondNumber && secondNumber == thirdNumber;
    }
}
