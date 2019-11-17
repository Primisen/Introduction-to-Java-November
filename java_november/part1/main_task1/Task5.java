package com.primisen.java_november.part1.main_task1;

//Написать программу, которая находит арифметическое и геометрическое среднее цифр шестизначного числа N.

public class Task5 {
    public static void main(String[] args) {

        int number = 123456;
        int sequenceLength = 6;

        if (isSixDigitNumber(number)) {

            System.out.println("Arithmetic sum: " + getArithmeticSum(getDigitsArray(number, sequenceLength)));
            System.out.println("Geometric sum: " + getGeometricSum(getDigitsArray(number, sequenceLength)));
        } else {
            System.out.println("Not a 6-digit number");
        }
    }

    public static double getArithmeticSum(int[] digits) {

        double sum = 0;

        for (int i = 0; i < digits.length; i++) {
            sum += digits[i];
        }

        return sum/digits.length;
    }

    public static double getGeometricSum(int[] digits) {
        double sum = 1;

        for (int i = 0; i < digits.length; i++) {
            sum *= digits[i];
        }

        return Math.pow(sum, 1.0/digits.length);
    }

    public static boolean isSixDigitNumber(int number) {
        return number >= 100_000 && number < 1_000_000;
    }

    public static int[] getDigitsArray(int number, int length) {

        int[] digits = new int[length];
        for (int i = digits.length - 1; i >= 0; i--) {

            digits[i] = number % 10;
            number /= 10;
        }

        return digits;
    }
}
