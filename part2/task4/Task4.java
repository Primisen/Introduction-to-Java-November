
package com.primisen.java_november.part2.task4;

/*
Дру́жественные чи́сла — два различных натуральных числа , для которых
сумма всех собственных делителей первого числа равна второму числу и
наоборот, сумма всех собственных делителей второго числа равна первому
числу. Дружественные числа были открыты последователями Пифагора ,
которые, однако, знали только одну пару дружественных чисел – 220 и 284.
Найдите все дружественные числа в заданном диапазоне.
 */

public class Task4 {
    public static void main(String[] args) {

        getFriendlyNumbersFromDiapason(6, 800);
    }

    public static void getFriendlyNumbersFromDiapason(int left, int right) {

        for (int i = left; i <= right - 1; i++) {
            for (int j = left + 1; j <= right; j++) {

                if (checkFriendlyNumbers(i, j)) {
                    printFriendlyNumbers(i, j);
                }
            }
        }
    }

    public static void printFriendlyNumbers(int firstNumber, int secondNumber) {
        System.out.println("Friendly numbers: " + firstNumber + ", " + secondNumber);
    }

    public static boolean checkNaturalNumber(int number) {
        return number > 0;
    }

    public static int getSumOfDividers(int number) {

        //собственный делитель?
        int sumOfDividers = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sumOfDividers += i;
            }
        }

        return sumOfDividers;
    }

    public static boolean checkFriendlyNumbers(int firstNumber, int secondNumber) {

        boolean friendlyNumber = false;

        if (firstNumber == getSumOfDividers(secondNumber) && secondNumber == getSumOfDividers(firstNumber)) {
            friendlyNumber = true;
        }

        return friendlyNumber;
    }
}
