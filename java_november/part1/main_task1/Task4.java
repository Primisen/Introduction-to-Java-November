package com.primisen.java_november.part1.main_task1;

/*
Разработайте программу, которая проверяет, что цифры четырёхзначного числа N образуют возрастающую
(убывающую) последовательность (к примеру, число 1357 удовлетворяет условию,
т.к. его цифры соответствуют следующему неравенству: 1 < 3 < 5 < 7, т.е. идут в порядке возрастания).
 */

public class Task4 {
    public static void main(String[] args) {

        int number = 1234;
        int sequenceLength = 4;

        if (isFourDigitNumber(number)) {

            boolean isIncreasing = increasingSequence(getDigitsArray(number, sequenceLength));
            boolean isDecreasing = increasingSequence(reverse(getDigitsArray(number, sequenceLength)));

            System.out.println("Is increasing: " + isIncreasing);
            System.out.println("Is decreasing: " + isDecreasing);
        } else {
            System.out.println("Not a 4-digit number");
        }

    }


    public static boolean increasingSequence(int[] digits) { //возрастающая последовательность

        boolean isIncreasingSequence = true;

        for (int i = 0; i < digits.length - 1; i++) {

            if (digits[i] >= digits[i + 1]) {
                isIncreasingSequence = false;
            }
        }

        return isIncreasingSequence;
    }

    public static boolean isFourDigitNumber(int number) {
        return number >= 1000 && number < 10000;
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
}
