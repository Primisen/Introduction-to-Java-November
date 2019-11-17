package com.primisen.java_november.part1.main_task1;

// Написать программу, которая переворачивает (реверсирует) семизначное число N (к примеру, число 1234567 реверсируется в число 7654321).

public class Task6 {

    public static void main(String[] args) {

        int number = 1234567;
        int sequenceLength = 7;

        if (isSevenDigitNumber(number)) {

            System.out.println("Number: " + number);
            System.out.println("Reversed number: " + digitsArrayToNumber(reverse(getDigitsArray(number, sequenceLength))));

        } else {
            System.out.println("Not a 7-digit number");
        }
    }


    public static boolean isSevenDigitNumber(int number) {
        return number >= 1_000_000 && number < 10_000_000;
    }

    public static int[] getDigitsArray(int number, int length) {

        int[] digits = new int[length];
        for (int i = digits.length - 1; i >= 0; i--) {

            digits[i] = number % 10;
            number /= 10;
        }

        return digits;
    }

    public static int[] reverse(int[] array) {

        int[] reverseArray = new int[array.length];

        int index = array.length - 1;
        for (int i = 0; i < reverseArray.length; i++) {

            reverseArray[i] = array[index];
            index--;
        }

        return reverseArray;
    }

    public static int digitsArrayToNumber(int[] digits){

        int number = 0;

        for (int i = 0; i < digits.length; i++){
            number *= 10;
            number += digits[i];
        }

        return  number;
    }
}
